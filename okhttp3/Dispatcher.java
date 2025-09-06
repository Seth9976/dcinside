package okhttp3;

import j..util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall.AsyncCall;
import okhttp3.internal.connection.RealCall;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n1#2:242\n615#3,4:243\n1549#4:247\n1620#4,3:248\n1549#4:251\n1620#4,3:252\n*S KotlinDebug\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n*L\n162#1:243,4\n222#1:247\n222#1:248,3\n227#1:251\n227#1:252,3\n*E\n"})
public final class Dispatcher {
    @m
    private ExecutorService executorServiceOrNull;
    @m
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    @l
    private final ArrayDeque readyAsyncCalls;
    @l
    private final ArrayDeque runningAsyncCalls;
    @l
    private final ArrayDeque runningSyncCalls;

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "executorService", imports = {}))
    @l
    @i(name = "-deprecated_executorService")
    public final ExecutorService -deprecated_executorService() {
        return this.executorService();
    }

    public Dispatcher() {
        this.maxRequests = 0x40;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque();
        this.runningAsyncCalls = new ArrayDeque();
        this.runningSyncCalls = new ArrayDeque();
    }

    public Dispatcher(@l ExecutorService executorService0) {
        L.p(executorService0, "executorService");
        this();
        this.executorServiceOrNull = executorService0;
    }

    public final void cancelAll() {
        synchronized(this) {
            for(Object object0: this.readyAsyncCalls) {
                ((AsyncCall)object0).getCall().cancel();
            }
            for(Object object1: this.runningAsyncCalls) {
                ((AsyncCall)object1).getCall().cancel();
            }
            for(Object object2: this.runningSyncCalls) {
                ((RealCall)object2).cancel();
            }
        }
    }

    public final void enqueue$okhttp(@l AsyncCall realCall$AsyncCall0) {
        L.p(realCall$AsyncCall0, "call");
        synchronized(this) {
            this.readyAsyncCalls.add(realCall$AsyncCall0);
            if(!realCall$AsyncCall0.getCall().getForWebSocket()) {
                AsyncCall realCall$AsyncCall1 = this.findExistingCallWithHost(realCall$AsyncCall0.getHost());
                if(realCall$AsyncCall1 != null) {
                    realCall$AsyncCall0.reuseCallsPerHostFrom(realCall$AsyncCall1);
                }
            }
        }
        this.promoteAndExecute();
    }

    public final void executed$okhttp(@l RealCall realCall0) {
        synchronized(this) {
            L.p(realCall0, "call");
            this.runningSyncCalls.add(realCall0);
        }
    }

    @l
    @i(name = "executorService")
    public final ExecutorService executorService() {
        synchronized(this) {
            if(this.executorServiceOrNull == null) {
                this.executorServiceOrNull = new ThreadPoolExecutor(0, 0x7FFFFFFF, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory((Util.okHttpName + " Dispatcher"), false));
            }
            ExecutorService executorService0 = this.executorServiceOrNull;
            L.m(executorService0);
            return executorService0;
        }
    }

    private final AsyncCall findExistingCallWithHost(String s) {
        for(Object object0: this.runningAsyncCalls) {
            AsyncCall realCall$AsyncCall0 = (AsyncCall)object0;
            if(L.g(realCall$AsyncCall0.getHost(), s)) {
                return realCall$AsyncCall0;
            }
            if(false) {
                break;
            }
        }
        for(Object object1: this.readyAsyncCalls) {
            AsyncCall realCall$AsyncCall1 = (AsyncCall)object1;
            if(L.g(realCall$AsyncCall1.getHost(), s)) {
                return realCall$AsyncCall1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    private final void finished(Deque deque0, Object object0) {
        synchronized(this) {
            if(deque0.remove(object0)) {
                Runnable runnable0 = this.idleCallback;
                if(!this.promoteAndExecute() && runnable0 != null) {
                    runnable0.run();
                }
                return;
            }
        }
        throw new AssertionError("Call wasn\'t in-flight!");
    }

    public final void finished$okhttp(@l AsyncCall realCall$AsyncCall0) {
        L.p(realCall$AsyncCall0, "call");
        realCall$AsyncCall0.getCallsPerHost().decrementAndGet();
        this.finished(this.runningAsyncCalls, realCall$AsyncCall0);
    }

    public final void finished$okhttp(@l RealCall realCall0) {
        L.p(realCall0, "call");
        this.finished(this.runningSyncCalls, realCall0);
    }

    @m
    public final Runnable getIdleCallback() {
        synchronized(this) {
        }
        return this.idleCallback;
    }

    public final int getMaxRequests() {
        synchronized(this) {
        }
        return this.maxRequests;
    }

    public final int getMaxRequestsPerHost() {
        synchronized(this) {
        }
        return this.maxRequestsPerHost;
    }

    private final boolean promoteAndExecute() {
        boolean z;
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12374 MUST NOT hold lock on " + this);
        }
        ArrayList arrayList0 = new ArrayList();
        synchronized(this) {
            Iterator iterator0 = this.readyAsyncCalls.iterator();
            L.o(iterator0, "readyAsyncCalls.iterator()");
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                AsyncCall realCall$AsyncCall0 = (AsyncCall)object0;
                if(this.runningAsyncCalls.size() >= this.maxRequests) {
                    break;
                }
                if(realCall$AsyncCall0.getCallsPerHost().get() < this.maxRequestsPerHost) {
                    iterator0.remove();
                    realCall$AsyncCall0.getCallsPerHost().incrementAndGet();
                    L.o(realCall$AsyncCall0, "asyncCall");
                    arrayList0.add(realCall$AsyncCall0);
                    this.runningAsyncCalls.add(realCall$AsyncCall0);
                }
            }
            z = this.runningCallsCount() > 0;
        }
        int v2 = arrayList0.size();
        for(int v1 = 0; v1 < v2; ++v1) {
            ((AsyncCall)arrayList0.get(v1)).executeOn(this.executorService());
        }
        return z;
    }

    @l
    public final List queuedCalls() {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList(u.b0(this.readyAsyncCalls, 10));
            for(Object object0: this.readyAsyncCalls) {
                arrayList0.add(((AsyncCall)object0).getCall());
            }
            List list0 = DesugarCollections.unmodifiableList(arrayList0);
            L.o(list0, "unmodifiableList(readyAsyncCalls.map { it.call })");
            return list0;
        }
    }

    public final int queuedCallsCount() {
        synchronized(this) {
        }
        return this.readyAsyncCalls.size();
    }

    @l
    public final List runningCalls() {
        synchronized(this) {
            ArrayDeque arrayDeque0 = this.runningSyncCalls;
            ArrayList arrayList0 = new ArrayList(u.b0(this.runningAsyncCalls, 10));
            for(Object object0: this.runningAsyncCalls) {
                arrayList0.add(((AsyncCall)object0).getCall());
            }
            List list0 = DesugarCollections.unmodifiableList(u.D4(arrayDeque0, arrayList0));
            L.o(list0, "unmodifiableList(running…yncCalls.map { it.call })");
            return list0;
        }
    }

    public final int runningCallsCount() {
        synchronized(this) {
        }
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final void setIdleCallback(@m Runnable runnable0) {
        synchronized(this) {
            this.idleCallback = runnable0;
        }
    }

    public final void setMaxRequests(int v) {
        if(v < 1) {
            throw new IllegalArgumentException(("max < 1: " + v).toString());
        }
        synchronized(this) {
            this.maxRequests = v;
        }
        this.promoteAndExecute();
    }

    public final void setMaxRequestsPerHost(int v) {
        if(v < 1) {
            throw new IllegalArgumentException(("max < 1: " + v).toString());
        }
        synchronized(this) {
            this.maxRequestsPerHost = v;
        }
        this.promoteAndExecute();
    }
}

