package com.assement.entities;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Prices
{
    @Id
    private int id;
    private int branchId;
    private int productId;
    private int priority;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private double price;
    private String curr;
}
