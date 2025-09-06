package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.o;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class t implements k {
    private final Set a;

    public t() {
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    public void a() {
        this.a.clear();
    }

    @NonNull
    public List b() {
        return o.l(this.a);
    }

    public void c(@NonNull p p0) {
        this.a.add(p0);
    }

    public void d(@NonNull p p0) {
        this.a.remove(p0);
    }

    @Override  // com.bumptech.glide.manager.k
    public void onDestroy() {
        for(Object object0: o.l(this.a)) {
            ((p)object0).onDestroy();
        }
    }

    @Override  // com.bumptech.glide.manager.k
    public void onStart() {
        for(Object object0: o.l(this.a)) {
            ((p)object0).onStart();
        }
    }

    @Override  // com.bumptech.glide.manager.k
    public void onStop() {
        for(Object object0: o.l(this.a)) {
            ((p)object0).onStop();
        }
    }
}

