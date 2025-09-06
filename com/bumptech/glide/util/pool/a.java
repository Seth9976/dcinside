package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SimplePool;
import androidx.core.util.Pools.SynchronizedPool;
import java.util.ArrayList;
import java.util.List;

public final class a {
    class com.bumptech.glide.util.pool.a.a implements g {
        com.bumptech.glide.util.pool.a.a() {
            super();
        }

        @Override  // com.bumptech.glide.util.pool.a$g
        public void a(@NonNull Object object0) {
        }
    }

    public interface d {
        Object a();
    }

    static final class e implements Pool {
        private final d a;
        private final g b;
        private final Pool c;

        e(@NonNull Pool pools$Pool0, @NonNull d a$d0, @NonNull g a$g0) {
            this.c = pools$Pool0;
            this.a = a$d0;
            this.b = a$g0;
        }

        @Override  // androidx.core.util.Pools$Pool
        public boolean a(@NonNull Object object0) {
            if(object0 instanceof f) {
                ((f)object0).e().b(true);
            }
            this.b.a(object0);
            return this.c.a(object0);
        }

        @Override  // androidx.core.util.Pools$Pool
        public Object b() {
            Object object0 = this.c.b();
            if(object0 == null) {
                object0 = this.a.a();
                if(Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + object0.getClass());
                }
            }
            if(object0 instanceof f) {
                ((f)object0).e().b(false);
            }
            return object0;
        }
    }

    public interface f {
        @NonNull
        c e();
    }

    public interface g {
        void a(@NonNull Object arg1);
    }

    private static final String a = "FactoryPools";
    private static final int b = 20;
    private static final g c;

    static {
        a.c = new com.bumptech.glide.util.pool.a.a();
    }

    @NonNull
    private static Pool a(@NonNull Pool pools$Pool0, @NonNull d a$d0) {
        return a.b(pools$Pool0, a$d0, a.c());
    }

    @NonNull
    private static Pool b(@NonNull Pool pools$Pool0, @NonNull d a$d0, @NonNull g a$g0) {
        return new e(pools$Pool0, a$d0, a$g0);
    }

    @NonNull
    private static g c() {
        return a.c;
    }

    @NonNull
    public static Pool d(int v, @NonNull d a$d0) {
        return a.a(new SimplePool(v), a$d0);
    }

    @NonNull
    public static Pool e(int v, @NonNull d a$d0) {
        return a.a(new SynchronizedPool(v), a$d0);
    }

    @NonNull
    public static Pool f(int v, @NonNull d a$d0, @NonNull g a$g0) {
        return a.b(new SynchronizedPool(v), a$d0, a$g0);
    }

    @NonNull
    public static Pool g() {
        return a.h(20);
    }

    @NonNull
    public static Pool h(int v) {
        class b implements d {
            b() {
                super();
            }

            @Override  // com.bumptech.glide.util.pool.a$d
            @NonNull
            public Object a() {
                return this.b();
            }

            @NonNull
            public List b() {
                return new ArrayList();
            }
        }


        class com.bumptech.glide.util.pool.a.c implements g {
            com.bumptech.glide.util.pool.a.c() {
                super();
            }

            @Override  // com.bumptech.glide.util.pool.a$g
            public void a(@NonNull Object object0) {
                this.b(((List)object0));
            }

            public void b(@NonNull List list0) {
                list0.clear();
            }
        }

        return a.b(new SynchronizedPool(v), new b(), new com.bumptech.glide.util.pool.a.c());
    }
}

