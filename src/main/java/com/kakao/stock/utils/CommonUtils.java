package com.kakao.stock.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import com.kakao.stock.service.KakaoRtStockDayInfoService;
import com.kakao.stock.service.KakaoStockService;
import com.kakao.stock.vo.KakaoRtStockDayInfoVo;
import com.kakao.stock.vo.KakaoStockVo;


/**
 * 공통적으로 쓰이는 유틸성 함수
 */
public class CommonUtils {
	
	@Autowired 
    private KakaoRtStockDayInfoService kakaoRtStockDayInfoService;
	
	@Autowired 
    private KakaoStockService kakaoStockService;
	
	
	public  List<KakaoStockVo> readCSVtoStock(String filename)throws Exception {
		 List<KakaoStockVo> list = new ArrayList<KakaoStockVo>();
		BufferedReader br = null;
		try{
            br = Files.newBufferedReader(Paths.get(filename), Charset.forName("euc-kr"));
          
            String line = "";
            br.readLine(); 
            while((line = br.readLine()) != null){
                //CSV 1행을 저장하는 리스트
            	KakaoStockVo tmp = new KakaoStockVo();
                String array[] = line.split(",");
                if(array.length>0) {
                	tmp.setCode(array[1].trim());
                	tmp.setCodeNm(array[2].trim());
                	list.add(tmp);
                }
            }
            //kakaoStockService.insertList(list);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(br != null){
                    br.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
		return list;
	}
	
	public  List<KakaoRtStockDayInfoVo> readCSVtoStockRtDayInfo(String filename)throws Exception {
		 List<KakaoRtStockDayInfoVo> list = new ArrayList<KakaoRtStockDayInfoVo>();
		BufferedReader br = null;
		try{
           br = Files.newBufferedReader(Paths.get(filename), Charset.forName("euc-kr"));
         
           String line = "";
           br.readLine(); 
           while((line = br.readLine()) != null){
               //CSV 1행을 저장하는 리스트
        	   KakaoRtStockDayInfoVo tmp = new KakaoRtStockDayInfoVo();
               String array[] = line.split(",");
               if(array.length>0) {
               	tmp.setCode(array[1].trim());
               	tmp.setnPrc(Long.parseLong(array[3]));
               	tmp.setoPrc(Long.parseLong(array[3]));
               
               	
               	list.add(tmp);
               }
           }
           //kakaoStockService.insertList(list);
       }catch(FileNotFoundException e){
           e.printStackTrace();
       }catch(IOException e){
           e.printStackTrace();
       }finally{
           try{
               if(br != null){
                   br.close();
               }
           }catch(IOException e){
               e.printStackTrace();
           }
       }
		return list;
	}
	
	public List<KakaoRtStockDayInfoVo>  rtStockInfoRandomUpdate(List<KakaoRtStockDayInfoVo> list) throws Exception {
		Random random = new Random();
		int sucess = 0;
		
		List<KakaoRtStockDayInfoVo> resultList = new ArrayList<KakaoRtStockDayInfoVo>();
		for (KakaoRtStockDayInfoVo vo : list) 
		{
			int prevInqCn = vo.getInqCn();
			int  prevTrqt = vo.getTrqt();
			long  prevPrc = vo.getnPrc();
			
			vo.setInqCn(prevInqCn+random.nextInt(1000));
			vo.setTrqt(prevTrqt+random.nextInt(1000));
			vo.setnPrc(prevPrc+random.nextInt(1000));

			resultList.add(vo);
		}
		
		return resultList;
	}
}