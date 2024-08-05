package com.carwashmetro.carwashmetro.domain.user;

import lombok.Builder;

import java.time.ZonedDateTime;

@Builder
public class User {

    private final UserId id;

    private final String firstName;

    private final String lastName;

    private final String dniNumber;

    private final DniType dniType;

    private final String phoneNumber;

    private final Email email;

    private final UserRole role;

    private final UserStatus status;

    private final ZonedDateTime createAt;

    public UserId getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDniNumber() {
        return dniNumber;
    }

    public DniType getDniType() {
        return dniType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Email getEmail() {
        return email;
    }

    public UserRole getRole() {
        return role;
    }

    public UserStatus getStatus() {
        return status;
    }

    public ZonedDateTime getCreateAt() {
        return createAt;
    }
}

