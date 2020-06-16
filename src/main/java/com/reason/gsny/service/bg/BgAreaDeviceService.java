package com.reason.gsny.service.bg;

import com.reason.gsny.entity.bg.BgAreaDevice;
import com.reason.gsny.entity.dto.AreaDeviceGroup;
import com.reason.gsny.entity.dto.AreaUserGroup;
import com.reason.gsny.repository.bg.BgAreaDeviceRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
