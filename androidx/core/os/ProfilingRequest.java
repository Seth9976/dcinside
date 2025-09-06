package androidx.core.os;

import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RequiresApi(api = 35)
public final class ProfilingRequest {
    private final int a;
    @l
    private final Bundle b;
    @m
    private final String c;
    @m
    private final CancellationSignal d;

    public ProfilingRequest(int v, @l Bundle bundle0, @m String s, @m CancellationSignal cancellationSignal0) {
        L.p(bundle0, "params");
        super();
        this.a = v;
        this.b = bundle0;
        this.c = s;
        this.d = cancellationSignal0;
    }

    @m
    public final CancellationSignal a() {
        return this.d;
    }

    @l
    public final Bundle b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    @m
    public final String d() {
        return this.c;
    }
}

