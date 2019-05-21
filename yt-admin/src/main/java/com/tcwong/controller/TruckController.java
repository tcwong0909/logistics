package com.tcwong.controller;

import com.tcwong.bean.Truck;
import com.tcwong.common.WebPageResponse;
import com.tcwong.common.WebResponse;
import com.tcwong.service.ITruckService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/truck/")
public class TruckController {

    @Resource
    private ITruckService truckService;

    @PostMapping("/add")
    public WebResponse addTruck(@RequestBody Truck truck) {
        int num = truckService.addTruck(truck);
        if (num > 0) {
            return WebResponse.success("添加成功");
        }
        return WebResponse.failed("添加失败");
    }

    @GetMapping("/get")
    public WebResponse getAllTrucks() {
        List<Truck> allTrucks = truckService.getAllTrucks();
        if (allTrucks != null) {
            return WebResponse.success(allTrucks);
        }
        return WebResponse.failed("查询失败");
    }

    @GetMapping("/getAllByPage")
    public WebResponse getAllTrucksByPage(Integer page,Integer size){
        WebPageResponse trucks = truckService.getAllTrucksByPage(page, size);
        if (trucks != null){
            return WebResponse.success(trucks, "查询成功");
        }
        return WebResponse.failed("查询失败");
    }
}
