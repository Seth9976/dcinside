package androidx.compose.ui.tooling.preview.datasource;

import A3.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import kotlin.jvm.internal.l0.f;
import kotlin.sequences.m;
import kotlin.sequences.p;
import y4.l;

@StabilityInferred(parameters = 0)
public final class LoremIpsum implements PreviewParameterProvider {
    private final int a;
    public static final int b;

    static {
    }

    public LoremIpsum() {
        this(500);
    }

    public LoremIpsum(int v) {
        this.a = v;
    }

    @Override  // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @l
    public m Q() {
        return p.q(new String[]{this.a(this.a)});
    }

    private final String a(int v) {
        return p.e1(p.Y2(p.l(new a(LoremIpsumKt.a.size()) {
            final f e;
            final int f;

            {
                this.e = l0$f0;
                this.f = v;
                super(0);
            }

            @y4.m
            public final String b() {
                int v = this.e.a;
                this.e.a = v + 1;
                return (String)LoremIpsumKt.a.get(v % this.f);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }), v), " ", null, null, 0, null, null, 62, null);
    }

    @Override  // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public int getCount() {
        return e.a.a(this);
    }
}

