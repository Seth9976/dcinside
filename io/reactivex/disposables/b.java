package io.reactivex.disposables;

import d3.f;
import io.reactivex.exceptions.a;
import io.reactivex.internal.util.k;
import io.reactivex.internal.util.s;
import java.util.ArrayList;
import java.util.List;

public final class b implements c, io.reactivex.internal.disposables.c {
    s a;
    volatile boolean b;

    public b() {
    }

    public b(@f Iterable iterable0) {
        io.reactivex.internal.functions.b.g(iterable0, "disposables is null");
        this.a = new s();
        for(Object object0: iterable0) {
            io.reactivex.internal.functions.b.g(((c)object0), "A Disposable item in the disposables sequence is null");
            this.a.a(((c)object0));
        }
    }

    public b(@f c[] arr_c) {
        io.reactivex.internal.functions.b.g(arr_c, "disposables is null");
        this.a = new s(arr_c.length + 1);
        for(int v = 0; v < arr_c.length; ++v) {
            c c0 = arr_c[v];
            io.reactivex.internal.functions.b.g(c0, "A Disposable in the disposables array is null");
            this.a.a(c0);
        }
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.b;
    }

    @Override  // io.reactivex.internal.disposables.c
    public boolean b(@f c c0) {
        if(this.c(c0)) {
            c0.dispose();
            return true;
        }
        return false;
    }

    @Override  // io.reactivex.internal.disposables.c
    public boolean c(@f c c0) {
        io.reactivex.internal.functions.b.g(c0, "disposables is null");
        if(this.b) {
            return false;
        }
        synchronized(this) {
            return this.b ? false : this.a != null && this.a.e(c0);
        }
    }

    @Override  // io.reactivex.internal.disposables.c
    public boolean d(@f c c0) {
        io.reactivex.internal.functions.b.g(c0, "disposable is null");
        if(!this.b) {
            synchronized(this) {
                if(!this.b) {
                    s s0 = this.a;
                    if(s0 == null) {
                        s0 = new s();
                        this.a = s0;
                    }
                    s0.a(c0);
                    return true;
                }
            }
        }
        c0.dispose();
        return false;
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        s s0;
        if(this.b) {
            return;
        }
        synchronized(this) {
            if(this.b) {
                return;
            }
            this.b = true;
            s0 = this.a;
            this.a = null;
        }
        this.g(s0);
    }

    public boolean e(@f c[] arr_c) {
        io.reactivex.internal.functions.b.g(arr_c, "disposables is null");
        if(!this.b) {
            synchronized(this) {
                if(!this.b) {
                    s s0 = this.a;
                    if(s0 == null) {
                        s0 = new s(arr_c.length + 1);
                        this.a = s0;
                    }
                    for(int v = 0; v < arr_c.length; ++v) {
                        c c0 = arr_c[v];
                        io.reactivex.internal.functions.b.g(c0, "A Disposable in the disposables array is null");
                        s0.a(c0);
                    }
                    return true;
                }
            }
        }
        for(int v2 = 0; v2 < arr_c.length; ++v2) {
            arr_c[v2].dispose();
        }
        return false;
    }

    public void f() {
        s s0;
        if(this.b) {
            return;
        }
        synchronized(this) {
            if(this.b) {
                return;
            }
            s0 = this.a;
            this.a = null;
        }
        this.g(s0);
    }

    void g(s s0) {
        if(s0 == null) {
            return;
        }
        Object[] arr_object = s0.b();
        List list0 = null;
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(object0 instanceof c) {
                try {
                    ((c)object0).dispose();
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    if(list0 == null) {
                        list0 = new ArrayList();
                    }
                    list0.add(throwable0);
                }
            }
        }
        if(list0 != null) {
            if(list0.size() == 1) {
                throw k.f(((Throwable)list0.get(0)));
            }
            throw new a(list0);
        }
        return;
    }

    public int h() {
        int v = 0;
        if(this.b) {
            return 0;
        }
        synchronized(this) {
            if(this.b) {
                return 0;
            }
            s s0 = this.a;
            if(s0 != null) {
                v = s0.g();
            }
            return v;
        }
    }
}

