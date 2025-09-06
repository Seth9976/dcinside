package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.concurrent.atomic.AtomicReference;

public final class a {
    static class com.bumptech.glide.util.a.a extends InputStream {
        @NonNull
        private final ByteBuffer a;
        private int b;
        private static final int c = -1;

        com.bumptech.glide.util.a.a(@NonNull ByteBuffer byteBuffer0) {
            this.b = -1;
            this.a = byteBuffer0;
        }

        @Override
        public int available() {
            return this.a.remaining();
        }

        @Override
        public void mark(int v) {
            synchronized(this) {
                this.b = this.a.position();
            }
        }

        @Override
        public boolean markSupported() {
            return true;
        }

        @Override
        public int read() {
            return this.a.hasRemaining() ? this.a.get() & 0xFF : -1;
        }

        @Override
        public int read(@NonNull byte[] arr_b, int v, int v1) {
            if(!this.a.hasRemaining()) {
                return -1;
            }
            int v2 = Math.min(v1, this.available());
            this.a.get(arr_b, v, v2);
            return v2;
        }

        @Override
        public void reset() throws IOException {
            synchronized(this) {
                int v1 = this.b;
                if(v1 != -1) {
                    this.a.position(v1);
                    return;
                }
            }
            throw new IOException("Cannot reset to unset mark position");
        }

        @Override
        public long skip(long v) {
            if(!this.a.hasRemaining()) {
                return -1L;
            }
            long v1 = Math.min(v, this.available());
            this.a.position(((int)(((long)this.a.position()) + v1)));
            return v1;
        }
    }

    static final class b {
        final int a;
        final int b;
        final byte[] c;

        b(@NonNull byte[] arr_b, int v, int v1) {
            this.c = arr_b;
            this.a = v;
            this.b = v1;
        }
    }

    private static final int a = 0x4000;
    private static final AtomicReference b;

    static {
        a.b = new AtomicReference();
    }

    @NonNull
    public static ByteBuffer a(@NonNull File file0) throws IOException {
        ByteBuffer byteBuffer0;
        RandomAccessFile randomAccessFile0;
        long v;
        AbstractInterruptibleChannel abstractInterruptibleChannel0 = null;
        try {
            v = file0.length();
            if(v > 0x7FFFFFFFL) {
                throw new IOException("File too large to map into memory");
            }
            if(v == 0L) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile0 = new RandomAccessFile(file0, "r");
        }
        catch(Throwable throwable0) {
            randomAccessFile0 = null;
            goto label_15;
        }
        try {
            abstractInterruptibleChannel0 = randomAccessFile0.getChannel();
            byteBuffer0 = ((FileChannel)abstractInterruptibleChannel0).map(FileChannel.MapMode.READ_ONLY, 0L, v).load();
            goto label_20;
        }
        catch(Throwable throwable0) {
        }
    label_15:
        if(abstractInterruptibleChannel0 != null) {
            try {
                abstractInterruptibleChannel0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        if(randomAccessFile0 != null) {
            try {
                randomAccessFile0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable0;
        try {
        label_20:
            abstractInterruptibleChannel0.close();
        }
        catch(IOException unused_ex) {
        }
        try {
            randomAccessFile0.close();
        }
        catch(IOException unused_ex) {
        }
        return byteBuffer0;
    }

    @NonNull
    public static ByteBuffer b(@NonNull InputStream inputStream0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0x4000);
        byte[] arr_b = (byte[])a.b.getAndSet(null);
        if(arr_b == null) {
            arr_b = new byte[0x4000];
        }
        int v;
        while((v = inputStream0.read(arr_b)) >= 0) {
            byteArrayOutputStream0.write(arr_b, 0, v);
        }
        a.b.set(arr_b);
        byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
        return a.d(ByteBuffer.allocateDirect(arr_b1.length).put(arr_b1));
    }

    // 去混淆评级： 低(20)
    @Nullable
    private static b c(@NonNull ByteBuffer byteBuffer0) {
        return byteBuffer0.isReadOnly() || !byteBuffer0.hasArray() ? null : new b(byteBuffer0.array(), byteBuffer0.arrayOffset(), byteBuffer0.limit());
    }

    public static ByteBuffer d(ByteBuffer byteBuffer0) {
        return (ByteBuffer)byteBuffer0.position(0);
    }

    @NonNull
    public static byte[] e(@NonNull ByteBuffer byteBuffer0) {
        b a$b0 = a.c(byteBuffer0);
        if(a$b0 != null && a$b0.a == 0 && a$b0.b == a$b0.c.length) {
            return byteBuffer0.array();
        }
        ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
        byte[] arr_b = new byte[byteBuffer1.limit()];
        a.d(byteBuffer1);
        byteBuffer1.get(arr_b);
        return arr_b;
    }

    public static void f(@NonNull ByteBuffer byteBuffer0, @NonNull File file0) throws IOException {
        RandomAccessFile randomAccessFile0;
        a.d(byteBuffer0);
        FileChannel fileChannel0 = null;
        try {
            randomAccessFile0 = null;
            randomAccessFile0 = new RandomAccessFile(file0, "rw");
            fileChannel0 = randomAccessFile0.getChannel();
            fileChannel0.write(byteBuffer0);
            fileChannel0.force(false);
            fileChannel0.close();
            randomAccessFile0.close();
        }
        catch(Throwable throwable0) {
            if(fileChannel0 != null) {
                try {
                    fileChannel0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            if(randomAccessFile0 != null) {
                try {
                    randomAccessFile0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            throw throwable0;
        }
        try {
            fileChannel0.close();
        }
        catch(IOException unused_ex) {
        }
        try {
            randomAccessFile0.close();
        }
        catch(IOException unused_ex) {
        }
    }

    @NonNull
    public static InputStream g(@NonNull ByteBuffer byteBuffer0) {
        return new com.bumptech.glide.util.a.a(byteBuffer0);
    }

    public static void h(@NonNull ByteBuffer byteBuffer0, @NonNull OutputStream outputStream0) throws IOException {
        b a$b0 = a.c(byteBuffer0);
        if(a$b0 != null) {
            outputStream0.write(a$b0.c, a$b0.a, a$b0.b + a$b0.a);
            return;
        }
        byte[] arr_b = (byte[])a.b.getAndSet(null);
        if(arr_b == null) {
            arr_b = new byte[0x4000];
        }
        while(byteBuffer0.remaining() > 0) {
            int v = Math.min(byteBuffer0.remaining(), arr_b.length);
            byteBuffer0.get(arr_b, 0, v);
            outputStream0.write(arr_b, 0, v);
        }
        a.b.set(arr_b);
    }
}

