package com.reason.gsny.service;

import com.reason.gsny.entity.TableGprsEntity;
import com.reason.gsny.entity.dto.AreaDeviceOnlineAndAll;
import com.reason.gsny.repository.TableGprsRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GprsService {
    @Autowired
    private TableGprsRepo tableGprsRepo;



    public Iterable<TableGprsEntity> findAll(Pageable pageable){
        return tableGprsRepo.findAll(pageable);
    }


    public Iterable<TableGprsEntity> findAllByStatus(Pageable pageable,String status){
        return tableGprsRepo.findAllByStatus(pageable,status);
    }


    public  TableGprsEntity findByImei(long id){
        return tableGprsRepo.findByImei(id);
    }

    /**
     * 更新
     * @param id
     * @param tableGprsEntity
     * @return
     */
    public void update(long id, TableGprsEntity tableGprsEntity){
        tableGprsRepo.save(tableGprsEntity);
    }

    /**
     * 查询水表在线情况
     * @return
     */
    public AreaDeviceOnlineAndAll findOnlineGprs(){
        AreaDeviceOnlineAndAll areaDeviceOnlineAndAll =new AreaDeviceOnlineAndAll();
        try{

            long all =tableGprsRepo.count();
            long online =tableGprsRepo.findOnlineCount();
            areaDeviceOnlineAndAll.setAll(all);
            areaDeviceOnlineAndAll.setOnline(online);
            return areaDeviceOnlineAndAll;
        }catch (Exception e){
            return new AreaDeviceOnlineAndAll(0,0);
        }
    }
}
