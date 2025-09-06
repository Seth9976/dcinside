package rx.internal.util;

import androidx.compose.animation.core.d;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.b;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class f extends Enum {
    private static final Throwable a;
    private static final f[] b;

    static {
        f.b = new f[0];
        f.a = new Throwable("Terminated");
    }

    private f(String s, int v) {
        super(s, v);
    }

    public static boolean a(AtomicReference atomicReference0, Throwable throwable0) {
        Throwable throwable2;
        do {
            Throwable throwable1 = (Throwable)atomicReference0.get();
            if(throwable1 == f.a) {
                return false;
            }
            if(throwable1 == null) {
                throwable2 = throwable0;
            }
            else if(throwable1 instanceof b) {
                ArrayList arrayList0 = new ArrayList(((b)throwable1).b());
                arrayList0.add(throwable0);
                throwable2 = new b(arrayList0);
            }
            else {
                throwable2 = new b(new Throwable[]{throwable1, throwable0});
            }
        }
        while(!d.a(atomicReference0, throwable1, throwable2));
        return true;
    }

    public static boolean b(Throwable throwable0) {
        return throwable0 == f.a;
    }

    public static boolean c(AtomicReference atomicReference0) {
        return f.b(((Throwable)atomicReference0.get()));
    }

    public static Throwable d(AtomicReference atomicReference0) {
        Throwable throwable0 = (Throwable)atomicReference0.get();
        return throwable0 == f.a ? throwable0 : ((Throwable)atomicReference0.getAndSet(f.a));
    }

    public static f valueOf(String s) {
        return (f)Enum.valueOf(f.class, s);
    }

    public static f[] values() {
        return (f[])f.b.clone();
    }
}

