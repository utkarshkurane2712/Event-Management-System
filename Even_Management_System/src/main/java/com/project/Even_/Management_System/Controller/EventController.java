package com.project.Even_.Management_System.Controller;

import java.util.List;
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

import com.project.Even_.Management_System.Entites.Event;
import com.project.Even_.Management_System.Services.EventService;

@RestController
@RequestMapping("/EventManagementSystem/Event")
public class EventController {

	 @Autowired
     private EventService eventService;
	 
	 
	 @PostMapping("createEvent")
     public Event createEvent(@RequestBody Event event) {
		 System.err.println("===== Event Created =====");
         return eventService.createEvent(event);
     }

    @GetMapping
     public List<Event> getAllEvents() {
         return eventService.getAllEvents();
     }
    
    
    @GetMapping("/{id}")
    public ResponseEntity<Event> getEventById(@PathVariable Long id) {
        Optional<Event> event = eventService.getEventById(id);
        return event.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable Long id, @RequestBody Event eventDetails) {
    	System.out.println("===== Event Updated =====");
        return ResponseEntity.ok(eventService.updateEvent(id, eventDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
        System.out.println("===== Event Deleted =====");
        return ResponseEntity.noContent().build();
    }
    
    @GetMapping("/Venue/{venueId}")
    public List<Event> getEventsByVenue(@PathVariable Long venueId) {
        return eventService.getEventsByVenue(venueId);
    }

    @GetMapping("/Organizer/{organizerId}")
    public List<Event> getEventsByOrganizer(@PathVariable Long organizerId) {
        return eventService.getEventsByOrganizer(organizerId);
    }
}
