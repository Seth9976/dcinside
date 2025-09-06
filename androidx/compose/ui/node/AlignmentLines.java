package androidx.compose.ui.node;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.S0;
import kotlin.collections.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.math.b;
import y4.l;
import y4.m;

public abstract class AlignmentLines {
    @l
    private final AlignmentLinesOwner a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    @m
    private AlignmentLinesOwner h;
    @l
    private final Map i;

    private AlignmentLines(AlignmentLinesOwner alignmentLinesOwner0) {
        this.a = alignmentLinesOwner0;
        this.b = true;
        this.i = new HashMap();
    }

    public AlignmentLines(AlignmentLinesOwner alignmentLinesOwner0, w w0) {
        this(alignmentLinesOwner0);
    }

    private final void c(AlignmentLine alignmentLine0, int v, NodeCoordinator nodeCoordinator0) {
        long v1 = OffsetKt.a(v, v);
        while(true) {
            v1 = this.d(nodeCoordinator0, v1);
            nodeCoordinator0 = nodeCoordinator0.O2();
            L.m(nodeCoordinator0);
            if(L.g(nodeCoordinator0, this.a.G0())) {
                break;
            }
            if(this.e(nodeCoordinator0).containsKey(alignmentLine0)) {
                float f = (float)this.i(nodeCoordinator0, alignmentLine0);
                v1 = OffsetKt.a(f, f);
            }
        }
        int v2 = alignmentLine0 instanceof HorizontalAlignmentLine ? b.L0(Offset.r(v1)) : b.L0(Offset.p(v1));
        Map map0 = this.i;
        if(map0.containsKey(alignmentLine0)) {
            v2 = AlignmentLineKt.c(alignmentLine0, ((Number)Y.K(this.i, alignmentLine0)).intValue(), v2);
        }
        map0.put(alignmentLine0, v2);
    }

    protected abstract long d(@l NodeCoordinator arg1, long arg2);

    @l
    protected abstract Map e(@l NodeCoordinator arg1);

    @l
    public final AlignmentLinesOwner f() {
        return this.a;
    }

    public final boolean g() {
        return this.b;
    }

    @l
    public final Map h() {
        return this.i;
    }

    protected abstract int i(@l NodeCoordinator arg1, @l AlignmentLine arg2);

    public final boolean j() {
        return this.e;
    }

    // 去混淆评级： 低(40)
    public final boolean k() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean l() {
        this.s();
        return this.h != null;
    }

    public final boolean m() {
        return this.g;
    }

    public final boolean n() {
        return this.f;
    }

    public final boolean o() {
        return this.d;
    }

    public final boolean p() {
        return this.c;
    }

    public final void q() {
        this.b = true;
        AlignmentLinesOwner alignmentLinesOwner0 = this.a.h();
        if(alignmentLinesOwner0 == null) {
            return;
        }
        if(this.c) {
            alignmentLinesOwner0.f();
        }
        else if(this.e || this.d) {
            alignmentLinesOwner0.requestLayout();
        }
        if(this.f) {
            this.a.f();
        }
        if(this.g) {
            alignmentLinesOwner0.requestLayout();
        }
        alignmentLinesOwner0.k().q();
    }

    public final void r() {
        this.i.clear();
        androidx.compose.ui.node.AlignmentLines.recalculate.1 alignmentLines$recalculate$10 = new Function1() {
            final AlignmentLines e;

            {
                this.e = alignmentLines0;
                super(1);
            }

            public final void a(@l AlignmentLinesOwner alignmentLinesOwner0) {
                L.p(alignmentLinesOwner0, "childOwner");
                if(!alignmentLinesOwner0.u()) {
                    return;
                }
                if(alignmentLinesOwner0.k().g()) {
                    alignmentLinesOwner0.r0();
                }
                Map map0 = alignmentLinesOwner0.k().i;
                AlignmentLines alignmentLines0 = this.e;
                for(Object object0: map0.entrySet()) {
                    alignmentLines0.c(((AlignmentLine)((Map.Entry)object0).getKey()), ((Number)((Map.Entry)object0).getValue()).intValue(), alignmentLinesOwner0.G0());
                }
                NodeCoordinator nodeCoordinator0 = alignmentLinesOwner0.G0().O2();
                L.m(nodeCoordinator0);
                while(!L.g(nodeCoordinator0, this.e.f().G0())) {
                    Set set0 = this.e.e(nodeCoordinator0).keySet();
                    AlignmentLines alignmentLines1 = this.e;
                    for(Object object1: set0) {
                        alignmentLines1.c(((AlignmentLine)object1), alignmentLines1.i(nodeCoordinator0, ((AlignmentLine)object1)), nodeCoordinator0);
                    }
                    nodeCoordinator0 = nodeCoordinator0.O2();
                    L.m(nodeCoordinator0);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((AlignmentLinesOwner)object0));
                return S0.a;
            }
        };
        this.a.u1(alignmentLines$recalculate$10);
        Map map0 = this.e(this.a.G0());
        this.i.putAll(map0);
        this.b = false;
    }

    public final void s() {
        if(this.k()) {
            this.h = this.a;
            return;
        }
        AlignmentLinesOwner alignmentLinesOwner0 = this.a.h();
        if(alignmentLinesOwner0 == null) {
            return;
        }
        AlignmentLinesOwner alignmentLinesOwner1 = alignmentLinesOwner0.k().h;
        if(alignmentLinesOwner1 != null && alignmentLinesOwner1.k().k()) {
            this.h = alignmentLinesOwner1;
        }
        else {
            AlignmentLinesOwner alignmentLinesOwner2 = this.h;
            if(alignmentLinesOwner2 != null && !alignmentLinesOwner2.k().k()) {
                AlignmentLinesOwner alignmentLinesOwner3 = alignmentLinesOwner2.h();
                if(alignmentLinesOwner3 != null) {
                    AlignmentLines alignmentLines0 = alignmentLinesOwner3.k();
                    if(alignmentLines0 != null) {
                        alignmentLines0.s();
                    }
                }
                AlignmentLinesOwner alignmentLinesOwner4 = alignmentLinesOwner2.h();
                if(alignmentLinesOwner4 == null) {
                    alignmentLinesOwner1 = null;
                }
                else {
                    AlignmentLines alignmentLines1 = alignmentLinesOwner4.k();
                    alignmentLinesOwner1 = alignmentLines1 == null ? null : alignmentLines1.h;
                }
                this.h = alignmentLinesOwner1;
            }
        }
    }

    public final void t() {
        this.b = true;
        this.c = false;
        this.e = false;
        this.d = false;
        this.f = false;
        this.g = false;
        this.h = null;
    }

    public final void u(boolean z) {
        this.b = z;
    }

    public final void v(boolean z) {
        this.e = z;
    }

    public final void w(boolean z) {
        this.g = z;
    }

    public final void x(boolean z) {
        this.f = z;
    }

    public final void y(boolean z) {
        this.d = z;
    }

    public final void z(boolean z) {
        this.c = z;
    }
}

