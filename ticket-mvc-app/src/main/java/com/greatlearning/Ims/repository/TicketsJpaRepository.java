package com.greatlearning.Ims.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.Ims.model.Ticket;

public interface TicketsJpaRepository extends JpaRepository<Ticket,Long> {
	
	Ticket findByTitleLike(String title);
	
	

}
