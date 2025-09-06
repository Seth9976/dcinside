package androidx.compose.foundation.gestures;

import A3.o;
import A3.q;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n132#2,3:256\n33#2,4:259\n135#2,2:263\n38#2:265\n137#2:266\n33#2,6:267\n33#2,6:273\n33#2,6:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n*L\n116#1:256,3\n116#1:259,4\n116#1:263,2\n116#1:265\n116#1:266\n131#1:267,6\n216#1:273,6\n242#1:279,6\n*E\n"})
public final class TransformGestureDetectorKt {
    private static final float a(long v) {
        return Offset.p(v) == 0.0f && Offset.r(v) == 0.0f ? 0.0f : -((float)Math.atan2(Offset.p(v), Offset.r(v))) * 180.0f / 3.141593f;
    }

    public static final long b(@l PointerEvent pointerEvent0, boolean z) {
        L.p(pointerEvent0, "<this>");
        long v = 0L;
        List list0 = pointerEvent0.e();
        int v1 = list0.size();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v2);
            if(pointerInputChange0.r() && pointerInputChange0.v()) {
                v = Offset.v(v, (z ? pointerInputChange0.q() : pointerInputChange0.u()));
                ++v3;
            }
        }
        return v3 == 0 ? 0x7FC000007FC00000L : Offset.j(v, ((float)v3));
    }

    public static long c(PointerEvent pointerEvent0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        return TransformGestureDetectorKt.b(pointerEvent0, z);
    }

    public static final float d(@l PointerEvent pointerEvent0, boolean z) {
        L.p(pointerEvent0, "<this>");
        long v = TransformGestureDetectorKt.b(pointerEvent0, z);
        float f = 0.0f;
        if(Offset.l(v, 0x7FC000007FC00000L)) {
            return 0.0f;
        }
        List list0 = pointerEvent0.e();
        int v1 = list0.size();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v2);
            if(pointerInputChange0.r() && pointerInputChange0.v()) {
                f += Offset.m(Offset.u((z ? pointerInputChange0.q() : pointerInputChange0.u()), v));
                ++v3;
            }
        }
        return f / ((float)v3);
    }

    public static float e(PointerEvent pointerEvent0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        return TransformGestureDetectorKt.d(pointerEvent0, z);
    }

    // 去混淆评级： 低(20)
    public static final long f(@l PointerEvent pointerEvent0) {
        L.p(pointerEvent0, "<this>");
        long v = TransformGestureDetectorKt.b(pointerEvent0, true);
        return Offset.l(v, 0x7FC000007FC00000L) ? 0L : Offset.u(v, TransformGestureDetectorKt.b(pointerEvent0, false));
    }

    public static final float g(@l PointerEvent pointerEvent0) {
        L.p(pointerEvent0, "<this>");
        List list0 = pointerEvent0.e();
        int v = list0.size();
        int v3 = 0;
        for(int v2 = 0; true; ++v2) {
            int v4 = 1;
            if(v2 >= v) {
                break;
            }
            PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v2);
            if(!pointerInputChange0.v() || !pointerInputChange0.r()) {
                v4 = 0;
            }
            v3 += v4;
        }
        if(v3 < 2) {
            return 0.0f;
        }
        long v5 = TransformGestureDetectorKt.b(pointerEvent0, true);
        long v6 = TransformGestureDetectorKt.b(pointerEvent0, false);
        List list1 = pointerEvent0.e();
        int v7 = list1.size();
        float f = 0.0f;
        float f1 = 0.0f;
        for(int v1 = 0; v1 < v7; ++v1) {
            PointerInputChange pointerInputChange1 = (PointerInputChange)list1.get(v1);
            if(pointerInputChange1.r() && pointerInputChange1.v()) {
                long v8 = Offset.u(pointerInputChange1.u(), v6);
                long v9 = Offset.u(pointerInputChange1.q(), v5);
                float f2 = TransformGestureDetectorKt.a(v8);
                float f3 = TransformGestureDetectorKt.a(v9) - f2;
                float f4 = Offset.m(Offset.v(v9, v8));
                if(f3 > 180.0f) {
                    f3 -= 360.0f;
                }
                else if(f3 < -180.0f) {
                    f3 += 360.0f;
                }
                f1 += f3 * (f4 / 2.0f);
                f += f4 / 2.0f;
            }
        }
        return f == 0.0f ? 0.0f : f1 / f;
    }

    public static final float h(@l PointerEvent pointerEvent0) {
        L.p(pointerEvent0, "<this>");
        float f = TransformGestureDetectorKt.d(pointerEvent0, true);
        float f1 = TransformGestureDetectorKt.d(pointerEvent0, false);
        return f != 0.0f && f1 != 0.0f ? f / f1 : 1.0f;
    }

    @m
    public static final Object i(@l PointerInputScope pointerInputScope0, boolean z, @l q q0, @l d d0) {
        Object object0 = ForEachGestureKt.d(pointerInputScope0, new o(z, q0, null) {
            float l;
            float m;
            float n;
            long o;
            int p;
            int q;
            int r;
            private Object s;
            final boolean t;
            final q u;

            {
                this.t = z;
                this.u = q0;
                super(2, d0);
            }

            @m
            public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.TransformGestureDetectorKt.detectTransformGestures.2)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.TransformGestureDetectorKt.detectTransformGestures.2(this.t, this.u, d0);
                d1.s = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((AwaitPointerEventScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                float f8;
                int v8;
                int v7;
                int v6;
                Object object2;
                float f3;
                float f2;
                int v2;
                int v1;
                long v;
                float f1;
                AwaitPointerEventScope awaitPointerEventScope0;
                Object object1 = b.l();
                switch(this.r) {
                    case 0: {
                        f0.n(object0);
                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.s;
                        float f = awaitPointerEventScope0.getViewConfiguration().b();
                        this.s = awaitPointerEventScope0;
                        this.l = 0.0f;
                        this.m = 1.0f;
                        this.o = 0L;
                        this.p = 0;
                        this.n = f;
                        this.q = 0;
                        this.r = 1;
                        if(TapGestureDetectorKt.f(awaitPointerEventScope0, false, null, this, 2, null) == object1) {
                            return object1;
                        }
                        f1 = f;
                        v = 0L;
                        v1 = 0;
                        v2 = 0;
                        f2 = 1.0f;
                        f3 = 0.0f;
                        goto label_110;
                    }
                    case 1: {
                        v1 = this.q;
                        f1 = this.n;
                        v2 = this.p;
                        v = this.o;
                        f2 = this.m;
                        f3 = this.l;
                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.s;
                        f0.n(object0);
                        goto label_110;
                    }
                    case 2: {
                        v1 = this.q;
                        f1 = this.n;
                        v2 = this.p;
                        v = this.o;
                        f2 = this.m;
                        f3 = this.l;
                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.s;
                        f0.n(object0);
                        object2 = object0;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            alab1:
                while(true) {
                    List list0 = ((PointerEvent)object2).e();
                    int v3 = list0.size();
                    int v4 = 0;
                    while(true) {
                        boolean z = false;
                        if(v4 < v3) {
                            if(((PointerInputChange)list0.get(v4)).A()) {
                                z = true;
                            }
                            else {
                                ++v4;
                                continue;
                            }
                        }
                        break;
                    }
                    if(z) {
                        f8 = f1;
                    }
                    else {
                        float f4 = TransformGestureDetectorKt.h(((PointerEvent)object2));
                        float f5 = TransformGestureDetectorKt.g(((PointerEvent)object2));
                        long v5 = TransformGestureDetectorKt.f(((PointerEvent)object2));
                        if(v2 == 0) {
                            f2 *= f4;
                            f3 += f5;
                            v = Offset.v(v, v5);
                            v6 = v1;
                            float f6 = TransformGestureDetectorKt.d(((PointerEvent)object2), false);
                            v7 = 0;
                            float f7 = Math.abs(3.141593f * f3 * f6 / 180.0f);
                            if(Math.abs(1.0f - f2) * f6 > f1 || f7 > f1 || Offset.m(v) > f1) {
                                v8 = !this.t || f7 >= f1 ? 0 : 1;
                                v7 = 1;
                                goto label_71;
                            }
                        }
                        else {
                            v6 = v1;
                            v7 = v2;
                        }
                        v8 = v6;
                    label_71:
                        if(v7 == 0) {
                            f8 = f1;
                        }
                        else {
                            long v9 = TransformGestureDetectorKt.b(((PointerEvent)object2), false);
                            if(v8 != 0) {
                                f5 = 0.0f;
                            }
                            if(f5 != 0.0f) {
                                f8 = f1;
                            label_83:
                                Offset offset0 = Offset.d(v9);
                                Offset offset1 = Offset.d(v5);
                                this.u.T0(offset0, offset1, kotlin.coroutines.jvm.internal.b.e(f4), kotlin.coroutines.jvm.internal.b.e(f5));
                            }
                            else if(f4 == 1.0f) {
                                f8 = f1;
                                if(!Offset.l(v5, 0L)) {
                                    goto label_83;
                                }
                            }
                            else {
                                f8 = f1;
                                goto label_83;
                            }
                            List list1 = ((PointerEvent)object2).e();
                            int v10 = list1.size();
                            for(int v11 = 0; v11 < v10; ++v11) {
                                PointerInputChange pointerInputChange0 = (PointerInputChange)list1.get(v11);
                                if(PointerEventKt.p(pointerInputChange0)) {
                                    pointerInputChange0.a();
                                }
                            }
                        }
                        v1 = v8;
                        v2 = v7;
                    }
                    if(z) {
                        break;
                    }
                    List list2 = ((PointerEvent)object2).e();
                    int v12 = list2.size();
                    int v13 = 0;
                    while(true) {
                        if(v13 >= v12) {
                            break;
                        }
                        if(!((PointerInputChange)list2.get(v13)).r()) {
                            ++v13;
                            continue;
                        }
                        f1 = f8;
                    label_110:
                        this.s = awaitPointerEventScope0;
                        this.l = f3;
                        this.m = f2;
                        this.o = v;
                        this.p = v2;
                        this.n = f1;
                        this.q = v1;
                        this.r = 2;
                        object2 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope0, null, this, 1, null);
                        if(object2 != object1) {
                            continue alab1;
                        }
                        return object1;
                    }
                    break;
                }
                return S0.a;
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    public static Object j(PointerInputScope pointerInputScope0, boolean z, q q0, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return TransformGestureDetectorKt.i(pointerInputScope0, z, q0, d0);
    }
}

