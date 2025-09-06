package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorApplier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
public final class VectorApplier extends AbstractApplier {
    public static final int e;

    static {
    }

    public VectorApplier(@l VNode vNode0) {
        L.p(vNode0, "root");
        super(vNode0);
    }

    @Override  // androidx.compose.runtime.Applier
    public void b(int v, int v1) {
        this.o(((VNode)this.a())).r(v, v1);
    }

    @Override  // androidx.compose.runtime.Applier
    public void e(int v, int v1, int v2) {
        this.o(((VNode)this.a())).q(v, v1, v2);
    }

    @Override  // androidx.compose.runtime.Applier
    public void f(int v, Object object0) {
        this.q(v, ((VNode)object0));
    }

    @Override  // androidx.compose.runtime.Applier
    public void g(int v, Object object0) {
        this.p(v, ((VNode)object0));
    }

    @Override  // androidx.compose.runtime.AbstractApplier
    protected void l() {
        GroupComponent groupComponent0 = this.o(((VNode)this.j()));
        groupComponent0.r(0, groupComponent0.g());
    }

    private final GroupComponent o(VNode vNode0) {
        if(!(vNode0 instanceof GroupComponent)) {
            throw new IllegalStateException("Cannot only insert VNode into Group");
        }
        return (GroupComponent)vNode0;
    }

    public void p(int v, @l VNode vNode0) {
        L.p(vNode0, "instance");
    }

    public void q(int v, @l VNode vNode0) {
        L.p(vNode0, "instance");
        this.o(((VNode)this.a())).p(v, vNode0);
    }
}

