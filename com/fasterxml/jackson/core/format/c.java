package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.h;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public interface c {
    public static class a implements c {
        protected final InputStream a;
        protected final byte[] b;
        protected final int c;
        protected int d;
        protected int e;

        public a(InputStream inputStream0, byte[] arr_b) {
            this.a = inputStream0;
            this.b = arr_b;
            this.c = 0;
            this.e = 0;
            this.d = 0;
        }

        public a(byte[] arr_b) {
            this(arr_b, 0, arr_b.length);
        }

        public a(byte[] arr_b, int v, int v1) {
            this.a = null;
            this.b = arr_b;
            this.e = v;
            this.c = v;
            this.d = v + v1;
        }

        @Override  // com.fasterxml.jackson.core.format.c
        public boolean a() throws IOException {
            int v = this.e;
            if(v < this.d) {
                return true;
            }
            InputStream inputStream0 = this.a;
            if(inputStream0 == null) {
                return false;
            }
            byte[] arr_b = this.b;
            int v1 = arr_b.length - v;
            if(v1 < 1) {
                return false;
            }
            int v2 = inputStream0.read(arr_b, v, v1);
            if(v2 <= 0) {
                return false;
            }
            this.d += v2;
            return true;
        }

        public b b(h h0, d d0) {
            return new b(this.a, this.b, this.c, this.d - this.c, h0, d0);
        }

        @Override  // com.fasterxml.jackson.core.format.c
        public byte nextByte() throws IOException {
            if(this.e >= this.d && !this.a()) {
                throw new EOFException("Failed auto-detect: could not read more than " + this.e + " bytes (max buffer size: " + this.b.length + ")");
            }
            int v = this.e;
            this.e = v + 1;
            return this.b[v];
        }

        @Override  // com.fasterxml.jackson.core.format.c
        public void reset() {
            this.e = this.c;
        }
    }

    boolean a() throws IOException;

    byte nextByte() throws IOException;

    void reset();
}

