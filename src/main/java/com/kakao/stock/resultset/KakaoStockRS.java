package com.kakao.stock.resultset;

import java.io.Serializable;

import com.kakao.stock.vo.KakaoRtStockDayInfoVo;
import com.kakao.stock.vo.KakaoStockVo;

public class KakaoStockRS implements Serializable {

	

		private static final long serialVersionUID = 1L;

	    private KakaoStockVo kakaoStockVo;

		public KakaoStockVo getKakaoStockVo() {
			return kakaoStockVo;
		}

		public void setKakaoStockVo(KakaoStockVo kakaoStockVo) {
			this.kakaoStockVo = kakaoStockVo;
		}

	
		
		
}
