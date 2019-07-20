package fafnir2019.mengqi.repository;

import fafnir2019.mengqi.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Integer> {
}
