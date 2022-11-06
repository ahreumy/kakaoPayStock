package com.kakao.stock;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kakao.stock.service.KakaoRtStockDayInfoService;
import com.kakao.stock.service.KakaoStockService;
import com.kakao.stock.utils.CommonUtils;



@SpringBootApplication
public class KakaoApplication {
	

	@Autowired 
    private  KakaoStockService kakaoStockService;
	@Autowired 
    private  KakaoRtStockDayInfoService kakaoRtStockDayInfoService;
	
	
	public static void main(String[] args){
		SpringApplication.run(KakaoApplication.class,args);
		
	}
	
	@Bean
    public ApplicationRunner applicationRunner() {
        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args) throws Exception {
            
            	CommonUtils utils = new CommonUtils();
            
        		String path ="D:\\workspace\\kakaoStock\\kakao\\src\\main\\webapp\\resources\\csv\\SampleData.csv";
        		try {
        			
        			kakaoStockService.insertList(utils.readCSVtoStock(path));
        			kakaoRtStockDayInfoService.insertList(utils.readCSVtoStockRtDayInfo(path));
        		} catch (Exception e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
            }
        };
    }
	
	
	

}
