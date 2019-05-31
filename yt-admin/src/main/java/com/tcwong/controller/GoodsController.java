package com.tcwong.controller;

import com.tcwong.bean.Goods;
import com.tcwong.common.WebResponse;
import com.tcwong.service.IGoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 货物
 */
@RestController
public class GoodsController {

    @Resource
    private IGoodsService goodsService;

    @GetMapping("/goodslist")
    public WebResponse getGoods(){
        List<Goods> goodsList = goodsService.getAll();
        return WebResponse.success(goodsList);
    }
}
