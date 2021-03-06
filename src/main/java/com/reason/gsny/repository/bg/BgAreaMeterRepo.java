package com.reason.gsny.repository.bg;

import com.reason.gsny.entity.bg.BgAreaMeter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 查询阀控器在线的情况
 * @author leon
 */
@Repository
public interface BgAreaMeterRepo extends JpaRepository<BgAreaMeter,Long> {

//    /**
//     * 查询区域阀控器在线情况
//     * @return
//     */
//    @Query(value = "SELECT count(am.meter_guid),am.area_name,am.area_guid from BgAreaMeter am group by am.area_name,am.area_guid")
//    List<Object[]> findOnlineMeter();
}
