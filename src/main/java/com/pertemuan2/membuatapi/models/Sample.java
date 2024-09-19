package com.pertemuan2.membuatapi.models;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@Builder
@Table(name = "sample")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sample {
    @Id
    @UuidGenerator
    String id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    @Column(name = "type")
    String type;

    @Column(name = "order_number")
    Integer orderNumber;
}
