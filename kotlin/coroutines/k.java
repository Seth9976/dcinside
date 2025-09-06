package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.b0;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@b0
@h0(version = "1.3")
public final class k implements d, e {
    static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private static void a() {
        }
    }

    @l
    private final d a;
    @l
    private static final a b;
    private static final AtomicReferenceFieldUpdater c;
    @m
    private volatile Object result;

    static {
        k.b = new a(null);
        k.c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");
    }

    @b0
    public k(@l d d0) {
        L.p(d0, "delegate");
        this(d0, kotlin.coroutines.intrinsics.a.b);
    }

    public k(@l d d0, @m Object object0) {
        L.p(d0, "delegate");
        super();
        this.a = d0;
        this.result = object0;
    }

    @b0
    @m
    public final Object a() {
        Object object0 = this.result;
        kotlin.coroutines.intrinsics.a a0 = kotlin.coroutines.intrinsics.a.b;
        if(object0 == a0) {
            Object object1 = b.l();
            if(androidx.concurrent.futures.a.a(k.c, this, a0, object1)) {
                return b.l();
            }
            object0 = this.result;
        }
        if(object0 == kotlin.coroutines.intrinsics.a.c) {
            return b.l();
        }
        if(object0 instanceof kotlin.e0.b) {
            throw ((kotlin.e0.b)object0).a;
        }
        return object0;
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.coroutines.jvm.internal.e
    @m
    public e getCallerFrame() {
        return this.a instanceof e ? ((e)this.a) : null;
    }

    @Override  // kotlin.coroutines.d
    @l
    public g getContext() {
        return this.a.getContext();
    }

    @Override  // kotlin.coroutines.jvm.internal.e
    @m
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override  // kotlin.coroutines.d
    public void resumeWith(@l Object object0) {
        while(true) {
            while(true) {
                Object object1 = this.result;
                kotlin.coroutines.intrinsics.a a0 = kotlin.coroutines.intrinsics.a.b;
                if(object1 != a0) {
                    break;
                }
                if(androidx.concurrent.futures.a.a(k.c, this, a0, object0)) {
                    return;
                }
            }
            if(object1 != b.l()) {
                break;
            }
            Object object2 = b.l();
            if(androidx.concurrent.futures.a.a(k.c, this, object2, kotlin.coroutines.intrinsics.a.c)) {
                this.a.resumeWith(object0);
                return;
            }
        }
        throw new IllegalStateException("Already resumed");
    }

    @Override
    @l
    public String toString() {
        return "SafeContinuation for " + this.a;
    }
}

