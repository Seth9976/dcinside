package org.bson;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.bson.codecs.N;
import org.bson.codecs.S;
import org.bson.codecs.T;
import org.bson.codecs.Y;
import org.bson.codecs.o;
import org.bson.codecs.p0;
import org.bson.io.f;
import org.bson.json.E;
import org.bson.json.F;
import org.bson.json.w;

public final class n0 extends y {
    static class a implements Serializable {
        private final byte[] a;
        private static final long b = 1L;

        a(byte[] arr_b, int v, int v1) {
            if(arr_b.length == v1) {
                this.a = arr_b;
                return;
            }
            byte[] arr_b1 = new byte[v1];
            this.a = arr_b1;
            System.arraycopy(arr_b, v, arr_b1, 0, v1);
        }

        private Object a() {
            return new n0(this.a);
        }
    }

    private final byte[] c;
    private final int d;
    private final int e;
    private static final long f = 1L;
    private static final int g = 5;

    public n0(Object object0, N n0) {
        R3.a.e("document", object0);
        R3.a.e("codec", n0);
        org.bson.io.a a0 = new org.bson.io.a();
        try(r r0 = new r(a0)) {
            n0.e(r0, object0, Y.a().b());
            this.c = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            this.d = 0;
            this.e = a0.getPosition();
        }
    }

    public n0(byte[] arr_b) {
        this(((byte[])R3.a.e("bytes", arr_b)), 0, arr_b.length);
    }

    public n0(byte[] arr_b, int v, int v1) {
        R3.a.e("bytes", arr_b);
        boolean z = false;
        R3.a.d("offset >= 0", v >= 0);
        R3.a.d("offset < bytes.length", v < arr_b.length);
        R3.a.d("length <= bytes.length - offset", v1 <= arr_b.length - v);
        if(v1 >= 5) {
            z = true;
        }
        R3.a.d("length >= 5", z);
        this.c = arr_b;
        this.d = v;
        this.e = v1;
    }

    @Override  // org.bson.y
    public String B1() {
        return this.C1(new F());
    }

    @Override  // org.bson.y
    public String C1(F f0) {
        StringWriter stringWriter0 = new StringWriter();
        new p0().h(new E(stringWriter0, f0), this, Y.a().b());
        return stringWriter0.toString();
    }

    private Object D1() {
        return new a(this.c, this.d, this.e);
    }

    private p E1() {
        return new p(new f(this.H1()));
    }

    public Object F1(N n0) {
        return this.G1(n0);
    }

    @Override  // org.bson.y
    public String G0() {
        try(p p0 = this.E1()) {
            p0.g0();
            try {
                return p0.n0();
            }
            catch(G unused_ex) {
                throw new NoSuchElementException();
            }
        }
    }

    public Object G1(S s0) {
        try(p p0 = this.E1()) {
            return s0.g(p0, T.a().a());
        }
    }

    public c0 H1() {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.c, this.d, this.e);
        byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
        return new d0(byteBuffer0);
    }

    public static n0 I1(String s) {
        R3.a.e("json", s);
        return new p0().c(new w(s), T.a().a());
    }

    private y K1() {
        try(p p0 = this.E1()) {
            return new o().h(p0, T.a().a());
        }
    }

    @Override  // org.bson.y
    public void clear() {
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }

    @Override  // org.bson.y
    public Object clone() throws CloneNotSupportedException {
        return this.m0();
    }

    @Override  // org.bson.y
    public boolean containsKey(Object object0) {
        if(object0 != null) {
            try(p p0 = this.E1()) {
                p0.g0();
                while(true) {
                    if(p0.T2() == X.b) {
                        p0.E1();
                        return false;
                    }
                    if(p0.n0().equals(object0)) {
                        break;
                    }
                    p0.Y1();
                }
            }
            return true;
        }
        throw new IllegalArgumentException("key can not be null");
    }

    @Override  // org.bson.y
    public boolean containsValue(Object object0) {
        try(p p0 = this.E1()) {
            p0.g0();
            do {
                if(p0.T2() == X.b) {
                    p0.E1();
                    return false;
                }
                p0.g1();
            }
            while(!o0.a(this.c, p0).equals(object0));
            return true;
        }
    }

    @Override  // org.bson.y
    public Set entrySet() {
        return this.K1().entrySet();
    }

    @Override  // org.bson.y
    public boolean equals(Object object0) {
        return this.K1().equals(object0);
    }

    @Override  // org.bson.y
    public Object get(Object object0) {
        return this.n0(object0);
    }

    @Override  // org.bson.y
    public int hashCode() {
        return this.K1().hashCode();
    }

    @Override  // org.bson.y
    public boolean isEmpty() {
        try(p p0 = this.E1()) {
            p0.g0();
            if(p0.T2() == X.b) {
                p0.E1();
                return true;
            }
            return false;
        }
    }

    @Override  // org.bson.y
    public y j0(String s, Z z0) {
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }

    @Override  // org.bson.y
    public Set keySet() {
        return this.K1().keySet();
    }

    @Override  // org.bson.y
    public y m0() {
        return new n0(((byte[])this.c.clone()), this.d, this.e);
    }

    @Override  // org.bson.y
    public Z n0(Object object0) {
        try {
            R3.a.e("key", object0);
            try(p p0 = this.E1()) {
                p0.g0();
                while(true) {
                    if(p0.T2() == X.b) {
                        break;
                    }
                    if(p0.n0().equals(object0)) {
                        return o0.a(this.c, p0);
                    }
                    p0.Y1();
                }
                p0.E1();
                return null;
            }
        }
        catch(Throwable throwable0) {
            throw throwable0;
        }
    }

    @Override  // org.bson.y
    public Object put(Object object0, Object object1) {
        return this.x1(((String)object0), ((Z)object1));
    }

    @Override  // org.bson.y
    public void putAll(Map map0) {
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }

    @Override  // org.bson.y
    public Object remove(Object object0) {
        return this.z1(object0);
    }

    @Override  // org.bson.y
    public int size() {
        try(p p0 = this.E1()) {
            p0.g0();
            int v = 0;
            while(true) {
                if(p0.T2() == X.b) {
                    break;
                }
                ++v;
                p0.n0();
                p0.Y1();
            }
            p0.E1();
            return v;
        }
    }

    @Override  // org.bson.y
    public Collection values() {
        return this.K1().values();
    }

    @Override  // org.bson.y
    public Z x1(String s, Z z0) {
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }

    private void y1(ObjectInputStream objectInputStream0) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }

    @Override  // org.bson.y
    public Z z1(Object object0) {
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }
}

