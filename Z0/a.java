package z0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import k1.n.a;
import k1.n;

@n(a.a)
public class z0.a extends FilterInputStream {
    private int a;
    private int b;

    public z0.a(InputStream inputStream0, int v) {
        super(inputStream0);
        inputStream0.getClass();
        if(v < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        }
        this.a = v;
        this.b = -1;
    }

    @Override
    public int available() throws IOException {
        return Math.min(this.in.available(), this.a);
    }

    @Override
    public void mark(int v) {
        if(this.in.markSupported()) {
            this.in.mark(v);
            this.b = this.a;
        }
    }

    @Override
    public int read() throws IOException {
        if(this.a == 0) {
            return -1;
        }
        int v = this.in.read();
        if(v != -1) {
            --this.a;
        }
        return v;
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        int v2 = this.a;
        if(v2 == 0) {
            return -1;
        }
        int v3 = this.in.read(arr_b, v, Math.min(v1, v2));
        if(v3 > 0) {
            this.a -= v3;
        }
        return v3;
    }

    @Override
    public void reset() throws IOException {
        if(!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        if(this.b == -1) {
            throw new IOException("mark not set");
        }
        this.in.reset();
        this.a = this.b;
    }

    @Override
    public long skip(long v) throws IOException {
        long v1 = this.in.skip(Math.min(v, this.a));
        this.a = (int)(((long)this.a) - v1);
        return v1;
    }
}

