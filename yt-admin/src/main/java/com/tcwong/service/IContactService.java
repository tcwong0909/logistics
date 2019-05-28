package com.tcwong.service;

import com.tcwong.bean.Contact;
import com.tcwong.common.WebPageResponse;

public interface IContactService {
     WebPageResponse getAll(Integer page, Integer size, Integer fkTruckid, Integer fkDriverid, String drivername,
                            String teamname, Integer bindId) ;


     int bindTruck(Contact contact);

     int unbindTrucks(String ids);
}
