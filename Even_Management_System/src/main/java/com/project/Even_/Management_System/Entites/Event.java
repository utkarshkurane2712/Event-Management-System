package com.project.Even_.Management_System.Entites;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Event")
public class Event {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String eventName;
	    private LocalDate eventDate;
	    private String description;

	    @ManyToOne
	    @JoinColumn(name = "organizer_id")
	    private Organizer organizer;

	    @ManyToOne
	    @JoinColumn(name = "venue_id")
	    private Venue venue;

		public Event() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Event(Long id, String eventName, LocalDate eventDate, String description, Organizer organizer,
				Venue venue) {
			super();
			this.id = id;
			this.eventName = eventName;
			this.eventDate = eventDate;
			this.description = description;
			this.organizer = organizer;
			this.venue = venue;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getEventName() {
			return eventName;
		}

		public void setEventName(String eventName) {
			this.eventName = eventName;
		}

		public LocalDate getEventDate() {
			return eventDate;
		}

		public void setEventDate(LocalDate eventDate) {
			this.eventDate = eventDate;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Organizer getOrganizer() {
			return organizer;
		}

		public void setOrganizer(Organizer organizer) {
			this.organizer = organizer;
		}

		public Venue getVenue() {
			return venue;
		}

		public void setVenue(Venue venue) {
			this.venue = venue;
		}

		@Override
		public String toString() {
			return "Event [id=" + id + ", eventName=" + eventName + ", eventDate=" + eventDate + ", description="
					+ description + ", organizer=" + organizer + ", venue=" + venue + "]";
		}
	

	    
}
