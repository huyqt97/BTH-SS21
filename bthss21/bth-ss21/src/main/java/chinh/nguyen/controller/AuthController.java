package chinh.nguyen.controller;

import chinh.nguyen.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AuthController {
    @RequestMapping({"/login", "/"})
    public String login(Model model){
        model.addAttribute(new User(1L,"nguyễn","12345678"));
        return "login";
    }
}
