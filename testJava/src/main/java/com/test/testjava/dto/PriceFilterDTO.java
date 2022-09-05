package com.test.testjava.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PriceFilterDTO implements Serializable {

    private static final long serialVersionUID = -4684476423904039991L;

    @NotNull
    private Integer productId;
    @NotNull
    private Short brandId;
    private LocalDateTime date;
}
