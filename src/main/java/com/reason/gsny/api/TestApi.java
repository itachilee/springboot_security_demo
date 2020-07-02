package com.reason.gsny.api;

import com.reason.gsny.entity.Test;
import com.reason.gsny.entity.TestDto;
import com.reason.gsny.repository.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon
 */
@RestController
@RequestMapping("/api/v1")
public class TestApi {
    @Autowired
    private TestRepo testRepo;




    @GetMapping("/test/{id}/siblings")
    public ResponseEntity<Set<TestDto>> getAllSiblings(@PathVariable("id") Long id) {
        return testRepo.findById(id).map(findSiblings).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/test/{id}")
    public ResponseEntity<TestDto> getAllDetails(@PathVariable("id") Long id) {
        return testRepo.findById(id).map(mapToTestDTO).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * 获取到兄弟节点
     */
    private Function<Test, Set<TestDto>> findSiblings = person -> person.
            getParent().
            getChildren().
            stream().
            map(p -> TestDto.builder().id(p.getId()).
                    name(p.getName()).
                    created_at(p.getCreated_at()).
                    build()).
                    collect(Collectors.toSet());

    /**
     * 获取父级即子级详细数据
     */
    private Function<Test, TestDto> mapToTestDTO = p -> TestDto.builder().
            id(p.getId()).
            name(p.getName()).
            parent(p.getParent()).
            children(p.getChildren()).
            build();
}
