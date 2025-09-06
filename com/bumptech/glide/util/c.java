package com.bumptech.glide.util;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c extends FilterInputStream {
    private final long a;
    private int b;
    private static final String c = "ContentLengthStream";
    private static final int d = -1;

    private c(@NonNull InputStream inputStream0, long v) {
        super(inputStream0);
        this.a = v;
    }

    private int a(int v) throws IOException {
        if(v >= 0) {
            this.b += v;
            return v;
        }
        if(this.a - ((long)this.b) > 0L) {
            throw new IOException("Failed to read all expected data, expected: " + this.a + ", but read: " + this.b);
        }
        return v;
    }

    @Override
    public int available() throws IOException {
        long v1;
        synchronized(this) {
            v1 = Math.max(this.a - ((long)this.b), this.in.available());
        }
        return (int)v1;
    }

    @NonNull
    public static InputStream b(@NonNull InputStream inputStream0, long v) {
        return new c(inputStream0, v);
    }

    @NonNull
    public static InputStream c(@NonNull InputStream inputStream0, @Nullable String s) {
        return c.b(inputStream0, ((long)c.e(s)));
    }

    private static int e(@Nullable String s) {
        if(!TextUtils.isEmpty(s)) {
            try {
                return Integer.parseInt(s);
            }
            catch(NumberFormatException numberFormatException0) {
                if(Log.isLoggable("ContentLengthStream", 3)) {
                    Log.d("ContentLengthStream", "failed to parse content length header: " + s, numberFormatException0);
                }
            }
        }
        return -1;
    }

    @Override
    public int read() throws IOException {
        synchronized(this) {
            int v1 = super.read();
            this.a((v1 < 0 ? -1 : 1));
            return v1;
        }
    }

    @Override
    public int read(byte[] arr_b) throws IOException {
        return this.read(arr_b, 0, arr_b.length);
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        synchronized(this) {
            return this.a(super.read(arr_b, v, v1));
        }
    }
}

