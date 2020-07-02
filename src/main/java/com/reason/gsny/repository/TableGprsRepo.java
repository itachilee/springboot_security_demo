package com.reason.gsny.repository;

import com.reason.gsny.entity.TableGprsEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author leon
 */
@Repository
public interface TableGprsRepo extends JpaRepository<TableGprsEntity, Long> {
    /**
     * 查询所有在线集中器
     *
     * @param status
     * @param pageable
     * @return
     */
    Page<TableGprsEntity> findAllByStatus(Pageable pageable, String status);

    /**
     * 通过集中器主键获取集中器
     *
     * @param imeiId
     * @return
     */
    TableGprsEntity findByImeiid(Long imeiId);

    /**
     * 通过集中器号获取集中器数据
     *
     * @param imei
     * @return
     */
    TableGprsEntity findByImei(Long imei);

    @Query(value = "select count (g) from TableGprsEntity g where g.status='在线'")
    long findOnlineCount();
}
