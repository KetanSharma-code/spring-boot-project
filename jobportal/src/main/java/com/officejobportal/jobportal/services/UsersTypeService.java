package com.officejobportal.jobportal.services;

import com.officejobportal.jobportal.entity.UsersType;
import com.officejobportal.jobportal.repository.UsersRepository;
import com.officejobportal.jobportal.repository.UsersTypeRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {

    private final UsersTypeRepository usersTypeRepository;

    @Autowired
    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    public List<UsersType> getAll() {
        return usersTypeRepository.findAll();
    }
}
