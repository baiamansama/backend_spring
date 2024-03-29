package com.backend_spring.myFirstApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for "cartoon teamInfo"

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: " + coachName + ", Team name: " + teamName;
    }


    // here we expose '/' to return "Hello World!"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }


    @GetMapping("/workout")
    public String getDailyWorkOut(){
        return "run a hard 5km!";
    }
    //expose another '/fortune' endpoint
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "today is your lucky draw!";
    }
}
