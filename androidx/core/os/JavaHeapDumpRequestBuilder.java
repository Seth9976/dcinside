package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import y4.l;

@RequiresApi(api = 35)
public final class JavaHeapDumpRequestBuilder extends ProfilingRequestBuilder {
    @l
    private final Bundle c;

    public JavaHeapDumpRequestBuilder() {
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
        return 1;
    }

    @Override  // androidx.core.os.ProfilingRequestBuilder
    public ProfilingRequestBuilder d() {
        return this;
    }

    @RestrictTo({Scope.f})
    @l
    protected JavaHeapDumpRequestBuilder g() [...] // Inlined contents

    @l
    public final JavaHeapDumpRequestBuilder h(int v) {
        this.c.putInt("KEY_SIZE_KB", v);
        return this;
    }
}

