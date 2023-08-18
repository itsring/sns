package psj.itsring.sns;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public void index(){
        System.out.println("실행");
    }
}
