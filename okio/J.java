package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class j extends q0 {
    @s0({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n1#2:332\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @m
        public final j c() throws InterruptedException {
            j j0 = j.head;
            L.m(j0);
            j j1 = j0.next;
            if(j1 == null) {
                this.e().await(60000L, TimeUnit.MILLISECONDS);
                L.m(j.head);
                return null;
            }
            long v = j1.a(System.nanoTime());
            if(v > 0L) {
                this.e().await(v, TimeUnit.NANOSECONDS);
                return null;
            }
            j j2 = j.head;
            L.m(j2);
            j2.next = j1.next;
            j1.next = null;
            return j1;
        }

        private final boolean d(j j0) {
            ReentrantLock reentrantLock0 = j.Companion.f();
            reentrantLock0.lock();
            try {
                if(!j0.inQueue) {
                    return false;
                }
                j0.inQueue = false;
                for(j j1 = j.head; j1 != null; j1 = j1.next) {
                    if(j1.next == j0) {
                        j1.next = j0.next;
                        j0.next = null;
                        return false;
                    }
                }
                return true;
            }
            finally {
                reentrantLock0.unlock();
            }
        }

        @l
        public final Condition e() {
            return j.condition;
        }

        @l
        public final ReentrantLock f() {
            return j.lock;
        }

        private final void g(j j0, long v, boolean z) {
            ReentrantLock reentrantLock0 = j.Companion.f();
            reentrantLock0.lock();
            try {
                if(!j0.inQueue) {
                    j0.inQueue = true;
                    if(j.head == null) {
                        j.head = new j();
                        new b().start();
                    }
                    long v2 = System.nanoTime();
                    int v3 = Long.compare(v, 0L);
                    if(v3 != 0 && z) {
                        j0.timeoutAt = Math.min(v, j0.deadlineNanoTime() - v2) + v2;
                    }
                    else if(v3 != 0) {
                        j0.timeoutAt = v + v2;
                    }
                    else if(z) {
                        j0.timeoutAt = j0.deadlineNanoTime();
                    }
                    else {
                        throw new AssertionError();
                    }
                    long v4 = j0.a(v2);
                    j j1 = j.head;
                    L.m(j1);
                    while(j1.next != null) {
                        j j2 = j1.next;
                        L.m(j2);
                        if(v4 < j2.a(v2)) {
                            break;
                        }
                        j1 = j1.next;
                        L.m(j1);
                    }
                    j0.next = j1.next;
                    j1.next = j0;
                    if(j1 == j.head) {
                        j.Companion.e().signal();
                    }
                    return;
                }
            }
            finally {
                reentrantLock0.unlock();
            }
            throw new IllegalStateException("Unbalanced enter/exit");
        }
    }

    static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            this.setDaemon(true);
        }

        @Override
        public void run() {
            j j0;
            ReentrantLock reentrantLock0;
            while(true) {
                try {
                label_0:
                    reentrantLock0 = j.Companion.f();
                    reentrantLock0.lock();
                }
                catch(InterruptedException unused_ex) {
                    goto label_0;
                }
                try {
                    j0 = j.Companion.c();
                    if(j0 != j.head) {
                        goto label_4;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_11;
                }
                try {
                label_4:
                    reentrantLock0.unlock();
                    if(j0 == null) {
                        goto label_0;
                    }
                    j0.timedOut();
                }
                catch(InterruptedException unused_ex) {
                }
            }
            try {
                j.head = null;
                goto label_13;
            }
            catch(Throwable throwable0) {
                try {
                label_11:
                    reentrantLock0.unlock();
                    throw throwable0;
                label_13:
                    reentrantLock0.unlock();
                }
                catch(InterruptedException unused_ex) {
                    goto label_0;
                }
            }
        }
    }

    @l
    public static final a Companion = null;
    private static final long IDLE_TIMEOUT_MILLIS = 0L;
    private static final long IDLE_TIMEOUT_NANOS = 0L;
    private static final int TIMEOUT_WRITE_SIZE = 0x10000;
    @l
    private static final Condition condition;
    @m
    private static j head;
    private boolean inQueue;
    @l
    private static final ReentrantLock lock;
    @m
    private j next;
    private long timeoutAt;

    static {
        j.Companion = new a(null);
        ReentrantLock reentrantLock0 = new ReentrantLock();
        j.lock = reentrantLock0;
        Condition condition0 = reentrantLock0.newCondition();
        L.o(condition0, "newCondition(...)");
        j.condition = condition0;
        long v = TimeUnit.SECONDS.toMillis(60L);
        j.IDLE_TIMEOUT_MILLIS = v;
        j.IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(v);
    }

    private final long a(long v) {
        return this.timeoutAt - v;
    }

    public static final long access$getIDLE_TIMEOUT_MILLIS$cp() [...] // 潜在的解密器

    public static final long access$getIDLE_TIMEOUT_NANOS$cp() [...] // 潜在的解密器

    @b0
    @l
    public final IOException access$newTimeoutException(@m IOException iOException0) {
        return this.newTimeoutException(iOException0);
    }

    public final void enter() {
        long v = this.timeoutNanos();
        boolean z = this.hasDeadline();
        if(v == 0L && !z) {
            return;
        }
        j.Companion.g(this, v, z);
    }

    public final boolean exit() {
        return j.Companion.d(this);
    }

    @l
    protected IOException newTimeoutException(@m IOException iOException0) {
        IOException iOException1 = new InterruptedIOException("timeout");
        if(iOException0 != null) {
            iOException1.initCause(iOException0);
        }
        return iOException1;
    }

    @l
    public final m0 sink(@l m0 m00) {
        @s0({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,331:1\n146#2,11:332\n146#2,11:343\n146#2,11:354\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n*L\n102#1:332,11\n108#1:343,11\n112#1:354,11\n*E\n"})
        public static final class c implements m0 {
            final j a;
            final m0 b;

            c(j j0, m0 m00) {
                this.a = j0;
                this.b = m00;
                super();
            }

            @l
            public j a() {
                return this.a;
            }

            @Override  // okio.m0
            public void close() {
                j j0 = this.a;
                j0.enter();
                try {
                    try {
                        this.b.close();
                    }
                    catch(IOException iOException0) {
                        if(j0.exit()) {
                            iOException0 = j0.access$newTimeoutException(iOException0);
                        }
                        throw iOException0;
                    }
                }
                catch(Throwable throwable0) {
                    j0.exit();
                    throw throwable0;
                }
                if(j0.exit()) {
                    throw j0.access$newTimeoutException(null);
                }
            }

            @Override  // okio.m0
            public void flush() {
                j j0 = this.a;
                j0.enter();
                try {
                    try {
                        this.b.flush();
                    }
                    catch(IOException iOException0) {
                        if(j0.exit()) {
                            iOException0 = j0.access$newTimeoutException(iOException0);
                        }
                        throw iOException0;
                    }
                }
                catch(Throwable throwable0) {
                    j0.exit();
                    throw throwable0;
                }
                if(j0.exit()) {
                    throw j0.access$newTimeoutException(null);
                }
            }

            @Override  // okio.m0
            public q0 timeout() {
                return this.a();
            }

            @Override
            @l
            public String toString() {
                return "AsyncTimeout.sink(" + this.b + ')';
            }

            @Override  // okio.m0
            public void write(@l okio.l l0, long v) {
                L.p(l0, "source");
                i.e(l0.size(), 0L, v);
                while(true) {
                    long v1 = 0L;
                    if(v <= 0L) {
                        break;
                    }
                    j0 j00 = l0.a;
                    L.m(j00);
                    while(v1 < 0x10000L) {
                        v1 += (long)(j00.c - j00.b);
                        if(v1 >= v) {
                            v1 = v;
                            break;
                        }
                        j00 = j00.f;
                        L.m(j00);
                    }
                    j j0 = this.a;
                    j0.enter();
                    try {
                        try {
                            this.b.write(l0, v1);
                        }
                        catch(IOException iOException0) {
                            if(j0.exit()) {
                                iOException0 = j0.access$newTimeoutException(iOException0);
                            }
                            throw iOException0;
                        }
                    }
                    catch(Throwable throwable0) {
                        j0.exit();
                        throw throwable0;
                    }
                    if(j0.exit()) {
                        throw j0.access$newTimeoutException(null);
                    }
                    v -= v1;
                }
            }
        }

        L.p(m00, "sink");
        return new c(this, m00);
    }

    @l
    public final o0 source(@l o0 o00) {
        @s0({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,331:1\n146#2,11:332\n146#2,11:343\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n*L\n128#1:332,11\n132#1:343,11\n*E\n"})
        public static final class d implements o0 {
            final j a;
            final o0 b;

            d(j j0, o0 o00) {
                this.a = j0;
                this.b = o00;
                super();
            }

            @l
            public j a() {
                return this.a;
            }

            @Override  // okio.o0
            public void close() {
                j j0 = this.a;
                j0.enter();
                try {
                    try {
                        this.b.close();
                    }
                    catch(IOException iOException0) {
                        if(j0.exit()) {
                            iOException0 = j0.access$newTimeoutException(iOException0);
                        }
                        throw iOException0;
                    }
                }
                catch(Throwable throwable0) {
                    j0.exit();
                    throw throwable0;
                }
                if(j0.exit()) {
                    throw j0.access$newTimeoutException(null);
                }
            }

            @Override  // okio.o0
            public long read(@l okio.l l0, long v) {
                long v1;
                L.p(l0, "sink");
                j j0 = this.a;
                j0.enter();
                try {
                    try {
                        v1 = this.b.read(l0, v);
                    }
                    catch(IOException iOException0) {
                        if(j0.exit()) {
                            iOException0 = j0.access$newTimeoutException(iOException0);
                        }
                        throw iOException0;
                    }
                }
                catch(Throwable throwable0) {
                    j0.exit();
                    throw throwable0;
                }
                if(j0.exit()) {
                    throw j0.access$newTimeoutException(null);
                }
                return v1;
            }

            @Override  // okio.o0
            public q0 timeout() {
                return this.a();
            }

            @Override
            @l
            public String toString() {
                return "AsyncTimeout.source(" + this.b + ')';
            }
        }

        L.p(o00, "source");
        return new d(this, o00);
    }

    protected void timedOut() {
    }

    public final Object withTimeout(@l A3.a a0) {
        Object object0;
        L.p(a0, "block");
        this.enter();
        try {
            try {
                object0 = a0.invoke();
            }
            catch(IOException iOException0) {
                if(this.exit()) {
                    iOException0 = this.access$newTimeoutException(iOException0);
                }
                throw iOException0;
            }
        }
        catch(Throwable throwable0) {
            this.exit();
            throw throwable0;
        }
        if(this.exit()) {
            throw this.access$newTimeoutException(null);
        }
        return object0;
    }
}

