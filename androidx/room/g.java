package androidx.room;

public final class g implements Runnable {
    public final QueryInterceptorDatabase a;

    public g(QueryInterceptorDatabase queryInterceptorDatabase0) {
        this.a = queryInterceptorDatabase0;
    }

    @Override
    public final void run() {
        QueryInterceptorDatabase.x(this.a);
    }
}

