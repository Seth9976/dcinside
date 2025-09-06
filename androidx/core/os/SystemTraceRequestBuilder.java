package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(api = 35)
public final class SystemTraceRequestBuilder extends ProfilingRequestBuilder {
    @l
    private final Bundle c;

    public SystemTraceRequestBuilder() {
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
        return 4;
    }

    @Override  // androidx.core.os.ProfilingRequestBuilder
    public ProfilingRequestBuilder d() {
        return this;
    }

    @RestrictTo({Scope.f})
    @l
    protected SystemTraceRequestBuilder g() [...] // Inlined contents

    @l
    public final SystemTraceRequestBuilder h(@l BufferFillPolicy bufferFillPolicy0) {
        L.p(bufferFillPolicy0, "bufferFillPolicy");
        int v = bufferFillPolicy0.a();
        this.c.putInt("KEY_BUFFER_FILL_POLICY", v);
        return this;
    }

    @l
    public final SystemTraceRequestBuilder i(int v) {
        this.c.putInt("KEY_SIZE_KB", v);
        return this;
    }

    @l
    public final SystemTraceRequestBuilder j(int v) {
        this.c.putInt("KEY_DURATION_MS", v);
        return this;
    }
}

