package com.tcwong.service.impl;

import com.tcwong.bean.Goods;
import com.tcwong.dao.GoodsMapper;
import com.tcwong.service.IGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements IGoodsService {
    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> getAll() {
        return goodsMapper.selectByExample(null);
    }

    @Override
    public int addGoods(Goods goods) {
        return goodsMapper.insert(goods);
    }

    @Override
    public int editGoods(Goods goods) {
        return goodsMapper.insertSelective(goods);
    }

    @Override
    public int deleteGoods(String ids) {
        String[] fkIds = ids.split(",");
        goodsMapper.deleteByFkIds(fkIds);
        return fkIds.length;

    }
}
