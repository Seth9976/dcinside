package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.T;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.j;
import kotlin.ranges.l;
import kotlin.ranges.s;

@s0({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,333:1\n283#1:334\n284#1,9:338\n283#1:348\n284#1,9:352\n283#1:362\n284#1,9:366\n283#1:376\n284#1,9:380\n283#1:390\n284#1,9:394\n283#1:404\n284#1,9:408\n283#1:418\n284#1,9:422\n283#1:432\n284#1,9:436\n283#1:446\n284#1,9:450\n283#1:460\n284#1,9:464\n283#1:474\n284#1,9:478\n283#1:488\n284#1,9:492\n283#1:502\n284#1,9:506\n283#1:516\n284#1,9:520\n283#1:530\n284#1,9:534\n283#1:544\n284#1,9:548\n283#1:558\n284#1,9:562\n283#1:572\n284#1,9:576\n1549#2:335\n1620#2,2:336\n1622#2:347\n1549#2:349\n1620#2,2:350\n1622#2:361\n1549#2:363\n1620#2,2:364\n1622#2:375\n1549#2:377\n1620#2,2:378\n1622#2:389\n1549#2:391\n1620#2,2:392\n1622#2:403\n1549#2:405\n1620#2,2:406\n1622#2:417\n1549#2:419\n1620#2,2:420\n1622#2:431\n1549#2:433\n1620#2,2:434\n1622#2:445\n1549#2:447\n1620#2,2:448\n1622#2:459\n1549#2:461\n1620#2,2:462\n1622#2:473\n1549#2:475\n1620#2,2:476\n1622#2:487\n1549#2:489\n1620#2,2:490\n1622#2:501\n1549#2:503\n1620#2,2:504\n1622#2:515\n1549#2:517\n1620#2,2:518\n1622#2:529\n1549#2:531\n1620#2,2:532\n1622#2:543\n1549#2:545\n1620#2,2:546\n1622#2:557\n1549#2:559\n1620#2,2:560\n1622#2:571\n1549#2:573\n1620#2,2:574\n1622#2:585\n1549#2:586\n1620#2,3:587\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n153#1:334\n153#1:338,9\n157#1:348\n157#1:352,9\n161#1:362\n161#1:366,9\n165#1:376\n165#1:380,9\n169#1:390\n169#1:394,9\n173#1:404\n173#1:408,9\n177#1:418\n177#1:422,9\n181#1:432\n181#1:436,9\n185#1:446\n185#1:450,9\n196#1:460\n196#1:464,9\n207#1:474\n207#1:478,9\n216#1:488\n216#1:492,9\n225#1:502\n225#1:506,9\n234#1:516\n234#1:520,9\n243#1:530\n243#1:534,9\n247#1:544\n247#1:548,9\n251#1:558\n251#1:562,9\n263#1:572\n263#1:576,9\n153#1:335\n153#1:336,2\n153#1:347\n157#1:349\n157#1:350,2\n157#1:361\n161#1:363\n161#1:364,2\n161#1:375\n165#1:377\n165#1:378,2\n165#1:389\n169#1:391\n169#1:392,2\n169#1:403\n173#1:405\n173#1:406,2\n173#1:417\n177#1:419\n177#1:420,2\n177#1:431\n181#1:433\n181#1:434,2\n181#1:445\n185#1:447\n185#1:448,2\n185#1:459\n196#1:461\n196#1:462,2\n196#1:473\n207#1:475\n207#1:476,2\n207#1:487\n216#1:489\n216#1:490,2\n216#1:501\n225#1:503\n225#1:504,2\n225#1:515\n234#1:517\n234#1:518,2\n234#1:529\n243#1:531\n243#1:532,2\n243#1:543\n247#1:545\n247#1:546,2\n247#1:557\n251#1:559\n251#1:560,2\n251#1:571\n263#1:573\n263#1:574,2\n263#1:585\n283#1:586\n283#1:587,3\n*E\n"})
public final class PathNodeKt {
    private static final int A = 4;
    private static final int B = 2;
    private static final int C = 7;
    private static final char a = 'z';
    private static final char b = 'Z';
    private static final char c = 'm';
    private static final char d = 'M';
    private static final char e = 'l';
    private static final char f = 'L';
    private static final char g = 'h';
    private static final char h = 'H';
    private static final char i = 'v';
    private static final char j = 'V';
    private static final char k = 'c';
    private static final char l = 'C';
    private static final char m = 's';
    private static final char n = 'S';
    private static final char o = 'q';
    private static final char p = 'Q';
    private static final char q = 't';
    private static final char r = 'T';
    private static final char s = 'a';
    private static final char t = 'A';
    private static final int u = 2;
    private static final int v = 2;
    private static final int w = 1;
    private static final int x = 1;
    private static final int y = 6;
    private static final int z = 4;

    private static final List a(float[] arr_f, int v, Function1 function10) {
        j j0 = s.B1(new l(0, arr_f.length - v), v);
        List list0 = new ArrayList(u.b0(j0, 10));
        Iterator iterator0 = j0.iterator();
        while(iterator0.hasNext()) {
            int v1 = ((T)iterator0).b();
            float[] arr_f1 = kotlin.collections.l.i1(arr_f, v1, v1 + v);
            PathNode pathNode0 = (PathNode)function10.invoke(arr_f1);
            if(pathNode0 instanceof MoveTo && v1 > 0) {
                pathNode0 = new LineTo(arr_f1[0], arr_f1[1]);
            }
            else if(pathNode0 instanceof RelativeMoveTo && v1 > 0) {
                pathNode0 = new RelativeLineTo(arr_f1[0], arr_f1[1]);
            }
            list0.add(pathNode0);
        }
        return list0;
    }

    @y4.l
    public static final List b(char c, @y4.l float[] arr_f) {
        ArrayList arrayList0;
        L.p(arr_f, "args");
        switch(c) {
            case 65: {
                j j0 = s.B1(new l(0, arr_f.length - 7), 7);
                arrayList0 = new ArrayList(u.b0(j0, 10));
                Iterator iterator0 = j0.iterator();
                while(iterator0.hasNext()) {
                    int v = ((T)iterator0).b();
                    float[] arr_f1 = kotlin.collections.l.i1(arr_f, v, v + 7);
                    arrayList0.add(new ArcTo(arr_f1[0], arr_f1[1], arr_f1[2], Float.compare(arr_f1[3], 0.0f) != 0, Float.compare(arr_f1[4], 0.0f) != 0, arr_f1[5], arr_f1[6]));
                }
                return arrayList0;
            }
            case 67: {
                j j1 = s.B1(new l(0, arr_f.length - 6), 6);
                arrayList0 = new ArrayList(u.b0(j1, 10));
                Iterator iterator1 = j1.iterator();
                while(iterator1.hasNext()) {
                    int v1 = ((T)iterator1).b();
                    float[] arr_f2 = kotlin.collections.l.i1(arr_f, v1, v1 + 6);
                    arrayList0.add(new CurveTo(arr_f2[0], arr_f2[1], arr_f2[2], arr_f2[3], arr_f2[4], arr_f2[5]));
                }
                return arrayList0;
            }
            case 72: {
                j j2 = s.B1(new l(0, arr_f.length - 1), 1);
                arrayList0 = new ArrayList(u.b0(j2, 10));
                Iterator iterator2 = j2.iterator();
                while(iterator2.hasNext()) {
                    int v2 = ((T)iterator2).b();
                    arrayList0.add(new HorizontalTo(kotlin.collections.l.i1(arr_f, v2, v2 + 1)[0]));
                }
                return arrayList0;
            }
            case 76: {
                j j3 = s.B1(new l(0, arr_f.length - 2), 2);
                arrayList0 = new ArrayList(u.b0(j3, 10));
                Iterator iterator3 = j3.iterator();
                while(iterator3.hasNext()) {
                    int v3 = ((T)iterator3).b();
                    float[] arr_f3 = kotlin.collections.l.i1(arr_f, v3, v3 + 2);
                    arrayList0.add(new LineTo(arr_f3[0], arr_f3[1]));
                }
                return arrayList0;
            }
            case 77: {
                j j4 = s.B1(new l(0, arr_f.length - 2), 2);
                arrayList0 = new ArrayList(u.b0(j4, 10));
                Iterator iterator4 = j4.iterator();
                while(iterator4.hasNext()) {
                    int v4 = ((T)iterator4).b();
                    float[] arr_f4 = kotlin.collections.l.i1(arr_f, v4, v4 + 2);
                    MoveTo pathNode$MoveTo0 = new MoveTo(arr_f4[0], arr_f4[1]);
                    if(v4 > 0) {
                        pathNode$MoveTo0 = new LineTo(arr_f4[0], arr_f4[1]);
                    }
                    arrayList0.add(pathNode$MoveTo0);
                }
                return arrayList0;
            }
            case 81: {
                j j5 = s.B1(new l(0, arr_f.length - 4), 4);
                arrayList0 = new ArrayList(u.b0(j5, 10));
                Iterator iterator5 = j5.iterator();
                while(iterator5.hasNext()) {
                    int v5 = ((T)iterator5).b();
                    float[] arr_f5 = kotlin.collections.l.i1(arr_f, v5, v5 + 4);
                    arrayList0.add(new QuadTo(arr_f5[0], arr_f5[1], arr_f5[2], arr_f5[3]));
                }
                return arrayList0;
            }
            case 83: {
                j j6 = s.B1(new l(0, arr_f.length - 4), 4);
                arrayList0 = new ArrayList(u.b0(j6, 10));
                Iterator iterator6 = j6.iterator();
                while(iterator6.hasNext()) {
                    int v6 = ((T)iterator6).b();
                    float[] arr_f6 = kotlin.collections.l.i1(arr_f, v6, v6 + 4);
                    arrayList0.add(new ReflectiveCurveTo(arr_f6[0], arr_f6[1], arr_f6[2], arr_f6[3]));
                }
                return arrayList0;
            }
            case 84: {
                j j7 = s.B1(new l(0, arr_f.length - 2), 2);
                arrayList0 = new ArrayList(u.b0(j7, 10));
                Iterator iterator7 = j7.iterator();
                while(iterator7.hasNext()) {
                    int v7 = ((T)iterator7).b();
                    float[] arr_f7 = kotlin.collections.l.i1(arr_f, v7, v7 + 2);
                    arrayList0.add(new ReflectiveQuadTo(arr_f7[0], arr_f7[1]));
                }
                return arrayList0;
            }
            case 86: {
                j j8 = s.B1(new l(0, arr_f.length - 1), 1);
                arrayList0 = new ArrayList(u.b0(j8, 10));
                Iterator iterator8 = j8.iterator();
                while(iterator8.hasNext()) {
                    int v8 = ((T)iterator8).b();
                    arrayList0.add(new VerticalTo(kotlin.collections.l.i1(arr_f, v8, v8 + 1)[0]));
                }
                return arrayList0;
            }
            case 97: {
                j j9 = s.B1(new l(0, arr_f.length - 7), 7);
                arrayList0 = new ArrayList(u.b0(j9, 10));
                Iterator iterator9 = j9.iterator();
                while(iterator9.hasNext()) {
                    int v9 = ((T)iterator9).b();
                    float[] arr_f8 = kotlin.collections.l.i1(arr_f, v9, v9 + 7);
                    arrayList0.add(new RelativeArcTo(arr_f8[0], arr_f8[1], arr_f8[2], Float.compare(arr_f8[3], 0.0f) != 0, Float.compare(arr_f8[4], 0.0f) != 0, arr_f8[5], arr_f8[6]));
                }
                return arrayList0;
            }
            case 99: {
                j j10 = s.B1(new l(0, arr_f.length - 6), 6);
                arrayList0 = new ArrayList(u.b0(j10, 10));
                Iterator iterator10 = j10.iterator();
                while(iterator10.hasNext()) {
                    int v10 = ((T)iterator10).b();
                    float[] arr_f9 = kotlin.collections.l.i1(arr_f, v10, v10 + 6);
                    arrayList0.add(new RelativeCurveTo(arr_f9[0], arr_f9[1], arr_f9[2], arr_f9[3], arr_f9[4], arr_f9[5]));
                }
                return arrayList0;
            }
            case 104: {
                j j11 = s.B1(new l(0, arr_f.length - 1), 1);
                arrayList0 = new ArrayList(u.b0(j11, 10));
                Iterator iterator11 = j11.iterator();
                while(iterator11.hasNext()) {
                    int v11 = ((T)iterator11).b();
                    arrayList0.add(new RelativeHorizontalTo(kotlin.collections.l.i1(arr_f, v11, v11 + 1)[0]));
                }
                return arrayList0;
            }
            case 108: {
                j j12 = s.B1(new l(0, arr_f.length - 2), 2);
                arrayList0 = new ArrayList(u.b0(j12, 10));
                Iterator iterator12 = j12.iterator();
                while(iterator12.hasNext()) {
                    int v12 = ((T)iterator12).b();
                    float[] arr_f10 = kotlin.collections.l.i1(arr_f, v12, v12 + 2);
                    arrayList0.add(new RelativeLineTo(arr_f10[0], arr_f10[1]));
                }
                return arrayList0;
            }
            case 109: {
                j j13 = s.B1(new l(0, arr_f.length - 2), 2);
                arrayList0 = new ArrayList(u.b0(j13, 10));
                Iterator iterator13 = j13.iterator();
                while(iterator13.hasNext()) {
                    int v13 = ((T)iterator13).b();
                    float[] arr_f11 = kotlin.collections.l.i1(arr_f, v13, v13 + 2);
                    RelativeMoveTo pathNode$RelativeMoveTo0 = new RelativeMoveTo(arr_f11[0], arr_f11[1]);
                    if(v13 > 0) {
                        pathNode$RelativeMoveTo0 = new RelativeLineTo(arr_f11[0], arr_f11[1]);
                    }
                    arrayList0.add(pathNode$RelativeMoveTo0);
                }
                return arrayList0;
            }
            case 0x71: {
                j j14 = s.B1(new l(0, arr_f.length - 4), 4);
                arrayList0 = new ArrayList(u.b0(j14, 10));
                Iterator iterator14 = j14.iterator();
                while(iterator14.hasNext()) {
                    int v14 = ((T)iterator14).b();
                    float[] arr_f12 = kotlin.collections.l.i1(arr_f, v14, v14 + 4);
                    arrayList0.add(new RelativeQuadTo(arr_f12[0], arr_f12[1], arr_f12[2], arr_f12[3]));
                }
                return arrayList0;
            }
            case 0x73: {
                j j15 = s.B1(new l(0, arr_f.length - 4), 4);
                arrayList0 = new ArrayList(u.b0(j15, 10));
                Iterator iterator15 = j15.iterator();
                while(iterator15.hasNext()) {
                    int v15 = ((T)iterator15).b();
                    float[] arr_f13 = kotlin.collections.l.i1(arr_f, v15, v15 + 4);
                    arrayList0.add(new RelativeReflectiveCurveTo(arr_f13[0], arr_f13[1], arr_f13[2], arr_f13[3]));
                }
                return arrayList0;
            }
            case 0x74: {
                j j16 = s.B1(new l(0, arr_f.length - 2), 2);
                arrayList0 = new ArrayList(u.b0(j16, 10));
                Iterator iterator16 = j16.iterator();
                while(iterator16.hasNext()) {
                    int v16 = ((T)iterator16).b();
                    float[] arr_f14 = kotlin.collections.l.i1(arr_f, v16, v16 + 2);
                    arrayList0.add(new RelativeReflectiveQuadTo(arr_f14[0], arr_f14[1]));
                }
                return arrayList0;
            }
            case 0x76: {
                j j17 = s.B1(new l(0, arr_f.length - 1), 1);
                arrayList0 = new ArrayList(u.b0(j17, 10));
                Iterator iterator17 = j17.iterator();
                while(iterator17.hasNext()) {
                    int v17 = ((T)iterator17).b();
                    arrayList0.add(new RelativeVerticalTo(kotlin.collections.l.i1(arr_f, v17, v17 + 1)[0]));
                }
                return arrayList0;
            }
            case 90: 
            case 0x7A: {
                return u.k(Close.c);
            }
            default: {
                throw new IllegalArgumentException("Unknown command for: " + c);
            }
        }
    }
}

