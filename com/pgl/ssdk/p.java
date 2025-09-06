package com.pgl.ssdk;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public abstract class p {
    public static o a(RandomAccessFile randomAccessFile0, long v, long v1) {
        return p.a(randomAccessFile0.getChannel(), v, v1);
    }

    public static o a(FileChannel fileChannel0, long v, long v1) {
        fileChannel0.getClass();
        return new l(fileChannel0, v, v1);
    }
}

