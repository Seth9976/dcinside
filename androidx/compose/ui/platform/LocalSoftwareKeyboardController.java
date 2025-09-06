package androidx.compose.ui.platform;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@s0({"SMAP\nLocalSoftwareKeyboardController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSoftwareKeyboardController.kt\nandroidx/compose/ui/platform/LocalSoftwareKeyboardController\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,76:1\n76#2:77\n76#2:78\n36#3:79\n1114#4,6:80\n*S KotlinDebug\n*F\n+ 1 LocalSoftwareKeyboardController.kt\nandroidx/compose/ui/platform/LocalSoftwareKeyboardController\n*L\n42#1:77\n47#1:78\n48#1:79\n48#1:80,6\n*E\n"})
public final class LocalSoftwareKeyboardController {
    @l
    public static final LocalSoftwareKeyboardController a;
    @l
    private static final ProvidableCompositionLocal b;
    public static final int c;

    static {
        LocalSoftwareKeyboardController.a = new LocalSoftwareKeyboardController();
        LocalSoftwareKeyboardController.b = CompositionLocalKt.d(null, LocalSoftwareKeyboardController.LocalSoftwareKeyboardController.1.e, 1, null);
    }

    @Composable
    private final SoftwareKeyboardController a(Composer composer0, int v) {
        composer0.V(1835581880);
        if(ComposerKt.g0()) {
            ComposerKt.w0(1835581880, v, -1, "androidx.compose.ui.platform.LocalSoftwareKeyboardController.delegatingController (LocalSoftwareKeyboardController.kt:45)");
        }
        TextInputService textInputService0 = (TextInputService)composer0.L(CompositionLocalsKt.t());
        if(textInputService0 == null) {
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            composer0.g0();
            return null;
        }
        composer0.V(0x44FAF204);
        boolean z = composer0.t(textInputService0);
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController0 = composer0.W();
        if(z || delegatingSoftwareKeyboardController0 == Composer.a.a()) {
            delegatingSoftwareKeyboardController0 = new DelegatingSoftwareKeyboardController(textInputService0);
            composer0.O(delegatingSoftwareKeyboardController0);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return delegatingSoftwareKeyboardController0;
    }

    @Composable
    @m
    @i(name = "getCurrent")
    public final SoftwareKeyboardController b(@m Composer composer0, int v) {
        composer0.V(0xC0D9AD27);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xC0D9AD27, v, -1, "androidx.compose.ui.platform.LocalSoftwareKeyboardController.<get-current> (LocalSoftwareKeyboardController.kt:40)");
        }
        SoftwareKeyboardController softwareKeyboardController0 = (SoftwareKeyboardController)composer0.L(LocalSoftwareKeyboardController.b);
        if(softwareKeyboardController0 == null) {
            softwareKeyboardController0 = this.a(composer0, v & 14);
        }
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return softwareKeyboardController0;
    }

    @ExperimentalComposeUiApi
    public static void c() {
    }

    @l
    public final ProvidedValue d(@l SoftwareKeyboardController softwareKeyboardController0) {
        L.p(softwareKeyboardController0, "softwareKeyboardController");
        return LocalSoftwareKeyboardController.b.f(softwareKeyboardController0);
    }
}

