package com.reason.gsny.repository.bg;

import com.reason.gsny.entity.bg.BgAreaPayment;
import com.reason.gsny.entity.dto.AreaWaterUsage;
import com.reason.gsny.entity.dto.AreaWaterUsage4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author leon
 */
@Repository
public interface BgAreaPaymentRepo extends JpaRepository<BgAreaPayment,Long> {

    /**
     * 获取到所有充值的金额
     * @return
     */
    @Query(value = "select sum(ap.pay_amount) from BgAreaPayment ap")
    double findAllPayment();


    @Query(value = "SELECT new com.reason.gsny.entity.dto.AreaWaterUsage(extract(Year from au.created_at),extract(Month from au.created_at),sum(au.pay_amount),0.00) " +
            "from BgAreaPayment au  group by extract(Year from au.created_at),extract(Month from au.created_at) order by extract(Year from au.created_at),extract(Month from au.created_at)")
    List<AreaWaterUsage> findPaymentByDate();



    @Query(value = "SELECT new com.reason.gsny.entity.dto.AreaWaterUsage4(sum(au.pay_amount),0.00) from BgAreaPayment au" +
            " where extract(Month from au.created_at)=extract(Month from CURRENT_TIMESTAMP) and" +
            " extract(Year from au.created_at) =extract(Year from CURRENT_TIMESTAMP)")
    AreaWaterUsage4 findPaymentThisMonth();


    @Query(value = "SELECT new com.reason.gsny.entity.dto.AreaWaterUsage4(sum(au.pay_amount),0.00) from BgAreaPayment au" +
            " where extract(Year from au.created_at) =extract(Year from CURRENT_TIMESTAMP)")
    AreaWaterUsage4 findPaymentThisYear();



}
