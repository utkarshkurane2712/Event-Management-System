package com.project.Even_.Management_System.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Even_.Management_System.Entites.Organizer;
import com.project.Even_.Management_System.Repos.OrganizerRepository;

@Service
public class OrganizerService {
	
	@Autowired
    private OrganizerRepository organizerRepo;
	
	public Organizer createOrganizer(Organizer organizer) {
        return organizerRepo.save(organizer);
    }

    public Optional<Organizer> getOrganizerById(Long id) {
        return organizerRepo.findById(id);
    }

    
    public Organizer updateOrganizer(Long id, Organizer organizerDetails) {
        Organizer organizer = organizerRepo.findById(id).orElseThrow();
        organizer.setName(organizerDetails.getName());
        organizer.setContactInfo(organizerDetails.getContactInfo());
        return organizerRepo.save(organizer);
    }

    public void deleteOrganizer(Long id) {
        organizerRepo.deleteById(id);
    }
}
