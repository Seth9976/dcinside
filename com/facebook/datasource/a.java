package com.facebook.datasource;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public abstract class com.facebook.datasource.a implements d {
    public interface c {
        Runnable a(Runnable arg1, String arg2);
    }

    static enum com.facebook.datasource.a.d {
        IN_PROGRESS,
        SUCCESS,
        FAILURE;

    }

    @h
    private Map a;
    @p3.a("this")
    private com.facebook.datasource.a.d b;
    @p3.a("this")
    private boolean c;
    @h
    @p3.a("this")
    private Object d;
    @h
    @p3.a("this")
    private Throwable e;
    @p3.a("this")
    private float f;
    private final ConcurrentLinkedQueue g;
    @h
    private static volatile c h;

    protected com.facebook.datasource.a() {
        this.d = null;
        this.e = null;
        this.f = 0.0f;
        this.c = false;
        this.b = com.facebook.datasource.a.d.a;
        this.g = new ConcurrentLinkedQueue();
    }

    @Override  // com.facebook.datasource.d
    public boolean a() {
        synchronized(this) {
        }
        return this.d != null;
    }

    @Override  // com.facebook.datasource.d
    @h
    public Throwable c() {
        synchronized(this) {
        }
        return this.e;
    }

    @Override  // com.facebook.datasource.d
    public boolean close() {
        synchronized(this) {
            if(this.c) {
                return false;
            }
            this.c = true;
            Object object0 = this.d;
            this.d = null;
            if(object0 != null) {
                this.h(object0);
            }
            if(!this.g()) {
                this.k();
            }
            synchronized(this) {
                this.g.clear();
            }
        }
        return true;
    }

    @Override  // com.facebook.datasource.d
    public void d(g g0, Executor executor0) {
        com.facebook.common.internal.n.i(g0);
        com.facebook.common.internal.n.i(executor0);
        synchronized(this) {
            if(this.c) {
                return;
            }
            if(this.b == com.facebook.datasource.a.d.a) {
                Pair pair0 = Pair.create(g0, executor0);
                this.g.add(pair0);
            }
            boolean z = this.a() || this.g() || this.w();
        }
        if(z) {
            this.j(g0, executor0, this.f(), this.w());
        }
    }

    @Override  // com.facebook.datasource.d
    public boolean e() {
        return false;
    }

    @Override  // com.facebook.datasource.d
    public boolean f() {
        synchronized(this) {
        }
        return this.b == com.facebook.datasource.a.d.c;
    }

    @Override  // com.facebook.datasource.d
    public boolean g() {
        synchronized(this) {
        }
        return this.b != com.facebook.datasource.a.d.a;
    }

    @Override  // com.facebook.datasource.d
    @h
    public Map getExtras() {
        return this.a;
    }

    @Override  // com.facebook.datasource.d
    public float getProgress() {
        synchronized(this) {
        }
        return this.f;
    }

    @Override  // com.facebook.datasource.d
    @h
    public Object getResult() {
        synchronized(this) {
        }
        return this.d;
    }

    protected void h(@h Object object0) {
    }

    @h
    public static c i() {
        return com.facebook.datasource.a.h;
    }

    @Override  // com.facebook.datasource.d
    public boolean isClosed() {
        synchronized(this) {
        }
        return this.c;
    }

    protected void j(g g0, Executor executor0, boolean z, boolean z1) {
        class com.facebook.datasource.a.a implements Runnable {
            final boolean a;
            final g b;
            final boolean c;
            final com.facebook.datasource.a d;

            com.facebook.datasource.a.a(boolean z, g g0, boolean z1) {
                this.a = z;
                this.b = g0;
                this.c = z1;
                super();
            }

            @Override
            public void run() {
                if(this.a) {
                    this.b.c(com.facebook.datasource.a.this);
                    return;
                }
                if(this.c) {
                    this.b.a(com.facebook.datasource.a.this);
                    return;
                }
                this.b.d(com.facebook.datasource.a.this);
            }
        }

        Runnable runnable0 = new com.facebook.datasource.a.a(this, z, g0, z1);
        c a$c0 = com.facebook.datasource.a.i();
        if(a$c0 != null) {
            runnable0 = a$c0.a(runnable0, "AbstractDataSource_notifyDataSubscriber");
        }
        executor0.execute(runnable0);
    }

    private void k() {
        boolean z = this.f();
        boolean z1 = this.w();
        for(Object object0: this.g) {
            this.j(((g)((Pair)object0).first), ((Executor)((Pair)object0).second), z, z1);
        }
    }

    protected void l() {
        class b implements Runnable {
            final g a;
            final com.facebook.datasource.a b;

            b(g g0) {
                this.a = g0;
                super();
            }

            @Override
            public void run() {
                this.a.b(com.facebook.datasource.a.this);
            }
        }

        for(Object object0: this.g) {
            ((Executor)((Pair)object0).second).execute(new b(this, ((g)((Pair)object0).first)));
        }
    }

    public static void m(@h c a$c0) {
        com.facebook.datasource.a.h = a$c0;
    }

    protected void n(@h Map map0) {
        this.a = map0;
    }

    protected boolean o(Throwable throwable0) {
        return this.p(throwable0, null);
    }

    protected boolean p(@h Throwable throwable0, @h Map map0) {
        boolean z = this.q(throwable0, map0);
        if(z) {
            this.k();
        }
        return z;
    }

    private boolean q(@h Throwable throwable0, @h Map map0) {
        synchronized(this) {
            if(!this.c && this.b == com.facebook.datasource.a.d.a) {
                this.b = com.facebook.datasource.a.d.c;
                this.e = throwable0;
                this.a = map0;
                return true;
            }
        }
        return false;
    }

    protected boolean r(float f) {
        boolean z = this.s(f);
        if(z) {
            this.l();
        }
        return z;
    }

    private boolean s(float f) {
        synchronized(this) {
            if(!this.c && this.b == com.facebook.datasource.a.d.a) {
                if(f < this.f) {
                    return false;
                }
                this.f = f;
                return true;
            }
        }
        return false;
    }

    public boolean t(@h Object object0, boolean z) {
        return this.u(object0, z, null);
    }

    protected boolean u(@h Object object0, boolean z, @h Map map0) {
        this.n(map0);
        boolean z1 = this.v(object0, z);
        if(z1) {
            this.k();
        }
        return z1;
    }

    private boolean v(@h Object object0, boolean z) {
        Object object1 = null;
        try {
            __monitor_enter(this);
        }
        catch(Throwable throwable0) {
            goto label_27;
        }
        try {
            if(!this.c && this.b == com.facebook.datasource.a.d.a) {
                if(z) {
                    this.b = com.facebook.datasource.a.d.b;
                    this.f = 1.0f;
                }
                goto label_6;
            }
            goto label_16;
        }
        catch(Throwable throwable1) {
            goto label_24;
        }
    label_6:
        Object object2 = this.d;
        if(object2 == object0) {
            object0 = null;
        }
        else {
            this.d = object0;
            object0 = object2;
        }
        try {
            __monitor_exit(this);
            if(object0 != null) {
                goto label_14;
            }
            return true;
        }
        catch(Throwable throwable2) {
            goto label_19;
        }
    label_14:
        this.h(object0);
        return true;
        try {
        label_16:
            __monitor_exit(this);
            goto label_30;
        }
        catch(Throwable throwable2) {
        label_19:
            object1 = object0;
            throwable1 = throwable2;
            try {
                while(true) {
                    __monitor_exit(this);
                    break;
                label_24:
                }
            }
            catch(Throwable throwable1) {
                goto label_24;
            }
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable0) {
        label_27:
            if(object1 != null) {
                this.h(object1);
            }
            throw throwable0;
        }
    label_30:
        if(object0 != null) {
            this.h(object0);
        }
        return false;
    }

    private boolean w() {
        synchronized(this) {
            return this.isClosed() && !this.g();
        }
    }
}

