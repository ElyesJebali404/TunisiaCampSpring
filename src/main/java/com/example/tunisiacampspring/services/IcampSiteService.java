package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.campSite;
import java.util.List;

public interface IcampSiteService {


    public campSite addcampSite(campSite campSite) ;

    public void deletecampSite (long id_campSite) ;

    public campSite getcampSiteById(Long id_campSite);
    public List<campSite> getAllcampSites() ;
    public campSite updatecampSite(Long id,campSite campSite) ;
}