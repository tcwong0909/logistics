package com.tcwong.service.impl;

import com.tcwong.bean.Logdic;
import com.tcwong.dao.LogdicMapper;
import com.tcwong.service.ILogDicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LogDicServiceImpl implements ILogDicService {
    @Resource
    private LogdicMapper logdicMapper;
    @Override
    public List<Logdic> getAll() {
        return logdicMapper.selectByExample(null);
    }
}
