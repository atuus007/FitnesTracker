package hu.animus.controller;

import hu.animus.model.Activity;
import hu.animus.model.Exercise;
import hu.animus.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MinutesController {

    @Autowired
    private ExerciseService exerciseService;

    @RequestMapping(value = "addMinutes")
    public String addMinutes(@ModelAttribute("exercise")Exercise exercise){
        System.out.println("exercise: "+ exercise.getMinutes());
        return "addMinutes";
    }
    @RequestMapping(value = "addMinutes", method = RequestMethod.POST)
    public String updateMinutes(@Valid @ModelAttribute("exercise")Exercise exercise, BindingResult result){
        System.out.println("Result has errors: "+result.hasErrors());
        if(result.hasErrors()){
            return "addMinutes";
        }
        return "redirect:addGoal.html";
    }







    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public @ResponseBody List<Activity> findAllActivities(){
        return exerciseService.findAllActivities();
    }

    /*
    @RequestMapping(value = "/addMoreMinutes")
    public String addMoreMinutes(@ModelAttribute("exercise")Exercise exercise){
        System.out.println("exercise: "+ exercise.getMinutes());
        return "addMinutes";
    }*/



}
