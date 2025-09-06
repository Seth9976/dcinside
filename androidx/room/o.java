package androidx.room;

import java.util.List;

public final class o implements Runnable {
    public final QueryInterceptorDatabase a;
    public final String b;
    public final List c;

    public o(QueryInterceptorDatabase queryInterceptorDatabase0, String s, List list0) {
        this.a = queryInterceptorDatabase0;
        this.b = s;
        this.c = list0;
    }

    @Override
    public final void run() {
        QueryInterceptorDatabase.Q(this.a, this.b, this.c);
    }
}

