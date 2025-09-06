package androidx.compose.foundation.text;

import A3.o;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0.h;
import kotlinx.coroutines.M0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import y4.l;
import y4.m;

public final class PointerMoveDetectorKt {
    @m
    public static final Object a(@l PointerInputScope pointerInputScope0, @l PointerEventPass pointerEventPass0, @l Function1 function10, @l d d0) {
        Object object0 = P.g(new o(pointerInputScope0, pointerEventPass0, function10, null) {
            int k;
            final PointerInputScope l;
            final PointerEventPass m;
            final Function1 n;

            {
                this.l = pointerInputScope0;
                this.m = pointerEventPass0;
                this.n = function10;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.compose.foundation.text.PointerMoveDetectorKt.detectMoves.2(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.foundation.text.PointerMoveDetectorKt.detectMoves.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        androidx.compose.foundation.text.PointerMoveDetectorKt.detectMoves.2.1 pointerMoveDetectorKt$detectMoves$2$10 = new o(this.m, this.n, null) {
                            Object l;
                            int m;
                            private Object n;
                            final g o;
                            final PointerEventPass p;
                            final Function1 q;

                            {
                                this.o = g0;
                                this.p = pointerEventPass0;
                                this.q = function10;
                                super(2, d0);
                            }

                            @m
                            public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                                return ((androidx.compose.foundation.text.PointerMoveDetectorKt.detectMoves.2.1)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                d d1 = new androidx.compose.foundation.text.PointerMoveDetectorKt.detectMoves.2.1(this.o, this.p, this.q, d0);
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
                                AwaitPointerEventScope awaitPointerEventScope1;
                                h l0$h0;
                                Object object1 = b.l();
                                switch(this.m) {
                                    case 0: {
                                        f0.n(object0);
                                        AwaitPointerEventScope awaitPointerEventScope0 = (AwaitPointerEventScope)this.n;
                                        l0$h0 = new h();
                                        awaitPointerEventScope1 = awaitPointerEventScope0;
                                        goto label_21;
                                    }
                                    case 1: {
                                        l0$h0 = (h)this.l;
                                        awaitPointerEventScope1 = (AwaitPointerEventScope)this.n;
                                        f0.n(object0);
                                        break;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                                while(true) {
                                    int v = ((PointerEvent)object0).i();
                                    if(((PointerEventType.k(v, 3) ? true : PointerEventType.k(v, 4)) ? true : PointerEventType.k(v, 5))) {
                                        Offset offset0 = Offset.d(((PointerInputChange)u.B2(((PointerEvent)object0).e())).q());
                                        if(Offset.k(offset0.A(), l0$h0.a)) {
                                            offset0 = null;
                                        }
                                        if(offset0 != null) {
                                            long v1 = offset0.A();
                                            l0$h0.a = Offset.d(v1);
                                            Offset offset1 = Offset.d(v1);
                                            this.q.invoke(offset1);
                                        }
                                    }
                                label_21:
                                    if(!M0.E(this.o)) {
                                        break;
                                    }
                                    this.n = awaitPointerEventScope1;
                                    this.l = l0$h0;
                                    this.m = 1;
                                    object0 = awaitPointerEventScope1.l1(this.p, this);
                                    if(object0 != object1) {
                                        continue;
                                    }
                                    return object1;
                                }
                                return S0.a;
                            }
                        };
                        this.k = 1;
                        return this.l.R0(pointerMoveDetectorKt$detectMoves$2$10, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    public static Object b(PointerInputScope pointerInputScope0, PointerEventPass pointerEventPass0, Function1 function10, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            pointerEventPass0 = PointerEventPass.a;
        }
        return PointerMoveDetectorKt.a(pointerInputScope0, pointerEventPass0, function10, d0);
    }
}

