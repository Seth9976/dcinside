package com.google.common.math;

import J1.c;
import J1.d;
import java.math.BigDecimal;
import java.math.RoundingMode;

@c
@d
@e
public class a {
    static class com.google.common.math.a.a extends p {
        static final com.google.common.math.a.a a;

        static {
            com.google.common.math.a.a.a = new com.google.common.math.a.a();
        }

        @Override  // com.google.common.math.p
        Number a(Number number0, Number number1) {
            return this.f(((BigDecimal)number0), ((BigDecimal)number1));
        }

        @Override  // com.google.common.math.p
        double c(Number number0) {
            return this.g(((BigDecimal)number0));
        }

        @Override  // com.google.common.math.p
        int d(Number number0) {
            return this.h(((BigDecimal)number0));
        }

        @Override  // com.google.common.math.p
        Number e(double f, RoundingMode roundingMode0) {
            return this.i(f, roundingMode0);
        }

        BigDecimal f(BigDecimal bigDecimal0, BigDecimal bigDecimal1) {
            return bigDecimal0.subtract(bigDecimal1);
        }

        double g(BigDecimal bigDecimal0) {
            return bigDecimal0.doubleValue();
        }

        int h(BigDecimal bigDecimal0) {
            return bigDecimal0.signum();
        }

        BigDecimal i(double f, RoundingMode roundingMode0) {
            return new BigDecimal(f);
        }
    }

    public static double a(BigDecimal bigDecimal0, RoundingMode roundingMode0) {
        return com.google.common.math.a.a.a.b(bigDecimal0, roundingMode0);
    }
}

