package hu.animus.controller;

import hu.animus.model.Goal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.naming.Binding;
import javax.validation.Valid;

@Controller
@SessionAttributes("goal")//mejik attr akarom tárolni ebben a sessionben
//az addAttr és a Session attributum értéke egyezik merzt ezt akarom tárolno
public class GoalController {

    //ez a metódus HTTP GET kérést kezel
    //csak Get requesttet fogad
    @RequestMapping(value = "addGoal", method = RequestMethod.GET)
    public String addGoal(Model model){
        Goal goal=new Goal();
        goal.setMinutes(10);
        //minden alkalommal létrehozunk egy új Goal objektumot
        model.addAttribute("goal", goal);
        return "addGoal";
    }
    //el akajuk tárolni a Goal objektumot a Sessionben
    //nem akarjuk hogy folyton felülirja
    //ezért adjunk egy metodust is a POST-hoz
    //ugyanaz lesz a parmétere de nem GET hanem POST
    @RequestMapping(value = "addGoal", method = RequestMethod.POST)
    public String updateGoal(@Valid @ModelAttribute("goal")Goal goal, BindingResult result){
        //megvan az objektumunk
        System.out.println("Minutes upated: "+goal.getMinutes());
        System.out.println("Result has errors: "+result.hasErrors());
        //amint hozáadtuk a Goal-t amint megérkezik a kérés
        //az első kérés azzal érkezik az addGoal-ba
        //és amikor meg akarjuk változtatni
        //amint megkapja updatelni fogja ha van alapértelmezett érték és visszairányitja
        //az addminutes.html-re
        if(result.hasErrors()){
            //ha nincs valid értékünk akkor visszadobjuk az AddGoal page-re
            return "addGoal";
        }

        return "redirect:addMinutes.html";
    }
}
