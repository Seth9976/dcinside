package com.unity3d.ads.core.data.model;

import java.util.Locale;
import kotlin.jvm.internal.L;
import y4.l;

public enum InitializationState {
    NOT_INITIALIZED,
    INITIALIZING,
    INITIALIZED,
    FAILED;

    private static final InitializationState[] $values() [...] // Inlined contents

    @Override
    @l
    public String toString() {
        Locale locale0 = Locale.getDefault();
        L.o(locale0, "getDefault()");
        String s = super.toString().toLowerCase(locale0);
        L.o(s, "this as java.lang.String).toLowerCase(locale)");
        return s;
    }
}

