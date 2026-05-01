package com.midterm.anaBalukha.service;

import com.midterm.anaBalukha.dto.UserRequestDTO;
import com.midterm.anaBalukha.dto.UserResponseDTO;
import com.midterm.anaBalukha.entity.User;
import com.midterm.anaBalukha.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponseDTO create(UserRequestDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());

        User saved = userRepository.save(user);

        return new UserResponseDTO(saved.getId(), saved.getName(), saved.getEmail());
    }

    public List<UserResponseDTO> getAll() {
        return userRepository.findAll()
                .stream()
                .map(u -> new UserResponseDTO(u.getId(), u.getName(), u.getEmail()))
                .collect(Collectors.toList());
    }

    public UserResponseDTO getById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        return new UserResponseDTO(user.getId(), user.getName(), user.getEmail());
    }

    public UserResponseDTO update(Long id, UserRequestDTO dto) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setName(dto.getName());
        user.setEmail(dto.getEmail());

        User updated = userRepository.save(user);

        return new UserResponseDTO(updated.getId(), updated.getName(), updated.getEmail());
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
