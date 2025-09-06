package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.X;
import y4.l;
import y4.m;

public final class CoroutineAdapterKt {
    @l
    public static final t0 b(@l X x0, @m Object object0) {
        L.p(x0, "<this>");
        t0 t00 = CallbackToFutureAdapter.a((Completer callbackToFutureAdapter$Completer0) -> {
            L.p(x0, "$this_asListenableFuture");
            L.p(callbackToFutureAdapter$Completer0, "completer");
            x0.w(new androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture.1.1(callbackToFutureAdapter$Completer0, x0));
            return object0;
        });
        L.o(t00, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return t00;

        final class androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture.1.1 extends N implements Function1 {
            final Completer e;
            final X f;

            androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture.1.1(Completer callbackToFutureAdapter$Completer0, X x0) {
                this.e = callbackToFutureAdapter$Completer0;
                this.f = x0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                if(throwable0 != null) {
                    if(throwable0 instanceof CancellationException) {
                        this.e.d();
                        return;
                    }
                    this.e.f(throwable0);
                    return;
                }
                Object object0 = this.f.j();
                this.e.c(object0);
            }
        }

    }

    public static t0 c(X x0, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            object0 = "Deferred.asListenableFuture";
        }
        return CoroutineAdapterKt.b(x0, object0);
    }

    // 检测为 Lambda 实现
    private static final Object d(X x0, Object object0, Completer callbackToFutureAdapter$Completer0) [...]
}

