package com.project.Even_.Management_System.Repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.Even_.Management_System.Entites.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
	
	List<Event> findByVenueId(Long venueId);
    List<Event> findByOrganizerId(Long organizerId);

}
