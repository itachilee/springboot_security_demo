package com.reason.gsny.service.bg;

import com.reason.gsny.entity.bg.BgAreaMeter;
import com.reason.gsny.entity.dto.AreaDeviceOnlineAndAll;
import com.reason.gsny.repository.TableMeterRepo;
import com.reason.gsny.repository.bg.BgAreaMeterRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author leon
 */
@Slf4j
@Service
public class BgAreaMeterService {
    @Autowired
    BgAreaMeterRepo bgAreaMeterRepo;


    @Autowired
    TableMeterRepo tableMeterRepo;
    /**
     * 查詢所有在綫的阀控器
     * select * from bg_area_meter
     * @return
     */
    public List<BgAreaMeter> findAll() {
        return bgAreaMeterRepo.findAll();
    }

    /**
     * 返回在线的阀控器比例
     * @return
     */
    public AreaDeviceOnlineAndAll findOnlineMeter(){
        try{
            long online =bgAreaMeterRepo.count();
            long all=tableMeterRepo.count();
            AreaDeviceOnlineAndAll areaDeviceOnlineAndAll =new AreaDeviceOnlineAndAll();
            areaDeviceOnlineAndAll.setAll(all);
            areaDeviceOnlineAndAll.setOnline(online);
            return areaDeviceOnlineAndAll;
                    //(Double.parseDouble(onlineMeters+"")/Double.parseDouble(allMeters+""))*100;
        }catch (Exception e){
            return null;
        }
    }

//    public  List<Object[]> findOnlineMeter(){
//        return bgAreaMeterRepo.findOnlineMeter();
//    }
}
