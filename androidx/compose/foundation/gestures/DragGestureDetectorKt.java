package androidx.compose.foundation.gestures;

import A3.a;
import A3.o;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.e;
import kotlin.jvm.internal.l0.g;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,873:1\n665#1,11:874\n676#1,4:894\n680#1,58:905\n615#1,4:963\n619#1,2:976\n621#1,8:985\n658#1,18:993\n676#1,4:1020\n680#1,58:1031\n658#1,18:1089\n676#1,4:1116\n680#1,58:1127\n581#1,6:1185\n615#1,4:1191\n619#1,2:1204\n621#1,8:1213\n588#1,10:1221\n615#1,4:1231\n619#1,2:1244\n621#1,8:1253\n658#1,18:1261\n676#1,4:1288\n680#1,58:1299\n658#1,18:1357\n676#1,4:1384\n680#1,58:1395\n581#1,6:1453\n615#1,4:1459\n619#1,2:1472\n621#1,8:1481\n588#1,10:1489\n615#1,4:1499\n619#1,2:1512\n621#1,8:1521\n615#1,4:1529\n619#1,2:1542\n621#1,8:1551\n615#1,4:1559\n619#1,2:1572\n621#1,8:1581\n116#2,2:885\n33#2,6:887\n118#2:893\n33#2,6:898\n118#2:904\n116#2,2:967\n33#2,6:969\n118#2:975\n33#2,6:978\n118#2:984\n116#2,2:1011\n33#2,6:1013\n118#2:1019\n33#2,6:1024\n118#2:1030\n116#2,2:1107\n33#2,6:1109\n118#2:1115\n33#2,6:1120\n118#2:1126\n116#2,2:1195\n33#2,6:1197\n118#2:1203\n33#2,6:1206\n118#2:1212\n116#2,2:1235\n33#2,6:1237\n118#2:1243\n33#2,6:1246\n118#2:1252\n116#2,2:1279\n33#2,6:1281\n118#2:1287\n33#2,6:1292\n118#2:1298\n116#2,2:1375\n33#2,6:1377\n118#2:1383\n33#2,6:1388\n118#2:1394\n116#2,2:1463\n33#2,6:1465\n118#2:1471\n33#2,6:1474\n118#2:1480\n116#2,2:1503\n33#2,6:1505\n118#2:1511\n33#2,6:1514\n118#2:1520\n116#2,2:1533\n33#2,6:1535\n118#2:1541\n33#2,6:1544\n118#2:1550\n116#2,2:1563\n33#2,6:1565\n118#2:1571\n33#2,6:1574\n118#2:1580\n116#2,2:1589\n33#2,6:1591\n118#2:1597\n116#2,2:1598\n33#2,6:1600\n118#2:1606\n116#2,2:1607\n33#2,6:1609\n118#2:1615\n116#2,2:1616\n33#2,6:1618\n118#2:1624\n116#2,2:1625\n33#2,6:1627\n118#2:1633\n116#2,2:1634\n33#2,6:1636\n118#2:1642\n116#2,2:1643\n33#2,6:1645\n118#2:1651\n116#2,2:1652\n33#2,6:1654\n118#2:1660\n116#2,2:1661\n33#2,6:1663\n118#2:1669\n116#2,2:1670\n33#2,6:1672\n118#2:1678\n164#3:1679\n154#3:1680\n81#4:1681\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n*L\n78#1:874,11\n78#1:894,4\n78#1:905,58\n143#1:963,4\n143#1:976,2\n143#1:985,8\n288#1:993,18\n288#1:1020,4\n288#1:1031,58\n299#1:1089,18\n299#1:1116,4\n299#1:1127,58\n325#1:1185,6\n325#1:1191,4\n325#1:1204,2\n325#1:1213,8\n325#1:1221,10\n355#1:1231,4\n355#1:1244,2\n355#1:1253,8\n439#1:1261,18\n439#1:1288,4\n439#1:1299,58\n450#1:1357,18\n450#1:1384,4\n450#1:1395,58\n473#1:1453,6\n473#1:1459,4\n473#1:1472,2\n473#1:1481,8\n473#1:1489,10\n503#1:1499,4\n503#1:1512,2\n503#1:1521,8\n586#1:1529,4\n586#1:1542,2\n586#1:1551,8\n586#1:1559,4\n586#1:1572,2\n586#1:1581,8\n78#1:885,2\n78#1:887,6\n78#1:893\n78#1:898,6\n78#1:904\n143#1:967,2\n143#1:969,6\n143#1:975\n143#1:978,6\n143#1:984\n288#1:1011,2\n288#1:1013,6\n288#1:1019\n288#1:1024,6\n288#1:1030\n299#1:1107,2\n299#1:1109,6\n299#1:1115\n299#1:1120,6\n299#1:1126\n325#1:1195,2\n325#1:1197,6\n325#1:1203\n325#1:1206,6\n325#1:1212\n355#1:1235,2\n355#1:1237,6\n355#1:1243\n355#1:1246,6\n355#1:1252\n439#1:1279,2\n439#1:1281,6\n439#1:1287\n439#1:1292,6\n439#1:1298\n450#1:1375,2\n450#1:1377,6\n450#1:1383\n450#1:1388,6\n450#1:1394\n473#1:1463,2\n473#1:1465,6\n473#1:1471\n473#1:1474,6\n473#1:1480\n503#1:1503,2\n503#1:1505,6\n503#1:1511\n503#1:1514,6\n503#1:1520\n586#1:1533,2\n586#1:1535,6\n586#1:1541\n586#1:1544,6\n586#1:1550\n586#1:1563,2\n586#1:1565,6\n586#1:1571\n586#1:1574,6\n586#1:1580\n618#1:1589,2\n618#1:1591,6\n618#1:1597\n620#1:1598,2\n620#1:1600,6\n620#1:1606\n675#1:1607,2\n675#1:1609,6\n675#1:1615\n679#1:1616,2\n679#1:1618,6\n679#1:1624\n675#1:1625,2\n675#1:1627,6\n675#1:1633\n679#1:1634,2\n679#1:1636,6\n679#1:1642\n675#1:1643,2\n675#1:1645,6\n675#1:1651\n679#1:1652,2\n679#1:1654,6\n679#1:1660\n801#1:1661,2\n801#1:1663,6\n801#1:1669\n854#1:1670,2\n854#1:1672,6\n854#1:1678\n860#1:1679\n861#1:1680\n862#1:1681\n*E\n"})
public final class DragGestureDetectorKt {
    @l
    private static final PointerDirectionConfig a;
    @l
    private static final PointerDirectionConfig b;
    private static final float c;
    private static final float d;
    private static final float e;

    static {
        DragGestureDetectorKt.a = new DragGestureDetectorKt.HorizontalPointerDirectionConfig.1();
        DragGestureDetectorKt.b = new DragGestureDetectorKt.VerticalPointerDirectionConfig.1();
        DragGestureDetectorKt.c = 0.125f;
        DragGestureDetectorKt.d = 18.0f;
        DragGestureDetectorKt.e = 0.006944f;
    }

    @l
    public static final PointerDirectionConfig A() {
        return DragGestureDetectorKt.b;
    }

    @m
    public static final Object B(@l AwaitPointerEventScope awaitPointerEventScope0, long v, @l Function1 function10, @l d d0) {
        Object object4;
        Object object2;
        g l0$g1;
        AwaitPointerEventScope awaitPointerEventScope3;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1 function11;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.horizontalDrag.1 dragGestureDetectorKt$horizontalDrag$11;
        AwaitPointerEventScope awaitPointerEventScope1;
        long v2;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.horizontalDrag.1 dragGestureDetectorKt$horizontalDrag$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt.horizontalDrag.1) {
            dragGestureDetectorKt$horizontalDrag$10 = (androidx.compose.foundation.gestures.DragGestureDetectorKt.horizontalDrag.1)d0;
            int v1 = dragGestureDetectorKt$horizontalDrag$10.p;
            if((v1 & 0x80000000) == 0) {
                dragGestureDetectorKt$horizontalDrag$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    Object o;
                    int p;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.o = object0;
                        this.p |= 0x80000000;
                        return DragGestureDetectorKt.B(null, 0L, null, this);
                    }
                };
            }
            else {
                dragGestureDetectorKt$horizontalDrag$10.p = v1 ^ 0x80000000;
            }
        }
        else {
            dragGestureDetectorKt$horizontalDrag$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                int p;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.o = object0;
                    this.p |= 0x80000000;
                    return DragGestureDetectorKt.B(null, 0L, null, this);
                }
            };
        }
        Object object0 = dragGestureDetectorKt$horizontalDrag$10.o;
        Object object1 = b.l();
        switch(dragGestureDetectorKt$horizontalDrag$10.p) {
            case 0: {
                f0.n(object0);
                v2 = v;
                if(DragGestureDetectorKt.C(awaitPointerEventScope0.m1(), v2)) {
                    return kotlin.coroutines.jvm.internal.b.a(false);
                }
                awaitPointerEventScope1 = awaitPointerEventScope0;
                dragGestureDetectorKt$horizontalDrag$11 = dragGestureDetectorKt$horizontalDrag$10;
                function11 = function10;
                l0$g1 = new g();
                l0$g1.a = v2;
                awaitPointerEventScope2 = awaitPointerEventScope1;
                goto label_73;
            }
            case 1: {
                g l0$g0 = (g)dragGestureDetectorKt$horizontalDrag$10.n;
                awaitPointerEventScope2 = (AwaitPointerEventScope)dragGestureDetectorKt$horizontalDrag$10.m;
                awaitPointerEventScope3 = (AwaitPointerEventScope)dragGestureDetectorKt$horizontalDrag$10.l;
                Function1 function12 = (Function1)dragGestureDetectorKt$horizontalDrag$10.k;
                f0.n(object0);
                dragGestureDetectorKt$horizontalDrag$11 = dragGestureDetectorKt$horizontalDrag$10;
                function11 = function12;
                l0$g1 = l0$g0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            List list0 = ((PointerEvent)object0).e();
            int v3 = list0.size();
            int v4 = 0;
            while(true) {
                object2 = null;
                if(v4 < v3) {
                    Object object3 = list0.get(v4);
                    if(PointerId.d(((PointerInputChange)object3).p(), l0$g1.a)) {
                        object2 = object3;
                    }
                    else {
                        ++v4;
                        continue;
                    }
                }
                break;
            }
            PointerInputChange pointerInputChange0 = (PointerInputChange)object2;
            if(pointerInputChange0 == null) {
                pointerInputChange0 = null;
                goto label_61;
            }
            else {
                if(PointerEventKt.e(pointerInputChange0)) {
                    List list1 = ((PointerEvent)object0).e();
                    int v5 = list1.size();
                    int v6 = 0;
                    while(true) {
                        object4 = null;
                        if(v6 < v5) {
                            Object object5 = list1.get(v6);
                            if(((PointerInputChange)object5).r()) {
                                object4 = object5;
                            }
                            else {
                                ++v6;
                                continue;
                            }
                        }
                        break;
                    }
                    if(((PointerInputChange)object4) == null) {
                        goto label_61;
                    }
                    else {
                        l0$g1.a = ((PointerInputChange)object4).p();
                        goto label_72;
                    }
                    goto label_60;
                }
                else {
                label_60:
                    if(Offset.p(PointerEventKt.m(pointerInputChange0)) != 0.0f) {
                    label_61:
                        if(pointerInputChange0 != null && !pointerInputChange0.A()) {
                            if(PointerEventKt.e(pointerInputChange0)) {
                                return pointerInputChange0 == null ? kotlin.coroutines.jvm.internal.b.a(false) : kotlin.coroutines.jvm.internal.b.a(true);
                            }
                            function11.invoke(pointerInputChange0);
                            awaitPointerEventScope1 = awaitPointerEventScope3;
                            v2 = pointerInputChange0.p();
                            l0$g1 = new g();
                            l0$g1.a = v2;
                            awaitPointerEventScope2 = awaitPointerEventScope1;
                            goto label_73;
                        }
                        return kotlin.coroutines.jvm.internal.b.a(false);
                    }
                }
            label_72:
                awaitPointerEventScope1 = awaitPointerEventScope3;
            }
        label_73:
            dragGestureDetectorKt$horizontalDrag$11.k = function11;
            dragGestureDetectorKt$horizontalDrag$11.l = awaitPointerEventScope1;
            dragGestureDetectorKt$horizontalDrag$11.m = awaitPointerEventScope2;
            dragGestureDetectorKt$horizontalDrag$11.n = l0$g1;
            dragGestureDetectorKt$horizontalDrag$11.p = 1;
            Object object6 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope2, null, dragGestureDetectorKt$horizontalDrag$11, 1, null);
            if(object6 == object1) {
                return object1;
            }
            awaitPointerEventScope3 = awaitPointerEventScope1;
            object0 = object6;
        }
    }

    private static final boolean C(PointerEvent pointerEvent0, long v) {
        List list0 = pointerEvent0.e();
        int v1 = list0.size();
        int v2 = 0;
        for(int v3 = 0; true; ++v3) {
            Object object0 = null;
            if(v3 >= v1) {
                break;
            }
            Object object1 = list0.get(v3);
            if(PointerId.d(((PointerInputChange)object1).p(), v)) {
                object0 = object1;
                break;
            }
        }
        if(((PointerInputChange)object0) != null && ((PointerInputChange)object0).r()) {
            v2 = 1;
        }
        return 1 ^ v2;
    }

    // 去混淆评级： 低(20)
    public static final float D(@l ViewConfiguration viewConfiguration0, int v) {
        L.p(viewConfiguration0, "$this$pointerSlop");
        return PointerType.i(v, 2) ? viewConfiguration0.b() * DragGestureDetectorKt.e : viewConfiguration0.b();
    }

    @l
    public static final PointerDirectionConfig E(@l Orientation orientation0) {
        L.p(orientation0, "<this>");
        return orientation0 == Orientation.a ? DragGestureDetectorKt.b : DragGestureDetectorKt.a;
    }

    @m
    public static final Object F(@l AwaitPointerEventScope awaitPointerEventScope0, long v, @l Function1 function10, @l d d0) {
        Object object4;
        Object object2;
        g l0$g1;
        AwaitPointerEventScope awaitPointerEventScope3;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1 function11;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.verticalDrag.1 dragGestureDetectorKt$verticalDrag$11;
        AwaitPointerEventScope awaitPointerEventScope1;
        long v2;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.verticalDrag.1 dragGestureDetectorKt$verticalDrag$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt.verticalDrag.1) {
            dragGestureDetectorKt$verticalDrag$10 = (androidx.compose.foundation.gestures.DragGestureDetectorKt.verticalDrag.1)d0;
            int v1 = dragGestureDetectorKt$verticalDrag$10.p;
            if((v1 & 0x80000000) == 0) {
                dragGestureDetectorKt$verticalDrag$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    Object o;
                    int p;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.o = object0;
                        this.p |= 0x80000000;
                        return DragGestureDetectorKt.F(null, 0L, null, this);
                    }
                };
            }
            else {
                dragGestureDetectorKt$verticalDrag$10.p = v1 ^ 0x80000000;
            }
        }
        else {
            dragGestureDetectorKt$verticalDrag$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                int p;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.o = object0;
                    this.p |= 0x80000000;
                    return DragGestureDetectorKt.F(null, 0L, null, this);
                }
            };
        }
        Object object0 = dragGestureDetectorKt$verticalDrag$10.o;
        Object object1 = b.l();
        switch(dragGestureDetectorKt$verticalDrag$10.p) {
            case 0: {
                f0.n(object0);
                v2 = v;
                if(DragGestureDetectorKt.C(awaitPointerEventScope0.m1(), v2)) {
                    return kotlin.coroutines.jvm.internal.b.a(false);
                }
                awaitPointerEventScope1 = awaitPointerEventScope0;
                dragGestureDetectorKt$verticalDrag$11 = dragGestureDetectorKt$verticalDrag$10;
                function11 = function10;
                l0$g1 = new g();
                l0$g1.a = v2;
                awaitPointerEventScope2 = awaitPointerEventScope1;
                goto label_73;
            }
            case 1: {
                g l0$g0 = (g)dragGestureDetectorKt$verticalDrag$10.n;
                awaitPointerEventScope2 = (AwaitPointerEventScope)dragGestureDetectorKt$verticalDrag$10.m;
                awaitPointerEventScope3 = (AwaitPointerEventScope)dragGestureDetectorKt$verticalDrag$10.l;
                Function1 function12 = (Function1)dragGestureDetectorKt$verticalDrag$10.k;
                f0.n(object0);
                dragGestureDetectorKt$verticalDrag$11 = dragGestureDetectorKt$verticalDrag$10;
                function11 = function12;
                l0$g1 = l0$g0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            List list0 = ((PointerEvent)object0).e();
            int v3 = list0.size();
            int v4 = 0;
            while(true) {
                object2 = null;
                if(v4 < v3) {
                    Object object3 = list0.get(v4);
                    if(PointerId.d(((PointerInputChange)object3).p(), l0$g1.a)) {
                        object2 = object3;
                    }
                    else {
                        ++v4;
                        continue;
                    }
                }
                break;
            }
            PointerInputChange pointerInputChange0 = (PointerInputChange)object2;
            if(pointerInputChange0 == null) {
                pointerInputChange0 = null;
                goto label_61;
            }
            else {
                if(PointerEventKt.e(pointerInputChange0)) {
                    List list1 = ((PointerEvent)object0).e();
                    int v5 = list1.size();
                    int v6 = 0;
                    while(true) {
                        object4 = null;
                        if(v6 < v5) {
                            Object object5 = list1.get(v6);
                            if(((PointerInputChange)object5).r()) {
                                object4 = object5;
                            }
                            else {
                                ++v6;
                                continue;
                            }
                        }
                        break;
                    }
                    if(((PointerInputChange)object4) == null) {
                        goto label_61;
                    }
                    else {
                        l0$g1.a = ((PointerInputChange)object4).p();
                        goto label_72;
                    }
                    goto label_60;
                }
                else {
                label_60:
                    if(Offset.r(PointerEventKt.m(pointerInputChange0)) != 0.0f) {
                    label_61:
                        if(pointerInputChange0 != null && !pointerInputChange0.A()) {
                            if(PointerEventKt.e(pointerInputChange0)) {
                                return pointerInputChange0 == null ? kotlin.coroutines.jvm.internal.b.a(false) : kotlin.coroutines.jvm.internal.b.a(true);
                            }
                            function11.invoke(pointerInputChange0);
                            awaitPointerEventScope1 = awaitPointerEventScope3;
                            v2 = pointerInputChange0.p();
                            l0$g1 = new g();
                            l0$g1.a = v2;
                            awaitPointerEventScope2 = awaitPointerEventScope1;
                            goto label_73;
                        }
                        return kotlin.coroutines.jvm.internal.b.a(false);
                    }
                }
            label_72:
                awaitPointerEventScope1 = awaitPointerEventScope3;
            }
        label_73:
            dragGestureDetectorKt$verticalDrag$11.k = function11;
            dragGestureDetectorKt$verticalDrag$11.l = awaitPointerEventScope1;
            dragGestureDetectorKt$verticalDrag$11.m = awaitPointerEventScope2;
            dragGestureDetectorKt$verticalDrag$11.n = l0$g1;
            dragGestureDetectorKt$verticalDrag$11.p = 1;
            Object object6 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope2, null, dragGestureDetectorKt$verticalDrag$11, 1, null);
            if(object6 == object1) {
                return object1;
            }
            awaitPointerEventScope3 = awaitPointerEventScope1;
            object0 = object6;
        }
    }

    @m
    public static final Object b(@l AwaitPointerEventScope awaitPointerEventScope0, long v, @l d d0) {
        Object object4;
        Object object2;
        g l0$g2;
        AwaitPointerEventScope awaitPointerEventScope1;
        g l0$g0;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitDragOrCancellation.1 dragGestureDetectorKt$awaitDragOrCancellation$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitDragOrCancellation.1) {
            dragGestureDetectorKt$awaitDragOrCancellation$10 = (androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitDragOrCancellation.1)d0;
            int v1 = dragGestureDetectorKt$awaitDragOrCancellation$10.n;
            if((v1 & 0x80000000) == 0) {
                dragGestureDetectorKt$awaitDragOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.n |= 0x80000000;
                        return DragGestureDetectorKt.b(null, 0L, this);
                    }
                };
            }
            else {
                dragGestureDetectorKt$awaitDragOrCancellation$10.n = v1 ^ 0x80000000;
            }
        }
        else {
            dragGestureDetectorKt$awaitDragOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.n |= 0x80000000;
                    return DragGestureDetectorKt.b(null, 0L, this);
                }
            };
        }
        Object object0 = dragGestureDetectorKt$awaitDragOrCancellation$10.m;
        Object object1 = b.l();
        switch(dragGestureDetectorKt$awaitDragOrCancellation$10.n) {
            case 0: {
                f0.n(object0);
                if(DragGestureDetectorKt.C(awaitPointerEventScope0.m1(), v)) {
                    return null;
                }
                l0$g0 = new g();
                l0$g0.a = v;
                awaitPointerEventScope1 = awaitPointerEventScope0;
                goto label_59;
            }
            case 1: {
                g l0$g1 = (g)dragGestureDetectorKt$awaitDragOrCancellation$10.l;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope)dragGestureDetectorKt$awaitDragOrCancellation$10.k;
                f0.n(object0);
                l0$g2 = l0$g1;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            List list0 = ((PointerEvent)object0).e();
            int v2 = list0.size();
            int v3 = 0;
            int v4 = 0;
            while(true) {
                object2 = null;
                if(v4 < v2) {
                    Object object3 = list0.get(v4);
                    if(PointerId.d(((PointerInputChange)object3).p(), l0$g2.a)) {
                        object2 = object3;
                    }
                    else {
                        ++v4;
                        continue;
                    }
                }
                break;
            }
            PointerInputChange pointerInputChange0 = (PointerInputChange)object2;
            if(pointerInputChange0 == null) {
                throw new NullPointerException();
            }
            if(PointerEventKt.e(pointerInputChange0)) {
                List list1 = ((PointerEvent)object0).e();
                int v5 = list1.size();
                while(true) {
                    object4 = null;
                    if(v3 < v5) {
                        Object object5 = list1.get(v3);
                        if(((PointerInputChange)object5).r()) {
                            object4 = object5;
                        }
                        else {
                            ++v3;
                            continue;
                        }
                    }
                    break;
                }
                if(((PointerInputChange)object4) != null) {
                    l0$g2.a = ((PointerInputChange)object4).p();
                }
            }
            else if(!PointerEventKt.q(pointerInputChange0)) {
            }
            else {
                return pointerInputChange0 == null || pointerInputChange0.A() ? null : pointerInputChange0;
            }
            l0$g0 = l0$g2;
        label_59:
            dragGestureDetectorKt$awaitDragOrCancellation$10.k = awaitPointerEventScope1;
            dragGestureDetectorKt$awaitDragOrCancellation$10.l = l0$g0;
            dragGestureDetectorKt$awaitDragOrCancellation$10.n = 1;
            Object object6 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope1, null, dragGestureDetectorKt$awaitDragOrCancellation$10, 1, null);
            if(object6 == object1) {
                return object1;
            }
            object0 = object6;
            l0$g2 = l0$g0;
        }
    }

    private static final Object c(AwaitPointerEventScope awaitPointerEventScope0, long v, Function1 function10, d d0) {
        Object object1;
        g l0$g0 = new g();
        l0$g0.a = v;
        while(true) {
            Object object0 = null;
            PointerEvent pointerEvent0 = (PointerEvent)androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope0, null, d0, 1, null);
            List list0 = pointerEvent0.e();
            int v2 = list0.size();
            int v3 = 0;
            while(true) {
                object1 = null;
                if(v3 < v2) {
                    Object object2 = list0.get(v3);
                    if(PointerId.d(((PointerInputChange)object2).p(), l0$g0.a)) {
                        object1 = object2;
                    }
                    else {
                        ++v3;
                        continue;
                    }
                }
                break;
            }
            if(((PointerInputChange)object1) == null) {
                break;
            }
            if(PointerEventKt.e(((PointerInputChange)object1))) {
                List list1 = pointerEvent0.e();
                int v4 = list1.size();
                for(int v1 = 0; v1 < v4; ++v1) {
                    Object object3 = list1.get(v1);
                    if(((PointerInputChange)object3).r()) {
                        object0 = object3;
                        break;
                    }
                }
                if(((PointerInputChange)object0) == null) {
                    return (PointerInputChange)object1;
                }
                l0$g0.a = ((PointerInputChange)object0).p();
            }
            else if(((Boolean)function10.invoke(((PointerInputChange)object1))).booleanValue()) {
                return (PointerInputChange)object1;
            }
        }
        return null;
    }

    @m
    public static final Object d(@l AwaitPointerEventScope awaitPointerEventScope0, long v, @l d d0) {
        Object object4;
        Object object2;
        g l0$g2;
        AwaitPointerEventScope awaitPointerEventScope1;
        g l0$g0;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitHorizontalDragOrCancellation.1 dragGestureDetectorKt$awaitHorizontalDragOrCancellation$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitHorizontalDragOrCancellation.1) {
            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$10 = (androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitHorizontalDragOrCancellation.1)d0;
            int v1 = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$10.n;
            if((v1 & 0x80000000) == 0) {
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.n |= 0x80000000;
                        return DragGestureDetectorKt.d(null, 0L, this);
                    }
                };
            }
            else {
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$10.n = v1 ^ 0x80000000;
            }
        }
        else {
            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.n |= 0x80000000;
                    return DragGestureDetectorKt.d(null, 0L, this);
                }
            };
        }
        Object object0 = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$10.m;
        Object object1 = b.l();
        switch(dragGestureDetectorKt$awaitHorizontalDragOrCancellation$10.n) {
            case 0: {
                f0.n(object0);
                if(DragGestureDetectorKt.C(awaitPointerEventScope0.m1(), v)) {
                    return null;
                }
                l0$g0 = new g();
                l0$g0.a = v;
                awaitPointerEventScope1 = awaitPointerEventScope0;
                goto label_59;
            }
            case 1: {
                g l0$g1 = (g)dragGestureDetectorKt$awaitHorizontalDragOrCancellation$10.l;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope)dragGestureDetectorKt$awaitHorizontalDragOrCancellation$10.k;
                f0.n(object0);
                l0$g2 = l0$g1;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            List list0 = ((PointerEvent)object0).e();
            int v2 = list0.size();
            int v3 = 0;
            int v4 = 0;
            while(true) {
                object2 = null;
                if(v4 < v2) {
                    Object object3 = list0.get(v4);
                    if(PointerId.d(((PointerInputChange)object3).p(), l0$g2.a)) {
                        object2 = object3;
                    }
                    else {
                        ++v4;
                        continue;
                    }
                }
                break;
            }
            PointerInputChange pointerInputChange0 = (PointerInputChange)object2;
            if(pointerInputChange0 == null) {
                throw new NullPointerException();
            }
            if(PointerEventKt.e(pointerInputChange0)) {
                List list1 = ((PointerEvent)object0).e();
                int v5 = list1.size();
                while(true) {
                    object4 = null;
                    if(v3 < v5) {
                        Object object5 = list1.get(v3);
                        if(((PointerInputChange)object5).r()) {
                            object4 = object5;
                        }
                        else {
                            ++v3;
                            continue;
                        }
                    }
                    break;
                }
                if(((PointerInputChange)object4) != null) {
                    l0$g2.a = ((PointerInputChange)object4).p();
                }
            }
            else if(Offset.p(PointerEventKt.m(pointerInputChange0)) == 0.0f) {
            }
            else {
                return pointerInputChange0 == null || pointerInputChange0.A() ? null : pointerInputChange0;
            }
            l0$g0 = l0$g2;
        label_59:
            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$10.k = awaitPointerEventScope1;
            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$10.l = l0$g0;
            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$10.n = 1;
            Object object6 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope1, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$10, 1, null);
            if(object6 == object1) {
                return object1;
            }
            object0 = object6;
            l0$g2 = l0$g0;
        }
    }

    @m
    public static final Object e(@l AwaitPointerEventScope awaitPointerEventScope0, long v, int v1, @l o o0, @l d d0) {
        long v13;
        Object object4;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitHorizontalPointerSlopOrCancellation.1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
        Object object3;
        float f12;
        PointerInputChange pointerInputChange0;
        int v5;
        float f8;
        float f7;
        PointerDirectionConfig pointerDirectionConfig2;
        float f3;
        float f2;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitHorizontalPointerSlopOrCancellation.1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11;
        PointerDirectionConfig pointerDirectionConfig1;
        int v3;
        g l0$g1;
        float f1;
        o o1;
        AwaitPointerEventScope awaitPointerEventScope1;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitHorizontalPointerSlopOrCancellation.1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitHorizontalPointerSlopOrCancellation.1) {
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10 = (androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitHorizontalPointerSlopOrCancellation.1)d0;
            int v2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.u;
            if((v2 & 0x80000000) == 0) {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    Object o;
                    int p;
                    float q;
                    float r;
                    float s;
                    Object t;
                    int u;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.t = object0;
                        this.u |= 0x80000000;
                        return DragGestureDetectorKt.e(null, 0L, 0, null, this);
                    }
                };
            }
            else {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.u = v2 ^ 0x80000000;
            }
        }
        else {
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                int p;
                float q;
                float r;
                float s;
                Object t;
                int u;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.t = object0;
                    this.u |= 0x80000000;
                    return DragGestureDetectorKt.e(null, 0L, 0, null, this);
                }
            };
        }
        Object object0 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.t;
        Object object1 = b.l();
        switch(dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.u) {
            case 0: {
                f0.n(object0);
                PointerDirectionConfig pointerDirectionConfig0 = DragGestureDetectorKt.a;
                if(!DragGestureDetectorKt.C(awaitPointerEventScope0.m1(), v)) {
                    float f = DragGestureDetectorKt.D(awaitPointerEventScope0.getViewConfiguration(), v1);
                    g l0$g0 = new g();
                    l0$g0.a = v;
                    awaitPointerEventScope1 = awaitPointerEventScope0;
                    o1 = o0;
                    f1 = f;
                    l0$g1 = l0$g0;
                    v3 = 1;
                    pointerDirectionConfig1 = pointerDirectionConfig0;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    goto label_68;
                }
                return null;
            }
            case 1: {
                float f4 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.s;
                float f5 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.r;
                float f6 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.q;
                int v4 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.p;
                g l0$g2 = (g)dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.n;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope)dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.m;
                pointerDirectionConfig2 = (PointerDirectionConfig)dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.l;
                o o2 = (o)dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.k;
                f0.n(object0);
                f7 = f4;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                l0$g1 = l0$g2;
                f1 = f6;
                f8 = f5;
                o1 = o2;
                v5 = v4;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10;
                goto label_86;
            }
            case 2: {
                float f9 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.s;
                float f10 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.r;
                float f11 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.q;
                int v6 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.p;
                pointerInputChange0 = (PointerInputChange)dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.o;
                l0$g1 = (g)dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.n;
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope)dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.m;
                PointerDirectionConfig pointerDirectionConfig3 = (PointerDirectionConfig)dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.l;
                o o3 = (o)dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10.k;
                f0.n(object0);
                f2 = f9;
                f12 = f11;
                awaitPointerEventScope1 = awaitPointerEventScope3;
                pointerDirectionConfig1 = pointerDirectionConfig3;
                v3 = v6;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$10;
                f3 = f10;
                o1 = o3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(!pointerInputChange0.A()) {
            f1 = f12;
        label_68:
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.k = o1;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.l = pointerDirectionConfig1;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.m = awaitPointerEventScope1;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.n = l0$g1;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.o = null;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.p = v3;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.q = f1;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.r = f3;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.s = f2;
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.u = 1;
            Object object2 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope1, null, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11, 1, null);
            if(object2 == object1) {
                return object1;
            }
            f7 = f2;
            object0 = object2;
            v5 = v3;
            pointerDirectionConfig2 = pointerDirectionConfig1;
            f8 = f3;
        label_86:
            List list0 = ((PointerEvent)object0).e();
            int v7 = list0.size();
            int v8 = 0;
            while(true) {
                if(v8 < v7) {
                    object3 = list0.get(v8);
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11;
                    if(PointerId.d(((PointerInputChange)object3).p(), l0$g1.a)) {
                        break;
                    }
                    else {
                        ++v8;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                        continue;
                    }
                }
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11;
                object3 = null;
                break;
            }
            if(((PointerInputChange)object3) == null || ((PointerInputChange)object3).A()) {
                break;
            }
            if(PointerEventKt.e(((PointerInputChange)object3))) {
                List list1 = ((PointerEvent)object0).e();
                int v9 = list1.size();
                int v10 = 0;
                while(true) {
                    object4 = null;
                    if(v10 < v9) {
                        Object object5 = list1.get(v10);
                        if(((PointerInputChange)object5).r()) {
                            object4 = object5;
                        }
                        else {
                            ++v10;
                            continue;
                        }
                    }
                    break;
                }
                if(((PointerInputChange)object4) != null) {
                    l0$g1.a = ((PointerInputChange)object4).p();
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                    f2 = f7;
                    f3 = f8;
                    pointerDirectionConfig1 = pointerDirectionConfig2;
                    v3 = v5;
                    goto label_68;
                }
            }
            else {
                long v11 = ((PointerInputChange)object3).q();
                long v12 = ((PointerInputChange)object3).u();
                float f13 = pointerDirectionConfig2.a(v11) - pointerDirectionConfig2.a(v12) + f8;
                float f14 = f7 + (pointerDirectionConfig2.c(v11) - pointerDirectionConfig2.c(v12));
                float f15 = v5 == 0 ? Offset.m(pointerDirectionConfig2.b(f13, f14)) : Math.abs(f13);
                if(f15 < f1) {
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.k = o1;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.l = pointerDirectionConfig2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.m = awaitPointerEventScope1;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.n = l0$g1;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.o = (PointerInputChange)object3;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.p = v5;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.q = f1;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.r = f13;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.s = f14;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11.u = 2;
                    if(awaitPointerEventScope1.l1(PointerEventPass.c, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11) == object1) {
                        return object1;
                    }
                    pointerDirectionConfig1 = pointerDirectionConfig2;
                    v3 = v5;
                    f3 = f13;
                    f2 = f14;
                    pointerInputChange0 = (PointerInputChange)object3;
                    f12 = f1;
                    continue;
                }
                else {
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$11 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                    if(v5 == 0) {
                        long v14 = pointerDirectionConfig2.b(f13, f14);
                        v13 = Offset.u(v14, Offset.x(Offset.j(v14, f15), f1));
                    }
                    else {
                        v13 = pointerDirectionConfig2.b(f13 - Math.signum(f13) * f1, f14);
                    }
                    o1.invoke(((PointerInputChange)object3), kotlin.coroutines.jvm.internal.b.e(Offset.p(v13)));
                    if(!((PointerInputChange)object3).A()) {
                        pointerDirectionConfig1 = pointerDirectionConfig2;
                        v3 = v5;
                        f2 = 0.0f;
                        f3 = 0.0f;
                        goto label_68;
                    }
                    return (PointerInputChange)object3;
                }
            }
            break;
        }
        return null;
    }

    @m
    public static final Object f(@l AwaitPointerEventScope awaitPointerEventScope0, long v, @l o o0, @l d d0) {
        long v12;
        Object object4;
        float f12;
        Object object3;
        PointerInputChange pointerInputChange0;
        float f9;
        int v4;
        float f8;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitHorizontalTouchSlopOrCancellation.1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
        float f7;
        PointerDirectionConfig pointerDirectionConfig2;
        float f3;
        float f2;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitHorizontalTouchSlopOrCancellation.1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11;
        float f1;
        int v2;
        g l0$g1;
        PointerDirectionConfig pointerDirectionConfig1;
        o o1;
        AwaitPointerEventScope awaitPointerEventScope1;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitHorizontalTouchSlopOrCancellation.1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitHorizontalTouchSlopOrCancellation.1) {
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10 = (androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitHorizontalTouchSlopOrCancellation.1)d0;
            int v1 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.u;
            if((v1 & 0x80000000) == 0) {
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    Object o;
                    int p;
                    float q;
                    float r;
                    float s;
                    Object t;
                    int u;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.t = object0;
                        this.u |= 0x80000000;
                        return DragGestureDetectorKt.f(null, 0L, null, this);
                    }
                };
            }
            else {
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.u = v1 ^ 0x80000000;
            }
        }
        else {
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                int p;
                float q;
                float r;
                float s;
                Object t;
                int u;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.t = object0;
                    this.u |= 0x80000000;
                    return DragGestureDetectorKt.f(null, 0L, null, this);
                }
            };
        }
        Object object0 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.t;
        Object object1 = b.l();
        switch(dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.u) {
            case 0: {
                f0.n(object0);
                PointerDirectionConfig pointerDirectionConfig0 = DragGestureDetectorKt.a;
                if(!DragGestureDetectorKt.C(awaitPointerEventScope0.m1(), v)) {
                    float f = DragGestureDetectorKt.D(awaitPointerEventScope0.getViewConfiguration(), 1);
                    g l0$g0 = new g();
                    l0$g0.a = v;
                    awaitPointerEventScope1 = awaitPointerEventScope0;
                    o1 = o0;
                    pointerDirectionConfig1 = pointerDirectionConfig0;
                    l0$g1 = l0$g0;
                    v2 = 1;
                    f1 = f;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    goto label_68;
                }
                return null;
            }
            case 1: {
                float f4 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.s;
                float f5 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.r;
                float f6 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.q;
                int v3 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.p;
                g l0$g2 = (g)dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.n;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope)dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.m;
                pointerDirectionConfig2 = (PointerDirectionConfig)dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.l;
                o o2 = (o)dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.k;
                f0.n(object0);
                f7 = f4;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                l0$g1 = l0$g2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10;
                f8 = f5;
                o1 = o2;
                v4 = v3;
                f9 = f6;
                goto label_88;
            }
            case 2: {
                float f10 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.s;
                float f11 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.r;
                f1 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.q;
                int v5 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.p;
                pointerInputChange0 = (PointerInputChange)dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.o;
                l0$g1 = (g)dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.n;
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope)dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.m;
                PointerDirectionConfig pointerDirectionConfig3 = (PointerDirectionConfig)dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.l;
                o o3 = (o)dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10.k;
                f0.n(object0);
                f2 = f10;
                awaitPointerEventScope1 = awaitPointerEventScope3;
                pointerDirectionConfig2 = pointerDirectionConfig3;
                v4 = v5;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$10;
                f3 = f11;
                o1 = o3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(!pointerInputChange0.A()) {
            pointerDirectionConfig1 = pointerDirectionConfig2;
            v2 = v4;
        label_68:
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11.k = o1;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11.l = pointerDirectionConfig1;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11.m = awaitPointerEventScope1;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11.n = l0$g1;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11.o = null;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11.p = v2;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11.q = f1;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11.r = f3;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11.s = f2;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11.u = 1;
            Object object2 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope1, null, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11, 1, null);
            if(object2 == object1) {
                return object1;
            }
            f7 = f2;
            object0 = object2;
            v4 = v2;
            pointerDirectionConfig2 = pointerDirectionConfig1;
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11;
            f9 = f1;
            f8 = f3;
        label_88:
            List list0 = ((PointerEvent)object0).e();
            int v6 = list0.size();
            int v7 = 0;
            while(true) {
                if(v7 < v6) {
                    object3 = list0.get(v7);
                    f12 = f9;
                    if(PointerId.d(((PointerInputChange)object3).p(), l0$g1.a)) {
                        break;
                    }
                    else {
                        ++v7;
                        f9 = f12;
                        continue;
                    }
                }
                f12 = f9;
                object3 = null;
                break;
            }
            if(((PointerInputChange)object3) == null || ((PointerInputChange)object3).A()) {
                break;
            }
            if(PointerEventKt.e(((PointerInputChange)object3))) {
                List list1 = ((PointerEvent)object0).e();
                int v8 = list1.size();
                int v9 = 0;
                while(true) {
                    object4 = null;
                    if(v9 < v8) {
                        Object object5 = list1.get(v9);
                        if(((PointerInputChange)object5).r()) {
                            object4 = object5;
                        }
                        else {
                            ++v9;
                            continue;
                        }
                    }
                    break;
                }
                if(((PointerInputChange)object4) != null) {
                    l0$g1.a = ((PointerInputChange)object4).p();
                    f2 = f7;
                    f3 = f8;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
                    pointerDirectionConfig1 = pointerDirectionConfig2;
                    v2 = v4;
                    f1 = f12;
                    goto label_68;
                }
            }
            else {
                long v10 = ((PointerInputChange)object3).q();
                long v11 = ((PointerInputChange)object3).u();
                float f13 = pointerDirectionConfig2.a(v10) - pointerDirectionConfig2.a(v11) + f8;
                float f14 = f7 + (pointerDirectionConfig2.c(v10) - pointerDirectionConfig2.c(v11));
                float f15 = v4 == 0 ? Offset.m(pointerDirectionConfig2.b(f13, f14)) : Math.abs(f13);
                if(f15 < f12) {
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.k = o1;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.l = pointerDirectionConfig2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.m = awaitPointerEventScope1;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.n = l0$g1;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.o = (PointerInputChange)object3;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.p = v4;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.q = f12;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.r = f13;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.s = f14;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.u = 2;
                    if(awaitPointerEventScope1.l1(PointerEventPass.c, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12) == object1) {
                        return object1;
                    }
                    f1 = f12;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
                    pointerInputChange0 = (PointerInputChange)object3;
                    f3 = f13;
                    f2 = f14;
                    continue;
                }
                else {
                    if(v4 == 0) {
                        long v13 = pointerDirectionConfig2.b(f13, f14);
                        v12 = Offset.u(v13, Offset.x(Offset.j(v13, f15), f12));
                    }
                    else {
                        v12 = pointerDirectionConfig2.b(f13 - Math.signum(f13) * f12, f14);
                    }
                    o1.invoke(((PointerInputChange)object3), kotlin.coroutines.jvm.internal.b.e(Offset.p(v12)));
                    if(!((PointerInputChange)object3).A()) {
                        f1 = f12;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$11 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
                        pointerDirectionConfig1 = pointerDirectionConfig2;
                        v2 = v4;
                        f2 = 0.0f;
                        f3 = 0.0f;
                        goto label_68;
                    }
                    return (PointerInputChange)object3;
                }
            }
            break;
        }
        return null;
    }

    @m
    public static final Object g(@l AwaitPointerEventScope awaitPointerEventScope0, long v, @l d d0) {
        h l0$h2;
        PointerInputChange pointerInputChange0;
        Object object2;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitLongPressOrCancellation.1 dragGestureDetectorKt$awaitLongPressOrCancellation$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitLongPressOrCancellation.1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$10 = (androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitLongPressOrCancellation.1)d0;
            int v1 = dragGestureDetectorKt$awaitLongPressOrCancellation$10.n;
            if((v1 & 0x80000000) == 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.n |= 0x80000000;
                        return DragGestureDetectorKt.g(null, 0L, this);
                    }
                };
            }
            else {
                dragGestureDetectorKt$awaitLongPressOrCancellation$10.n = v1 ^ 0x80000000;
            }
        }
        else {
            dragGestureDetectorKt$awaitLongPressOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.n |= 0x80000000;
                    return DragGestureDetectorKt.g(null, 0L, this);
                }
            };
        }
        Object object0 = dragGestureDetectorKt$awaitLongPressOrCancellation$10.m;
        Object object1 = b.l();
        switch(dragGestureDetectorKt$awaitLongPressOrCancellation$10.n) {
            case 0: {
                f0.n(object0);
                if(DragGestureDetectorKt.C(awaitPointerEventScope0.m1(), v)) {
                    return null;
                }
                List list0 = awaitPointerEventScope0.m1().e();
                int v2 = list0.size();
                for(int v3 = 0; true; ++v3) {
                    object2 = null;
                    if(v3 >= v2) {
                        break;
                    }
                    Object object3 = list0.get(v3);
                    if(PointerId.d(((PointerInputChange)object3).p(), v)) {
                        object2 = object3;
                        break;
                    }
                }
                pointerInputChange0 = (PointerInputChange)object2;
                if(pointerInputChange0 == null) {
                    return null;
                }
                h l0$h0 = new h();
                h l0$h1 = new h();
                l0$h1.a = pointerInputChange0;
                long v4 = awaitPointerEventScope0.getViewConfiguration().d();
                try {
                    androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitLongPressOrCancellation.2 dragGestureDetectorKt$awaitLongPressOrCancellation$20 = new o(l0$h1, l0$h0, null) {
                        Object l;
                        int m;
                        int n;
                        private Object o;
                        final h p;
                        final h q;

                        {
                            this.p = l0$h0;
                            this.q = l0$h1;
                            super(2, d0);
                        }

                        @m
                        public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                            return ((androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitLongPressOrCancellation.2)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            d d1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitLongPressOrCancellation.2(this.p, this.q, d0);
                            d1.o = object0;
                            return d1;
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.a(((AwaitPointerEventScope)object0), ((d)object1));
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object6;
                            Object object4;
                            Object object3;
                            AwaitPointerEventScope awaitPointerEventScope1;
                            PointerEvent pointerEvent0;
                            Object object2;
                            int v;
                            AwaitPointerEventScope awaitPointerEventScope0;
                            Object object1 = b.l();
                            switch(this.n) {
                                case 0: {
                                    f0.n(object0);
                                    awaitPointerEventScope0 = (AwaitPointerEventScope)this.o;
                                    v = 0;
                                    goto label_62;
                                }
                                case 1: {
                                    v = this.m;
                                    awaitPointerEventScope0 = (AwaitPointerEventScope)this.o;
                                    f0.n(object0);
                                    object2 = object0;
                                    goto label_70;
                                }
                                case 2: {
                                    v = this.m;
                                    pointerEvent0 = (PointerEvent)this.l;
                                    awaitPointerEventScope1 = (AwaitPointerEventScope)this.o;
                                    f0.n(object0);
                                    object3 = object0;
                                    break;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                            while(true) {
                                List list0 = ((PointerEvent)object3).e();
                                int v1 = list0.size();
                                for(int v2 = 0; v2 < v1; ++v2) {
                                    if(((PointerInputChange)list0.get(v2)).A()) {
                                        v = 1;
                                        break;
                                    }
                                }
                                if(DragGestureDetectorKt.C(pointerEvent0, ((PointerInputChange)this.p.a).p())) {
                                    List list1 = pointerEvent0.e();
                                    int v3 = list1.size();
                                    int v4 = 0;
                                    while(true) {
                                        object4 = null;
                                        if(v4 < v3) {
                                            Object object5 = list1.get(v4);
                                            if(((PointerInputChange)object5).r()) {
                                                object4 = object5;
                                            }
                                            else {
                                                ++v4;
                                                continue;
                                            }
                                        }
                                        break;
                                    }
                                    if(((PointerInputChange)object4) == null) {
                                        awaitPointerEventScope0 = awaitPointerEventScope1;
                                        v = 1;
                                        goto label_62;
                                    }
                                    else {
                                        this.p.a = (PointerInputChange)object4;
                                        this.q.a = (PointerInputChange)object4;
                                        goto label_61;
                                    }
                                    goto label_46;
                                }
                                else {
                                label_46:
                                    h l0$h0 = this.q;
                                    List list2 = pointerEvent0.e();
                                    h l0$h1 = this.p;
                                    int v5 = list2.size();
                                    int v6 = 0;
                                    while(true) {
                                        object6 = null;
                                        if(v6 < v5) {
                                            Object object7 = list2.get(v6);
                                            if(PointerId.d(((PointerInputChange)object7).p(), ((PointerInputChange)l0$h1.a).p())) {
                                                object6 = object7;
                                            }
                                            else {
                                                ++v6;
                                                continue;
                                            }
                                        }
                                        break;
                                    }
                                    l0$h0.a = object6;
                                }
                            label_61:
                                awaitPointerEventScope0 = awaitPointerEventScope1;
                            label_62:
                                if(v != 0) {
                                    break;
                                }
                                this.o = awaitPointerEventScope0;
                                this.l = null;
                                this.m = 0;
                                this.n = 1;
                                object2 = awaitPointerEventScope0.l1(PointerEventPass.b, this);
                                if(object2 == object1) {
                                    return object1;
                                }
                            label_70:
                                List list3 = ((PointerEvent)object2).e();
                                int v7 = list3.size();
                                int v8 = 0;
                                while(true) {
                                    if(v8 < v7) {
                                        if(PointerEventKt.e(((PointerInputChange)list3.get(v8)))) {
                                            ++v8;
                                            continue;
                                        }
                                        else {
                                            break;
                                        }
                                    }
                                    v = 1;
                                    break;
                                }
                                List list4 = ((PointerEvent)object2).e();
                                int v9 = list4.size();
                                int v10 = 0;
                                while(v10 < v9) {
                                    PointerInputChange pointerInputChange0 = (PointerInputChange)list4.get(v10);
                                    if(!pointerInputChange0.A() && !PointerEventKt.j(pointerInputChange0, awaitPointerEventScope0.a(), awaitPointerEventScope0.S())) {
                                        ++v10;
                                    }
                                    else {
                                        v = 1;
                                        if(true) {
                                            break;
                                        }
                                    }
                                }
                                this.o = awaitPointerEventScope0;
                                this.l = (PointerEvent)object2;
                                this.m = v;
                                this.n = 2;
                                object3 = awaitPointerEventScope0.l1(PointerEventPass.c, this);
                                if(object3 == object1) {
                                    return object1;
                                }
                                awaitPointerEventScope1 = awaitPointerEventScope0;
                                pointerEvent0 = (PointerEvent)object2;
                            }
                            return S0.a;
                        }
                    };
                    dragGestureDetectorKt$awaitLongPressOrCancellation$10.k = pointerInputChange0;
                    dragGestureDetectorKt$awaitLongPressOrCancellation$10.l = l0$h0;
                    dragGestureDetectorKt$awaitLongPressOrCancellation$10.n = 1;
                    return awaitPointerEventScope0.k0(v4, dragGestureDetectorKt$awaitLongPressOrCancellation$20, dragGestureDetectorKt$awaitLongPressOrCancellation$10) == object1 ? object1 : null;
                }
                catch(PointerEventTimeoutCancellationException unused_ex) {
                    l0$h2 = l0$h0;
                    goto label_49;
                }
                return object1;
            }
            case 1: {
                l0$h2 = (h)dragGestureDetectorKt$awaitLongPressOrCancellation$10.l;
                pointerInputChange0 = (PointerInputChange)dragGestureDetectorKt$awaitLongPressOrCancellation$10.k;
                try {
                    f0.n(object0);
                    return null;
                }
                catch(PointerEventTimeoutCancellationException unused_ex) {
                }
            label_49:
                PointerInputChange pointerInputChange1 = (PointerInputChange)l0$h2.a;
                return pointerInputChange1 == null ? pointerInputChange0 : pointerInputChange1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @m
    public static final Object h(@l AwaitPointerEventScope awaitPointerEventScope0, long v, int v1, @l PointerDirectionConfig pointerDirectionConfig0, boolean z, @l o o0, @l d d0) {
        PointerDirectionConfig pointerDirectionConfig4;
        AwaitPointerEventScope awaitPointerEventScope4;
        long v9;
        float f13;
        float f12;
        Object object4;
        boolean z4;
        Object object3;
        PointerInputChange pointerInputChange0;
        float f8;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitPointerSlopOrCancellation.1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
        float f7;
        g l0$g3;
        boolean z2;
        o o1;
        boolean z1;
        float f3;
        float f2;
        g l0$g1;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitPointerSlopOrCancellation.1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$11;
        float f1;
        PointerDirectionConfig pointerDirectionConfig1;
        AwaitPointerEventScope awaitPointerEventScope1;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitPointerSlopOrCancellation.1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitPointerSlopOrCancellation.1) {
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$10 = (androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitPointerSlopOrCancellation.1)d0;
            int v2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.u;
            if((v2 & 0x80000000) == 0) {
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    Object o;
                    boolean p;
                    float q;
                    float r;
                    float s;
                    Object t;
                    int u;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.t = object0;
                        this.u |= 0x80000000;
                        return DragGestureDetectorKt.h(null, 0L, 0, null, false, null, this);
                    }
                };
            }
            else {
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.u = v2 ^ 0x80000000;
            }
        }
        else {
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                boolean p;
                float q;
                float r;
                float s;
                Object t;
                int u;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.t = object0;
                    this.u |= 0x80000000;
                    return DragGestureDetectorKt.h(null, 0L, 0, null, false, null, this);
                }
            };
        }
        Object object0 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.t;
        Object object1 = b.l();
        switch(dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.u) {
            case 0: {
                f0.n(object0);
                if(DragGestureDetectorKt.C(awaitPointerEventScope0.m1(), v)) {
                    return null;
                }
                float f = DragGestureDetectorKt.D(awaitPointerEventScope0.getViewConfiguration(), v1);
                g l0$g0 = new g();
                l0$g0.a = v;
                awaitPointerEventScope1 = awaitPointerEventScope0;
                pointerDirectionConfig1 = pointerDirectionConfig0;
                f1 = f;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$11 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$10;
                l0$g1 = l0$g0;
                f2 = 0.0f;
                f3 = 0.0f;
                z1 = z;
                o1 = o0;
                goto label_71;
            }
            case 1: {
                float f4 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.s;
                float f5 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.r;
                float f6 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.q;
                z2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.p;
                g l0$g2 = (g)dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.n;
                o o2 = (o)dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.m;
                PointerDirectionConfig pointerDirectionConfig2 = (PointerDirectionConfig)dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.l;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope)dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.k;
                f0.n(object0);
                f2 = f4;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                l0$g3 = l0$g2;
                f7 = f5;
                pointerDirectionConfig1 = pointerDirectionConfig2;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$10;
                o1 = o2;
                f8 = f6;
                goto label_90;
            }
            case 2: {
                float f9 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.s;
                float f10 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.r;
                float f11 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.q;
                boolean z3 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.p;
                pointerInputChange0 = (PointerInputChange)dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.o;
                g l0$g4 = (g)dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.n;
                o o3 = (o)dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.m;
                PointerDirectionConfig pointerDirectionConfig3 = (PointerDirectionConfig)dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.l;
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope)dragGestureDetectorKt$awaitPointerSlopOrCancellation$10.k;
                f0.n(object0);
                z1 = z3;
                f3 = f10;
                pointerDirectionConfig1 = pointerDirectionConfig3;
                l0$g3 = l0$g4;
                f8 = f11;
                f2 = f9;
                awaitPointerEventScope1 = awaitPointerEventScope3;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$10;
                o1 = o3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            if(pointerInputChange0.A()) {
                return null;
            }
            while(true) {
                f1 = f8;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$11 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
                l0$g1 = l0$g3;
            label_71:
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$11.k = awaitPointerEventScope1;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$11.l = pointerDirectionConfig1;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$11.m = o1;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$11.n = l0$g1;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$11.o = null;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$11.p = z1;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$11.q = f1;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$11.r = f3;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$11.s = f2;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$11.u = 1;
                Object object2 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope1, null, dragGestureDetectorKt$awaitPointerSlopOrCancellation$11, 1, null);
                if(object2 == object1) {
                    return object1;
                }
                z2 = z1;
                object0 = object2;
                l0$g3 = l0$g1;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$11;
                f8 = f1;
                f7 = f3;
            label_90:
                List list0 = ((PointerEvent)object0).e();
                int v3 = list0.size();
                int v4 = 0;
                while(true) {
                    if(v4 < v3) {
                        object3 = list0.get(v4);
                        z4 = z2;
                        if(PointerId.d(((PointerInputChange)object3).p(), l0$g3.a)) {
                            break;
                        }
                        else {
                            ++v4;
                            z2 = z4;
                            continue;
                        }
                    }
                    z4 = z2;
                    object3 = null;
                    break;
                }
                if(((PointerInputChange)object3) == null) {
                    return null;
                }
                if(((PointerInputChange)object3).A()) {
                    return null;
                }
                if(!PointerEventKt.e(((PointerInputChange)object3))) {
                    break;
                }
                List list1 = ((PointerEvent)object0).e();
                int v5 = list1.size();
                int v6 = 0;
                while(true) {
                    object4 = null;
                    if(v6 < v5) {
                        Object object5 = list1.get(v6);
                        if(((PointerInputChange)object5).r()) {
                            object4 = object5;
                        }
                        else {
                            ++v6;
                            continue;
                        }
                    }
                    break;
                }
                if(((PointerInputChange)object4) == null) {
                    return null;
                }
                l0$g3.a = ((PointerInputChange)object4).p();
                z1 = z4;
                f3 = f7;
            }
            long v7 = ((PointerInputChange)object3).q();
            long v8 = ((PointerInputChange)object3).u();
            f12 = pointerDirectionConfig1.a(v7) - pointerDirectionConfig1.a(v8) + f7;
            f2 += pointerDirectionConfig1.c(v7) - pointerDirectionConfig1.c(v8);
            f13 = z4 ? Math.abs(f12) : Offset.m(pointerDirectionConfig1.b(f12, f2));
            if(f13 >= f8) {
                break;
            }
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.k = awaitPointerEventScope1;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.l = pointerDirectionConfig1;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.m = o1;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.n = l0$g3;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.o = (PointerInputChange)object3;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.p = z4;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.q = f8;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.r = f12;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.s = f2;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.u = 2;
            if(awaitPointerEventScope1.l1(PointerEventPass.c, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12) == object1) {
                return object1;
            }
            pointerInputChange0 = (PointerInputChange)object3;
            f3 = f12;
            z1 = z4;
        }
        if(z4) {
            v9 = pointerDirectionConfig1.b(f12 - Math.signum(f12) * f8, f2);
            awaitPointerEventScope4 = awaitPointerEventScope1;
            pointerDirectionConfig4 = pointerDirectionConfig1;
        }
        else {
            long v10 = pointerDirectionConfig1.b(f12, f2);
            awaitPointerEventScope4 = awaitPointerEventScope1;
            pointerDirectionConfig4 = pointerDirectionConfig1;
            v9 = Offset.u(v10, Offset.x(Offset.j(v10, f13), f8));
        }
        o1.invoke(((PointerInputChange)object3), Offset.d(v9));
        if(!((PointerInputChange)object3).A()) {
            awaitPointerEventScope1 = awaitPointerEventScope4;
            pointerDirectionConfig1 = pointerDirectionConfig4;
            z1 = z4;
            f1 = f8;
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$11 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
            l0$g1 = l0$g3;
            f2 = 0.0f;
            f3 = 0.0f;
            goto label_71;
        }
        return (PointerInputChange)object3;
    }

    private static final Object i(AwaitPointerEventScope awaitPointerEventScope0, long v, int v1, PointerDirectionConfig pointerDirectionConfig0, boolean z, o o0, d d0) {
        long v8;
        Object object1;
        float f3;
        Object object0;
        if(DragGestureDetectorKt.C(awaitPointerEventScope0.m1(), v)) {
            return null;
        }
        float f = DragGestureDetectorKt.D(awaitPointerEventScope0.getViewConfiguration(), v1);
        g l0$g0 = new g();
        l0$g0.a = v;
        float f1 = 0.0f;
        float f2 = 0.0f;
        while(true) {
            PointerEvent pointerEvent0 = (PointerEvent)androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope0, null, d0, 1, null);
            List list0 = pointerEvent0.e();
            int v2 = list0.size();
            int v3 = 0;
            while(true) {
                if(v3 < v2) {
                    object0 = list0.get(v3);
                    f3 = f1;
                    if(PointerId.d(((PointerInputChange)object0).p(), l0$g0.a)) {
                        break;
                    }
                    else {
                        ++v3;
                        f1 = f3;
                        continue;
                    }
                }
                f3 = f1;
                object0 = null;
                break;
            }
            if(((PointerInputChange)object0) == null || ((PointerInputChange)object0).A()) {
                return null;
            }
            if(PointerEventKt.e(((PointerInputChange)object0))) {
                List list1 = pointerEvent0.e();
                int v4 = list1.size();
                int v5 = 0;
                while(true) {
                    object1 = null;
                    if(v5 < v4) {
                        Object object2 = list1.get(v5);
                        if(((PointerInputChange)object2).r()) {
                            object1 = object2;
                        }
                        else {
                            ++v5;
                            continue;
                        }
                    }
                    break;
                }
                if(((PointerInputChange)object1) == null) {
                    return null;
                }
                l0$g0.a = ((PointerInputChange)object1).p();
            }
            else {
                long v6 = ((PointerInputChange)object0).q();
                long v7 = ((PointerInputChange)object0).u();
                float f4 = f3 + (pointerDirectionConfig0.a(v6) - pointerDirectionConfig0.a(v7));
                f2 += pointerDirectionConfig0.c(v6) - pointerDirectionConfig0.c(v7);
                float f5 = z ? Math.abs(f4) : Offset.m(pointerDirectionConfig0.b(f4, f2));
                if(f5 < f) {
                    awaitPointerEventScope0.l1(PointerEventPass.c, d0);
                    if(((PointerInputChange)object0).A()) {
                        return null;
                    }
                    f3 = f4;
                }
                else {
                    if(z) {
                        v8 = pointerDirectionConfig0.b(f4 - Math.signum(f4) * f, f2);
                    }
                    else {
                        long v9 = pointerDirectionConfig0.b(f4, f2);
                        v8 = Offset.u(v9, Offset.x(Offset.j(v9, f5), f));
                    }
                    o0.invoke(((PointerInputChange)object0), Offset.d(v8));
                    if(((PointerInputChange)object0).A()) {
                        return (PointerInputChange)object0;
                    }
                    f2 = 0.0f;
                    f3 = 0.0f;
                }
            }
            f1 = f3;
        }
    }

    public static Object j(AwaitPointerEventScope awaitPointerEventScope0, long v, int v1, PointerDirectionConfig pointerDirectionConfig0, boolean z, o o0, d d0, int v2, Object object0) {
        long v10;
        float f4;
        Object object2;
        float f3;
        Object object1;
        PointerDirectionConfig pointerDirectionConfig1 = (v2 & 4) == 0 ? pointerDirectionConfig0 : DragGestureDetectorKt.z();
        boolean z1 = (v2 & 8) == 0 ? z : true;
        long v3 = v;
        if(DragGestureDetectorKt.C(awaitPointerEventScope0.m1(), v3)) {
            return null;
        }
        float f = DragGestureDetectorKt.D(awaitPointerEventScope0.getViewConfiguration(), v1);
        do {
            float f1 = 0.0f;
            float f2 = 0.0f;
            while(true) {
                int v4 = 0;
                PointerEvent pointerEvent0 = (PointerEvent)androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope0, null, d0, 1, null);
                List list0 = pointerEvent0.e();
                int v5 = list0.size();
                int v6 = 0;
                while(true) {
                    if(v6 < v5) {
                        object1 = list0.get(v6);
                        f3 = f;
                        if(PointerId.d(((PointerInputChange)object1).p(), v3)) {
                            break;
                        }
                        else {
                            ++v6;
                            f = f3;
                            continue;
                        }
                    }
                    f3 = f;
                    object1 = null;
                    break;
                }
                if(((PointerInputChange)object1) == null || ((PointerInputChange)object1).A()) {
                    return null;
                }
                if(PointerEventKt.e(((PointerInputChange)object1))) {
                    List list1 = pointerEvent0.e();
                    int v7 = list1.size();
                    while(true) {
                        object2 = null;
                        if(v4 < v7) {
                            Object object3 = list1.get(v4);
                            if(((PointerInputChange)object3).r()) {
                                object2 = object3;
                            }
                            else {
                                ++v4;
                                continue;
                            }
                        }
                        break;
                    }
                    if(((PointerInputChange)object2) == null) {
                        return null;
                    }
                    v3 = ((PointerInputChange)object2).p();
                }
                else {
                    long v8 = ((PointerInputChange)object1).q();
                    long v9 = ((PointerInputChange)object1).u();
                    f1 += pointerDirectionConfig1.a(v8) - pointerDirectionConfig1.a(v9);
                    f2 += pointerDirectionConfig1.c(v8) - pointerDirectionConfig1.c(v9);
                    f4 = z1 ? Math.abs(f1) : Offset.m(pointerDirectionConfig1.b(f1, f2));
                    if(f4 >= f3) {
                        break;
                    }
                    awaitPointerEventScope0.l1(PointerEventPass.c, d0);
                    if(((PointerInputChange)object1).A()) {
                        return null;
                    }
                }
                f = f3;
            }
            if(z1) {
                v10 = pointerDirectionConfig1.b(f1 - Math.signum(f1) * f3, f2);
                f = f3;
            }
            else {
                long v11 = pointerDirectionConfig1.b(f1, f2);
                f = f3;
                v10 = Offset.u(v11, Offset.x(Offset.j(v11, f4), f));
            }
            o0.invoke(((PointerInputChange)object1), Offset.d(v10));
        }
        while(!((PointerInputChange)object1).A());
        return (PointerInputChange)object1;
    }

    @m
    public static final Object k(@l AwaitPointerEventScope awaitPointerEventScope0, long v, @l o o0, @l d d0) {
        long v12;
        Object object4;
        float f12;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitTouchSlopOrCancellation.1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
        Object object3;
        g l0$g3;
        PointerInputChange pointerInputChange0;
        float f9;
        int v4;
        float f8;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitTouchSlopOrCancellation.1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
        float f7;
        PointerDirectionConfig pointerDirectionConfig2;
        float f3;
        float f2;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitTouchSlopOrCancellation.1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$11;
        float f1;
        int v2;
        g l0$g1;
        PointerDirectionConfig pointerDirectionConfig1;
        o o1;
        AwaitPointerEventScope awaitPointerEventScope1;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitTouchSlopOrCancellation.1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitTouchSlopOrCancellation.1) {
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$10 = (androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitTouchSlopOrCancellation.1)d0;
            int v1 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.u;
            if((v1 & 0x80000000) == 0) {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    Object o;
                    int p;
                    float q;
                    float r;
                    float s;
                    Object t;
                    int u;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.t = object0;
                        this.u |= 0x80000000;
                        return DragGestureDetectorKt.k(null, 0L, null, this);
                    }
                };
            }
            else {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.u = v1 ^ 0x80000000;
            }
        }
        else {
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                int p;
                float q;
                float r;
                float s;
                Object t;
                int u;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.t = object0;
                    this.u |= 0x80000000;
                    return DragGestureDetectorKt.k(null, 0L, null, this);
                }
            };
        }
        Object object0 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.t;
        Object object1 = b.l();
        switch(dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.u) {
            case 0: {
                f0.n(object0);
                PointerDirectionConfig pointerDirectionConfig0 = DragGestureDetectorKt.a;
                if(!DragGestureDetectorKt.C(awaitPointerEventScope0.m1(), v)) {
                    float f = DragGestureDetectorKt.D(awaitPointerEventScope0.getViewConfiguration(), 1);
                    g l0$g0 = new g();
                    l0$g0.a = v;
                    awaitPointerEventScope1 = awaitPointerEventScope0;
                    o1 = o0;
                    pointerDirectionConfig1 = pointerDirectionConfig0;
                    l0$g1 = l0$g0;
                    v2 = 0;
                    f1 = f;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$11 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$10;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    goto label_68;
                }
                return null;
            }
            case 1: {
                float f4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.s;
                float f5 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.r;
                float f6 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.q;
                int v3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.p;
                g l0$g2 = (g)dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.n;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope)dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.m;
                pointerDirectionConfig2 = (PointerDirectionConfig)dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.l;
                o o2 = (o)dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.k;
                f0.n(object0);
                f7 = f4;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                l0$g1 = l0$g2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$10;
                f8 = f5;
                o1 = o2;
                v4 = v3;
                f9 = f6;
                goto label_88;
            }
            case 2: {
                float f10 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.s;
                float f11 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.r;
                f1 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.q;
                int v5 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.p;
                pointerInputChange0 = (PointerInputChange)dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.o;
                l0$g3 = (g)dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.n;
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope)dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.m;
                PointerDirectionConfig pointerDirectionConfig3 = (PointerDirectionConfig)dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.l;
                o o3 = (o)dragGestureDetectorKt$awaitTouchSlopOrCancellation$10.k;
                f0.n(object0);
                f2 = f10;
                awaitPointerEventScope1 = awaitPointerEventScope3;
                v4 = v5;
                pointerDirectionConfig1 = pointerDirectionConfig3;
                f3 = f11;
                o1 = o3;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$11 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$10;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(!pointerInputChange0.A()) {
            l0$g1 = l0$g3;
            v2 = v4;
        label_68:
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.k = o1;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.l = pointerDirectionConfig1;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.m = awaitPointerEventScope1;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.n = l0$g1;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.o = null;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.p = v2;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.q = f1;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.r = f3;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.s = f2;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.u = 1;
            Object object2 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope1, null, dragGestureDetectorKt$awaitTouchSlopOrCancellation$11, 1, null);
            if(object2 == object1) {
                return object1;
            }
            f7 = f2;
            object0 = object2;
            v4 = v2;
            pointerDirectionConfig2 = pointerDirectionConfig1;
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$11;
            f9 = f1;
            f8 = f3;
        label_88:
            List list0 = ((PointerEvent)object0).e();
            int v6 = list0.size();
            int v7 = 0;
            while(true) {
                if(v7 < v6) {
                    object3 = list0.get(v7);
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
                    f12 = f9;
                    if(PointerId.d(((PointerInputChange)object3).p(), l0$g1.a)) {
                        break;
                    }
                    else {
                        ++v7;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                        f9 = f12;
                        continue;
                    }
                }
                f12 = f9;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
                object3 = null;
                break;
            }
            if(((PointerInputChange)object3) == null || ((PointerInputChange)object3).A()) {
                break;
            }
            if(PointerEventKt.e(((PointerInputChange)object3))) {
                List list1 = ((PointerEvent)object0).e();
                int v8 = list1.size();
                int v9 = 0;
                while(true) {
                    object4 = null;
                    if(v9 < v8) {
                        Object object5 = list1.get(v9);
                        if(((PointerInputChange)object5).r()) {
                            object4 = object5;
                        }
                        else {
                            ++v9;
                            continue;
                        }
                    }
                    break;
                }
                if(((PointerInputChange)object4) != null) {
                    l0$g1.a = ((PointerInputChange)object4).p();
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$11 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                    f2 = f7;
                    f3 = f8;
                    pointerDirectionConfig1 = pointerDirectionConfig2;
                    v2 = v4;
                    f1 = f12;
                    goto label_68;
                }
            }
            else {
                long v10 = ((PointerInputChange)object3).q();
                long v11 = ((PointerInputChange)object3).u();
                float f13 = pointerDirectionConfig2.a(v10) - pointerDirectionConfig2.a(v11) + f8;
                float f14 = f7 + (pointerDirectionConfig2.c(v10) - pointerDirectionConfig2.c(v11));
                float f15 = v4 == 0 ? Offset.m(pointerDirectionConfig2.b(f13, f14)) : Math.abs(f13);
                if(f15 < f12) {
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$11 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.k = o1;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.l = pointerDirectionConfig2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.m = awaitPointerEventScope1;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.n = l0$g1;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.o = (PointerInputChange)object3;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.p = v4;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.q = f12;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.r = f13;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.s = f14;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$11.u = 2;
                    if(awaitPointerEventScope1.l1(PointerEventPass.c, dragGestureDetectorKt$awaitTouchSlopOrCancellation$11) == object1) {
                        return object1;
                    }
                    f1 = f12;
                    pointerDirectionConfig1 = pointerDirectionConfig2;
                    l0$g3 = l0$g1;
                    pointerInputChange0 = (PointerInputChange)object3;
                    f3 = f13;
                    f2 = f14;
                    continue;
                }
                else {
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$11 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                    if(v4 == 0) {
                        long v13 = pointerDirectionConfig2.b(f13, f14);
                        v12 = Offset.u(v13, Offset.x(Offset.j(v13, f15), f12));
                    }
                    else {
                        v12 = pointerDirectionConfig2.b(f13 - Math.signum(f13) * f12, f14);
                    }
                    o1.invoke(((PointerInputChange)object3), Offset.d(v12));
                    if(!((PointerInputChange)object3).A()) {
                        f1 = f12;
                        pointerDirectionConfig1 = pointerDirectionConfig2;
                        v2 = v4;
                        f2 = 0.0f;
                        f3 = 0.0f;
                        goto label_68;
                    }
                    return (PointerInputChange)object3;
                }
            }
            break;
        }
        return null;
    }

    @m
    public static final Object l(@l AwaitPointerEventScope awaitPointerEventScope0, long v, @l d d0) {
        Object object4;
        Object object2;
        g l0$g2;
        AwaitPointerEventScope awaitPointerEventScope1;
        g l0$g0;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitVerticalDragOrCancellation.1 dragGestureDetectorKt$awaitVerticalDragOrCancellation$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitVerticalDragOrCancellation.1) {
            dragGestureDetectorKt$awaitVerticalDragOrCancellation$10 = (androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitVerticalDragOrCancellation.1)d0;
            int v1 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$10.n;
            if((v1 & 0x80000000) == 0) {
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.n |= 0x80000000;
                        return DragGestureDetectorKt.l(null, 0L, this);
                    }
                };
            }
            else {
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$10.n = v1 ^ 0x80000000;
            }
        }
        else {
            dragGestureDetectorKt$awaitVerticalDragOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.n |= 0x80000000;
                    return DragGestureDetectorKt.l(null, 0L, this);
                }
            };
        }
        Object object0 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$10.m;
        Object object1 = b.l();
        switch(dragGestureDetectorKt$awaitVerticalDragOrCancellation$10.n) {
            case 0: {
                f0.n(object0);
                if(DragGestureDetectorKt.C(awaitPointerEventScope0.m1(), v)) {
                    return null;
                }
                l0$g0 = new g();
                l0$g0.a = v;
                awaitPointerEventScope1 = awaitPointerEventScope0;
                goto label_59;
            }
            case 1: {
                g l0$g1 = (g)dragGestureDetectorKt$awaitVerticalDragOrCancellation$10.l;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope)dragGestureDetectorKt$awaitVerticalDragOrCancellation$10.k;
                f0.n(object0);
                l0$g2 = l0$g1;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            List list0 = ((PointerEvent)object0).e();
            int v2 = list0.size();
            int v3 = 0;
            int v4 = 0;
            while(true) {
                object2 = null;
                if(v4 < v2) {
                    Object object3 = list0.get(v4);
                    if(PointerId.d(((PointerInputChange)object3).p(), l0$g2.a)) {
                        object2 = object3;
                    }
                    else {
                        ++v4;
                        continue;
                    }
                }
                break;
            }
            PointerInputChange pointerInputChange0 = (PointerInputChange)object2;
            if(pointerInputChange0 == null) {
                throw new NullPointerException();
            }
            if(PointerEventKt.e(pointerInputChange0)) {
                List list1 = ((PointerEvent)object0).e();
                int v5 = list1.size();
                while(true) {
                    object4 = null;
                    if(v3 < v5) {
                        Object object5 = list1.get(v3);
                        if(((PointerInputChange)object5).r()) {
                            object4 = object5;
                        }
                        else {
                            ++v3;
                            continue;
                        }
                    }
                    break;
                }
                if(((PointerInputChange)object4) != null) {
                    l0$g2.a = ((PointerInputChange)object4).p();
                }
            }
            else if(Offset.r(PointerEventKt.m(pointerInputChange0)) == 0.0f) {
            }
            else {
                return pointerInputChange0 == null || pointerInputChange0.A() ? null : pointerInputChange0;
            }
            l0$g0 = l0$g2;
        label_59:
            dragGestureDetectorKt$awaitVerticalDragOrCancellation$10.k = awaitPointerEventScope1;
            dragGestureDetectorKt$awaitVerticalDragOrCancellation$10.l = l0$g0;
            dragGestureDetectorKt$awaitVerticalDragOrCancellation$10.n = 1;
            Object object6 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope1, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$10, 1, null);
            if(object6 == object1) {
                return object1;
            }
            object0 = object6;
            l0$g2 = l0$g0;
        }
    }

    @m
    public static final Object m(@l AwaitPointerEventScope awaitPointerEventScope0, long v, int v1, @l o o0, @l d d0) {
        long v13;
        Object object4;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitVerticalPointerSlopOrCancellation.1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
        Object object3;
        float f12;
        PointerInputChange pointerInputChange0;
        int v5;
        float f8;
        float f7;
        PointerDirectionConfig pointerDirectionConfig2;
        float f3;
        float f2;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitVerticalPointerSlopOrCancellation.1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11;
        PointerDirectionConfig pointerDirectionConfig1;
        int v3;
        g l0$g1;
        float f1;
        o o1;
        AwaitPointerEventScope awaitPointerEventScope1;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitVerticalPointerSlopOrCancellation.1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitVerticalPointerSlopOrCancellation.1) {
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10 = (androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitVerticalPointerSlopOrCancellation.1)d0;
            int v2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.u;
            if((v2 & 0x80000000) == 0) {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    Object o;
                    int p;
                    float q;
                    float r;
                    float s;
                    Object t;
                    int u;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.t = object0;
                        this.u |= 0x80000000;
                        return DragGestureDetectorKt.m(null, 0L, 0, null, this);
                    }
                };
            }
            else {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.u = v2 ^ 0x80000000;
            }
        }
        else {
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                int p;
                float q;
                float r;
                float s;
                Object t;
                int u;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.t = object0;
                    this.u |= 0x80000000;
                    return DragGestureDetectorKt.m(null, 0L, 0, null, this);
                }
            };
        }
        Object object0 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.t;
        Object object1 = b.l();
        switch(dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.u) {
            case 0: {
                f0.n(object0);
                PointerDirectionConfig pointerDirectionConfig0 = DragGestureDetectorKt.b;
                if(!DragGestureDetectorKt.C(awaitPointerEventScope0.m1(), v)) {
                    float f = DragGestureDetectorKt.D(awaitPointerEventScope0.getViewConfiguration(), v1);
                    g l0$g0 = new g();
                    l0$g0.a = v;
                    awaitPointerEventScope1 = awaitPointerEventScope0;
                    o1 = o0;
                    f1 = f;
                    l0$g1 = l0$g0;
                    v3 = 1;
                    pointerDirectionConfig1 = pointerDirectionConfig0;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    goto label_68;
                }
                return null;
            }
            case 1: {
                float f4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.s;
                float f5 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.r;
                float f6 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.q;
                int v4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.p;
                g l0$g2 = (g)dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.n;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope)dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.m;
                pointerDirectionConfig2 = (PointerDirectionConfig)dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.l;
                o o2 = (o)dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.k;
                f0.n(object0);
                f7 = f4;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                l0$g1 = l0$g2;
                f1 = f6;
                f8 = f5;
                o1 = o2;
                v5 = v4;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10;
                goto label_86;
            }
            case 2: {
                float f9 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.s;
                float f10 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.r;
                float f11 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.q;
                int v6 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.p;
                pointerInputChange0 = (PointerInputChange)dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.o;
                l0$g1 = (g)dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.n;
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope)dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.m;
                PointerDirectionConfig pointerDirectionConfig3 = (PointerDirectionConfig)dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.l;
                o o3 = (o)dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10.k;
                f0.n(object0);
                f2 = f9;
                f12 = f11;
                awaitPointerEventScope1 = awaitPointerEventScope3;
                pointerDirectionConfig1 = pointerDirectionConfig3;
                v3 = v6;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$10;
                f3 = f10;
                o1 = o3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(!pointerInputChange0.A()) {
            f1 = f12;
        label_68:
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.k = o1;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.l = pointerDirectionConfig1;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.m = awaitPointerEventScope1;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.n = l0$g1;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.o = null;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.p = v3;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.q = f1;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.r = f3;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.s = f2;
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.u = 1;
            Object object2 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope1, null, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11, 1, null);
            if(object2 == object1) {
                return object1;
            }
            f7 = f2;
            object0 = object2;
            v5 = v3;
            pointerDirectionConfig2 = pointerDirectionConfig1;
            f8 = f3;
        label_86:
            List list0 = ((PointerEvent)object0).e();
            int v7 = list0.size();
            int v8 = 0;
            while(true) {
                if(v8 < v7) {
                    object3 = list0.get(v8);
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11;
                    if(PointerId.d(((PointerInputChange)object3).p(), l0$g1.a)) {
                        break;
                    }
                    else {
                        ++v8;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                        continue;
                    }
                }
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11;
                object3 = null;
                break;
            }
            if(((PointerInputChange)object3) == null || ((PointerInputChange)object3).A()) {
                break;
            }
            if(PointerEventKt.e(((PointerInputChange)object3))) {
                List list1 = ((PointerEvent)object0).e();
                int v9 = list1.size();
                int v10 = 0;
                while(true) {
                    object4 = null;
                    if(v10 < v9) {
                        Object object5 = list1.get(v10);
                        if(((PointerInputChange)object5).r()) {
                            object4 = object5;
                        }
                        else {
                            ++v10;
                            continue;
                        }
                    }
                    break;
                }
                if(((PointerInputChange)object4) != null) {
                    l0$g1.a = ((PointerInputChange)object4).p();
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                    f2 = f7;
                    f3 = f8;
                    pointerDirectionConfig1 = pointerDirectionConfig2;
                    v3 = v5;
                    goto label_68;
                }
            }
            else {
                long v11 = ((PointerInputChange)object3).q();
                long v12 = ((PointerInputChange)object3).u();
                float f13 = pointerDirectionConfig2.a(v11) - pointerDirectionConfig2.a(v12) + f8;
                float f14 = f7 + (pointerDirectionConfig2.c(v11) - pointerDirectionConfig2.c(v12));
                float f15 = v5 == 0 ? Offset.m(pointerDirectionConfig2.b(f13, f14)) : Math.abs(f13);
                if(f15 < f1) {
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.k = o1;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.l = pointerDirectionConfig2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.m = awaitPointerEventScope1;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.n = l0$g1;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.o = (PointerInputChange)object3;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.p = v5;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.q = f1;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.r = f13;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.s = f14;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11.u = 2;
                    if(awaitPointerEventScope1.l1(PointerEventPass.c, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11) == object1) {
                        return object1;
                    }
                    pointerDirectionConfig1 = pointerDirectionConfig2;
                    v3 = v5;
                    f3 = f13;
                    f2 = f14;
                    pointerInputChange0 = (PointerInputChange)object3;
                    f12 = f1;
                    continue;
                }
                else {
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$11 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                    if(v5 == 0) {
                        long v14 = pointerDirectionConfig2.b(f13, f14);
                        v13 = Offset.u(v14, Offset.x(Offset.j(v14, f15), f1));
                    }
                    else {
                        v13 = pointerDirectionConfig2.b(f13 - Math.signum(f13) * f1, f14);
                    }
                    o1.invoke(((PointerInputChange)object3), kotlin.coroutines.jvm.internal.b.e(Offset.r(v13)));
                    if(!((PointerInputChange)object3).A()) {
                        pointerDirectionConfig1 = pointerDirectionConfig2;
                        v3 = v5;
                        f2 = 0.0f;
                        f3 = 0.0f;
                        goto label_68;
                    }
                    return (PointerInputChange)object3;
                }
            }
            break;
        }
        return null;
    }

    @m
    public static final Object n(@l AwaitPointerEventScope awaitPointerEventScope0, long v, @l o o0, @l d d0) {
        long v12;
        Object object4;
        float f12;
        Object object3;
        PointerInputChange pointerInputChange0;
        float f9;
        int v4;
        float f8;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitVerticalTouchSlopOrCancellation.1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
        float f7;
        PointerDirectionConfig pointerDirectionConfig2;
        float f3;
        float f2;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitVerticalTouchSlopOrCancellation.1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11;
        float f1;
        int v2;
        g l0$g1;
        PointerDirectionConfig pointerDirectionConfig1;
        o o1;
        AwaitPointerEventScope awaitPointerEventScope1;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitVerticalTouchSlopOrCancellation.1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitVerticalTouchSlopOrCancellation.1) {
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10 = (androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitVerticalTouchSlopOrCancellation.1)d0;
            int v1 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.u;
            if((v1 & 0x80000000) == 0) {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    Object o;
                    int p;
                    float q;
                    float r;
                    float s;
                    Object t;
                    int u;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.t = object0;
                        this.u |= 0x80000000;
                        return DragGestureDetectorKt.n(null, 0L, null, this);
                    }
                };
            }
            else {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.u = v1 ^ 0x80000000;
            }
        }
        else {
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                int p;
                float q;
                float r;
                float s;
                Object t;
                int u;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.t = object0;
                    this.u |= 0x80000000;
                    return DragGestureDetectorKt.n(null, 0L, null, this);
                }
            };
        }
        Object object0 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.t;
        Object object1 = b.l();
        switch(dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.u) {
            case 0: {
                f0.n(object0);
                PointerDirectionConfig pointerDirectionConfig0 = DragGestureDetectorKt.b;
                if(!DragGestureDetectorKt.C(awaitPointerEventScope0.m1(), v)) {
                    float f = DragGestureDetectorKt.D(awaitPointerEventScope0.getViewConfiguration(), 1);
                    g l0$g0 = new g();
                    l0$g0.a = v;
                    awaitPointerEventScope1 = awaitPointerEventScope0;
                    o1 = o0;
                    pointerDirectionConfig1 = pointerDirectionConfig0;
                    l0$g1 = l0$g0;
                    v2 = 1;
                    f1 = f;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    goto label_68;
                }
                return null;
            }
            case 1: {
                float f4 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.s;
                float f5 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.r;
                float f6 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.q;
                int v3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.p;
                g l0$g2 = (g)dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.n;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope)dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.m;
                pointerDirectionConfig2 = (PointerDirectionConfig)dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.l;
                o o2 = (o)dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.k;
                f0.n(object0);
                f7 = f4;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                l0$g1 = l0$g2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10;
                f8 = f5;
                o1 = o2;
                v4 = v3;
                f9 = f6;
                goto label_88;
            }
            case 2: {
                float f10 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.s;
                float f11 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.r;
                f1 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.q;
                int v5 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.p;
                pointerInputChange0 = (PointerInputChange)dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.o;
                l0$g1 = (g)dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.n;
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope)dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.m;
                PointerDirectionConfig pointerDirectionConfig3 = (PointerDirectionConfig)dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.l;
                o o3 = (o)dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10.k;
                f0.n(object0);
                f2 = f10;
                awaitPointerEventScope1 = awaitPointerEventScope3;
                pointerDirectionConfig2 = pointerDirectionConfig3;
                v4 = v5;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$10;
                f3 = f11;
                o1 = o3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(!pointerInputChange0.A()) {
            pointerDirectionConfig1 = pointerDirectionConfig2;
            v2 = v4;
        label_68:
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11.k = o1;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11.l = pointerDirectionConfig1;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11.m = awaitPointerEventScope1;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11.n = l0$g1;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11.o = null;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11.p = v2;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11.q = f1;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11.r = f3;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11.s = f2;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11.u = 1;
            Object object2 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope1, null, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11, 1, null);
            if(object2 == object1) {
                return object1;
            }
            f7 = f2;
            object0 = object2;
            v4 = v2;
            pointerDirectionConfig2 = pointerDirectionConfig1;
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11;
            f9 = f1;
            f8 = f3;
        label_88:
            List list0 = ((PointerEvent)object0).e();
            int v6 = list0.size();
            int v7 = 0;
            while(true) {
                if(v7 < v6) {
                    object3 = list0.get(v7);
                    f12 = f9;
                    if(PointerId.d(((PointerInputChange)object3).p(), l0$g1.a)) {
                        break;
                    }
                    else {
                        ++v7;
                        f9 = f12;
                        continue;
                    }
                }
                f12 = f9;
                object3 = null;
                break;
            }
            if(((PointerInputChange)object3) == null || ((PointerInputChange)object3).A()) {
                break;
            }
            if(PointerEventKt.e(((PointerInputChange)object3))) {
                List list1 = ((PointerEvent)object0).e();
                int v8 = list1.size();
                int v9 = 0;
                while(true) {
                    object4 = null;
                    if(v9 < v8) {
                        Object object5 = list1.get(v9);
                        if(((PointerInputChange)object5).r()) {
                            object4 = object5;
                        }
                        else {
                            ++v9;
                            continue;
                        }
                    }
                    break;
                }
                if(((PointerInputChange)object4) != null) {
                    l0$g1.a = ((PointerInputChange)object4).p();
                    f2 = f7;
                    f3 = f8;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
                    pointerDirectionConfig1 = pointerDirectionConfig2;
                    v2 = v4;
                    f1 = f12;
                    goto label_68;
                }
            }
            else {
                long v10 = ((PointerInputChange)object3).q();
                long v11 = ((PointerInputChange)object3).u();
                float f13 = pointerDirectionConfig2.a(v10) - pointerDirectionConfig2.a(v11) + f8;
                float f14 = f7 + (pointerDirectionConfig2.c(v10) - pointerDirectionConfig2.c(v11));
                float f15 = v4 == 0 ? Offset.m(pointerDirectionConfig2.b(f13, f14)) : Math.abs(f13);
                if(f15 < f12) {
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.k = o1;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.l = pointerDirectionConfig2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.m = awaitPointerEventScope1;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.n = l0$g1;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.o = (PointerInputChange)object3;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.p = v4;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.q = f12;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.r = f13;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.s = f14;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.u = 2;
                    if(awaitPointerEventScope1.l1(PointerEventPass.c, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12) == object1) {
                        return object1;
                    }
                    f1 = f12;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
                    pointerInputChange0 = (PointerInputChange)object3;
                    f3 = f13;
                    f2 = f14;
                    continue;
                }
                else {
                    if(v4 == 0) {
                        long v13 = pointerDirectionConfig2.b(f13, f14);
                        v12 = Offset.u(v13, Offset.x(Offset.j(v13, f15), f12));
                    }
                    else {
                        v12 = pointerDirectionConfig2.b(f13 - Math.signum(f13) * f12, f14);
                    }
                    o1.invoke(((PointerInputChange)object3), kotlin.coroutines.jvm.internal.b.e(Offset.r(v12)));
                    if(!((PointerInputChange)object3).A()) {
                        f1 = f12;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$11 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
                        pointerDirectionConfig1 = pointerDirectionConfig2;
                        v2 = v4;
                        f2 = 0.0f;
                        f3 = 0.0f;
                        goto label_68;
                    }
                    return (PointerInputChange)object3;
                }
            }
            break;
        }
        return null;
    }

    @m
    public static final Object o(@l PointerInputScope pointerInputScope0, @l Function1 function10, @l a a0, @l a a1, @l o o0, @l d d0) {
        Object object0 = ForEachGestureKt.d(pointerInputScope0, new o(function10, o0, a1, a0, null) {
            final a A;
            Object l;
            Object m;
            Object n;
            Object o;
            Object p;
            Object q;
            int r;
            float s;
            float t;
            float u;
            int v;
            private Object w;
            final Function1 x;
            final o y;
            final a z;

            {
                this.x = function10;
                this.y = o0;
                this.z = a0;
                this.A = a1;
                super(2, d0);
            }

            @m
            public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.5)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.5(this.x, this.y, this.z, this.A, d0);
                d1.w = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((AwaitPointerEventScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                PointerInputChange pointerInputChange5;
                long v11;
                Object object8;
                AwaitPointerEventScope awaitPointerEventScope6;
                AwaitPointerEventScope awaitPointerEventScope5;
                Object object7;
                PointerInputChange pointerInputChange4;
                Object object6;
                Object object2;
                float f5;
                int v1;
                g l0$g3;
                float f4;
                g l0$g2;
                AwaitPointerEventScope awaitPointerEventScope2;
                PointerInputChange pointerInputChange2;
                float f3;
                Object object3;
                AwaitPointerEventScope awaitPointerEventScope1;
                PointerDirectionConfig pointerDirectionConfig0;
                PointerInputChange pointerInputChange0;
                float f9;
                Object object4;
                PointerDirectionConfig pointerDirectionConfig1;
                Object object5;
                g l0$g6;
                Object object1 = b.l();
                switch(this.v) {
                    case 0: {
                        f0.n(object0);
                        awaitPointerEventScope2 = (AwaitPointerEventScope)this.w;
                        this.w = awaitPointerEventScope2;
                        this.v = 1;
                        object5 = TapGestureDetectorKt.f(awaitPointerEventScope2, false, null, this, 2, null);
                        if(object5 == object1) {
                            return object1;
                        }
                        pointerInputChange2 = (PointerInputChange)object5;
                        l0$g6 = new g();
                        l0$g6.a = 0L;
                        break;
                    }
                    case 1: {
                        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope)this.w;
                        f0.n(object0);
                        awaitPointerEventScope2 = awaitPointerEventScope4;
                        object5 = object0;
                        pointerInputChange2 = (PointerInputChange)object5;
                        l0$g6 = new g();
                        l0$g6.a = 0L;
                        break;
                    }
                    case 2: {
                        float f6 = this.u;
                        float f7 = this.t;
                        float f8 = this.s;
                        int v2 = this.r;
                        g l0$g4 = (g)this.p;
                        pointerDirectionConfig1 = (PointerDirectionConfig)this.o;
                        awaitPointerEventScope2 = (AwaitPointerEventScope)this.n;
                        g l0$g5 = (g)this.m;
                        PointerInputChange pointerInputChange3 = (PointerInputChange)this.l;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope)this.w;
                        f0.n(object0);
                        object4 = object0;
                        f3 = f6;
                        pointerInputChange2 = pointerInputChange3;
                        l0$g2 = l0$g4;
                        f9 = f8;
                        l0$g3 = l0$g5;
                        awaitPointerEventScope1 = awaitPointerEventScope3;
                        v1 = v2;
                        f5 = f7;
                        goto label_95;
                    }
                    case 3: {
                        float f = this.u;
                        float f1 = this.t;
                        float f2 = this.s;
                        int v = this.r;
                        pointerInputChange0 = (PointerInputChange)this.q;
                        g l0$g0 = (g)this.p;
                        pointerDirectionConfig0 = (PointerDirectionConfig)this.o;
                        AwaitPointerEventScope awaitPointerEventScope0 = (AwaitPointerEventScope)this.n;
                        g l0$g1 = (g)this.m;
                        PointerInputChange pointerInputChange1 = (PointerInputChange)this.l;
                        awaitPointerEventScope1 = (AwaitPointerEventScope)this.w;
                        f0.n(object0);
                        object3 = object1;
                        f3 = f;
                        pointerInputChange2 = pointerInputChange1;
                        awaitPointerEventScope2 = awaitPointerEventScope0;
                        l0$g2 = l0$g0;
                        f4 = f2;
                        l0$g3 = l0$g1;
                        v1 = v;
                        f5 = f1;
                        goto label_162;
                    }
                    case 4: {
                        f0.n(object0);
                        object2 = object0;
                        goto label_218;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    long v3 = pointerInputChange2.p();
                    int v4 = pointerInputChange2.y();
                    pointerDirectionConfig1 = DragGestureDetectorKt.z();
                    if(DragGestureDetectorKt.C(awaitPointerEventScope2.m1(), v3)) {
                        object6 = object1;
                    }
                    else {
                        f9 = DragGestureDetectorKt.D(awaitPointerEventScope2.getViewConfiguration(), v4);
                        g l0$g7 = new g();
                        l0$g7.a = v3;
                        l0$g3 = l0$g6;
                        l0$g2 = l0$g7;
                        f3 = 0.0f;
                        f5 = 0.0f;
                        v1 = 0;
                        awaitPointerEventScope1 = awaitPointerEventScope2;
                        while(true) {
                            this.w = awaitPointerEventScope1;
                            this.l = pointerInputChange2;
                            this.m = l0$g3;
                            this.n = awaitPointerEventScope2;
                            this.o = pointerDirectionConfig1;
                            this.p = l0$g2;
                            this.q = null;
                            this.r = v1;
                            this.s = f9;
                            this.t = f5;
                            this.u = f3;
                            this.v = 2;
                            object4 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope2, null, this, 1, null);
                            if(object4 == object1) {
                                return object1;
                            }
                        label_95:
                            List list0 = ((PointerEvent)object4).e();
                            int v5 = list0.size();
                            int v6 = 0;
                            while(true) {
                                if(v6 < v5) {
                                    object7 = list0.get(v6);
                                    object6 = object1;
                                    awaitPointerEventScope5 = awaitPointerEventScope2;
                                    awaitPointerEventScope6 = awaitPointerEventScope1;
                                    if(PointerId.d(((PointerInputChange)object7).p(), l0$g2.a)) {
                                        break;
                                    }
                                    else {
                                        ++v6;
                                        awaitPointerEventScope2 = awaitPointerEventScope5;
                                        awaitPointerEventScope1 = awaitPointerEventScope6;
                                        object1 = object6;
                                        continue;
                                    }
                                }
                                object6 = object1;
                                awaitPointerEventScope5 = awaitPointerEventScope2;
                                awaitPointerEventScope6 = awaitPointerEventScope1;
                                object7 = null;
                                break;
                            }
                            pointerInputChange4 = (PointerInputChange)object7;
                            if(pointerInputChange4 != null) {
                                if(pointerInputChange4.A()) {
                                    break;
                                }
                                else if(PointerEventKt.e(pointerInputChange4)) {
                                    List list1 = ((PointerEvent)object4).e();
                                    int v7 = list1.size();
                                    int v8 = 0;
                                    while(true) {
                                        object8 = null;
                                        if(v8 < v7) {
                                            Object object9 = list1.get(v8);
                                            if(((PointerInputChange)object9).r()) {
                                                object8 = object9;
                                            }
                                            else {
                                                ++v8;
                                                continue;
                                            }
                                        }
                                        break;
                                    }
                                    if(((PointerInputChange)object8) != null) {
                                        l0$g2.a = ((PointerInputChange)object8).p();
                                        awaitPointerEventScope2 = awaitPointerEventScope5;
                                        awaitPointerEventScope1 = awaitPointerEventScope6;
                                        object1 = object6;
                                        continue;
                                    }
                                }
                                else {
                                    long v9 = pointerInputChange4.q();
                                    long v10 = pointerInputChange4.u();
                                    f5 += pointerDirectionConfig1.a(v9) - pointerDirectionConfig1.a(v10);
                                    f3 += pointerDirectionConfig1.c(v9) - pointerDirectionConfig1.c(v10);
                                    float f10 = v1 == 0 ? Offset.m(pointerDirectionConfig1.b(f5, f3)) : Math.abs(f5);
                                    if(f10 < f9) {
                                        awaitPointerEventScope1 = awaitPointerEventScope6;
                                        this.w = awaitPointerEventScope1;
                                        this.l = pointerInputChange2;
                                        this.m = l0$g3;
                                        this.n = awaitPointerEventScope5;
                                        this.o = pointerDirectionConfig1;
                                        this.p = l0$g2;
                                        this.q = pointerInputChange4;
                                        this.r = v1;
                                        this.s = f9;
                                        this.t = f5;
                                        this.u = f3;
                                        this.v = 3;
                                        object3 = object6;
                                        if(awaitPointerEventScope5.l1(PointerEventPass.c, this) == object3) {
                                            return object3;
                                        }
                                        pointerDirectionConfig0 = pointerDirectionConfig1;
                                        awaitPointerEventScope2 = awaitPointerEventScope5;
                                        f4 = f9;
                                        pointerInputChange0 = pointerInputChange4;
                                    label_162:
                                        if(pointerInputChange0.A()) {
                                            l0$g6 = l0$g3;
                                            awaitPointerEventScope2 = awaitPointerEventScope1;
                                            object6 = object3;
                                            goto label_197;
                                        }
                                        else {
                                            f9 = f4;
                                            object1 = object3;
                                            pointerDirectionConfig1 = pointerDirectionConfig0;
                                            continue;
                                        }
                                        goto label_171;
                                    }
                                    else {
                                    label_171:
                                        awaitPointerEventScope1 = awaitPointerEventScope6;
                                        if(v1 == 0) {
                                            long v12 = pointerDirectionConfig1.b(f5, f3);
                                            pointerInputChange5 = pointerInputChange2;
                                            v11 = Offset.u(v12, Offset.x(Offset.j(v12, f10), f9));
                                        }
                                        else {
                                            v11 = pointerDirectionConfig1.b(f5 - Math.signum(f5) * f9, f3);
                                            pointerInputChange5 = pointerInputChange2;
                                        }
                                        pointerInputChange4.a();
                                        l0$g3.a = v11;
                                        if(pointerInputChange4.A()) {
                                            l0$g6 = l0$g3;
                                            pointerInputChange2 = pointerInputChange5;
                                            awaitPointerEventScope2 = awaitPointerEventScope1;
                                            goto label_198;
                                        }
                                        else {
                                            pointerInputChange2 = pointerInputChange5;
                                            awaitPointerEventScope2 = awaitPointerEventScope5;
                                            object1 = object6;
                                            f3 = 0.0f;
                                            f5 = 0.0f;
                                            continue;
                                        }
                                    }
                                }
                            }
                            goto label_195;
                        }
                        l0$g6 = l0$g3;
                        awaitPointerEventScope2 = awaitPointerEventScope6;
                        goto label_197;
                    label_195:
                        l0$g6 = l0$g3;
                        awaitPointerEventScope2 = awaitPointerEventScope6;
                    }
                label_197:
                    pointerInputChange4 = null;
                label_198:
                    if(pointerInputChange4 == null || pointerInputChange4.A()) {
                        break;
                    }
                    object1 = object6;
                }
                if(pointerInputChange4 != null) {
                    Offset offset0 = Offset.d(pointerInputChange4.q());
                    this.x.invoke(offset0);
                    Offset offset1 = Offset.d(l0$g6.a);
                    this.y.invoke(pointerInputChange4, offset1);
                    androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.5.2 dragGestureDetectorKt$detectDragGestures$5$20 = new Function1() {
                        final o e;

                        {
                            this.e = o0;
                            super(1);
                        }

                        public final void a(@l PointerInputChange pointerInputChange0) {
                            L.p(pointerInputChange0, "it");
                            Offset offset0 = Offset.d(PointerEventKt.k(pointerInputChange0));
                            this.e.invoke(pointerInputChange0, offset0);
                            pointerInputChange0.a();
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(((PointerInputChange)object0));
                            return S0.a;
                        }
                    };
                    this.w = null;
                    this.l = null;
                    this.m = null;
                    this.n = null;
                    this.o = null;
                    this.p = null;
                    this.q = null;
                    this.v = 4;
                    object2 = DragGestureDetectorKt.y(awaitPointerEventScope2, pointerInputChange4.p(), dragGestureDetectorKt$detectDragGestures$5$20, this);
                    if(object2 == object6) {
                        return object6;
                    }
                label_218:
                    if(!((Boolean)object2).booleanValue()) {
                        this.z.invoke();
                        return S0.a;
                    }
                    this.A.invoke();
                }
                return S0.a;
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    public static Object p(PointerInputScope pointerInputScope0, Function1 function10, a a0, a a1, o o0, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.2.e;
        }
        if((v & 2) != 0) {
            a0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.3.e;
        }
        if((v & 4) != 0) {
            a1 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.4.e;
        }
        return DragGestureDetectorKt.o(pointerInputScope0, function10, a0, a1, o0, d0);

        final class androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.2 extends N implements Function1 {
            public static final androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.2 e;

            static {
                androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.2.e = new androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.2();
            }

            androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.2() {
                super(1);
            }

            public final void a(long v) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Offset)object0).A());
                return S0.a;
            }
        }


        final class androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.3 extends N implements a {
            public static final androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.3 e;

            static {
                androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.3.e = new androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.3();
            }

            androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.3() {
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return S0.a;
            }

            public final void invoke() {
            }
        }


        final class androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.4 extends N implements a {
            public static final androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.4 e;

            static {
                androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.4.e = new androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.4();
            }

            androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.4() {
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return S0.a;
            }

            public final void invoke() {
            }
        }

    }

    @m
    public static final Object q(@l PointerInputScope pointerInputScope0, @l Function1 function10, @l a a0, @l a a1, @l o o0, @l d d0) {
        Object object0 = ForEachGestureKt.d(pointerInputScope0, new o(function10, a0, a1, o0, null) {
            int l;
            private Object m;
            final Function1 n;
            final a o;
            final a p;
            final o q;

            {
                this.n = function10;
                this.o = a0;
                this.p = a1;
                this.q = o0;
                super(2, d0);
            }

            @m
            public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.5)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.5(this.n, this.o, this.p, this.q, d0);
                d1.m = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((AwaitPointerEventScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                AwaitPointerEventScope awaitPointerEventScope1;
                AwaitPointerEventScope awaitPointerEventScope0;
                Object object1 = b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.m;
                        try {
                            this.m = awaitPointerEventScope0;
                            this.l = 1;
                            object0 = TapGestureDetectorKt.f(awaitPointerEventScope0, false, null, this, 2, null);
                            if(object0 == object1) {
                                return object1;
                            }
                            goto label_12;
                        }
                        catch(CancellationException cancellationException0) {
                            break;
                        }
                    }
                    case 1: {
                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.m;
                        try {
                            f0.n(object0);
                        label_12:
                            this.m = awaitPointerEventScope0;
                            this.l = 2;
                            object0 = DragGestureDetectorKt.g(awaitPointerEventScope0, ((PointerInputChange)object0).p(), this);
                            if(object0 == object1) {
                                return object1;
                            }
                            goto label_19;
                        }
                        catch(CancellationException cancellationException0) {
                            break;
                        }
                    }
                    case 2: {
                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.m;
                        try {
                            f0.n(object0);
                        label_19:
                            if(((PointerInputChange)object0) != null) {
                                Offset offset0 = Offset.d(((PointerInputChange)object0).q());
                                this.n.invoke(offset0);
                                androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.5.1 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5$10 = new Function1() {
                                    final o e;

                                    {
                                        this.e = o0;
                                        super(1);
                                    }

                                    public final void a(@l PointerInputChange pointerInputChange0) {
                                        L.p(pointerInputChange0, "it");
                                        Offset offset0 = Offset.d(PointerEventKt.k(pointerInputChange0));
                                        this.e.invoke(pointerInputChange0, offset0);
                                        pointerInputChange0.a();
                                    }

                                    @Override  // kotlin.jvm.functions.Function1
                                    public Object invoke(Object object0) {
                                        this.a(((PointerInputChange)object0));
                                        return S0.a;
                                    }
                                };
                                this.m = awaitPointerEventScope0;
                                this.l = 3;
                                object0 = DragGestureDetectorKt.y(awaitPointerEventScope0, ((PointerInputChange)object0).p(), dragGestureDetectorKt$detectDragGesturesAfterLongPress$5$10, this);
                                if(object0 == object1) {
                                    return object1;
                                }
                                awaitPointerEventScope1 = awaitPointerEventScope0;
                                goto label_32;
                            }
                            return S0.a;
                        }
                        catch(CancellationException cancellationException0) {
                            break;
                        }
                    }
                    case 3: {
                        awaitPointerEventScope1 = (AwaitPointerEventScope)this.m;
                        try {
                            f0.n(object0);
                        label_32:
                            if(((Boolean)object0).booleanValue()) {
                                List list0 = awaitPointerEventScope1.m1().e();
                                int v = list0.size();
                                for(int v1 = 0; v1 < v; ++v1) {
                                    PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v1);
                                    if(PointerEventKt.d(pointerInputChange0)) {
                                        pointerInputChange0.a();
                                    }
                                }
                                this.o.invoke();
                                return S0.a;
                            }
                            this.p.invoke();
                            return S0.a;
                        }
                        catch(CancellationException cancellationException0) {
                            break;
                        }
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                this.p.invoke();
                throw cancellationException0;
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    public static Object r(PointerInputScope pointerInputScope0, Function1 function10, a a0, a a1, o o0, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.2.e;
        }
        if((v & 2) != 0) {
            a0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.3.e;
        }
        if((v & 4) != 0) {
            a1 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.4.e;
        }
        return DragGestureDetectorKt.q(pointerInputScope0, function10, a0, a1, o0, d0);

        final class androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.2 extends N implements Function1 {
            public static final androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.2 e;

            static {
                androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.2.e = new androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.2();
            }

            androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.2() {
                super(1);
            }

            public final void a(long v) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Offset)object0).A());
                return S0.a;
            }
        }


        final class androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.3 extends N implements a {
            public static final androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.3 e;

            static {
                androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.3.e = new androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.3();
            }

            androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.3() {
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return S0.a;
            }

            public final void invoke() {
            }
        }


        final class androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.4 extends N implements a {
            public static final androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.4 e;

            static {
                androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.4.e = new androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.4();
            }

            androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.4() {
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return S0.a;
            }

            public final void invoke() {
            }
        }

    }

    @m
    public static final Object s(@l PointerInputScope pointerInputScope0, @l Function1 function10, @l a a0, @l a a1, @l o o0, @l d d0) {
        Object object0 = ForEachGestureKt.d(pointerInputScope0, new o(function10, o0, a0, a1, null) {
            Object l;
            int m;
            private Object n;
            final Function1 o;
            final o p;
            final a q;
            final a r;

            {
                this.o = function10;
                this.p = o0;
                this.q = a0;
                this.r = a1;
                super(2, d0);
            }

            @m
            public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.5)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.5(this.o, this.p, this.q, this.r, d0);
                d1.n = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((AwaitPointerEventScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                e l0$e1;
                AwaitPointerEventScope awaitPointerEventScope2;
                AwaitPointerEventScope awaitPointerEventScope1;
                Object object1 = b.l();
                switch(this.m) {
                    case 0: {
                        f0.n(object0);
                        AwaitPointerEventScope awaitPointerEventScope0 = (AwaitPointerEventScope)this.n;
                        this.n = awaitPointerEventScope0;
                        this.m = 1;
                        Object object2 = TapGestureDetectorKt.f(awaitPointerEventScope0, false, null, this, 2, null);
                        if(object2 == object1) {
                            return object1;
                        }
                        awaitPointerEventScope1 = awaitPointerEventScope0;
                        object0 = object2;
                        goto label_15;
                    }
                    case 1: {
                        awaitPointerEventScope1 = (AwaitPointerEventScope)this.n;
                        f0.n(object0);
                    label_15:
                        e l0$e0 = new e();
                        androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.5.drag.1 dragGestureDetectorKt$detectHorizontalDragGestures$5$drag$10 = new o() {
                            final e e;

                            {
                                this.e = l0$e0;
                                super(2);
                            }

                            public final void a(@l PointerInputChange pointerInputChange0, float f) {
                                L.p(pointerInputChange0, "change");
                                pointerInputChange0.a();
                                this.e.a = f;
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                this.a(((PointerInputChange)object0), ((Number)object1).floatValue());
                                return S0.a;
                            }
                        };
                        this.n = awaitPointerEventScope1;
                        this.l = l0$e0;
                        this.m = 2;
                        object0 = DragGestureDetectorKt.e(awaitPointerEventScope1, ((PointerInputChange)object0).p(), ((PointerInputChange)object0).y(), dragGestureDetectorKt$detectHorizontalDragGestures$5$drag$10, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        awaitPointerEventScope2 = awaitPointerEventScope1;
                        l0$e1 = l0$e0;
                        goto label_29;
                    }
                    case 2: {
                        l0$e1 = (e)this.l;
                        awaitPointerEventScope2 = (AwaitPointerEventScope)this.n;
                        f0.n(object0);
                    label_29:
                        if(((PointerInputChange)object0) != null) {
                            Offset offset0 = Offset.d(((PointerInputChange)object0).q());
                            this.o.invoke(offset0);
                            this.p.invoke(((PointerInputChange)object0), kotlin.coroutines.jvm.internal.b.e(l0$e1.a));
                            androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.5.1 dragGestureDetectorKt$detectHorizontalDragGestures$5$10 = new Function1() {
                                final o e;

                                {
                                    this.e = o0;
                                    super(1);
                                }

                                public final void a(@l PointerInputChange pointerInputChange0) {
                                    L.p(pointerInputChange0, "it");
                                    Float float0 = Offset.p(PointerEventKt.k(pointerInputChange0));
                                    this.e.invoke(pointerInputChange0, float0);
                                    pointerInputChange0.a();
                                }

                                @Override  // kotlin.jvm.functions.Function1
                                public Object invoke(Object object0) {
                                    this.a(((PointerInputChange)object0));
                                    return S0.a;
                                }
                            };
                            this.n = null;
                            this.l = null;
                            this.m = 3;
                            object0 = DragGestureDetectorKt.B(awaitPointerEventScope2, ((PointerInputChange)object0).p(), dragGestureDetectorKt$detectHorizontalDragGestures$5$10, this);
                            if(object0 == object1) {
                                return object1;
                            }
                            goto label_41;
                        }
                        break;
                    }
                    case 3: {
                        f0.n(object0);
                    label_41:
                        if(((Boolean)object0).booleanValue()) {
                            this.q.invoke();
                            return S0.a;
                        }
                        this.r.invoke();
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return S0.a;
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    public static Object t(PointerInputScope pointerInputScope0, Function1 function10, a a0, a a1, o o0, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.2.e;
        }
        if((v & 2) != 0) {
            a0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.3.e;
        }
        if((v & 4) != 0) {
            a1 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.4.e;
        }
        return DragGestureDetectorKt.s(pointerInputScope0, function10, a0, a1, o0, d0);

        final class androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.2 extends N implements Function1 {
            public static final androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.2 e;

            static {
                androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.2.e = new androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.2();
            }

            androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.2() {
                super(1);
            }

            public final void a(long v) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Offset)object0).A());
                return S0.a;
            }
        }


        final class androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.3 extends N implements a {
            public static final androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.3 e;

            static {
                androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.3.e = new androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.3();
            }

            androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.3() {
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return S0.a;
            }

            public final void invoke() {
            }
        }


        final class androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.4 extends N implements a {
            public static final androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.4 e;

            static {
                androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.4.e = new androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.4();
            }

            androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.4() {
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return S0.a;
            }

            public final void invoke() {
            }
        }

    }

    @m
    public static final Object u(@l PointerInputScope pointerInputScope0, @l Function1 function10, @l a a0, @l a a1, @l o o0, @l d d0) {
        Object object0 = ForEachGestureKt.d(pointerInputScope0, new o(function10, o0, a0, a1, null) {
            Object l;
            int m;
            private Object n;
            final Function1 o;
            final o p;
            final a q;
            final a r;

            {
                this.o = function10;
                this.p = o0;
                this.q = a0;
                this.r = a1;
                super(2, d0);
            }

            @m
            public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.5)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.5(this.o, this.p, this.q, this.r, d0);
                d1.n = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((AwaitPointerEventScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                e l0$e1;
                AwaitPointerEventScope awaitPointerEventScope2;
                AwaitPointerEventScope awaitPointerEventScope1;
                Object object1 = b.l();
                switch(this.m) {
                    case 0: {
                        f0.n(object0);
                        AwaitPointerEventScope awaitPointerEventScope0 = (AwaitPointerEventScope)this.n;
                        this.n = awaitPointerEventScope0;
                        this.m = 1;
                        Object object2 = TapGestureDetectorKt.f(awaitPointerEventScope0, false, null, this, 2, null);
                        if(object2 == object1) {
                            return object1;
                        }
                        awaitPointerEventScope1 = awaitPointerEventScope0;
                        object0 = object2;
                        goto label_15;
                    }
                    case 1: {
                        awaitPointerEventScope1 = (AwaitPointerEventScope)this.n;
                        f0.n(object0);
                    label_15:
                        e l0$e0 = new e();
                        androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.5.drag.1 dragGestureDetectorKt$detectVerticalDragGestures$5$drag$10 = new o() {
                            final e e;

                            {
                                this.e = l0$e0;
                                super(2);
                            }

                            public final void a(@l PointerInputChange pointerInputChange0, float f) {
                                L.p(pointerInputChange0, "change");
                                pointerInputChange0.a();
                                this.e.a = f;
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                this.a(((PointerInputChange)object0), ((Number)object1).floatValue());
                                return S0.a;
                            }
                        };
                        this.n = awaitPointerEventScope1;
                        this.l = l0$e0;
                        this.m = 2;
                        object0 = DragGestureDetectorKt.m(awaitPointerEventScope1, ((PointerInputChange)object0).p(), ((PointerInputChange)object0).y(), dragGestureDetectorKt$detectVerticalDragGestures$5$drag$10, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        awaitPointerEventScope2 = awaitPointerEventScope1;
                        l0$e1 = l0$e0;
                        goto label_29;
                    }
                    case 2: {
                        l0$e1 = (e)this.l;
                        awaitPointerEventScope2 = (AwaitPointerEventScope)this.n;
                        f0.n(object0);
                    label_29:
                        if(((PointerInputChange)object0) != null) {
                            Offset offset0 = Offset.d(((PointerInputChange)object0).q());
                            this.o.invoke(offset0);
                            this.p.invoke(((PointerInputChange)object0), kotlin.coroutines.jvm.internal.b.e(l0$e1.a));
                            androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.5.1 dragGestureDetectorKt$detectVerticalDragGestures$5$10 = new Function1() {
                                final o e;

                                {
                                    this.e = o0;
                                    super(1);
                                }

                                public final void a(@l PointerInputChange pointerInputChange0) {
                                    L.p(pointerInputChange0, "it");
                                    Float float0 = Offset.r(PointerEventKt.k(pointerInputChange0));
                                    this.e.invoke(pointerInputChange0, float0);
                                    pointerInputChange0.a();
                                }

                                @Override  // kotlin.jvm.functions.Function1
                                public Object invoke(Object object0) {
                                    this.a(((PointerInputChange)object0));
                                    return S0.a;
                                }
                            };
                            this.n = null;
                            this.l = null;
                            this.m = 3;
                            object0 = DragGestureDetectorKt.F(awaitPointerEventScope2, ((PointerInputChange)object0).p(), dragGestureDetectorKt$detectVerticalDragGestures$5$10, this);
                            if(object0 == object1) {
                                return object1;
                            }
                            goto label_41;
                        }
                        break;
                    }
                    case 3: {
                        f0.n(object0);
                    label_41:
                        if(((Boolean)object0).booleanValue()) {
                            this.q.invoke();
                            return S0.a;
                        }
                        this.r.invoke();
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return S0.a;
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    public static Object v(PointerInputScope pointerInputScope0, Function1 function10, a a0, a a1, o o0, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.2.e;
        }
        if((v & 2) != 0) {
            a0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.3.e;
        }
        if((v & 4) != 0) {
            a1 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.4.e;
        }
        return DragGestureDetectorKt.u(pointerInputScope0, function10, a0, a1, o0, d0);

        final class androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.2 extends N implements Function1 {
            public static final androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.2 e;

            static {
                androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.2.e = new androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.2();
            }

            androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.2() {
                super(1);
            }

            public final void a(long v) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Offset)object0).A());
                return S0.a;
            }
        }


        final class androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.3 extends N implements a {
            public static final androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.3 e;

            static {
                androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.3.e = new androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.3();
            }

            androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.3() {
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return S0.a;
            }

            public final void invoke() {
            }
        }


        final class androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.4 extends N implements a {
            public static final androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.4 e;

            static {
                androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.4.e = new androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.4();
            }

            androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.4() {
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return S0.a;
            }

            public final void invoke() {
            }
        }

    }

    @m
    public static final Object w(@l AwaitPointerEventScope awaitPointerEventScope0, long v, @l Function1 function10, @l Function1 function11, @l Function1 function12, @l d d0) {
        g l0$g2;
        Object object4;
        Object object2;
        g l0$g1;
        AwaitPointerEventScope awaitPointerEventScope3;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1 function15;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.drag.2 dragGestureDetectorKt$drag$21;
        Function1 function14;
        Function1 function13;
        AwaitPointerEventScope awaitPointerEventScope1;
        long v2;
        androidx.compose.foundation.gestures.DragGestureDetectorKt.drag.2 dragGestureDetectorKt$drag$20;
        if(d0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt.drag.2) {
            dragGestureDetectorKt$drag$20 = (androidx.compose.foundation.gestures.DragGestureDetectorKt.drag.2)d0;
            int v1 = dragGestureDetectorKt$drag$20.r;
            if((v1 & 0x80000000) == 0) {
                dragGestureDetectorKt$drag$20 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    Object o;
                    Object p;
                    Object q;
                    int r;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.q = object0;
                        this.r |= 0x80000000;
                        return DragGestureDetectorKt.w(null, 0L, null, null, null, this);
                    }
                };
            }
            else {
                dragGestureDetectorKt$drag$20.r = v1 ^ 0x80000000;
            }
        }
        else {
            dragGestureDetectorKt$drag$20 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                Object p;
                Object q;
                int r;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.q = object0;
                    this.r |= 0x80000000;
                    return DragGestureDetectorKt.w(null, 0L, null, null, null, this);
                }
            };
        }
        Object object0 = dragGestureDetectorKt$drag$20.q;
        Object object1 = b.l();
        switch(dragGestureDetectorKt$drag$20.r) {
            case 0: {
                f0.n(object0);
                v2 = v;
                if(DragGestureDetectorKt.C(awaitPointerEventScope0.m1(), v2)) {
                    return null;
                }
                awaitPointerEventScope1 = awaitPointerEventScope0;
                function13 = function11;
                function14 = function12;
                dragGestureDetectorKt$drag$21 = dragGestureDetectorKt$drag$20;
                function15 = function10;
                l0$g2 = new g();
                l0$g2.a = v2;
                awaitPointerEventScope2 = awaitPointerEventScope1;
                goto label_83;
            }
            case 1: {
                g l0$g0 = (g)dragGestureDetectorKt$drag$20.p;
                awaitPointerEventScope2 = (AwaitPointerEventScope)dragGestureDetectorKt$drag$20.o;
                Function1 function16 = (Function1)dragGestureDetectorKt$drag$20.n;
                Function1 function17 = (Function1)dragGestureDetectorKt$drag$20.m;
                Function1 function18 = (Function1)dragGestureDetectorKt$drag$20.l;
                awaitPointerEventScope3 = (AwaitPointerEventScope)dragGestureDetectorKt$drag$20.k;
                f0.n(object0);
                dragGestureDetectorKt$drag$21 = dragGestureDetectorKt$drag$20;
                function15 = function18;
                l0$g1 = l0$g0;
                function13 = function17;
                function14 = function16;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            List list0 = ((PointerEvent)object0).e();
            int v3 = list0.size();
            int v4 = 0;
            while(true) {
                object2 = null;
                if(v4 < v3) {
                    Object object3 = list0.get(v4);
                    if(PointerId.d(((PointerInputChange)object3).p(), l0$g1.a)) {
                        object2 = object3;
                    }
                    else {
                        ++v4;
                        continue;
                    }
                }
                break;
            }
            PointerInputChange pointerInputChange0 = (PointerInputChange)object2;
            if(pointerInputChange0 == null) {
                pointerInputChange0 = null;
                goto label_68;
            }
            else {
                if(PointerEventKt.e(pointerInputChange0)) {
                    List list1 = ((PointerEvent)object0).e();
                    int v5 = list1.size();
                    int v6 = 0;
                    while(true) {
                        object4 = null;
                        if(v6 < v5) {
                            Object object5 = list1.get(v6);
                            if(((PointerInputChange)object5).r()) {
                                object4 = object5;
                            }
                            else {
                                ++v6;
                                continue;
                            }
                        }
                        break;
                    }
                    if(((PointerInputChange)object4) == null) {
                        goto label_68;
                    }
                    else {
                        l0$g1.a = ((PointerInputChange)object4).p();
                        goto label_81;
                    }
                    goto label_67;
                }
                else {
                label_67:
                    if(((Number)function13.invoke(pointerInputChange0)).floatValue() != 0.0f) {
                    label_68:
                        if(pointerInputChange0 == null) {
                            return null;
                        }
                        if(((Boolean)function14.invoke(pointerInputChange0)).booleanValue()) {
                            return null;
                        }
                        if(PointerEventKt.e(pointerInputChange0)) {
                            return pointerInputChange0;
                        }
                        function15.invoke(pointerInputChange0);
                        v2 = pointerInputChange0.p();
                        awaitPointerEventScope1 = awaitPointerEventScope3;
                        l0$g2 = new g();
                        l0$g2.a = v2;
                        awaitPointerEventScope2 = awaitPointerEventScope1;
                        goto label_83;
                    }
                }
            label_81:
                awaitPointerEventScope1 = awaitPointerEventScope3;
                l0$g2 = l0$g1;
            }
        label_83:
            dragGestureDetectorKt$drag$21.k = awaitPointerEventScope1;
            dragGestureDetectorKt$drag$21.l = function15;
            dragGestureDetectorKt$drag$21.m = function13;
            dragGestureDetectorKt$drag$21.n = function14;
            dragGestureDetectorKt$drag$21.o = awaitPointerEventScope2;
            dragGestureDetectorKt$drag$21.p = l0$g2;
            dragGestureDetectorKt$drag$21.r = 1;
            Object object6 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope2, null, dragGestureDetectorKt$drag$21, 1, null);
            if(object6 == object1) {
                return object1;
            }
            awaitPointerEventScope3 = awaitPointerEventScope1;
            object0 = object6;
            l0$g1 = l0$g2;
        }
    }

    private static final Object x(AwaitPointerEventScope awaitPointerEventScope0, long v, Function1 function10, Function1 function11, Function1 function12, d d0) {
        Object object2;
        PointerInputChange pointerInputChange0;
        Object object0;
        if(DragGestureDetectorKt.C(awaitPointerEventScope0.m1(), v)) {
            return null;
        }
        while(true) {
            g l0$g0 = new g();
            l0$g0.a = v;
            while(true) {
                int v1 = 0;
                PointerEvent pointerEvent0 = (PointerEvent)androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope0, null, d0, 1, null);
                List list0 = pointerEvent0.e();
                int v2 = list0.size();
                int v3 = 0;
                while(true) {
                    object0 = null;
                    if(v3 < v2) {
                        Object object1 = list0.get(v3);
                        if(PointerId.d(((PointerInputChange)object1).p(), l0$g0.a)) {
                            object0 = object1;
                        }
                        else {
                            ++v3;
                            continue;
                        }
                    }
                    break;
                }
                pointerInputChange0 = (PointerInputChange)object0;
                if(pointerInputChange0 == null) {
                    goto label_39;
                }
                else if(PointerEventKt.e(pointerInputChange0)) {
                    List list1 = pointerEvent0.e();
                    int v4 = list1.size();
                    while(true) {
                        object2 = null;
                        if(v1 < v4) {
                            Object object3 = list1.get(v1);
                            if(((PointerInputChange)object3).r()) {
                                object2 = object3;
                            }
                            else {
                                ++v1;
                                continue;
                            }
                        }
                        break;
                    }
                    if(((PointerInputChange)object2) != null) {
                        l0$g0.a = ((PointerInputChange)object2).p();
                        continue;
                    }
                }
                else {
                    if(((Number)function11.invoke(pointerInputChange0)).floatValue() == 0.0f) {
                        v1 = 1;
                    }
                    if(!((boolean)(v1 ^ 1))) {
                        continue;
                    }
                }
                break;
            }
            goto label_40;
        label_39:
            pointerInputChange0 = null;
        label_40:
            if(pointerInputChange0 == null || ((Boolean)function12.invoke(pointerInputChange0)).booleanValue()) {
                return null;
            }
            if(PointerEventKt.e(pointerInputChange0)) {
                return pointerInputChange0;
            }
            function10.invoke(pointerInputChange0);
            v = pointerInputChange0.p();
        }
    }

    @m
    public static final Object y(@l AwaitPointerEventScope awaitPointerEventScope0, long v, @l Function1 function10, @l d d0) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt.drag.1 dragGestureDetectorKt$drag$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt.drag.1) {
            dragGestureDetectorKt$drag$10 = (androidx.compose.foundation.gestures.DragGestureDetectorKt.drag.1)d0;
            int v1 = dragGestureDetectorKt$drag$10.n;
            if((v1 & 0x80000000) == 0) {
                dragGestureDetectorKt$drag$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    Object m;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.n |= 0x80000000;
                        return DragGestureDetectorKt.y(null, 0L, null, this);
                    }
                };
            }
            else {
                dragGestureDetectorKt$drag$10.n = v1 ^ 0x80000000;
            }
        }
        else {
            dragGestureDetectorKt$drag$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                Object m;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.n |= 0x80000000;
                    return DragGestureDetectorKt.y(null, 0L, null, this);
                }
            };
        }
        Object object0 = dragGestureDetectorKt$drag$10.m;
        Object object1 = b.l();
        switch(dragGestureDetectorKt$drag$10.n) {
            case 0: {
                f0.n(object0);
                goto label_26;
            }
            case 1: {
                Function1 function11 = (Function1)dragGestureDetectorKt$drag$10.l;
                AwaitPointerEventScope awaitPointerEventScope1 = (AwaitPointerEventScope)dragGestureDetectorKt$drag$10.k;
                f0.n(object0);
                function10 = function11;
                awaitPointerEventScope0 = awaitPointerEventScope1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if(((PointerInputChange)object0) == null) {
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
            if(PointerEventKt.e(((PointerInputChange)object0))) {
                return kotlin.coroutines.jvm.internal.b.a(true);
            }
            function10.invoke(((PointerInputChange)object0));
            v = ((PointerInputChange)object0).p();
        label_26:
            dragGestureDetectorKt$drag$10.k = awaitPointerEventScope0;
            dragGestureDetectorKt$drag$10.l = function10;
            dragGestureDetectorKt$drag$10.n = 1;
            object0 = DragGestureDetectorKt.b(awaitPointerEventScope0, v, dragGestureDetectorKt$drag$10);
        }
        while(object0 != object1);
        return object1;
    }

    @l
    public static final PointerDirectionConfig z() {
        return DragGestureDetectorKt.a;
    }
}

