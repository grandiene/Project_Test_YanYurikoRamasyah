package com.test.springboot.service;

import java.util.List;

import com.test.springboot.model.User;
import org.springframework.data.domain.Page;

public interface UserService {
	List<User> getAllUser();
	void saveUser(User user);
	User getUserById(long id);
	void deleteUserById(long id);
	Page<User> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
