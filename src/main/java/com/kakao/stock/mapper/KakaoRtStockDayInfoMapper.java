package com.kakao.stock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.kakao.stock.resultset.KakaoRtStockDayInfoRS;
import com.kakao.stock.vo.KakaoRtStockDayInfoVo;

@Mapper
@Repository
public interface KakaoRtStockDayInfoMapper {

	
	
	int insert(KakaoRtStockDayInfoVo vo);
	
	int update(KakaoRtStockDayInfoVo vo);
	
	int countList(KakaoRtStockDayInfoVo vo);
	
	List<KakaoRtStockDayInfoVo> getList(KakaoRtStockDayInfoVo vo);
}
