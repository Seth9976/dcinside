package androidx.compose.ui.node;

import androidx.compose.ui.layout.LookaheadScope;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nLayoutTreeConsistencyChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,141:1\n33#2,6:142\n116#2,2:148\n33#2,6:150\n118#2:156\n116#2,2:157\n33#2,6:159\n118#2:165\n33#2,6:166\n*S KotlinDebug\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n*L\n44#1:142,6\n59#1:148,2\n59#1:150,6\n59#1:156\n82#1:157,2\n82#1:159,6\n82#1:165\n134#1:166,6\n*E\n"})
public final class LayoutTreeConsistencyChecker {
    @l
    private final LayoutNode a;
    @l
    private final DepthSortedSet b;
    @l
    private final List c;

    public LayoutTreeConsistencyChecker(@l LayoutNode layoutNode0, @l DepthSortedSet depthSortedSet0, @l List list0) {
        L.p(layoutNode0, "root");
        L.p(depthSortedSet0, "relayoutNodes");
        L.p(list0, "postponedMeasureRequests");
        super();
        this.a = layoutNode0;
        this.b = depthSortedSet0;
        this.c = list0;
    }

    public final void a() {
        if(this.c(this.a)) {
            return;
        }
        String s = this.d();
        System.out.println(s);
        throw new IllegalStateException("Inconsistency found!");
    }

    private final boolean b(LayoutNode layoutNode0) {
        LayoutNode layoutNode1 = layoutNode0.C0();
        Object object0 = null;
        LayoutState layoutNode$LayoutState0 = layoutNode1 == null ? null : layoutNode1.m0();
        if(layoutNode0.u() || layoutNode0.D0() != 0x7FFFFFFF && layoutNode1 != null && layoutNode1.u()) {
            if(layoutNode0.t0()) {
                List list0 = this.c;
                int v = list0.size();
                for(int v1 = 0; true; ++v1) {
                    Object object1 = null;
                    if(v1 >= v) {
                        break;
                    }
                    Object object2 = list0.get(v1);
                    if(L.g(((PostponedRequest)object2).a(), layoutNode0) && !((PostponedRequest)object2).c()) {
                        object1 = object2;
                        break;
                    }
                }
                if(object1 != null) {
                    return true;
                }
            }
            if(layoutNode0.t0()) {
                return this.b.b(layoutNode0) || layoutNode1 != null && layoutNode1.t0() || layoutNode$LayoutState0 == LayoutState.a;
            }
            if(layoutNode0.l0()) {
                return this.b.b(layoutNode0) || layoutNode1 == null || layoutNode1.t0() || layoutNode1.l0() || layoutNode$LayoutState0 == LayoutState.a || layoutNode$LayoutState0 == LayoutState.c;
            }
        }
        if(L.g(layoutNode0.Z0(), Boolean.TRUE)) {
            if(layoutNode0.o0()) {
                List list1 = this.c;
                int v2 = list1.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    Object object3 = list1.get(v3);
                    if(L.g(((PostponedRequest)object3).a(), layoutNode0) && ((PostponedRequest)object3).c()) {
                        object0 = object3;
                        break;
                    }
                }
                if(object0 != null) {
                    return true;
                }
            }
            if(layoutNode0.o0()) {
                if(!this.b.b(layoutNode0) && (layoutNode1 == null || !layoutNode1.o0()) && layoutNode$LayoutState0 != LayoutState.b) {
                    if(layoutNode1 != null && layoutNode1.t0()) {
                        LookaheadScope lookaheadScope0 = layoutNode0.r0();
                        L.m(lookaheadScope0);
                        return L.g(lookaheadScope0.a(), layoutNode0);
                    }
                    return false;
                }
                return true;
            }
            if(layoutNode0.n0() && (!this.b.b(layoutNode0) && layoutNode1 != null && !layoutNode1.o0() && !layoutNode1.n0() && layoutNode$LayoutState0 != LayoutState.b && layoutNode$LayoutState0 != LayoutState.d)) {
                if(layoutNode1.l0()) {
                    LookaheadScope lookaheadScope1 = layoutNode0.r0();
                    L.m(lookaheadScope1);
                    return L.g(lookaheadScope1.a(), layoutNode0);
                }
                return false;
            }
            return true;
        }
        return true;
    }

    private final boolean c(LayoutNode layoutNode0) {
        if(!this.b(layoutNode0)) {
            return false;
        }
        List list0 = layoutNode0.a0();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!this.c(((LayoutNode)list0.get(v1)))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Tree state:");
        L.o(stringBuilder0, "append(value)");
        stringBuilder0.append('\n');
        L.o(stringBuilder0, "append(\'\\n\')");
        LayoutTreeConsistencyChecker.e(this, stringBuilder0, this.a, 0);
        String s = stringBuilder0.toString();
        L.o(s, "stringBuilder.toString()");
        return s;
    }

    private static final void e(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0, StringBuilder stringBuilder0, LayoutNode layoutNode0, int v) {
        String s = layoutTreeConsistencyChecker0.f(layoutNode0);
        if(s.length() > 0) {
            for(int v2 = 0; v2 < v; ++v2) {
                stringBuilder0.append("..");
            }
            stringBuilder0.append(s);
            L.o(stringBuilder0, "append(value)");
            stringBuilder0.append('\n');
            L.o(stringBuilder0, "append(\'\\n\')");
            ++v;
        }
        List list0 = layoutNode0.a0();
        int v3 = list0.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            LayoutTreeConsistencyChecker.e(layoutTreeConsistencyChecker0, stringBuilder0, ((LayoutNode)list0.get(v1)), v);
        }
    }

    private final String f(LayoutNode layoutNode0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(layoutNode0);
        stringBuilder0.append('[' + layoutNode0.m0() + ']');
        if(!layoutNode0.u()) {
            stringBuilder0.append("[!isPlaced]");
        }
        stringBuilder0.append("[measuredByParent=" + layoutNode0.u0() + ']');
        if(!this.b(layoutNode0)) {
            stringBuilder0.append("[INCONSISTENT]");
        }
        String s = stringBuilder0.toString();
        L.o(s, "with(StringBuilder()) {\n…     toString()\n        }");
        return s;
    }
}

