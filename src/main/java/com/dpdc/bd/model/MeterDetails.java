package com.dpdc.bd.model;

import org.springframework.stereotype.Component;

@Component
public class MeterDetails {
	private String OLD_METER_TYPECODE;
	private String METER_TYPE_DESC;
	public MeterDetails() {
		super();
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
	
	
	
	

}
