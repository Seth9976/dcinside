package androidx.room;

public final class h implements Runnable {
    public final QueryInterceptorDatabase a;

    public h(QueryInterceptorDatabase queryInterceptorDatabase0) {
        this.a = queryInterceptorDatabase0;
    }

    @Override
    public final void run() {
        QueryInterceptorDatabase.w(this.a);
    }
}

