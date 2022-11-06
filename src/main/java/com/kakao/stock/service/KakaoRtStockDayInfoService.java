package com.kakao.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kakao.stock.mapper.KakaoRtStockDayInfoMapper;
import com.kakao.stock.vo.KakaoRtStockDayInfoVo;

@Service("KakaoRtStockDayInfoService")
public class KakaoRtStockDayInfoService {

	@Autowired 
	private KakaoRtStockDayInfoMapper rtStockInfoMapper;	
	
	public int insert(KakaoRtStockDayInfoVo vo ) throws Exception {
        int success = 0;
        if(rtStockInfoMapper.countList(vo)<1)
        	success = rtStockInfoMapper.insert(vo);
        return success;
    }
	
	public int update(KakaoRtStockDayInfoVo vo ) throws Exception {
        int success = 0;
        success = rtStockInfoMapper.update(vo);
        return success;
    }
	
	public int insertList(List<KakaoRtStockDayInfoVo> list ) throws Exception {
		int success = 0;
        
        if (list.size()>0) 
        {
        	for (KakaoRtStockDayInfoVo vo : list) 
        		success += insert(vo);	
        }
		
		
        return success;
    }
	
	public int updateList(List<KakaoRtStockDayInfoVo> list ) throws Exception {
		int success = 0;
        
        if (list.size()>0) 
        {
        	for (KakaoRtStockDayInfoVo vo : list) 
        		success += rtStockInfoMapper.update(vo);	
        }
		
		
        return success;
    }
	
	public List<KakaoRtStockDayInfoVo> getList(KakaoRtStockDayInfoVo vo) throws Exception {
		
		return rtStockInfoMapper.getList(vo);
	}
}
