package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.m;
import java.io.File;

public class b implements m {
    private final e a;
    private final m b;

    public b(e e0, m m0) {
        this.a = e0;
        this.b = m0;
    }

    @Override  // com.bumptech.glide.load.d
    public boolean a(@NonNull Object object0, @NonNull File file0, @NonNull j j0) {
        return this.c(((v)object0), file0, j0);
    }

    @Override  // com.bumptech.glide.load.m
    @NonNull
    public c b(@NonNull j j0) {
        return this.b.b(j0);
    }

    public boolean c(@NonNull v v0, @NonNull File file0, @NonNull j j0) {
        h h0 = new h(((BitmapDrawable)v0.get()).getBitmap(), this.a);
        return this.b.a(h0, file0, j0);
    }
}

