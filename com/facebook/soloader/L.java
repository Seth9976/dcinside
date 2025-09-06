package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import o3.h;

public class l implements j {
    @h
    private InputStream a;
    private final ZipEntry b;
    private final ZipFile c;
    private final long d;
    private boolean e;
    private long f;

    public l(ZipFile zipFile0, ZipEntry zipEntry0) throws IOException {
        this.c = zipFile0;
        this.b = zipEntry0;
        this.e = true;
        this.f = 0L;
        this.d = zipEntry0.getSize();
        InputStream inputStream0 = zipFile0.getInputStream(zipEntry0);
        this.a = inputStream0;
        if(inputStream0 == null) {
            throw new IOException(zipEntry0.getName() + "\'s InputStream is null");
        }
    }

    @Override
    public void close() throws IOException {
        InputStream inputStream0 = this.a;
        if(inputStream0 != null) {
            inputStream0.close();
            this.e = false;
        }
    }

    @Override
    public boolean isOpen() {
        return this.e;
    }

    @Override  // com.facebook.soloader.j
    public long position() throws IOException {
        return this.f;
    }

    @Override  // com.facebook.soloader.j
    public j position(long v) throws IOException {
        InputStream inputStream0 = this.a;
        if(inputStream0 == null) {
            throw new IOException(this.b.getName() + "\'s InputStream is null");
        }
        long v1 = this.f;
        if(v == v1) {
            return this;
        }
        long v2 = this.d;
        if(v > v2) {
            v = v2;
        }
        if(v >= v1) {
            inputStream0.skip(v - v1);
        }
        else {
            inputStream0.close();
            InputStream inputStream1 = this.c.getInputStream(this.b);
            this.a = inputStream1;
            if(inputStream1 == null) {
                throw new IOException(this.b.getName() + "\'s InputStream is null");
            }
            inputStream1.skip(v);
        }
        this.f = v;
        return this;
    }

    @Override  // com.facebook.soloader.j
    public int read(ByteBuffer byteBuffer0) throws IOException {
        return this.y(byteBuffer0, this.f);
    }

    @Override  // com.facebook.soloader.j
    public long size() throws IOException {
        return this.d;
    }

    @Override  // com.facebook.soloader.j
    public j truncate(long v) throws IOException {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn\'t support truncate");
    }

    @Override  // com.facebook.soloader.j
    public int write(ByteBuffer byteBuffer0) throws IOException {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn\'t support write");
    }

    @Override  // com.facebook.soloader.j
    public int y(ByteBuffer byteBuffer0, long v) throws IOException {
        if(this.a == null) {
            throw new IOException("InputStream is null");
        }
        int v1 = byteBuffer0.remaining();
        long v2 = this.d - v;
        if(v2 <= 0L) {
            return -1;
        }
        if(v1 > ((int)v2)) {
            v1 = (int)v2;
        }
        this.position(v);
        if(byteBuffer0.hasArray()) {
            this.a.read(byteBuffer0.array(), 0, v1);
            byteBuffer0.position(byteBuffer0.position() + v1);
        }
        else {
            byte[] arr_b = new byte[v1];
            this.a.read(arr_b, 0, v1);
            byteBuffer0.put(arr_b, 0, v1);
        }
        this.f += (long)v1;
        return v1;
    }
}

