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

import com.project.Even_.Management_System.Entites.Organizer;
import com.project.Even_.Management_System.Services.OrganizerService;

@RestController
@RequestMapping("/EventManagementSystem/Organizer")
public class OrganizerController {
	
	@Autowired
    private OrganizerService organizerService;
	
	@PostMapping("createOrganizar")
    public Organizer createOrganizer(@RequestBody Organizer organizer) {
		System.out.println("===== Organizar Added =====");
        return organizerService.createOrganizer(organizer);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Organizer> getOrganizerById(@PathVariable Long id) {
        Optional<Organizer> organizer = organizerService.getOrganizerById(id);
        return organizer.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Organizer> updateOrganizer(@PathVariable Long id, @RequestBody Organizer organizerDetails) {
    	System.out.println("===== Organizar Updated =====");
        return ResponseEntity.ok(organizerService.updateOrganizer(id, organizerDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrganizer(@PathVariable Long id) {
        organizerService.deleteOrganizer(id);
        System.out.println("===== Organizar Deleted =====");
        return ResponseEntity.noContent().build();
    }

}
