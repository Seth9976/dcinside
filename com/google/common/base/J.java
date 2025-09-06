package com.google.common.base;

import J1.c;
import J1.d;
import o3.a;

@c
@d
@k
public final class j {
    private static final Double a;
    private static final Float b;

    static {
        j.a = 0.0;
        j.b = 0.0f;
    }

    @a
    public static Object a(Class class0) {
        H.E(class0);
        if(class0.isPrimitive()) {
            if(class0 == Boolean.TYPE) {
                return false;
            }
            if(class0 == Character.TYPE) {
                return Character.valueOf('\u0000');
            }
            if(class0 == Byte.TYPE) {
                return (byte)0;
            }
            if(class0 == Short.TYPE) {
                return (short)0;
            }
            if(class0 == Integer.TYPE) {
                return 0;
            }
            if(class0 == Long.TYPE) {
                return 0L;
            }
            if(class0 == Float.TYPE) {
                return j.b;
            }
            if(class0 == Double.TYPE) {
                return j.a;
            }
        }
        return null;
    }
}

