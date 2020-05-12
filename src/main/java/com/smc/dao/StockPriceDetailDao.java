package com.smc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smc.entity.StockPriceDetail;

public interface StockPriceDetailDao extends JpaRepository<StockPriceDetail,Long>{
}
