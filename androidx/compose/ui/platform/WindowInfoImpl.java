package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import kotlin.jvm.internal.w;
import y4.l;

public final class WindowInfoImpl implements WindowInfo {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final MutableState a() {
            return WindowInfoImpl.c;
        }
    }

    @l
    private final MutableState a;
    @l
    public static final Companion b;
    @l
    private static final MutableState c;

    static {
        WindowInfoImpl.b = new Companion(null);
        WindowInfoImpl.c = SnapshotStateKt__SnapshotStateKt.g(PointerKeyboardModifiers.a(0), null, 2, null);
    }

    public WindowInfoImpl() {
        this.a = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
    }

    @Override  // androidx.compose.ui.platform.WindowInfo
    @ExperimentalComposeUiApi
    public int a() {
        return ((PointerKeyboardModifiers)WindowInfoImpl.c.getValue()).g();
    }

    @Override  // androidx.compose.ui.platform.WindowInfo
    public boolean b() {
        return ((Boolean)this.a.getValue()).booleanValue();
    }

    public static void d() {
    }

    public void e(int v) {
        PointerKeyboardModifiers pointerKeyboardModifiers0 = PointerKeyboardModifiers.a(v);
        WindowInfoImpl.c.setValue(pointerKeyboardModifiers0);
    }

    public void f(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }
}

