package com.test.testjava.db.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "prices")
public class PriceEntity {

    @Id
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT")
    private BigInteger id;
    @Column(name = "brand_id", nullable = false)
    private Short brandId;
    @Column(name = "product_id", nullable = false)
    private Integer productId;
    @Column(name = "rate_id", nullable = false)
    private Short rateId;
    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;
    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;
    @Column(name = "priority", nullable = false)
    private Short priority;
    @Column(name = "price", nullable = false)
    private BigDecimal price;
    @Column(name = "currency_code", nullable = false)
    private String currencyCode;

    @ManyToOne
    @JoinColumn(name = "brand_id", insertable = false, updatable = false)
    private BrandEntity brand;
}
