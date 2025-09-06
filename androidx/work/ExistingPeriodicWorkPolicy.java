package androidx.work;

import kotlin.c0;
import kotlin.k;

public enum ExistingPeriodicWorkPolicy {
    @k(message = "Deprecated in favor of the UPDATE policy. UPDATE policy has very similar behavior: next run of the worker with the same unique name, going to have new specification. However, UPDATE has better defaults: unlike REPLACE policy UPDATE won\'t cancel the worker if it is currently running and new worker specification will be used only on the next run. Also it preserves original enqueue time, so unlike REPLACE period isn\'t reset. If you want to preserve previous behavior, CANCEL_AND_REENQUEUE should be used.", replaceWith = @c0(expression = "UPDATE", imports = {}))
    REPLACE,
    KEEP,
    UPDATE,
    CANCEL_AND_REENQUEUE;

    private static final ExistingPeriodicWorkPolicy[] a() [...] // Inlined contents
}

