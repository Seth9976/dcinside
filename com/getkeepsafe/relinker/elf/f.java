package com.getkeepsafe.relinker.elf;

import j..util.DesugarCollections;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class f implements c, Closeable {
    private final int a;
    private final FileChannel b;

    public f(File file0) throws FileNotFoundException {
        this.a = 0x464C457F;
        if(file0 == null || !file0.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.b = new FileInputStream(file0).getChannel();
    }

    private long a(b c$b0, long v, long v1) throws IOException {
        for(long v2 = 0L; v2 < v; ++v2) {
            com.getkeepsafe.relinker.elf.c.c c$c0 = c$b0.b(v2);
            if(c$c0.a == 1L) {
                long v3 = c$c0.c;
                if(v3 <= v1 && v1 <= c$c0.d + v3) {
                    return v1 - v3 + c$c0.b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public b b() throws IOException {
        this.b.position(0L);
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
        byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
        if(this.n(byteBuffer0, 0L) != 0x464C457FL) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        int v = this.f(byteBuffer0, 4L);
        boolean z = this.f(byteBuffer0, 5L) == 2;
        if(v == 1) {
            return new d(z, this);
        }
        if(v != 2) {
            throw new IllegalStateException("Invalid class type!");
        }
        return new e(z, this);
    }

    public List c() throws IOException {
        long v3;
        this.b.position(0L);
        List list0 = new ArrayList();
        b c$b0 = this.b();
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
        byteBuffer0.order((c$b0.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN));
        long v = (long)c$b0.f;
        int v1 = 0;
        if(v == 0xFFFFL) {
            v = c$b0.c(0).a;
        }
        for(long v2 = 0L; true; ++v2) {
            v3 = 0L;
            if(v2 >= v) {
                break;
            }
            com.getkeepsafe.relinker.elf.c.c c$c0 = c$b0.b(v2);
            if(c$c0.a == 2L) {
                v3 = c$c0.b;
                break;
            }
        }
        if(v3 == 0L) {
            return DesugarCollections.unmodifiableList(list0);
        }
        ArrayList arrayList0 = new ArrayList();
        long v4 = 0L;
        do {
            a c$a0 = c$b0.a(v3, v1);
            long v5 = c$a0.a;
            if(v5 == 1L) {
                arrayList0.add(c$a0.b);
            }
            else if(v5 == 5L) {
                v4 = c$a0.b;
            }
            ++v1;
        }
        while(c$a0.a != 0L);
        if(v4 == 0L) {
            throw new IllegalStateException("String table offset not found!");
        }
        long v6 = this.a(c$b0, v, v4);
        for(Object object0: arrayList0) {
            list0.add(this.k(byteBuffer0, ((long)(((Long)object0))) + v6));
        }
        return list0;
    }

    @Override
    public void close() throws IOException {
        this.b.close();
    }

    protected void e(ByteBuffer byteBuffer0, long v, int v1) throws IOException {
        byteBuffer0.position(0);
        byteBuffer0.limit(v1);
        for(long v2 = 0L; v2 < ((long)v1); v2 += (long)v3) {
            int v3 = this.b.read(byteBuffer0, v + v2);
            if(v3 == -1) {
                throw new EOFException();
            }
        }
        byteBuffer0.position(0);
    }

    protected short f(ByteBuffer byteBuffer0, long v) throws IOException {
        this.e(byteBuffer0, v, 1);
        return (short)(byteBuffer0.get() & 0xFF);
    }

    protected int i(ByteBuffer byteBuffer0, long v) throws IOException {
        this.e(byteBuffer0, v, 2);
        return byteBuffer0.getShort() & 0xFFFF;
    }

    protected long j(ByteBuffer byteBuffer0, long v) throws IOException {
        this.e(byteBuffer0, v, 8);
        return byteBuffer0.getLong();
    }

    protected String k(ByteBuffer byteBuffer0, long v) throws IOException {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v1;
        while((v1 = this.f(byteBuffer0, v)) != 0) {
            stringBuilder0.append(((char)v1));
            ++v;
        }
        return stringBuilder0.toString();
    }

    protected long n(ByteBuffer byteBuffer0, long v) throws IOException {
        this.e(byteBuffer0, v, 4);
        return ((long)byteBuffer0.getInt()) & 0xFFFFFFFFL;
    }
}

