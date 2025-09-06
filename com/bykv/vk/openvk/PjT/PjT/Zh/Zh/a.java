package com.bykv.vk.openvk.PjT.PjT.Zh.Zh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

class a {
    static class com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a extends Exception {
        com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a(Throwable throwable0) {
            super(throwable0);
        }
    }

    private final RandomAccessFile a;

    a(File file0, String s) throws com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a {
        try {
            this.a = new RandomAccessFile(file0, s);
        }
        catch(FileNotFoundException fileNotFoundException0) {
            throw new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a(fileNotFoundException0);
        }
    }

    int a(byte[] arr_b) throws com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a {
        try {
            return this.a.read(arr_b);
        }
        catch(IOException iOException0) {
            throw new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a(iOException0);
        }
    }

    void b() {
        com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.n(this.a);
    }

    void c(long v) throws com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a {
        try {
            this.a.seek(v);
        }
        catch(IOException iOException0) {
            throw new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a(iOException0);
        }
    }

    void d(byte[] arr_b, int v, int v1) throws com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a {
        try {
            this.a.write(arr_b, v, v1);
        }
        catch(IOException iOException0) {
            throw new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a(iOException0);
        }
    }
}

