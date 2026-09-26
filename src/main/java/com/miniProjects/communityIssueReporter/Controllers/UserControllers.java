package com.miniProjects.communityIssueReporter.Controllers;

import com.miniProjects.communityIssueReporter.Dtos.UserDtos.UserCreationRequestDto;
import com.miniProjects.communityIssueReporter.Dtos.UserDtos.UserCreationResponseDto;
import com.miniProjects.communityIssueReporter.Dtos.login.loginRequestDto;
import com.miniProjects.communityIssueReporter.Dtos.login.loginResponseDto;
import com.miniProjects.communityIssueReporter.Services.UserCreationService;
import com.miniProjects.communityIssueReporter.Services.loginService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class UserControllers {
    private final UserCreationService UserCreationService;

    public UserControllers(UserCreationService userCreationService) {
        UserCreationService = userCreationService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserCreationResponseDto> createUser(
            @Valid @RequestBody UserCreationRequestDto request
        ){
    UserCreationResponseDto response = UserCreationService.register(request);
    return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(response);
}
@PostMapping("/login")
    public ResponseEntity<loginResponseDto> login(@RequestBody loginRequestDto request){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(loginService.login(request);
}
}
