package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.Activity;

import java.util.List;

public interface IActivityService {
    public Activity addactivity(Activity activity) ;

    public void deleteactivity (long id_activity) ;

    public Activity getactivityById(Long id_activity);
    public List<Activity> getAllactivitys() ;
    public Activity updateactivity(Long id,Activity activity) ;
}