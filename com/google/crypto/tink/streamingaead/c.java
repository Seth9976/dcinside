package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.G;
import com.google.crypto.tink.Q;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import p3.a;

final class c extends InputStream {
    @a("this")
    boolean a;
    @a("this")
    InputStream b;
    @a("this")
    InputStream c;
    G d;
    byte[] e;

    public c(G g0, InputStream inputStream0, byte[] arr_b) {
        this.a = false;
        this.b = null;
        this.d = g0;
        this.c = inputStream0.markSupported() ? inputStream0 : new BufferedInputStream(inputStream0);
        this.c.mark(0x7FFFFFFF);
        this.e = (byte[])arr_b.clone();
    }

    @a("this")
    private void a() throws IOException {
        this.c.mark(0);
    }

    @Override
    @a("this")
    public int available() throws IOException {
        synchronized(this) {
            InputStream inputStream0 = this.b;
            return inputStream0 == null ? 0 : inputStream0.available();
        }
    }

    @a("this")
    private void b() throws IOException {
        this.c.reset();
    }

    @Override
    @a("this")
    public void close() throws IOException {
        synchronized(this) {
            this.c.close();
        }
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    @a("this")
    public int read() throws IOException {
        synchronized(this) {
            byte[] arr_b = new byte[1];
            return this.read(arr_b) == 1 ? arr_b[0] : -1;
        }
    }

    @Override
    @a("this")
    public int read(byte[] arr_b) throws IOException {
        synchronized(this) {
            return this.read(arr_b, 0, arr_b.length);
        }
    }

    @Override
    @a("this")
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        synchronized(this) {
            if(v1 == 0) {
                return 0;
            }
            InputStream inputStream0 = this.b;
            if(inputStream0 != null) {
                return inputStream0.read(arr_b, v, v1);
            }
            if(!this.a) {
                this.a = true;
                for(Object object0: this.d.i()) {
                    com.google.crypto.tink.G.c g$c0 = (com.google.crypto.tink.G.c)object0;
                    try {
                        InputStream inputStream1 = ((Q)g$c0.h()).e(this.c, this.e);
                        int v4 = inputStream1.read(arr_b, v, v1);
                        if(v4 != 0) {
                            this.b = inputStream1;
                            this.a();
                            return v4;
                        }
                    }
                    catch(IOException unused_ex) {
                        this.b();
                        continue;
                    }
                    catch(GeneralSecurityException unused_ex) {
                    }
                    this.b();
                }
                throw new IOException("No matching key found for the ciphertext in the stream.");
            }
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
    }
}

