package com.signup.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.signup.beans.Oragnization;

@Repository
public interface ISignupDAO extends JpaRepository<Oragnization, Integer>{

}
