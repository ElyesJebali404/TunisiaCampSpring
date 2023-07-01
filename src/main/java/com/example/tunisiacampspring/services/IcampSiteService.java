package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.campSite;

public interface IcampSiteService {
    public campSite add_campSite(campSite campSite);
    public campSite retreive_campSite(Long id);
    public campSite update_campSite(campSite campSite);
    public void delete_campSite(Long id );
}