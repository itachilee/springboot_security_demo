package com.reason.gsny.service;

import com.reason.gsny.entity.TableGprsEntity;
import com.reason.gsny.entity.TableToConcentratorEntity;
import com.reason.gsny.repository.GprsRepo;
import com.reason.gsny.repository.OrderRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {
    @Autowired
    private OrderRepo orderRepo;



    public Iterable<TableToConcentratorEntity> findAll(Pageable pageable){
        return orderRepo.findAll(pageable);
    }


    public Iterable<TableToConcentratorEntity> findAllByIsOverIsLessThan(Pageable pageable,int is_over){
        return orderRepo.findAllByIsOverIsLessThan(pageable,is_over);
    }

    public Iterable<TableToConcentratorEntity> findAllByIsOverEquals(Pageable pageable,int is_over){
        return orderRepo.findAllByIsOverEquals(pageable,is_over);
    }

    public TableToConcentratorEntity findBySendId(long sendId){
        return orderRepo.findBySendId(sendId);
    }
}
