package com.dcinside.app.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import com.dcinside.app.Application;
import okhttp3.Call.Factory;

public class h implements o {
    public static class a implements p {
        private final Factory a;

        public a() {
            this(Application.a());
        }

        public a(@NonNull Factory call$Factory0) {
            this.a = call$Factory0;
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(@NonNull s s0) {
            return new h(this.a);
        }
    }

    private final Factory a;

    public h(@NonNull Factory call$Factory0) {
        this.a = call$Factory0;
    }

    @Override  // com.bumptech.glide.load.model.o
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull j j0) {
        return this.c(((com.bumptech.glide.load.model.h)object0), v, v1, j0);
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        return this.d(((com.bumptech.glide.load.model.h)object0));
    }

    public com.bumptech.glide.load.model.o.a c(@NonNull com.bumptech.glide.load.model.h h0, int v, int v1, @NonNull j j0) {
        return new com.bumptech.glide.load.model.o.a(h0, new g(this.a, h0));
    }

    public boolean d(@NonNull com.bumptech.glide.load.model.h h0) {
        return true;
    }
}

