package com.signup.service;

import java.util.List;

import com.signup.beans.Oragnization;

public interface ISignupService {

	public String signUp(Oragnization orag) throws Exception;
	public List<Oragnization> findAll() throws Exception;

}