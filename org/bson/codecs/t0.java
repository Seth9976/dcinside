package org.bson.codecs;

import R3.a;
import java.util.UUID;
import org.bson.P;
import org.bson.a0;
import org.bson.h;
import org.bson.internal.k;
import org.bson.o;
import org.bson.q;
import org.bson.r0;

public class t0 implements N {
    private final r0 a;

    public t0() {
        this.a = r0.d;
    }

    public t0(r0 r00) {
        a.e("uuidRepresentation", r00);
        this.a = r00;
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return UUID.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.i(a00, ((UUID)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.h(p0, t0);
    }

    public UUID h(P p0, T t0) {
        int v = p0.G3();
        if(v != q.e.a() && v != q.f.a()) {
            throw new h("Unexpected BsonBinarySubType");
        }
        return k.a(p0.B0().n0(), ((byte)v), this.a);
    }

    public void i(a0 a00, UUID uUID0, Y y0) {
        r0 r00 = this.a;
        if(r00 == r0.a) {
            throw new org.bson.codecs.configuration.a("The uuidRepresentation has not been specified, so the UUID cannot be encoded.");
        }
        byte[] arr_b = k.b(uUID0, r00);
        if(this.a == r0.b) {
            a00.T0(new o(q.f, arr_b));
            return;
        }
        a00.T0(new o(q.e, arr_b));
    }

    public r0 j() {
        return this.a;
    }

    @Override
    public String toString() {
        return "UuidCodec{uuidRepresentation=" + this.a + '}';
    }
}

