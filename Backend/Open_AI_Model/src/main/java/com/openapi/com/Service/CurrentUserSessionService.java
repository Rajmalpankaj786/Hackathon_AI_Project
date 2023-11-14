package com.openapi.com.Service;

import java.time.LocalDateTime;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openapi.com.Exception.LoginException;
import com.openapi.com.Model.CUSession;
import com.openapi.com.Model.LoginDTO;
import com.openapi.com.Model.Student;
import com.openapi.com.Repositary.CurrentUserSessionRepository;
import com.openapi.com.Repositary.StudentRepo;

import net.bytebuddy.utility.RandomString;

@Service
public class CurrentUserSessionService {
	@Autowired
	private StudentRepo userRepository;
	@Autowired
	private CurrentUserSessionRepository currentUserSessionRepository;

	public CUSession logIntoAccount(LoginDTO dto) throws LoginException {
		Student user = userRepository.findByEmail(dto.getEmail());

		if (user == null) {
			throw new LoginException("Please Enter a valid Email & password.");
		}

		Optional<CUSession> validUserSessionOpt = currentUserSessionRepository.findById(user.getUserLoginId());
		if (validUserSessionOpt.isPresent()) {
			throw new LoginException("User already Logged in with this email.");
		}
		if (user.getPassword().equals(dto.getPassword())) {
			String key = RandomString.make(6);
			String name = user.getFirstName().concat(" " + user.getLastName());
			CUSession currentUserSession = new CUSession(user.getUserLoginId(), name, key,
					LocalDateTime.now());
			currentUserSessionRepository.save(currentUserSession);
			return currentUserSession;
		} else {
			throw new LoginException("Please Enter a valid password");
		}
	}

	public String logOutFromAccount(String key) throws LoginException {

		CUSession validUserSession = currentUserSessionRepository.findByUuid(key);

		if (validUserSession == null) {
			throw new LoginException("User not logged in with this email.");
		}
		currentUserSessionRepository.delete(validUserSession);
		return "Logged out successfully.";
	}
}
