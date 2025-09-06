package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import y4.l;

@RequiresApi(api = 35)
public final class HeapProfileRequestBuilder extends ProfilingRequestBuilder {
    @l
    private final Bundle c;

    public HeapProfileRequestBuilder() {
        this.c = new Bundle();
    }

    @Override  // androidx.core.os.ProfilingRequestBuilder
    @RestrictTo({Scope.f})
    @l
    protected Bundle b() {
        return this.c;
    }

    @Override  // androidx.core.os.ProfilingRequestBuilder
    @RestrictTo({Scope.f})
    protected int c() {
        return 2;
    }

    @Override  // androidx.core.os.ProfilingRequestBuilder
    public ProfilingRequestBuilder d() {
        return this;
    }

    @RestrictTo({Scope.f})
    @l
    protected HeapProfileRequestBuilder g() [...] // Inlined contents

    @l
    public final HeapProfileRequestBuilder h(int v) {
        this.c.putInt("KEY_SIZE_KB", v);
        return this;
    }

    @l
    public final HeapProfileRequestBuilder i(int v) {
        this.c.putInt("KEY_DURATION_MS", v);
        return this;
    }

    @l
    public final HeapProfileRequestBuilder j(long v) {
        this.c.putLong("KEY_SAMPLING_INTERVAL_BYTES", v);
        return this;
    }

    @l
    public final HeapProfileRequestBuilder k(boolean z) {
        this.c.putBoolean("KEY_TRACK_JAVA_ALLOCATIONS", z);
        return this;
    }
}

