package com.bumptech.glide.load.engine.cache;

import java.io.File;

public class d implements a {
    public interface c {
        File a();
    }

    private final long c;
    private final c d;

    public d(c d$c0, long v) {
        this.c = v;
        this.d = d$c0;
    }

    public d(String s, long v) {
        class com.bumptech.glide.load.engine.cache.d.a implements c {
            final String a;

            com.bumptech.glide.load.engine.cache.d.a(String s) {
            }

            @Override  // com.bumptech.glide.load.engine.cache.d$c
            public File a() {
                return new File(this.a);
            }
        }

        this(new com.bumptech.glide.load.engine.cache.d.a(s), v);
    }

    public d(String s, String s1, long v) {
        class b implements c {
            final String a;
            final String b;

            b(String s, String s1) {
                this.b = s1;
                super();
            }

            @Override  // com.bumptech.glide.load.engine.cache.d$c
            public File a() {
                return new File(this.a, this.b);
            }
        }

        this(new b(s, s1), v);
    }

    @Override  // com.bumptech.glide.load.engine.cache.a$a
    public com.bumptech.glide.load.engine.cache.a build() {
        File file0 = this.d.a();
        if(file0 == null) {
            return null;
        }
        return file0.isDirectory() || file0.mkdirs() ? e.d(file0, this.c) : null;
    }
}

