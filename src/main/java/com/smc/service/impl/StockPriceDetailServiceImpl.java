package com.smc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.smc.dao.StockPriceDetailDao;
import com.smc.service.StockPriceDetailService;

public class StockPriceDetailServiceImpl implements StockPriceDetailService{
    @Autowired
    private StockPriceDetailDao stockPriceDetailDao;
}