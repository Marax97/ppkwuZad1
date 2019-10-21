package ppkwu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RevertStringController {

    @GetMapping("/revert")
    @ResponseBody
    public String sayHello(@RequestParam(name="text", required=true) String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
