package androidx.compose.ui.viewinterop;

import android.view.View;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class AndroidView_androidKt.NoOpUpdate.1 extends N implements Function1 {
    public static final AndroidView_androidKt.NoOpUpdate.1 e;

    static {
        AndroidView_androidKt.NoOpUpdate.1.e = new AndroidView_androidKt.NoOpUpdate.1();
    }

    AndroidView_androidKt.NoOpUpdate.1() {
        super(1);
    }

    public final void b(@l View view0) {
        L.p(view0, "$this$null");
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.b(((View)object0));
        return S0.a;
    }
}

