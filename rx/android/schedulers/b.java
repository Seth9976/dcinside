package rx.android.schedulers;

import android.os.Handler;
import rx.j.a;

@Deprecated
public final class b extends c {
    private b(Handler handler0) {
        super(handler0);
    }

    @Override  // rx.android.schedulers.c
    public a a() {
        return super.a();
    }

    @Deprecated
    public static b d(Handler handler0) {
        if(handler0 == null) {
            throw new NullPointerException("handler == null");
        }
        return new b(handler0);
    }
}

