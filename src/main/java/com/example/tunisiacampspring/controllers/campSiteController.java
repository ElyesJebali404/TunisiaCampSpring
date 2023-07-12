package com.example.tunisiacampspring.controllers;

import com.example.tunisiacampspring.entities.campSite;
import com.example.tunisiacampspring.services.campSiteServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping("/campSite")
public class campSiteController {

    private campSiteServiceImpl campSiteService ;
    @PostMapping("/ajoutercampSite")
    @ResponseBody
    public campSite addcampSite(@RequestBody campSite s) {
        campSite campSite = campSiteService.addcampSite(s);
        return campSite;
    }

    @DeleteMapping("/{campSiteId}")
    public void deletecampSite(@PathVariable Long campSiteId) {
        campSiteService.deletecampSite(campSiteId);

    }

    @GetMapping("fetch/{campSiteId}")
    public campSite getcampSiteById(@PathVariable Long campSiteId) {
        return campSiteService.getcampSiteById(campSiteId);

    }

    @GetMapping
    public List<campSite> getAllcampSites() {
        return campSiteService.getAllcampSites();
    }

    @PutMapping("/{id}")
    public campSite updatecampSite(@PathVariable("id") Long id, @PathVariable campSite campSite) {
        return campSiteService.updatecampSite(id,campSite);
    }
}
