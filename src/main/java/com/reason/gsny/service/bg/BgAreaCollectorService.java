package com.reason.gsny.service.bg;

import com.reason.gsny.entity.dto.AreaDeviceOnlineAndAll;
import com.reason.gsny.repository.TableCollectorRepo;
import com.reason.gsny.repository.TableWaterRepo;
import com.reason.gsny.repository.bg.BgAreaCollectorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BgAreaCollectorService {
    @Autowired
    private BgAreaCollectorRepo bgAreaCollectorRepo;

    @Autowired
    private TableCollectorRepo tableCollectorRepo;


    /**
     * 查询中继器在线情况
     *
     * @return
     */
    public AreaDeviceOnlineAndAll findOnlineCollector() {
        AreaDeviceOnlineAndAll areaDeviceOnlineAndAll = new AreaDeviceOnlineAndAll();
        try {
            long online = bgAreaCollectorRepo.count();
            long all = tableCollectorRepo.count();
            areaDeviceOnlineAndAll.setAll(all);
            areaDeviceOnlineAndAll.setOnline(online);
            return areaDeviceOnlineAndAll;
            //(Double.parseDouble(onlineMeters+"")/Double.parseDouble(allMeters+""))*100;
        } catch (Exception e) {
            return new AreaDeviceOnlineAndAll(0, 0);
        }
    }

}
