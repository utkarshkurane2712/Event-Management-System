package com.project.Even_.Management_System.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Even_.Management_System.Entites.Venue;
import com.project.Even_.Management_System.Services.VenueService;

@RestController
@RequestMapping("/EventManagementSystem/Venue")
public class VenueController {
	
	 @Autowired
     private VenueService venueService;
	 
	 @PostMapping("/createVenue")
     public Venue createVenue(@RequestBody Venue venue) {
		 System.err.println("===== Venue Added =====");
         return venueService.createVenue(venue);
     }

    @GetMapping("/{id}")
     public ResponseEntity<Venue> getVenueById(@PathVariable Long id) {
         Optional<Venue> venue = venueService.getVenueById(id);
         return venue.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
     }

    @PutMapping("/{id}")
    public ResponseEntity<Venue> updateVenue(@PathVariable Long id, @RequestBody Venue venueDetails) {
    	 System.out.println("===== Venue Updated =====");
         return ResponseEntity.ok(venueService.updateVenue(id, venueDetails));
     }

     @DeleteMapping("/{id}")
     public ResponseEntity<Void> deleteVenue(@PathVariable Long id) {
         venueService.deleteVenue(id);
         System.out.println("===== Venue Deleted =====");
         return ResponseEntity.noContent().build();
     }

}
