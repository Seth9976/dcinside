package com.google.common.util.concurrent;

import J1.b;
import J1.d;
import com.google.common.base.H;
import com.google.common.base.t;
import com.google.common.collect.D3;
import j..util.DesugarCollections;
import j..util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import o3.a;

@b
@d
@N
public final class z implements Serializable {
    private final ConcurrentHashMap a;
    @P1.b
    @a
    private transient Map b;

    private z(ConcurrentHashMap concurrentHashMap0) {
        this.a = (ConcurrentHashMap)H.E(concurrentHashMap0);
    }

    @O1.a
    public long a(Object object0, long v) {
        long v1;
        while(true) {
            AtomicLong atomicLong0 = (AtomicLong)this.a.get(object0);
            if(atomicLong0 == null) {
                AtomicLong atomicLong1 = new AtomicLong(v);
                atomicLong0 = (AtomicLong)this.a.putIfAbsent(object0, atomicLong1);
                if(atomicLong0 == null) {
                    return v;
                }
            }
        label_6:
            v1 = atomicLong0.get();
            if(v1 != 0L) {
                break;
            }
            AtomicLong atomicLong2 = new AtomicLong(v);
            if(!this.a.replace(object0, atomicLong0, atomicLong2)) {
                continue;
            }
            return v;
        }
        long v2 = v1 + v;
        if(!atomicLong0.compareAndSet(v1, v2)) {
            goto label_6;
        }
        return v2;
    }

    public Map b() {
        Map map0 = this.b;
        if(map0 == null) {
            map0 = this.g();
            this.b = map0;
        }
        return map0;
    }

    public void c() {
        this.a.clear();
    }

    public boolean d(Object object0) {
        return this.a.containsKey(object0);
    }

    public static z e() {
        return new z(new ConcurrentHashMap());
    }

    public static z f(Map map0) {
        z z0 = z.e();
        z0.p(map0);
        return z0;
    }

    private Map g() {
        class com.google.common.util.concurrent.z.a implements t {
            public Long a(AtomicLong atomicLong0) {
                return atomicLong0.get();
            }

            @Override  // com.google.common.base.t
            public Object apply(Object object0) {
                return this.a(((AtomicLong)object0));
            }
        }

        com.google.common.util.concurrent.z.a z$a0 = new com.google.common.util.concurrent.z.a(this);
        return DesugarCollections.unmodifiableMap(D3.D0(this.a, z$a0));
    }

    @O1.a
    public long h(Object object0) {
        return this.a(object0, -1L);
    }

    public long i(Object object0) {
        AtomicLong atomicLong0 = (AtomicLong)this.a.get(object0);
        return atomicLong0 == null ? 0L : atomicLong0.get();
    }

    @O1.a
    public long j(Object object0, long v) {
        long v1;
        while(true) {
            AtomicLong atomicLong0 = (AtomicLong)this.a.get(object0);
            if(atomicLong0 == null) {
                AtomicLong atomicLong1 = new AtomicLong(v);
                atomicLong0 = (AtomicLong)this.a.putIfAbsent(object0, atomicLong1);
                if(atomicLong0 == null) {
                    return 0L;
                }
            }
        label_6:
            v1 = atomicLong0.get();
            if(v1 != 0L) {
                break;
            }
            AtomicLong atomicLong2 = new AtomicLong(v);
            if(!this.a.replace(object0, atomicLong0, atomicLong2)) {
                continue;
            }
            return 0L;
        }
        if(!atomicLong0.compareAndSet(v1, v1 + v)) {
            goto label_6;
        }
        return v1;
    }

    @O1.a
    public long k(Object object0) {
        return this.j(object0, -1L);
    }

    @O1.a
    public long l(Object object0) {
        return this.j(object0, 1L);
    }

    @O1.a
    public long m(Object object0) {
        return this.a(object0, 1L);
    }

    public boolean n() {
        return this.a.isEmpty();
    }

    @O1.a
    public long o(Object object0, long v) {
        long v1;
        while(true) {
            AtomicLong atomicLong0 = (AtomicLong)this.a.get(object0);
            if(atomicLong0 == null) {
                AtomicLong atomicLong1 = new AtomicLong(v);
                atomicLong0 = (AtomicLong)this.a.putIfAbsent(object0, atomicLong1);
                if(atomicLong0 == null) {
                    return 0L;
                }
            }
        label_6:
            v1 = atomicLong0.get();
            if(v1 != 0L) {
                break;
            }
            AtomicLong atomicLong2 = new AtomicLong(v);
            if(!this.a.replace(object0, atomicLong0, atomicLong2)) {
                continue;
            }
            return 0L;
        }
        if(!atomicLong0.compareAndSet(v1, v)) {
            goto label_6;
        }
        return v1;
    }

    public void p(Map map0) {
        for(Object object0: map0.entrySet()) {
            this.o(((Map.Entry)object0).getKey(), ((long)(((Long)((Map.Entry)object0).getValue()))));
        }
    }

    long q(Object object0, long v) {
        long v1;
        while(true) {
            AtomicLong atomicLong0 = (AtomicLong)this.a.get(object0);
            if(atomicLong0 == null) {
                AtomicLong atomicLong1 = new AtomicLong(v);
                atomicLong0 = (AtomicLong)this.a.putIfAbsent(object0, atomicLong1);
                if(atomicLong0 == null) {
                    return 0L;
                }
            }
            v1 = atomicLong0.get();
            if(v1 != 0L) {
                break;
            }
            AtomicLong atomicLong2 = new AtomicLong(v);
            if(this.a.replace(object0, atomicLong0, atomicLong2)) {
                return 0L;
            }
        }
        return v1;
    }

    @O1.a
    public long r(Object object0) {
        long v;
        AtomicLong atomicLong0 = (AtomicLong)this.a.get(object0);
        if(atomicLong0 == null) {
            return 0L;
        }
        do {
            v = atomicLong0.get();
        }
        while(v != 0L && !atomicLong0.compareAndSet(v, 0L));
        this.a.remove(object0, atomicLong0);
        return v;
    }

    boolean s(Object object0, long v) {
        AtomicLong atomicLong0 = (AtomicLong)this.a.get(object0);
        if(atomicLong0 == null) {
            return false;
        }
        long v1 = atomicLong0.get();
        if(v1 != v) {
            return false;
        }
        if(v1 != 0L && !atomicLong0.compareAndSet(v1, 0L)) {
            return false;
        }
        this.a.remove(object0, atomicLong0);
        return true;
    }

    @Override
    public String toString() {
        return this.a.toString();
    }

    public void u() {
        Iterator iterator0 = this.a.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            AtomicLong atomicLong0 = (AtomicLong)((Map.Entry)object0).getValue();
            if(atomicLong0 != null && atomicLong0.get() == 0L) {
                iterator0.remove();
            }
        }
    }

    @O1.a
    public boolean w(Object object0) {
        return this.s(object0, 0L);
    }

    boolean x(Object object0, long v, long v1) {
        if(v == 0L) {
            return this.q(object0, v1) == 0L;
        }
        AtomicLong atomicLong0 = (AtomicLong)this.a.get(object0);
        return atomicLong0 == null ? false : atomicLong0.compareAndSet(v, v1);
    }

    public int y() {
        return this.a.size();
    }

    public long z() {
        long v = 0L;
        for(Object object0: this.a.values()) {
            v += ((AtomicLong)object0).get();
        }
        return v;
    }
}

