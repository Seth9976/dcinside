package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.L;
import y4.l;

public final class PointerIcon_androidKt {
    @l
    private static final PointerIcon a;
    @l
    private static final PointerIcon b;
    @l
    private static final PointerIcon c;
    @l
    private static final PointerIcon d;

    static {
        PointerIcon_androidKt.a = new AndroidPointerIconType(1000);
        PointerIcon_androidKt.b = new AndroidPointerIconType(1007);
        PointerIcon_androidKt.c = new AndroidPointerIconType(0x3F0);
        PointerIcon_androidKt.d = new AndroidPointerIconType(1002);
    }

    @l
    public static final PointerIcon a(int v) {
        return new AndroidPointerIconType(v);
    }

    @l
    public static final PointerIcon b(@l android.view.PointerIcon pointerIcon0) {
        L.p(pointerIcon0, "pointerIcon");
        return new AndroidPointerIcon(pointerIcon0);
    }

    @l
    public static final PointerIcon c() {
        return PointerIcon_androidKt.b;
    }

    @l
    public static final PointerIcon d() {
        return PointerIcon_androidKt.a;
    }

    @l
    public static final PointerIcon e() {
        return PointerIcon_androidKt.d;
    }

    @l
    public static final PointerIcon f() {
        return PointerIcon_androidKt.c;
    }
}

