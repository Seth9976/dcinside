package androidx.compose.ui.viewinterop;

import A3.a;
import A3.o;
import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.J;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,374:1\n25#2:375\n251#2,10:386\n25#2:396\n286#2,10:407\n1114#3,6:376\n1114#3,6:397\n76#4:382\n76#4:383\n76#4:384\n76#4:385\n76#4:403\n76#4:404\n76#4:405\n76#4:406\n76#4:417\n76#4:418\n*S KotlinDebug\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n*L\n101#1:375\n115#1:386,10\n204#1:396\n219#1:407,10\n101#1:376,6\n204#1:397,6\n105#1:382\n106#1:383\n112#1:384\n113#1:385\n209#1:403\n210#1:404\n216#1:405\n217#1:406\n241#1:417\n243#1:418\n*E\n"})
public final class AndroidView_androidKt {
    @l
    private static final Function1 a;
    @l
    private static final AndroidView_androidKt.NoOpScrollConnection.1 b;

    static {
        AndroidView_androidKt.a = AndroidView_androidKt.NoOpUpdate.1.e;
        AndroidView_androidKt.b = new AndroidView_androidKt.NoOpScrollConnection.1();
    }

    @Composable
    @UiComposable
    public static final void a(@l Function1 function10, @m Modifier modifier0, @m Function1 function11, @m Composer composer0, int v, int v1) {
        int v2;
        L.p(function10, "factory");
        Composer composer1 = composer0.G(0x95ADE287);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.Y(function10) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.t(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.Y(function11) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.c()) {
            if((v1 & 2) != 0) {
                modifier0 = Modifier.m0;
            }
            if((v1 & 4) != 0) {
                function11 = AndroidView_androidKt.a;
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x95ADE287, v2, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:95)");
            }
            composer1.V(0xE2A708A4);
            NestedScrollDispatcher nestedScrollDispatcher0 = composer1.W();
            if(nestedScrollDispatcher0 == Composer.a.a()) {
                nestedScrollDispatcher0 = new NestedScrollDispatcher();
                composer1.O(nestedScrollDispatcher0);
            }
            composer1.g0();
            Modifier modifier1 = ComposedModifierKt.k(composer1, NestedScrollModifierKt.a(modifier0, AndroidView_androidKt.b, nestedScrollDispatcher0));
            Object object0 = composer1.L(CompositionLocalsKt.i());
            Object object1 = composer1.L(CompositionLocalsKt.p());
            Object object2 = composer1.L(AndroidCompositionLocals_androidKt.i());
            Object object3 = composer1.L(AndroidCompositionLocals_androidKt.j());
            a a0 = AndroidView_androidKt.d(function10, nestedScrollDispatcher0, composer1, v2 & 14 | 0x40);
            composer1.V(0x7076B8D0);
            if(!(composer1.H() instanceof UiApplier)) {
                ComposablesKt.n();
            }
            composer1.K();
            if(composer1.E()) {
                composer1.k(new a(a0) {
                    final a e;

                    {
                        this.e = a0;
                        super(0);
                    }

                    @Override  // A3.a
                    @l
                    public final Object invoke() {
                        return this.e.invoke();
                    }
                });
            }
            else {
                composer1.f();
            }
            Composer composer2 = Updater.b(composer1);
            AndroidView_androidKt.g(composer2, modifier1, ((Density)object0), ((LifecycleOwner)object2), ((SavedStateRegistryOwner)object3), ((LayoutDirection)object1));
            Updater.j(composer2, function11, androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.1.1.e);
            composer1.g();
            composer1.g0();
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(function10, modifier0, function11, v, v1) {
                final Function1 e;
                final Modifier f;
                final Function1 g;
                final int h;
                final int i;

                {
                    this.e = function10;
                    this.f = modifier0;
                    this.g = function11;
                    this.h = v;
                    this.i = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AndroidView_androidKt.a(this.e, this.f, this.g, composer0, (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)), this.i);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.1.1 extends N implements o {
            public static final androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.1.1 e;

            static {
                androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.1.1.e = new androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.1.1();
            }

            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.1.1() {
                super(2);
            }

            public final void a(@l LayoutNode layoutNode0, @l Function1 function10) {
                L.p(layoutNode0, "$this$set");
                L.p(function10, "it");
                AndroidView_androidKt.f(layoutNode0).setUpdateBlock(function10);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((LayoutNode)object0), ((Function1)object1));
                return S0.a;
            }
        }

    }

    @Composable
    @ExperimentalComposeUiApi
    @UiComposable
    public static final void b(@l Function1 function10, @l Function1 function11, @m Modifier modifier0, @m Function1 function12, @m Function1 function13, @m Composer composer0, int v, int v1) {
        Modifier modifier1;
        Function1 function15;
        Function1 function14;
        int v2;
        L.p(function10, "factory");
        L.p(function11, "onReset");
        Composer composer1 = composer0.G(-841537049);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.Y(function10) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.Y(function11) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.t(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function14 = function12;
        }
        else if((v & 0x1C00) == 0) {
            function14 = function12;
            v2 |= (composer1.Y(function14) ? 0x800 : 0x400);
        }
        else {
            function14 = function12;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            function15 = function13;
        }
        else if((0xE000 & v) == 0) {
            function15 = function13;
            v2 |= (composer1.Y(function15) ? 0x4000 : 0x2000);
        }
        else {
            function15 = function13;
        }
        if((0xB6DB & v2) != 9362 || !composer1.c()) {
            modifier1 = (v1 & 4) == 0 ? modifier0 : Modifier.m0;
            if((v1 & 8) != 0) {
                function14 = AndroidView_androidKt.a;
            }
            if((v1 & 16) != 0) {
                function15 = AndroidView_androidKt.a;
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(-841537049, v2, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:187)");
            }
            composer1.V(0xE2A708A4);
            NestedScrollDispatcher nestedScrollDispatcher0 = composer1.W();
            if(nestedScrollDispatcher0 == Composer.a.a()) {
                nestedScrollDispatcher0 = new NestedScrollDispatcher();
                composer1.O(nestedScrollDispatcher0);
            }
            composer1.g0();
            Modifier modifier2 = ComposedModifierKt.k(composer1, NestedScrollModifierKt.a(modifier1, AndroidView_androidKt.b, nestedScrollDispatcher0));
            Object object0 = composer1.L(CompositionLocalsKt.i());
            Object object1 = composer1.L(CompositionLocalsKt.p());
            Object object2 = composer1.L(AndroidCompositionLocals_androidKt.i());
            Object object3 = composer1.L(AndroidCompositionLocals_androidKt.j());
            a a0 = AndroidView_androidKt.d(function10, nestedScrollDispatcher0, composer1, v2 & 14 | 0x40);
            composer1.V(1405779621);
            if(!(composer1.H() instanceof UiApplier)) {
                ComposablesKt.n();
            }
            composer1.h();
            if(composer1.E()) {
                composer1.k(new a(a0) {
                    final a e;

                    {
                        this.e = a0;
                        super(0);
                    }

                    @Override  // A3.a
                    @l
                    public final Object invoke() {
                        return this.e.invoke();
                    }
                });
            }
            else {
                composer1.f();
            }
            Composer composer2 = Updater.b(composer1);
            AndroidView_androidKt.g(composer2, modifier2, ((Density)object0), ((LifecycleOwner)object2), ((SavedStateRegistryOwner)object3), ((LayoutDirection)object1));
            Updater.j(composer2, function11, androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.1.e);
            Updater.j(composer2, function14, androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.2.e);
            Updater.j(composer2, function15, androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.3.e);
            composer1.g();
            composer1.g0();
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(function10, function11, modifier1, function14, function15, v, v1) {
                final Function1 e;
                final Function1 f;
                final Modifier g;
                final Function1 h;
                final Function1 i;
                final int j;
                final int k;

                {
                    this.e = function10;
                    this.f = function11;
                    this.g = modifier0;
                    this.h = function12;
                    this.i = function13;
                    this.j = v;
                    this.k = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AndroidView_androidKt.b(this.e, this.f, this.g, this.h, this.i, composer0, (this.j | 1) & -920350135 | ((0x24924924 & (this.j | 1)) >> 1 | 306783378 & (this.j | 1)) | (306783378 & (this.j | 1)) << 1 & (0x24924924 & (this.j | 1)), this.k);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.1 extends N implements o {
            public static final androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.1 e;

            static {
                androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.1.e = new androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.1();
            }

            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.1() {
                super(2);
            }

            public final void a(@l LayoutNode layoutNode0, @l Function1 function10) {
                L.p(layoutNode0, "$this$set");
                L.p(function10, "it");
                AndroidView_androidKt.f(layoutNode0).setResetBlock(function10);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((LayoutNode)object0), ((Function1)object1));
                return S0.a;
            }
        }


        final class androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.2 extends N implements o {
            public static final androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.2 e;

            static {
                androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.2.e = new androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.2();
            }

            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.2() {
                super(2);
            }

            public final void a(@l LayoutNode layoutNode0, @l Function1 function10) {
                L.p(layoutNode0, "$this$set");
                L.p(function10, "it");
                AndroidView_androidKt.f(layoutNode0).setUpdateBlock(function10);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((LayoutNode)object0), ((Function1)object1));
                return S0.a;
            }
        }


        final class androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.3 extends N implements o {
            public static final androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.3 e;

            static {
                androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.3.e = new androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.3();
            }

            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.3() {
                super(2);
            }

            public final void a(@l LayoutNode layoutNode0, @l Function1 function10) {
                L.p(layoutNode0, "$this$set");
                L.p(function10, "it");
                AndroidView_androidKt.f(layoutNode0).setReleaseBlock(function10);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((LayoutNode)object0), ((Function1)object1));
                return S0.a;
            }
        }

    }

    @Composable
    private static final a d(Function1 function10, NestedScrollDispatcher nestedScrollDispatcher0, Composer composer0, int v) {
        composer0.V(0xE65520CA);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xE65520CA, v, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:236)");
        }
        a a0 = new a(((Context)composer0.L(AndroidCompositionLocals_androidKt.g())), function10, ComposablesKt.u(composer0, 0), nestedScrollDispatcher0, ((SaveableStateRegistry)composer0.L(SaveableStateRegistryKt.b())), String.valueOf(ComposablesKt.j(composer0, 0))) {
            final Context e;
            final Function1 f;
            final CompositionContext g;
            final NestedScrollDispatcher h;
            final SaveableStateRegistry i;
            final String j;

            {
                this.e = context0;
                this.f = function10;
                this.g = compositionContext0;
                this.h = nestedScrollDispatcher0;
                this.i = saveableStateRegistry0;
                this.j = s;
                super(0);
            }

            @l
            public final LayoutNode b() {
                return new ViewFactoryHolder(this.e, this.f, this.g, this.h, this.i, this.j).getLayoutNode();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return a0;
    }

    @l
    public static final Function1 e() {
        return AndroidView_androidKt.a;
    }

    private static final ViewFactoryHolder f(LayoutNode layoutNode0) {
        AndroidViewHolder androidViewHolder0 = layoutNode0.h0();
        if(androidViewHolder0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        L.n(androidViewHolder0, "null cannot be cast to non-null type androidx.compose.ui.viewinterop.ViewFactoryHolder<T of androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder>");
        return (ViewFactoryHolder)androidViewHolder0;
    }

    private static final void g(Composer composer0, Modifier modifier0, Density density0, LifecycleOwner lifecycleOwner0, SavedStateRegistryOwner savedStateRegistryOwner0, LayoutDirection layoutDirection0) {
        Updater.j(composer0, modifier0, androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.1.e);
        Updater.j(composer0, density0, androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.2.e);
        Updater.j(composer0, lifecycleOwner0, androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.3.e);
        Updater.j(composer0, savedStateRegistryOwner0, androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.4.e);
        Updater.j(composer0, layoutDirection0, androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.5.e);

        final class androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.1 extends N implements o {
            public static final androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.1 e;

            static {
                androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.1.e = new androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.1();
            }

            androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.1() {
                super(2);
            }

            public final void a(@l LayoutNode layoutNode0, @l Modifier modifier0) {
                L.p(layoutNode0, "$this$set");
                L.p(modifier0, "it");
                AndroidView_androidKt.f(layoutNode0).setModifier(modifier0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((LayoutNode)object0), ((Modifier)object1));
                return S0.a;
            }
        }


        final class androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.2 extends N implements o {
            public static final androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.2 e;

            static {
                androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.2.e = new androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.2();
            }

            androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.2() {
                super(2);
            }

            public final void a(@l LayoutNode layoutNode0, @l Density density0) {
                L.p(layoutNode0, "$this$set");
                L.p(density0, "it");
                AndroidView_androidKt.f(layoutNode0).setDensity(density0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((LayoutNode)object0), ((Density)object1));
                return S0.a;
            }
        }


        final class androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.3 extends N implements o {
            public static final androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.3 e;

            static {
                androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.3.e = new androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.3();
            }

            androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.3() {
                super(2);
            }

            public final void a(@l LayoutNode layoutNode0, @l LifecycleOwner lifecycleOwner0) {
                L.p(layoutNode0, "$this$set");
                L.p(lifecycleOwner0, "it");
                AndroidView_androidKt.f(layoutNode0).setLifecycleOwner(lifecycleOwner0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((LayoutNode)object0), ((LifecycleOwner)object1));
                return S0.a;
            }
        }


        final class androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.4 extends N implements o {
            public static final androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.4 e;

            static {
                androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.4.e = new androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.4();
            }

            androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.4() {
                super(2);
            }

            public final void a(@l LayoutNode layoutNode0, @l SavedStateRegistryOwner savedStateRegistryOwner0) {
                L.p(layoutNode0, "$this$set");
                L.p(savedStateRegistryOwner0, "it");
                AndroidView_androidKt.f(layoutNode0).setSavedStateRegistryOwner(savedStateRegistryOwner0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((LayoutNode)object0), ((SavedStateRegistryOwner)object1));
                return S0.a;
            }
        }


        final class androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.5 extends N implements o {
            public final class WhenMappings {
                public static final int[] a;

                static {
                    int[] arr_v = new int[LayoutDirection.values().length];
                    try {
                        arr_v[LayoutDirection.a.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[LayoutDirection.b.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    WhenMappings.a = arr_v;
                }
            }

            public static final androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.5 e;

            static {
                androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.5.e = new androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.5();
            }

            androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.5() {
                super(2);
            }

            public final void a(@l LayoutNode layoutNode0, @l LayoutDirection layoutDirection0) {
                L.p(layoutNode0, "$this$set");
                L.p(layoutDirection0, "it");
                ViewFactoryHolder viewFactoryHolder0 = AndroidView_androidKt.f(layoutNode0);
                int v = WhenMappings.a[layoutDirection0.ordinal()];
                int v1 = 1;
                if(v == 1) {
                    v1 = 0;
                }
                else if(v != 2) {
                    throw new J();
                }
                viewFactoryHolder0.setLayoutDirection(v1);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((LayoutNode)object0), ((LayoutDirection)object1));
                return S0.a;
            }
        }

    }
}

