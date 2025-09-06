package com.bumptech.glide.load.model;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.j;
import j..util.DesugarCollections;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class z implements o {
    public static class a implements p {
        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(s s0) {
            return new z(s0.d(h.class, InputStream.class));
        }
    }

    private final o a;
    private static final Set b;

    static {
        z.b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    }

    public z(o o0) {
        this.a = o0;
    }

    @Override  // com.bumptech.glide.load.model.o
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull j j0) {
        return this.c(((Uri)object0), v, v1, j0);
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        return this.d(((Uri)object0));
    }

    public com.bumptech.glide.load.model.o.a c(@NonNull Uri uri0, int v, int v1, @NonNull j j0) {
        h h0 = new h(uri0.toString());
        return this.a.a(h0, v, v1, j0);
    }

    public boolean d(@NonNull Uri uri0) {
        String s = uri0.getScheme();
        return z.b.contains(s);
    }
}

