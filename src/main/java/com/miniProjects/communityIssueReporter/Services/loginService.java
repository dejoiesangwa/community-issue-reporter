package com.miniProjects.communityIssueReporter.Services;

import com.miniProjects.communityIssueReporter.Dtos.login.loginRequestDto;
import com.miniProjects.communityIssueReporter.Dtos.login.loginResponseDto;
import com.miniProjects.communityIssueReporter.Entities.User;
import com.miniProjects.communityIssueReporter.Exceptions.invalidCredentials;
import com.miniProjects.communityIssueReporter.Repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class loginService {
    private final UserRepository UserRepository;
    private final PasswordEncoder passwordEncoder;

    public loginService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        UserRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    public loginResponseDto login(loginRequestDto request){
        String email = request.email().trim().toLowerCase();
        User user = UserRepository.findByEmail(email)
                .orElseThrow(
                        ()-> new invalidCredentials("invalid credentials"";invalid email or password")
                        );
        boolean passwordIsCorrect =
                passwordEncoder.matches(user.getPassword(),request.password());
        if(!passwordIsCorrect){
            throw new invalidCredentials("invalid credentials");

        }
        String token = jwtService.generateToken(User);
        return loginResponseDto(token);
    }
}
