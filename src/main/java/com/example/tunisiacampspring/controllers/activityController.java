package com.example.tunisiacampspring.controllers;

import com.example.tunisiacampspring.entities.Activity;
import com.example.tunisiacampspring.services.ActivityServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping("/activity")
public class activityController {

    private ActivityServiceImpl activityService ;
    @PostMapping("/ajouteractivity")
    @ResponseBody
    public Activity addactivity(@RequestBody Activity s) {
        Activity activity = activityService.addactivity(s);
        return activity;
    }

    @DeleteMapping("/{activityId}")
    public void deleteactivity(@PathVariable Long activityId) {
        activityService.deleteactivity(activityId);

    }

    @GetMapping("fetch/{activityId}")
    public Activity getactivityById(@PathVariable Long activityId) {
        return activityService.getactivityById(activityId);

    }

    @GetMapping
    public List<Activity> getAllactivitys() {
        return activityService.getAllactivitys();
    }

    @PutMapping("/{id}")
    public Activity updateactivity(@PathVariable("id") Long id, @PathVariable Activity activity) {
        return activityService.updateactivity(id,activity);
    }
}