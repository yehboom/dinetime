package se452.group5.dinetime.model;

import java.util.List;
import java.util.UUID;

// import org.springframework.data.repository.CrudRepository;


import org.springframework.data.repository.CrudRepository;

public interface BusinessAccountRepository extends CrudRepository<BusinessAccount, Integer>{
    List<BusinessAccount> findById(int id);

    @Override
    List<BusinessAccount> findAll();
    
}
