package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.load.g;
import com.bumptech.glide.util.j;
import com.bumptech.glide.util.o;
import com.bumptech.glide.util.pool.a.d;
import com.bumptech.glide.util.pool.a.f;
import com.bumptech.glide.util.pool.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class m {
    class a implements d {
        final m a;

        @Override  // com.bumptech.glide.util.pool.a$d
        public Object a() {
            return this.b();
        }

        public b b() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            }
            catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
                throw new RuntimeException(noSuchAlgorithmException0);
            }
        }
    }

    static final class b implements f {
        final MessageDigest a;
        private final c b;

        b(MessageDigest messageDigest0) {
            this.b = c.a();
            this.a = messageDigest0;
        }

        @Override  // com.bumptech.glide.util.pool.a$f
        @NonNull
        public c e() {
            return this.b;
        }
    }

    private final j a;
    private final Pool b;

    public m() {
        this.a = new j(1000L);
        this.b = com.bumptech.glide.util.pool.a.e(10, new a(this));
    }

    private String a(g g0) {
        b m$b0 = (b)com.bumptech.glide.util.m.e(this.b.b());
        try {
            g0.b(m$b0.a);
            return o.A(m$b0.a.digest());
        }
        finally {
            this.b.a(m$b0);
        }
    }

    public String b(g g0) {
        String s;
        synchronized(this.a) {
            s = (String)this.a.k(g0);
        }
        if(s == null) {
            s = this.a(g0);
        }
        synchronized(this.a) {
            this.a.o(g0, s);
            return s;
        }
    }
}

