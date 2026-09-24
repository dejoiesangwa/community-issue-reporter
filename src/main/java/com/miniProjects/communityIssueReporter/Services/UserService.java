package com.miniProjects.communityIssueReporter.Services;

import com.miniProjects.communityIssueReporter.Dtos.UserDtos.UserRequestDto;
import com.miniProjects.communityIssueReporter.Dtos.UserDtos.UserResponseDto;
import com.miniProjects.communityIssueReporter.Entities.User;
import com.miniProjects.communityIssueReporter.Repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository UserRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository UserRepository,PasswordEncoder passwordEncoder) {
        this.UserRepository = UserRepository;
        this.passwordEncoder = passwordEncoder;
    }
    public UserResponseDto register(UserRequestDto UserRequestDto){
        User User = new User();
        User.setFirstName(UserRequestDto.firstName());
        User.setLastName(UserRequestDto.lastName());
        User.setEmail(UserRequestDto.email());
        User.setPassword(
                passwordEncoder.encode(UserRequestDto.password())
        );
        UserRepository.save(User);
        return new UserResponseDto(
                User.getId(), User.getFirstName(),User.getLastName(),User.getEmail()
        );
    }
}
