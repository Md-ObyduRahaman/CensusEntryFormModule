package com.dpdc.bd.model;

import org.springframework.stereotype.Component;

@Component
public class MeterDetails {
	private String OLD_METER_TYPECODE;
	private String METER_TYPE_DESC;
	private String MANUF_CODE;
	private String MANUF_NAME;
	private String LOCATON_DESCR;
	private String METER_LOCATION_CODE;
	private String DESCR;
	private String RATED_CURRENT_CODE;
	private String DEFECTIVE_CODE;
	private String DEFECTIVE_DESC;
	private String METER_OWNER;
	private String METER_TYPE;
	private String CREATE_BY;
	private String METER_MFG_DATE;
	private String METER_INST_DATE;
	private String METER_NUM;
	private String METER_DIGIT_KW;
	private String METER_DIGIT_CUM;
	private String METER_DIGIT;
	private String CURR_RATING;
	private String VOLT_VALUE;
	private String METER_CONDITION;
	private String ASSOCIATED_KWH_METER_NUM;
	private String SCALE_FACTOR_KW;
	private String SCALE_FACTOR_KVARH;
	private String SCALE_FACTOR_KVA;
	private String PT_NUMERATOR;
	private String CT_NUMERATOR;
	private String OVERALL_MF_KWH;
	private String METER_SEAL;
	private String PROT_TYPE;
	private String TIME_SWITCH_NUM;
	private String TIME_SWITCH_START;
	private String TIME_SWITCH_SEAL;
	public MeterDetails() {
		super();
	}
	
	
	
	public MeterDetails(String oLD_METER_TYPECODE, String mETER_TYPE_DESC, String mANUF_CODE, String mANUF_NAME,
			String lOCATON_DESCR, String mETER_LOCATION_CODE, String dESCR, String rATED_CURRENT_CODE,
			String dEFECTIVE_CODE, String dEFECTIVE_DESC, String mETER_OWNER, String mETER_TYPE, String cREATE_BY,
			String mETER_MFG_DATE, String mETER_INST_DATE, String mETER_NUM, String mETER_DIGIT_KW,
			String mETER_DIGIT_CUM, String mETER_DIGIT, String cURR_RATING, String vOLT_VALUE, String mETER_CONDITION,
			String aSSOCIATED_KWH_METER_NUM, String sCALE_FACTOR_KW, String sCALE_FACTOR_KVARH, String sCALE_FACTOR_KVA,
			String pT_NUMERATOR, String cT_NUMERATOR, String oVERALL_MF_KWH, String mETER_SEAL, String pROT_TYPE,
			String tIME_SWITCH_NUM, String tIME_SWITCH_START, String tIME_SWITCH_SEAL) {
		super();
		OLD_METER_TYPECODE = oLD_METER_TYPECODE;
		METER_TYPE_DESC = mETER_TYPE_DESC;
		MANUF_CODE = mANUF_CODE;
		MANUF_NAME = mANUF_NAME;
		LOCATON_DESCR = lOCATON_DESCR;
		METER_LOCATION_CODE = mETER_LOCATION_CODE;
		DESCR = dESCR;
		RATED_CURRENT_CODE = rATED_CURRENT_CODE;
		DEFECTIVE_CODE = dEFECTIVE_CODE;
		DEFECTIVE_DESC = dEFECTIVE_DESC;
		METER_OWNER = mETER_OWNER;
		METER_TYPE = mETER_TYPE;
		CREATE_BY = cREATE_BY;
		METER_MFG_DATE = mETER_MFG_DATE;
		METER_INST_DATE = mETER_INST_DATE;
		METER_NUM = mETER_NUM;
		METER_DIGIT_KW = mETER_DIGIT_KW;
		METER_DIGIT_CUM = mETER_DIGIT_CUM;
		METER_DIGIT = mETER_DIGIT;
		CURR_RATING = cURR_RATING;
		VOLT_VALUE = vOLT_VALUE;
		METER_CONDITION = mETER_CONDITION;
		ASSOCIATED_KWH_METER_NUM = aSSOCIATED_KWH_METER_NUM;
		SCALE_FACTOR_KW = sCALE_FACTOR_KW;
		SCALE_FACTOR_KVARH = sCALE_FACTOR_KVARH;
		SCALE_FACTOR_KVA = sCALE_FACTOR_KVA;
		PT_NUMERATOR = pT_NUMERATOR;
		CT_NUMERATOR = cT_NUMERATOR;
		OVERALL_MF_KWH = oVERALL_MF_KWH;
		METER_SEAL = mETER_SEAL;
		PROT_TYPE = pROT_TYPE;
		TIME_SWITCH_NUM = tIME_SWITCH_NUM;
		TIME_SWITCH_START = tIME_SWITCH_START;
		TIME_SWITCH_SEAL = tIME_SWITCH_SEAL;
	}



	public String getMETER_MFG_DATE() {
		return METER_MFG_DATE;
	}



	public void setMETER_MFG_DATE(String mETER_MFG_DATE) {
		METER_MFG_DATE = mETER_MFG_DATE;
	}



	public String getMETER_INST_DATE() {
		return METER_INST_DATE;
	}



	public void setMETER_INST_DATE(String mETER_INST_DATE) {
		METER_INST_DATE = mETER_INST_DATE;
	}



	public String getMETER_NUM() {
		return METER_NUM;
	}



	public void setMETER_NUM(String mETER_NUM) {
		METER_NUM = mETER_NUM;
	}



	public String getMETER_DIGIT_KW() {
		return METER_DIGIT_KW;
	}



	public void setMETER_DIGIT_KW(String mETER_DIGIT_KW) {
		METER_DIGIT_KW = mETER_DIGIT_KW;
	}



	public String getMETER_DIGIT_CUM() {
		return METER_DIGIT_CUM;
	}



	public void setMETER_DIGIT_CUM(String mETER_DIGIT_CUM) {
		METER_DIGIT_CUM = mETER_DIGIT_CUM;
	}



	public String getMETER_DIGIT() {
		return METER_DIGIT;
	}



	public void setMETER_DIGIT(String mETER_DIGIT) {
		METER_DIGIT = mETER_DIGIT;
	}



	public String getCURR_RATING() {
		return CURR_RATING;
	}



	public void setCURR_RATING(String cURR_RATING) {
		CURR_RATING = cURR_RATING;
	}



	public String getVOLT_VALUE() {
		return VOLT_VALUE;
	}



	public void setVOLT_VALUE(String vOLT_VALUE) {
		VOLT_VALUE = vOLT_VALUE;
	}



	public String getMETER_CONDITION() {
		return METER_CONDITION;
	}



	public void setMETER_CONDITION(String mETER_CONDITION) {
		METER_CONDITION = mETER_CONDITION;
	}



	public String getASSOCIATED_KWH_METER_NUM() {
		return ASSOCIATED_KWH_METER_NUM;
	}



	public void setASSOCIATED_KWH_METER_NUM(String aSSOCIATED_KWH_METER_NUM) {
		ASSOCIATED_KWH_METER_NUM = aSSOCIATED_KWH_METER_NUM;
	}



	public String getSCALE_FACTOR_KW() {
		return SCALE_FACTOR_KW;
	}



	public void setSCALE_FACTOR_KW(String sCALE_FACTOR_KW) {
		SCALE_FACTOR_KW = sCALE_FACTOR_KW;
	}



	public String getSCALE_FACTOR_KVARH() {
		return SCALE_FACTOR_KVARH;
	}



	public void setSCALE_FACTOR_KVARH(String sCALE_FACTOR_KVARH) {
		SCALE_FACTOR_KVARH = sCALE_FACTOR_KVARH;
	}



	public String getSCALE_FACTOR_KVA() {
		return SCALE_FACTOR_KVA;
	}



	public void setSCALE_FACTOR_KVA(String sCALE_FACTOR_KVA) {
		SCALE_FACTOR_KVA = sCALE_FACTOR_KVA;
	}



	public String getPT_NUMERATOR() {
		return PT_NUMERATOR;
	}



	public void setPT_NUMERATOR(String pT_NUMERATOR) {
		PT_NUMERATOR = pT_NUMERATOR;
	}



	public String getCT_NUMERATOR() {
		return CT_NUMERATOR;
	}



	public void setCT_NUMERATOR(String cT_NUMERATOR) {
		CT_NUMERATOR = cT_NUMERATOR;
	}



	public String getOVERALL_MF_KWH() {
		return OVERALL_MF_KWH;
	}



	public void setOVERALL_MF_KWH(String oVERALL_MF_KWH) {
		OVERALL_MF_KWH = oVERALL_MF_KWH;
	}



	public String getMETER_SEAL() {
		return METER_SEAL;
	}



	public void setMETER_SEAL(String mETER_SEAL) {
		METER_SEAL = mETER_SEAL;
	}



	public String getPROT_TYPE() {
		return PROT_TYPE;
	}



	public void setPROT_TYPE(String pROT_TYPE) {
		PROT_TYPE = pROT_TYPE;
	}



	public String getTIME_SWITCH_NUM() {
		return TIME_SWITCH_NUM;
	}



	public void setTIME_SWITCH_NUM(String tIME_SWITCH_NUM) {
		TIME_SWITCH_NUM = tIME_SWITCH_NUM;
	}



	public String getTIME_SWITCH_START() {
		return TIME_SWITCH_START;
	}



	public void setTIME_SWITCH_START(String tIME_SWITCH_START) {
		TIME_SWITCH_START = tIME_SWITCH_START;
	}



	public String getTIME_SWITCH_SEAL() {
		return TIME_SWITCH_SEAL;
	}



	public void setTIME_SWITCH_SEAL(String tIME_SWITCH_SEAL) {
		TIME_SWITCH_SEAL = tIME_SWITCH_SEAL;
	}



	public String getCREATE_BY() {
		return CREATE_BY;
	}



	public void setCREATE_BY(String cREATE_BY) {
		CREATE_BY = cREATE_BY;
	}



	public String getMETER_OWNER() {
		return METER_OWNER;
	}

	public void setMETER_OWNER(String mETER_OWNER) {
		METER_OWNER = mETER_OWNER;
	}

	public String getMETER_TYPE() {
		return METER_TYPE;
	}

	public void setMETER_TYPE(String mETER_TYPE) {
		METER_TYPE = mETER_TYPE;
	}

	public String getDEFECTIVE_CODE() {
		return DEFECTIVE_CODE;
	}

	public void setDEFECTIVE_CODE(String dEFECTIVE_CODE) {
		DEFECTIVE_CODE = dEFECTIVE_CODE;
	}

	public String getDEFECTIVE_DESC() {
		return DEFECTIVE_DESC;
	}

	public void setDEFECTIVE_DESC(String dEFECTIVE_DESC) {
		DEFECTIVE_DESC = dEFECTIVE_DESC;
	}

	public String getDESCR() {
		return DESCR;
	}

	public void setDESCR(String dESCR) {
		DESCR = dESCR;
	}

	public String getRATED_CURRENT_CODE() {
		return RATED_CURRENT_CODE;
	}

	public void setRATED_CURRENT_CODE(String rATED_CURRENT_CODE) {
		RATED_CURRENT_CODE = rATED_CURRENT_CODE;
	}

	public String getLOCATON_DESCR() {
		return LOCATON_DESCR;
	}

	public void setLOCATON_DESCR(String lOCATON_DESCR) {
		LOCATON_DESCR = lOCATON_DESCR;
	}

	public String getMETER_LOCATION_CODE() {
		return METER_LOCATION_CODE;
	}

	public void setMETER_LOCATION_CODE(String mETER_LOCATION_CODE) {
		METER_LOCATION_CODE = mETER_LOCATION_CODE;
	}

	public String getOLD_METER_TYPECODE() {
		return OLD_METER_TYPECODE;
	}
	public void setOLD_METER_TYPECODE(String oLD_METER_TYPECODE) {
		OLD_METER_TYPECODE = oLD_METER_TYPECODE;
	}
	public String getMETER_TYPE_DESC() {
		return METER_TYPE_DESC;
	}
	public void setMETER_TYPE_DESC(String mETER_TYPE_DESC) {
		METER_TYPE_DESC = mETER_TYPE_DESC;
	}
	public String getMANUF_CODE() {
		return MANUF_CODE;
	}
	public void setMANUF_CODE(String mANUF_CODE) {
		MANUF_CODE = mANUF_CODE;
	}
	public String getMANUF_NAME() {
		return MANUF_NAME;
	}
	public void setMANUF_NAME(String mANUF_NAME) {
		MANUF_NAME = mANUF_NAME;
	}



	@Override
	public String toString() {
		return "MeterDetails [OLD_METER_TYPECODE=" + OLD_METER_TYPECODE + ", METER_TYPE_DESC=" + METER_TYPE_DESC
				+ ", MANUF_CODE=" + MANUF_CODE + ", MANUF_NAME=" + MANUF_NAME + ", LOCATON_DESCR=" + LOCATON_DESCR
				+ ", METER_LOCATION_CODE=" + METER_LOCATION_CODE + ", DESCR=" + DESCR + ", RATED_CURRENT_CODE="
				+ RATED_CURRENT_CODE + ", DEFECTIVE_CODE=" + DEFECTIVE_CODE + ", DEFECTIVE_DESC=" + DEFECTIVE_DESC
				+ ", METER_OWNER=" + METER_OWNER + ", METER_TYPE=" + METER_TYPE + ", CREATE_BY=" + CREATE_BY
				+ ", METER_MFG_DATE=" + METER_MFG_DATE + ", METER_INST_DATE=" + METER_INST_DATE + ", METER_NUM="
				+ METER_NUM + ", METER_DIGIT_KW=" + METER_DIGIT_KW + ", METER_DIGIT_CUM=" + METER_DIGIT_CUM
				+ ", METER_DIGIT=" + METER_DIGIT + ", CURR_RATING=" + CURR_RATING + ", VOLT_VALUE=" + VOLT_VALUE
				+ ", METER_CONDITION=" + METER_CONDITION + ", ASSOCIATED_KWH_METER_NUM=" + ASSOCIATED_KWH_METER_NUM
				+ ", SCALE_FACTOR_KW=" + SCALE_FACTOR_KW + ", SCALE_FACTOR_KVARH=" + SCALE_FACTOR_KVARH
				+ ", SCALE_FACTOR_KVA=" + SCALE_FACTOR_KVA + ", PT_NUMERATOR=" + PT_NUMERATOR + ", CT_NUMERATOR="
				+ CT_NUMERATOR + ", OVERALL_MF_KWH=" + OVERALL_MF_KWH + ", METER_SEAL=" + METER_SEAL + ", PROT_TYPE="
				+ PROT_TYPE + ", TIME_SWITCH_NUM=" + TIME_SWITCH_NUM + ", TIME_SWITCH_START=" + TIME_SWITCH_START
				+ ", TIME_SWITCH_SEAL=" + TIME_SWITCH_SEAL + "]";
	}




	
	
	
	

}
