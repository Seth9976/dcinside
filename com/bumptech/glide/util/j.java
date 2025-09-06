package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;

public class j {
    static final class a {
        final Object a;
        final int b;

        a(Object object0, int v) {
            this.a = object0;
            this.b = v;
        }
    }

    private final Map a;
    private final long b;
    private long c;
    private long d;

    public j(long v) {
        this.a = new LinkedHashMap(100, 0.75f, true);
        this.b = v;
        this.c = v;
    }

    public long a() {
        synchronized(this) {
        }
        return this.c;
    }

    public void c() {
        this.q(0L);
    }

    public void d(float f) {
        synchronized(this) {
            if(f >= 0.0f) {
                this.c = (long)Math.round(((float)this.b) * f);
                this.j();
                return;
            }
        }
        throw new IllegalArgumentException("Multiplier must be >= 0");
    }

    public long e() {
        synchronized(this) {
        }
        return this.d;
    }

    public boolean i(@NonNull Object object0) {
        synchronized(this) {
            return this.a.containsKey(object0);
        }
    }

    private void j() {
        this.q(this.c);
    }

    @Nullable
    public Object k(@NonNull Object object0) {
        synchronized(this) {
            a j$a0 = (a)this.a.get(object0);
            return j$a0 == null ? null : j$a0.a;
        }
    }

    protected int l() {
        synchronized(this) {
        }
        return this.a.size();
    }

    protected int m(@Nullable Object object0) {
        return 1;
    }

    protected void n(@NonNull Object object0, @Nullable Object object1) {
    }

    @Nullable
    public Object o(@NonNull Object object0, @Nullable Object object1) {
        synchronized(this) {
            int v1 = this.m(object1);
            Object object2 = null;
            if(((long)v1) >= this.c) {
                this.n(object0, object1);
                return null;
            }
            if(object1 != null) {
                this.d += (long)v1;
            }
            a j$a0 = object1 == null ? null : new a(object1, v1);
            a j$a1 = (a)this.a.put(object0, j$a0);
            if(j$a1 != null) {
                this.d -= (long)j$a1.b;
                if(!j$a1.a.equals(object1)) {
                    this.n(object0, j$a1.a);
                }
            }
            this.j();
            if(j$a1 != null) {
                object2 = j$a1.a;
            }
            return object2;
        }
    }

    @Nullable
    public Object p(@NonNull Object object0) {
        synchronized(this) {
            a j$a0 = (a)this.a.remove(object0);
            if(j$a0 == null) {
                return null;
            }
            this.d -= (long)j$a0.b;
            return j$a0.a;
        }
    }

    protected void q(long v) {
        synchronized(this) {
            while(this.d > v) {
                Iterator iterator0 = this.a.entrySet().iterator();
                Object object0 = iterator0.next();
                a j$a0 = (a)((Map.Entry)object0).getValue();
                this.d -= (long)j$a0.b;
                Object object1 = ((Map.Entry)object0).getKey();
                iterator0.remove();
                this.n(object1, j$a0.a);
            }
        }
    }
}

