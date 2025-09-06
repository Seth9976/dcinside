package org.bson.types;

import java.io.Serializable;
import java.util.Arrays;
import org.bson.q;

public class c implements Serializable {
    private final byte a;
    private final byte[] b;
    private static final long c = 7902997490338209467L;

    public c(byte b, byte[] arr_b) {
        this.a = b;
        this.b = (byte[])arr_b.clone();
    }

    public c(q q0, byte[] arr_b) {
        this(q0.a(), arr_b);
    }

    public c(byte[] arr_b) {
        this(q.b, arr_b);
    }

    public byte[] a() {
        return (byte[])this.b.clone();
    }

    public byte b() {
        return this.a;
    }

    public int c() {
        return this.b.length;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 != null && this.getClass() == object0.getClass() && this.a == ((c)object0).a ? Arrays.equals(this.b, ((c)object0).b) : false;
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.b);
        return this.a * 0x1F + v;
    }
}

