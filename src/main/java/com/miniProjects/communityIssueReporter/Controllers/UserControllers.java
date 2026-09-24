package com.miniProjects.communityIssueReporter.Controllers;

import com.miniProjects.communityIssueReporter.Dtos.UserDtos.UserRequestDto;
import com.miniProjects.communityIssueReporter.Dtos.UserDtos.UserResponseDto;
import com.miniProjects.communityIssueReporter.Services.UserService;
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
    private final UserService UserService;

    public UserControllers(UserService userService) {
        UserService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponseDto> createUser(
            @Valid @RequestBody UserRequestDto request
        ){
    UserResponseDto response = UserService.register(request);
    return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(response);
}
}
