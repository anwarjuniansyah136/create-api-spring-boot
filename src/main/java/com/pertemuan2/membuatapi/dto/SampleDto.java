package com.pertemuan2.membuatapi.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@Data
public class SampleDto {
    String id;
    String name;
    String description;
    String type;
    Integer orderNumber;
}
