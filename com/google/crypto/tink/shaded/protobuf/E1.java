package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

final class e1 extends i {
    private final ByteBuffer i;

    e1(ByteBuffer byteBuffer0) {
        t0.e(byteBuffer0, "buffer");
        this.i = byteBuffer0.slice().order(ByteOrder.nativeOrder());
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public byte G(int v) {
        return this.g(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public boolean I() {
        return Z1.s(this.i);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public z M() {
        return z.p(this.i, true);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public InputStream N() {
        class a extends InputStream {
            private final ByteBuffer a;
            final e1 b;

            a() {
                this.a = e10.i.slice();
            }

            @Override
            public int available() throws IOException {
                return this.a.remaining();
            }

            @Override
            public void mark(int v) {
                this.a.mark();
            }

            @Override
            public boolean markSupported() {
                return true;
            }

            @Override
            public int read() throws IOException {
                return this.a.hasRemaining() ? this.a.get() & 0xFF : -1;
            }

            @Override
            public int read(byte[] arr_b, int v, int v1) throws IOException {
                if(!this.a.hasRemaining()) {
                    return -1;
                }
                int v2 = Math.min(v1, this.a.remaining());
                this.a.get(arr_b, v, v2);
                return v2;
            }

            @Override
            public void reset() throws IOException {
                try {
                    this.a.reset();
                }
                catch(InvalidMarkException invalidMarkException0) {
                    throw new IOException(invalidMarkException0);
                }
            }
        }

        return new a(this);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    protected int Q(int v, int v1, int v2) {
        for(int v3 = v1; v3 < v1 + v2; ++v3) {
            v = v * 0x1F + this.i.get(v3);
        }
        return v;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    protected int R(int v, int v1, int v2) {
        return Z1.v(v, this.i, v1, v2 + v1);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public u Z(int v, int v1) {
        try {
            return new e1(this.y0(v, v1));
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            throw arrayIndexOutOfBoundsException0;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new ArrayIndexOutOfBoundsException(indexOutOfBoundsException0.getMessage());
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public ByteBuffer b() {
        return this.i.asReadOnlyBuffer();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public List c() {
        return Collections.singletonList(this.b());
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof u)) {
            return false;
        }
        if(this.size() != ((u)object0).size()) {
            return false;
        }
        if(this.size() == 0) {
            return true;
        }
        if(object0 instanceof e1) {
            return this.i.equals(((e1)object0).i);
        }
        if(object0 instanceof s1) {
            return object0.equals(this);
        }
        ByteBuffer byteBuffer0 = ((u)object0).b();
        return this.i.equals(byteBuffer0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public byte g(int v) {
        try {
            return this.i.get(v);
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            throw arrayIndexOutOfBoundsException0;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new ArrayIndexOutOfBoundsException(indexOutOfBoundsException0.getMessage());
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    protected String h0(Charset charset0) {
        if(this.i.hasArray()) {
            return new String(this.i.array(), this.i.arrayOffset() + this.i.position(), this.i.remaining(), charset0);
        }
        byte[] arr_b = this.a0();
        return new String(arr_b, 0, arr_b.length, charset0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    void p0(t t0) throws IOException {
        t0.j(this.i.slice());
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public void q0(OutputStream outputStream0) throws IOException {
        outputStream0.write(this.a0());
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    void s0(OutputStream outputStream0, int v, int v1) throws IOException {
        if(this.i.hasArray()) {
            int v2 = this.i.arrayOffset();
            outputStream0.write(this.i.array(), v2 + this.i.position() + v, v1);
            return;
        }
        s.h(this.y0(v, v1 + v), outputStream0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public int size() {
        return this.i.remaining();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    public void u(ByteBuffer byteBuffer0) {
        byteBuffer0.put(this.i.slice());
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u$i
    boolean u0(u u0, int v, int v1) {
        return this.Z(0, v1).equals(u0.Z(v, v1 + v));
    }

    private void w0(ObjectInputStream objectInputStream0) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private ByteBuffer y0(int v, int v1) {
        if(v < this.i.position() || v1 > this.i.limit() || v > v1) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", v, v1));
        }
        ByteBuffer byteBuffer0 = this.i.slice();
        byteBuffer0.position(v - this.i.position());
        byteBuffer0.limit(v1 - this.i.position());
        return byteBuffer0;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.u
    protected void z(byte[] arr_b, int v, int v1, int v2) {
        ByteBuffer byteBuffer0 = this.i.slice();
        byteBuffer0.position(v);
        byteBuffer0.get(arr_b, v1, v2);
    }

    private Object z0() {
        return u.n(this.i.slice());
    }
}

