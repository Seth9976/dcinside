package androidx.room;

public final class s implements Runnable {
    public final QueryInterceptorStatement a;

    public s(QueryInterceptorStatement queryInterceptorStatement0) {
        this.a = queryInterceptorStatement0;
    }

    @Override
    public final void run() {
        QueryInterceptorStatement.o(this.a);
    }
}

