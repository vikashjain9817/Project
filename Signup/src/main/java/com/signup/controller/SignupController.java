package com.signup.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.signup.beans.Oragnization;
import com.signup.beans.ResultSet;
import com.signup.service.ISignupService;

@RestController
public class SignupController {
	
	@Autowired
	ISignupService signupService;

	@RequestMapping(value = "/")
	public String home()
	{
		return "Home";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.PUT)
	public String signUp(@RequestBody Oragnization orag)
	{
		try {
			return signupService.signUp(orag);
		} catch (Exception e) {
			return e.getMessage();
		}
		
	}
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public List<ResultSet> findAll()
	{
		
		List<ResultSet> result = new ArrayList<ResultSet>();
		try {
			List<Oragnization> orag = new ArrayList<Oragnization>();
			orag = signupService.findAll();
			for(Oragnization o : orag)
			{
				ResultSet r = new ResultSet();
				r.setResult(o);
				r.setResultCode(0);
				r.setResultDescription("Successful get the result");
				r.setResType(ResultSet.resultType.Success);
				result.add(r);
			}
			return result;
			
		   }catch(Exception e)
			{
			   ResultSet r = new ResultSet();
				r.setResType(ResultSet.resultType.Exception);
				r.setResultCode(e.hashCode());
				r.setResultDescription(e.getMessage());
				result.add(r);
				return result;
			}
	}
}	
