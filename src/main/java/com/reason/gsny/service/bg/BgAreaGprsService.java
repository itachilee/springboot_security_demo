package com.reason.gsny.service.bg;

import com.reason.gsny.repository.TableGprsRepo;
import com.reason.gsny.repository.bg.BgAreaGprsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author leon
 */
@Service
public class BgAreaGprsService {
    @Autowired
    private BgAreaGprsRepo bgAreaGprsRepo;

    @Autowired
    private TableGprsRepo tableGprsRepo;


}
