package com.reason.gsny.repository;

import com.reason.gsny.entity.TableWaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 水表信息Repo层
 * @author leon
 *
 */
@Repository
public interface TableWaterRepo extends JpaRepository<TableWaterEntity,Long> {
}
