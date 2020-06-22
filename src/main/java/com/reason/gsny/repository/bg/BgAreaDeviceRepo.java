package com.reason.gsny.repository.bg;

import com.reason.gsny.entity.bg.BgAreaDevice;
import com.reason.gsny.entity.dto.AreaDeviceGroup;
import com.reason.gsny.entity.dto.AreaDeviceGroup2;
import com.reason.gsny.entity.dto.AreaUserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BgAreaDeviceRepo extends JpaRepository<BgAreaDevice,Long> {
    /**
     * 获取按照区域分组获取的用户数据
     * @return
     */
    @Query("SELECT new com.reason.gsny.entity.dto.AreaDeviceGroup(count(au),au.device_type,au.device) from BgAreaDevice au group by au.device_type,au.device")
    List<AreaDeviceGroup> findDeviceGroupByArea();

    /**
     * 按设备类型按月进行分组查询
     * @param device_type 设备类型
     * @return
     */
    @Query(value = "select new com.reason.gsny.entity.dto.AreaDeviceGroup2(extract(Month from au.created_at),count(device_type),device )" +
            " from BgAreaDevice au where au.device_type =:device_type group by  au.device,extract(Month from au.created_at)")
    List<AreaDeviceGroup2> findDeviceByMonthAndDevice_type(@Param("device_type")long device_type);


    /**
     * 按设备类型按月进行分组查询
     * @return
     */
    @Query(value = "select new com.reason.gsny.entity.dto.AreaDeviceGroup2(extract(Month from au.created_at),count(device_type),device )" +
            " from BgAreaDevice au group by  au.device,extract(Month from au.created_at)")
    List<AreaDeviceGroup2> findDeviceByMonth();
}
