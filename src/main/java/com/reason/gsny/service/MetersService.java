package com.reason.gsny.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.reason.gsny.entity.TableGprsEntity;
import com.reason.gsny.entity.TableMeterEntity;
import com.reason.gsny.entity.TableToConcentratorEntity;
import com.reason.gsny.entity.TableWaterEntity;
import com.reason.gsny.entity.other.Io;
import com.reason.gsny.repository.GprsRepo;
import com.reason.gsny.repository.MeterRepo;
import com.reason.gsny.repository.OrderRepo;
import com.reason.gsny.repository.WaterRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author leon
 */
@Slf4j
@Service
public class MetersService {
    @Autowired
    private MeterRepo meterRepo;

    @Autowired
    private WaterRepo waterRepo;

    @Autowired
    private GprsRepo gprsRepo;
    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private ObjectMapper mapper;
    public Iterable<TableMeterEntity> findAll(Pageable pageable){
        return meterRepo.findAll(pageable);
    }


    public Iterable<TableMeterEntity> findAllByImeiId(Pageable pageable, Long imei_id){
        return meterRepo.findAllByImeiId(pageable,imei_id);
    }

    /**
     * 开泵
     * @param meter_id
     * @return
     * @throws JsonProcessingException
     */
    public long openMeter(Long meter_id) throws JsonProcessingException {
        TableMeterEntity tableMeterEntity =meterRepo.findByMeterIDid(meter_id);
        TableWaterEntity tableWaterEntity =waterRepo.findByMeterIDid(tableMeterEntity.getMeterIDid());
        TableGprsEntity tableGprsEntity =gprsRepo.findByImeiid(tableMeterEntity.getImeiId());
        Io io=new Io();
        io.setIO1(1);
        io.setIO2(1);
        io.setIO3(1);
        io.setIO4(1);
        io.setIO5(1);
        TableToConcentratorEntity toConcentratorEntity =new TableToConcentratorEntity();
        if(tableGprsEntity!=null){
            toConcentratorEntity.setImei(tableGprsEntity.getImei());
        }
        if(tableMeterEntity!=null){
            toConcentratorEntity.setMeterId(tableMeterEntity.getMeterID());
        }
        if(tableWaterEntity!=null){
            toConcentratorEntity.setWaterId(tableWaterEntity.getWaterId());
        }
        toConcentratorEntity.setCmdInfo(mapper.writeValueAsString(io));
        toConcentratorEntity.setCmdCode("189");
        toConcentratorEntity.setCmdName("开泵");
        orderRepo.save(toConcentratorEntity);
        Long sendId=toConcentratorEntity.getSendId();

        return sendId;
    }

    public long closeMeter(long id) throws JsonProcessingException {
        TableMeterEntity tableMeterEntity =meterRepo.findByMeterIDid(id);
        TableWaterEntity tableWaterEntity =waterRepo.findByMeterIDid(tableMeterEntity.getMeterIDid());
        TableGprsEntity tableGprsEntity =gprsRepo.findByImeiid(tableMeterEntity.getImeiId());
        Io io=new Io();

        TableToConcentratorEntity toConcentratorEntity =new TableToConcentratorEntity();
        if(tableGprsEntity!=null){
            toConcentratorEntity.setImei(tableGprsEntity.getImei());
        }
        if(tableMeterEntity!=null){
            toConcentratorEntity.setMeterId(tableMeterEntity.getMeterID());
        }
        if(tableWaterEntity!=null){
            toConcentratorEntity.setWaterId(tableWaterEntity.getWaterId());
        }
        toConcentratorEntity.setCmdName("关泵");

        toConcentratorEntity.setCmdCode("189");
        toConcentratorEntity.setCmdInfo(mapper.writeValueAsString(io));
        orderRepo.save(toConcentratorEntity);
        Long sendId =toConcentratorEntity.getSendId();
        return sendId;
    }


}
