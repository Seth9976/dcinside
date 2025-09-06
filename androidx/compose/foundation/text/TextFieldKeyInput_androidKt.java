package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.jvm.internal.L;
import y4.l;

public final class TextFieldKeyInput_androidKt {
    public static final boolean a(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "$this$isTypedEvent");
        return keyEvent0.getAction() == 0 && keyEvent0.getUnicodeChar() != 0;
    }
}

