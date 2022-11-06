package com.kakao.stock;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kakao.stock.service.KakaoStockService;
import com.kakao.stock.utils.CommonUtils;

@SpringBootTest
class KakaoApplicationTests {

	@Autowired 
    private KakaoStockService kakaoStockService;
	
	@Test
	void contextLoads() {
		System.out.println("test!!!!!!!!!!!!!!!!!!!!!");
		//String path = request.getRealPath("resources/csv");
		// path += "\\SampleData.csv";
		CommonUtils utils = new CommonUtils();
		//utils.stockLoad();
		//KakaoStockService kakaoStockService = new KakaoStockService();

		String path ="D:\\workspace\\kakaoStock\\kakao\\src\\main\\webapp\\resources\\csv\\SampleData.csv";
		
		try {
			//utils.readCSVtoStock(path);
			//kakaoStockService.insertList(utils.readCSVtoStock(path));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
