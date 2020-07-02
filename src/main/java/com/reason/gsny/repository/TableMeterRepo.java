package com.reason.gsny.repository;

import com.reason.gsny.entity.TableMeterEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author leon
 */
@Repository
public interface TableMeterRepo extends JpaRepository<TableMeterEntity,Long> {
    Page<TableMeterEntity> findAllByImeiId(Pageable pageable,Long imei_id);

    TableMeterEntity findByMeterIDid(Long id);
}
