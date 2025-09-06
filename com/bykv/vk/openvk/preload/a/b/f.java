package com.bykv.vk.openvk.preload.a.b;

import java.math.BigDecimal;

public final class f extends Number {
    private final String a;

    public f(String s) {
        this.a = s;
    }

    @Override
    public final double doubleValue() {
        return Double.parseDouble(this.a);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof f) {
            String s = ((f)object0).a;
            return this.a == s || this.a.equals(s);
        }
        return false;
    }

    @Override
    public final float floatValue() {
        return Float.parseFloat(this.a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final int intValue() {
        try {
            return Integer.parseInt(this.a);
        }
        catch(NumberFormatException unused_ex) {
            try {
                return (int)Long.parseLong(this.a);
            }
            catch(NumberFormatException unused_ex) {
                return new BigDecimal(this.a).intValue();
            }
        }
    }

    @Override
    public final long longValue() {
        try {
            return Long.parseLong(this.a);
        }
        catch(NumberFormatException unused_ex) {
            return new BigDecimal(this.a).longValue();
        }
    }

    @Override
    public final String toString() {
        return this.a;
    }
}

