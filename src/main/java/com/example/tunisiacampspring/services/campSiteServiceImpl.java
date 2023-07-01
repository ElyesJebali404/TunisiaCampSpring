package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.campSite;
import com.example.tunisiacampspring.repositories.campSiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class campSiteServiceImpl implements IcampSiteService{
    @Autowired
    private campSiteRepository campSiteRepository;
    @Override
    public campSite add_campSite(campSite campSite) {
        return campSiteRepository.save(campSite);
    }

    @Override
    public campSite retreive_campSite(Long id) {
        return campSiteRepository.findById(id).orElse(null);
    }

    @Override
    public campSite update_campSite(campSite campSite) {
        return campSiteRepository.save(campSite);
    }

    @Override
    public void delete_campSite(Long id) {
        campSiteRepository.deleteById(id);
    }
}
