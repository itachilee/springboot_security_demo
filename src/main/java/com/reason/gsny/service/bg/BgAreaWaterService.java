package com.reason.gsny.service.bg;

import com.reason.gsny.entity.dto.AreaDeviceOnlineAndAll;
import com.reason.gsny.repository.TableWaterRepo;
import com.reason.gsny.repository.bg.BgAreaWaterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BgAreaWaterService {
    @Autowired
    private BgAreaWaterRepo bgAreaWaterRepo;

    @Autowired
    private TableWaterRepo tableWaterRepo;

    /**
     * 查询水表在线情况
     * @return
     */
    public AreaDeviceOnlineAndAll findOnlineWater(){
        AreaDeviceOnlineAndAll areaDeviceOnlineAndAll =new AreaDeviceOnlineAndAll();
        try{
            long online =bgAreaWaterRepo.count();
            long all=tableWaterRepo.count();
            areaDeviceOnlineAndAll.setAll(all);
            areaDeviceOnlineAndAll.setOnline(online);
            return areaDeviceOnlineAndAll;
            //(Double.parseDouble(onlineMeters+"")/Double.parseDouble(allMeters+""))*100;
        }catch (Exception e){
            return new AreaDeviceOnlineAndAll(0,0);
        }
    }
}
