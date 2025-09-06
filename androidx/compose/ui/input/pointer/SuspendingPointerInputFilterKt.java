package androidx.compose.ui.input.pointer;

import A3.o;
import A3.p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlin.k;
import kotlin.m;
import kotlinx.coroutines.O;
import y4.l;

@s0({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,643:1\n135#2:644\n135#2:645\n135#2:646\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt\n*L\n233#1:644\n280#1:645\n326#1:646\n*E\n"})
public final class SuspendingPointerInputFilterKt {
    @l
    private static final String a = "Modifier.pointerInput must provide one or more \'key\' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";
    @l
    private static final PointerEvent b;

    static {
        SuspendingPointerInputFilterKt.b = new PointerEvent(u.H());
    }

    @k(level = m.b, message = "Modifier.pointerInput must provide one or more \'key\' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.")
    @l
    public static final Modifier b(@l Modifier modifier0, @l o o0) {
        L.p(modifier0, "<this>");
        L.p(o0, "block");
        throw new IllegalStateException("Modifier.pointerInput must provide one or more \'key\' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.");
    }

    @l
    public static final Modifier c(@l Modifier modifier0, @y4.m Object object0, @l o o0) {
        L.p(modifier0, "<this>");
        L.p(o0, "block");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(object0, o0) {
            final Object e;
            final o f;

            {
                this.e = object0;
                this.f = o0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @y4.m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0xC9FD2091);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xC9FD2091, v, -1, "androidx.compose.ui.input.pointer.pointerInput.<anonymous> (SuspendingPointerInputFilter.kt:237)");
                }
                Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
                ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer0.L(CompositionLocalsKt.w());
                composer0.V(0x44FAF204);
                boolean z = composer0.t(density0);
                SuspendingPointerInputFilter suspendingPointerInputFilter0 = composer0.W();
                if(z || suspendingPointerInputFilter0 == Composer.a.a()) {
                    suspendingPointerInputFilter0 = new SuspendingPointerInputFilter(viewConfiguration0, density0);
                    composer0.O(suspendingPointerInputFilter0);
                }
                composer0.g0();
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.2.2.1 suspendingPointerInputFilterKt$pointerInput$2$2$10 = new o(this.f, null) {
                    int k;
                    private Object l;
                    final SuspendingPointerInputFilter m;
                    final o n;

                    {
                        this.m = suspendingPointerInputFilter0;
                        this.n = o0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@y4.m Object object0, @l d d0) {
                        d d1 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.2.2.1(this.m, this.n, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @y4.m
                    public final Object invoke(@l O o0, @y4.m d d0) {
                        return ((androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.2.2.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @y4.m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                this.m.W0(((O)this.l));
                                this.k = 1;
                                return this.n.invoke(this.m, this) == object1 ? object1 : S0.a;
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
                EffectsKt.h(suspendingPointerInputFilter0, this.e, suspendingPointerInputFilterKt$pointerInput$2$2$10, composer0, 0x240);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return suspendingPointerInputFilter0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt\n*L\n1#1,170:1\n234#2,4:171\n*E\n"})
        public final class androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final Object e;
            final o f;

            public androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput..inlined.debugInspectorInfo.1(Object object0, o o0) {
                this.e = object0;
                this.f = o0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("pointerInput");
                inspectorInfo0.b().c("key1", this.e);
                inspectorInfo0.b().c("block", this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier d(@l Modifier modifier0, @y4.m Object object0, @y4.m Object object1, @l o o0) {
        L.p(modifier0, "<this>");
        L.p(o0, "block");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(object0, object1, o0) {
            final Object e;
            final Object f;
            final o g;

            {
                this.e = object0;
                this.f = object1;
                this.g = o0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @y4.m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x4611BB71);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x4611BB71, v, -1, "androidx.compose.ui.input.pointer.pointerInput.<anonymous> (SuspendingPointerInputFilter.kt:285)");
                }
                Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
                ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer0.L(CompositionLocalsKt.w());
                composer0.V(0x44FAF204);
                boolean z = composer0.t(density0);
                SuspendingPointerInputFilter suspendingPointerInputFilter0 = composer0.W();
                if(z || suspendingPointerInputFilter0 == Composer.a.a()) {
                    suspendingPointerInputFilter0 = new SuspendingPointerInputFilter(viewConfiguration0, density0);
                    composer0.O(suspendingPointerInputFilter0);
                }
                composer0.g0();
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.4.2.1 suspendingPointerInputFilterKt$pointerInput$4$2$10 = new o(this.g, null) {
                    int k;
                    private Object l;
                    final SuspendingPointerInputFilter m;
                    final o n;

                    {
                        this.m = suspendingPointerInputFilter0;
                        this.n = o0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@y4.m Object object0, @l d d0) {
                        d d1 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.4.2.1(this.m, this.n, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @y4.m
                    public final Object invoke(@l O o0, @y4.m d d0) {
                        return ((androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.4.2.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @y4.m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                this.m.W0(((O)this.l));
                                this.k = 1;
                                return this.n.invoke(this.m, this) == object1 ? object1 : S0.a;
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
                EffectsKt.i(suspendingPointerInputFilter0, this.e, this.f, suspendingPointerInputFilterKt$pointerInput$4$2$10, composer0, 0x1240);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return suspendingPointerInputFilter0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt\n*L\n1#1,170:1\n281#2,5:171\n*E\n"})
        public final class androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput..inlined.debugInspectorInfo.2 extends N implements Function1 {
            final Object e;
            final Object f;
            final o g;

            public androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput..inlined.debugInspectorInfo.2(Object object0, Object object1, o o0) {
                this.e = object0;
                this.f = object1;
                this.g = o0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("pointerInput");
                inspectorInfo0.b().c("key1", this.e);
                inspectorInfo0.b().c("key2", this.f);
                inspectorInfo0.b().c("block", this.g);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier e(@l Modifier modifier0, @l Object[] arr_object, @l o o0) {
        L.p(modifier0, "<this>");
        L.p(arr_object, "keys");
        L.p(o0, "block");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(arr_object, o0) {
            final Object[] e;
            final o f;

            {
                this.e = arr_object;
                this.f = o0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @y4.m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x279A49C4);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x279A49C4, v, -1, "androidx.compose.ui.input.pointer.pointerInput.<anonymous> (SuspendingPointerInputFilter.kt:330)");
                }
                Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
                ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer0.L(CompositionLocalsKt.w());
                composer0.V(0x44FAF204);
                boolean z = composer0.t(density0);
                SuspendingPointerInputFilter suspendingPointerInputFilter0 = composer0.W();
                if(z || suspendingPointerInputFilter0 == Composer.a.a()) {
                    suspendingPointerInputFilter0 = new SuspendingPointerInputFilter(viewConfiguration0, density0);
                    composer0.O(suspendingPointerInputFilter0);
                }
                composer0.g0();
                t0 t00 = new t0(2);
                t00.a(suspendingPointerInputFilter0);
                t00.b(this.e);
                EffectsKt.j(t00.d(new Object[t00.c()]), new o(this.f, null) {
                    int k;
                    private Object l;
                    final SuspendingPointerInputFilter m;
                    final o n;

                    {
                        this.m = suspendingPointerInputFilter0;
                        this.n = o0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@y4.m Object object0, @l d d0) {
                        d d1 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.6.2.1(this.m, this.n, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @y4.m
                    public final Object invoke(@l O o0, @y4.m d d0) {
                        return ((androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.6.2.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @y4.m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                this.m.W0(((O)this.l));
                                this.k = 1;
                                return this.n.invoke(this.m, this) == object1 ? object1 : S0.a;
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
                }, composer0, 72);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return suspendingPointerInputFilter0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt\n*L\n1#1,170:1\n327#2,4:171\n*E\n"})
        public final class androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput..inlined.debugInspectorInfo.3 extends N implements Function1 {
            final Object[] e;
            final o f;

            public androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput..inlined.debugInspectorInfo.3(Object[] arr_object, o o0) {
                this.e = arr_object;
                this.f = o0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("pointerInput");
                inspectorInfo0.b().c("keys", this.e);
                inspectorInfo0.b().c("block", this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }
}

