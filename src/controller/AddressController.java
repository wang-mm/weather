package controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;

import bean.County;
import bean.Province;
import service.AddressService;

public class AddressController {
	private AddressService addressService;
	  @RequestMapping(value = "/china",produces = {"application/json;charset=UTF-8"})
	  @ResponseBody
	    public String province(){
	        List<Province> provinces = addressService.queryProvince();
	        if (provinces.size()>0){
	            Object o = JSONArray.toJSON(provinces);
	            String s = o.toString();
	            System.out.println(s);
	            return s;
	        }else {
	            return null;
	        }
	    }
	  
	   
	    @RequestMapping(value = "/china/{city}",produces = {"application/json;charset=UTF-8"})
	    @ResponseBody
	    public String province(@PathVariable("city") int city){
	        System.out.println("city:"+city);
	        List<Province> cities = addressService.queryCity(city);
	        if (cities.size()>0){
	            Object o = JSONArray.toJSON(cities);
	            String s = o.toString();
	            System.out.println(s);
	            return s;
	        }else {
	            return null;
	        }
	    }
	    
	    @RequestMapping(value = "/china/{city}/{county}",produces = {"application/json;charset=UTF-8"})
	    @ResponseBody
	    public String province(@PathVariable("city") int city, @PathVariable("county") int county){
	        System.out.println("city:"+city+"\n"+"county:"+county);
	        List<County> counties = addressService.queryCounty(county);
	        if (counties.size()>0){
	            Object o = JSONArray.toJSON(counties);
	            String s = o.toString();
	            System.out.println(s);
	            return s;
	        }else {
	            return null;
	        }
	    }

}
