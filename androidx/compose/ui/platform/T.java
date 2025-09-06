package androidx.compose.ui.platform;

import androidx.compose.ui.text.AnnotatedString;

public final class t {
    public static boolean a(ClipboardManager clipboardManager0) {
        AnnotatedString annotatedString0 = clipboardManager0.a();
        return annotatedString0 != null && annotatedString0.length() > 0;
    }
}

