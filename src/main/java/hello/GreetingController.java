package hello;

/**
 * Created by shirishgajul on 5/19/16.
 */


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @RequestMapping("/greeting")
    public String greeting(@RequestParam (value= "name", required =false, defaultValue ="world") String Shirish, Model model){

        model.addAttribute("name", Shirish);
        return "greeting";
    }
}
