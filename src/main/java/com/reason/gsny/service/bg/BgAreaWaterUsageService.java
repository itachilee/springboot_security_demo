package com.reason.gsny.service.bg;

import com.reason.gsny.entity.bg.BgAreaWaterUsage;
import com.reason.gsny.entity.dto.AreaWaterUsage;
import com.reason.gsny.entity.dto.AreaWaterUsage2;
import com.reason.gsny.entity.dto.AreaWaterUsage3;
import com.reason.gsny.entity.dto.AreaWaterUsage4;
import com.reason.gsny.repository.bg.BgAreaWaterUsageRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon
 */
@Slf4j
@Service
public class BgAreaWaterUsageService {
    @Autowired
    private BgAreaWaterUsageRepo bgAreaWaterUsageRepo;

    /**
     * 获取区域所有按年月分组的信息
     * @return
     */
    public List<AreaWaterUsage> findWaterAndCostByDate()
    {
        List<AreaWaterUsage> lists=  bgAreaWaterUsageRepo.findWaterAndCostByDate();
        return lists;
    }

    /**
     * 获取区域当月用水与充值信息
     * @return
     */
    public List<AreaWaterUsage> findWaterAndCostByThisMonth()
    {
        List<AreaWaterUsage> lists=  bgAreaWaterUsageRepo.findWaterAndCostByThisMonth();
        return lists;
    }

    /**
     * 按区域分组获取到每组的用水量
     * @return
     */
    public List<AreaWaterUsage2> findWaterAndCostByArea()
    {
        List<AreaWaterUsage2> lists=  bgAreaWaterUsageRepo.findWaterAndCostByArea();
        return lists;
    }

    /**
     * 按区域分组获取到每组的用水量並按分月進行分鐘
     * @return
     */
    public Map<String,List<AreaWaterUsage3>> findWaterAndCostByAreaGroupByMonth()
    {
        List<AreaWaterUsage3> lists=  bgAreaWaterUsageRepo.findWaterAndCostByAreaGroupByMonth();
        Map<String,List<AreaWaterUsage3>> stringListMap= new HashMap<>();
        for (AreaWaterUsage3 area: lists) {
            if (stringListMap.containsKey(area.getArea_name())){
                stringListMap.get(area.getArea_name()).add(area);
            }else {
                List<AreaWaterUsage3> areaWaterUsage3List=  new ArrayList<>();
                areaWaterUsage3List.add(area);
                stringListMap.put(area.getArea_name(),areaWaterUsage3List);
            }
        }
        return stringListMap;
    }

    /**
     * 获取每天平均的用水量
     * @return
     */
    public List<AreaWaterUsage> findWaterAndCostByDay()
    {
        List<AreaWaterUsage> lists=  bgAreaWaterUsageRepo.findWaterAndCostByDay();
        return lists;
    }

    /**
     * 获取每月平均的用水量
     * @return
     */
    public List<AreaWaterUsage> findWaterAndCostByMonth()
    {
        List<AreaWaterUsage> lists=  bgAreaWaterUsageRepo.findWaterAndCostByMonth();
        return lists;
    }


    /**
     * 获取一天中每小时平均的用水量
     * @return
     */
    public Map<String,List<AreaWaterUsage3>> findWaterAndCostByHour()
    {
        List<AreaWaterUsage3> lists=  bgAreaWaterUsageRepo.findWaterAndCostByHour();
        Map<String,List<AreaWaterUsage3>> stringListMap= new HashMap<>();
        for (AreaWaterUsage3 area: lists) {
            if (stringListMap.containsKey(area.getArea_name())){
                stringListMap.get(area.getArea_name()).add(area);
            }else {
                List<AreaWaterUsage3> areaWaterUsage3List=  new ArrayList<>();
                areaWaterUsage3List.add(area);
                stringListMap.put(area.getArea_name(),areaWaterUsage3List);
            }
        }

        return stringListMap;
    }

    /**
     * 获取所有的用水量与充值金额
     * @return
     */
    public List<BgAreaWaterUsage> findAll(){

        return bgAreaWaterUsageRepo.findAll();
    }

    /**
     * 查询所有的总用水量与总充值量
     * @return
     */
    public List<AreaWaterUsage4> findWaterAndCostForLossRate(){
        return bgAreaWaterUsageRepo.findWaterAndCostForLossRate();
    }

    /**
     * 查询每个月的总用水量与总充值量
     * @return
     */
    public  List<AreaWaterUsage4> findWaterAndCostForLossRateGroupByMonth(){

        List<AreaWaterUsage4> list= bgAreaWaterUsageRepo.findWaterAndCostForLossRateGroupByMonth();
        for (int i=0;i<list.size();i++){
            double loss =list.get(i).getWater_usage()- list.get(i).getCost_amount();
            list.get(i).setLoss(loss);
        }
        return list;
    }


    /**
     * 查询本月的总用水量与总充值量
     * @return
     */
    public List<AreaWaterUsage4> findWaterAndCostForLossRateByMonth(){
        return bgAreaWaterUsageRepo.findWaterAndCostForLossRateByMonth();
    }
    public List<AreaWaterUsage4> findWaterAndCostForLossRateByYear(){
        return bgAreaWaterUsageRepo.findWaterAndCostForLossRateByYear();
    }


}
