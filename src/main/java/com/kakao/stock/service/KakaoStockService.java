package com.kakao.stock.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kakao.stock.mapper.KakaoStockMapper;
import com.kakao.stock.vo.KakaoStockVo;

@Service("KakaoStockService")
public class KakaoStockService {

	@Autowired 
	private KakaoStockMapper stockMapper;	
	
	public int insert(KakaoStockVo vo ) throws Exception {
        int success = 0;
        if(stockMapper.countList(vo)<1)
        	success = stockMapper.insert(vo);
        return success;
    }
	
	public int update(KakaoStockVo vo ) throws Exception {
        int success = 0;
        success = stockMapper.update(vo);
        return success;
    }
	
	public int insertList(List<KakaoStockVo> list ) throws Exception {
		int success = 0;
        
        if (list.size()>0) 
        {
        	for (KakaoStockVo vo : list) 
        		success += insert(vo);	
        }
		
		
        return success;
    }
	
	public int updateList(List<KakaoStockVo> list ) throws Exception {
		int success = 0;
        
        if (list.size()>0) 
        {
        	for (KakaoStockVo vo : list) 
        		success += stockMapper.update(vo);	
        }
		
		
        return success;
    }
	
	
}
