package com.webapp.service;

import org.springframework.stereotype.Service;

import com.webapp.persist.entity.User;
import com.webapp.service.dto.UserDto;

//@Service
public class UserServiceImpl extends GenericServiceImpl<User, UserDto, Long> implements UserService {


}
