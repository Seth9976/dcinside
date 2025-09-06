package androidx.compose.foundation;

import A3.a;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nClickable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.android.kt\nandroidx/compose/foundation/Clickable_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,74:1\n76#2:75\n*S KotlinDebug\n*F\n+ 1 Clickable.android.kt\nandroidx/compose/foundation/Clickable_androidKt\n*L\n36#1:75\n*E\n"})
public final class Clickable_androidKt {
    private static final long a;

    static {
        Clickable_androidKt.a = 100L;
    }

    public static final long b() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static final boolean c(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "$this$isClick");
        return KeyEventType.g(KeyEvent_androidKt.b(keyEvent0), 1) && Clickable_androidKt.e(keyEvent0);
    }

    @Composable
    @l
    public static final a d(@m Composer composer0, int v) {
        composer0.V(-1990508712);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1990508712, v, -1, "androidx.compose.foundation.isComposeRootInScrollableContainer (Clickable.android.kt:34)");
        }
        a a0 = new a(((View)composer0.L(AndroidCompositionLocals_androidKt.k()))) {
            final View e;

            {
                this.e = view0;
                super(0);
            }

            @l
            public final Boolean b() {
                return Boolean.valueOf(Clickable_androidKt.f(this.e));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return a0;
    }

    private static final boolean e(KeyEvent keyEvent0) {
        switch(Key_androidKt.b(KeyEvent_androidKt.a(keyEvent0))) {
            case 23: 
            case 66: 
            case 0xA0: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private static final boolean f(View view0) {
        for(ViewParent viewParent0 = view0.getParent(); viewParent0 != null && viewParent0 instanceof ViewGroup; viewParent0 = ((ViewGroup)viewParent0).getParent()) {
            if(((ViewGroup)viewParent0).shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public static final boolean g(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "$this$isPress");
        return KeyEventType.g(KeyEvent_androidKt.b(keyEvent0), 2) && Clickable_androidKt.e(keyEvent0);
    }
}

