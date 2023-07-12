package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.campSite;
import com.example.tunisiacampspring.repositories.campSiteRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;

@Service
public class campSiteServiceImpl implements IcampSiteService{

    private campSiteRepository campSiteRepository;
    @Override
    public campSite addcampSite(campSite campSite) {

        return campSiteRepository.save(campSite);
    }
    @Override
    public void deletecampSite (long id_campSite) {
        campSiteRepository.deleteById(id_campSite);
    }
    @GetMapping("/{id}")
    public campSite getcampSiteById(@PathVariable("id") Long id) {
        return campSiteRepository.findById(id).orElse(null);
    }
    @Override
    public List<campSite> getAllcampSites() {
        return campSiteRepository.findAll();
    }

    @Override
    @PutMapping("/{id}")
    public campSite updatecampSite(@PathVariable("id") Long id, @PathVariable campSite campSite) {
        campSite existingcampSite = campSiteRepository.findById(id).orElse(null);
        if (existingcampSite != null) {
            campSite.setId_campSite(existingcampSite.getId_campSite()); // Ensure the ID remains the same
            campSite updatedcampSite = campSiteRepository.save(campSite);
            return updatedcampSite;
        } else {
            return null;
        }
    }
}
