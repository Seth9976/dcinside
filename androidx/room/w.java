package androidx.room;

public final class w implements Runnable {
    public final QueryInterceptorStatement a;

    public w(QueryInterceptorStatement queryInterceptorStatement0) {
        this.a = queryInterceptorStatement0;
    }

    @Override
    public final void run() {
        QueryInterceptorStatement.k(this.a);
    }
}

