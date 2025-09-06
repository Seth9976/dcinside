package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class k implements j {
    private File a;
    private FileInputStream b;
    private FileChannel c;

    public k(File file0) throws IOException {
        this.a = file0;
        this.a();
    }

    public void a() throws IOException {
        FileInputStream fileInputStream0 = new FileInputStream(this.a);
        this.b = fileInputStream0;
        this.c = fileInputStream0.getChannel();
    }

    @Override
    public void close() throws IOException {
        this.b.close();
    }

    @Override
    public boolean isOpen() {
        return this.c.isOpen();
    }

    @Override  // com.facebook.soloader.j
    public long position() throws IOException {
        return this.c.position();
    }

    @Override  // com.facebook.soloader.j
    public j position(long v) throws IOException {
        this.c.position(v);
        return this;
    }

    @Override  // com.facebook.soloader.j
    public int read(ByteBuffer byteBuffer0) throws IOException {
        return this.c.read(byteBuffer0);
    }

    @Override  // com.facebook.soloader.j
    public long size() throws IOException {
        return this.c.size();
    }

    @Override  // com.facebook.soloader.j
    public j truncate(long v) throws IOException {
        this.c.truncate(v);
        return this;
    }

    @Override  // com.facebook.soloader.j
    public int write(ByteBuffer byteBuffer0) throws IOException {
        return this.c.write(byteBuffer0);
    }

    @Override  // com.facebook.soloader.j
    public int y(ByteBuffer byteBuffer0, long v) throws IOException {
        return this.c.read(byteBuffer0, v);
    }
}

