package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {

	User create(User user);

	User findById(Long id);

}
