package edu.cpp.couponservice.controller;

import edu.cpp.couponservice.model.Coupon;
import edu.cpp.couponservice.service.CouponService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouponController {
    private CouponService couponService;

    public CouponController(CouponService cs){
        this.couponService = cs;
    }

    @GetMapping("/coupon/{code}")
    public Coupon getCoupon(@PathVariable String code) {
        Coupon coupon = couponService.getCoupon(code);
        return coupon;
    }
}
