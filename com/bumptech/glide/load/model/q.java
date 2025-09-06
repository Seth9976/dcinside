package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.k.c;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q {
    static class a {
        static class com.bumptech.glide.load.model.q.a.a {
            final List a;

            public com.bumptech.glide.load.model.q.a.a(List list0) {
                this.a = list0;
            }
        }

        private final Map a;

        a() {
            this.a = new HashMap();
        }

        public void a() {
            this.a.clear();
        }

        @Nullable
        public List b(Class class0) {
            com.bumptech.glide.load.model.q.a.a q$a$a0 = (com.bumptech.glide.load.model.q.a.a)this.a.get(class0);
            return q$a$a0 == null ? null : q$a$a0.a;
        }

        public void c(Class class0, List list0) {
            com.bumptech.glide.load.model.q.a.a q$a$a0 = new com.bumptech.glide.load.model.q.a.a(list0);
            if(((com.bumptech.glide.load.model.q.a.a)this.a.put(class0, q$a$a0)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + class0);
            }
        }
    }

    private final s a;
    private final a b;

    public q(@NonNull Pool pools$Pool0) {
        this(new s(pools$Pool0));
    }

    private q(@NonNull s s0) {
        this.b = new a();
        this.a = s0;
    }

    public void a(@NonNull Class class0, @NonNull Class class1, @NonNull p p0) {
        synchronized(this) {
            this.a.b(class0, class1, p0);
            this.b.a();
        }
    }

    public o b(@NonNull Class class0, @NonNull Class class1) {
        synchronized(this) {
            return this.a.d(class0, class1);
        }
    }

    @NonNull
    private static Class c(@NonNull Object object0) {
        return object0.getClass();
    }

    @NonNull
    public List d(@NonNull Class class0) {
        synchronized(this) {
            return this.a.g(class0);
        }
    }

    @NonNull
    public List e(@NonNull Object object0) {
        List list0 = this.f(q.c(object0));
        if(list0.isEmpty()) {
            throw new c(object0);
        }
        int v = list0.size();
        List list1 = Collections.emptyList();
        boolean z = true;
        for(int v1 = 0; v1 < v; ++v1) {
            o o0 = (o)list0.get(v1);
            if(o0.b(object0)) {
                if(z) {
                    list1 = new ArrayList(v - v1);
                    z = false;
                }
                list1.add(o0);
            }
        }
        if(list1.isEmpty()) {
            throw new c(object0, list0);
        }
        return list1;
    }

    @NonNull
    private List f(@NonNull Class class0) {
        synchronized(this) {
            List list0 = this.b.b(class0);
            if(list0 == null) {
                list0 = DesugarCollections.unmodifiableList(this.a.e(class0));
                this.b.c(class0, list0);
            }
            return list0;
        }
    }

    public void g(@NonNull Class class0, @NonNull Class class1, @NonNull p p0) {
        synchronized(this) {
            this.a.i(class0, class1, p0);
            this.b.a();
        }
    }

    public void h(@NonNull Class class0, @NonNull Class class1) {
        synchronized(this) {
            this.j(this.a.j(class0, class1));
            this.b.a();
        }
    }

    public void i(@NonNull Class class0, @NonNull Class class1, @NonNull p p0) {
        synchronized(this) {
            this.j(this.a.k(class0, class1, p0));
            this.b.a();
        }
    }

    private void j(@NonNull List list0) {
        for(Object object0: list0) {
            ((p)object0).d();
        }
    }
}

