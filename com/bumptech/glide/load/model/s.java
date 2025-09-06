package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.load.j;
import com.bumptech.glide.util.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class s {
    static class a implements o {
        @Override  // com.bumptech.glide.load.model.o
        @Nullable
        public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull j j0) {
            return null;
        }

        @Override  // com.bumptech.glide.load.model.o
        public boolean b(@NonNull Object object0) {
            return false;
        }
    }

    static class b {
        private final Class a;
        final Class b;
        final p c;

        public b(@NonNull Class class0, @NonNull Class class1, @NonNull p p0) {
            this.a = class0;
            this.b = class1;
            this.c = p0;
        }

        public boolean a(@NonNull Class class0) {
            return this.a.isAssignableFrom(class0);
        }

        // 去混淆评级： 低(20)
        public boolean b(@NonNull Class class0, @NonNull Class class1) {
            return this.a(class0) && this.b.isAssignableFrom(class1);
        }
    }

    static class c {
        @NonNull
        public r a(@NonNull List list0, @NonNull Pool pools$Pool0) {
            return new r(list0, pools$Pool0);
        }
    }

    private final List a;
    private final c b;
    private final Set c;
    private final Pool d;
    private static final c e;
    private static final o f;

    static {
        s.e = new c();
        s.f = new a();
    }

    public s(@NonNull Pool pools$Pool0) {
        this(pools$Pool0, s.e);
    }

    @VisibleForTesting
    s(@NonNull Pool pools$Pool0, @NonNull c s$c0) {
        this.a = new ArrayList();
        this.c = new HashSet();
        this.d = pools$Pool0;
        this.b = s$c0;
    }

    private void a(@NonNull Class class0, @NonNull Class class1, @NonNull p p0, boolean z) {
        b s$b0 = new b(class0, class1, p0);
        this.a.add((z ? this.a.size() : 0), s$b0);
    }

    void b(@NonNull Class class0, @NonNull Class class1, @NonNull p p0) {
        synchronized(this) {
            this.a(class0, class1, p0, true);
        }
    }

    @NonNull
    private o c(@NonNull b s$b0) {
        return (o)m.e(s$b0.c.e(this));
    }

    @NonNull
    public o d(@NonNull Class class0, @NonNull Class class1) {
        o o1;
        o o0;
        ArrayList arrayList0;
        __monitor_enter(this);
        try {
            arrayList0 = new ArrayList();
            boolean z = false;
            for(Object object0: this.a) {
                b s$b0 = (b)object0;
                if(this.c.contains(s$b0)) {
                    z = true;
                }
                else if(s$b0.b(class0, class1)) {
                    this.c.add(s$b0);
                    arrayList0.add(this.c(s$b0));
                    this.c.remove(s$b0);
                }
            }
            if(arrayList0.size() > 1) {
                o0 = this.b.a(arrayList0, this.d);
                goto label_17;
            }
            goto label_19;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
    label_17:
        __monitor_exit(this);
        return o0;
        try {
        label_19:
            if(arrayList0.size() == 1) {
                o1 = (o)arrayList0.get(0);
                goto label_21;
            }
            goto label_23;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
    label_21:
        __monitor_exit(this);
        return o1;
    label_23:
        if(z) {
            __monitor_exit(this);
            return s.f();
        }
        try {
            throw new com.bumptech.glide.k.c(class0, class1);
        }
        catch(Throwable throwable0) {
        }
        try {
        label_28:
            this.c.clear();
            throw throwable0;
        }
        catch(Throwable throwable1) {
            __monitor_exit(this);
            throw throwable1;
        }
    }

    @NonNull
    List e(@NonNull Class class0) {
        List list0;
        __monitor_enter(this);
        try {
            list0 = new ArrayList();
            for(Object object0: this.a) {
                b s$b0 = (b)object0;
                if(!this.c.contains(s$b0) && s$b0.a(class0)) {
                    this.c.add(s$b0);
                    list0.add(this.c(s$b0));
                    this.c.remove(s$b0);
                }
            }
        }
        catch(Throwable throwable0) {
            try {
                this.c.clear();
                throw throwable0;
            }
            catch(Throwable throwable1) {
                __monitor_exit(this);
                throw throwable1;
            }
        }
        __monitor_exit(this);
        return list0;
    }

    @NonNull
    private static o f() {
        return s.f;
    }

    @NonNull
    List g(@NonNull Class class0) {
        synchronized(this) {
            List list0 = new ArrayList();
            for(Object object0: this.a) {
                b s$b0 = (b)object0;
                if(!list0.contains(s$b0.b) && s$b0.a(class0)) {
                    list0.add(s$b0.b);
                }
            }
            return list0;
        }
    }

    @NonNull
    private p h(@NonNull b s$b0) {
        return s$b0.c;
    }

    void i(@NonNull Class class0, @NonNull Class class1, @NonNull p p0) {
        synchronized(this) {
            this.a(class0, class1, p0, false);
        }
    }

    @NonNull
    List j(@NonNull Class class0, @NonNull Class class1) {
        synchronized(this) {
            List list0 = new ArrayList();
            Iterator iterator0 = this.a.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                b s$b0 = (b)object0;
                if(s$b0.b(class0, class1)) {
                    iterator0.remove();
                    list0.add(this.h(s$b0));
                }
            }
            return list0;
        }
    }

    @NonNull
    List k(@NonNull Class class0, @NonNull Class class1, @NonNull p p0) {
        synchronized(this) {
            List list0 = this.j(class0, class1);
            this.b(class0, class1, p0);
            return list0;
        }
    }
}

