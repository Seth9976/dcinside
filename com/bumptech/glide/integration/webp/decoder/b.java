package com.bumptech.glide.integration.webp.decoder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import java.io.IOException;
import java.nio.ByteBuffer;

public class b implements l {
    private final a a;

    public b(a a0) {
        this.a = a0;
    }

    @Override  // com.bumptech.glide.load.l
    public boolean a(@NonNull Object object0, @NonNull j j0) throws IOException {
        return this.d(((ByteBuffer)object0), j0);
    }

    @Override  // com.bumptech.glide.load.l
    @Nullable
    public v b(@NonNull Object object0, int v, int v1, @NonNull j j0) throws IOException {
        return this.c(((ByteBuffer)object0), v, v1, j0);
    }

    @Nullable
    public v c(@NonNull ByteBuffer byteBuffer0, int v, int v1, @NonNull j j0) throws IOException {
        return this.a.b(byteBuffer0, v, v1, j0);
    }

    public boolean d(@NonNull ByteBuffer byteBuffer0, @NonNull j j0) throws IOException {
        return this.a.d(byteBuffer0, j0);
    }
}

