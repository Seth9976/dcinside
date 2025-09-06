package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.G.c;
import com.google.crypto.tink.G;
import com.google.crypto.tink.Q;
import com.google.crypto.tink.subtle.M;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.Deque;
import p3.a;

final class d implements ReadableByteChannel {
    @a("this")
    ReadableByteChannel a;
    @a("this")
    ReadableByteChannel b;
    @a("this")
    M c;
    Deque d;
    byte[] e;

    public d(G g0, ReadableByteChannel readableByteChannel0, byte[] arr_b) {
        this.a = null;
        this.b = null;
        this.d = new ArrayDeque();
        for(Object object0: g0.i()) {
            this.d.add(((Q)((c)object0).h()));
        }
        this.c = new M(readableByteChannel0);
        this.e = (byte[])arr_b.clone();
    }

    @a("this")
    private ReadableByteChannel a() throws IOException {
        ReadableByteChannel readableByteChannel0;
        synchronized(this) {
            while(!this.d.isEmpty()) {
                Q q0 = (Q)this.d.removeFirst();
                try {
                    readableByteChannel0 = q0.c(this.c, this.e);
                }
                catch(GeneralSecurityException unused_ex) {
                    this.c.b();
                    continue;
                }
                return readableByteChannel0;
            }
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
    }

    @Override
    public void close() throws IOException {
        synchronized(this) {
            this.c.close();
        }
    }

    @Override
    public boolean isOpen() {
        synchronized(this) {
            return this.c.isOpen();
        }
    }

    @Override
    public int read(ByteBuffer byteBuffer0) throws IOException {
        synchronized(this) {
            if(byteBuffer0.remaining() == 0) {
                return 0;
            }
            ReadableByteChannel readableByteChannel0 = this.b;
            if(readableByteChannel0 != null) {
                return readableByteChannel0.read(byteBuffer0);
            }
            if(this.a == null) {
                this.a = this.a();
            }
            while(true) {
                try {
                    int v2 = this.a.read(byteBuffer0);
                    if(v2 == 0) {
                        break;
                    }
                    this.b = this.a;
                    this.a = null;
                    this.c.a();
                    return v2;
                }
                catch(IOException unused_ex) {
                    this.c.b();
                    this.a = this.a();
                }
            }
            return 0;
        }
    }
}

