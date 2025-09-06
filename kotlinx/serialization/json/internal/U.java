package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.L;
import kotlinx.serialization.json.b;
import y4.l;

public final class u extends m {
    @l
    private final b c;
    private int d;

    public u(@l Y y0, @l b b0) {
        L.p(y0, "writer");
        L.p(b0, "json");
        super(y0);
        this.c = b0;
    }

    @Override  // kotlinx.serialization.json.internal.m
    public void b() {
        this.n(true);
        ++this.d;
    }

    @Override  // kotlinx.serialization.json.internal.m
    public void c() {
        this.n(false);
        this.j("\n");
        int v1 = this.d;
        for(int v = 0; v < v1; ++v) {
            this.j("    ");
        }
    }

    @Override  // kotlinx.serialization.json.internal.m
    public void o() {
        this.e(' ');
    }

    @Override  // kotlinx.serialization.json.internal.m
    public void p() {
        --this.d;
    }
}

