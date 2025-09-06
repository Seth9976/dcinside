package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import com.bumptech.glide.util.m;
import java.io.IOException;

public class a implements l {
    private final l a;
    private final Resources b;

    public a(Context context0, l l0) {
        this(context0.getResources(), l0);
    }

    @Deprecated
    public a(Resources resources0, e e0, l l0) {
        this(resources0, l0);
    }

    public a(@NonNull Resources resources0, @NonNull l l0) {
        this.b = (Resources)m.e(resources0);
        this.a = (l)m.e(l0);
    }

    @Override  // com.bumptech.glide.load.l
    public boolean a(@NonNull Object object0, @NonNull j j0) throws IOException {
        return this.a.a(object0, j0);
    }

    @Override  // com.bumptech.glide.load.l
    public v b(@NonNull Object object0, int v, int v1, @NonNull j j0) throws IOException {
        v v2 = this.a.b(object0, v, v1, j0);
        return G.c(this.b, v2);
    }
}

