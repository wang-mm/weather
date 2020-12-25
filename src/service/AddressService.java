package service;


import bean.County;
import bean.Province;
import java.util.List;

public interface AddressService {
    	List<Province> queryProvince();
	    List<Province> queryCity(int city);
	    List<County> queryCounty(int county);

}
