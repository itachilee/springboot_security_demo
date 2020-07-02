package com.reason.gsny.repository;

import com.reason.gsny.entity.TableCollectorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author leon
 */
@Repository
public interface TableCollectorRepo extends JpaRepository<TableCollectorEntity,Long> {
}
