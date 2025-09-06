package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.gifdecoder.a.a;
import com.bumptech.glide.load.engine.bitmap_recycle.e;

public final class b implements a {
    private final e a;
    @Nullable
    private final com.bumptech.glide.load.engine.bitmap_recycle.b b;

    public b(e e0) {
        this(e0, null);
    }

    public b(e e0, @Nullable com.bumptech.glide.load.engine.bitmap_recycle.b b0) {
        this.a = e0;
        this.b = b0;
    }

    @Override  // com.bumptech.glide.gifdecoder.a$a
    @NonNull
    public byte[] a(int v) {
        return this.b == null ? new byte[v] : ((byte[])this.b.d(v, byte[].class));
    }

    @Override  // com.bumptech.glide.gifdecoder.a$a
    @NonNull
    public Bitmap b(int v, int v1, @NonNull Bitmap.Config bitmap$Config0) {
        return this.a.g(v, v1, bitmap$Config0);
    }

    @Override  // com.bumptech.glide.gifdecoder.a$a
    public void c(@NonNull Bitmap bitmap0) {
        this.a.e(bitmap0);
    }

    @Override  // com.bumptech.glide.gifdecoder.a$a
    @NonNull
    public int[] d(int v) {
        return this.b == null ? new int[v] : ((int[])this.b.d(v, int[].class));
    }

    @Override  // com.bumptech.glide.gifdecoder.a$a
    public void e(@NonNull byte[] arr_b) {
        com.bumptech.glide.load.engine.bitmap_recycle.b b0 = this.b;
        if(b0 == null) {
            return;
        }
        b0.put(arr_b);
    }

    @Override  // com.bumptech.glide.gifdecoder.a$a
    public void f(@NonNull int[] arr_v) {
        com.bumptech.glide.load.engine.bitmap_recycle.b b0 = this.b;
        if(b0 == null) {
            return;
        }
        b0.put(arr_v);
    }
}

