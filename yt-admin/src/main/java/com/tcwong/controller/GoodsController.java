package com.tcwong.controller;

import com.tcwong.bean.Goods;
import com.tcwong.common.WebResponse;
import com.tcwong.service.IGoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class GoodsController {

    @Resource
    private IGoodsService goodsService;

    @GetMapping("/goodslist")
    public WebResponse getGoods(HttpServletRequest request){
        List<Goods> goodsList = goodsService.getAll();
        return WebResponse.success(goodsList);
    }
}
