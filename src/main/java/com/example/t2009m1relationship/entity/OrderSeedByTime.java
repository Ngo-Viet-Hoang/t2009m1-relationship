package com.example.t2009m1relationship.entity;

import com.example.t2009m1relationship.entity.enums.OrderSeedByTimeType;
import com.example.t2009m1relationship.entity.enums.OrderSimpleStatus;
import lombok.*;

import java.time.Month;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderSeedByTime {
    private OrderSeedByTimeType seedByTimeType;
    private int year;
    private Month month;
    private int day;
    private int orderCount;
    private OrderSimpleStatus orderStatus;

}
