package pl.asilver.spring.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/dayOfWeek")
    public String getDayOfWeek(@RequestParam String day){
        try {
            DayOfWeek dayOfWeek = DayOfWeek.printDayInRussian(day);
            return dayOfWeek.getName();
        } catch (IllegalArgumentException e){
            return "Invalid day of week: " + day;
        }
    }
}
