package androidx.compose.foundation.text;

import A3.a;
import A3.o;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class LongPressTextDragObserverKt {
    @m
    public static final Object c(@l PointerInputScope pointerInputScope0, @l TextDragObserver textDragObserver0, @l d d0) {
        Object object0 = P.g(new o(pointerInputScope0, textDragObserver0, null) {
            int k;
            private Object l;
            final PointerInputScope m;
            final TextDragObserver n;

            {
                this.m = pointerInputScope0;
                this.n = textDragObserver0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver.2(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                O o0 = (O)this.l;
                k.f(o0, null, null, new o(this.n, null) {
                    int k;
                    final PointerInputScope l;
                    final TextDragObserver m;

                    {
                        this.l = pointerInputScope0;
                        this.m = textDragObserver0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver.2.1(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver.2.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                this.k = 1;
                                return LongPressTextDragObserverKt.f(this.l, this.m, this) == object1 ? object1 : S0.a;
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
                }, 3, null);
                return k.f(o0, null, null, new o(this.n, null) {
                    int k;
                    final PointerInputScope l;
                    final TextDragObserver m;

                    {
                        this.l = pointerInputScope0;
                        this.m = textDragObserver0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver.2.2(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver.2.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                this.k = 1;
                                return LongPressTextDragObserverKt.e(this.l, this.m, this) == object1 ? object1 : S0.a;
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
                }, 3, null);
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @m
    public static final Object d(@l PointerInputScope pointerInputScope0, @l TextDragObserver textDragObserver0, @l d d0) {
        Object object0 = DragGestureDetectorKt.q(pointerInputScope0, new Function1(textDragObserver0) {
            final TextDragObserver e;

            {
                this.e = textDragObserver0;
                super(1);
            }

            public final void a(long v) {
                this.e.c(v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Offset)object0).A());
                return S0.a;
            }
        }, new a(textDragObserver0) {
            final TextDragObserver e;

            {
                this.e = textDragObserver0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.onStop();
            }
        }, new a(textDragObserver0) {
            final TextDragObserver e;

            {
                this.e = textDragObserver0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.onCancel();
            }
        }, new o(textDragObserver0) {
            final TextDragObserver e;

            {
                this.e = textDragObserver0;
                super(2);
            }

            public final void a(@l PointerInputChange pointerInputChange0, long v) {
                L.p(pointerInputChange0, "<anonymous parameter 0>");
                this.e.b(v);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PointerInputChange)object0), ((Offset)object1).A());
                return S0.a;
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    private static final Object e(PointerInputScope pointerInputScope0, TextDragObserver textDragObserver0, d d0) {
        Object object0 = DragGestureDetectorKt.o(pointerInputScope0, new Function1(textDragObserver0) {
            final TextDragObserver e;

            {
                this.e = textDragObserver0;
                super(1);
            }

            public final void a(long v) {
                this.e.c(v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Offset)object0).A());
                return S0.a;
            }
        }, new a(textDragObserver0) {
            final TextDragObserver e;

            {
                this.e = textDragObserver0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.onStop();
            }
        }, new a(textDragObserver0) {
            final TextDragObserver e;

            {
                this.e = textDragObserver0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.onCancel();
            }
        }, new o(textDragObserver0) {
            final TextDragObserver e;

            {
                this.e = textDragObserver0;
                super(2);
            }

            public final void a(@l PointerInputChange pointerInputChange0, long v) {
                L.p(pointerInputChange0, "<anonymous parameter 0>");
                this.e.b(v);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PointerInputChange)object0), ((Offset)object1).A());
                return S0.a;
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    private static final Object f(PointerInputScope pointerInputScope0, TextDragObserver textDragObserver0, d d0) {
        Object object0 = ForEachGestureKt.d(pointerInputScope0, new o(textDragObserver0, null) {
            Object l;
            int m;
            private Object n;
            final TextDragObserver o;

            {
                this.o = textDragObserver0;
                super(2, d0);
            }

            @m
            public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                return ((androidx.compose.foundation.text.LongPressTextDragObserverKt.detectPreDragGesturesWithObserver.2)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.text.LongPressTextDragObserverKt.detectPreDragGesturesWithObserver.2(this.o, d0);
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
                PointerInputChange pointerInputChange0;
                AwaitPointerEventScope awaitPointerEventScope1;
                AwaitPointerEventScope awaitPointerEventScope0;
                Object object1 = b.l();
                switch(this.m) {
                    case 0: {
                        f0.n(object0);
                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.n;
                        this.n = awaitPointerEventScope0;
                        this.m = 1;
                        object0 = TapGestureDetectorKt.f(awaitPointerEventScope0, false, null, this, 3, null);
                        if(object0 == object1) {
                            return object1;
                        }
                        this.o.a(((PointerInputChange)object0).q());
                        awaitPointerEventScope1 = awaitPointerEventScope0;
                        pointerInputChange0 = (PointerInputChange)object0;
                        goto label_27;
                    }
                    case 1: {
                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.n;
                        f0.n(object0);
                        this.o.a(((PointerInputChange)object0).q());
                        awaitPointerEventScope1 = awaitPointerEventScope0;
                        pointerInputChange0 = (PointerInputChange)object0;
                        goto label_27;
                    }
                    case 2: {
                        pointerInputChange0 = (PointerInputChange)this.l;
                        awaitPointerEventScope1 = (AwaitPointerEventScope)this.n;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            alab1:
                while(true) {
                    List list0 = ((PointerEvent)object0).e();
                    int v = list0.size();
                    int v1 = 0;
                    while(true) {
                        if(v1 >= v) {
                            break alab1;
                        }
                        PointerInputChange pointerInputChange1 = (PointerInputChange)list0.get(v1);
                        if(!PointerId.d(pointerInputChange1.p(), pointerInputChange0.p()) || !pointerInputChange1.r()) {
                            ++v1;
                            continue;
                        }
                    label_27:
                        this.n = awaitPointerEventScope1;
                        this.l = pointerInputChange0;
                        this.m = 2;
                        object0 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope1, null, this, 1, null);
                        if(object0 != object1) {
                            break;
                        }
                        return object1;
                    }
                }
                this.o.d();
                return S0.a;
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

