package androidx.room;

public final class t implements Runnable {
    public final QueryInterceptorStatement a;

    public t(QueryInterceptorStatement queryInterceptorStatement0) {
        this.a = queryInterceptorStatement0;
    }

    @Override
    public final void run() {
        QueryInterceptorStatement.j(this.a);
    }
}

