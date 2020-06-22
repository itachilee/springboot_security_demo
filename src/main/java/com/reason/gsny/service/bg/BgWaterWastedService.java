package com.reason.gsny.service.bg;

import com.reason.gsny.entity.bg.BgWaterWasted;
import com.reason.gsny.entity.dto.AreaWaterWasted;
import com.reason.gsny.repository.bg.BgWaterWastedRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 已开阀放水用水量
 *
 * @author leon
 */
@Slf4j
@Service
public class BgWaterWastedService {
    @Autowired
    private BgWaterWastedRepo bgWaterWastedRepo;

    public List<BgWaterWasted> findAll() {
        return bgWaterWastedRepo.findAll();
    }


    /**
     * 获取区域已开阀用水量
     * 轉換爲百分比數據
     * @return
     */
    public List<AreaWaterWasted> findBgWaterWastedByArea() {
        List<AreaWaterWasted> list = bgWaterWastedRepo.findBgWaterWastedByArea();
        for (AreaWaterWasted area : list
        ) {
            area.setUsed_water((area.getUsed_water()/area.getCost_amount())*100);
            area.setCost_amount(100.00);
        }
        return list;
    }

}
