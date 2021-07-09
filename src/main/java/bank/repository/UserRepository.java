package bank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bank.model.UserDetails;

@Repository
public interface UserRepository extends CrudRepository<UserDetails, String> {

}
