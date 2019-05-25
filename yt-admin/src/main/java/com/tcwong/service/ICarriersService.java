package com.tcwong.service;

import com.tcwong.bean.Carriers;
import com.tcwong.common.WebPageResponse;

public interface ICarriersService {
    int addCarrier(Carriers carriers);

    int editCarrier(Carriers carriers);

    WebPageResponse getAllByPage(Integer page, Integer size, String sendcompany, String receivecompany, Integer finishedstate);

    int deleteCarrier(String ids);

    int reveiveById(Integer id);
}
