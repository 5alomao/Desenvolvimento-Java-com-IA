package me.dio.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.domain.model.User;
import me.dio.domain.repository.UserRepository;
import me.dio.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User create(User user) {
		if (userRepository.existsByAccountNumber(user.getAccount().getNumber())) {
			throw new IllegalArgumentException("This Account Number already exists.");
		}

		return userRepository.save(user);
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

}
