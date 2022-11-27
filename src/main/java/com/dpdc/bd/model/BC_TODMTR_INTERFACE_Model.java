package com.dpdc.bd.model;

import org.springframework.stereotype.Component;

@Component
public class BC_TODMTR_INTERFACE_Model {
	
	
	
	private String TOD_ID;
	private String TIME_CYCLE_CODE;
	private String DESCR;
	
	private String READING_TYPE_CODE;
	private String READING;
	private String READING_DESCR;
	private Integer CUM_NUM;
	private Integer POWER_FACTOR;
	private String PURPOSE_OF_RDNG;
	private String TOD_CODE;
	private String TOD_DESC;
	private String READING_DATE;
	public BC_TODMTR_INTERFACE_Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public String getREADING_DATE() {
		return READING_DATE;
	}


	public void setREADING_DATE(String rEADING_DATE) {
		
		READING_DATE = rEADING_DATE;
		
	}


	public String getDESCR() {
		return DESCR;
	}

	public void setDESCR(String dESCR) {
		DESCR = dESCR;
	}



	public String getREADING_DESCR() {
		return READING_DESCR;
	}


	public void setREADING_DESCR(String rEADING_DESCR) {
		READING_DESCR = rEADING_DESCR;
	}



	public String getTOD_DESC() {
		return TOD_DESC;
	}


	public void setTOD_DESC(String tOD_DESC) {
		TOD_DESC = tOD_DESC;
	}

	public String getTOD_ID() {
		return TOD_ID;
	}


	public void setTOD_ID(String tOD_ID) {
		TOD_ID = tOD_ID;
	}


	public String getTIME_CYCLE_CODE() {
		return TIME_CYCLE_CODE;
	}

	public void setTIME_CYCLE_CODE(String tIME_CYCLE_CODE) {
		TIME_CYCLE_CODE = tIME_CYCLE_CODE;
	}

	public String getREADING_TYPE_CODE() {
		return READING_TYPE_CODE;
	}

	public void setREADING_TYPE_CODE(String rEADING_TYPE_CODE) {
		READING_TYPE_CODE = rEADING_TYPE_CODE;
	}

	

	public String getREADING() {
		return READING;
	}


	public void setREADING(String rEADING) {
		READING = rEADING;
	}


	public Integer getCUM_NUM() {
		return CUM_NUM;
	}

	public void setCUM_NUM(Integer cUM_NUM) {
		CUM_NUM = cUM_NUM;
	}

	public Integer getPOWER_FACTOR() {
		return POWER_FACTOR;
	}

	public void setPOWER_FACTOR(Integer pOWER_FACTOR) {
		POWER_FACTOR = pOWER_FACTOR;
	}

	public String getPURPOSE_OF_RDNG() {
		return PURPOSE_OF_RDNG;
	}

	public void setPURPOSE_OF_RDNG(String pURPOSE_OF_RDNG) {
		PURPOSE_OF_RDNG = pURPOSE_OF_RDNG;
	}

	public String getTOD_CODE() {
		return TOD_CODE;
	}

	public void setTOD_CODE(String tOD_CODE) {
		TOD_CODE = tOD_CODE;
	}

	@Override
	public String toString() {
		return "BC_TODMTR_INTERFACE_Model [TOD_ID=" + TOD_ID + ", TIME_CYCLE_CODE=" + TIME_CYCLE_CODE
				+ ", READING_TYPE_CODE=" + READING_TYPE_CODE + ", READING=" + READING + ", READING_DATE=" + READING_DATE
				+ ", CUM_NUM=" + CUM_NUM + ", POWER_FACTOR=" + POWER_FACTOR + ", PURPOSE_OF_RDNG=" + PURPOSE_OF_RDNG
				+ ", TOD_CODE=" + TOD_CODE + "]";
	}
	
	

}
