package bank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bank.model.DepositDetails;
import bank.model.WithdrawDetails;

@Repository
public interface WithdrawRepository extends CrudRepository<WithdrawDetails, String> {

}
