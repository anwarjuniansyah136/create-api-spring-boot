package com.pertemuan2.membuatapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pertemuan2.membuatapi.dto.SampleDto;
import com.pertemuan2.membuatapi.dto.SampleRequestDto;
import com.pertemuan2.membuatapi.service.SampleService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @Autowired
    SampleService sampleService;

    @PostMapping("/add")
    public String add(@RequestBody SampleDto dto) {
        return sampleService.add(dto);
    }

    @DeleteMapping("/remove")
    public String remove(@RequestParam String id) {
        return sampleService.remove(id);
    }

    @PutMapping("/update")
    public String update(
            @RequestParam String id,
            @RequestBody SampleRequestDto dto) {
        return sampleService.update(id, dto);
    }

    @GetMapping("/view")
    public List<SampleDto> view() {
        return sampleService.view();
    }
}
