package com.reason.gsny.service;

import com.reason.gsny.entity.TableGprsEntity;
import com.reason.gsny.repository.GprsRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class GprsService {
    @Autowired
    private GprsRepo gprsRepo;



    public Iterable<TableGprsEntity> findAll(Pageable pageable){
        return gprsRepo.findAll(pageable);
    }


    public Iterable<TableGprsEntity> findAllByStatus(Pageable pageable,String status){
        return gprsRepo.findAllByStatus(pageable,status);
    }


    public  TableGprsEntity findByImei(long id){
        return gprsRepo.findByImei(id);
    }

    /**
     * 为空的字段不进行更新
     * @param id
     * @param tableGprsEntity
     * @return
     */
    public void update(long id, TableGprsEntity tableGprsEntity){

//        return gprsRepo.save(tableGprsEntity);
//
//
//        TableGprsEntity existing = gprsRepo.findByImeiid(id);
//            copyNonNullProperties(tableGprsEntity, existing);
        gprsRepo.save(tableGprsEntity);

    }

//    public static void copyNonNullProperties(Object src, Object target) {
//        BeanUtils.copyProperties(src, target, getNullPropertyNames(src));
//    }
//
//    public static String[] getNullPropertyNames (Object source) {
//        final BeanWrapper src = new BeanWrapperImpl(source);
//        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();
//
//        Set<String> emptyNames = new HashSet<String>();
//        for(java.beans.PropertyDescriptor pd : pds) {
//            Object srcValue = src.getPropertyValue(pd.getName());
//            if (srcValue == null) emptyNames.add(pd.getName());
//        }
//        String[] result = new String[emptyNames.size()];
//        return emptyNames.toArray(result);
//    }
}
