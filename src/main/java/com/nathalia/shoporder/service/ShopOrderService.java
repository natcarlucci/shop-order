package com.nathalia.shoporder.service;

import com.nathalia.shoporder.dto.ShopOrderDTO;
import com.nathalia.shoporder.persistence.model.ShopOrder;
import com.nathalia.shoporder.persistence.repository.ShopOrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopOrderService {

    @Autowired
    private ShopOrderRepository repository;

    @Autowired
    private ModelMapper mapper;

    public void create(ShopOrderDTO orderDTO) {
        ShopOrder shopOrder = repository.save(mapper.map(orderDTO, ShopOrder.class));
        System.out.println("------------------------>" + shopOrder.getId());
    }
}


















