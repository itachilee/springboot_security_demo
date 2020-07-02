package com.reason.gsny.service;

import com.reason.gsny.entity.TableToConcentratorEntity;
import com.reason.gsny.repository.TableOrderRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {
    @Autowired
    private TableOrderRepo tableOrderRepo;



    public Iterable<TableToConcentratorEntity> findAll(Pageable pageable){
        return tableOrderRepo.findAll(pageable);
    }


    public Iterable<TableToConcentratorEntity> findAllByIsOverIsLessThan(Pageable pageable,int is_over){
        return tableOrderRepo.findAllByIsOverIsLessThan(pageable,is_over);
    }

    public Iterable<TableToConcentratorEntity> findAllByIsOverEquals(Pageable pageable,int is_over){
        return tableOrderRepo.findAllByIsOverEquals(pageable,is_over);
    }

    public TableToConcentratorEntity findBySendId(long sendId){
        return tableOrderRepo.findBySendId(sendId);
    }
}
