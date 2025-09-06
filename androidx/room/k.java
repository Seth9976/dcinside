package androidx.room;

public final class k implements Runnable {
    public final QueryInterceptorDatabase a;
    public final String b;

    public k(QueryInterceptorDatabase queryInterceptorDatabase0, String s) {
        this.a = queryInterceptorDatabase0;
        this.b = s;
    }

    @Override
    public final void run() {
        QueryInterceptorDatabase.L(this.a, this.b);
    }
}

