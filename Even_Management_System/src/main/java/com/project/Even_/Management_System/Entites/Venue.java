package com.project.Even_.Management_System.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Venue")
public class Venue {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String location;
	    private int capacity;
	    
		public Venue() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Venue(Long id, String name, String location, int capacity) {
			super();
			this.id = id;
			this.name = name;
			this.location = location;
			this.capacity = capacity;
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

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}

		@Override
		public String toString() {
			return "Venue [id=" + id + ", name=" + name + ", location=" + location + ", capacity=" + capacity + "]";
		}
	    
		
	    
}
