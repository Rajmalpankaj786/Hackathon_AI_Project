package com.openapi.com.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openapi.com.Model.CUSession;



public interface CurrentUserSessionRepository extends JpaRepository<CUSession, Integer>{
	public CUSession findByUuid(String uuid);
}
