package androidx.room;

public final class l implements Runnable {
    public final QueryInterceptorDatabase a;

    public l(QueryInterceptorDatabase queryInterceptorDatabase0) {
        this.a = queryInterceptorDatabase0;
    }

    @Override
    public final void run() {
        QueryInterceptorDatabase.s(this.a);
    }
}

