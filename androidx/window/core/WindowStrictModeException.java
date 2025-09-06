package androidx.window.core;

import kotlin.jvm.internal.L;
import y4.l;

public final class WindowStrictModeException extends Exception {
    public WindowStrictModeException(@l String s) {
        L.p(s, "message");
        super(s);
    }
}

