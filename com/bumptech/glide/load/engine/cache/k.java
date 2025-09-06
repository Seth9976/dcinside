package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.g;

public class k implements j {
    private a a;

    @Override  // com.bumptech.glide.load.engine.cache.j
    public long a() {
        return 0L;
    }

    @Override  // com.bumptech.glide.load.engine.cache.j
    public void b(int v) {
    }

    @Override  // com.bumptech.glide.load.engine.cache.j
    public void c() {
    }

    @Override  // com.bumptech.glide.load.engine.cache.j
    public void d(float f) {
    }

    @Override  // com.bumptech.glide.load.engine.cache.j
    public long e() {
        return 0L;
    }

    @Override  // com.bumptech.glide.load.engine.cache.j
    @Nullable
    public v f(@NonNull g g0, @Nullable v v0) {
        if(v0 != null) {
            this.a.d(v0);
        }
        return null;
    }

    @Override  // com.bumptech.glide.load.engine.cache.j
    @Nullable
    public v g(@NonNull g g0) {
        return null;
    }

    @Override  // com.bumptech.glide.load.engine.cache.j
    public void h(@NonNull a j$a0) {
        this.a = j$a0;
    }
}

