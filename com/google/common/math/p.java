package com.google.common.math;

import J1.c;
import J1.d;
import com.google.common.base.H;
import java.math.RoundingMode;

@c
@d
@e
abstract class p {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[RoundingMode.values().length];
            a.a = arr_v;
            try {
                arr_v[RoundingMode.DOWN.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.HALF_EVEN.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.HALF_DOWN.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.HALF_UP.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.FLOOR.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.CEILING.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.UP.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RoundingMode.UNNECESSARY.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    abstract Number a(Number arg1, Number arg2);

    final double b(Number number0, RoundingMode roundingMode0) {
        Number number2;
        double f1;
        H.F(number0, "x");
        H.F(roundingMode0, "mode");
        double f = this.c(number0);
        if(Double.isInfinite(f)) {
            switch(a.a[roundingMode0.ordinal()]) {
                case 1: 
                case 2: 
                case 3: 
                case 4: {
                    return ((double)this.d(number0)) * 1.797693E+308;
                }
                case 5: {
                    return f == Infinity ? 1.797693E+308 : -Infinity;
                }
                case 6: {
                    return f == Infinity ? Infinity : -1.797693E+308;
                }
                case 7: {
                    return f;
                }
                case 8: {
                    throw new ArithmeticException(number0 + " cannot be represented precisely as a double");
                }
            }
        }
        Number number1 = this.e(f, RoundingMode.UNNECESSARY);
        int v = ((Comparable)number0).compareTo(number1);
        int[] arr_v = a.a;
        switch(arr_v[roundingMode0.ordinal()]) {
            case 1: {
                if(this.d(number0) >= 0) {
                    return v >= 0 ? f : com.google.common.math.d.f(f);
                }
                return v <= 0 ? f : Math.nextUp(f);
            }
            case 2: 
            case 3: 
            case 4: {
                if(v >= 0) {
                    f1 = Math.nextUp(f);
                    if(f1 == Infinity) {
                        return f;
                    }
                    number2 = this.e(f1, RoundingMode.CEILING);
                }
                else {
                    double f2 = com.google.common.math.d.f(f);
                    if(f2 == -Infinity) {
                        return f;
                    }
                    number2 = number1;
                    number1 = this.e(f2, RoundingMode.FLOOR);
                    f1 = f;
                    f = f2;
                }
                int v1 = ((Comparable)this.a(number0, number1)).compareTo(this.a(number2, number0));
                if(v1 < 0) {
                    return f;
                }
                if(v1 > 0) {
                    return f1;
                }
                switch(arr_v[roundingMode0.ordinal()]) {
                    case 2: {
                        return (Double.doubleToRawLongBits(f) & 1L) == 0L ? f : f1;
                    }
                    case 3: {
                        return this.d(number0) >= 0 ? f : f1;
                    }
                    case 4: {
                        return this.d(number0) < 0 ? f : f1;
                    }
                    default: {
                        throw new AssertionError("impossible");
                    }
                }
            }
            case 5: {
                return v >= 0 ? f : com.google.common.math.d.f(f);
            }
            case 6: {
                return v <= 0 ? f : Math.nextUp(f);
            }
            case 7: {
                if(this.d(number0) >= 0) {
                    return v <= 0 ? f : Math.nextUp(f);
                }
                return v >= 0 ? f : com.google.common.math.d.f(f);
            }
            case 8: {
                i.k(v == 0);
                return f;
            }
            default: {
                throw new AssertionError("impossible");
            }
        }
    }

    abstract double c(Number arg1);

    abstract int d(Number arg1);

    abstract Number e(double arg1, RoundingMode arg2);
}

