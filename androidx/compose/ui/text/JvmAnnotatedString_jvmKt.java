package androidx.compose.ui.text;

import A3.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import y4.l;
import y4.m;

@s0({"SMAP\nJvmAnnotatedString.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n*L\n1#1,81:1\n151#2,3:82\n33#2,4:85\n154#2,2:89\n38#2:91\n156#2:92\n151#2,3:93\n33#2,4:96\n154#2,2:100\n38#2:102\n156#2:103\n151#2,3:104\n33#2,4:107\n154#2,2:111\n38#2:113\n156#2:114\n33#2,4:118\n38#2:124\n108#3,3:115\n111#3,2:122\n113#3:125\n*S KotlinDebug\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n*L\n45#1:82,3\n45#1:85,4\n45#1:89,2\n45#1:91\n45#1:92\n49#1:93,3\n49#1:96,4\n49#1:100,2\n49#1:102\n49#1:103\n52#1:104,3\n52#1:107,4\n52#1:111,2\n52#1:113\n52#1:114\n74#1:118,4\n74#1:124\n74#1:115,3\n74#1:122,2\n74#1:125\n*E\n"})
public final class JvmAnnotatedString_jvmKt {
    private static final void a(List list0, SortedSet sortedSet0) {
        if(list0 != null) {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Range annotatedString$Range0 = (Range)list0.get(v1);
                sortedSet0.add(annotatedString$Range0.i());
                sortedSet0.add(annotatedString$Range0.g());
            }
        }
    }

    @l
    public static final AnnotatedString b(@l AnnotatedString annotatedString0, @l p p0) {
        ArrayList arrayList2;
        ArrayList arrayList1;
        L.p(annotatedString0, "<this>");
        L.p(p0, "transform");
        TreeSet treeSet0 = k0.h(new Integer[]{0, annotatedString0.j().length()});
        JvmAnnotatedString_jvmKt.a(annotatedString0.g(), treeSet0);
        JvmAnnotatedString_jvmKt.a(annotatedString0.e(), treeSet0);
        JvmAnnotatedString_jvmKt.a(annotatedString0.b(), treeSet0);
        h l0$h0 = new h();
        l0$h0.a = "";
        Map map0 = Y.j0(new V[]{r0.a(0, 0)});
        u.g6(treeSet0, 2, 0, false, new Function1(l0$h0, p0, annotatedString0, map0) {
            final h e;
            final p f;
            final AnnotatedString g;
            final Map h;

            {
                this.e = l0$h0;
                this.f = p0;
                this.g = annotatedString0;
                this.h = map0;
                super(1);
            }

            @m
            public final Integer a(@l List list0) {
                L.p(list0, "<name for destructuring parameter 0>");
                int v = ((Number)list0.get(0)).intValue();
                int v1 = ((Number)list0.get(1)).intValue();
                this.e.a = ((String)this.e.a) + ((String)this.f.invoke(this.g.j(), v, v1));
                return (Integer)this.h.put(v1, ((String)this.e.a).length());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        }, 6, null);
        List list0 = annotatedString0.g();
        ArrayList arrayList0 = null;
        if(list0 == null) {
            arrayList1 = null;
        }
        else {
            arrayList1 = new ArrayList(list0.size());
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                Range annotatedString$Range0 = (Range)list0.get(v2);
                Object object0 = map0.get(annotatedString$Range0.i());
                L.m(object0);
                Object object1 = map0.get(annotatedString$Range0.g());
                L.m(object1);
                arrayList1.add(new Range(annotatedString$Range0.h(), ((Number)object0).intValue(), ((Number)object1).intValue()));
            }
        }
        List list1 = annotatedString0.e();
        if(list1 == null) {
            arrayList2 = null;
        }
        else {
            arrayList2 = new ArrayList(list1.size());
            int v3 = list1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                Range annotatedString$Range1 = (Range)list1.get(v4);
                Object object2 = map0.get(annotatedString$Range1.i());
                L.m(object2);
                Object object3 = map0.get(annotatedString$Range1.g());
                L.m(object3);
                arrayList2.add(new Range(annotatedString$Range1.h(), ((Number)object2).intValue(), ((Number)object3).intValue()));
            }
        }
        List list2 = annotatedString0.b();
        if(list2 != null) {
            arrayList0 = new ArrayList(list2.size());
            int v5 = list2.size();
            for(int v = 0; v < v5; ++v) {
                Range annotatedString$Range2 = (Range)list2.get(v);
                Object object4 = map0.get(annotatedString$Range2.i());
                L.m(object4);
                Object object5 = map0.get(annotatedString$Range2.g());
                L.m(object5);
                arrayList0.add(new Range(annotatedString$Range2.h(), ((Number)object4).intValue(), ((Number)object5).intValue()));
            }
        }
        return new AnnotatedString(((String)l0$h0.a), arrayList1, arrayList2, arrayList0);
    }
}

