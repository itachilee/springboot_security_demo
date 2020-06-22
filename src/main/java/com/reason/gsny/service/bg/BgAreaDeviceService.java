package com.reason.gsny.service.bg;

import com.reason.gsny.entity.bg.BgAreaDevice;
import com.reason.gsny.entity.dto.AreaDeviceGroup;
import com.reason.gsny.entity.dto.AreaDeviceGroup2;
import com.reason.gsny.entity.dto.AreaUserGroup;
import com.reason.gsny.entity.dto.AreaWaterUsage3;
import com.reason.gsny.repository.bg.BgAreaDeviceRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class BgAreaDeviceService {
    @Autowired
    private BgAreaDeviceRepo bgAreaDeviceRepo;
    public Iterable<BgAreaDevice> findAll(Pageable pageable){
        return bgAreaDeviceRepo.findAll(pageable);
    }


    /**
     * 获取到按区域分组的用户信息
     * @return
     */
    public List<AreaDeviceGroup> findDeviceGroupByArea(){
        return bgAreaDeviceRepo.findDeviceGroupByArea();
    }
    public List<AreaDeviceGroup2> findDeviceByMonthAndDevice_type(long device_type){
        List<AreaDeviceGroup2> list =bgAreaDeviceRepo.findDeviceByMonthAndDevice_type(device_type);
        for (int i=0;i<list.size();i++){
            if(1<=i){
                // 增长率计算
//                double growth_roth= Double.parseDouble(list.get(i).getCount()+"")/Double.parseDouble(list.get(i-1).getCount()+"");
//               list.get(i).setGrowth_rate(growth_roth);
               list.get(i).setGrowth_count(list.get(i).getCount()-list.get(i-1).getCount());

            }
        }
        return list;
    }

    public Map<String,List<AreaDeviceGroup2>> findDeviceByMonth( ){
        List<AreaDeviceGroup2> list =bgAreaDeviceRepo.findDeviceByMonth();

        Map<String,List<AreaDeviceGroup2>> stringListMap= new HashMap<>();
        for (AreaDeviceGroup2 area: list) {
            if (stringListMap.containsKey(area.getDevice())){
                stringListMap.get(area.getDevice()).add(area);
            }else {
                List<AreaDeviceGroup2> areaWaterUsage3List=  new ArrayList<>();
                areaWaterUsage3List.add(area);
                stringListMap.put(area.getDevice(),areaWaterUsage3List);
            }
        }
        return stringListMap;
    }


}
