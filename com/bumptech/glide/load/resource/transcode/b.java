package com.bumptech.glide.load.resource.transcode;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.resource.bitmap.G;
import com.bumptech.glide.util.m;

public class b implements e {
    private final Resources a;

    public b(@NonNull Context context0) {
        this(context0.getResources());
    }

    public b(@NonNull Resources resources0) {
        this.a = (Resources)m.e(resources0);
    }

    @Deprecated
    public b(@NonNull Resources resources0, com.bumptech.glide.load.engine.bitmap_recycle.e e0) {
        this(resources0);
    }

    @Override  // com.bumptech.glide.load.resource.transcode.e
    @Nullable
    public v a(@NonNull v v0, @NonNull j j0) {
        return G.c(this.a, v0);
    }
}

