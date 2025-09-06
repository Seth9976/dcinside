package androidx.compose.runtime;

public enum InvalidationResult {
    IGNORED,
    SCHEDULED,
    DEFERRED,
    IMMINENT;

    private static final InvalidationResult[] a() [...] // Inlined contents
}

