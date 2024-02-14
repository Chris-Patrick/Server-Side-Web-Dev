package edu.cpp.couponservice.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.GregorianCalendar;


@Data
@NoArgsConstructor
@AllArgsConstructor


public class Coupon {
    private int couponId;
    private String code;
    private double discount;
    private GregorianCalendar effectiveFrom;
    private GregorianCalendar effectiveTo;
}
