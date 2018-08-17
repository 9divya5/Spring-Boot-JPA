package io.javabrains.springbootstarter.SpringJPASample;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long>{

}
