package androidx.room;

public final class m implements Runnable {
    public final QueryInterceptorDatabase a;

    public m(QueryInterceptorDatabase queryInterceptorDatabase0) {
        this.a = queryInterceptorDatabase0;
    }

    @Override
    public final void run() {
        QueryInterceptorDatabase.e0(this.a);
    }
}

