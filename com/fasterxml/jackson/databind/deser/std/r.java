package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class r {
    private static final HashSet a;

    static {
        r.a = new HashSet();
        Class[] arr_class = {UUID.class, AtomicBoolean.class, AtomicInteger.class, AtomicLong.class, StackTraceElement.class, ByteBuffer.class, Void.class};
        for(int v1 = 0; v1 < 7; ++v1) {
            r.a.add(arr_class[v1].getName());
        }
        Class[] arr_class1 = q.z1();
        for(int v = 0; v < arr_class1.length; ++v) {
            r.a.add(arr_class1[v].getName());
        }
    }

    public static n a(h h0, Class class0, String s) throws o {
        if(r.a.contains(s)) {
            n n0 = q.y1(class0);
            if(n0 != null) {
                return n0;
            }
            if(class0 == UUID.class) {
                return new P();
            }
            if(class0 == StackTraceElement.class) {
                return B.r1(h0);
            }
            if(class0 == AtomicBoolean.class) {
                return new b();
            }
            if(class0 == AtomicInteger.class) {
                return new c();
            }
            if(class0 == AtomicLong.class) {
                return new d();
            }
            if(class0 == ByteBuffer.class) {
                return new com.fasterxml.jackson.databind.deser.std.h();
            }
            if(class0 == Void.class) {
                return w.g;
            }
        }
        return null;
    }

    @Deprecated
    public static n b(Class class0, String s) throws o {
        return r.a(null, class0, s);
    }

    public static boolean c(Class class0) {
        return r.a.contains(class0.getName());
    }
}

