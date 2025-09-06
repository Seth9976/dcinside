package com.bumptech.glide.load.resource;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.util.m;

public class j implements v {
    protected final Object a;

    public j(@NonNull Object object0) {
        this.a = m.e(object0);
    }

    @Override  // com.bumptech.glide.load.engine.v
    @NonNull
    public Class a() {
        return this.a.getClass();
    }

    @Override  // com.bumptech.glide.load.engine.v
    @NonNull
    public final Object get() {
        return this.a;
    }

    @Override  // com.bumptech.glide.load.engine.v
    public final int getSize() {
        return 1;
    }

    @Override  // com.bumptech.glide.load.engine.v
    public void recycle() {
    }
}

