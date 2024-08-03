package com.project.Even_.Management_System.Entites;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Organizer")
public class Organizer {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String contactInfo;

	    @OneToMany(mappedBy = "organizer")
	    private List<Event> events;

		public Organizer() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Organizer(Long id, String name, String contactInfo, List<Event> events) {
			super();
			this.id = id;
			this.name = name;
			this.contactInfo = contactInfo;
			this.events = events;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getContactInfo() {
			return contactInfo;
		}

		public void setContactInfo(String contactInfo) {
			this.contactInfo = contactInfo;
		}

		public List<Event> getEvents() {
			return events;
		}

		public void setEvents(List<Event> events) {
			this.events = events;
		}

		@Override
		public String toString() {
			return "Organizer [id=" + id + ", name=" + name + ", contactInfo=" + contactInfo + ", events=" + events
					+ "]";
		}

	    
	    
}
