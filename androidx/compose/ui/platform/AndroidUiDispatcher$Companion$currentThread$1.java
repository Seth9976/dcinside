package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.HandlerCompat;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$Companion$currentThread$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
public final class AndroidUiDispatcher.Companion.currentThread.1 extends ThreadLocal {
    @l
    protected g a() {
        Choreographer choreographer0 = Choreographer.getInstance();
        L.o(choreographer0, "getInstance()");
        Looper looper0 = Looper.myLooper();
        if(looper0 == null) {
            throw new IllegalStateException("no Looper on this thread");
        }
        Handler handler0 = HandlerCompat.a(looper0);
        L.o(handler0, "createAsync(\n           …d\")\n                    )");
        AndroidUiDispatcher androidUiDispatcher0 = new AndroidUiDispatcher(choreographer0, handler0, null);
        return androidUiDispatcher0.plus(androidUiDispatcher0.p2());
    }

    @Override
    public Object initialValue() {
        return this.a();
    }
}

