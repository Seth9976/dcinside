package io.reactivex.internal.disposables;

import io.reactivex.disposables.c;
import io.reactivex.exceptions.a;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.util.k;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class f implements c, io.reactivex.internal.disposables.c {
    List a;
    volatile boolean b;

    public f() {
    }

    public f(Iterable iterable0) {
        b.g(iterable0, "resources is null");
        this.a = new LinkedList();
        for(Object object0: iterable0) {
            b.g(((c)object0), "Disposable item is null");
            this.a.add(((c)object0));
        }
    }

    public f(c[] arr_c) {
        b.g(arr_c, "resources is null");
        this.a = new LinkedList();
        for(int v = 0; v < arr_c.length; ++v) {
            c c0 = arr_c[v];
            b.g(c0, "Disposable item is null");
            this.a.add(c0);
        }
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.b;
    }

    @Override  // io.reactivex.internal.disposables.c
    public boolean b(c c0) {
        if(this.c(c0)) {
            c0.dispose();
            return true;
        }
        return false;
    }

    @Override  // io.reactivex.internal.disposables.c
    public boolean c(c c0) {
        b.g(c0, "Disposable item is null");
        if(this.b) {
            return false;
        }
        synchronized(this) {
            return this.b ? false : this.a != null && this.a.remove(c0);
        }
    }

    @Override  // io.reactivex.internal.disposables.c
    public boolean d(c c0) {
        b.g(c0, "d is null");
        if(!this.b) {
            synchronized(this) {
                if(!this.b) {
                    List list0 = this.a;
                    if(list0 == null) {
                        list0 = new LinkedList();
                        this.a = list0;
                    }
                    list0.add(c0);
                    return true;
                }
            }
        }
        c0.dispose();
        return false;
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        List list0;
        if(this.b) {
            return;
        }
        synchronized(this) {
            if(this.b) {
                return;
            }
            this.b = true;
            list0 = this.a;
            this.a = null;
        }
        this.g(list0);
    }

    public boolean e(c[] arr_c) {
        b.g(arr_c, "ds is null");
        if(!this.b) {
            synchronized(this) {
                if(!this.b) {
                    List list0 = this.a;
                    if(list0 == null) {
                        list0 = new LinkedList();
                        this.a = list0;
                    }
                    for(int v = 0; v < arr_c.length; ++v) {
                        c c0 = arr_c[v];
                        b.g(c0, "d is null");
                        list0.add(c0);
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
        List list0;
        if(this.b) {
            return;
        }
        synchronized(this) {
            if(this.b) {
                return;
            }
            list0 = this.a;
            this.a = null;
        }
        this.g(list0);
    }

    void g(List list0) {
        if(list0 == null) {
            return;
        }
        List list1 = null;
        for(Object object0: list0) {
            c c0 = (c)object0;
            try {
                c0.dispose();
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                if(list1 == null) {
                    list1 = new ArrayList();
                }
                list1.add(throwable0);
            }
        }
        if(list1 != null) {
            if(list1.size() != 1) {
                throw new a(list1);
            }
            throw k.f(((Throwable)list1.get(0)));
        }
        return;
    }
}

