package dao;

import java.util.List;

import bean.Address;
import bean.County;
import bean.Province;

public interface AddressDao {
	    List<Province> queryProvince();
	    List<Province> queryCity(int city);
	    List<County> queryCounty(int county);
}



