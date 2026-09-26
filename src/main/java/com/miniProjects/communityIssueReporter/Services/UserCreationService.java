package com.miniProjects.communityIssueReporter.Services;

import com.miniProjects.communityIssueReporter.Dtos.UserDtos.UserCreationRequestDto;
import com.miniProjects.communityIssueReporter.Dtos.UserDtos.UserCreationResponseDto;
import com.miniProjects.communityIssueReporter.Entities.User;
import com.miniProjects.communityIssueReporter.Exceptions.UserAlreadyExists;
import com.miniProjects.communityIssueReporter.Repositories.UserRepository;
import com.miniProjects.communityIssueReporter.enums.role;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserCreationService {
    private final UserRepository UserRepository;
    private final PasswordEncoder passwordEncoder;

    public UserCreationService(UserRepository UserRepository, PasswordEncoder passwordEncoder) {
        this.UserRepository = UserRepository;
        this.passwordEncoder = passwordEncoder;
    }
    public UserCreationResponseDto register(UserCreationRequestDto UserCreationRequestDto){
        String email = UserCreationRequestDto.email().trim().toLowerCase();
        if(UserRepository.existsByEmail(email)){
            throw new UserAlreadyExists("The user already exists");
        }
        User User = new User();
        User.setFirstName(UserCreationRequestDto.firstName());
        User.setLastName(UserCreationRequestDto.lastName());
        User.setEmail(UserCreationRequestDto.email());
        User.setPassword(
                passwordEncoder.encode(UserCreationRequestDto.password())
        );
        User.setUserRole(role.CITIZEN);
        UserRepository.save(User);
        return new UserCreationResponseDto(
                User.getId(), User.getFirstName(),User.getLastName(),User.getEmail(),User.getUserRole());
    }
}
