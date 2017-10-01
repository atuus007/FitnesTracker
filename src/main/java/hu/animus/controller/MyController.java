package hu.animus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
//ez az anotácio jelzi hogy ez egy controller osztály
@Controller
public class MyController{

    //ez arra van hogy hogyan kapcsoljuk az url-hez
    //hogy hogyan kapcsoljuk az url-hez ezt a fv-t
    //pl a http://localhost:8080/fitnesstracker/greetings ezt a fv-t fogja meghivni
    //@RequestMapping(value="/greeting")
    //public String sayHello(Model model){
        //model kap egy attriputumot a greeting kulcsal és a Hello World értékkel
        //model.addAttribute("greeting", "Hello World!!!!!!!");
      //  return "hello";
    //}
}
