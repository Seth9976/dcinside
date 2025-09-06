package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;
import y4.l;

public final class ConnectionPool {
    @l
    private final RealConnectionPool delegate;

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public ConnectionPool(int v, long v1, @l TimeUnit timeUnit0) {
        L.p(timeUnit0, "timeUnit");
        this(new RealConnectionPool(TaskRunner.INSTANCE, v, v1, timeUnit0));
    }

    public ConnectionPool(@l RealConnectionPool realConnectionPool0) {
        L.p(realConnectionPool0, "delegate");
        super();
        this.delegate = realConnectionPool0;
    }

    public final int connectionCount() {
        return this.delegate.connectionCount();
    }

    public final void evictAll() {
        this.delegate.evictAll();
    }

    @l
    public final RealConnectionPool getDelegate$okhttp() {
        return this.delegate;
    }

    public final int idleConnectionCount() {
        return this.delegate.idleConnectionCount();
    }
}

