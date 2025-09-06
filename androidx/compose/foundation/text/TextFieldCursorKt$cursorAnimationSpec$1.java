package androidx.compose.foundation.text;

import androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class TextFieldCursorKt.cursorAnimationSpec.1 extends N implements Function1 {
    public static final TextFieldCursorKt.cursorAnimationSpec.1 e;

    static {
        TextFieldCursorKt.cursorAnimationSpec.1.e = new TextFieldCursorKt.cursorAnimationSpec.1();
    }

    TextFieldCursorKt.cursorAnimationSpec.1() {
        super(1);
    }

    public final void a(@l KeyframesSpecConfig keyframesSpec$KeyframesSpecConfig0) {
        L.p(keyframesSpec$KeyframesSpecConfig0, "$this$keyframes");
        keyframesSpec$KeyframesSpecConfig0.g(1000);
        keyframesSpec$KeyframesSpecConfig0.a(1.0f, 0);
        keyframesSpec$KeyframesSpecConfig0.a(1.0f, 0x1F3);
        keyframesSpec$KeyframesSpecConfig0.a(0.0f, 500);
        keyframesSpec$KeyframesSpecConfig0.a(0.0f, 999);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.a(((KeyframesSpecConfig)object0));
        return S0.a;
    }
}

