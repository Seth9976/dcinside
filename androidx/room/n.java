package androidx.room;

public final class n implements Runnable {
    public final QueryInterceptorDatabase a;

    public n(QueryInterceptorDatabase queryInterceptorDatabase0) {
        this.a = queryInterceptorDatabase0;
    }

    @Override
    public final void run() {
        QueryInterceptorDatabase.t(this.a);
    }
}

