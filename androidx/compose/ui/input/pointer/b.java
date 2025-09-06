package androidx.compose.ui.input.pointer;

import A3.o;
import kotlin.coroutines.d;
import y4.l;
import y4.m;

public final class b {
    // 去混淆评级： 低(20)
    public static long a(AwaitPointerEventScope awaitPointerEventScope0) {
        return 0L;
    }

    @m
    public static Object b(AwaitPointerEventScope awaitPointerEventScope0, long v, @l o o0, @l d d0) {
        return b.u(awaitPointerEventScope0, v, o0, d0);
    }

    @m
    public static Object c(AwaitPointerEventScope awaitPointerEventScope0, long v, @l o o0, @l d d0) {
        return b.v(awaitPointerEventScope0, v, o0, d0);
    }

    public static Object t(AwaitPointerEventScope awaitPointerEventScope0, PointerEventPass pointerEventPass0, d d0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if((v & 1) != 0) {
            pointerEventPass0 = PointerEventPass.b;
        }
        return awaitPointerEventScope0.l1(pointerEventPass0, d0);
    }

    public static Object u(AwaitPointerEventScope awaitPointerEventScope0, long v, o o0, d d0) {
        return o0.invoke(awaitPointerEventScope0, d0);
    }

    public static Object v(AwaitPointerEventScope awaitPointerEventScope0, long v, o o0, d d0) {
        return o0.invoke(awaitPointerEventScope0, d0);
    }
}

