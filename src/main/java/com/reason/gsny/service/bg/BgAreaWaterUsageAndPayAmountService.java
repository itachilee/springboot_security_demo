package com.reason.gsny.service.bg;

import com.reason.gsny.entity.bg.BgAreaWaterUsageAndPayAmount;
import com.reason.gsny.repository.bg.BgAreaWaterUsageAndPayAmountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author leon
 */
@Service
public class BgAreaWaterUsageAndPayAmountService {
    @Autowired
    BgAreaWaterUsageAndPayAmountRepo bgAreaWaterUsageAndPayAmountRepo;


    public List<BgAreaWaterUsageAndPayAmount> findAll() {
        return bgAreaWaterUsageAndPayAmountRepo.findAll();
    }
}
