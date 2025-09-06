package androidx.room;

public final class q implements Runnable {
    public final QueryInterceptorDatabase a;

    public q(QueryInterceptorDatabase queryInterceptorDatabase0) {
        this.a = queryInterceptorDatabase0;
    }

    @Override
    public final void run() {
        QueryInterceptorDatabase.v(this.a);
    }
}

