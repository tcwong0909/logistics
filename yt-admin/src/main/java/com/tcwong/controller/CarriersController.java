package com.tcwong.controller;

import com.tcwong.bean.Carriers;
import com.tcwong.bean.Goods;
import com.tcwong.common.WebPageResponse;
import com.tcwong.common.WebResponse;
import com.tcwong.service.ICarriersService;
import com.tcwong.service.IGoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/carriers/")
public class CarriersController  {

    @Resource
    private ICarriersService carriersService;
    @Resource
    private IGoodsService goodsService;

    @PostMapping("/add")
    public WebResponse addCarriersGoods(@RequestBody Carriers carriers, HttpServletRequest request) {

        int num = carriersService.addCarrier(carriers);
        if (num > 0) {
            return WebResponse.success("添加成功");
        }
        return WebResponse.failed("添加失败");
    }

    @DeleteMapping("/delete/{ids}")
    public WebResponse deleteCarriersGoods(@PathVariable String ids, HttpServletRequest request) {
        int num1 = carriersService.deleteCarrier(ids);
        int num2 = goodsService.deleteGoods(ids);
        if (num1 > 0 && num2 > 0) {
            return WebResponse.success("删除成功");
        }
        return WebResponse.failed("删除失败");
    }

    @PutMapping("/put")
    public WebResponse editCarriersGoods(@RequestBody Carriers carriers, @RequestBody Goods goods,
                                         HttpServletRequest request) {
        int num1 = carriersService.editCarrier(carriers);
        int num2 = goodsService.editGoods(goods);
        if (num1 > 0 && num2 > 0) {
            return WebResponse.success("修改成功");
        }
        return WebResponse.failed("修改失败");
    }

    @PostMapping("/getAll")
    public WebResponse getAllByPage(Integer page,Integer size,String sendcompany,String receivecompany,
                                    Integer finishedstate, HttpServletRequest request){
        WebPageResponse pageResponse = carriersService.getAllByPage(page, size, sendcompany, receivecompany, finishedstate);
        if (pageResponse != null) {
            return WebResponse.success(pageResponse, "查询成功");
        }
        return WebResponse.failed("查询失败");
    }

    @PutMapping("/receive/{id}")
    public WebResponse reveiveById(@PathVariable Integer id , HttpServletRequest request){
        int num = carriersService.reveiveById(id);
        if (num > 0) {
            return WebResponse.success("接收成功");
        }
        return WebResponse.failed("接收失败");
    }
}
