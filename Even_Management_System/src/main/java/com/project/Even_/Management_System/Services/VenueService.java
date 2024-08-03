package com.project.Even_.Management_System.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Even_.Management_System.Entites.Venue;
import com.project.Even_.Management_System.Repos.VenueRepository;

@Service
public class VenueService {
	
	@Autowired
    private VenueRepository venueRepo;
	
	
	 public Venue createVenue(Venue venue) {
         return venueRepo.save(venue);
     }

     public Optional<Venue> getVenueById(Long id) {
         return venueRepo.findById(id);
     }
     
     public Venue updateVenue(Long id, Venue venueDetails) {
         Venue venue = venueRepo.findById(id).orElseThrow();
         venue.setName(venueDetails.getName());
         venue.setLocation(venueDetails.getLocation());
         venue.setCapacity(venueDetails.getCapacity());
         return venueRepo.save(venue);
     }

     
     public void deleteVenue(Long id) {
         venueRepo.deleteById(id);
     }
}
