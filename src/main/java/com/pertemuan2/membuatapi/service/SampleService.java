package com.pertemuan2.membuatapi.service;

import java.util.List;

import com.pertemuan2.membuatapi.dto.SampleDto;
import com.pertemuan2.membuatapi.dto.SampleRequestDto;

public interface SampleService {
    String add(SampleDto dto);

    String remove(String id);

    List<SampleDto> view();

    String update(String id, SampleRequestDto dto);
}
