package androidx.activity.result;

import kotlin.jvm.functions.Function1;

public final class b implements ActivityResultCallback {
    public final Function1 a;

    public b(Function1 function10) {
        this.a = function10;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        ActivityResultCallerKt.f(this.a, object0);
    }
}

