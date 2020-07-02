package com.reason.gsny.service.bg;

import com.reason.gsny.entity.dto.AreaWaterUsage;
import com.reason.gsny.repository.bg.BgAreaPaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author leon
 */
@Service
public class BgAreaPaymentService {
    @Autowired
    private BgAreaPaymentRepo bgAreaPaymentRepo;
    public List<AreaWaterUsage> findPaymentByDate()
    {

        List<AreaWaterUsage> lists=  bgAreaPaymentRepo.findPaymentByDate();
        return lists;
    }
}
