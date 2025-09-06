package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.request.i;
import com.bumptech.glide.request.target.k;
import com.bumptech.glide.request.target.r;
import com.bumptech.glide.util.h;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public class e extends ContextWrapper {
    private final b a;
    private final com.bumptech.glide.util.h.b b;
    private final k c;
    private final a d;
    private final List e;
    private final Map f;
    private final com.bumptech.glide.load.engine.k g;
    private final f h;
    private final int i;
    @GuardedBy("this")
    @Nullable
    private i j;
    @VisibleForTesting
    static final o k;

    static {
        e.k = new com.bumptech.glide.b();
    }

    public e(@NonNull Context context0, @NonNull b b0, @NonNull com.bumptech.glide.util.h.b h$b0, @NonNull k k0, @NonNull a c$a0, @NonNull Map map0, @NonNull List list0, @NonNull com.bumptech.glide.load.engine.k k1, @NonNull f f0, int v) {
        super(context0.getApplicationContext());
        this.a = b0;
        this.c = k0;
        this.d = c$a0;
        this.e = list0;
        this.f = map0;
        this.g = k1;
        this.h = f0;
        this.i = v;
        this.b = h.a(h$b0);
    }

    @NonNull
    public r a(@NonNull ImageView imageView0, @NonNull Class class0) {
        return this.c.a(imageView0, class0);
    }

    @NonNull
    public b b() {
        return this.a;
    }

    public List c() {
        return this.e;
    }

    public i d() {
        synchronized(this) {
            if(this.j == null) {
                this.j = (i)this.d.build().l0();
            }
            return this.j;
        }
    }

    @NonNull
    public o e(@NonNull Class class0) {
        o o0 = (o)this.f.get(class0);
        if(o0 == null) {
            for(Object object0: this.f.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(((Class)map$Entry0.getKey()).isAssignableFrom(class0)) {
                    o0 = (o)map$Entry0.getValue();
                }
            }
        }
        return o0 == null ? e.k : o0;
    }

    @NonNull
    public com.bumptech.glide.load.engine.k f() {
        return this.g;
    }

    public f g() {
        return this.h;
    }

    public int h() {
        return this.i;
    }

    @NonNull
    public com.bumptech.glide.k i() {
        return (com.bumptech.glide.k)this.b.get();
    }
}

