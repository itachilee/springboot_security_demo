package com.reason.gsny.service;

import com.reason.gsny.entity.TableMeterEntity;
import com.reason.gsny.repository.TableMeterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


/**
 * @author leon
 */
@Service
public class TableMeterService {
    @Autowired
    private TableMeterRepo tableMeterRepo;

    /**
     * 分页查询
     *
     * @param pageable
     * @return
     */
    public Iterable<TableMeterEntity> getList(Pageable pageable){
        return tableMeterRepo.findAll(pageable);
    }

}
