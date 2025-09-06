package rx.internal.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import rx.exceptions.c;
import rx.o;

public final class q implements o {
    private List a;
    private volatile boolean b;

    public q() {
    }

    public q(o o0) {
        LinkedList linkedList0 = new LinkedList();
        this.a = linkedList0;
        linkedList0.add(o0);
    }

    public q(o[] arr_o) {
        this.a = new LinkedList(Arrays.asList(arr_o));
    }

    public void a(o o0) {
        if(o0.j()) {
            return;
        }
        if(!this.b) {
            synchronized(this) {
                if(!this.b) {
                    List list0 = this.a;
                    if(list0 == null) {
                        list0 = new LinkedList();
                        this.a = list0;
                    }
                    list0.add(o0);
                    return;
                }
            }
        }
        o0.l();
    }

    public void b() {
        List list0;
        if(!this.b) {
            synchronized(this) {
                list0 = this.a;
                this.a = null;
            }
            q.e(list0);
        }
    }

    public boolean c() {
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

    public void d(o o0) {
        if(!this.b) {
            synchronized(this) {
                List list0 = this.a;
                if(this.b || list0 == null) {
                    return;
                }
                boolean z = list0.remove(o0);
            }
            if(z) {
                o0.l();
            }
        }
    }

    private static void e(Collection collection0) {
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
        List list0;
        if(!this.b) {
            synchronized(this) {
                if(this.b) {
                    return;
                }
                this.b = true;
                list0 = this.a;
                this.a = null;
            }
            q.e(list0);
        }
    }
}

