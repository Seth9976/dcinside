package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.engine.cache.a.b;
import com.bumptech.glide.load.j;
import java.io.File;

class e implements b {
    private final d a;
    private final Object b;
    private final j c;

    e(d d0, Object object0, j j0) {
        this.a = d0;
        this.b = object0;
        this.c = j0;
    }

    @Override  // com.bumptech.glide.load.engine.cache.a$b
    public boolean a(@NonNull File file0) {
        return this.a.a(this.b, file0, this.c);
    }
}

