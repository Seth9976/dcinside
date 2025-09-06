package androidx.compose.foundation.gestures;

import A3.p;
import androidx.compose.ui.geometry.Offset;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import y4.l;
import y4.m;

@f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class TapGestureDetectorKt.NoPressGesture.1 extends o implements p {
    int k;

    TapGestureDetectorKt.NoPressGesture.1(d d0) {
        super(3, d0);
    }

    @m
    public final Object a(@l PressGestureScope pressGestureScope0, long v, @m d d0) {
        return new TapGestureDetectorKt.NoPressGesture.1(d0).invokeSuspend(S0.a);
    }

    @Override  // A3.p
    public Object invoke(Object object0, Object object1, Object object2) {
        return this.a(((PressGestureScope)object0), ((Offset)object1).A(), ((d)object2));
    }

    @Override  // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object object0) {
        if(this.k != 0) {
            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        f0.n(object0);
        return S0.a;
    }
}

