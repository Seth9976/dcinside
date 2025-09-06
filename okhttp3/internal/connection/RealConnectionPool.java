package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import okhttp3.Address;
import okhttp3.ConnectionPool;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import y4.l;
import y4.m;

@s0({"SMAP\nRealConnectionPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,250:1\n1#2:251\n1774#3,4:252\n608#4,4:256\n608#4,4:260\n608#4,4:264\n*S KotlinDebug\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n*L\n60#1:252,4\n95#1:256,4\n106#1:260,4\n215#1:264,4\n*E\n"})
public final class RealConnectionPool {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final RealConnectionPool get(@l ConnectionPool connectionPool0) {
            L.p(connectionPool0, "connectionPool");
            return connectionPool0.getDelegate$okhttp();
        }
    }

    @l
    public static final Companion Companion;
    @l
    private final TaskQueue cleanupQueue;
    @l
    private final okhttp3.internal.connection.RealConnectionPool.cleanupTask.1 cleanupTask;
    @l
    private final ConcurrentLinkedQueue connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    static {
        RealConnectionPool.Companion = new Companion(null);
    }

    public RealConnectionPool(@l TaskRunner taskRunner0, int v, long v1, @l TimeUnit timeUnit0) {
        L.p(taskRunner0, "taskRunner");
        L.p(timeUnit0, "timeUnit");
        super();
        this.maxIdleConnections = v;
        this.keepAliveDurationNs = timeUnit0.toNanos(v1);
        this.cleanupQueue = taskRunner0.newQueue();
        this.cleanupTask = new Task(Util.okHttpName + " ConnectionPool") {
            {
                RealConnectionPool.this = realConnectionPool0;
                super(s, false, 2, null);
            }

            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                return RealConnectionPool.this.cleanup(System.nanoTime());
            }
        };
        this.connections = new ConcurrentLinkedQueue();
        if(v1 <= 0L) {
            throw new IllegalArgumentException(("keepAliveDuration <= 0: " + v1).toString());
        }
    }

    public final boolean callAcquirePooledConnection(@l Address address0, @l RealCall realCall0, @m List list0, boolean z) {
        L.p(address0, "address");
        L.p(realCall0, "call");
        for(Object object0: this.connections) {
            RealConnection realConnection0 = (RealConnection)object0;
            L.o(realConnection0, "connection");
            __monitor_enter(realConnection0);
            try {
                if((!z || realConnection0.isMultiplexed$okhttp()) && realConnection0.isEligible$okhttp(address0, list0)) {
                    realCall0.acquireConnectionNoEvents(realConnection0);
                    goto label_14;
                }
                goto label_16;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(realConnection0);
            throw throwable0;
        label_14:
            __monitor_exit(realConnection0);
            return true;
        label_16:
            __monitor_exit(realConnection0);
        }
        return false;
    }

    public final long cleanup(long v) {
        int v1 = 0;
        long v2 = 0x8000000000000000L;
        RealConnection realConnection0 = null;
        int v3 = 0;
        for(Object object0: this.connections) {
            RealConnection realConnection1 = (RealConnection)object0;
            L.o(realConnection1, "connection");
            synchronized(realConnection1) {
                if(this.pruneAndGetAllocationCount(realConnection1, v) > 0) {
                    ++v3;
                }
                else {
                    ++v1;
                    long v5 = v - realConnection1.getIdleAtNs$okhttp();
                    if(v5 > v2) {
                        realConnection0 = realConnection1;
                        v2 = v5;
                    }
                }
            }
        }
        long v6 = this.keepAliveDurationNs;
        if(v2 < v6 && v1 <= this.maxIdleConnections) {
            if(v1 > 0) {
                return v6 - v2;
            }
            return v3 <= 0 ? -1L : v6;
        }
        L.m(realConnection0);
        synchronized(realConnection0) {
            if(!realConnection0.getCalls().isEmpty()) {
                return 0L;
            }
            if(realConnection0.getIdleAtNs$okhttp() + v2 != v) {
                return 0L;
            }
            realConnection0.setNoNewExchanges(true);
            this.connections.remove(realConnection0);
        }
        Util.closeQuietly(realConnection0.socket());
        if(this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
        return 0L;
    }

    public final boolean connectionBecameIdle(@l RealConnection realConnection0) {
        L.p(realConnection0, "connection");
        if(Util.assertionsEnabled && !Thread.holdsLock(realConnection0)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12398 MUST hold lock on " + realConnection0);
        }
        if(!realConnection0.getNoNewExchanges() && this.maxIdleConnections != 0) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return false;
        }
        realConnection0.setNoNewExchanges(true);
        this.connections.remove(realConnection0);
        if(this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
        return true;
    }

    public final int connectionCount() {
        return this.connections.size();
    }

    public final void evictAll() {
        Socket socket0;
        Iterator iterator0 = this.connections.iterator();
        L.o(iterator0, "connections.iterator()");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            RealConnection realConnection0 = (RealConnection)object0;
            L.o(realConnection0, "connection");
            synchronized(realConnection0) {
                if(realConnection0.getCalls().isEmpty()) {
                    iterator0.remove();
                    realConnection0.setNoNewExchanges(true);
                    socket0 = realConnection0.socket();
                }
                else {
                    socket0 = null;
                }
            }
            if(socket0 != null) {
                Util.closeQuietly(socket0);
            }
        }
        if(this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
    }

    public final int idleConnectionCount() {
        ConcurrentLinkedQueue concurrentLinkedQueue0 = this.connections;
        int v = 0;
        if(!(concurrentLinkedQueue0 instanceof Collection) || !concurrentLinkedQueue0.isEmpty()) {
            for(Object object0: concurrentLinkedQueue0) {
                L.o(((RealConnection)object0), "it");
                synchronized(((RealConnection)object0)) {
                }
                if(((RealConnection)object0).getCalls().isEmpty()) {
                    ++v;
                    if(v < 0) {
                        u.Y();
                    }
                }
            }
        }
        return v;
    }

    private final int pruneAndGetAllocationCount(RealConnection realConnection0, long v) {
        if(Util.assertionsEnabled && !Thread.holdsLock(realConnection0)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12349 MUST hold lock on " + realConnection0);
        }
        List list0 = realConnection0.getCalls();
        int v1 = 0;
        while(v1 < list0.size()) {
            Reference reference0 = (Reference)list0.get(v1);
            if(reference0.get() == null) {
                L.n(reference0, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                Platform.Companion.get().logCloseableLeak("A connection to " + realConnection0.route().address().url() + " was leaked. Did you forget to close a response body?", ((CallReference)reference0).getCallStackTrace());
                list0.remove(v1);
                realConnection0.setNoNewExchanges(true);
                if(list0.isEmpty()) {
                    realConnection0.setIdleAtNs$okhttp(v - this.keepAliveDurationNs);
                    return 0;
                }
                if(false) {
                    break;
                }
            }
            else {
                ++v1;
            }
        }
        return list0.size();
    }

    public final void put(@l RealConnection realConnection0) {
        L.p(realConnection0, "connection");
        if(Util.assertionsEnabled && !Thread.holdsLock(realConnection0)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12402 MUST hold lock on " + realConnection0);
        }
        this.connections.add(realConnection0);
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
    }
}

