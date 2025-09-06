package com.dcinside.app.post;

import com.dcinside.app.realm.B;
import com.dcinside.app.response.GalleryInfo;
import io.realm.F0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import y4.l;
import y4.m;
import z3.n;

public final class b {
    public static final class a extends Exception {
        private final int a;

        public a(int v) {
            super("User Access Deny.");
            this.a = v;
        }

        public final int a() {
            return this.a;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface com.dcinside.app.post.b.b {
    }

    @l
    public static final b a = null;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;

    static {
        b.a = new b();
    }

    @com.dcinside.app.post.b.b
    @n
    public static final int a(@m F0 f00, @m GalleryInfo galleryInfo0) {
        if(galleryInfo0 == null) {
            return 3;
        }
        try {
            if(!galleryInfo0.a()) {
                return 0;
            }
            if(f00 == null) {
                return 1;
            }
            B b0 = B.E.V(f00);
            if(b0 == null) {
                return 1;
            }
            return 1 == b0.Y5() ? 0 : 2;
        }
        catch(Exception unused_ex) {
            return 3;
        }
    }
}

