package com.kakao.stock.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.kakao.stock.service.KakaoRtStockDayInfoService;
import com.kakao.stock.service.KakaoStockService;
import com.kakao.stock.utils.CommonUtils;
import com.kakao.stock.vo.KakaoRtStockDayInfoVo;

@RestController
public class KakaoStockController {

	
	
	@Autowired 
    private KakaoStockService kakaoStockService;
	
	@Autowired 
    private KakaoRtStockDayInfoService kakaoRtStockDayInfoService;
	
	CommonUtils utils = new CommonUtils();	
	  

	/**
     * 실시간 데이터 update API
     * @param roomId 채팅방 ID
     * @param userId 사용자 ID
     * @return ResponseEntity
     */
	@RequestMapping(path = "/updateRtStock/", method = RequestMethod.GET )
    public  ModelAndView updateRtStock(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView mav = new ModelAndView();
		 List<KakaoRtStockDayInfoVo> list = kakaoRtStockDayInfoService.getList(null);
		 kakaoRtStockDayInfoService.updateList(utils.rtStockInfoRandomUpdate(list));

		return mav; 
	}
	
	/**
     * 실시간 데이터 update API
     * @param roomId 채팅방 ID
     * @param userId 사용자 ID
     * @return ResponseEntity
     */
	@RequestMapping(path = "/rainMoney2/", method = RequestMethod.GET )
    public  ModelAndView getRtStockChartList(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView mav = new ModelAndView();
		//get
		//update
		//utils.rtStockInfoRandomUpdate(list);
		mav.addObject("result", kakaoRtStockDayInfoService.getList(null));
		mav.setViewName("/controller/ift/createIftDiary");
		return mav; 
	}
	
	
}
