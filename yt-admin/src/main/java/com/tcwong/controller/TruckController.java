package com.tcwong.controller;

import com.tcwong.bean.Truck;
import com.tcwong.common.WebPageResponse;
import com.tcwong.common.WebResponse;
import com.tcwong.service.ITruckService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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

    @PutMapping("/put")
    public WebResponse editTruck(@RequestBody Truck truck) {
        int num = truckService.editTruck(truck);
        if (num >0) {
            return WebResponse.success("编辑成功");
        }
        return WebResponse.failed("编辑失败");
    }

    @DeleteMapping("/delete/{ids}")
    public WebResponse deleteByIds(@PathVariable String ids){
        int num = truckService.deleteByIds(ids);
        if (num >0){
            return WebResponse.success("删除成功");
        }
        return WebResponse.failed("删除失败");
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
