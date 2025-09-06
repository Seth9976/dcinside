package com.bumptech.glide.load.resource.gif;

import androidx.annotation.NonNull;
import com.bumptech.glide.gifdecoder.a;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import java.io.IOException;

public final class h implements l {
    private final e a;

    public h(e e0) {
        this.a = e0;
    }

    @Override  // com.bumptech.glide.load.l
    public boolean a(@NonNull Object object0, @NonNull j j0) throws IOException {
        return this.d(((a)object0), j0);
    }

    @Override  // com.bumptech.glide.load.l
    public v b(@NonNull Object object0, int v, int v1, @NonNull j j0) throws IOException {
        return this.c(((a)object0), v, v1, j0);
    }

    public v c(@NonNull a a0, int v, int v1, @NonNull j j0) {
        return com.bumptech.glide.load.resource.bitmap.h.c(a0.i(), this.a);
    }

    public boolean d(@NonNull a a0, @NonNull j j0) {
        return true;
    }
}

