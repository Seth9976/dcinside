package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.i;
import com.bumptech.glide.load.data.n;
import com.bumptech.glide.load.j;
import com.bumptech.glide.signature.e;
import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class y implements o {
    public static final class a implements p, c {
        private final ContentResolver a;

        public a(ContentResolver contentResolver0) {
            this.a = contentResolver0;
        }

        @Override  // com.bumptech.glide.load.model.y$c
        public d a(Uri uri0) {
            return new com.bumptech.glide.load.data.a(this.a, uri0);
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        public o e(s s0) {
            return new y(this);
        }
    }

    public static class b implements p, c {
        private final ContentResolver a;

        public b(ContentResolver contentResolver0) {
            this.a = contentResolver0;
        }

        @Override  // com.bumptech.glide.load.model.y$c
        public d a(Uri uri0) {
            return new i(this.a, uri0);
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(s s0) {
            return new y(this);
        }
    }

    public interface c {
        d a(Uri arg1);
    }

    public static class com.bumptech.glide.load.model.y.d implements p, c {
        private final ContentResolver a;

        public com.bumptech.glide.load.model.y.d(ContentResolver contentResolver0) {
            this.a = contentResolver0;
        }

        @Override  // com.bumptech.glide.load.model.y$c
        public d a(Uri uri0) {
            return new n(this.a, uri0);
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(s s0) {
            return new y(this);
        }
    }

    private final c a;
    private static final Set b;

    static {
        y.b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "content", "android.resource"})));
    }

    public y(c y$c0) {
        this.a = y$c0;
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
        return new com.bumptech.glide.load.model.o.a(new e(uri0), this.a.a(uri0));
    }

    public boolean d(@NonNull Uri uri0) {
        String s = uri0.getScheme();
        return y.b.contains(s);
    }
}

