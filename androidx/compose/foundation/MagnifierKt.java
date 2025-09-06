package androidx.compose.foundation;

import A3.a;
import A3.o;
import A3.p;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.g;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.flow.D;
import kotlinx.coroutines.flow.K;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

@s0({"SMAP\nMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,394:1\n135#2:395\n146#2:396\n*S KotlinDebug\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt\n*L\n233#1:395\n231#1:396\n*E\n"})
public final class MagnifierKt {
    @l
    private static final SemanticsPropertyKey a;

    static {
        MagnifierKt.a = new SemanticsPropertyKey("MagnifierPositionInRoot", null, 2, null);
    }

    @l
    public static final SemanticsPropertyKey a() {
        return MagnifierKt.a;
    }

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean b(int v) {
        return v >= 28;
    }

    public static boolean c(int v, int v1, Object object0) [...] // 潜在的解密器

    @ExperimentalFoundationApi
    @l
    public static final Modifier d(@l Modifier modifier0, @l Function1 function10, @l Function1 function11, float f, @l MagnifierStyle magnifierStyle0, @m Function1 function12) {
        L.p(modifier0, "<this>");
        L.p(function10, "sourceCenter");
        L.p(function11, "magnifierCenter");
        L.p(magnifierStyle0, "style");
        return InspectableValueKt.d(modifier0, InspectableValueKt.b(), MagnifierKt.e(Modifier.m0, function10, function11, f, magnifierStyle0, function12, PlatformMagnifierFactory.a.a()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt\n*L\n1#1,170:1\n234#2,6:171\n*E\n"})
        public final class androidx.compose.foundation.MagnifierKt.magnifier..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final Function1 e;
            final Function1 f;
            final float g;
            final MagnifierStyle h;

            public androidx.compose.foundation.MagnifierKt.magnifier..inlined.debugInspectorInfo.1(Function1 function10, Function1 function11, float f, MagnifierStyle magnifierStyle0) {
                this.e = function10;
                this.f = function11;
                this.g = f;
                this.h = magnifierStyle0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("magnifier");
                inspectorInfo0.b().c("sourceCenter", this.e);
                inspectorInfo0.b().c("magnifierCenter", this.f);
                inspectorInfo0.b().c("zoom", this.g);
                inspectorInfo0.b().c("style", this.h);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @SuppressLint({"ModifierInspectorInfo"})
    @RequiresApi(28)
    @l
    public static final Modifier e(@l Modifier modifier0, @l Function1 function10, @l Function1 function11, float f, @l MagnifierStyle magnifierStyle0, @m Function1 function12, @l PlatformMagnifierFactory platformMagnifierFactory0) {
        L.p(modifier0, "<this>");
        L.p(function10, "sourceCenter");
        L.p(function11, "magnifierCenter");
        L.p(magnifierStyle0, "style");
        L.p(platformMagnifierFactory0, "platformMagnifierFactory");
        return ComposedModifierKt.j(modifier0, null, new p(function10, function11, f, function12, platformMagnifierFactory0, magnifierStyle0) {
            final Function1 e;
            final Function1 f;
            final float g;
            final Function1 h;
            final PlatformMagnifierFactory i;
            final MagnifierStyle j;

            {
                this.e = function10;
                this.f = function11;
                this.g = f;
                this.h = function12;
                this.i = platformMagnifierFactory0;
                this.j = magnifierStyle0;
                super(3);
            }

            @Composable
            @l
            public final Modifier i(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(-454877003);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(-454877003, v, -1, "androidx.compose.foundation.magnifier.<anonymous> (Magnifier.kt:272)");
                }
                Object object0 = composer0.L(AndroidCompositionLocals_androidKt.k());
                Object object1 = composer0.L(CompositionLocalsKt.i());
                composer0.V(0xE2A708A4);
                MutableState mutableState0 = composer0.W();
                Companion composer$Companion0 = Composer.a;
                if(mutableState0 == composer$Companion0.a()) {
                    mutableState0 = SnapshotStateKt__SnapshotStateKt.g(Offset.d(0x7FC000007FC00000L), null, 2, null);
                    composer0.O(mutableState0);
                }
                composer0.g0();
                State state0 = SnapshotStateKt.t(this.e, composer0, 0);
                State state1 = SnapshotStateKt.t(this.f, composer0, 0);
                State state2 = SnapshotStateKt.t(this.g, composer0, 0);
                State state3 = SnapshotStateKt.t(this.h, composer0, 0);
                composer0.V(0xE2A708A4);
                State state4 = composer0.W();
                if(state4 == composer$Companion0.a()) {
                    state4 = SnapshotStateKt.c(new a(state0, mutableState0) {
                        final Density e;
                        final State f;
                        final MutableState g;

                        {
                            this.e = density0;
                            this.f = state0;
                            this.g = mutableState0;
                            super(0);
                        }

                        // 去混淆评级： 低(20)
                        public final long b() {
                            long v = ((Offset)androidx.compose.foundation.MagnifierKt.magnifier.4.m(this.f).invoke(this.e)).A();
                            return !OffsetKt.d(androidx.compose.foundation.MagnifierKt.magnifier.4.j(this.g)) || !OffsetKt.d(v) ? 0x7FC000007FC00000L : Offset.v(androidx.compose.foundation.MagnifierKt.magnifier.4.j(this.g), v);
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return Offset.d(this.b());
                        }
                    });
                    composer0.O(state4);
                }
                composer0.g0();
                composer0.V(0xE2A708A4);
                State state5 = composer0.W();
                if(state5 == composer$Companion0.a()) {
                    state5 = SnapshotStateKt.c(new a() {
                        final State e;

                        {
                            this.e = state0;
                            super(0);
                        }

                        @l
                        public final Boolean b() {
                            return Boolean.valueOf(OffsetKt.d(androidx.compose.foundation.MagnifierKt.magnifier.4.q(this.e)));
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return this.b();
                        }
                    });
                    composer0.O(state5);
                }
                composer0.g0();
                composer0.V(0xE2A708A4);
                D d0 = composer0.W();
                if(d0 == composer$Companion0.a()) {
                    d0 = K.b(1, 0, i.b, 2, null);
                    composer0.O(d0);
                }
                composer0.g0();
                float f = this.i.b() ? 0.0f : this.g;
                MagnifierStyle magnifierStyle0 = MagnifierStyle.g.c();
                Boolean boolean0 = Boolean.valueOf(L.g(this.j, magnifierStyle0));
                EffectsKt.j(new Object[]{((View)object0), ((Density)object1), f, this.j, boolean0}, new o(this.j, ((View)object0), ((Density)object1), this.g, d0, state3, state5, state4, state1, mutableState0, state2, null) {
                    int k;
                    private Object l;
                    final PlatformMagnifierFactory m;
                    final MagnifierStyle n;
                    final View o;
                    final Density p;
                    final float q;
                    final D r;
                    final State s;
                    final State t;
                    final State u;
                    final State v;
                    final MutableState w;
                    final State x;

                    {
                        this.m = platformMagnifierFactory0;
                        this.n = magnifierStyle0;
                        this.o = view0;
                        this.p = density0;
                        this.q = f;
                        this.r = d0;
                        this.s = state0;
                        this.t = state1;
                        this.u = state2;
                        this.v = state3;
                        this.w = mutableState0;
                        this.x = state4;
                        super(2, d1);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new androidx.compose.foundation.MagnifierKt.magnifier.4.1(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((androidx.compose.foundation.MagnifierKt.magnifier.4.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        PlatformMagnifier platformMagnifier1;
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                O o0 = (O)this.l;
                                PlatformMagnifier platformMagnifier0 = this.m.a(this.n, this.o, this.p, this.q);
                                g l0$g0 = new g();
                                long v = platformMagnifier0.a();
                                Density density0 = this.p;
                                Function1 function10 = androidx.compose.foundation.MagnifierKt.magnifier.4.p(this.s);
                                if(function10 != null) {
                                    function10.invoke(DpSize.c(density0.m(IntSizeKt.f(v))));
                                }
                                l0$g0.a = v;
                                androidx.compose.foundation.MagnifierKt.magnifier.4.1.1 magnifierKt$magnifier$4$1$10 = new o(null) {
                                    int k;
                                    final PlatformMagnifier l;

                                    {
                                        this.l = platformMagnifier0;
                                        super(2, d0);
                                    }

                                    @m
                                    public final Object a(@l S0 s00, @m d d0) {
                                        return ((androidx.compose.foundation.MagnifierKt.magnifier.4.1.1)this.create(s00, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        return new androidx.compose.foundation.MagnifierKt.magnifier.4.1.1(this.l, d0);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.a(((S0)object0), ((d)object1));
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        if(this.k != 0) {
                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                        }
                                        f0.n(object0);
                                        this.l.c();
                                        return S0.a;
                                    }
                                };
                                k.U0(k.e1(this.r, magnifierKt$magnifier$4$1$10), o0);
                                try {
                                    kotlinx.coroutines.flow.i i0 = SnapshotStateKt.v(new a(this.p, this.t, this.u, this.v, this.w, this.x, l0$g0, this.s) {
                                        final PlatformMagnifier e;
                                        final Density f;
                                        final State g;
                                        final State h;
                                        final State i;
                                        final MutableState j;
                                        final State k;
                                        final g l;
                                        final State m;

                                        {
                                            this.e = platformMagnifier0;
                                            this.f = density0;
                                            this.g = state0;
                                            this.h = state1;
                                            this.i = state2;
                                            this.j = mutableState0;
                                            this.k = state3;
                                            this.l = l0$g0;
                                            this.m = state4;
                                            super(0);
                                        }

                                        @Override  // A3.a
                                        public Object invoke() {
                                            this.invoke();
                                            return S0.a;
                                        }

                                        public final void invoke() {
                                            if(androidx.compose.foundation.MagnifierKt.magnifier.4.k(this.g)) {
                                                long v = androidx.compose.foundation.MagnifierKt.magnifier.4.q(this.h);
                                                long v1 = ((Offset)androidx.compose.foundation.MagnifierKt.magnifier.4.n(this.i).invoke(this.f)).A();
                                                long v2 = OffsetKt.d(v1) ? Offset.v(androidx.compose.foundation.MagnifierKt.magnifier.4.j(this.j), v1) : 0x7FC000007FC00000L;
                                                this.e.b(v, v2, androidx.compose.foundation.MagnifierKt.magnifier.4.o(this.k));
                                                long v3 = this.e.a();
                                                g l0$g0 = this.l;
                                                Density density0 = this.f;
                                                State state0 = this.m;
                                                if(!IntSize.h(v3, l0$g0.a)) {
                                                    l0$g0.a = v3;
                                                    Function1 function10 = androidx.compose.foundation.MagnifierKt.magnifier.4.p(state0);
                                                    if(function10 != null) {
                                                        function10.invoke(DpSize.c(density0.m(IntSizeKt.f(v3))));
                                                    }
                                                }
                                            }
                                            else {
                                                this.e.dismiss();
                                            }
                                        }
                                    });
                                    this.l = platformMagnifier0;
                                    this.k = 1;
                                    if(k.y(i0, this) == object1) {
                                        return object1;
                                    }
                                }
                                catch(Throwable throwable0) {
                                    platformMagnifier1 = platformMagnifier0;
                                    platformMagnifier1.dismiss();
                                    throw throwable0;
                                }
                                platformMagnifier1 = platformMagnifier0;
                                break;
                            }
                            case 1: {
                                platformMagnifier1 = (PlatformMagnifier)this.l;
                                try {
                                    f0.n(object0);
                                    break;
                                }
                                catch(Throwable throwable0) {
                                }
                                platformMagnifier1.dismiss();
                                throw throwable0;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        platformMagnifier1.dismiss();
                        return S0.a;
                    }
                }, composer0, 72);
                composer0.V(0x44FAF204);
                boolean z = composer0.t(mutableState0);
                androidx.compose.foundation.MagnifierKt.magnifier.4.2.1 magnifierKt$magnifier$4$2$10 = composer0.W();
                if(z || magnifierKt$magnifier$4$2$10 == composer$Companion0.a()) {
                    magnifierKt$magnifier$4$2$10 = new Function1() {
                        final MutableState e;

                        {
                            this.e = mutableState0;
                            super(1);
                        }

                        public final void a(@l LayoutCoordinates layoutCoordinates0) {
                            L.p(layoutCoordinates0, "it");
                            long v = LayoutCoordinatesKt.f(layoutCoordinates0);
                            androidx.compose.foundation.MagnifierKt.magnifier.4.l(this.e, v);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(((LayoutCoordinates)object0));
                            return S0.a;
                        }
                    };
                    composer0.O(magnifierKt$magnifier$4$2$10);
                }
                composer0.g0();
                Modifier modifier1 = DrawModifierKt.a(OnGloballyPositionedModifierKt.a(modifier0, magnifierKt$magnifier$4$2$10), new Function1() {
                    final D e;

                    {
                        this.e = d0;
                        super(1);
                    }

                    public final void a(@l DrawScope drawScope0) {
                        L.p(drawScope0, "$this$drawBehind");
                        this.e.d(S0.a);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((DrawScope)object0));
                        return S0.a;
                    }
                });
                composer0.V(0x44FAF204);
                boolean z1 = composer0.t(state4);
                androidx.compose.foundation.MagnifierKt.magnifier.4.4.1 magnifierKt$magnifier$4$4$10 = composer0.W();
                if(z1 || magnifierKt$magnifier$4$4$10 == composer$Companion0.a()) {
                    magnifierKt$magnifier$4$4$10 = new Function1() {
                        final State e;

                        {
                            this.e = state0;
                            super(1);
                        }

                        public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                            L.p(semanticsPropertyReceiver0, "$this$semantics");
                            semanticsPropertyReceiver0.a(MagnifierKt.a(), new a() {
                                final State e;

                                {
                                    this.e = state0;
                                    super(0);
                                }

                                public final long b() {
                                    return androidx.compose.foundation.MagnifierKt.magnifier.4.q(this.e);
                                }

                                @Override  // A3.a
                                public Object invoke() {
                                    return Offset.d(this.b());
                                }
                            });
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(((SemanticsPropertyReceiver)object0));
                            return S0.a;
                        }
                    };
                    composer0.O(magnifierKt$magnifier$4$4$10);
                }
                composer0.g0();
                Modifier modifier2 = SemanticsModifierKt.c(modifier1, false, magnifierKt$magnifier$4$4$10, 1, null);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier2;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.i(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }

            private static final long j(MutableState mutableState0) {
                return ((Offset)mutableState0.getValue()).A();
            }

            private static final boolean k(State state0) {
                return ((Boolean)state0.getValue()).booleanValue();
            }

            private static final void l(MutableState mutableState0, long v) {
                mutableState0.setValue(Offset.d(v));
            }

            private static final Function1 m(State state0) {
                return (Function1)state0.getValue();
            }

            private static final Function1 n(State state0) {
                return (Function1)state0.getValue();
            }

            private static final float o(State state0) {
                return ((Number)state0.getValue()).floatValue();
            }

            private static final Function1 p(State state0) {
                return (Function1)state0.getValue();
            }

            private static final long q(State state0) {
                return ((Offset)state0.getValue()).A();
            }
        }, 1, null);
    }

    public static Modifier f(Modifier modifier0, Function1 function10, Function1 function11, float f, MagnifierStyle magnifierStyle0, Function1 function12, int v, Object object0) {
        if((v & 2) != 0) {
            function11 = androidx.compose.foundation.MagnifierKt.magnifier.1.e;
        }
        if((v & 8) != 0) {
            magnifierStyle0 = MagnifierStyle.g.a();
        }
        if((v & 16) != 0) {
            function12 = null;
        }
        return MagnifierKt.d(modifier0, function10, function11, ((v & 4) == 0 ? f : NaNf), magnifierStyle0, function12);

        final class androidx.compose.foundation.MagnifierKt.magnifier.1 extends N implements Function1 {
            public static final androidx.compose.foundation.MagnifierKt.magnifier.1 e;

            static {
                androidx.compose.foundation.MagnifierKt.magnifier.1.e = new androidx.compose.foundation.MagnifierKt.magnifier.1();
            }

            androidx.compose.foundation.MagnifierKt.magnifier.1() {
                super(1);
            }

            public final long a(@l Density density0) {
                L.p(density0, "$this$null");
                return 0x7FC000007FC00000L;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Offset.d(this.a(((Density)object0)));
            }
        }

    }
}

