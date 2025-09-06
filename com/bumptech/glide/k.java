package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.t;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.m;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.q;
import com.bumptech.glide.provider.f;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class k {
    public static class a extends RuntimeException {
        public a(@NonNull String s) {
            super(s);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(@NonNull Class class0, @NonNull Class class1) {
            super("Failed to find any ModelLoaders for model: " + class0 + " and data: " + class1);
        }

        public c(@NonNull Object object0) {
            super("Failed to find any ModelLoaders registered for model class: " + object0.getClass());
        }

        public c(@NonNull Object object0, @NonNull List list0) {
            super("Found ModelLoaders for model class: " + list0 + ", but none that handle this specific model instance: " + object0);
        }
    }

    public static class d extends a {
        public d(@NonNull Class class0) {
            super("Failed to find result encoder for resource class: " + class0 + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(@NonNull Class class0) {
            super("Failed to find source encoder for data class: " + class0);
        }
    }

    private final q a;
    private final com.bumptech.glide.provider.a b;
    private final com.bumptech.glide.provider.e c;
    private final f d;
    private final com.bumptech.glide.load.data.f e;
    private final com.bumptech.glide.load.resource.transcode.f f;
    private final com.bumptech.glide.provider.b g;
    private final com.bumptech.glide.provider.d h;
    private final com.bumptech.glide.provider.c i;
    private final Pool j;
    public static final String k = "Animation";
    @Deprecated
    public static final String l = "Animation";
    public static final String m = "Bitmap";
    public static final String n = "BitmapDrawable";
    private static final String o = "legacy_prepend_all";
    private static final String p = "legacy_append";

    public k() {
        this.h = new com.bumptech.glide.provider.d();
        this.i = new com.bumptech.glide.provider.c();
        Pool pools$Pool0 = com.bumptech.glide.util.pool.a.g();
        this.j = pools$Pool0;
        this.a = new q(pools$Pool0);
        this.b = new com.bumptech.glide.provider.a();
        this.c = new com.bumptech.glide.provider.e();
        this.d = new f();
        this.e = new com.bumptech.glide.load.data.f();
        this.f = new com.bumptech.glide.load.resource.transcode.f();
        this.g = new com.bumptech.glide.provider.b();
        this.z(Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"}));
    }

    @NonNull
    public k a(@NonNull Class class0, @NonNull com.bumptech.glide.load.d d0) {
        this.b.a(class0, d0);
        return this;
    }

    @NonNull
    public k b(@NonNull Class class0, @NonNull m m0) {
        this.d.a(class0, m0);
        return this;
    }

    @NonNull
    public k c(@NonNull Class class0, @NonNull Class class1, @NonNull l l0) {
        this.e("legacy_append", class0, class1, l0);
        return this;
    }

    @NonNull
    public k d(@NonNull Class class0, @NonNull Class class1, @NonNull p p0) {
        this.a.a(class0, class1, p0);
        return this;
    }

    @NonNull
    public k e(@NonNull String s, @NonNull Class class0, @NonNull Class class1, @NonNull l l0) {
        this.c.a(s, l0, class0, class1);
        return this;
    }

    @NonNull
    private List f(@NonNull Class class0, @NonNull Class class1, @NonNull Class class2) {
        List list0 = new ArrayList();
        for(Object object0: this.c.d(class0, class1)) {
            Class class3 = (Class)object0;
            for(Object object1: this.f.b(class3, class2)) {
                list0.add(new i(class0, class3, ((Class)object1), this.c.b(class0, class3), this.f.a(class3, ((Class)object1)), this.j));
            }
        }
        return list0;
    }

    @NonNull
    public List g() {
        List list0 = this.g.b();
        if(list0.isEmpty()) {
            throw new b();
        }
        return list0;
    }

    @Nullable
    public t h(@NonNull Class class0, @NonNull Class class1, @NonNull Class class2) {
        t t0 = this.i.a(class0, class1, class2);
        if(this.i.c(t0)) {
            return null;
        }
        if(t0 == null) {
            List list0 = this.f(class0, class1, class2);
            t0 = list0.isEmpty() ? null : new t(class0, class1, class2, list0, this.j);
            this.i.d(class0, class1, class2, t0);
        }
        return t0;
    }

    @NonNull
    public List i(@NonNull Object object0) {
        return this.a.e(object0);
    }

    @NonNull
    public List j(@NonNull Class class0, @NonNull Class class1, @NonNull Class class2) {
        List list0 = this.h.b(class0, class1, class2);
        if(list0 == null) {
            list0 = new ArrayList();
            for(Object object0: this.a.d(class0)) {
                for(Object object1: this.c.d(((Class)object0), class1)) {
                    Class class3 = (Class)object1;
                    if(!this.f.b(class3, class2).isEmpty() && !list0.contains(class3)) {
                        list0.add(class3);
                    }
                }
            }
            List list1 = DesugarCollections.unmodifiableList(list0);
            this.h.c(class0, class1, class2, list1);
        }
        return list0;
    }

    @NonNull
    public m k(@NonNull v v0) throws d {
        Class class0 = v0.a();
        m m0 = this.d.b(class0);
        if(m0 == null) {
            throw new d(v0.a());
        }
        return m0;
    }

    @NonNull
    public com.bumptech.glide.load.data.e l(@NonNull Object object0) {
        return this.e.a(object0);
    }

    @NonNull
    public com.bumptech.glide.load.d m(@NonNull Object object0) throws e {
        Class class0 = object0.getClass();
        com.bumptech.glide.load.d d0 = this.b.b(class0);
        if(d0 == null) {
            throw new e(object0.getClass());
        }
        return d0;
    }

    public boolean n(@NonNull v v0) {
        Class class0 = v0.a();
        return this.d.b(class0) != null;
    }

    @NonNull
    public k o(@NonNull Class class0, @NonNull com.bumptech.glide.load.d d0) {
        this.b.c(class0, d0);
        return this;
    }

    @NonNull
    public k p(@NonNull Class class0, @NonNull m m0) {
        this.d.c(class0, m0);
        return this;
    }

    @NonNull
    public k q(@NonNull Class class0, @NonNull Class class1, @NonNull l l0) {
        this.s("legacy_prepend_all", class0, class1, l0);
        return this;
    }

    @NonNull
    public k r(@NonNull Class class0, @NonNull Class class1, @NonNull p p0) {
        this.a.g(class0, class1, p0);
        return this;
    }

    @NonNull
    public k s(@NonNull String s, @NonNull Class class0, @NonNull Class class1, @NonNull l l0) {
        this.c.e(s, l0, class0, class1);
        return this;
    }

    @NonNull
    public k t(@NonNull ImageHeaderParser imageHeaderParser0) {
        this.g.a(imageHeaderParser0);
        return this;
    }

    @NonNull
    public k u(@NonNull com.bumptech.glide.load.data.e.a e$a0) {
        this.e.b(e$a0);
        return this;
    }

    @NonNull
    @Deprecated
    public k v(@NonNull Class class0, @NonNull com.bumptech.glide.load.d d0) {
        return this.a(class0, d0);
    }

    @NonNull
    @Deprecated
    public k w(@NonNull Class class0, @NonNull m m0) {
        return this.b(class0, m0);
    }

    @NonNull
    public k x(@NonNull Class class0, @NonNull Class class1, @NonNull com.bumptech.glide.load.resource.transcode.e e0) {
        this.f.c(class0, class1, e0);
        return this;
    }

    @NonNull
    public k y(@NonNull Class class0, @NonNull Class class1, @NonNull p p0) {
        this.a.i(class0, class1, p0);
        return this;
    }

    @NonNull
    public final k z(@NonNull List list0) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        arrayList0.add("legacy_prepend_all");
        for(Object object0: list0) {
            arrayList0.add(((String)object0));
        }
        arrayList0.add("legacy_append");
        this.c.f(arrayList0);
        return this;
    }
}

