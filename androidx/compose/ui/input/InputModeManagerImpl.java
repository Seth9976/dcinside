package androidx.compose.ui.input;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nInputModeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,76:1\n76#2:77\n102#2,2:78\n*S KotlinDebug\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n*L\n72#1:77\n72#1:78,2\n*E\n"})
public final class InputModeManagerImpl implements InputModeManager {
    @l
    private final Function1 a;
    @l
    private final MutableState b;

    private InputModeManagerImpl(int v, Function1 function10) {
        this.a = function10;
        this.b = SnapshotStateKt__SnapshotStateKt.g(InputMode.c(v), null, 2, null);
    }

    public InputModeManagerImpl(int v, Function1 function10, w w0) {
        this(v, function10);
    }

    @Override  // androidx.compose.ui.input.InputModeManager
    @ExperimentalComposeUiApi
    public boolean a(int v) {
        InputMode inputMode0 = InputMode.c(v);
        return ((Boolean)this.a.invoke(inputMode0)).booleanValue();
    }

    @Override  // androidx.compose.ui.input.InputModeManager
    public int b() {
        return ((InputMode)this.b.getValue()).i();
    }

    public void c(int v) {
        InputMode inputMode0 = InputMode.c(v);
        this.b.setValue(inputMode0);
    }
}

