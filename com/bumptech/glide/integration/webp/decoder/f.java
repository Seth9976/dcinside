package com.bumptech.glide.integration.webp.decoder;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import java.io.IOException;
import java.io.InputStream;

public class f implements l {
    private final k a;
    private final b b;

    public f(k k0, b b0) {
        this.a = k0;
        this.b = b0;
    }

    @Override  // com.bumptech.glide.load.l
    public boolean a(@NonNull Object object0, @NonNull j j0) throws IOException {
        return this.d(((InputStream)object0), j0);
    }

    @Override  // com.bumptech.glide.load.l
    public v b(@NonNull Object object0, int v, int v1, @NonNull j j0) throws IOException {
        return this.c(((InputStream)object0), v, v1, j0);
    }

    public v c(@NonNull InputStream inputStream0, int v, int v1, @NonNull j j0) throws IOException {
        return this.a.d(inputStream0, v, v1, j0);
    }

    public boolean d(@NonNull InputStream inputStream0, @NonNull j j0) throws IOException {
        return this.a.l(inputStream0, j0);
    }
}

