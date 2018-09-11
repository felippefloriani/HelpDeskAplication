package com.felippefloriani.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.felippefloriani.helpdesk.api.entity.ChangeStatus;



public interface ChageStatusRepository extends MongoRepository<ChangeStatus, String>{
	
	//Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);
	
	
	

}
