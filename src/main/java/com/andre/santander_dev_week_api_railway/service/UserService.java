package com.andre.santander_dev_week_api_railway.service;

import com.andre.santander_dev_week_api_railway.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User user);
}
