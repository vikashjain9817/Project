package com.signup.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.signup.beans.Status;

@Repository
public interface IStatusDAO extends JpaRepository<Status, Integer>{

}
