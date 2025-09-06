package rx.subscriptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import rx.exceptions.c;
import rx.o;

public final class b implements o {
    private Set a;
    private volatile boolean b;

    public b() {
    }

    public b(o[] arr_o) {
        this.a = new HashSet(Arrays.asList(arr_o));
    }

    public void a(o o0) {
        if(o0.j()) {
            return;
        }
        if(!this.b) {
            synchronized(this) {
                if(!this.b) {
                    if(this.a == null) {
                        this.a = new HashSet(4);
                    }
                    this.a.add(o0);
                    return;
                }
            }
        }
        o0.l();
    }

    public void b(o[] arr_o) {
        int v = 0;
        if(!this.b) {
            synchronized(this) {
                if(!this.b) {
                    if(this.a == null) {
                        this.a = new HashSet(arr_o.length);
                    }
                    while(v < arr_o.length) {
                        o o0 = arr_o[v];
                        if(!o0.j()) {
                            this.a.add(o0);
                        }
                        ++v;
                    }
                    return;
                }
            }
        }
        while(v < arr_o.length) {
            arr_o[v].l();
            ++v;
        }
    }

    public void c() {
        if(!this.b) {
            synchronized(this) {
                if(!this.b) {
                    Set set0 = this.a;
                    if(set0 != null) {
                        this.a = null;
                        b.f(set0);
                    }
                }
            }
        }
    }

    public boolean d() {
        boolean z = false;
        if(!this.b) {
            synchronized(this) {
                if(!this.b && (this.a != null && !this.a.isEmpty())) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    public void e(o o0) {
        if(!this.b) {
            synchronized(this) {
                if(this.b) {
                    return;
                }
                Set set0 = this.a;
                if(set0 == null) {
                    return;
                }
                boolean z = set0.remove(o0);
            }
            if(z) {
                o0.l();
            }
        }
    }

    private static void f(Collection collection0) {
        if(collection0 == null) {
            return;
        }
        List list0 = null;
        for(Object object0: collection0) {
            o o0 = (o)object0;
            try {
                o0.l();
            }
            catch(Throwable throwable0) {
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                list0.add(throwable0);
            }
        }
        c.d(list0);
    }

    @Override  // rx.o
    public boolean j() {
        return this.b;
    }

    @Override  // rx.o
    public void l() {
        Set set0;
        if(!this.b) {
            synchronized(this) {
                if(this.b) {
                    return;
                }
                this.b = true;
                set0 = this.a;
                this.a = null;
            }
            b.f(set0);
        }
    }
}

