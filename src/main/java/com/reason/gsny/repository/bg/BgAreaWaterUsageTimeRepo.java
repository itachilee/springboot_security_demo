package com.reason.gsny.repository.bg;

import com.reason.gsny.entity.bg.BgAreaWaterUsageTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author leon
 */
@Repository
public interface BgAreaWaterUsageTimeRepo extends JpaRepository<BgAreaWaterUsageTime,Long> {
}
