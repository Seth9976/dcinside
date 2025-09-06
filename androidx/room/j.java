package androidx.room;

public final class j implements Runnable {
    public final QueryInterceptorDatabase a;
    public final String b;
    public final Object[] c;

    public j(QueryInterceptorDatabase queryInterceptorDatabase0, String s, Object[] arr_object) {
        this.a = queryInterceptorDatabase0;
        this.b = s;
        this.c = arr_object;
    }

    @Override
    public final void run() {
        QueryInterceptorDatabase.T(this.a, this.b, this.c);
    }
}

