package com.dcinside.app.glide;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.k;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.model.h;
import com.bumptech.glide.load.model.i;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import com.bumptech.glide.module.d;
import java.io.InputStream;
import p.c;

@c
public final class e extends d {
    static class a extends com.bumptech.glide.load.model.stream.a {
        public static class com.dcinside.app.glide.e.a.a implements p {
            @Override  // com.bumptech.glide.load.model.p
            public void d() {
            }

            @Override  // com.bumptech.glide.load.model.p
            @NonNull
            public o e(@NonNull s s0) {
                return new a(s0.d(h.class, InputStream.class), null);
            }
        }

        private static final i c;

        static {
            a.c = new com.bumptech.glide.load.model.k.a().b("User-Agent", "dcinside.app").b("Referer", "http://www.dcinside.com").c();
        }

        private a(o o0) {
            super(o0);
        }

        a(o o0, f f0) {
            this(o0);
        }

        @Override  // com.bumptech.glide.load.model.o
        public boolean b(@NonNull Object object0) {
            return this.i(((String)object0));
        }

        @Override  // com.bumptech.glide.load.model.stream.a
        protected i e(Object object0, int v, int v1, j j0) {
            return this.g(((String)object0), v, v1, j0);
        }

        @Override  // com.bumptech.glide.load.model.stream.a
        protected String f(Object object0, int v, int v1, j j0) {
            return this.h(((String)object0), v, v1, j0);
        }

        protected i g(String s, int v, int v1, j j0) {
            return a.c;
        }

        protected String h(String s, int v, int v1, j j0) {
            return s;
        }

        public boolean i(@NonNull String s) {
            return true;
        }
    }

    @Override  // com.bumptech.glide.module.d
    public void b(@NonNull Context context0, @NonNull com.bumptech.glide.c c0, @NonNull k k0) {
        com.dcinside.app.glide.h.a h$a0 = new com.dcinside.app.glide.h.a();
        k0.y(h.class, InputStream.class, h$a0);
        com.dcinside.app.glide.e.a.a e$a$a0 = new com.dcinside.app.glide.e.a.a();
        k0.y(String.class, InputStream.class, e$a$a0);
    }
}

