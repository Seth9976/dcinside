package androidx.core.os;

import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RequiresApi(api = 35)
public abstract class ProfilingRequestBuilder {
    @m
    private String a;
    @m
    private CancellationSignal b;

    @l
    public final ProfilingRequest a() {
        return new ProfilingRequest(this.c(), this.b(), this.a, this.b);
    }

    @RestrictTo({Scope.f})
    @l
    protected abstract Bundle b();

    @RestrictTo({Scope.f})
    protected abstract int c();

    @RestrictTo({Scope.f})
    @l
    protected abstract ProfilingRequestBuilder d();

    @l
    public final ProfilingRequestBuilder e(@l CancellationSignal cancellationSignal0) {
        L.p(cancellationSignal0, "cancellationSignal");
        this.b = cancellationSignal0;
        return this.d();
    }

    @l
    public final ProfilingRequestBuilder f(@l String s) {
        L.p(s, "tag");
        this.a = s;
        return this.d();
    }
}

