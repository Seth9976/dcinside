package org.bson.io;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.bson.T;
import org.bson.c0;
import org.bson.types.ObjectId;

public class f implements c {
    private c0 a;
    private int b;
    private static final Charset c;
    private static final String[] d;

    static {
        f.c = Charset.forName("UTF-8");
        f.d = new String[0x80];
        for(int v = 0; true; ++v) {
            String[] arr_s = f.d;
            if(v >= arr_s.length) {
                break;
            }
            arr_s[v] = "\u007F";
        }
    }

    public f(c0 c00) {
        this.b = -1;
        if(c00 == null) {
            throw new IllegalArgumentException("buffer can not be null");
        }
        this.a = c00;
        c00.L(ByteOrder.LITTLE_ENDIAN);
    }

    @Override  // org.bson.io.c
    public boolean C() {
        this.e();
        return this.a.C();
    }

    @Override  // org.bson.io.c
    public ObjectId H() {
        this.e();
        byte[] arr_b = new byte[12];
        this.r2(arr_b);
        return new ObjectId(arr_b);
    }

    @Override  // org.bson.io.c
    public d I1(int v) {
        class a implements d {
            private int a;
            final f b;

            a() {
                this.a = f0.a.position();
            }

            @Override  // org.bson.io.d
            public void reset() {
                f.this.e();
                f.this.a.R(this.a);
            }
        }

        return new a(this);
    }

    @Override  // org.bson.io.c
    public void J2() {
        this.e();
        this.i();
    }

    private void c(int v) {
        if(this.a.G() < v) {
            throw new T(String.format("While decoding a BSON document %d bytes were required, but only %d remain", v, this.a.G()));
        }
    }

    @Override  // org.bson.io.c
    public void close() {
        this.a.release();
        this.a = null;
    }

    private void e() {
        if(this.a == null) {
            throw new IllegalStateException("Stream is closed");
        }
    }

    private String f(int v) {
        if(v == 2) {
            int v1 = this.readByte();
            if(this.readByte() != 0) {
                throw new T("Found a BSON string that is not null-terminated");
            }
            return v1 >= 0 ? f.d[v1] : "\uFFFD";
        }
        byte[] arr_b = new byte[v - 1];
        this.r2(arr_b);
        if(this.readByte() != 0) {
            throw new T("Found a BSON string that is not null-terminated");
        }
        return new String(arr_b, f.c);
    }

    @Override  // org.bson.io.c
    public void g(int v) {
        this.e();
        this.a.R(this.a.position() + v);
    }

    @Override  // org.bson.io.c
    public int getPosition() {
        this.e();
        return this.a.position();
    }

    @Override  // org.bson.io.c
    public String h2() {
        this.e();
        int v = this.a.position();
        this.i();
        int v1 = this.a.position();
        this.a.R(v);
        return this.f(v1 - v);
    }

    private void i() {
        while(this.readByte() != 0) {
        }
    }

    @Override  // org.bson.io.c
    @Deprecated
    public void mark(int v) {
        this.e();
        this.b = this.a.position();
    }

    @Override  // org.bson.io.c
    public void r2(byte[] arr_b) {
        this.e();
        this.c(arr_b.length);
        this.a.K(arr_b);
    }

    @Override  // org.bson.io.c
    public byte readByte() {
        this.e();
        this.c(1);
        return this.a.get();
    }

    @Override  // org.bson.io.c
    public double readDouble() {
        this.e();
        this.c(8);
        return this.a.b();
    }

    @Override  // org.bson.io.c
    public int readInt32() {
        this.e();
        this.c(4);
        return this.a.U();
    }

    @Override  // org.bson.io.c
    public long readInt64() {
        this.e();
        this.c(8);
        return this.a.a();
    }

    @Override  // org.bson.io.c
    public String readString() {
        this.e();
        int v = this.readInt32();
        if(v <= 0) {
            throw new T(String.format("While decoding a BSON string found a size that is not a positive number: %d", v));
        }
        return this.f(v);
    }

    @Override  // org.bson.io.c
    @Deprecated
    public void reset() {
        this.e();
        int v = this.b;
        if(v == -1) {
            throw new IllegalStateException("Mark not set");
        }
        this.a.R(v);
    }

    @Override  // org.bson.io.c
    public void x1(byte[] arr_b, int v, int v1) {
        this.e();
        this.c(v1);
        this.a.Q(arr_b, v, v1);
    }
}

