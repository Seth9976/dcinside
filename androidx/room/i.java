package androidx.room;

public final class i implements Runnable {
    public final QueryInterceptorDatabase a;
    public final String b;

    public i(QueryInterceptorDatabase queryInterceptorDatabase0, String s) {
        this.a = queryInterceptorDatabase0;
        this.b = s;
    }

    @Override
    public final void run() {
        QueryInterceptorDatabase.R(this.a, this.b);
    }
}

