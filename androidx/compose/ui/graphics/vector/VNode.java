package androidx.compose.ui.graphics.vector;

import A3.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public abstract class VNode {
    @m
    private a a;
    public static final int b = 8;

    static {
    }

    private VNode() {
    }

    public VNode(w w0) {
    }

    public abstract void a(@l DrawScope arg1);

    @m
    public a b() {
        return this.a;
    }

    public final void c() {
        a a0 = this.b();
        if(a0 != null) {
            a0.invoke();
        }
    }

    public void d(@m a a0) {
        this.a = a0;
    }
}

