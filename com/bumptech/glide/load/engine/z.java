package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.util.i;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

class z implements a, f {
    private final g a;
    private final a b;
    private volatile int c;
    private volatile c d;
    private volatile Object e;
    private volatile com.bumptech.glide.load.model.o.a f;
    private volatile d g;
    private static final String h = "SourceGenerator";

    z(g g0, a f$a0) {
        this.a = g0;
        this.b = f$a0;
    }

    @Override  // com.bumptech.glide.load.engine.f
    public boolean a() {
        if(this.e != null) {
            try {
                Object object0 = this.e;
                this.e = null;
                if(!this.e(object0)) {
                    return true;
                }
            }
            catch(IOException iOException0) {
                if(Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", iOException0);
                }
            }
        }
        if(this.d != null && this.d.a()) {
            return true;
        }
        this.d = null;
        this.f = null;
        boolean z = false;
        while(!z && this.f()) {
            List list0 = this.a.g();
            int v = this.c;
            this.c = v + 1;
            this.f = (com.bumptech.glide.load.model.o.a)list0.get(v);
            if(this.f == null) {
            }
            else if(this.a.e().c(this.f.c.c())) {
                this.j(this.f);
                z = true;
            }
            else {
                Class class0 = this.f.c.a();
                if(this.a.u(class0)) {
                    this.j(this.f);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override  // com.bumptech.glide.load.engine.f$a
    public void b(com.bumptech.glide.load.g g0, Exception exception0, com.bumptech.glide.load.data.d d0, com.bumptech.glide.load.a a0) {
        com.bumptech.glide.load.a a1 = this.f.c.c();
        this.b.b(g0, exception0, d0, a1);
    }

    @Override  // com.bumptech.glide.load.engine.f$a
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.bumptech.glide.load.engine.f
    public void cancel() {
        com.bumptech.glide.load.model.o.a o$a0 = this.f;
        if(o$a0 != null) {
            o$a0.c.cancel();
        }
    }

    @Override  // com.bumptech.glide.load.engine.f$a
    public void d(com.bumptech.glide.load.g g0, Object object0, com.bumptech.glide.load.data.d d0, com.bumptech.glide.load.a a0, com.bumptech.glide.load.g g1) {
        com.bumptech.glide.load.a a1 = this.f.c.c();
        this.b.d(g0, object0, d0, a1, g0);
    }

    private boolean e(Object object0) throws IOException {
        e e0;
        long v = i.b();
        boolean z = false;
        try {
            e0 = this.a.o(object0);
            Object object1 = e0.a();
            com.bumptech.glide.load.d d0 = this.a.q(object1);
            com.bumptech.glide.load.engine.e e1 = new com.bumptech.glide.load.engine.e(d0, object1, this.a.k());
            d d1 = new d(this.f.a, this.a.p());
            com.bumptech.glide.load.engine.cache.a a0 = this.a.d();
            a0.a(d1, e1);
            if(Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + d1 + ", data: " + object0 + ", encoder: " + d0 + ", duration: " + i.a(v));
            }
            if(a0.b(d1) != null) {
                this.g = d1;
                this.d = new c(Collections.singletonList(this.f.a), this.a, this);
                goto label_14;
            }
            goto label_16;
        }
        catch(Throwable throwable0) {
            goto label_29;
        }
    label_14:
        this.f.c.b();
        return true;
        try {
        label_16:
            if(Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.g + ", data: " + object0 + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
        }
        catch(Throwable throwable0) {
            goto label_29;
        }
        try {
            com.bumptech.glide.load.g g0 = this.f.a;
            Object object2 = e0.a();
            com.bumptech.glide.load.data.d d2 = this.f.c;
            com.bumptech.glide.load.a a1 = this.f.c.c();
            this.b.d(g0, object2, d2, a1, this.f.a);
            return false;
        }
        catch(Throwable throwable0) {
            z = true;
        }
    label_29:
        if(!z) {
            this.f.c.b();
        }
        throw throwable0;
    }

    private boolean f() {
        return this.c < this.a.g().size();
    }

    boolean g(com.bumptech.glide.load.model.o.a o$a0) {
        return this.f != null && this.f == o$a0;
    }

    void h(com.bumptech.glide.load.model.o.a o$a0, Object object0) {
        if(object0 != null && this.a.e().c(o$a0.c.c())) {
            this.e = object0;
            this.b.c();
            return;
        }
        com.bumptech.glide.load.a a0 = o$a0.c.c();
        this.b.d(o$a0.a, object0, o$a0.c, a0, this.g);
    }

    void i(com.bumptech.glide.load.model.o.a o$a0, @NonNull Exception exception0) {
        d d0 = this.g;
        com.bumptech.glide.load.a a0 = o$a0.c.c();
        this.b.b(d0, exception0, o$a0.c, a0);
    }

    private void j(com.bumptech.glide.load.model.o.a o$a0) {
        class com.bumptech.glide.load.engine.z.a implements com.bumptech.glide.load.data.d.a {
            final com.bumptech.glide.load.model.o.a a;
            final z b;

            com.bumptech.glide.load.engine.z.a(com.bumptech.glide.load.model.o.a o$a0) {
                this.a = o$a0;
                super();
            }

            @Override  // com.bumptech.glide.load.data.d$a
            public void e(@Nullable Object object0) {
                if(z.this.g(this.a)) {
                    z.this.h(this.a, object0);
                }
            }

            @Override  // com.bumptech.glide.load.data.d$a
            public void f(@NonNull Exception exception0) {
                if(z.this.g(this.a)) {
                    z.this.i(this.a, exception0);
                }
            }
        }

        com.bumptech.glide.load.data.d d0 = this.f.c;
        com.bumptech.glide.load.engine.z.a z$a0 = new com.bumptech.glide.load.engine.z.a(this, o$a0);
        d0.d(this.a.l(), z$a0);
    }
}

