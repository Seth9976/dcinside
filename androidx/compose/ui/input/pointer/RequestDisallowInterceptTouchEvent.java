package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import y4.m;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
public final class RequestDisallowInterceptTouchEvent implements Function1 {
    @m
    private PointerInteropFilter a;
    public static final int b = 8;

    static {
    }

    @m
    public final PointerInteropFilter a() {
        return this.a;
    }

    public void b(boolean z) {
        PointerInteropFilter pointerInteropFilter0 = this.a;
        if(pointerInteropFilter0 != null) {
            pointerInteropFilter0.i(z);
        }
    }

    public final void c(@m PointerInteropFilter pointerInteropFilter0) {
        this.a = pointerInteropFilter0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.b(((Boolean)object0).booleanValue());
        return S0.a;
    }
}

