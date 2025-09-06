package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class l implements o {
    private final FileChannel a;
    private final long b;
    private final long c;

    public l(FileChannel fileChannel0, long v, long v1) {
        if(v < 0L) {
            throw new IndexOutOfBoundsException("offset: " + v1);
        }
        if(v1 < 0L) {
            throw new IndexOutOfBoundsException("size: " + v1);
        }
        this.a = fileChannel0;
        this.b = v;
        this.c = v1;
    }

    private static void a(long v, long v1, long v2) {
        if(v < 0L) {
            throw new IndexOutOfBoundsException("offset: " + v);
        }
        if(v1 < 0L) {
            throw new IndexOutOfBoundsException("size: " + v1);
        }
        if(v > v2) {
            throw new IndexOutOfBoundsException("offset (" + v + ") > source size (" + v2 + ")");
        }
        long v3 = v + v1;
        if(v3 < v) {
            throw new IndexOutOfBoundsException("offset (" + v + ") + size (" + v1 + ") overflow");
        }
        if(v3 > v2) {
            throw new IndexOutOfBoundsException("offset (" + v + ") + size (" + v1 + ") > source size (" + v2 + ")");
        }
    }

    @Override  // com.pgl.ssdk.o
    public long a() {
        long v = this.c;
        if(v == -1L) {
            try {
                return this.a.size();
            }
            catch(IOException unused_ex) {
                return 0L;
            }
        }
        return v;
    }

    @Override  // com.pgl.ssdk.o
    public o a(long v, long v1) {
        return this.b(v, v1);
    }

    @Override  // com.pgl.ssdk.o
    public ByteBuffer a(long v, int v1) throws IOException {
        if(v1 < 0) {
            throw new IndexOutOfBoundsException("size: " + v1);
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(v1);
        this.a(v, v1, byteBuffer0);
        byteBuffer0.flip();
        return byteBuffer0;
    }

    public void a(long v, int v1, ByteBuffer byteBuffer0) throws IOException {
        int v4;
        FileChannel fileChannel0;
        int v3;
        long v2;
        l.a(v, v1, this.a());
        if(v1 == 0) {
            return;
        }
        if(v1 > byteBuffer0.remaining()) {
            throw new BufferOverflowException();
        }
        try {
            v2 = this.b + v;
            v3 = byteBuffer0.limit();
            byteBuffer0.limit(byteBuffer0.position() + v1);
            while(true) {
            label_7:
                if(v1 <= 0) {
                    goto label_23;
                }
                fileChannel0 = this.a;
                synchronized(fileChannel0) {
                    this.a.position(v2);
                    v4 = this.a.read(byteBuffer0);
                    break;
                }
            }
        }
        catch(Throwable throwable0) {
            byteBuffer0.limit(v3);
            throw throwable0;
        }
        v2 += (long)v4;
        v1 -= v4;
        goto label_7;
    label_23:
        byteBuffer0.limit(v3);
    }

    public l b(long v, long v1) {
        long v2 = this.a();
        l.a(v, v1, v2);
        return v != 0L || v1 != v2 ? new l(this.a, this.b + v, v1) : this;
    }
}

