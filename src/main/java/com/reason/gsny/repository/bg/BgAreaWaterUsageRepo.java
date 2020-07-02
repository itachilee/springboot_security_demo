package com.reason.gsny.repository.bg;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.reason.gsny.entity.bg.BgAreaWaterUsage;
import com.reason.gsny.entity.dto.AreaWaterUsage;
import com.reason.gsny.entity.dto.AreaWaterUsage2;
import com.reason.gsny.entity.dto.AreaWaterUsage3;
import com.reason.gsny.entity.dto.AreaWaterUsage4;
import com.reason.gsny.util.DoubleSerialize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 获取区域内用水量及充值金额
 *
 * @author leon
 */
@Repository
public interface BgAreaWaterUsageRepo extends JpaRepository<BgAreaWaterUsage, Long> {

    /**
     * extract(Year from au.created_at) 相当于sqlserver DATEPART(Year, created_at)
     * 获取按照区域分组获取的用户数据
     * 原生sql 如下：
     * SELECT DATEPART(Year, created_at) Year, DATEPART(Month, created_at) Month, sum(cost_amount) [cost_amount],sum(area_water_usage) [water_usage]
     * FROM bg_area_water_usage
     * GROUP BY DATEPART(Year, created_at), DATEPART(Month, created_at)
     * ORDER BY Year, Month
     * 注意： 接收实体字段类型需要与源数据字体相对统一
     *
     * @return List<AreaWaterUsage>
     */
    @Query(value = "SELECT new com.reason.gsny.entity.dto.AreaWaterUsage(extract(Year from au.created_at),extract(Month from au.created_at),sum(au.area_water_usage),sum(au.cost_amount)) " +
            "from BgAreaWaterUsage au  group by extract(Year from au.created_at),extract(Month from au.created_at) order by extract(Year from au.created_at),extract(Month from au.created_at)")
    List<AreaWaterUsage> findWaterUsageByDate();


    /**
     * 获取当年当月的用水量与用户缴费金额
     * CURRENT_TIMESTAMP: jpa中用于获取系统时间的参数
     * CURRENT_TIMESTAMP must be used to refere to the current date and time in a JPQL query
     *
     * @return
     */
    @Query(value =
            "SELECT new com.reason.gsny.entity.dto.AreaWaterUsage(extract(Month from au.created_at)," +
                    "extract(Year from au.created_at),sum(au.area_water_usage),sum(au.cost_amount)) " +
                    " from BgAreaWaterUsage au " +
                    " where extract(Month from au.created_at) =extract(Month from CURRENT_TIMESTAMP)  " +
                    " and extract(Year from au.created_at ) = extract(Year from CURRENT_TIMESTAMP)" +
                    " group by extract(Month from au.created_at) ,extract(Year from au.created_at)" +
                    " order by extract(Month from au.created_at) ")
    List<AreaWaterUsage> findWaterAndCostByThisMonth();


    /**
     * 按区域分组获取到每组的用水量
     * SELECT area_guid,area_name,sum(area_water_usage) area_water_usage
     * from  bg_area_water_usage group by area_guid,area_name
     *
     * @return
     */
    @Query(value = "SELECT new com.reason.gsny.entity.dto.AreaWaterUsage2(au.area_guid,au.area_name,sum(au.area_water_usage),sum(au.cost_amount))" +
            " from BgAreaWaterUsage  au group by au.area_guid,au.area_name")
    List<AreaWaterUsage2> findWaterAndCostByArea();

    /**
     * 按区域分组获取到每组的用水量並按照月份分組
     * SELECT area_guid,area_name,sum(area_water_usage) area_water_usage
     * from  bg_area_water_usage group by area_guid,area_name
     *
     * @return
     */
    @Query(value = "SELECT new com.reason.gsny.entity.dto.AreaWaterUsage3(extract(Month from au.created_at),sum(au.area_water_usage),sum(au.cost_amount),au.area_guid,au.area_name)" +
            " from BgAreaWaterUsage  au group by au.area_guid,au.area_name,extract(Month from au.created_at) order by extract(Month from au.created_at)")
    List<AreaWaterUsage3> findWaterAndCostByAreaGroupByMonth();

    /**
     * 查询每天的平均用水量
     *
     * @return
     */
    @Query(value = "SELECT new com.reason.gsny.entity.dto.AreaWaterUsage(extract(Day from au.created_at),avg(au.area_water_usage),avg(au.cost_amount))" +
            " from BgAreaWaterUsage  au where extract(Month from au.created_at) =extract(Month from CURRENT_TIMESTAMP)" +
            " and extract(Year from au.created_at) = extract(Year from CURRENT_TIMESTAMP) group by extract(Day from au.created_at)")
    List<AreaWaterUsage> findWaterAndCostByDay();


    /**
     * 查询每月的平均用水量
     *
     * @return
     */
    @Query(value = "SELECT new com.reason.gsny.entity.dto.AreaWaterUsage(extract(Month from au.created_at),avg(au.area_water_usage),avg(au.cost_amount))" +
            " from BgAreaWaterUsage  au where extract(Year from au.created_at) = extract(Year from CURRENT_TIMESTAMP) " +
            "group by extract(Month from au.created_at)")
    List<AreaWaterUsage> findWaterAndCostByMonth();


    /**
     * 查询每小数的平均用水量
     *
     * @return
     */
    @Query(value =
            " SELECT new com.reason.gsny.entity.dto.AreaWaterUsage3(extract(Hour from au.created_at),avg(au.area_water_usage),avg(au.cost_amount),au.area_guid,au.area_name)" +
                    " from BgAreaWaterUsage  au where extract(Month from au.created_at) =extract(Month from CURRENT_TIMESTAMP)" +
                    " and extract(Year from au.created_at) = extract(Year from CURRENT_TIMESTAMP) " +
                    " and extract(Day from au.created_at) = extract(Day from CURRENT_TIMESTAMP) " +
                    " group by extract(Hour from au.created_at),au.area_guid,au.area_name order by extract(Hour from au.created_at)")
    List<AreaWaterUsage3> findWaterAndCostByHour();


//    /**
//     * 查询本月的总用水量与总充值量
//     *
//     * @return
//     */
//    @Query(value = "SELECT new com.reason.gsny.entity.dto.AreaWaterUsage4(sum(au.cost_amount),sum(au.area_water_usage)) from BgAreaWaterUsage au where extract(Month from au.created_at)=extract(Month from CURRENT_TIMESTAMP)")
//    List<AreaWaterUsage4> findWaterAndCostForLossRateByMonth();

    /**
     * 查询本月的总用水量
     * @return
     */
    @Query(value = "SELECT new com.reason.gsny.entity.dto.AreaWaterUsage4(0.00,sum(au.area_water_usage)) from BgAreaWaterUsage au" +
            " where extract(Month from au.created_at)=extract(Month from CURRENT_TIMESTAMP) and" +
            " extract(Year from au.created_at) =extract(Year from CURRENT_TIMESTAMP)")
    AreaWaterUsage4 findWaterUsageThisMonth();
    /**
     * 本年损耗量
     *
     * @return AreaWaterUsage4
     */
    @Query(value = "SELECT new com.reason.gsny.entity.dto.AreaWaterUsage4(0.00,sum(au.area_water_usage))" +
            " from BgAreaWaterUsage au where extract(Year from au.created_at)=extract(Year from CURRENT_TIMESTAMP)")
    AreaWaterUsage4 findWaterUsageThisYear();




    /**
     * 查询所有的总用水量与总充值量
     * @return
     */
    @Query(value = "SELECT new com.reason.gsny.entity.dto.AreaWaterUsage4(sum(au.cost_amount),sum(au.area_water_usage)) from BgAreaWaterUsage au ")
    List<AreaWaterUsage4> findWaterAndCostForLossRate();


    /**
     * 获取一年中每个月的用水量与总充值量
     *
     * @return
     */
    @Query(value = "SELECT new com.reason.gsny.entity.dto.AreaWaterUsage4(extract(Month from au.created_at),sum(au.cost_amount),sum(au.area_water_usage)) from " +
            "BgAreaWaterUsage au  where extract(Year from au.created_at ) =extract(Year from CURRENT_TIMESTAMP) group by extract(Month from au.created_at) ")
    List<AreaWaterUsage4> findWaterAndCostForLossRateGroupByMonth();


    /**
     * 获取到所有的用水量数据
     *
     * @return double
     */
    @Query(value = "select sum(au.area_water_usage) from BgAreaWaterUsage au")
    double findAllWaterUsage();
}
