package com.signup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.signup.DAO.IAddressDAO;
import com.signup.DAO.IPersonalInfoDAO;
import com.signup.DAO.ISignupDAO;
import com.signup.DAO.IStatusDAO;
import com.signup.beans.Address;
import com.signup.beans.Oragnization;
import com.signup.beans.PersonalInfo;
import com.signup.beans.Status;
import com.signup.exceptions.DuplicateRegistrationException;
import com.signup.exceptions.NoDataFoundException;

@Service
public class SignupServiceImpl implements ISignupService {

	@Autowired
	ISignupDAO signupDAO;
	
	@Autowired
	IPersonalInfoDAO personalDAO;
	
	@Autowired
	IStatusDAO statusDAO;
	
	@Autowired
	IAddressDAO addressDAO;
	
	
	
	@Override
	public String signUp(Oragnization orag) throws Exception
	{
		
		if(personalDAO.findOne(orag.getPersonalDetailId().getMobileNo(), orag.getPersonalDetailId().getEmail())!=null)
		{
			throw new DuplicateRegistrationException("Mobile number or E-mail can not be same");
		}
		else
		{
			System.out.println("Inside if block");
			
			Status status = orag.getStatus();
			PersonalInfo personalInfo = orag.getPersonalDetailId();
			Address address = personalInfo.getAddressId();
	
			addressDAO.save(address);
			statusDAO.save(status);
			
			personalInfo.setAddressId(address);
			personalDAO.save(personalInfo);
			
			orag.setPersonalDetailId(personalInfo);
			orag.setStatus(status);
			
			signupDAO.save(orag);
			return "save successfully";	
		}
			
		
	}

	@Override
	public List<Oragnization> findAll() throws Exception
	{
		List<Oragnization> retrived = signupDAO.findAll();
		if(retrived.isEmpty()) {
			throw new NoDataFoundException("Data not found");
		}
		else
			return retrived;
	}
}
