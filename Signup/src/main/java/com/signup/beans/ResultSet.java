package com.signup.beans;

public class ResultSet {
	
	
	private Oragnization result;
	
	private int resultCode;
	
	
	public enum resultType{
		Success, Error, Exception;
		};
	
	private String resultDescription;

	private resultType resType;
	
	
	
	public resultType getResType() {
		return resType;
	}

	public void setResType(resultType resType) {
		this.resType = resType;
	}

	public Oragnization getResult() {
		return result;
	}

	public void setResult(Oragnization result) {
		this.result = result;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultDescription() {
		return resultDescription;
	}

	public void setResultDescription(String resultDescription) {
		this.resultDescription = resultDescription;
	}

	@Override
	public String toString() {
		return "ResultSet [result=" + result + ", resultCode=" + resultCode + ", resultDescription=" + resultDescription
				+ "]";
	}
	
	
	
	
	
	
	
}