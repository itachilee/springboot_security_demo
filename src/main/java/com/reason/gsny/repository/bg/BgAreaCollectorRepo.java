package com.reason.gsny.repository.bg;

import com.reason.gsny.entity.bg.BgAreaCollector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author leon
 */
@Repository
public interface BgAreaCollectorRepo extends JpaRepository<BgAreaCollector,Long> {
}
