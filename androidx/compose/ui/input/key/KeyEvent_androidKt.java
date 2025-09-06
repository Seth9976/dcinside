package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import kotlin.jvm.internal.L;
import y4.l;

public final class KeyEvent_androidKt {
    public static final long a(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "$this$key");
        return Key_androidKt.a(keyEvent0.getKeyCode());
    }

    public static final int b(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "$this$type");
        switch(keyEvent0.getAction()) {
            case 0: {
                return 2;
            }
            case 1: {
                return 1;
            }
            default: {
                return 0;
            }
        }
    }

    public static final int c(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "$this$utf16CodePoint");
        return keyEvent0.getUnicodeChar();
    }

    public static final boolean d(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "$this$isAltPressed");
        return keyEvent0.isAltPressed();
    }

    public static final boolean e(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "$this$isCtrlPressed");
        return keyEvent0.isCtrlPressed();
    }

    public static final boolean f(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "$this$isMetaPressed");
        return keyEvent0.isMetaPressed();
    }

    public static final boolean g(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "$this$isShiftPressed");
        return keyEvent0.isShiftPressed();
    }
}

