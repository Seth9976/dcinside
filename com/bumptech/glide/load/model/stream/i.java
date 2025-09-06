package com.bumptech.glide.load.model.stream;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.model.h;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import java.io.InputStream;
import java.net.URL;

public class i implements o {
    public static class a implements p {
        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(s s0) {
            return new i(s0.d(h.class, InputStream.class));
        }
    }

    private final o a;

    public i(o o0) {
        this.a = o0;
    }

    @Override  // com.bumptech.glide.load.model.o
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull j j0) {
        return this.c(((URL)object0), v, v1, j0);
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        return this.d(((URL)object0));
    }

    public com.bumptech.glide.load.model.o.a c(@NonNull URL uRL0, int v, int v1, @NonNull j j0) {
        h h0 = new h(uRL0);
        return this.a.a(h0, v, v1, j0);
    }

    public boolean d(@NonNull URL uRL0) {
        return true;
    }
}

