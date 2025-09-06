package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

class IterableByteBufferInputStream extends InputStream {
    private Iterator a;
    private ByteBuffer b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private byte[] g;
    private int h;
    private long i;

    IterableByteBufferInputStream(Iterable iterable0) {
        this.a = iterable0.iterator();
        this.c = 0;
        for(Object object0: iterable0) {
            ByteBuffer byteBuffer0 = (ByteBuffer)object0;
            ++this.c;
        }
        this.d = -1;
        if(!this.a()) {
            this.b = Internal.e;
            this.d = 0;
            this.e = 0;
            this.i = 0L;
        }
    }

    private boolean a() {
        ++this.d;
        if(!this.a.hasNext()) {
            return false;
        }
        Object object0 = this.a.next();
        this.b = (ByteBuffer)object0;
        this.e = ((ByteBuffer)object0).position();
        if(this.b.hasArray()) {
            this.f = true;
            this.g = this.b.array();
            this.h = this.b.arrayOffset();
            return true;
        }
        this.f = false;
        this.i = UnsafeUtil.i(this.b);
        this.g = null;
        return true;
    }

    private void b(int v) {
        int v1 = this.e + v;
        this.e = v1;
        if(v1 == this.b.limit()) {
            this.a();
        }
    }

    @Override
    public int read() throws IOException {
        if(this.d == this.c) {
            return -1;
        }
        if(this.f) {
            int v = this.g[this.e + this.h] & 0xFF;
            this.b(1);
            return v;
        }
        int v1 = UnsafeUtil.y(((long)this.e) + this.i);
        this.b(1);
        return v1 & 0xFF;
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        if(this.d == this.c) {
            return -1;
        }
        int v2 = this.e;
        int v3 = this.b.limit() - v2;
        if(v1 > v3) {
            v1 = v3;
        }
        if(this.f) {
            System.arraycopy(this.g, v2 + this.h, arr_b, v, v1);
            this.b(v1);
            return v1;
        }
        int v4 = this.b.position();
        this.b.position(this.e);
        this.b.get(arr_b, v, v1);
        this.b.position(v4);
        this.b(v1);
        return v1;
    }
}

