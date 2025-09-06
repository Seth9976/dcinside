package androidx.compose.ui.layout;

import A3.o;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import kotlin.S0;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class SubcomposeLayoutState {
    public interface PrecomposedSlotHandle {
        int a();

        void b(int arg1, long arg2);

        void dispose();
    }

    @l
    private final SubcomposeSlotReusePolicy a;
    @m
    private LayoutNodeSubcompositionsState b;
    @l
    private final o c;
    @l
    private final o d;
    @l
    private final o e;
    public static final int f = 8;

    static {
    }

    public SubcomposeLayoutState() {
        this(NoOpSubcomposeSlotReusePolicy.a);
    }

    @k(message = "This constructor is deprecated", replaceWith = @c0(expression = "SubcomposeLayoutState(SubcomposeSlotReusePolicy(maxSlotsToRetainForReuse))", imports = {"androidx.compose.ui.layout.SubcomposeSlotReusePolicy"}))
    public SubcomposeLayoutState(int v) {
        this(SubcomposeLayoutKt.c(v));
    }

    public SubcomposeLayoutState(@l SubcomposeSlotReusePolicy subcomposeSlotReusePolicy0) {
        L.p(subcomposeSlotReusePolicy0, "slotReusePolicy");
        super();
        this.a = subcomposeSlotReusePolicy0;
        this.c = new o() {
            final SubcomposeLayoutState e;

            {
                this.e = subcomposeLayoutState0;
                super(2);
            }

            public final void a(@l LayoutNode layoutNode0, @l SubcomposeLayoutState subcomposeLayoutState0) {
                L.p(layoutNode0, "$this$null");
                L.p(subcomposeLayoutState0, "it");
                SubcomposeLayoutState subcomposeLayoutState1 = this.e;
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0 = layoutNode0.F0();
                if(layoutNodeSubcompositionsState0 == null) {
                    layoutNodeSubcompositionsState0 = new LayoutNodeSubcompositionsState(layoutNode0, this.e.a);
                    layoutNode0.S1(layoutNodeSubcompositionsState0);
                }
                subcomposeLayoutState1.b = layoutNodeSubcompositionsState0;
                this.e.i().t();
                this.e.i().y(this.e.a);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((LayoutNode)object0), ((SubcomposeLayoutState)object1));
                return S0.a;
            }
        };
        this.d = new o() {
            final SubcomposeLayoutState e;

            {
                this.e = subcomposeLayoutState0;
                super(2);
            }

            public final void a(@l LayoutNode layoutNode0, @l CompositionContext compositionContext0) {
                L.p(layoutNode0, "$this$null");
                L.p(compositionContext0, "it");
                this.e.i().x(compositionContext0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((LayoutNode)object0), ((CompositionContext)object1));
                return S0.a;
            }
        };
        this.e = new o() {
            final SubcomposeLayoutState e;

            {
                this.e = subcomposeLayoutState0;
                super(2);
            }

            public final void a(@l LayoutNode layoutNode0, @l o o0) {
                L.p(layoutNode0, "$this$null");
                L.p(o0, "it");
                layoutNode0.l(this.e.i().k(o0));
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((LayoutNode)object0), ((o)object1));
                return S0.a;
            }
        };
    }

    public final void d() {
        this.i().m();
    }

    public final void e() {
        this.i().o();
    }

    @l
    public final o f() {
        return this.d;
    }

    @l
    public final o g() {
        return this.e;
    }

    @l
    public final o h() {
        return this.c;
    }

    private final LayoutNodeSubcompositionsState i() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0 = this.b;
        if(layoutNodeSubcompositionsState0 == null) {
            throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
        }
        return layoutNodeSubcompositionsState0;
    }

    @l
    public final PrecomposedSlotHandle j(@m Object object0, @l o o0) {
        L.p(o0, "content");
        return this.i().w(object0, o0);
    }
}

