package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d.a;
import com.bumptech.glide.load.model.o;
import java.io.File;
import java.util.List;

class c implements a, f {
    private final List a;
    private final g b;
    private final com.bumptech.glide.load.engine.f.a c;
    private int d;
    private com.bumptech.glide.load.g e;
    private List f;
    private int g;
    private volatile com.bumptech.glide.load.model.o.a h;
    private File i;

    c(g g0, com.bumptech.glide.load.engine.f.a f$a0) {
        this(g0.c(), g0, f$a0);
    }

    c(List list0, g g0, com.bumptech.glide.load.engine.f.a f$a0) {
        this.d = -1;
        this.a = list0;
        this.b = g0;
        this.c = f$a0;
    }

    @Override  // com.bumptech.glide.load.engine.f
    public boolean a() {
        while(true) {
            boolean z = false;
            if(this.f != null && this.b()) {
                this.h = null;
                while(!z && this.b()) {
                    int v = this.g;
                    this.g = v + 1;
                    this.h = ((o)this.f.get(v)).a(this.i, this.b.t(), this.b.f(), this.b.k());
                    if(this.h != null) {
                        Class class0 = this.h.c.a();
                        if(this.b.u(class0)) {
                            this.h.c.d(this.b.l(), this);
                            z = true;
                        }
                    }
                }
                return z;
            }
            int v1 = this.d + 1;
            this.d = v1;
            if(v1 >= this.a.size()) {
                return false;
            }
            com.bumptech.glide.load.g g0 = (com.bumptech.glide.load.g)this.a.get(this.d);
            d d0 = new d(g0, this.b.p());
            File file0 = this.b.d().b(d0);
            this.i = file0;
            if(file0 != null) {
                this.e = g0;
                this.f = this.b.j(file0);
                this.g = 0;
            }
        }
    }

    private boolean b() {
        return this.g < this.f.size();
    }

    @Override  // com.bumptech.glide.load.engine.f
    public void cancel() {
        com.bumptech.glide.load.model.o.a o$a0 = this.h;
        if(o$a0 != null) {
            o$a0.c.cancel();
        }
    }

    @Override  // com.bumptech.glide.load.data.d$a
    public void e(Object object0) {
        this.c.d(this.e, object0, this.h.c, com.bumptech.glide.load.a.c, this.e);
    }

    @Override  // com.bumptech.glide.load.data.d$a
    public void f(@NonNull Exception exception0) {
        this.c.b(this.e, exception0, this.h.c, com.bumptech.glide.load.a.c);
    }
}

