package com.reason.gsny.repository.bg;

import com.reason.gsny.entity.bg.TableGprsHeartRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableGprsHeartRecordRepo extends JpaRepository<TableGprsHeartRecord,Long> {
}
