package com.reason.gsny.repository.bg;

import com.reason.gsny.entity.bg.BgAreaWaterUsage;
import com.reason.gsny.entity.dto.AreaWaterUsage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 获取区域内用水量及充值金额
 * @author leon
 */
@Repository
public interface BgAreaWaterUsageRepo extends JpaRepository<BgAreaWaterUsage,Long> {

    /**
     * extract(Year from au.created_at) 相当于sqlserver DATEPART(Year, created_at)
     * 获取按照区域分组获取的用户数据
     * 原生sql 如下：
     * SELECT DATEPART(Year, created_at) Year, DATEPART(Month, created_at) Month, sum(cost_amount) [cost_amount],sum(area_water_usage) [water_usage]
     * FROM bg_area_water_usage
     * GROUP BY DATEPART(Year, created_at), DATEPART(Month, created_at)
     * ORDER BY Year, Month
     * 注意： 接收实体字段类型需要与源数据字体相对统一
     * @return List<AreaWaterUsage>
     */
    @Query(value = "SELECT new com.reason.gsny.entity.dto.AreaWaterUsage(extract(Year from au.created_at),extract(Month from au.created_at),sum(au.area_water_usage),sum(au.cost_amount)) " +
            "from BgAreaWaterUsage au  group by extract(Year from au.created_at),extract(Month from au.created_at) order by extract(Year from au.created_at),extract(Month from au.created_at)")
    List<AreaWaterUsage> findWaterAndCostByDate();
}
