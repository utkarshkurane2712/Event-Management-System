package com.project.Even_.Management_System.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.Even_.Management_System.Entites.Venue;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {

}
