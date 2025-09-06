package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import y4.l;

@RequiresApi(api = 35)
public final class StackSamplingRequestBuilder extends ProfilingRequestBuilder {
    @l
    private final Bundle c;

    public StackSamplingRequestBuilder() {
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
        return 3;
    }

    @Override  // androidx.core.os.ProfilingRequestBuilder
    public ProfilingRequestBuilder d() {
        return this;
    }

    @RestrictTo({Scope.f})
    @l
    protected StackSamplingRequestBuilder g() [...] // Inlined contents

    @l
    public final StackSamplingRequestBuilder h(int v) {
        this.c.putInt("KEY_SIZE_KB", v);
        return this;
    }

    @l
    public final StackSamplingRequestBuilder i(int v) {
        this.c.putInt("KEY_DURATION_MS", v);
        return this;
    }

    @l
    public final StackSamplingRequestBuilder j(int v) {
        this.c.putInt("KEY_FREQUENCY_HZ", v);
        return this;
    }
}

