package com.github.regyl.gfi.controller.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataRequestDto {

    @NotNull
    @Max(20)
    private Integer limit;
    @NotNull
    private Integer offset;

    private FilterRequestDto filter;

    private Collection<OrderDto> orders;
}
