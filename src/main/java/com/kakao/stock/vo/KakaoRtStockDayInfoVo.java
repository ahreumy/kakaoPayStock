package com.kakao.stock.vo;

public class KakaoRtStockDayInfoVo {

	private String code;
	private String basDt;
	private int trqt;
	private int inqCn;
	private long oPrc;
	private long nPrc;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getBasDt() {
		return basDt;
	}
	public void setBasDt(String basDt) {
		this.basDt = basDt;
	}
	
	public int getTrqt() {
		return trqt;
	}
	public void setTrqt(int trqt) {
		this.trqt = trqt;
	}
	public int getInqCn() {
		return inqCn;
	}
	public void setInqCn(int inqCn) {
		this.inqCn = inqCn;
	}
	public long getoPrc() {
		return oPrc;
	}
	public void setoPrc(long oPrc) {
		this.oPrc = oPrc;
	}
	public long getnPrc() {
		return nPrc;
	}
	public void setnPrc(long nPrc) {
		this.nPrc = nPrc;
	}

	
}
