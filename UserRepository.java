package com.demodb.demondatabase;

import org.springframework.data.repository.CrudRepository;
import com.demodb.demondatabase.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    
}
