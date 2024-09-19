package com.pertemuan2.membuatapi.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Data
public class SampleRequestDto {
    String name;
    String description;
    String type;
    Integer orderNumber;
}
