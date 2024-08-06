package com.carwashmetro.carwashmetro.domain.user.ports;

import com.carwashmetro.carwashmetro.domain.user.User;
import com.carwashmetro.carwashmetro.domain.user.value_objects.UserId;

public interface UserRepository {

    void save(User user);

    User findById(UserId userId);

}
