package com.kakao.stock.resultset;

import java.io.Serializable;

import com.kakao.stock.vo.KakaoRtStockDayInfoVo;

/**
 * @author kimah
 *
 */
public class KakaoRtStockDayInfoRS implements Serializable {

	private static final long serialVersionUID = 1L;

    private KakaoRtStockDayInfoVo kakaoRtStockDayInfo;

	public KakaoRtStockDayInfoVo getKakaoRtStockDayInfo() {
		return kakaoRtStockDayInfo;
	}

	public void setKakaoRtStockDayInfo(KakaoRtStockDayInfoVo kakaoRtStockDayInfo) {
		this.kakaoRtStockDayInfo = kakaoRtStockDayInfo;
	}

	
	
}
