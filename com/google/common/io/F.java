package com.google.common.io;

import J1.c;
import J1.d;
import com.google.common.base.H;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import jeb.synthetic.TWR;

@c
@d
@q
public abstract class f {
    static class a {
    }

    final class b extends j {
        private final Charset a;
        final f b;

        private b(Charset charset0) {
            this.a = (Charset)H.E(charset0);
        }

        b(Charset charset0, a f$a0) {
            this(charset0);
        }

        @Override  // com.google.common.io.j
        public Writer b() throws IOException {
            return new OutputStreamWriter(f.this.c(), this.a);
        }

        @Override
        public String toString() {
            return f.this.toString() + ".asCharSink(" + this.a + ")";
        }
    }

    public j a(Charset charset0) {
        return new b(this, charset0, null);
    }

    public OutputStream b() throws IOException {
        OutputStream outputStream0 = this.c();
        return outputStream0 instanceof BufferedOutputStream ? ((BufferedOutputStream)outputStream0) : new BufferedOutputStream(outputStream0);
    }

    public abstract OutputStream c() throws IOException;

    public void d(byte[] arr_b) throws IOException {
        H.E(arr_b);
        n n0 = n.a();
        try {
            OutputStream outputStream0 = (OutputStream)n0.b(this.c());
            outputStream0.write(arr_b);
            outputStream0.flush();
        }
        catch(Throwable throwable0) {
            try {
                throw n0.c(throwable0);
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(n0, throwable1);
                throw throwable1;
            }
        }
        n0.close();
    }

    @O1.a
    public long e(InputStream inputStream0) throws IOException {
        long v;
        H.E(inputStream0);
        n n0 = n.a();
        try {
            OutputStream outputStream0 = (OutputStream)n0.b(this.c());
            v = h.b(inputStream0, outputStream0);
            outputStream0.flush();
        }
        catch(Throwable throwable0) {
            try {
                throw n0.c(throwable0);
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(n0, throwable1);
                throw throwable1;
            }
        }
        n0.close();
        return v;
    }
}

