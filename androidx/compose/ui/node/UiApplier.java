package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractApplier;
import kotlin.jvm.internal.L;
import y4.l;

public final class UiApplier extends AbstractApplier {
    public UiApplier(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "root");
        super(layoutNode0);
    }

    @Override  // androidx.compose.runtime.Applier
    public void b(int v, int v1) {
        ((LayoutNode)this.a()).t1(v, v1);
    }

    @Override  // androidx.compose.runtime.AbstractApplier
    public void c() {
        super.c();
        Owner owner0 = ((LayoutNode)this.j()).B0();
        if(owner0 != null) {
            owner0.o();
        }
    }

    @Override  // androidx.compose.runtime.Applier
    public void e(int v, int v1, int v2) {
        ((LayoutNode)this.a()).j1(v, v1, v2);
    }

    @Override  // androidx.compose.runtime.Applier
    public void f(int v, Object object0) {
        this.p(v, ((LayoutNode)object0));
    }

    @Override  // androidx.compose.runtime.Applier
    public void g(int v, Object object0) {
        this.o(v, ((LayoutNode)object0));
    }

    @Override  // androidx.compose.runtime.AbstractApplier
    protected void l() {
        ((LayoutNode)this.j()).s1();
    }

    public void o(int v, @l LayoutNode layoutNode0) {
        L.p(layoutNode0, "instance");
        ((LayoutNode)this.a()).O0(v, layoutNode0);
    }

    public void p(int v, @l LayoutNode layoutNode0) {
        L.p(layoutNode0, "instance");
    }
}

