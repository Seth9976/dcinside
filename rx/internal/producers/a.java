package rx.internal.producers;

import rx.i;

public final class a implements i {
    static final class rx.internal.producers.a.a implements i {
        @Override  // rx.i
        public void request(long v) {
        }
    }

    long a;
    i b;
    boolean c;
    long d;
    long e;
    i f;
    static final i g;

    static {
        a.g = new rx.internal.producers.a.a();
    }

    public void a() {
        i i0;
        long v1;
        long v;
        while(true) {
            synchronized(this) {
                v = this.d;
                v1 = this.e;
                i0 = this.f;
                int v2 = Long.compare(v, 0L);
                if(v2 == 0 && v1 == 0L && i0 == null) {
                    this.c = false;
                    return;
                }
                this.d = 0L;
                this.e = 0L;
                this.f = null;
            }
            long v3 = this.a;
            if(v3 != 0x7FFFFFFFFFFFFFFFL) {
                long v4 = v3 + v;
                if(v4 < 0L || v4 == 0x7FFFFFFFFFFFFFFFL) {
                    this.a = 0x7FFFFFFFFFFFFFFFL;
                    v3 = 0x7FFFFFFFFFFFFFFFL;
                }
                else {
                    v3 = v4 - v1;
                    if(v3 < 0L) {
                        throw new IllegalStateException("more produced than requested");
                    }
                    this.a = v3;
                }
            }
            if(i0 == null) {
                i i1 = this.b;
                if(i1 != null && v2 != 0) {
                    i1.request(v);
                }
            }
            else if(i0 == a.g) {
                this.b = null;
            }
            else {
                this.b = i0;
                i0.request(v3);
            }
        }
    }

    public void b(long v) {
        if(v <= 0L) {
            throw new IllegalArgumentException("n > 0 required");
        }
        synchronized(this) {
            if(this.c) {
                this.e += v;
                return;
            }
            this.c = true;
        }
        try {
            long v1 = this.a;
            if(v1 != 0x7FFFFFFFFFFFFFFFL) {
                long v2 = v1 - v;
                if(v2 < 0L) {
                    throw new IllegalStateException("more items arrived than were requested");
                }
                this.a = v2;
            }
            this.a();
            return;
        }
        catch(Throwable throwable0) {
        }
        synchronized(this) {
            this.c = false;
        }
        throw throwable0;
    }

    public void c(i i0) {
        synchronized(this) {
            if(this.c) {
                if(i0 == null) {
                    i0 = a.g;
                }
                this.f = i0;
                return;
            }
            this.c = true;
        }
        try {
            this.b = i0;
            if(i0 != null) {
                i0.request(this.a);
            }
            this.a();
            return;
        }
        catch(Throwable throwable0) {
        }
        synchronized(this) {
            this.c = false;
        }
        throw throwable0;
    }

    @Override  // rx.i
    public void request(long v) {
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if(v1 == 0) {
            return;
        }
        synchronized(this) {
            if(this.c) {
                this.d += v;
                return;
            }
            this.c = true;
        }
        try {
            this.a = this.a + v >= 0L ? this.a + v : 0x7FFFFFFFFFFFFFFFL;
            i i0 = this.b;
            if(i0 != null) {
                i0.request(v);
            }
            this.a();
            return;
        }
        catch(Throwable throwable0) {
        }
        synchronized(this) {
            this.c = false;
        }
        throw throwable0;
    }
}

