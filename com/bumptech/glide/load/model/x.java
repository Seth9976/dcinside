package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.signature.e;

public class x implements o {
    public static class a implements p {
        private static final a a;

        static {
            a.a = new a();
        }

        public static a a() {
            return a.a;
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(s s0) {
            return x.c();
        }
    }

    static class b implements d {
        private final Object a;

        b(Object object0) {
            this.a = object0;
        }

        @Override  // com.bumptech.glide.load.data.d
        @NonNull
        public Class a() {
            return this.a.getClass();
        }

        @Override  // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override  // com.bumptech.glide.load.data.d
        @NonNull
        public com.bumptech.glide.load.a c() {
            return com.bumptech.glide.load.a.a;
        }

        @Override  // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override  // com.bumptech.glide.load.data.d
        public void d(@NonNull j j0, @NonNull com.bumptech.glide.load.data.d.a d$a0) {
            d$a0.e(this.a);
        }
    }

    private static final x a;

    static {
        x.a = new x();
    }

    @Override  // com.bumptech.glide.load.model.o
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull com.bumptech.glide.load.j j0) {
        return new com.bumptech.glide.load.model.o.a(new e(object0), new b(object0));
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        return true;
    }

    public static x c() {
        return x.a;
    }
}

