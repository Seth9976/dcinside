package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsonFormatVisitors.b;
import com.fasterxml.jackson.databind.jsonFormatVisitors.d;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.util.f;
import java.io.IOException;
import java.nio.ByteBuffer;

public class g extends L {
    public g() {
        super(ByteBuffer.class);
    }

    public void P(ByteBuffer byteBuffer0, k k0, I i0) throws IOException {
        if(byteBuffer0.hasArray()) {
            int v = byteBuffer0.position();
            k0.R2(byteBuffer0.array(), byteBuffer0.arrayOffset() + v, byteBuffer0.limit() - v);
            return;
        }
        ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
        f f0 = new f(byteBuffer1);
        k0.I2(f0, byteBuffer1.remaining());
        f0.close();
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.L
    public void e(com.fasterxml.jackson.databind.jsonFormatVisitors.g g0, m m0) throws o {
        b b0 = g0.r(m0);
        if(b0 != null) {
            b0.d(d.c);
        }
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, k k0, I i0) throws IOException {
        this.P(((ByteBuffer)object0), k0, i0);
    }
}

