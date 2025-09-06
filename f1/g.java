package f1;

import android.os.SystemClock;
import android.util.Pair;
import com.facebook.imagepipeline.request.d;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class g implements f {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private final long c(Long long0, long v) {
            return long0 == null ? -1L : v - ((long)long0);
        }

        private final long d() {
            return SystemClock.uptimeMillis();
        }
    }

    @p3.a("this")
    @l
    private final Map a;
    @p3.a("this")
    @l
    private final Map b;
    @l
    public static final a c = null;
    @l
    private static final String d = "RequestLoggingListener";

    static {
        g.c = new a(null);
    }

    public g() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    @Override  // com.facebook.imagepipeline.producers.m0
    public void a(@l String s, @l String s1) {
        synchronized(this) {
            L.p(s, "requestId");
            L.p(s1, "producerName");
            if(x0.a.R(2)) {
                Pair pair0 = Pair.create(s, s1);
                long v1 = g.c.d();
                this.a.put(pair0, v1);
                x0.a.f0("RequestLoggingListener", "time %d: onProducerStart: {requestId: %s, producer: %s}", v1, s, s1);
            }
        }
    }

    @Override  // f1.f
    public void b(@l d d0, @l String s, boolean z) {
        synchronized(this) {
            L.p(d0, "request");
            L.p(s, "requestId");
            if(x0.a.R(2)) {
                Long long0 = (Long)this.b.remove(s);
                long v1 = g.c.d();
                x0.a.f0("RequestLoggingListener", "time %d: onRequestSuccess: {requestId: %s, elapsedTime: %d ms}", v1, s, g.c.c(long0, v1));
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.m0
    public void c(@l String s, @l String s1, @l Throwable throwable0, @m Map map0) {
        synchronized(this) {
            L.p(s, "requestId");
            L.p(s1, "producerName");
            L.p(throwable0, "throwable");
            if(x0.a.R(5)) {
                Pair pair0 = Pair.create(s, s1);
                Long long0 = (Long)this.a.remove(pair0);
                long v1 = g.c.d();
                x0.a.r0("RequestLoggingListener", throwable0, "time %d: onProducerFinishWithFailure: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s, throwable: %s}", new Object[]{v1, s, s1, g.c.c(long0, v1), map0, throwable0.toString()});
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.m0
    public void d(@l String s, @l String s1, @l String s2) {
        synchronized(this) {
            L.p(s, "requestId");
            L.p(s1, "producerName");
            L.p(s2, "producerEventName");
            if(x0.a.R(2)) {
                Pair pair0 = Pair.create(s, s1);
                Long long0 = (Long)this.a.get(pair0);
                long v1 = g.c.d();
                x0.a.i0("RequestLoggingListener", "time %d: onProducerEvent: {requestId: %s, stage: %s, eventName: %s; elapsedTime: %d ms}", new Object[]{g.c.d(), s, s1, s2, g.c.c(long0, v1)});
            }
        }
    }

    @Override  // f1.f
    public void e(@l d d0, @l Object object0, @l String s, boolean z) {
        synchronized(this) {
            L.p(d0, "request");
            L.p(object0, "callerContextObject");
            L.p(s, "requestId");
            if(x0.a.R(2)) {
                x0.a.g0("RequestLoggingListener", "time %d: onRequestSubmit: {requestId: %s, callerContext: %s, isPrefetch: %b}", g.c.d(), s, object0, Boolean.valueOf(z));
                Long long0 = g.c.d();
                this.b.put(s, long0);
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.m0
    public boolean f(@l String s) {
        L.p(s, "id");
        return x0.a.R(2);
    }

    @Override  // com.facebook.imagepipeline.producers.m0
    public void g(@l String s, @l String s1, @m Map map0) {
        synchronized(this) {
            L.p(s, "requestId");
            L.p(s1, "producerName");
            if(x0.a.R(2)) {
                Pair pair0 = Pair.create(s, s1);
                Long long0 = (Long)this.a.remove(pair0);
                long v1 = g.c.d();
                x0.a.i0("RequestLoggingListener", "time %d: onProducerFinishWithSuccess: {requestId: %s, producer: %s, elapsedTime: %d ms, extraMap: %s}", new Object[]{v1, s, s1, g.c.c(long0, v1), map0});
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.m0
    public void h(@l String s, @l String s1, @m Map map0) {
        synchronized(this) {
            L.p(s, "requestId");
            L.p(s1, "producerName");
            if(x0.a.R(2)) {
                Pair pair0 = Pair.create(s, s1);
                Long long0 = (Long)this.a.remove(pair0);
                long v1 = g.c.d();
                x0.a.i0("RequestLoggingListener", "time %d: onProducerFinishWithCancellation: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s}", new Object[]{v1, s, s1, g.c.c(long0, v1), map0});
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.m0
    public void i(@l String s, @l String s1, boolean z) {
        synchronized(this) {
            L.p(s, "requestId");
            L.p(s1, "producerName");
            if(x0.a.R(2)) {
                Pair pair0 = Pair.create(s, s1);
                Long long0 = (Long)this.a.remove(pair0);
                long v1 = g.c.d();
                x0.a.i0("RequestLoggingListener", "time %d: onUltimateProducerReached: {requestId: %s, producer: %s, elapsedTime: %d ms, success: %b}", new Object[]{v1, s, s1, g.c.c(long0, v1), Boolean.valueOf(z)});
            }
        }
    }

    @Override  // f1.f
    public void j(@l d d0, @l String s, @l Throwable throwable0, boolean z) {
        synchronized(this) {
            L.p(d0, "request");
            L.p(s, "requestId");
            L.p(throwable0, "throwable");
            if(x0.a.R(5)) {
                Long long0 = (Long)this.b.remove(s);
                long v1 = g.c.d();
                x0.a.q0("RequestLoggingListener", "time %d: onRequestFailure: {requestId: %s, elapsedTime: %d ms, throwable: %s}", new Object[]{v1, s, g.c.c(long0, v1), throwable0.toString()});
            }
        }
    }

    @Override  // f1.f
    public void k(@l String s) {
        synchronized(this) {
            L.p(s, "requestId");
            if(x0.a.R(2)) {
                Long long0 = (Long)this.b.remove(s);
                long v1 = g.c.d();
                x0.a.f0("RequestLoggingListener", "time %d: onRequestCancellation: {requestId: %s, elapsedTime: %d ms}", v1, s, g.c.c(long0, v1));
            }
        }
    }
}

