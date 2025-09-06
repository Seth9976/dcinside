package androidx.room;

public final class v implements Runnable {
    public final QueryInterceptorStatement a;

    public v(QueryInterceptorStatement queryInterceptorStatement0) {
        this.a = queryInterceptorStatement0;
    }

    @Override
    public final void run() {
        QueryInterceptorStatement.i(this.a);
    }
}

