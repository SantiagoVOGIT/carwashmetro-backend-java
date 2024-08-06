package com.carwashmetro.carwashmetro.domain.user;

import com.carwashmetro.carwashmetro.domain.user.value_objects.DniType;
import com.carwashmetro.carwashmetro.domain.user.value_objects.UserId;
import com.carwashmetro.carwashmetro.domain.user.value_objects.UserRole;
import com.carwashmetro.carwashmetro.domain.user.value_objects.UserStatus;
import lombok.Builder;
import lombok.Getter;
import shared.domain.CreatedAt;


@Builder
@Getter
public class User {

    private final UserId id;

    private final String firstName;

    private final String lastName;

    private final String dniNumber;

    private final DniType dniType;

    private final String phoneNumber;

    private final String email;

    private final UserRole role;

    private final UserStatus status;

    private final CreatedAt createAt;

}

