package com.bumptech.glide.load.model.stream;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.model.h;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;

public class b implements o {
    public static class a implements p {
        private final n a;

        public a() {
            this.a = new n(500L);
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(s s0) {
            return new b(this.a);
        }
    }

    @Nullable
    private final n a;
    public static final i b;

    static {
        b.b = i.g("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    }

    public b() {
        this(null);
    }

    public b(@Nullable n n0) {
        this.a = n0;
    }

    @Override  // com.bumptech.glide.load.model.o
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull j j0) {
        return this.c(((h)object0), v, v1, j0);
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        return this.d(((h)object0));
    }

    public com.bumptech.glide.load.model.o.a c(@NonNull h h0, int v, int v1, @NonNull j j0) {
        n n0 = this.a;
        if(n0 != null) {
            h h1 = (h)n0.b(h0, 0, 0);
            if(h1 == null) {
                this.a.c(h0, 0, 0, h0);
                return new com.bumptech.glide.load.model.o.a(h0, new com.bumptech.glide.load.data.j(h0, ((int)(((Integer)j0.c(b.b))))));
            }
            h0 = h1;
        }
        return new com.bumptech.glide.load.model.o.a(h0, new com.bumptech.glide.load.data.j(h0, ((int)(((Integer)j0.c(b.b))))));
    }

    public boolean d(@NonNull h h0) {
        return true;
    }
}

