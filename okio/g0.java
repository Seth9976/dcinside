package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import jeb.synthetic.FIN;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,257:1\n1#2:258\n268#3,26:259\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe\n*L\n217#1:259,26\n*E\n"})
public final class g0 {
    private final long a;
    @l
    private final okio.l b;
    private boolean c;
    private boolean d;
    private boolean e;
    @m
    private m0 f;
    @l
    private final ReentrantLock g;
    @l
    private final Condition h;
    @l
    private final m0 i;
    @l
    private final o0 j;

    public g0(long v) {
        @s0({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Pipe.kt\nokio/Pipe\n+ 4 Timeout.kt\nokio/Timeout\n*L\n1#1,257:1\n1#2:258\n217#3:259\n218#3:286\n217#3:287\n218#3:314\n217#3:315\n218#3:342\n268#4,26:260\n268#4,26:288\n268#4,26:316\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n*L\n87#1:259\n87#1:286\n106#1:287\n106#1:314\n124#1:315\n124#1:342\n87#1:260,26\n106#1:288,26\n124#1:316,26\n*E\n"})
        public static final class a implements m0 {
            @l
            private final q0 a;
            final g0 b;

            a(g0 g00) {
                this.b = g00;
                super();
                this.a = new q0();
            }

            @Override  // okio.m0
            public void close() {
                m0 m00;
                ReentrantLock reentrantLock0 = this.b.j();
                g0 g00 = this.b;
                reentrantLock0.lock();
                try {
                    if(!g00.l()) {
                        m00 = g00.i();
                        if(m00 == null) {
                            if(g00.m() && g00.f().size() > 0L) {
                                throw new IOException("source is closed");
                            }
                            g00.p(true);
                            g00.h().signalAll();
                            m00 = null;
                        }
                        goto label_15;
                    }
                    goto label_53;
                }
                catch(Throwable throwable0) {
                }
                reentrantLock0.unlock();
                throw throwable0;
            label_15:
                reentrantLock0.unlock();
                if(m00 != null) {
                    q0 q00 = m00.timeout();
                    q0 q01 = this.b.r().timeout();
                    long v = q00.timeoutNanos();
                    long v1 = q01.timeoutNanos();
                    long v2 = q00.timeoutNanos();
                    TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
                    q00.timeout(q0.Companion.a(v1, v2), timeUnit0);
                    if(q00.hasDeadline()) {
                        long v3 = q00.deadlineNanoTime();
                        if(q01.hasDeadline()) {
                            q00.deadlineNanoTime(Math.min(q00.deadlineNanoTime(), q01.deadlineNanoTime()));
                        }
                        try {
                            m00.close();
                        }
                        catch(Throwable throwable1) {
                            q00.timeout(v, TimeUnit.NANOSECONDS);
                            if(q01.hasDeadline()) {
                                q00.deadlineNanoTime(v3);
                            }
                            throw throwable1;
                        }
                        q00.timeout(v, timeUnit0);
                        if(q01.hasDeadline()) {
                            q00.deadlineNanoTime(v3);
                            return;
                        }
                    }
                    else {
                        if(q01.hasDeadline()) {
                            q00.deadlineNanoTime(q01.deadlineNanoTime());
                        }
                        try {
                            m00.close();
                        }
                        catch(Throwable throwable2) {
                            q00.timeout(v, TimeUnit.NANOSECONDS);
                            if(q01.hasDeadline()) {
                                q00.clearDeadline();
                            }
                            throw throwable2;
                        }
                        q00.timeout(v, timeUnit0);
                        if(q01.hasDeadline()) {
                            q00.clearDeadline();
                            return;
                        }
                    }
                }
                return;
            label_53:
                reentrantLock0.unlock();
            }

            @Override  // okio.m0
            public void flush() {
                ReentrantLock reentrantLock0 = this.b.j();
                g0 g00 = this.b;
                reentrantLock0.lock();
                try {
                    if(!g00.l()) {
                        if(g00.g()) {
                            throw new IOException("canceled");
                        }
                        m0 m00 = g00.i();
                        if(m00 == null) {
                            if(g00.m() && g00.f().size() > 0L) {
                                throw new IOException("source is closed");
                            }
                            m00 = null;
                        }
                        if(m00 != null) {
                            q0 q00 = m00.timeout();
                            q0 q01 = this.b.r().timeout();
                            long v1 = q00.timeoutNanos();
                            long v2 = q01.timeoutNanos();
                            long v3 = q00.timeoutNanos();
                            TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
                            q00.timeout(q0.Companion.a(v2, v3), timeUnit0);
                            if(q00.hasDeadline()) {
                                long v4 = q00.deadlineNanoTime();
                                if(q01.hasDeadline()) {
                                    q00.deadlineNanoTime(Math.min(q00.deadlineNanoTime(), q01.deadlineNanoTime()));
                                }
                                try {
                                    m00.flush();
                                }
                                catch(Throwable throwable0) {
                                    q00.timeout(v1, TimeUnit.NANOSECONDS);
                                    if(q01.hasDeadline()) {
                                        q00.deadlineNanoTime(v4);
                                    }
                                    throw throwable0;
                                }
                                q00.timeout(v1, timeUnit0);
                                if(q01.hasDeadline()) {
                                    q00.deadlineNanoTime(v4);
                                    return;
                                }
                            }
                            else {
                                if(q01.hasDeadline()) {
                                    q00.deadlineNanoTime(q01.deadlineNanoTime());
                                }
                                try {
                                    m00.flush();
                                }
                                catch(Throwable throwable1) {
                                    q00.timeout(v1, TimeUnit.NANOSECONDS);
                                    if(q01.hasDeadline()) {
                                        q00.clearDeadline();
                                    }
                                    throw throwable1;
                                }
                                q00.timeout(v1, timeUnit0);
                                if(q01.hasDeadline()) {
                                    q00.clearDeadline();
                                    return;
                                }
                            }
                        }
                        return;
                    }
                }
                finally {
                    reentrantLock0.unlock();
                }
                throw new IllegalStateException("closed");
            }

            @Override  // okio.m0
            @l
            public q0 timeout() {
                return this.a;
            }

            @Override  // okio.m0
            public void write(@l okio.l l0, long v) {
                m0 m01;
                L.p(l0, "source");
                ReentrantLock reentrantLock0 = this.b.j();
                g0 g00 = this.b;
                reentrantLock0.lock();
                try {
                    if(!g00.l()) {
                        if(g00.g()) {
                            throw new IOException("canceled");
                        }
                        while(v > 0L) {
                            m0 m00 = g00.i();
                            if(m00 != null) {
                                m01 = m00;
                                goto label_27;
                            }
                            if(g00.m()) {
                                throw new IOException("source is closed");
                            }
                            long v2 = g00.k() - g00.f().size();
                            if(v2 == 0L) {
                                this.a.awaitSignal(g00.h());
                                if(g00.g()) {
                                    throw new IOException("canceled");
                                }
                            }
                            else {
                                long v3 = Math.min(v2, v);
                                g00.f().write(l0, v3);
                                v -= v3;
                                g00.h().signalAll();
                            }
                        }
                        m01 = null;
                    label_27:
                        if(m01 != null) {
                            q0 q00 = m01.timeout();
                            q0 q01 = this.b.r().timeout();
                            long v4 = q00.timeoutNanos();
                            long v5 = q01.timeoutNanos();
                            long v6 = q00.timeoutNanos();
                            TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
                            q00.timeout(q0.Companion.a(v5, v6), timeUnit0);
                            if(q00.hasDeadline()) {
                                long v7 = q00.deadlineNanoTime();
                                if(q01.hasDeadline()) {
                                    q00.deadlineNanoTime(Math.min(q00.deadlineNanoTime(), q01.deadlineNanoTime()));
                                }
                                try {
                                    m01.write(l0, v);
                                }
                                catch(Throwable throwable0) {
                                    q00.timeout(v4, TimeUnit.NANOSECONDS);
                                    if(q01.hasDeadline()) {
                                        q00.deadlineNanoTime(v7);
                                    }
                                    throw throwable0;
                                }
                                q00.timeout(v4, timeUnit0);
                                if(q01.hasDeadline()) {
                                    q00.deadlineNanoTime(v7);
                                    return;
                                }
                            }
                            else {
                                if(q01.hasDeadline()) {
                                    q00.deadlineNanoTime(q01.deadlineNanoTime());
                                }
                                try {
                                    m01.write(l0, v);
                                }
                                catch(Throwable throwable1) {
                                    q00.timeout(v4, TimeUnit.NANOSECONDS);
                                    if(q01.hasDeadline()) {
                                        q00.clearDeadline();
                                    }
                                    throw throwable1;
                                }
                                q00.timeout(v4, timeUnit0);
                                if(q01.hasDeadline()) {
                                    q00.clearDeadline();
                                    return;
                                }
                            }
                        }
                        return;
                    }
                }
                finally {
                    reentrantLock0.unlock();
                }
                throw new IllegalStateException("closed");
            }
        }


        @s0({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$source$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n1#2:258\n*E\n"})
        public static final class b implements o0 {
            @l
            private final q0 a;
            final g0 b;

            b(g0 g00) {
                this.b = g00;
                super();
                this.a = new q0();
            }

            @Override  // okio.o0
            public void close() {
                ReentrantLock reentrantLock0 = this.b.j();
                reentrantLock0.lock();
                try {
                    this.b.q(true);
                    this.b.h().signalAll();
                }
                finally {
                    reentrantLock0.unlock();
                }
            }

            @Override  // okio.o0
            public long read(@l okio.l l0, long v) {
                long v1;
                L.p(l0, "sink");
                ReentrantLock reentrantLock0 = this.b.j();
                g0 g00 = this.b;
                reentrantLock0.lock();
                try {
                    if(g00.m()) {
                        throw new IllegalStateException("closed");
                    }
                    if(g00.g()) {
                        throw new IOException("canceled");
                    }
                    while(true) {
                    label_8:
                        if(g00.f().size() != 0L) {
                            v1 = g00.f().read(l0, v);
                            g00.h().signalAll();
                            break;
                        }
                        goto label_13;
                    }
                }
                catch(Throwable throwable0) {
                    reentrantLock0.unlock();
                    throw throwable0;
                }
                reentrantLock0.unlock();
                return v1;
            label_13:
                if(g00.l()) {
                    reentrantLock0.unlock();
                    return -1L;
                }
                try {
                    this.a.awaitSignal(g00.h());
                    if(g00.g()) {
                        throw new IOException("canceled");
                    }
                    goto label_8;
                }
                catch(Throwable throwable0) {
                }
                reentrantLock0.unlock();
                throw throwable0;
            }

            @Override  // okio.o0
            @l
            public q0 timeout() {
                return this.a;
            }
        }

        this.a = v;
        this.b = new okio.l();
        ReentrantLock reentrantLock0 = new ReentrantLock();
        this.g = reentrantLock0;
        Condition condition0 = reentrantLock0.newCondition();
        L.o(condition0, "newCondition(...)");
        this.h = condition0;
        if(v < 1L) {
            throw new IllegalArgumentException(("maxBufferSize < 1: " + v).toString());
        }
        this.i = new a(this);
        this.j = new b(this);
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "sink", imports = {}))
    @l
    @i(name = "-deprecated_sink")
    public final m0 a() {
        return this.i;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "source", imports = {}))
    @l
    @i(name = "-deprecated_source")
    public final o0 b() {
        return this.j;
    }

    public final void c() {
        this.g.lock();
        try {
            this.c = true;
            this.b.c();
            this.h.signalAll();
        }
        finally {
            this.g.unlock();
        }
    }

    public final void d(@l m0 m00) throws IOException {
        int v;
        L.p(m00, "sink");
        while(true) {
            ReentrantLock reentrantLock0 = this.g;
            reentrantLock0.lock();
            v = FIN.finallyOpen$NT();
            if(this.f != null) {
                goto label_36;
            }
            if(this.c) {
                goto label_33;
            }
            if(this.b.j3()) {
                this.e = true;
                this.f = m00;
                FIN.finallyExec$NT(v);
                return;
            }
            boolean z = this.d;
            okio.l l0 = new okio.l();
            l0.write(this.b, this.b.size());
            this.h.signalAll();
            FIN.finallyCodeBegin$NT(v);
            reentrantLock0.unlock();
            FIN.finallyCodeEnd$NT(v);
            try {
                m00.write(l0, l0.size());
                if(z) {
                    m00.close();
                    continue;
                }
                m00.flush();
                continue;
            }
            catch(Throwable throwable0) {
            }
            break;
        }
        this.g.lock();
        try {
            this.e = true;
            this.h.signalAll();
        }
        finally {
            this.g.unlock();
        }
        throw throwable0;
    label_33:
        this.f = m00;
        FIN.finallyExec$NT(v);
        throw new IOException("canceled");
    label_36:
        FIN.finallyExec$NT(v);
        throw new IllegalStateException("sink already folded");
    }

    private final void e(m0 m00, Function1 function10) {
        q0 q00 = m00.timeout();
        q0 q01 = this.r().timeout();
        long v = q00.timeoutNanos();
        long v1 = q01.timeoutNanos();
        long v2 = q00.timeoutNanos();
        TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
        q00.timeout(q0.Companion.a(v1, v2), timeUnit0);
        if(q00.hasDeadline()) {
            long v3 = q00.deadlineNanoTime();
            if(q01.hasDeadline()) {
                q00.deadlineNanoTime(Math.min(q00.deadlineNanoTime(), q01.deadlineNanoTime()));
            }
            try {
                function10.invoke(m00);
            }
            catch(Throwable throwable0) {
                q00.timeout(v, TimeUnit.NANOSECONDS);
                if(q01.hasDeadline()) {
                    q00.deadlineNanoTime(v3);
                }
                throw throwable0;
            }
            q00.timeout(v, timeUnit0);
            if(q01.hasDeadline()) {
                q00.deadlineNanoTime(v3);
            }
        }
        else {
            if(q01.hasDeadline()) {
                q00.deadlineNanoTime(q01.deadlineNanoTime());
            }
            try {
                function10.invoke(m00);
            }
            catch(Throwable throwable1) {
                q00.timeout(v, TimeUnit.NANOSECONDS);
                if(q01.hasDeadline()) {
                    q00.clearDeadline();
                }
                throw throwable1;
            }
            q00.timeout(v, timeUnit0);
            if(q01.hasDeadline()) {
                q00.clearDeadline();
            }
        }
    }

    @l
    public final okio.l f() {
        return this.b;
    }

    public final boolean g() {
        return this.c;
    }

    @l
    public final Condition h() {
        return this.h;
    }

    @m
    public final m0 i() {
        return this.f;
    }

    @l
    public final ReentrantLock j() {
        return this.g;
    }

    public final long k() {
        return this.a;
    }

    public final boolean l() {
        return this.d;
    }

    public final boolean m() {
        return this.e;
    }

    public final void n(boolean z) {
        this.c = z;
    }

    public final void o(@m m0 m00) {
        this.f = m00;
    }

    public final void p(boolean z) {
        this.d = z;
    }

    public final void q(boolean z) {
        this.e = z;
    }

    @l
    @i(name = "sink")
    public final m0 r() {
        return this.i;
    }

    @l
    @i(name = "source")
    public final o0 s() {
        return this.j;
    }
}

