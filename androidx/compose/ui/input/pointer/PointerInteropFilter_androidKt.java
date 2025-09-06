package androidx.compose.ui.input.pointer;

import A3.o;
import A3.p;
import android.view.MotionEvent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,350:1\n135#2:351\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n*L\n73#1:351\n*E\n"})
public final class PointerInteropFilter_androidKt {
    @ExperimentalComposeUiApi
    @l
    public static final Modifier a(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "watcher");
        return SuspendingPointerInputFilterKt.c(modifier0, function10, new o(function10, null) {
            int k;
            private Object l;
            final Function1 m;

            {
                this.m = function10;
                super(2, d0);
            }

            @m
            public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                return ((androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.motionEventSpy.1)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.motionEventSpy.1(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((PointerInputScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        PointerInputScope pointerInputScope0 = (PointerInputScope)this.l;
                        pointerInputScope0.j1(true);
                        androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.motionEventSpy.1.1 pointerInteropFilter_androidKt$motionEventSpy$1$10 = new o(null) {
                            int l;
                            private Object m;
                            final Function1 n;

                            {
                                this.n = function10;
                                super(2, d0);
                            }

                            @m
                            public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                                return ((androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.motionEventSpy.1.1)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                d d1 = new androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.motionEventSpy.1.1(this.n, d0);
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
                                AwaitPointerEventScope awaitPointerEventScope0;
                                Object object1 = b.l();
                                switch(this.l) {
                                    case 0: {
                                        f0.n(object0);
                                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.m;
                                        goto label_11;
                                    }
                                    case 1: {
                                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.m;
                                        f0.n(object0);
                                        break;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                                do {
                                    MotionEvent motionEvent0 = ((PointerEvent)object0).h();
                                    if(motionEvent0 != null) {
                                        this.n.invoke(motionEvent0);
                                    }
                                label_11:
                                    this.m = awaitPointerEventScope0;
                                    this.l = 1;
                                    object0 = awaitPointerEventScope0.l1(PointerEventPass.a, this);
                                }
                                while(object0 != object1);
                                return object1;
                            }
                        };
                        this.k = 1;
                        return pointerInputScope0.R0(pointerInteropFilter_androidKt$motionEventSpy$1$10, this) == object1 ? object1 : S0.a;
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
        });
    }

    @ExperimentalComposeUiApi
    @l
    public static final Modifier b(@l Modifier modifier0, @m RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "onTouchEvent");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(function10, requestDisallowInterceptTouchEvent0) {
            final Function1 e;
            final RequestDisallowInterceptTouchEvent f;

            {
                this.e = function10;
                this.f = requestDisallowInterceptTouchEvent0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x1650851B);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x1650851B, v, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:77)");
                }
                composer0.V(0xE2A708A4);
                PointerInteropFilter pointerInteropFilter0 = composer0.W();
                if(pointerInteropFilter0 == Composer.a.a()) {
                    pointerInteropFilter0 = new PointerInteropFilter();
                    composer0.O(pointerInteropFilter0);
                }
                composer0.g0();
                pointerInteropFilter0.j(this.e);
                pointerInteropFilter0.l(this.f);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return pointerInteropFilter0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n*L\n1#1,170:1\n74#2,4:171\n*E\n"})
        public final class androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.pointerInteropFilter..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final RequestDisallowInterceptTouchEvent e;
            final Function1 f;

            public androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.pointerInteropFilter..inlined.debugInspectorInfo.1(RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent0, Function1 function10) {
                this.e = requestDisallowInterceptTouchEvent0;
                this.f = function10;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("pointerInteropFilter");
                inspectorInfo0.b().c("requestDisallowInterceptTouchEvent", this.e);
                inspectorInfo0.b().c("onTouchEvent", this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @ExperimentalComposeUiApi
    @l
    public static final Modifier c(@l Modifier modifier0, @l AndroidViewHolder androidViewHolder0) {
        L.p(modifier0, "<this>");
        L.p(androidViewHolder0, "view");
        PointerInteropFilter pointerInteropFilter0 = new PointerInteropFilter();
        pointerInteropFilter0.j(new Function1(androidViewHolder0) {
            final AndroidViewHolder e;

            {
                this.e = androidViewHolder0;
                super(1);
            }

            @l
            public final Boolean a(@l MotionEvent motionEvent0) {
                L.p(motionEvent0, "motionEvent");
                switch(motionEvent0.getActionMasked()) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: {
                        return Boolean.valueOf(this.e.dispatchTouchEvent(motionEvent0));
                    }
                    default: {
                        return Boolean.valueOf(this.e.dispatchGenericMotionEvent(motionEvent0));
                    }
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((MotionEvent)object0));
            }
        });
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent0 = new RequestDisallowInterceptTouchEvent();
        pointerInteropFilter0.l(requestDisallowInterceptTouchEvent0);
        androidViewHolder0.setOnRequestDisallowInterceptTouchEvent$ui_release(requestDisallowInterceptTouchEvent0);
        return modifier0.r0(pointerInteropFilter0);
    }

    public static Modifier d(Modifier modifier0, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            requestDisallowInterceptTouchEvent0 = null;
        }
        return PointerInteropFilter_androidKt.b(modifier0, requestDisallowInterceptTouchEvent0, function10);
    }
}

