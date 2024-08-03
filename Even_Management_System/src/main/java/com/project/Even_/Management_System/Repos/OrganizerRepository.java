package com.project.Even_.Management_System.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.Even_.Management_System.Entites.Organizer;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, Long> {

}
