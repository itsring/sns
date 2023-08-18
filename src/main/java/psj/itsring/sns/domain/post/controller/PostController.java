package psj.itsring.sns.domain.post.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import psj.itsring.sns.domain.post.dto.PostResponseDto;
import psj.itsring.sns.domain.post.dto.create.PostCreateRequestDto;
import psj.itsring.sns.domain.post.service.PostReadService;
import psj.itsring.sns.domain.post.service.PostWriteService;

import java.util.List;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

    private final PostWriteService postWriteService;
    private final PostReadService postReadService;


    @PostMapping("/create")
    public PostResponseDto addPost(@RequestBody PostCreateRequestDto postCreateRequestDto) {
        PostResponseDto post = postWriteService.create(postCreateRequestDto);

        return post;
    }

    @GetMapping("/member-id/{memberId}")
    public List<PostResponseDto> getPosts(@PathVariable Long memberId) {
        return postReadService.getPosts(memberId);
    }

}
