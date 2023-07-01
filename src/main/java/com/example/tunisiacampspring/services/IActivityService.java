package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.Activity;

public interface IActivityService {
    public Activity add_activity(Activity activity);
    public Activity retreive_activity(Long id);
    public Activity update_Activity(Activity activity);
    public void delete_activity(Long id );
}