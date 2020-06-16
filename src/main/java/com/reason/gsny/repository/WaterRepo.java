package com.reason.gsny.repository;

import com.reason.gsny.entity.TableWaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaterRepo extends JpaRepository<TableWaterEntity,Long> {
    /**
     * 获取阀控器下的水表
     * @param meter_id
     * @return
     */
    TableWaterEntity findByMeterIDid(long meter_id);
}
