import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Bruce
 * @create 2020-09-29 16:03
 */
@Controller
public class TestSpringBoot {

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        return "Test SpringBoot";
    }
}
