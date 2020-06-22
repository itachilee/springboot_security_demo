package com.reason.gsny.repository.bg;

import com.reason.gsny.entity.bg.BgWaterWasted;
import com.reason.gsny.entity.dto.AreaWaterWasted;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 已开阀放水
 * @author leon
 */
@Repository
public interface BgWaterWastedRepo extends JpaRepository<BgWaterWasted,Long> {
    /**
     * 获取到区域当前用水量与区域内总购水量
     * @return
     */
    @Query(value = "select new com.reason.gsny.entity.dto.AreaWaterWasted(sum(ww.used_water),sum(ww.cost_amount),ww.area_guid,ww.area_name) " +
            " from BgWaterWasted ww where extract(Year from ww.created_at) = extract(Year from CURRENT_TIMESTAMP)" +
            " group by ww.area_guid,ww.area_name")
    List<AreaWaterWasted> findBgWaterWastedByArea();
}
