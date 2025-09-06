package com.dcinside.app.http;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Z;
import okio.m0;
import okio.x;

public class l extends RequestBody {
    static final class a extends x {
        private b a;
        private double b;
        private double c;

        private a(m0 m00, b l$b0, long v) {
            super(m00);
            this.c = 0.0;
            this.a = l$b0;
            this.b = (double)v;
        }

        a(m0 m00, b l$b0, long v, m m0) {
            this(m00, l$b0, v);
        }

        private void b() {
            this.a = null;
        }

        @Override  // okio.x
        public void write(okio.l l0, long v) throws IOException {
            super.write(l0, v);
            b l$b0 = this.a;
            if(l$b0 != null) {
                double f = this.c + ((double)v);
                this.c = f;
                double f1 = this.b;
                if(f1 <= 0.0) {
                    l$b0.a(0.0);
                    return;
                }
                l$b0.a(Math.min(f / f1 + 0.001, 1.0));
            }
        }
    }

    public interface b {
        void a(double arg1);
    }

    private RequestBody a;
    private b b;

    l(RequestBody requestBody0, b l$b0) {
        this.a = requestBody0;
        this.b = l$b0;
    }

    @Override  // okhttp3.RequestBody
    public long contentLength() {
        try {
            return this.a.contentLength();
        }
        catch(IOException iOException0) {
            iOException0.printStackTrace();
            return -1L;
        }
    }

    @Override  // okhttp3.RequestBody
    public MediaType contentType() {
        return this.a.contentType();
    }

    @Override  // okhttp3.RequestBody
    public void writeTo(okio.m m0) throws IOException {
        a l$a0 = new a(m0, this.b, this.contentLength(), null);
        okio.m m1 = Z.d(l$a0);
        this.a.writeTo(m1);
        m1.flush();
        l$a0.b();
    }
}

