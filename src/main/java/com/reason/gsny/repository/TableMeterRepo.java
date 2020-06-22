package com.reason.gsny.repository;

import com.reason.gsny.entity.TableMeterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author leon
 */
@Repository
public interface TableMeterRepo extends JpaRepository<TableMeterEntity,Long> {

}
