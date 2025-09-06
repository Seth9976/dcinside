package androidx.compose.ui.node;

import A3.a;
import kotlin.jvm.internal.N;
import y4.l;

final class ComposeUiNode.Companion.VirtualConstructor.1 extends N implements a {
    public static final ComposeUiNode.Companion.VirtualConstructor.1 e;

    static {
        ComposeUiNode.Companion.VirtualConstructor.1.e = new ComposeUiNode.Companion.VirtualConstructor.1();
    }

    ComposeUiNode.Companion.VirtualConstructor.1() {
        super(0);
    }

    @l
    public final LayoutNode b() {
        return new LayoutNode(true, 0, 2, null);
    }

    @Override  // A3.a
    public Object invoke() {
        return this.b();
    }
}

