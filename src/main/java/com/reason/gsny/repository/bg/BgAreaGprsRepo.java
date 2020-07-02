package com.reason.gsny.repository.bg;

import com.reason.gsny.entity.bg.BgAreaGprs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author leon
 */
@Repository
public interface BgAreaGprsRepo extends JpaRepository<BgAreaGprs,Long> {
}
