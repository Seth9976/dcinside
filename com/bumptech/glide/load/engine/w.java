package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d.a;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.n;
import java.io.File;
import java.util.List;

class w implements a, f {
    private final com.bumptech.glide.load.engine.f.a a;
    private final g b;
    private int c;
    private int d;
    private com.bumptech.glide.load.g e;
    private List f;
    private int g;
    private volatile com.bumptech.glide.load.model.o.a h;
    private File i;
    private x j;

    w(g g0, com.bumptech.glide.load.engine.f.a f$a0) {
        this.d = -1;
        this.b = g0;
        this.a = f$a0;
    }

    @Override  // com.bumptech.glide.load.engine.f
    public boolean a() {
        try {
            boolean z = false;
            List list0 = this.b.c();
            if(!list0.isEmpty()) {
                List list1 = this.b.m();
                if(!list1.isEmpty()) {
                    while(true) {
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
                        if(v1 >= list1.size()) {
                            int v2 = this.c + 1;
                            this.c = v2;
                            if(v2 < list0.size()) {
                                this.d = 0;
                                goto label_27;
                            }
                            return false;
                        }
                    label_27:
                        com.bumptech.glide.load.g g0 = (com.bumptech.glide.load.g)list0.get(this.c);
                        Object object0 = list1.get(this.d);
                        n n0 = this.b.s(((Class)object0));
                        this.j = new x(this.b.b(), g0, this.b.p(), this.b.t(), this.b.f(), n0, ((Class)object0), this.b.k());
                        File file0 = this.b.d().b(this.j);
                        this.i = file0;
                        if(file0 != null) {
                            this.e = g0;
                            this.f = this.b.j(file0);
                            this.g = 0;
                        }
                    }
                }
                if(!File.class.equals(this.b.r())) {
                    throw new IllegalStateException("Failed to find any load path from " + this.b.i() + " to " + this.b.r());
                }
                return false;
            }
            return false;
        }
        catch(Throwable throwable0) {
        }
        throw throwable0;
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
        this.a.d(this.e, object0, this.h.c, com.bumptech.glide.load.a.d, this.j);
    }

    @Override  // com.bumptech.glide.load.data.d$a
    public void f(@NonNull Exception exception0) {
        this.a.b(this.j, exception0, this.h.c, com.bumptech.glide.load.a.d);
    }
}

