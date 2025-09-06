package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class KeyEventHelpers_androidKt {
    public static final boolean a(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "$this$cancelsTextSelection");
        return keyEvent0.getKeyCode() == 4 && KeyEventType.g(KeyEvent_androidKt.b(keyEvent0), 1);
    }

    public static final void b() {
    }
}

