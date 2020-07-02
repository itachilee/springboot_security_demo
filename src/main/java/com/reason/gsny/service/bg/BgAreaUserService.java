package com.reason.gsny.service.bg;

import com.reason.gsny.entity.bg.BgAreaDevice;
import com.reason.gsny.entity.bg.BgAreaUser;
import com.reason.gsny.entity.dto.AreaUserGroup;
import com.reason.gsny.repository.bg.BgAreaDeviceRepo;
import com.reason.gsny.repository.bg.BgAreaUserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BgAreaUserService {
    @Autowired
    private BgAreaUserRepo bgAreaUserRepo;
    public Iterable<BgAreaUser> findAll(Pageable pageable){
        return bgAreaUserRepo.findAll(pageable);
    }

    /**
     * 获取到按区域分组的用户信息
     * @return
     */
    public List<AreaUserGroup> findUserGroupByArea(){
        return bgAreaUserRepo.findUserGroupByArea();
    }

    public long findAllUserCount() {
        return bgAreaUserRepo.count();
    }
}
