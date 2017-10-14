package hu.animus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;



//ez az anotácio jelzi hogy ez egy controller osztály
@Controller
public class MyController {
    @RequestMapping(value ="/yolo")
    public String sayHello (Model model) {
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBB");
        model.addAttribute("valami", "Hello World");
        model.addAttribute("asd", "Hülye faszfej szar fos köcsög");
        return "hello";
    }
}
