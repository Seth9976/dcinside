package androidx.compose.ui.input.pointer;

import A3.o;
import A3.p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
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

@s0({"SMAP\nPointerIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,101:1\n135#2:102\n*S KotlinDebug\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt\n*L\n74#1:102\n*E\n"})
public final class PointerIconKt {
    @Stable
    @l
    public static final Modifier a(@l Modifier modifier0, @l PointerIcon pointerIcon0, boolean z) {
        L.p(modifier0, "<this>");
        L.p(pointerIcon0, "icon");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(pointerIcon0, z) {
            final PointerIcon e;
            final boolean f;

            {
                this.e = pointerIcon0;
                this.f = z;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                Modifier modifier1;
                L.p(modifier0, "$this$composed");
                composer0.V(0x305836B0);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x305836B0, v, -1, "androidx.compose.ui.input.pointer.pointerHoverIcon.<anonymous> (PointerIcon.kt:78)");
                }
                PointerIconService pointerIconService0 = (PointerIconService)composer0.L(CompositionLocalsKt.s());
                if(pointerIconService0 == null) {
                    modifier1 = Modifier.m0;
                }
                else {
                    androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon.2.1 pointerIconKt$pointerHoverIcon$2$10 = new o(pointerIconService0, this.e, null) {
                        int k;
                        private Object l;
                        final boolean m;
                        final PointerIconService n;
                        final PointerIcon o;

                        {
                            this.m = z;
                            this.n = pointerIconService0;
                            this.o = pointerIcon0;
                            super(2, d0);
                        }

                        @m
                        public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                            return ((androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon.2.1)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            d d1 = new androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon.2.1(this.m, this.n, this.o, d0);
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
                                    androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon.2.1.1 pointerIconKt$pointerHoverIcon$2$1$10 = new o(this.n, this.o, null) {
                                        int l;
                                        private Object m;
                                        final boolean n;
                                        final PointerIconService o;
                                        final PointerIcon p;

                                        {
                                            this.n = z;
                                            this.o = pointerIconService0;
                                            this.p = pointerIcon0;
                                            super(2, d0);
                                        }

                                        @m
                                        public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                                            return ((androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon.2.1.1)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @l
                                        public final d create(@m Object object0, @l d d0) {
                                            d d1 = new androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon.2.1.1(this.n, this.o, this.p, d0);
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
                                                    goto label_10;
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
                                                if(!PointerEventType.k(((PointerEvent)object0).i(), 5) && (!PointerEventType.k(((PointerEvent)object0).i(), 2) || !PointerEventKt.j(((PointerInputChange)((PointerEvent)object0).e().get(0)), awaitPointerEventScope0.a(), 0L))) {
                                                    this.o.b(this.p);
                                                }
                                            label_10:
                                                this.m = awaitPointerEventScope0;
                                                this.l = 1;
                                                object0 = awaitPointerEventScope0.l1((this.n ? PointerEventPass.b : PointerEventPass.a), this);
                                            }
                                            while(object0 != object1);
                                            return object1;
                                        }
                                    };
                                    this.k = 1;
                                    return pointerInputScope0.R0(pointerIconKt$pointerHoverIcon$2$1$10, this) == object1 ? object1 : S0.a;
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
                    };
                    modifier1 = SuspendingPointerInputFilterKt.d(modifier0, this.e, Boolean.valueOf(this.f), pointerIconKt$pointerHoverIcon$2$10);
                }
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier1;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt\n*L\n1#1,170:1\n75#2,4:171\n*E\n"})
        public final class androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final PointerIcon e;
            final boolean f;

            public androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon..inlined.debugInspectorInfo.1(PointerIcon pointerIcon0, boolean z) {
                this.e = pointerIcon0;
                this.f = z;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("pointerHoverIcon");
                inspectorInfo0.b().c("icon", this.e);
                inspectorInfo0.b().c("overrideDescendants", Boolean.valueOf(this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier b(Modifier modifier0, PointerIcon pointerIcon0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return PointerIconKt.a(modifier0, pointerIcon0, z);
    }
}

