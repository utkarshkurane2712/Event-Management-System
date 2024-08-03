package com.project.Even_.Management_System.Services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Even_.Management_System.Entites.Event;
import com.project.Even_.Management_System.Repos.EventRepository;

@Service
public class EventService {
	
	 @Autowired
	 private EventRepository eventRepo;
	 
	 public Event createEvent(Event event) {
		 event.setEventDate(LocalDate.now());
	      return eventRepo.save(event);
	  }

	 
	 public List<Event> getAllEvents() {
	      return eventRepo.findAll();
	  }
	 
	 
	 public Optional<Event> getEventById(Long id) {
	      return eventRepo.findById(id);
	 }
	 
	 
	 public Event updateEvent(Long id, Event eventDetails) {
          Event event = eventRepo.findById(id).orElseThrow();
	      event.setEventName(eventDetails.getEventName());
	      event.setEventDate(LocalDate.now());
	      event.setDescription(eventDetails.getDescription());
	      event.setOrganizer(eventDetails.getOrganizer());
	      event.setVenue(eventDetails.getVenue());
	      return eventRepo.save(event);
	    }
	 
	 
	 public void deleteEvent(Long id) {
	      eventRepo.deleteById(id);
	 }
	 
	 
	 public List<Event> getEventsByVenue(Long venueId) {
	      return eventRepo.findByVenueId(venueId);
	 }

	 public List<Event> getEventsByOrganizer(Long organizerId) {
	      return eventRepo.findByOrganizerId(organizerId);
	 }
}
