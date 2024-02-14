package edu.cpp.couponservice.service;

import edu.cpp.couponservice.model.Coupon;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

@Service
// Update the CouponService class
public class CouponService {
    List<Coupon> couponList = new ArrayList<>();

    // returns a Coupon object from a code
    public Coupon getCoupon(String code) {
        populateCouponList();
        for (Coupon coupon : couponList) {
            if (code.equals(coupon.getCode())) {
                return coupon;
            }
        }
        return null;
    }

    private void populateCouponList() {
        couponList.add(new Coupon(1, "newcustomer", 0.1,
                new GregorianCalendar(2024, 0, 1), new GregorianCalendar(2024, 11, 31)));
        couponList.add(new Coupon(2, "thanks20", 0.2,
                new GregorianCalendar(2024, 2, 1), new GregorianCalendar(2024, 3, 30)));
    }
}


