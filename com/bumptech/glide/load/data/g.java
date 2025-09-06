package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class g extends FilterInputStream {
    private final byte a;
    private int b;
    private static final int c = 2;
    private static final byte[] d;
    private static final int e;
    private static final int f;

    static {
        g.d = new byte[]{-1, (byte)0xE1, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        g.e = 29;
        g.f = 0x1F;
    }

    public g(InputStream inputStream0, int v) {
        super(inputStream0);
        if(v < -1 || v > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + v);
        }
        this.a = (byte)v;
    }

    @Override
    public void mark(int v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public int read() throws IOException {
        int v2;
        int v = this.b;
        if(v >= 2) {
            int v1 = g.f;
            if(v > v1) {
                v2 = super.read();
            }
            else if(v == v1) {
                v2 = this.a;
            }
            else {
                v2 = g.d[v - 2] & 0xFF;
            }
        }
        else {
            v2 = super.read();
        }
        if(v2 != -1) {
            ++this.b;
        }
        return v2;
    }

    @Override
    public int read(@NonNull byte[] arr_b, int v, int v1) throws IOException {
        int v4;
        int v2 = this.b;
        int v3 = g.f;
        if(v2 > v3) {
            v4 = super.read(arr_b, v, v1);
        }
        else if(v2 == v3) {
            arr_b[v] = this.a;
            v4 = 1;
        }
        else if(v2 < 2) {
            v4 = super.read(arr_b, v, 2 - v2);
        }
        else {
            int v5 = Math.min(v3 - v2, v1);
            System.arraycopy(g.d, this.b - 2, arr_b, v, v5);
            v4 = v5;
        }
        if(v4 > 0) {
            this.b += v4;
        }
        return v4;
    }

    @Override
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public long skip(long v) throws IOException {
        long v1 = super.skip(v);
        if(v1 > 0L) {
            this.b = (int)(((long)this.b) + v1);
        }
        return v1;
    }
}

