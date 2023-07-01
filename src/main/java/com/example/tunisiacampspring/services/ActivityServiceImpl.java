package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.Activity;
import com.example.tunisiacampspring.repositories.activityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityServiceImpl implements IActivityService{
    @Autowired
    private activityRepository activityRepository;
    @Override
    public Activity add_activity(Activity activity) {
        return activityRepository.save(activity);
    }

    @Override
    public Activity retreive_activity(Long id) {
        return activityRepository.findById(id).orElse(null);
    }

    @Override
    public Activity update_Activity(Activity activity) {
        return activityRepository.save(activity);
    }

    @Override
    public void delete_activity(Long id) {
        activityRepository.deleteById(id);
    }
}
