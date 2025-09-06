package androidx.emoji2.text.flatbuffer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class FlatBufferBuilder {
    static class ByteBufferBackedInputStream extends InputStream {
        ByteBuffer a;

        public ByteBufferBackedInputStream(ByteBuffer byteBuffer0) {
            this.a = byteBuffer0;
        }

        @Override
        public int read() throws IOException {
            try {
                return this.a.get() & 0xFF;
            }
            catch(BufferUnderflowException unused_ex) {
                return -1;
            }
        }
    }

    public static abstract class ByteBufferFactory {
        public abstract ByteBuffer a(int arg1);

        public void b(ByteBuffer byteBuffer0) {
        }
    }

    public static final class HeapByteBufferFactory extends ByteBufferFactory {
        public static final HeapByteBufferFactory a;

        static {
            HeapByteBufferFactory.a = new HeapByteBufferFactory();
        }

        @Override  // androidx.emoji2.text.flatbuffer.FlatBufferBuilder$ByteBufferFactory
        public ByteBuffer a(int v) {
            return ByteBuffer.allocate(v).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    ByteBuffer a;
    int b;
    int c;
    int[] d;
    int e;
    boolean f;
    boolean g;
    int h;
    int[] i;
    int j;
    int k;
    boolean l;
    ByteBufferFactory m;
    final Utf8 n;
    static final boolean o;

    static {
    }

    public FlatBufferBuilder() {
        this(0x400);
    }

    public FlatBufferBuilder(int v) {
        Utf8 utf80 = Utf8.d();
        this(v, HeapByteBufferFactory.a, null, utf80);
    }

    public FlatBufferBuilder(int v, ByteBufferFactory flatBufferBuilder$ByteBufferFactory0) {
        this(v, flatBufferBuilder$ByteBufferFactory0, null, Utf8.d());
    }

    public FlatBufferBuilder(int v, ByteBufferFactory flatBufferBuilder$ByteBufferFactory0, ByteBuffer byteBuffer0, Utf8 utf80) {
        this.c = 1;
        this.d = null;
        this.e = 0;
        this.f = false;
        this.g = false;
        this.i = new int[16];
        this.j = 0;
        this.k = 0;
        this.l = false;
        if(v <= 0) {
            v = 1;
        }
        this.m = flatBufferBuilder$ByteBufferFactory0;
        if(byteBuffer0 == null) {
            this.a = flatBufferBuilder$ByteBufferFactory0.a(v);
        }
        else {
            this.a = byteBuffer0;
            byteBuffer0.clear();
            this.a.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.n = utf80;
        this.b = this.a.capacity();
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer0) {
        this(byteBuffer0, new HeapByteBufferFactory());
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer0, ByteBufferFactory flatBufferBuilder$ByteBufferFactory0) {
        this(byteBuffer0.capacity(), flatBufferBuilder$ByteBufferFactory0, byteBuffer0, Utf8.d());
    }

    public int A(int[] arr_v) {
        this.Q();
        this.h0(4, arr_v.length, 4);
        for(int v = arr_v.length - 1; v >= 0; --v) {
            this.n(arr_v[v]);
        }
        return this.E();
    }

    public ByteBuffer B() {
        this.L();
        return this.a;
    }

    @Deprecated
    private int C() {
        this.L();
        return this.b;
    }

    public int D() {
        int v5;
        if(this.d == null || !this.f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        this.j(0);
        int v = this.R();
        int v1;
        for(v1 = this.e - 1; v1 >= 0 && this.d[v1] == 0; --v1) {
        }
        for(int v2 = v1; v2 >= 0; --v2) {
            int v3 = this.d[v2];
            this.q(((short)(v3 == 0 ? 0 : v - v3)));
        }
        this.q(((short)(v - this.h)));
        this.q(((short)((v1 + 3) * 2)));
    alab1:
        for(int v4 = 0; true; ++v4) {
            v5 = 0;
            if(v4 >= this.j) {
                break;
            }
            int v6 = this.a.capacity() - this.i[v4];
            int v7 = this.b;
            int v8 = this.a.getShort(v6);
            if(v8 == this.a.getShort(v7)) {
                int v9 = 2;
                while(v9 < v8) {
                    if(this.a.getShort(v6 + v9) != this.a.getShort(v7 + v9)) {
                        continue alab1;
                    }
                    v9 += 2;
                }
                v5 = this.i[v4];
                break;
            }
        }
        if(v5 == 0) {
            int v11 = this.j;
            int[] arr_v = this.i;
            if(v11 == arr_v.length) {
                this.i = Arrays.copyOf(arr_v, v11 * 2);
            }
            int v12 = this.j;
            this.j = v12 + 1;
            this.i[v12] = this.R();
            this.a.putInt(this.a.capacity() - v, this.R() - v);
        }
        else {
            int v10 = this.a.capacity() - v;
            this.b = v10;
            this.a.putInt(v10, v5 - v);
        }
        this.f = false;
        return v;
    }

    public int E() {
        if(!this.f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f = false;
        this.Y(this.k);
        return this.R();
    }

    public void F(int v) {
        this.I(v, false);
    }

    public void G(int v, String s) {
        this.H(v, s, false);
    }

    protected void H(int v, String s, boolean z) {
        this.T(this.c, (z ? 4 : 0) + 8);
        if(s.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for(int v1 = 3; v1 >= 0; --v1) {
            this.d(((byte)s.charAt(v1)));
        }
        this.I(v, z);
    }

    protected void I(int v, boolean z) {
        this.T(this.c, (z ? 4 : 0) + 4);
        this.n(v);
        if(z) {
            this.j(this.a.capacity() - this.b);
        }
        this.a.position(this.b);
        this.g = true;
    }

    public void J(int v) {
        this.I(v, true);
    }

    public void K(int v, String s) {
        this.H(v, s, true);
    }

    public void L() {
        if(!this.g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public FlatBufferBuilder M(boolean z) {
        this.l = z;
        return this;
    }

    static ByteBuffer N(ByteBuffer byteBuffer0, ByteBufferFactory flatBufferBuilder$ByteBufferFactory0) {
        int v = byteBuffer0.capacity();
        if((0xC0000000 & v) != 0) {
            throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
        }
        byteBuffer0.position(0);
        ByteBuffer byteBuffer1 = flatBufferBuilder$ByteBufferFactory0.a((v == 0 ? 1 : v << 1));
        byteBuffer1.position(byteBuffer1.clear().capacity() - v);
        byteBuffer1.put(byteBuffer0);
        return byteBuffer1;
    }

    public FlatBufferBuilder O(ByteBuffer byteBuffer0, ByteBufferFactory flatBufferBuilder$ByteBufferFactory0) {
        this.m = flatBufferBuilder$ByteBufferFactory0;
        this.a = byteBuffer0;
        byteBuffer0.clear();
        this.a.order(ByteOrder.LITTLE_ENDIAN);
        this.c = 1;
        this.b = this.a.capacity();
        this.e = 0;
        this.f = false;
        this.g = false;
        this.h = 0;
        this.j = 0;
        this.k = 0;
        return this;
    }

    public static boolean P(Table table0, int v) {
        return table0.d(v) != 0;
    }

    public void Q() {
        if(this.f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int R() {
        return this.a.capacity() - this.b;
    }

    public void S(int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = this.b - 1;
            this.b = v2;
            this.a.put(v2, 0);
        }
    }

    public void T(int v, int v1) {
        if(v > this.c) {
            this.c = v;
        }
        int v2 = -(this.a.capacity() - this.b + v1) & v - 1;
        while(this.b < v2 + v + v1) {
            int v3 = this.a.capacity();
            this.a = FlatBufferBuilder.N(this.a, this.m);
            this.b += this.a.capacity() - v3;
        }
        this.S(v2);
    }

    public void U(boolean z) {
        int v = this.b - 1;
        this.b = v;
        this.a.put(v, ((byte)z));
    }

    public void V(byte b) {
        int v = this.b - 1;
        this.b = v;
        this.a.put(v, b);
    }

    public void W(double f) {
        int v = this.b - 8;
        this.b = v;
        this.a.putDouble(v, f);
    }

    public void X(float f) {
        int v = this.b - 4;
        this.b = v;
        this.a.putFloat(v, f);
    }

    public void Y(int v) {
        int v1 = this.b - 4;
        this.b = v1;
        this.a.putInt(v1, v);
    }

    public void Z(long v) {
        int v1 = this.b - 8;
        this.b = v1;
        this.a.putLong(v1, v);
    }

    public void a(int v) {
        if(v != this.R()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void a0(short v) {
        int v1 = this.b - 2;
        this.b = v1;
        this.a.putShort(v1, v);
    }

    public void b(int v, boolean z, boolean z1) {
        if(this.l || z != z1) {
            this.c(z);
            this.f0(v);
        }
    }

    public void b0(int v, int v1) {
        int v2 = this.a.capacity() - v;
        int v3 = this.a.getInt(v2);
        if(this.a.getShort(v2 - v3 + v1) == 0) {
            throw new AssertionError("FlatBuffers: field " + v1 + " must be set");
        }
    }

    public void c(boolean z) {
        this.T(1, 0);
        this.U(z);
    }

    public byte[] c0() {
        return this.d0(this.b, this.a.capacity() - this.b);
    }

    public void d(byte b) {
        this.T(1, 0);
        this.V(b);
    }

    public byte[] d0(int v, int v1) {
        this.L();
        byte[] arr_b = new byte[v1];
        this.a.position(v);
        this.a.get(arr_b);
        return arr_b;
    }

    public void e(int v, byte b, int v1) {
        if(this.l || b != v1) {
            this.d(b);
            this.f0(v);
        }
    }

    public InputStream e0() {
        this.L();
        ByteBuffer byteBuffer0 = this.a.duplicate();
        byteBuffer0.position(this.b);
        byteBuffer0.limit(this.a.capacity());
        return new ByteBufferBackedInputStream(byteBuffer0);
    }

    public void f(double f) {
        this.T(8, 0);
        this.W(f);
    }

    public void f0(int v) {
        this.d[v] = this.R();
    }

    public void g(int v, double f, double f1) {
        if(this.l || f != f1) {
            this.f(f);
            this.f0(v);
        }
    }

    public void g0(int v) {
        this.Q();
        if(this.d == null || this.d.length < v) {
            this.d = new int[v];
        }
        this.e = v;
        Arrays.fill(this.d, 0, v, 0);
        this.f = true;
        this.h = this.R();
    }

    public void h(float f) {
        this.T(4, 0);
        this.X(f);
    }

    public void h0(int v, int v1, int v2) {
        this.Q();
        this.k = v1;
        int v3 = v * v1;
        this.T(4, v3);
        this.T(v2, v3);
        this.f = true;
    }

    public void i(int v, float f, double f1) {
        if(this.l || ((double)f) != f1) {
            this.h(f);
            this.f0(v);
        }
    }

    public void j(int v) {
        this.T(4, 0);
        this.Y(v);
    }

    public void k(int v, int v1, int v2) {
        if(this.l || v1 != v2) {
            this.j(v1);
            this.f0(v);
        }
    }

    public void l(int v, long v1, long v2) {
        if(this.l || v1 != v2) {
            this.m(v1);
            this.f0(v);
        }
    }

    public void m(long v) {
        this.T(8, 0);
        this.Z(v);
    }

    public void n(int v) {
        this.T(4, 0);
        this.Y(this.R() - v + 4);
    }

    public void o(int v, int v1, int v2) {
        if(this.l || v1 != v2) {
            this.n(v1);
            this.f0(v);
        }
    }

    public void p(int v, short v1, int v2) {
        if(this.l || v1 != v2) {
            this.q(v1);
            this.f0(v);
        }
    }

    public void q(short v) {
        this.T(2, 0);
        this.a0(v);
    }

    public void r(int v, int v1, int v2) {
        if(v1 != v2) {
            this.a(v1);
            this.f0(v);
        }
    }

    public void s() {
        this.b = this.a.capacity();
        this.a.clear();
        this.c = 1;
        int v;
        while((v = this.e) > 0) {
            this.e = v - 1;
            this.d[v - 1] = 0;
        }
        this.e = 0;
        this.f = false;
        this.g = false;
        this.h = 0;
        this.j = 0;
        this.k = 0;
    }

    public int t(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.remaining();
        this.h0(1, v, 1);
        int v1 = this.b - v;
        this.b = v1;
        this.a.position(v1);
        this.a.put(byteBuffer0);
        return this.E();
    }

    public int u(byte[] arr_b) {
        this.h0(1, arr_b.length, 1);
        int v = this.b - arr_b.length;
        this.b = v;
        this.a.position(v);
        this.a.put(arr_b);
        return this.E();
    }

    public int v(byte[] arr_b, int v, int v1) {
        this.h0(1, v1, 1);
        int v2 = this.b - v1;
        this.b = v2;
        this.a.position(v2);
        this.a.put(arr_b, v, v1);
        return this.E();
    }

    public int w(Table table0, int[] arr_v) {
        table0.t(arr_v, this.a);
        return this.A(arr_v);
    }

    public int x(CharSequence charSequence0) {
        int v = this.n.c(charSequence0);
        this.d(0);
        this.h0(1, v, 1);
        int v1 = this.b - v;
        this.b = v1;
        this.a.position(v1);
        this.n.b(charSequence0, this.a);
        return this.E();
    }

    public int y(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.remaining();
        this.d(0);
        this.h0(1, v, 1);
        int v1 = this.b - v;
        this.b = v1;
        this.a.position(v1);
        this.a.put(byteBuffer0);
        return this.E();
    }

    public ByteBuffer z(int v, int v1, int v2) {
        int v3 = v * v1;
        this.h0(v, v1, v2);
        int v4 = this.b - v3;
        this.b = v4;
        this.a.position(v4);
        ByteBuffer byteBuffer0 = this.a.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer0.limit(v3);
        return byteBuffer0;
    }
}

