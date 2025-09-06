package rx.internal.util;

import java.util.Queue;
import rx.exceptions.d;
import rx.h;
import rx.internal.operators.x;
import rx.internal.util.atomic.e;
import rx.internal.util.unsafe.r;
import rx.internal.util.unsafe.z;
import rx.o;

public class m implements o {
    private Queue a;
    private final int b;
    public volatile Object c;
    public static final int d;

    static {
        int v = 16;
        String s = System.getProperty("rx.ring-buffer.size");
        if(s != null) {
            try {
                v = Integer.parseInt(s);
            }
            catch(NumberFormatException numberFormatException0) {
                System.err.println("Failed to set \'rx.buffer.size\' with value " + s + " => " + numberFormatException0.getMessage());
            }
        }
        m.d = v;
    }

    m() {
        this(new e(m.d), m.d);
    }

    private m(Queue queue0, int v) {
        this.a = queue0;
        this.b = v;
    }

    private m(boolean z, int v) {
        r r0 = z ? new r(v) : new z(v);
        this.a = r0;
        this.b = v;
    }

    public boolean a(Object object0, h h0) {
        return x.a(h0, object0);
    }

    public Throwable b(Object object0) {
        return x.d(object0);
    }

    public int c() {
        int v = this.e();
        return this.b - v;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.a == null ? 0 : this.a.size();
    }

    // 去混淆评级： 低(30)
    public static m f() {
        return new m(true, m.d);
    }

    // 去混淆评级： 低(30)
    public static m g() {
        return new m(false, m.d);
    }

    public Object h(Object object0) {
        return x.e(object0);
    }

    public boolean i(Object object0) {
        return x.f(object0);
    }

    @Override  // rx.o
    public boolean j() {
        return this.a == null;
    }

    public boolean k() {
        return this.a == null || this.a.isEmpty();
    }

    @Override  // rx.o
    public void l() {
    }

    public boolean m(Object object0) {
        return x.g(object0);
    }

    public void n() {
        if(this.c == null) {
            this.c = x.b();
        }
    }

    public void o(Throwable throwable0) {
        if(this.c == null) {
            this.c = x.c(throwable0);
        }
    }

    public void p(Object object0) throws d {
        synchronized(this) {
            Queue queue0 = this.a;
            boolean z = true;
            int v1 = 0;
            if(queue0 != null) {
                v1 = !queue0.offer(x.j(object0));
                z = false;
            }
        }
        if(z) {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        }
        if(v1 != 0) {
            throw new d();
        }
    }

    public Object q() {
        synchronized(this) {
            Queue queue0 = this.a;
            if(queue0 == null) {
                return null;
            }
            Object object0 = queue0.peek();
            Object object1 = this.c;
            if(object0 == null && object1 != null && queue0.peek() == null) {
                object0 = object1;
            }
            return object0;
        }
    }

    public Object t() {
        synchronized(this) {
            Queue queue0 = this.a;
            if(queue0 == null) {
                return null;
            }
            Object object0 = queue0.poll();
            Object object1 = this.c;
            if(object0 == null && object1 != null && queue0.peek() == null) {
                this.c = null;
                object0 = object1;
            }
            return object0;
        }
    }

    public void v() {
        synchronized(this) {
        }
    }
}

