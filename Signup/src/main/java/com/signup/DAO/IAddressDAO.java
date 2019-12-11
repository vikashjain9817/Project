package com.signup.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.signup.beans.Address;

@Repository
public interface IAddressDAO extends JpaRepository<Address, Integer>{

}
