package com.facebook.soloader;

import android.content.Context;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import o3.h;

public final class t {
    private static final byte a = 0;
    private static final byte b = 1;
    private static final String c = "native_deps";
    private static final String d = "lock";
    private static final String e = "state";
    private static final String f = "apk_id";
    private static final String g = "deps";
    private static final String h = "assets/native_deps.txt";

    private static boolean a(Context context0, File file0) throws IOException {
        byte[] arr_b = t.f(context0, file0);
        byte[] arr_b1 = t.e(context0);
        return arr_b != null && arr_b1 != null && arr_b.length == arr_b1.length ? !Arrays.equals(arr_b, arr_b1) : true;
    }

    private static boolean b(File file0) {
        if(file0.exists() && !file0.isDirectory()) {
            file0.delete();
        }
        if(!file0.exists()) {
            file0.mkdir();
        }
        return file0.isDirectory();
    }

    public static void c(Context context0) throws IOException {
        File file0 = t.g(context0);
        if(!t.b(file0)) {
            return;
        }
        try(o o0 = SysUtil.k(file0, new File(file0, "lock"))) {
            int v = t.l(file0);
            if(v == 1 && t.a(context0, file0)) {
                v = 0;
            }
            if(v == 1) {
                return;
            }
            t.n(file0, 0);
            t.d(context0);
            t.m(context0, file0);
            SysUtil.f(file0);
            t.n(file0, 1);
        }
    }

    private static void d(Context context0) throws IOException {
        byte[] arr_b = t.j(context0);
        byte[] arr_b1 = t.e(context0);
        try(RandomAccessFile randomAccessFile0 = new RandomAccessFile(t.h(context0), "rw")) {
            randomAccessFile0.write(arr_b1);
            randomAccessFile0.writeInt(arr_b.length);
            randomAccessFile0.write(arr_b);
            randomAccessFile0.setLength(randomAccessFile0.getFilePointer());
        }
    }

    private static byte[] e(Context context0) throws IOException {
        return SysUtil.q(new File(context0.getApplicationInfo().sourceDir), context0);
    }

    @h
    private static byte[] f(Context context0, File file0) throws IOException {
        try(RandomAccessFile randomAccessFile0 = new RandomAccessFile(new File(file0, "apk_id"), "rw")) {
            int v = (int)randomAccessFile0.length();
            byte[] arr_b = new byte[v];
            return randomAccessFile0.read(arr_b) != v ? null : arr_b;
        }
    }

    public static File g(Context context0) {
        return new File(context0.getApplicationInfo().dataDir, "native_deps");
    }

    public static File h(Context context0) {
        return new File(t.g(context0), "deps");
    }

    static byte[] i(InputStream inputStream0, int v) throws IOException {
        byte[] arr_b = new byte[v];
        int v1 = 0;
        while(v1 < v) {
            int v2 = inputStream0.read(arr_b, v1, v - v1);
            if(v2 == -1) {
                throw new EOFException("EOF found unexpectedly");
            }
            v1 += v2;
            if(v1 > v) {
                throw new IllegalStateException("Read more bytes than expected");
            }
        }
        return arr_b;
    }

    static byte[] j(Context context0) throws IOException {
        try(ZipFile zipFile0 = new ZipFile(new File(context0.getApplicationInfo().sourceDir))) {
            ZipEntry zipEntry0 = zipFile0.getEntry("assets/native_deps.txt");
            if(zipEntry0 == null) {
                throw new FileNotFoundException("Could not find native_deps file in APK");
            }
            try(InputStream inputStream0 = zipFile0.getInputStream(zipEntry0)) {
                if(inputStream0 == null) {
                    throw new FileNotFoundException("Failed to read native_deps file from APK");
                }
                return t.i(inputStream0, ((int)zipEntry0.getSize()));
            }
        }
    }

    static byte[] k(Context context0) throws IOException {
        File file0 = t.h(context0);
        try(FileInputStream fileInputStream0 = new FileInputStream(file0)) {
            return t.i(fileInputStream0, ((int)file0.length()));
        }
    }

    private static byte l(File file0) throws IOException {
        try(RandomAccessFile randomAccessFile0 = new RandomAccessFile(new File(file0, "state"), "rw")) {
            try {
                if(randomAccessFile0.readByte() == 1) {
                    return 1;
                }
            }
            catch(EOFException unused_ex) {
            }
        }
        return 0;
    }

    private static void m(Context context0, File file0) throws IOException {
        File file1 = new File(file0, "apk_id");
        byte[] arr_b = t.e(context0);
        try(RandomAccessFile randomAccessFile0 = new RandomAccessFile(file1, "rw")) {
            randomAccessFile0.write(arr_b);
            randomAccessFile0.setLength(randomAccessFile0.getFilePointer());
        }
    }

    private static void n(File file0, byte b) throws IOException {
        try(RandomAccessFile randomAccessFile0 = new RandomAccessFile(new File(file0, "state"), "rw")) {
            randomAccessFile0.seek(0L);
            randomAccessFile0.write(((int)b));
            randomAccessFile0.setLength(randomAccessFile0.getFilePointer());
            randomAccessFile0.getFD().sync();
        }
    }
}

