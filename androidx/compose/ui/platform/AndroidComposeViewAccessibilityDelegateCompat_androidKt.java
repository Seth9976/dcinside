package androidx.compose.ui.platform;

import android.graphics.Region.Op;
import android.graphics.Region;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3169:1\n1#2:3170\n*E\n"})
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    private static final boolean A(SemanticsNode semanticsNode0) {
        return semanticsNode0.x().c(SemanticsActions.a.t());
    }

    // 去混淆评级： 低(20)
    private static final boolean B(SemanticsNode semanticsNode0) {
        return !semanticsNode0.B() && !semanticsNode0.x().c(SemanticsProperties.a.l());
    }

    private static void C(SemanticsNode semanticsNode0) {
    }

    // 去混淆评级： 低(20)
    private static final boolean D(OpenEndRange openEndRange0, OpenEndRange openEndRange1) {
        return !openEndRange0.isEmpty() && !openEndRange1.isEmpty() && Math.max(((Number)openEndRange0.getStart()).floatValue(), ((Number)openEndRange1.getStart()).floatValue()) < Math.min(((Number)openEndRange0.b()).floatValue(), ((Number)openEndRange1.b()).floatValue());
    }

    private static final boolean E(SemanticsNode semanticsNode0, SemanticsNodeCopy androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0) {
        for(Object object0: androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.c()) {
            if(!semanticsNode0.k().c(((SemanticsPropertyKey)((Map.Entry)object0).getKey()))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @l
    public static final OpenEndRange F(float f, float f1) {
        return new OpenEndFloatRange(f, f1);
    }

    private static final boolean m(AccessibilityAction accessibilityAction0, Object object0) {
        if(accessibilityAction0 == object0) {
            return true;
        }
        if(!(object0 instanceof AccessibilityAction)) {
            return false;
        }
        if(!L.g(accessibilityAction0.b(), ((AccessibilityAction)object0).b())) {
            return false;
        }
        return accessibilityAction0.a() != null || ((AccessibilityAction)object0).a() == null ? accessibilityAction0.a() == null || ((AccessibilityAction)object0).a() != null : false;
    }

    private static final boolean n(SemanticsNode semanticsNode0) {
        return SemanticsConfigurationKt.a(semanticsNode0.k(), SemanticsProperties.a.d()) == null;
    }

    private static final boolean o(SemanticsNode semanticsNode0) {
        if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.A(semanticsNode0) && !L.g(SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsProperties.a.g()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode layoutNode0 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.q(semanticsNode0.n(), androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities.ancestor.1.e);
        if(layoutNode0 != null) {
            SemanticsModifierNode semanticsModifierNode0 = SemanticsNodeKt.j(layoutNode0);
            if(semanticsModifierNode0 != null) {
                SemanticsConfiguration semanticsConfiguration0 = SemanticsModifierNodeKt.a(semanticsModifierNode0);
                return semanticsConfiguration0 == null ? true : !L.g(SemanticsConfigurationKt.a(semanticsConfiguration0, SemanticsProperties.a.g()), Boolean.TRUE);
            }
            return true;
        }
        return false;

        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities.ancestor.1 extends N implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities.ancestor.1 e;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities.ancestor.1.e = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities.ancestor.1();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities.ancestor.1() {
                super(1);
            }

            @l
            public final Boolean a(@l LayoutNode layoutNode0) {
                L.p(layoutNode0, "it");
                SemanticsModifierNode semanticsModifierNode0 = SemanticsNodeKt.j(layoutNode0);
                SemanticsConfiguration semanticsConfiguration0 = semanticsModifierNode0 == null ? null : SemanticsModifierNodeKt.a(semanticsModifierNode0);
                return Boolean.valueOf(semanticsConfiguration0 != null && semanticsConfiguration0.k() && semanticsConfiguration0.c(SemanticsActions.a.t()));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((LayoutNode)object0));
            }
        }

    }

    @m
    public static final ScrollObservationScope p(@l List list0, int v) {
        L.p(list0, "<this>");
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            if(((ScrollObservationScope)list0.get(v2)).e() == v) {
                return (ScrollObservationScope)list0.get(v2);
            }
        }
        return null;
    }

    private static final LayoutNode q(LayoutNode layoutNode0, Function1 function10) {
        for(LayoutNode layoutNode1 = layoutNode0.C0(); layoutNode1 != null; layoutNode1 = layoutNode1.C0()) {
            if(((Boolean)function10.invoke(layoutNode1)).booleanValue()) {
                return layoutNode1;
            }
        }
        return null;
    }

    @l
    public static final Map r(@l SemanticsOwner semanticsOwner0) {
        L.p(semanticsOwner0, "<this>");
        SemanticsNode semanticsNode0 = semanticsOwner0.b();
        Map map0 = new LinkedHashMap();
        if(semanticsNode0.n().u() && semanticsNode0.n().o()) {
            Region region0 = new Region();
            Rect rect0 = semanticsNode0.g();
            region0.set(new android.graphics.Rect(b.L0(rect0.t()), b.L0(rect0.B()), b.L0(rect0.x()), b.L0(rect0.j())));
            AndroidComposeViewAccessibilityDelegateCompat_androidKt.s(region0, semanticsNode0, map0, semanticsNode0);
        }
        return map0;
    }

    private static final void s(Region region0, SemanticsNode semanticsNode0, Map map0, SemanticsNode semanticsNode1) {
        Rect rect2;
        if(region0.isEmpty() && semanticsNode1.l() != semanticsNode0.l() || (!semanticsNode1.n().u() || !semanticsNode1.n().o()) && !semanticsNode1.y()) {
            return;
        }
        android.graphics.Rect rect0 = new android.graphics.Rect(b.L0(semanticsNode1.w().t()), b.L0(semanticsNode1.w().B()), b.L0(semanticsNode1.w().x()), b.L0(semanticsNode1.w().j()));
        Region region1 = new Region();
        region1.set(rect0);
        int v = semanticsNode1.l() == semanticsNode0.l() ? -1 : semanticsNode1.l();
        if(region1.op(region0, region1, Region.Op.INTERSECT)) {
            android.graphics.Rect rect1 = region1.getBounds();
            L.o(rect1, "region.bounds");
            map0.put(v, new SemanticsNodeWithAdjustedBounds(semanticsNode1, rect1));
            List list0 = semanticsNode1.t();
            for(int v1 = list0.size() - 1; -1 < v1; --v1) {
                AndroidComposeViewAccessibilityDelegateCompat_androidKt.s(region0, semanticsNode0, map0, ((SemanticsNode)list0.get(v1)));
            }
            region0.op(rect0, region0, Region.Op.REVERSE_DIFFERENCE);
            return;
        }
        if(semanticsNode1.y()) {
            SemanticsNode semanticsNode2 = semanticsNode1.q();
            if(semanticsNode2 == null) {
                rect2 = new Rect(0.0f, 0.0f, 10.0f, 10.0f);
            }
            else {
                LayoutInfo layoutInfo0 = semanticsNode2.m();
                rect2 = layoutInfo0 == null || !layoutInfo0.u() ? new Rect(0.0f, 0.0f, 10.0f, 10.0f) : semanticsNode2.g();
            }
            map0.put(v, new SemanticsNodeWithAdjustedBounds(semanticsNode1, new android.graphics.Rect(b.L0(rect2.t()), b.L0(rect2.B()), b.L0(rect2.x()), b.L0(rect2.j()))));
            return;
        }
        if(v == -1) {
            android.graphics.Rect rect3 = region1.getBounds();
            L.o(rect3, "region.bounds");
            map0.put(-1, new SemanticsNodeWithAdjustedBounds(semanticsNode1, rect3));
        }
    }

    private static final boolean t(SemanticsNode semanticsNode0) {
        return semanticsNode0.k().c(SemanticsProperties.a.a());
    }

    // 去混淆评级： 中等(50)
    private static final boolean u(SemanticsNode semanticsNode0) {
        return L.g(AndroidComposeViewAccessibilityDelegateCompat_androidKt.w(semanticsNode0), Boolean.FALSE) ? false : L.g(AndroidComposeViewAccessibilityDelegateCompat_androidKt.w(semanticsNode0), Boolean.TRUE) || AndroidComposeViewAccessibilityDelegateCompat_androidKt.t(semanticsNode0) || AndroidComposeViewAccessibilityDelegateCompat_androidKt.z(semanticsNode0);
    }

    private static final boolean v(SemanticsNode semanticsNode0) {
        return semanticsNode0.k().c(SemanticsProperties.a.r());
    }

    private static final Boolean w(SemanticsNode semanticsNode0) {
        return (Boolean)SemanticsConfigurationKt.a(semanticsNode0.k(), SemanticsProperties.a.n());
    }

    private static final boolean x(SemanticsNode semanticsNode0) {
        return semanticsNode0.k().c(SemanticsProperties.a.s());
    }

    private static final boolean y(SemanticsNode semanticsNode0) {
        return semanticsNode0.m().getLayoutDirection() == LayoutDirection.b;
    }

    private static final boolean z(SemanticsNode semanticsNode0) {
        return semanticsNode0.k().c(SemanticsActions.a.p());
    }
}

