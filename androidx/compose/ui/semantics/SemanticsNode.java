package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,436:1\n1#2:437\n33#3,6:438\n33#3,6:444\n33#3,6:450\n73#4:456\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n*L\n188#1:438,6\n211#1:444,6\n309#1:450,6\n331#1:456\n*E\n"})
public final class SemanticsNode {
    @l
    private final SemanticsModifierNode a;
    private final boolean b;
    @l
    private final LayoutNode c;
    private boolean d;
    @m
    private SemanticsNode e;
    @l
    private final SemanticsConfiguration f;
    private final int g;
    public static final int h = 8;

    static {
    }

    public SemanticsNode(@l SemanticsModifierNode semanticsModifierNode0, boolean z, @l LayoutNode layoutNode0) {
        L.p(semanticsModifierNode0, "outerSemanticsNode");
        L.p(layoutNode0, "layoutNode");
        super();
        this.a = semanticsModifierNode0;
        this.b = z;
        this.c = layoutNode0;
        this.f = SemanticsModifierNodeKt.a(semanticsModifierNode0);
        this.g = layoutNode0.w();
    }

    public SemanticsNode(SemanticsModifierNode semanticsModifierNode0, boolean z, LayoutNode layoutNode0, int v, w w0) {
        if((v & 4) != 0) {
            layoutNode0 = DelegatableNodeKt.p(semanticsModifierNode0);
        }
        this(semanticsModifierNode0, z, layoutNode0);
    }

    public final boolean A() {
        return this.q() == null;
    }

    public final boolean B() {
        NodeCoordinator nodeCoordinator0 = this.c();
        return nodeCoordinator0 == null ? false : nodeCoordinator0.b3();
    }

    private final void C(SemanticsConfiguration semanticsConfiguration0) {
        if(!this.f.j()) {
            List list0 = SemanticsNode.F(this, false, 1, null);
            int v1 = list0.size();
            for(int v = 0; v < v1; ++v) {
                SemanticsNode semanticsNode0 = (SemanticsNode)list0.get(v);
                if(!semanticsNode0.z()) {
                    semanticsConfiguration0.l(semanticsNode0.f);
                    semanticsNode0.C(semanticsConfiguration0);
                }
            }
        }
    }

    public final void D(boolean z) {
        this.d = z;
    }

    @l
    public final List E(boolean z) {
        if(this.d) {
            return u.H();
        }
        List list0 = new ArrayList();
        List list1 = SemanticsNodeKt.g(this.c, null, 1, null);
        int v = list1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            list0.add(new SemanticsNode(((SemanticsModifierNode)list1.get(v1)), this.b, null, 4, null));
        }
        if(z) {
            this.a(list0);
        }
        return list0;
    }

    public static List F(SemanticsNode semanticsNode0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return semanticsNode0.E(z);
    }

    private final void a(List list0) {
        Role role0 = SemanticsNodeKt.l(this);
        if(role0 != null && this.f.k() && !list0.isEmpty()) {
            list0.add(this.b(role0, new Function1() {
                final Role e;

                {
                    this.e = role0;
                    super(1);
                }

                public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                    L.p(semanticsPropertyReceiver0, "$this$fakeSemanticsNode");
                    SemanticsPropertiesKt.R0(semanticsPropertyReceiver0, this.e.n());
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((SemanticsPropertyReceiver)object0));
                    return S0.a;
                }
            }));
        }
        SemanticsProperties semanticsProperties0 = SemanticsProperties.a;
        if(this.f.c(semanticsProperties0.c()) && !list0.isEmpty() && this.f.k()) {
            List list1 = (List)SemanticsConfigurationKt.a(this.f, semanticsProperties0.c());
            String s = list1 == null ? null : ((String)u.G2(list1));
            if(s != null) {
                list0.add(0, this.b(null, new Function1() {
                    final String e;

                    {
                        this.e = s;
                        super(1);
                    }

                    public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                        L.p(semanticsPropertyReceiver0, "$this$fakeSemanticsNode");
                        SemanticsPropertiesKt.G0(semanticsPropertyReceiver0, this.e);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((SemanticsPropertyReceiver)object0));
                        return S0.a;
                    }
                }));
            }
        }
    }

    private final SemanticsNode b(Role role0, Function1 function10) {
        SemanticsNode semanticsNode0 = new SemanticsNode(new SemanticsModifierNode() {
            @l
            private final SemanticsConfiguration l;

            {
                SemanticsConfiguration semanticsConfiguration0 = new SemanticsConfiguration();
                semanticsConfiguration0.o(false);
                semanticsConfiguration0.m(false);
                function10.invoke(semanticsConfiguration0);
                this.l = semanticsConfiguration0;
            }

            @Override  // androidx.compose.ui.node.SemanticsModifierNode
            @l
            public SemanticsConfiguration c0() {
                return this.l;
            }
        }, false, new LayoutNode(true, (role0 == null ? SemanticsNodeKt.d(this) : SemanticsNodeKt.m(this))));
        semanticsNode0.d = true;
        semanticsNode0.e = this;
        return semanticsNode0;
    }

    @m
    public final NodeCoordinator c() {
        NodeCoordinator nodeCoordinator0 = null;
        if(this.d) {
            SemanticsNode semanticsNode0 = this.q();
            return semanticsNode0 == null ? null : semanticsNode0.c();
        }
        SemanticsModifierNode semanticsModifierNode0 = SemanticsNodeKt.h(this.c);
        if(this.f.k()) {
            nodeCoordinator0 = semanticsModifierNode0;
        }
        if(nodeCoordinator0 == null) {
            nodeCoordinator0 = this.a;
        }
        return DelegatableNodeKt.o(((DelegatableNode)nodeCoordinator0), 8);
    }

    private final List d(List list0) {
        List list1 = SemanticsNode.F(this, false, 1, null);
        int v1 = list1.size();
        for(int v = 0; v < v1; ++v) {
            SemanticsNode semanticsNode0 = (SemanticsNode)list1.get(v);
            if(semanticsNode0.z()) {
                list0.add(semanticsNode0);
            }
            else if(!semanticsNode0.f.j()) {
                semanticsNode0.d(list0);
            }
        }
        return list0;
    }

    static List e(SemanticsNode semanticsNode0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = new ArrayList();
        }
        return semanticsNode0.d(list0);
    }

    public final int f(@l AlignmentLine alignmentLine0) {
        L.p(alignmentLine0, "alignmentLine");
        NodeCoordinator nodeCoordinator0 = this.c();
        return nodeCoordinator0 == null ? 0x80000000 : nodeCoordinator0.v(alignmentLine0);
    }

    @l
    public final Rect g() {
        NodeCoordinator nodeCoordinator0 = this.c();
        if(nodeCoordinator0 != null) {
            if(!nodeCoordinator0.o()) {
                nodeCoordinator0 = null;
            }
            if(nodeCoordinator0 != null) {
                Rect rect0 = LayoutCoordinatesKt.b(nodeCoordinator0);
                return rect0 == null ? Rect.e.a() : rect0;
            }
        }
        return Rect.e.a();
    }

    @l
    public final Rect h() {
        NodeCoordinator nodeCoordinator0 = this.c();
        if(nodeCoordinator0 != null) {
            if(!nodeCoordinator0.o()) {
                nodeCoordinator0 = null;
            }
            if(nodeCoordinator0 != null) {
                Rect rect0 = LayoutCoordinatesKt.c(nodeCoordinator0);
                return rect0 == null ? Rect.e.a() : rect0;
            }
        }
        return Rect.e.a();
    }

    @l
    public final List i() {
        return this.j(!this.b, false);
    }

    private final List j(boolean z, boolean z1) {
        if(!z && this.f.j()) {
            return u.H();
        }
        return this.z() ? SemanticsNode.e(this, null, 1, null) : this.E(z1);
    }

    @l
    public final SemanticsConfiguration k() {
        if(this.z()) {
            SemanticsConfiguration semanticsConfiguration0 = this.f.d();
            this.C(semanticsConfiguration0);
            return semanticsConfiguration0;
        }
        return this.f;
    }

    public final int l() {
        return this.g;
    }

    @l
    public final LayoutInfo m() {
        return this.c;
    }

    @l
    public final LayoutNode n() {
        return this.c;
    }

    public final boolean o() {
        return this.b;
    }

    @l
    public final SemanticsModifierNode p() {
        return this.a;
    }

    @m
    public final SemanticsNode q() {
        SemanticsNode semanticsNode0 = this.e;
        if(semanticsNode0 != null) {
            return semanticsNode0;
        }
        LayoutNode layoutNode0 = this.b ? SemanticsNodeKt.e(this.c, androidx.compose.ui.semantics.SemanticsNode.parent.1.e) : null;
        if(layoutNode0 == null) {
            layoutNode0 = SemanticsNodeKt.e(this.c, androidx.compose.ui.semantics.SemanticsNode.parent.2.e);
        }
        SemanticsModifierNode semanticsModifierNode0 = layoutNode0 == null ? null : SemanticsNodeKt.j(layoutNode0);
        return semanticsModifierNode0 == null ? null : new SemanticsNode(semanticsModifierNode0, this.b, null, 4, null);

        final class androidx.compose.ui.semantics.SemanticsNode.parent.1 extends N implements Function1 {
            public static final androidx.compose.ui.semantics.SemanticsNode.parent.1 e;

            static {
                androidx.compose.ui.semantics.SemanticsNode.parent.1.e = new androidx.compose.ui.semantics.SemanticsNode.parent.1();
            }

            androidx.compose.ui.semantics.SemanticsNode.parent.1() {
                super(1);
            }

            @l
            public final Boolean a(@l LayoutNode layoutNode0) {
                L.p(layoutNode0, "it");
                SemanticsModifierNode semanticsModifierNode0 = SemanticsNodeKt.j(layoutNode0);
                boolean z = false;
                if(semanticsModifierNode0 != null) {
                    SemanticsConfiguration semanticsConfiguration0 = SemanticsModifierNodeKt.a(semanticsModifierNode0);
                    if(semanticsConfiguration0 != null && semanticsConfiguration0.k()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((LayoutNode)object0));
            }
        }


        final class androidx.compose.ui.semantics.SemanticsNode.parent.2 extends N implements Function1 {
            public static final androidx.compose.ui.semantics.SemanticsNode.parent.2 e;

            static {
                androidx.compose.ui.semantics.SemanticsNode.parent.2.e = new androidx.compose.ui.semantics.SemanticsNode.parent.2();
            }

            androidx.compose.ui.semantics.SemanticsNode.parent.2() {
                super(1);
            }

            @l
            public final Boolean a(@l LayoutNode layoutNode0) {
                L.p(layoutNode0, "it");
                return SemanticsNodeKt.j(layoutNode0) == null ? false : true;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((LayoutNode)object0));
            }
        }

    }

    public final long r() {
        NodeCoordinator nodeCoordinator0 = this.c();
        if(nodeCoordinator0 != null) {
            if(!nodeCoordinator0.o()) {
                nodeCoordinator0 = null;
            }
            return nodeCoordinator0 == null ? 0L : LayoutCoordinatesKt.f(nodeCoordinator0);
        }
        return 0L;
    }

    public final long s() {
        NodeCoordinator nodeCoordinator0 = this.c();
        if(nodeCoordinator0 != null) {
            if(!nodeCoordinator0.o()) {
                nodeCoordinator0 = null;
            }
            return nodeCoordinator0 == null ? 0L : LayoutCoordinatesKt.g(nodeCoordinator0);
        }
        return 0L;
    }

    @l
    public final List t() {
        return this.j(false, true);
    }

    @m
    public final RootForTest u() {
        Owner owner0 = this.c.B0();
        return owner0 == null ? null : owner0.getRootForTest();
    }

    public final long v() {
        NodeCoordinator nodeCoordinator0 = this.c();
        return nodeCoordinator0 == null ? 0L : nodeCoordinator0.a();
    }

    @l
    public final Rect w() {
        if(this.f.k()) {
            SemanticsModifierNode semanticsModifierNode0 = SemanticsNodeKt.h(this.c);
            return semanticsModifierNode0 == null ? SemanticsModifierNodeKt.e(this.a) : SemanticsModifierNodeKt.e(semanticsModifierNode0);
        }
        return SemanticsModifierNodeKt.e(this.a);
    }

    @l
    public final SemanticsConfiguration x() {
        return this.f;
    }

    public final boolean y() {
        return this.d;
    }

    // 去混淆评级： 低(20)
    private final boolean z() {
        return this.b && this.f.k();
    }
}

