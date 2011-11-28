package com.chaos.driver;

public class DriverInfo {
	private String mNickName;
	private String mPhoneNumber;
	private String mCarNumber;
	private boolean mbFree;

	public DriverInfo(String nickName, String phoneNUm, String carNum) {
		mNickName = nickName;
		mPhoneNumber = phoneNUm;
		mCarNumber = carNum;
		setFree(true);
	}

	public String toString() {
		return "PassengerInfo:\n" + "mNickName:" + mNickName + 
		"mPhoneNumber:"+ mPhoneNumber + 
		"mCarNumber:" + mCarNumber;
	}

	// getter & setter
	public String getNickName() {
		return mNickName;
	}

	public void setNickName(String mNickName) {
		this.mNickName = mNickName;
	}

	public String getPhoneNumber() {
		return mPhoneNumber;
	}

	public void setPhoneNumber(String mPhoneNumber) {
		this.mPhoneNumber = mPhoneNumber;
	}

	public String getCarNumber() {
		return mCarNumber;
	}

	public void setCarNumber(String mCarNumber) {
		this.mCarNumber = mCarNumber;
	}

	public void setFree(boolean mbFree) {
		this.mbFree = mbFree;
	}

	public boolean isFree() {
		return mbFree;
	}
}