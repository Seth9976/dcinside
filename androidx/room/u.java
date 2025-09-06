package androidx.room;

public final class u implements Runnable {
    public final QueryInterceptorStatement a;

    public u(QueryInterceptorStatement queryInterceptorStatement0) {
        this.a = queryInterceptorStatement0;
    }

    @Override
    public final void run() {
        QueryInterceptorStatement.p(this.a);
    }
}

