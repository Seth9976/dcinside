package com.bumptech.glide.load.model;

import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.h;
import com.bumptech.glide.load.data.m;
import com.bumptech.glide.load.j;
import com.bumptech.glide.signature.e;

public class a implements o {
    public interface com.bumptech.glide.load.model.a.a {
        d a(AssetManager arg1, String arg2);
    }

    public static class b implements com.bumptech.glide.load.model.a.a, p {
        private final AssetManager a;

        public b(AssetManager assetManager0) {
            this.a = assetManager0;
        }

        @Override  // com.bumptech.glide.load.model.a$a
        public d a(AssetManager assetManager0, String s) {
            return new h(assetManager0, s);
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(s s0) {
            return new a(this.a, this);
        }
    }

    public static class c implements com.bumptech.glide.load.model.a.a, p {
        private final AssetManager a;

        public c(AssetManager assetManager0) {
            this.a = assetManager0;
        }

        @Override  // com.bumptech.glide.load.model.a$a
        public d a(AssetManager assetManager0, String s) {
            return new m(assetManager0, s);
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(s s0) {
            return new a(this.a, this);
        }
    }

    private final AssetManager a;
    private final com.bumptech.glide.load.model.a.a b;
    private static final String c = "android_asset";
    private static final String d = "file:///android_asset/";
    private static final int e = 22;

    static {
    }

    public a(AssetManager assetManager0, com.bumptech.glide.load.model.a.a a$a0) {
        this.a = assetManager0;
        this.b = a$a0;
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
        return new com.bumptech.glide.load.model.o.a(new e(uri0), this.b.a(this.a, uri0.toString().substring(a.e)));
    }

    // 去混淆评级： 低(30)
    public boolean d(@NonNull Uri uri0) {
        return "file".equals(uri0.getScheme()) && !uri0.getPathSegments().isEmpty() && "android_asset".equals(uri0.getPathSegments().get(0));
    }
}

