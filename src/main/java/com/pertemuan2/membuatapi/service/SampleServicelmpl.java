package com.pertemuan2.membuatapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pertemuan2.membuatapi.dto.SampleDto;
import com.pertemuan2.membuatapi.dto.SampleRequestDto;
import com.pertemuan2.membuatapi.models.Sample;
import com.pertemuan2.membuatapi.repository.SampleRepository;

@Service
public class SampleServicelmpl implements SampleService {

    @Autowired
    SampleRepository sampleRepository;

    List<Sample> samples = new ArrayList<>();

    @Override
    public String add(SampleDto dto) {
        sampleRepository.save(Sample.builder()
                .name(dto.getName())
                .description(dto.getDescription())
                .type(dto.getType())
                .orderNumber(dto.getOrderNumber())
                .build());
        return "successfully add data ";
    }

    @Override
    public String remove(String id) {
        Sample sample = sampleRepository.getReferenceById(id);
        if (sample != null) {
            sampleRepository.delete(sample);
            return "successfully remove sample from list";
        } else {
            return "id not found";
        }
    }

    @Override
    public List<SampleDto> view() {
        return sampleRepository.findAllOrderByOrderNumberUsingHql()
                .stream()
                .map(this::toSampleDto)
                .collect(Collectors.toList());
    }

    public SampleDto toSampleDto(Sample sample) {
        return SampleDto.builder()
                .id(sample.getId())
                .name(sample.getName())
                .description(sample.getDescription())
                .type(sample.getType())
                .orderNumber(sample.getOrderNumber())
                .build();
    }

    @Override
    public String update(String id, SampleRequestDto dto) {
        Sample sample = sampleRepository.getReferenceById(id);
        if (sample != null) {
            sample.setName(dto.getName());
            sample.setDescription(dto.getDescription());
            sample.setType(dto.getType());
            sample.setOrderNumber(dto.getOrderNumber());
            sampleRepository.save(sample);
            return "SuccesFully update sample from list";
        } else {
            return "Id not found";
        }
    }
}
