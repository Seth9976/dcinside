package com.facebook.imagepipeline.memory;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.s;
import com.facebook.common.memory.i;
import com.facebook.common.memory.j;
import com.facebook.common.memory.m;
import com.facebook.common.references.a;
import java.io.IOException;
import java.io.InputStream;
import jeb.synthetic.TWR;
import kotlin.jvm.internal.L;
import p3.d;
import y4.l;

@d
public final class G implements j {
    @l
    private final D a;
    @l
    private final m b;

    public G(@l D d0, @l m m0) {
        L.p(d0, "pool");
        L.p(m0, "pooledByteStreams");
        super();
        this.a = d0;
        this.b = m0;
    }

    @Override  // com.facebook.common.memory.j
    public i a(InputStream inputStream0) {
        return this.i(inputStream0);
    }

    @Override  // com.facebook.common.memory.j
    public com.facebook.common.memory.l b() {
        return this.l();
    }

    @Override  // com.facebook.common.memory.j
    public i c(byte[] arr_b) {
        return this.k(arr_b);
    }

    @Override  // com.facebook.common.memory.j
    public com.facebook.common.memory.l d(int v) {
        return this.m(v);
    }

    @Override  // com.facebook.common.memory.j
    public i e(InputStream inputStream0, int v) {
        return this.j(inputStream0, v);
    }

    @Override  // com.facebook.common.memory.j
    public i f(int v) {
        return this.h(v);
    }

    @VisibleForTesting
    @l
    public final F g(@l InputStream inputStream0, @l H h0) throws IOException {
        L.p(inputStream0, "inputStream");
        L.p(h0, "outputStream");
        this.b.a(inputStream0, h0);
        return h0.e();
    }

    @l
    public F h(int v) {
        F f0;
        if(v <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        a a0 = a.w(this.a.get(v), this.a);
        L.o(a0, "of(...)");
        try {
            f0 = new F(a0, v);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(a0, throwable0);
            throw throwable0;
        }
        a0.close();
        return f0;
    }

    @l
    public F i(@l InputStream inputStream0) throws IOException {
        L.p(inputStream0, "inputStream");
        try(H h0 = new H(this.a, 0, 2, null)) {
            return this.g(inputStream0, h0);
        }
    }

    @l
    public F j(@l InputStream inputStream0, int v) throws IOException {
        L.p(inputStream0, "inputStream");
        try(H h0 = new H(this.a, v)) {
            return this.g(inputStream0, h0);
        }
    }

    @l
    public F k(@l byte[] arr_b) {
        L.p(arr_b, "bytes");
        try(H h0 = new H(this.a, arr_b.length)) {
            try {
                h0.write(arr_b, 0, arr_b.length);
                return h0.e();
            }
            catch(IOException iOException0) {
                throw s.d(iOException0);
            }
        }
    }

    @l
    public H l() {
        return new H(this.a, 0, 2, null);
    }

    @l
    public H m(int v) {
        return new H(this.a, v);
    }
}

