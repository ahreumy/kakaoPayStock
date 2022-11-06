package com.kakao.stock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.kakao.stock.vo.KakaoRtStockDayInfoVo;
import com.kakao.stock.vo.KakaoStockVo;

@Mapper
@Repository
public interface KakaoStockMapper {

	
	
	int insert(KakaoStockVo vo);
	
	int update(KakaoStockVo vo);
	
	int countList(KakaoStockVo vo);
}
