package com.reason.gsny.repository;

import com.reason.gsny.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author leon
 */
public interface TestRepo  extends JpaRepository<Test,Long> {
}
