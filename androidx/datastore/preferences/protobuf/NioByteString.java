package androidx.datastore.preferences.protobuf;

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

final class NioByteString extends LeafByteString {
    private final ByteBuffer i;

    NioByteString(ByteBuffer byteBuffer0) {
        Internal.e(byteBuffer0, "buffer");
        this.i = byteBuffer0.slice().order(ByteOrder.nativeOrder());
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public byte C(int v) {
        return this.g(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public boolean E() {
        return Utf8.s(this.i);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public CodedInputStream H() {
        return CodedInputStream.o(this.i, true);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public InputStream I() {
        return new InputStream() {
            private final ByteBuffer a;
            final NioByteString b;

            {
                this.a = nioByteString0.i.slice();
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
        };
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    protected int M(int v, int v1, int v2) {
        for(int v3 = v1; v3 < v1 + v2; ++v3) {
            v = v * 0x1F + this.i.get(v3);
        }
        return v;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    protected int N(int v, int v1, int v2) {
        return Utf8.v(v, this.i, v1, v2 + v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public ByteString V(int v, int v1) {
        try {
            return new NioByteString(this.s0(v, v1));
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            throw arrayIndexOutOfBoundsException0;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new ArrayIndexOutOfBoundsException(indexOutOfBoundsException0.getMessage());
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    protected String a0(Charset charset0) {
        if(this.i.hasArray()) {
            return new String(this.i.array(), this.i.arrayOffset() + this.i.position(), this.i.remaining(), charset0);
        }
        byte[] arr_b = this.W();
        return new String(arr_b, 0, arr_b.length, charset0);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public ByteBuffer b() {
        return this.i.asReadOnlyBuffer();
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public List c() {
        return Collections.singletonList(this.b());
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof ByteString)) {
            return false;
        }
        if(this.size() != ((ByteString)object0).size()) {
            return false;
        }
        if(this.size() == 0) {
            return true;
        }
        if(object0 instanceof NioByteString) {
            return this.i.equals(((NioByteString)object0).i);
        }
        if(object0 instanceof RopeByteString) {
            return object0.equals(this);
        }
        ByteBuffer byteBuffer0 = ((ByteString)object0).b();
        return this.i.equals(byteBuffer0);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
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

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    void j0(ByteOutput byteOutput0) throws IOException {
        byteOutput0.j(this.i.slice());
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public void k0(OutputStream outputStream0) throws IOException {
        outputStream0.write(this.W());
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    void n0(OutputStream outputStream0, int v, int v1) throws IOException {
        if(this.i.hasArray()) {
            int v2 = this.i.arrayOffset();
            outputStream0.write(this.i.array(), v2 + this.i.position() + v, v1);
            return;
        }
        ByteBufferWriter.h(this.s0(v, v1 + v), outputStream0);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString$LeafByteString
    boolean p0(ByteString byteString0, int v, int v1) {
        return this.V(0, v1).equals(byteString0.V(v, v1 + v));
    }

    private void r0(ObjectInputStream objectInputStream0) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private ByteBuffer s0(int v, int v1) {
        if(v < this.i.position() || v1 > this.i.limit() || v > v1) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", v, v1));
        }
        ByteBuffer byteBuffer0 = this.i.slice();
        byteBuffer0.position(v - this.i.position());
        byteBuffer0.limit(v1 - this.i.position());
        return byteBuffer0;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public int size() {
        return this.i.remaining();
    }

    private Object t0() {
        return ByteString.n(this.i.slice());
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public void u(ByteBuffer byteBuffer0) {
        byteBuffer0.put(this.i.slice());
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    protected void z(byte[] arr_b, int v, int v1, int v2) {
        ByteBuffer byteBuffer0 = this.i.slice();
        byteBuffer0.position(v);
        byteBuffer0.get(arr_b, v1, v2);
    }
}

