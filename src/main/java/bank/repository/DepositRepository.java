package bank.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bank.model.DepositDetails;

@Repository
public interface DepositRepository extends CrudRepository<DepositDetails, String> {

	@Query("SELECT SUM(depositAmount) FROM DepositDetails WHERE username =:username")
	Long getDepositMoneyByUserName(String username);

}
