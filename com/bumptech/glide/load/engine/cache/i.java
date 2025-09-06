package com.bumptech.glide.load.engine.cache;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.g;
import com.bumptech.glide.util.j;

public class i extends j implements com.bumptech.glide.load.engine.cache.j {
    private a e;

    public i(long v) {
        super(v);
    }

    @Override  // com.bumptech.glide.load.engine.cache.j
    @SuppressLint({"InlinedApi"})
    public void b(int v) {
        if(v >= 40) {
            this.c();
            return;
        }
        if(v >= 20 || v == 15) {
            this.q(this.a() / 2L);
        }
    }

    @Override  // com.bumptech.glide.load.engine.cache.j
    @Nullable
    public v f(@NonNull g g0, @Nullable v v0) {
        return (v)super.o(g0, v0);
    }

    @Override  // com.bumptech.glide.load.engine.cache.j
    @Nullable
    public v g(@NonNull g g0) {
        return (v)super.p(g0);
    }

    @Override  // com.bumptech.glide.load.engine.cache.j
    public void h(@NonNull a j$a0) {
        this.e = j$a0;
    }

    @Override  // com.bumptech.glide.util.j
    protected int m(@Nullable Object object0) {
        return this.r(((v)object0));
    }

    @Override  // com.bumptech.glide.util.j
    protected void n(@NonNull Object object0, @Nullable Object object1) {
        this.s(((g)object0), ((v)object1));
    }

    protected int r(@Nullable v v0) {
        return v0 == null ? super.m(null) : v0.getSize();
    }

    protected void s(@NonNull g g0, @Nullable v v0) {
        a j$a0 = this.e;
        if(j$a0 != null && v0 != null) {
            j$a0.d(v0);
        }
    }
}

