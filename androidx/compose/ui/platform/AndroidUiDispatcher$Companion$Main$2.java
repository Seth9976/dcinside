package androidx.compose.ui.platform;

import A3.a;
import A3.o;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.HandlerCompat;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

final class AndroidUiDispatcher.Companion.Main.2 extends N implements a {
    public static final AndroidUiDispatcher.Companion.Main.2 e;

    static {
        AndroidUiDispatcher.Companion.Main.2.e = new AndroidUiDispatcher.Companion.Main.2();
    }

    AndroidUiDispatcher.Companion.Main.2() {
        super(0);
    }

    @l
    public final g b() {
        Choreographer choreographer0 = AndroidUiDispatcher_androidKt.b() ? Choreographer.getInstance() : ((Choreographer)i.f(h0.e(), new o() {
            int k;

            {
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.compose.ui.platform.AndroidUiDispatcher.Companion.Main.2.dispatcher.1(d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.ui.platform.AndroidUiDispatcher.Companion.Main.2.dispatcher.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return Choreographer.getInstance();
            }
        }));
        L.o(choreographer0, "if (isMainThread()) Chor…eographer.getInstance() }");
        Handler handler0 = HandlerCompat.a(Looper.getMainLooper());
        L.o(handler0, "createAsync(Looper.getMainLooper())");
        AndroidUiDispatcher androidUiDispatcher0 = new AndroidUiDispatcher(choreographer0, handler0, null);
        return androidUiDispatcher0.plus(androidUiDispatcher0.p2());
    }

    @Override  // A3.a
    public Object invoke() {
        return this.b();
    }
}

