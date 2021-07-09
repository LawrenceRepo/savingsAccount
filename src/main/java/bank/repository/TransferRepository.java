package bank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bank.model.TransferDetails;

@Repository
public interface TransferRepository extends CrudRepository<TransferDetails, String> {

}
