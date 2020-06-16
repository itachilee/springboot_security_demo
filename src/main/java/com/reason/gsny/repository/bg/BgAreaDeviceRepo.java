package com.reason.gsny.repository.bg;

import com.reason.gsny.entity.bg.BgAreaDevice;
import com.reason.gsny.entity.dto.AreaDeviceGroup;
import com.reason.gsny.entity.dto.AreaUserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BgAreaDeviceRepo extends JpaRepository<BgAreaDevice,Long> {
    /**
     * 获取按照区域分组获取的用户数据
     * @return
     */
    @Query("SELECT new com.reason.gsny.entity.dto.AreaDeviceGroup(count(au),au.device_type,au.device) from BgAreaDevice au group by au.device_type,au.device")
    List<AreaDeviceGroup> findDeviceGroupByArea();
}
