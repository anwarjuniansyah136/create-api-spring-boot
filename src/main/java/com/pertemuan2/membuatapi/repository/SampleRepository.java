package com.pertemuan2.membuatapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pertemuan2.membuatapi.models.Sample;

public interface SampleRepository extends JpaRepository<Sample, String> {
    @Query(value = "select * from sample order by order_number asc", nativeQuery = true)
    List<Sample> findAllOrderByOrderNumber();

    @Query("select s from Sample order by s.order_number asc")
    List<Sample> findAllOrderByOrderNumberUsingHql();
}
