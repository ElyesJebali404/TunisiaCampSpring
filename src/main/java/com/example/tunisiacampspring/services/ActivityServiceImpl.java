package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.Activity;
import com.example.tunisiacampspring.repositories.activityRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;

@Service
public class ActivityServiceImpl implements IActivityService{

    private activityRepository activityRepository;
    @Override
    public Activity addactivity(Activity activity) {

        return activityRepository.save(activity);
    }
    @Override
    public void deleteactivity (long id_activity) {
        activityRepository.deleteById(id_activity);
    }
    @GetMapping("/{id}")
    public Activity getactivityById(@PathVariable("id") Long id) {
        return activityRepository.findById(id).orElse(null);
    }
    @Override
    public List<Activity> getAllactivitys() {
        return activityRepository.findAll();
    }

    @Override
    @PutMapping("/{id}")
    public Activity updateactivity(@PathVariable("id") Long id, @PathVariable Activity activity) {
        Activity existingactivity = activityRepository.findById(id).orElse(null);
        if (existingactivity != null) {
            activity.setId_activity(existingactivity.getId_activity()); // Ensure the ID remains the same
            Activity updatedactivity = activityRepository.save(activity);
            return updatedactivity;
        } else {
            return null;
        }
    }
}