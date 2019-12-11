package com.signup.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.signup.beans.PersonalInfo;

@Repository
public interface IPersonalInfoDAO extends JpaRepository<PersonalInfo, Integer>{
	
	@Query(value = "select user_id from personal_info where mobile_no =?1 OR email = ?2" , nativeQuery = true)
	String findOne(String mobileNo, String email) throws Exception;

}
