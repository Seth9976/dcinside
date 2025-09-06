package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class PointerInteropUtils_androidKt {
    public static final void a(long v, @l Function1 function10) {
        L.p(function10, "block");
        MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0);
        motionEvent0.setSource(0);
        L.o(motionEvent0, "motionEvent");
        function10.invoke(motionEvent0);
        motionEvent0.recycle();
    }

    public static void b(long v, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = SystemClock.uptimeMillis();
        }
        PointerInteropUtils_androidKt.a(v, function10);
    }

    public static final void c(@l PointerEvent pointerEvent0, long v, @l Function1 function10) {
        L.p(pointerEvent0, "$this$toCancelMotionEventScope");
        L.p(function10, "block");
        PointerInteropUtils_androidKt.e(pointerEvent0, v, function10, true);
    }

    public static final void d(@l PointerEvent pointerEvent0, long v, @l Function1 function10) {
        L.p(pointerEvent0, "$this$toMotionEventScope");
        L.p(function10, "block");
        PointerInteropUtils_androidKt.e(pointerEvent0, v, function10, false);
    }

    private static final void e(PointerEvent pointerEvent0, long v, Function1 function10, boolean z) {
        MotionEvent motionEvent0 = pointerEvent0.h();
        if(motionEvent0 == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int v1 = motionEvent0.getAction();
        if(z) {
            motionEvent0.setAction(3);
        }
        motionEvent0.offsetLocation(-Offset.p(v), -Offset.r(v));
        function10.invoke(motionEvent0);
        motionEvent0.offsetLocation(Offset.p(v), Offset.r(v));
        motionEvent0.setAction(v1);
    }
}

