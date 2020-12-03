package com.iiht.training.eloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.training.eloan.dto.UserDto;
import com.iiht.training.eloan.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<UserDto, Long>{

}
