package com.openapi.com.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.openapi.com.Exception.StudentException;
import com.openapi.com.Exception.UserException;
import com.openapi.com.Model.CUSession;
import com.openapi.com.Model.Student;
import com.openapi.com.Repositary.StudentRepo;

@Service
public class StudentService {
    @Autowired
	private StudentRepo userRepository;
    
	@Autowired
	private com.openapi.com.Repositary.CurrentUserSessionRepository currentUserSessionRepository;

	public Student addUser(Student user) throws UserException {
		Student us = userRepository.findByEmail(user.getEmail());

		if (us != null) {
			throw new UserException("User already exist with this Email Id : " + user.getEmail());
		}
		return userRepository.save(user);
	}

	public Student updateUser(Student user, String key) throws UserException {
		CUSession loggedInUser=currentUserSessionRepository.findByUuid(key);
		if(loggedInUser==null) {
			throw new UserException("Please provide a valid key to update user");
		}
		Student curr=userRepository.findById(user.getUserLoginId())
				.orElseThrow(()-> new UserException("User with User Id "+user.getUserLoginId()+" does not exist"));
		if (loggedInUser.getName().equalsIgnoreCase("Admin")) {
			if (user.getContact() != null) curr.setContact(user.getContact());
			if (user.getEmail() != null) curr.setEmail(user.getEmail());
			if (user.getFirstName() != null) curr.setFirstName(user.getFirstName());
			if (user.getLastName() != null) curr.setLastName(user.getLastName());
			if (user.getPassword() != null) curr.setPassword(user.getPassword());
			
			Student saved = userRepository.save(curr);
			return saved;
		}
		if(user.getUserLoginId()==loggedInUser.getUserId()) {
			if (user.getContact() != null) curr.setContact(user.getContact());
			if (user.getEmail() != null) curr.setEmail(user.getEmail());
			if (user.getFirstName() != null) curr.setFirstName(user.getFirstName());
			if (user.getLastName() != null) curr.setLastName(user.getLastName());
			if (user.getPassword() != null) curr.setPassword(user.getPassword());
			
			
			Student saved = userRepository.save(curr);
			
			return saved;
			
		}
		else throw new UserException("Access denied.");
	}

	public Student deleteUser(Integer userId, String key) throws UserException {
		CUSession loggedInUser=currentUserSessionRepository.findByUuid(key);
		if(loggedInUser==null) {
			throw new UserException("Please provide a valid key to delete user.");
		}
		Student u=userRepository.findById(userId)
				.orElseThrow(()-> new UserException("User with User Id "+userId+" does not exist"));
		if (loggedInUser.getName().equalsIgnoreCase("Admin")) {
			userRepository.delete(u);
			return u;
		}
		if(u.getUserLoginId()==loggedInUser.getUserId()) {
			userRepository.delete(u);
			currentUserSessionRepository.delete(loggedInUser);
			return u;
		}
		else {
			throw new UserException("Access denied.");
		}
		
	}

	public Student viewUser(Integer userId, String key) throws UserException {
		CUSession loggedInUser = currentUserSessionRepository.findByUuid(key);
		if (loggedInUser == null) {
			throw new UserException("Please provide a valid key to view user.");
		}
		if (loggedInUser.getName().equalsIgnoreCase("Admin")) {

			Student u = userRepository.findById(userId)
					.orElseThrow(() -> new UserException("User with User Id " + userId + " does not exist"));

			return u;
		} else if (loggedInUser.getName().equalsIgnoreCase("user")) {
			Student u = userRepository.findById(userId)
					.orElseThrow(() -> new UserException("User with User Id " + userId + " does not exist"));
			if (u.getUserLoginId() == loggedInUser.getUserId()) {
				return u;
			} else {
				throw new UserException("Invalid User details, please login first");
			}
		} else
			throw new UserException("Access denied");
	}

	public List<Student> viewAllUsers(String key) throws UserException {
		CUSession loggedInUser = currentUserSessionRepository.findByUuid(key);

		if (loggedInUser == null) {
			throw new UserException("Please provide a valid key to view all user.");
		}
		if (loggedInUser.getName().equalsIgnoreCase("admin")) {

			List<Student> users = userRepository.findAll();
			if (users.size() != 0) {
				return users;
			} else {
				throw new UserException("No User Found.");
			}
		} else
			throw new UserException("Access denied");
	}

}
