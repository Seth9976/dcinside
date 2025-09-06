package com.google.crypto.tink.streamingaead;

import androidx.annotation.RequiresApi;
import com.google.crypto.tink.G.c;
import com.google.crypto.tink.G;
import com.google.crypto.tink.Q;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.Deque;
import p3.a;

@RequiresApi(24)
final class k implements SeekableByteChannel {
    @a("this")
    SeekableByteChannel a;
    @a("this")
    SeekableByteChannel b;
    @a("this")
    SeekableByteChannel c;
    @a("this")
    long d;
    @a("this")
    long e;
    Deque f;
    byte[] g;

    public k(G g0, SeekableByteChannel seekableByteChannel0, byte[] arr_b) throws IOException {
        this.a = null;
        this.b = null;
        this.f = new ArrayDeque();
        for(Object object0: g0.i()) {
            this.f.add(((Q)((c)object0).h()));
        }
        this.c = seekableByteChannel0;
        this.d = -1L;
        this.e = seekableByteChannel0.position();
        this.g = (byte[])arr_b.clone();
    }

    @a("this")
    private SeekableByteChannel a() throws IOException {
        SeekableByteChannel seekableByteChannel0;
        __monitor_enter(this);
    label_1:
        try {
            if(!this.f.isEmpty()) {
                this.c.position(this.e);
                Q q0 = (Q)this.f.removeFirst();
                try {
                    seekableByteChannel0 = q0.a(this.c, this.g);
                    long v1 = this.d;
                    if(v1 >= 0L) {
                        seekableByteChannel0.position(v1);
                    }
                }
                catch(GeneralSecurityException unused_ex) {
                    goto label_1;
                }
                return seekableByteChannel0;
            }
        }
        finally {
            __monitor_exit(this);
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
    }

    @Override
    @a("this")
    public void close() throws IOException {
        synchronized(this) {
            this.c.close();
        }
    }

    @Override
    @a("this")
    public boolean isOpen() {
        synchronized(this) {
            return this.c.isOpen();
        }
    }

    @Override
    @a("this")
    public long position() throws IOException {
        synchronized(this) {
            SeekableByteChannel seekableByteChannel0 = this.b;
            return seekableByteChannel0 != null ? seekableByteChannel0.position() : this.d;
        }
    }

    @Override
    @O1.a
    @a("this")
    public SeekableByteChannel position(long v) throws IOException {
        synchronized(this) {
            SeekableByteChannel seekableByteChannel0 = this.b;
            if(seekableByteChannel0 != null) {
                seekableByteChannel0.position(v);
                return this;
            }
            if(v >= 0L) {
                this.d = v;
                SeekableByteChannel seekableByteChannel1 = this.a;
                if(seekableByteChannel1 != null) {
                    seekableByteChannel1.position(v);
                }
                return this;
            }
        }
        throw new IllegalArgumentException("Position must be non-negative");
    }

    @Override
    @a("this")
    public int read(ByteBuffer byteBuffer0) throws IOException {
        synchronized(this) {
            if(byteBuffer0.remaining() == 0) {
                return 0;
            }
            SeekableByteChannel seekableByteChannel0 = this.b;
            if(seekableByteChannel0 != null) {
                return seekableByteChannel0.read(byteBuffer0);
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
                    return v2;
                }
                catch(IOException unused_ex) {
                    this.a = this.a();
                }
            }
            return 0;
        }
    }

    @Override
    @a("this")
    public long size() throws IOException {
        synchronized(this) {
            SeekableByteChannel seekableByteChannel0 = this.b;
            if(seekableByteChannel0 != null) {
                return seekableByteChannel0.size();
            }
        }
        throw new IOException("Cannot determine size before first read()-call.");
    }

    @Override
    public SeekableByteChannel truncate(long v) throws IOException {
        throw new NonWritableChannelException();
    }

    @Override
    public int write(ByteBuffer byteBuffer0) throws IOException {
        throw new NonWritableChannelException();
    }
}

