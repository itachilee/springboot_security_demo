package com.reason.gsny.repository.bg;

import com.reason.gsny.entity.bg.BgAreaUser;
import com.reason.gsny.entity.dto.AreaUserGroup;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BgAreaUserRepo extends JpaRepository<BgAreaUser,Long> {
    /**
     * 获取按照区域分组获取的用户数据
     * @return
     */
    @Query("SELECT new com.reason.gsny.entity.dto.AreaUserGroup(count(au),au.area_guid,au.area_name) from BgAreaUser au group by au.area_guid,au.area_name")
    List<AreaUserGroup> findUserGroupByArea();




}
