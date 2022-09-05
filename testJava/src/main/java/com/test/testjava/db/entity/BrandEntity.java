package com.test.testjava.db.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "brands")
public class BrandEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Short id;
    @Column(name = "code", nullable = false)
    private String code;

    @ToString.Exclude
    @OneToMany(mappedBy = "brand")
    @JsonIgnore
    private List<PriceEntity> prices;
}
