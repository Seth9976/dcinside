package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

public interface a {
    public interface com.bumptech.glide.gifdecoder.a.a {
        @NonNull
        byte[] a(int arg1);

        @NonNull
        Bitmap b(int arg1, int arg2, @NonNull Bitmap.Config arg3);

        void c(@NonNull Bitmap arg1);

        @NonNull
        int[] d(int arg1);

        void e(@NonNull byte[] arg1);

        void f(@NonNull int[] arg1);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e;

    @Deprecated
    int a();

    int b();

    int c(@Nullable InputStream arg1, int arg2);

    void clear();

    void d(@NonNull Bitmap.Config arg1);

    void e(@NonNull c arg1, @NonNull byte[] arg2);

    void f();

    int g();

    @NonNull
    ByteBuffer getData();

    int getHeight();

    int getStatus();

    int getWidth();

    int h();

    @Nullable
    Bitmap i();

    void j();

    int k(int arg1);

    int l();

    int m();

    void n(@NonNull c arg1, @NonNull ByteBuffer arg2);

    void o(@NonNull c arg1, @NonNull ByteBuffer arg2, int arg3);

    int p();

    int read(@Nullable byte[] arg1);
}

