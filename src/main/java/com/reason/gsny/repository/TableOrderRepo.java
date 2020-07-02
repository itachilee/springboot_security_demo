package com.reason.gsny.repository;

import com.reason.gsny.entity.TableToConcentratorEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author leon
 */
@Repository
public interface TableOrderRepo extends JpaRepository<TableToConcentratorEntity,Long> {
    Page<TableToConcentratorEntity> findAllByIsOverIsLessThan(Pageable pageable,int is_over);
    Page<TableToConcentratorEntity> findAllByIsOverEquals(Pageable pageable,int is_over);
    TableToConcentratorEntity findBySendId(Long sendId);
}
