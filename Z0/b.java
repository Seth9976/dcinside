package z0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import k1.n.a;
import k1.n;

@n(a.a)
public class b extends FilterInputStream {
    private final byte[] a;
    private int b;
    private int c;

    public b(InputStream inputStream0, byte[] arr_b) {
        super(inputStream0);
        inputStream0.getClass();
        arr_b.getClass();
        this.a = arr_b;
    }

    private int a() {
        int v = this.b;
        byte[] arr_b = this.a;
        if(v >= arr_b.length) {
            return -1;
        }
        this.b = v + 1;
        return arr_b[v] & 0xFF;
    }

    @Override
    public void mark(int v) {
        if(this.in.markSupported()) {
            super.mark(v);
            this.c = this.b;
        }
    }

    @Override
    public int read() throws IOException {
        int v = this.in.read();
        return v == -1 ? this.a() : v;
    }

    @Override
    public int read(byte[] arr_b) throws IOException {
        return this.read(arr_b, 0, arr_b.length);
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        int v2 = 0;
        int v3 = this.in.read(arr_b, v, v1);
        if(v3 != -1) {
            return v3;
        }
        if(v1 == 0) {
            return 0;
        }
        while(v2 < v1) {
            int v4 = this.a();
            if(v4 == -1) {
                break;
            }
            arr_b[v + v2] = (byte)v4;
            ++v2;
        }
        return v2 <= 0 ? -1 : v2;
    }

    @Override
    public void reset() throws IOException {
        if(!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        this.in.reset();
        this.b = this.c;
    }
}

