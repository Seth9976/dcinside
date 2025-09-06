package androidx.compose.ui.platform.accessibility;

import A3.a;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nCollectionInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionInfo.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfoKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n*L\n1#1,153:1\n33#2,6:154\n33#2,6:160\n38#3,11:166\n68#3,7:177\n*S KotlinDebug\n*F\n+ 1 CollectionInfo.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfoKt\n*L\n43#1:154,6\n87#1:160,6\n122#1:166,11\n130#1:177,7\n*E\n"})
public final class CollectionInfoKt {
    private static final boolean a(List list0) {
        long v2;
        List list1;
        if(list0.size() < 2) {
            return true;
        }
        if(list0.size() == 0 || list0.size() == 1) {
            list1 = u.H();
        }
        else {
            list1 = new ArrayList();
            Object object0 = list0.get(0);
            int v = u.J(list0);
            int v1 = 0;
            while(v1 < v) {
                ++v1;
                Object object1 = list0.get(v1);
                list1.add(Offset.d(OffsetKt.a(Math.abs(Offset.p(((SemanticsNode)object0).g().o()) - Offset.p(((SemanticsNode)object1).g().o())), Math.abs(Offset.r(((SemanticsNode)object0).g().o()) - Offset.r(((SemanticsNode)object1).g().o())))));
                object0 = object1;
            }
        }
        if(list1.size() == 1) {
            v2 = ((Offset)u.B2(list1)).A();
        }
        else if(!list1.isEmpty()) {
            Offset offset0 = u.B2(list1);
            int v3 = u.J(list1);
            if(1 <= v3) {
                for(int v4 = 1; true; ++v4) {
                    offset0 = Offset.d(Offset.v(offset0.A(), ((Offset)list1.get(v4)).A()));
                    if(v4 == v3) {
                        break;
                    }
                }
            }
            v2 = offset0.A();
        }
        else {
            throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
        }
        float f = Offset.e(v2);
        return Offset.f(v2) < f;
    }

    public static final boolean b(@l SemanticsNode semanticsNode0) {
        L.p(semanticsNode0, "<this>");
        return SemanticsConfigurationKt.a(semanticsNode0.k(), SemanticsProperties.a.a()) != null || SemanticsConfigurationKt.a(semanticsNode0.k(), SemanticsProperties.a.v()) != null;
    }

    private static final boolean c(CollectionInfo collectionInfo0) {
        return collectionInfo0.b() < 0 || collectionInfo0.a() < 0;
    }

    public static final void d(@l SemanticsNode semanticsNode0, @l AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        L.p(semanticsNode0, "node");
        L.p(accessibilityNodeInfoCompat0, "info");
        SemanticsConfiguration semanticsConfiguration0 = semanticsNode0.k();
        SemanticsProperties semanticsProperties0 = SemanticsProperties.a;
        CollectionInfo collectionInfo0 = (CollectionInfo)SemanticsConfigurationKt.a(semanticsConfiguration0, semanticsProperties0.a());
        if(collectionInfo0 != null) {
            accessibilityNodeInfoCompat0.m1(CollectionInfoKt.f(collectionInfo0));
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        if(SemanticsConfigurationKt.a(semanticsNode0.k(), semanticsProperties0.v()) != null) {
            List list0 = semanticsNode0.t();
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                SemanticsNode semanticsNode1 = (SemanticsNode)list0.get(v1);
                if(semanticsNode1.k().c(SemanticsProperties.a.w())) {
                    arrayList0.add(semanticsNode1);
                }
            }
        }
        if(!arrayList0.isEmpty()) {
            boolean z = CollectionInfoKt.a(arrayList0);
            int v2 = 1;
            int v3 = z ? 1 : arrayList0.size();
            if(z) {
                v2 = arrayList0.size();
            }
            accessibilityNodeInfoCompat0.m1(CollectionInfoCompat.h(v3, v2, false, 0));
        }
    }

    public static final void e(@l SemanticsNode semanticsNode0, @l AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        L.p(semanticsNode0, "node");
        L.p(accessibilityNodeInfoCompat0, "info");
        SemanticsConfiguration semanticsConfiguration0 = semanticsNode0.k();
        SemanticsProperties semanticsProperties0 = SemanticsProperties.a;
        CollectionItemInfo collectionItemInfo0 = (CollectionItemInfo)SemanticsConfigurationKt.a(semanticsConfiguration0, semanticsProperties0.b());
        if(collectionItemInfo0 != null) {
            accessibilityNodeInfoCompat0.n1(CollectionInfoKt.g(collectionItemInfo0, semanticsNode0));
        }
        SemanticsNode semanticsNode1 = semanticsNode0.q();
        if(semanticsNode1 == null) {
            return;
        }
        if(SemanticsConfigurationKt.a(semanticsNode1.k(), semanticsProperties0.v()) != null) {
            CollectionInfo collectionInfo0 = (CollectionInfo)SemanticsConfigurationKt.a(semanticsNode1.k(), semanticsProperties0.a());
            if(collectionInfo0 != null && CollectionInfoKt.c(collectionInfo0)) {
                return;
            }
            if(!semanticsNode0.k().c(semanticsProperties0.w())) {
                return;
            }
            ArrayList arrayList0 = new ArrayList();
            List list0 = semanticsNode1.t();
            int v = list0.size();
            int v2 = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                SemanticsNode semanticsNode2 = (SemanticsNode)list0.get(v1);
                if(semanticsNode2.k().c(SemanticsProperties.a.w())) {
                    arrayList0.add(semanticsNode2);
                    if(semanticsNode2.n().D0() < semanticsNode0.n().D0()) {
                        ++v2;
                    }
                }
            }
            if(!arrayList0.isEmpty()) {
                boolean z = CollectionInfoKt.a(arrayList0);
                CollectionItemInfoCompat accessibilityNodeInfoCompat$CollectionItemInfoCompat0 = CollectionItemInfoCompat.j((z ? 0 : v2), 1, (z ? v2 : 0), 1, false, ((Boolean)semanticsNode0.k().h(SemanticsProperties.a.w(), androidx.compose.ui.platform.accessibility.CollectionInfoKt.setCollectionItemInfo.itemInfo.1.e)).booleanValue());
                if(accessibilityNodeInfoCompat$CollectionItemInfoCompat0 != null) {
                    accessibilityNodeInfoCompat0.n1(accessibilityNodeInfoCompat$CollectionItemInfoCompat0);
                }
            }
        }

        final class androidx.compose.ui.platform.accessibility.CollectionInfoKt.setCollectionItemInfo.itemInfo.1 extends N implements a {
            public static final androidx.compose.ui.platform.accessibility.CollectionInfoKt.setCollectionItemInfo.itemInfo.1 e;

            static {
                androidx.compose.ui.platform.accessibility.CollectionInfoKt.setCollectionItemInfo.itemInfo.1.e = new androidx.compose.ui.platform.accessibility.CollectionInfoKt.setCollectionItemInfo.itemInfo.1();
            }

            androidx.compose.ui.platform.accessibility.CollectionInfoKt.setCollectionItemInfo.itemInfo.1() {
                super(0);
            }

            @l
            public final Boolean b() {
                return false;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

    }

    private static final CollectionInfoCompat f(CollectionInfo collectionInfo0) {
        return CollectionInfoCompat.h(collectionInfo0.b(), collectionInfo0.a(), false, 0);
    }

    private static final CollectionItemInfoCompat g(CollectionItemInfo collectionItemInfo0, SemanticsNode semanticsNode0) {
        return CollectionItemInfoCompat.j(collectionItemInfo0.c(), collectionItemInfo0.d(), collectionItemInfo0.a(), collectionItemInfo0.b(), false, ((Boolean)semanticsNode0.k().h(SemanticsProperties.a.w(), androidx.compose.ui.platform.accessibility.CollectionInfoKt.toAccessibilityCollectionItemInfo.1.e)).booleanValue());

        final class androidx.compose.ui.platform.accessibility.CollectionInfoKt.toAccessibilityCollectionItemInfo.1 extends N implements a {
            public static final androidx.compose.ui.platform.accessibility.CollectionInfoKt.toAccessibilityCollectionItemInfo.1 e;

            static {
                androidx.compose.ui.platform.accessibility.CollectionInfoKt.toAccessibilityCollectionItemInfo.1.e = new androidx.compose.ui.platform.accessibility.CollectionInfoKt.toAccessibilityCollectionItemInfo.1();
            }

            androidx.compose.ui.platform.accessibility.CollectionInfoKt.toAccessibilityCollectionItemInfo.1() {
                super(0);
            }

            @l
            public final Boolean b() {
                return false;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

    }
}

