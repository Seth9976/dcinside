package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import java.io.IOException;
import java.nio.ByteBuffer;

public class k implements l {
    private final x a;

    public k(x x0) {
        this.a = x0;
    }

    @Override  // com.bumptech.glide.load.l
    public boolean a(@NonNull Object object0, @NonNull j j0) throws IOException {
        return this.d(((ByteBuffer)object0), j0);
    }

    @Override  // com.bumptech.glide.load.l
    public v b(@NonNull Object object0, int v, int v1, @NonNull j j0) throws IOException {
        return this.c(((ByteBuffer)object0), v, v1, j0);
    }

    public v c(@NonNull ByteBuffer byteBuffer0, int v, int v1, @NonNull j j0) throws IOException {
        return this.a.h(byteBuffer0, v, v1, j0);
    }

    public boolean d(@NonNull ByteBuffer byteBuffer0, @NonNull j j0) {
        return true;
    }
}

