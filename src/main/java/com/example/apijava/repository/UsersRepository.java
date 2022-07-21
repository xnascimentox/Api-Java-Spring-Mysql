package com.example.apijava.repository;


import com.example.apijava.model.UsersModel;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<UsersModel, Integer> {
}
