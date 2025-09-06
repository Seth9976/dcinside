package androidx.compose.foundation.lazy.layout;

import A3.a;
import A3.o;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyLayoutSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,151:1\n474#2,4:152\n478#2,2:160\n482#2:166\n25#3:156\n83#3,3:167\n1114#4,3:157\n1117#4,3:163\n1114#4,6:170\n474#5:162\n*S KotlinDebug\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt\n*L\n47#1:152,4\n47#1:160,2\n47#1:166\n47#1:156\n49#1:167,3\n47#1:157,3\n47#1:163,3\n49#1:170,6\n47#1:162\n*E\n"})
public final class LazyLayoutSemanticsKt {
    @Composable
    @l
    public static final Modifier a(@l Modifier modifier0, @l LazyLayoutItemProvider lazyLayoutItemProvider0, @l LazyLayoutSemanticState lazyLayoutSemanticState0, @l Orientation orientation0, boolean z, boolean z1, @m Composer composer0, int v) {
        L.p(modifier0, "<this>");
        L.p(lazyLayoutItemProvider0, "itemProvider");
        L.p(lazyLayoutSemanticState0, "state");
        L.p(orientation0, "orientation");
        composer0.V(290103779);
        if(ComposerKt.g0()) {
            ComposerKt.w0(290103779, v, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:39)");
        }
        composer0.V(0x2E20B340);
        composer0.V(0xE2A708A4);
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.W();
        if(compositionScopedCoroutineScopeCanceller0 == Composer.a.a()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.m(i.a, composer0));
            composer0.O(compositionScopedCoroutineScopeCanceller1);
            compositionScopedCoroutineScopeCanceller0 = compositionScopedCoroutineScopeCanceller1;
        }
        composer0.g0();
        O o0 = compositionScopedCoroutineScopeCanceller0.b();
        composer0.g0();
        Object[] arr_object = {lazyLayoutItemProvider0, lazyLayoutSemanticState0, orientation0, Boolean.valueOf(z)};
        composer0.V(0xDE219177);
        boolean z2 = false;
        for(int v1 = 0; v1 < 4; ++v1) {
            z2 |= composer0.t(arr_object[v1]);
        }
        Modifier modifier1 = composer0.W();
        if(z2 || modifier1 == Composer.a.a()) {
            boolean z3 = orientation0 == Orientation.a;
            androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics.1.1 lazyLayoutSemanticsKt$lazyLayoutSemantics$1$10 = new Function1(new Function1(lazyLayoutItemProvider0) {
                final LazyLayoutItemProvider e;

                {
                    this.e = lazyLayoutItemProvider0;
                    super(1);
                }

                @l
                public final Integer a(@l Object object0) {
                    L.p(object0, "needle");
                    int v = this.e.getItemCount();
                    int v1;
                    for(v1 = 0; true; ++v1) {
                        if(v1 >= v) {
                            v1 = -1;
                            break;
                        }
                        if(L.g(this.e.D(v1), object0)) {
                            break;
                        }
                    }
                    return v1;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(object0);
                }
            }, z3, new ScrollAxisRange(new a(lazyLayoutSemanticState0) {
                final LazyLayoutSemanticState e;

                {
                    this.e = lazyLayoutSemanticState0;
                    super(0);
                }

                @l
                public final Float b() {
                    return this.e.getCurrentPosition();
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            }, new a(lazyLayoutSemanticState0, lazyLayoutItemProvider0) {
                final LazyLayoutSemanticState e;
                final LazyLayoutItemProvider f;

                {
                    this.e = lazyLayoutSemanticState0;
                    this.f = lazyLayoutItemProvider0;
                    super(0);
                }

                // 去混淆评级： 低(20)
                @l
                public final Float b() {
                    return this.e.a() ? ((float)(((float)this.f.getItemCount()) + 1.0f)) : this.e.getCurrentPosition();
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            }, z1), (z ? new o(z3, o0, lazyLayoutSemanticState0) {
                final boolean e;
                final O f;
                final LazyLayoutSemanticState g;

                {
                    this.e = z;
                    this.f = o0;
                    this.g = lazyLayoutSemanticState0;
                    super(2);
                }

                @l
                public final Boolean a(float f, float f1) {
                    if(this.e) {
                        f = f1;
                    }
                    androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics.1.scrollByAction.1.1 lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$10 = new o(f, null) {
                        int k;
                        final LazyLayoutSemanticState l;
                        final float m;

                        {
                            this.l = lazyLayoutSemanticState0;
                            this.m = f;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            return new androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics.1.scrollByAction.1.1(this.l, this.m, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics.1.scrollByAction.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object1 = b.l();
                            switch(this.k) {
                                case 0: {
                                    f0.n(object0);
                                    this.k = 1;
                                    return this.l.c(this.m, this) == object1 ? object1 : S0.a;
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
                    k.f(this.f, null, null, lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$10, 3, null);
                    return true;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((Number)object0).floatValue(), ((Number)object1).floatValue());
                }
            } : null), (z ? new Function1(lazyLayoutItemProvider0, o0, lazyLayoutSemanticState0) {
                final LazyLayoutItemProvider e;
                final O f;
                final LazyLayoutSemanticState g;

                {
                    this.e = lazyLayoutItemProvider0;
                    this.f = o0;
                    this.g = lazyLayoutSemanticState0;
                    super(1);
                }

                @l
                public final Boolean a(int v) {
                    boolean z = v >= 0 && v < this.e.getItemCount();
                    LazyLayoutItemProvider lazyLayoutItemProvider0 = this.e;
                    if(!z) {
                        throw new IllegalArgumentException(("Can\'t scroll to index " + v + ", it is out of bounds [0, " + lazyLayoutItemProvider0.getItemCount() + ')').toString());
                    }
                    androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics.1.scrollToIndexAction.1.2 lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$20 = new o(v, null) {
                        int k;
                        final LazyLayoutSemanticState l;
                        final int m;

                        {
                            this.l = lazyLayoutSemanticState0;
                            this.m = v;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            return new androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics.1.scrollToIndexAction.1.2(this.l, this.m, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics.1.scrollToIndexAction.1.2)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object1 = b.l();
                            switch(this.k) {
                                case 0: {
                                    f0.n(object0);
                                    this.k = 1;
                                    return this.l.b(this.m, this) == object1 ? object1 : S0.a;
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
                    k.f(this.f, null, null, lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$20, 3, null);
                    return true;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Number)object0).intValue());
                }
            } : null), lazyLayoutSemanticState0.d()) {
                final Function1 e;
                final boolean f;
                final ScrollAxisRange g;
                final o h;
                final Function1 i;
                final CollectionInfo j;

                {
                    this.e = function10;
                    this.f = z;
                    this.g = scrollAxisRange0;
                    this.h = o0;
                    this.i = function11;
                    this.j = collectionInfo0;
                    super(1);
                }

                public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                    L.p(semanticsPropertyReceiver0, "$this$semantics");
                    SemanticsPropertiesKt.c0(semanticsPropertyReceiver0, this.e);
                    if(this.f) {
                        SemanticsPropertiesKt.c1(semanticsPropertyReceiver0, this.g);
                    }
                    else {
                        SemanticsPropertiesKt.K0(semanticsPropertyReceiver0, this.g);
                    }
                    o o0 = this.h;
                    if(o0 != null) {
                        SemanticsPropertiesKt.z0(semanticsPropertyReceiver0, null, o0, 1, null);
                    }
                    Function1 function10 = this.i;
                    if(function10 != null) {
                        SemanticsPropertiesKt.B0(semanticsPropertyReceiver0, null, function10, 1, null);
                    }
                    SemanticsPropertiesKt.D0(semanticsPropertyReceiver0, this.j);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((SemanticsPropertyReceiver)object0));
                    return S0.a;
                }
            };
            modifier1 = SemanticsModifierKt.c(Modifier.m0, false, lazyLayoutSemanticsKt$lazyLayoutSemantics$1$10, 1, null);
            composer0.O(modifier1);
        }
        composer0.g0();
        Modifier modifier2 = modifier0.r0(modifier1);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return modifier2;
    }
}

