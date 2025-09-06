package androidx.work;

import androidx.annotation.RequiresApi;

public enum NetworkType {
    NOT_REQUIRED,
    CONNECTED,
    UNMETERED,
    NOT_ROAMING,
    METERED,
    @RequiresApi(30)
    TEMPORARILY_UNMETERED;

    private static final NetworkType[] a() [...] // Inlined contents
}

