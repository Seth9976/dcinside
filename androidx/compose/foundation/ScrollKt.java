package androidx.compose.foundation;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,410:1\n36#2:411\n1114#3,6:412\n135#4:418\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n*L\n72#1:411\n72#1:412,6\n317#1:418\n*E\n"})
public final class ScrollKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l ScrollState scrollState0, boolean z, @m FlingBehavior flingBehavior0, boolean z1) {
        L.p(modifier0, "<this>");
        L.p(scrollState0, "state");
        return ScrollKt.d(modifier0, scrollState0, z1, flingBehavior0, z, false);
    }

    public static Modifier b(Modifier modifier0, ScrollState scrollState0, boolean z, FlingBehavior flingBehavior0, boolean z1, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        if((v & 4) != 0) {
            flingBehavior0 = null;
        }
        if((v & 8) != 0) {
            z1 = false;
        }
        return ScrollKt.a(modifier0, scrollState0, z, flingBehavior0, z1);
    }

    @Composable
    @l
    public static final ScrollState c(int v, @m Composer composer0, int v1, int v2) {
        composer0.V(0xA8B93939);
        if((v2 & 1) != 0) {
            v = 0;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xA8B93939, v1, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:70)");
        }
        Saver saver0 = ScrollState.i.a();
        composer0.V(0x44FAF204);
        boolean z = composer0.t(v);
        androidx.compose.foundation.ScrollKt.rememberScrollState.1.1 scrollKt$rememberScrollState$1$10 = composer0.W();
        if(z || scrollKt$rememberScrollState$1$10 == Composer.a.a()) {
            scrollKt$rememberScrollState$1$10 = new a(v) {
                final int e;

                {
                    this.e = v;
                    super(0);
                }

                @l
                public final ScrollState b() {
                    return new ScrollState(this.e);
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
            composer0.O(scrollKt$rememberScrollState$1$10);
        }
        composer0.g0();
        ScrollState scrollState0 = (ScrollState)RememberSaveableKt.d(new Object[0], saver0, null, scrollKt$rememberScrollState$1$10, composer0, 72, 4);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return scrollState0;
    }

    // 去混淆评级： 低(30)
    private static final Modifier d(Modifier modifier0, ScrollState scrollState0, boolean z, FlingBehavior flingBehavior0, boolean z1, boolean z2) {
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(z2, z, scrollState0, z1, flingBehavior0) {
            final boolean e;
            final boolean f;
            final ScrollState g;
            final boolean h;
            final FlingBehavior i;

            {
                this.e = z;
                this.f = z1;
                this.g = scrollState0;
                this.h = z2;
                this.i = flingBehavior0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(1478351300);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(1478351300, v, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:264)");
                }
                ScrollableDefaults scrollableDefaults0 = ScrollableDefaults.a;
                OverscrollEffect overscrollEffect0 = scrollableDefaults0.b(composer0, 6);
                composer0.V(0x2E20B340);
                composer0.V(0xE2A708A4);
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.W();
                if(compositionScopedCoroutineScopeCanceller0 == Composer.a.a()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.m(i.a, composer0));
                    composer0.O(compositionScopedCoroutineScopeCanceller1);
                    compositionScopedCoroutineScopeCanceller0 = compositionScopedCoroutineScopeCanceller1;
                }
                composer0.g0();
                composer0.g0();
                Modifier modifier1 = SemanticsModifierKt.c(Modifier.m0, false, new Function1(this.e, this.h, this.g, compositionScopedCoroutineScopeCanceller0.b()) {
                    final boolean e;
                    final boolean f;
                    final boolean g;
                    final ScrollState h;
                    final O i;

                    {
                        this.e = z;
                        this.f = z1;
                        this.g = z2;
                        this.h = scrollState0;
                        this.i = o0;
                        super(1);
                    }

                    public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                        L.p(semanticsPropertyReceiver0, "$this$semantics");
                        ScrollAxisRange scrollAxisRange0 = new ScrollAxisRange(new a() {
                            final ScrollState e;

                            {
                                this.e = scrollState0;
                                super(0);
                            }

                            @l
                            public final Float b() {
                                return (float)this.e.o();
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                return this.b();
                            }
                        }, new a() {
                            final ScrollState e;

                            {
                                this.e = scrollState0;
                                super(0);
                            }

                            @l
                            public final Float b() {
                                return (float)this.e.n();
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                return this.b();
                            }
                        }, this.e);
                        if(this.f) {
                            SemanticsPropertiesKt.c1(semanticsPropertyReceiver0, scrollAxisRange0);
                        }
                        else {
                            SemanticsPropertiesKt.K0(semanticsPropertyReceiver0, scrollAxisRange0);
                        }
                        if(this.g) {
                            SemanticsPropertiesKt.z0(semanticsPropertyReceiver0, null, new o(this.f, this.h) {
                                final O e;
                                final boolean f;
                                final ScrollState g;

                                {
                                    this.e = o0;
                                    this.f = z;
                                    this.g = scrollState0;
                                    super(2);
                                }

                                @l
                                public final Boolean a(float f, float f1) {
                                    androidx.compose.foundation.ScrollKt.scroll.2.semantics.1.1.1 scrollKt$scroll$2$semantics$1$1$10 = new o(this.g, f1, f, null) {
                                        int k;
                                        final boolean l;
                                        final ScrollState m;
                                        final float n;
                                        final float o;

                                        {
                                            this.l = z;
                                            this.m = scrollState0;
                                            this.n = f;
                                            this.o = f1;
                                            super(2, d0);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @l
                                        public final d create(@m Object object0, @l d d0) {
                                            return new androidx.compose.foundation.ScrollKt.scroll.2.semantics.1.1.1(this.l, this.m, this.n, this.o, d0);
                                        }

                                        @Override  // A3.o
                                        public Object invoke(Object object0, Object object1) {
                                            return this.invoke(((O)object0), ((d)object1));
                                        }

                                        @m
                                        public final Object invoke(@l O o0, @m d d0) {
                                            return ((androidx.compose.foundation.ScrollKt.scroll.2.semantics.1.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @m
                                        public final Object invokeSuspend(@l Object object0) {
                                            Object object1 = b.l();
                                            switch(this.k) {
                                                case 0: {
                                                    f0.n(object0);
                                                    if(this.l) {
                                                        L.n(this.m, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                                        this.k = 1;
                                                        if(ScrollExtensionsKt.b(this.m, this.n, null, this, 2, null) == object1) {
                                                            return object1;
                                                        }
                                                    }
                                                    else {
                                                        L.n(this.m, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                                        this.k = 2;
                                                        if(ScrollExtensionsKt.b(this.m, this.o, null, this, 2, null) == object1) {
                                                            return object1;
                                                        }
                                                    }
                                                    return S0.a;
                                                }
                                                case 1: 
                                                case 2: {
                                                    f0.n(object0);
                                                    return S0.a;
                                                }
                                                default: {
                                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                }
                                            }
                                        }
                                    };
                                    k.f(this.e, null, null, scrollKt$scroll$2$semantics$1$1$10, 3, null);
                                    return true;
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    return this.a(((Number)object0).floatValue(), ((Number)object1).floatValue());
                                }
                            }, 1, null);
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((SemanticsPropertyReceiver)object0));
                        return S0.a;
                    }
                }, 1, null);
                Orientation orientation0 = this.e ? Orientation.a : Orientation.b;
                boolean z = scrollableDefaults0.c(((LayoutDirection)composer0.L(CompositionLocalsKt.p())), orientation0, this.f);
                Modifier modifier2 = ScrollableKt.j(Modifier.m0, this.g, orientation0, overscrollEffect0, this.h, z, this.i, this.g.m());
                ScrollingLayoutModifier scrollingLayoutModifier0 = new ScrollingLayoutModifier(this.g, this.f, this.e);
                Modifier modifier3 = OverscrollKt.a(ClipScrollableContainerKt.a(modifier1, orientation0), overscrollEffect0).r0(modifier2).r0(scrollingLayoutModifier0);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier3;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n*L\n1#1,170:1\n318#2,7:171\n*E\n"})
        public final class androidx.compose.foundation.ScrollKt.scroll..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final ScrollState e;
            final boolean f;
            final FlingBehavior g;
            final boolean h;
            final boolean i;

            public androidx.compose.foundation.ScrollKt.scroll..inlined.debugInspectorInfo.1(ScrollState scrollState0, boolean z, FlingBehavior flingBehavior0, boolean z1, boolean z2) {
                this.e = scrollState0;
                this.f = z;
                this.g = flingBehavior0;
                this.h = z1;
                this.i = z2;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("scroll");
                inspectorInfo0.b().c("state", this.e);
                inspectorInfo0.b().c("reverseScrolling", Boolean.valueOf(this.f));
                inspectorInfo0.b().c("flingBehavior", this.g);
                inspectorInfo0.b().c("isScrollable", Boolean.valueOf(this.h));
                inspectorInfo0.b().c("isVertical", Boolean.valueOf(this.i));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier e(@l Modifier modifier0, @l ScrollState scrollState0, boolean z, @m FlingBehavior flingBehavior0, boolean z1) {
        L.p(modifier0, "<this>");
        L.p(scrollState0, "state");
        return ScrollKt.d(modifier0, scrollState0, z1, flingBehavior0, z, true);
    }

    public static Modifier f(Modifier modifier0, ScrollState scrollState0, boolean z, FlingBehavior flingBehavior0, boolean z1, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        if((v & 4) != 0) {
            flingBehavior0 = null;
        }
        if((v & 8) != 0) {
            z1 = false;
        }
        return ScrollKt.e(modifier0, scrollState0, z, flingBehavior0, z1);
    }
}

