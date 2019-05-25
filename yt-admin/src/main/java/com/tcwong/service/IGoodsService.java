package com.tcwong.service;

import com.tcwong.bean.Goods;

import java.util.List;

public interface IGoodsService {
    List<Goods> getAll();

    int addGoods(Goods goods);

    int editGoods(Goods goods);

    int deleteGoods(String ids);
}
