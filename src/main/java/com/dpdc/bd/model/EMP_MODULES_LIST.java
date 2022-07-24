package com.dpdc.bd.model;

public class EMP_MODULES_LIST {
	//PARENT, MOD_ID, MOD_APP, EXT, ROOTLEAF, MOD_NAME, MTYPE, MOD_CODE, PAGE_RANG, SHORT_NAME
	private String  PARENT;
	private String  MOD_ID;
	private String  MOD_APP;
	private String  EXT;
	private String  ROOTLEAF;
	private String  MOD_NAME;
	private String  MTYPE;
	private String  MOD_CODE;
	private String  PAGE_RANG;
	private String  SHORT_NAME;
	
	
	
	
	public EMP_MODULES_LIST(String pARENT, String mOD_ID, String mOD_APP, String eXT, String rOOTLEAF, String mOD_NAME,
			String mTYPE, String mOD_CODE, String pAGE_RANG, String sHORT_NAME) {
		super();
		PARENT = pARENT;
		MOD_ID = mOD_ID;
		MOD_APP = mOD_APP;
		EXT = eXT;
		ROOTLEAF = rOOTLEAF;
		MOD_NAME = mOD_NAME;
		MTYPE = mTYPE;
		MOD_CODE = mOD_CODE;
		PAGE_RANG = pAGE_RANG;
		SHORT_NAME = sHORT_NAME;
	}
	public String getPARENT() {
		return PARENT;
	}
	public void setPARENT(String pARENT) {
		PARENT = pARENT;
	}
	public String getMOD_ID() {
		return MOD_ID;
	}
	public void setMOD_ID(String mOD_ID) {
		MOD_ID = mOD_ID;
	}
	public String getMOD_APP() {
		return MOD_APP;
	}
	public void setMOD_APP(String mOD_APP) {
		MOD_APP = mOD_APP;
	}
	public String getEXT() {
		return EXT;
	}
	public void setEXT(String eXT) {
		EXT = eXT;
	}
	public String getROOTLEAF() {
		return ROOTLEAF;
	}
	public void setROOTLEAF(String rOOTLEAF) {
		ROOTLEAF = rOOTLEAF;
	}
	public String getMOD_NAME() {
		return MOD_NAME;
	}
	public void setMOD_NAME(String mOD_NAME) {
		MOD_NAME = mOD_NAME;
	}
	public String getMTYPE() {
		return MTYPE;
	}
	public void setMTYPE(String mTYPE) {
		MTYPE = mTYPE;
	}
	public String getMOD_CODE() {
		return MOD_CODE;
	}
	public void setMOD_CODE(String mOD_CODE) {
		MOD_CODE = mOD_CODE;
	}
	public String getPAGE_RANG() {
		return PAGE_RANG;
	}
	public void setPAGE_RANG(String pAGE_RANG) {
		PAGE_RANG = pAGE_RANG;
	}
	public String getSHORT_NAME() {
		return SHORT_NAME;
	}
	public void setSHORT_NAME(String sHORT_NAME) {
		SHORT_NAME = sHORT_NAME;
	}
	
	

}
