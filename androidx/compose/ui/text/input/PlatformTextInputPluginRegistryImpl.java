package androidx.compose.ui.text.input;

import A3.a;
import A3.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.text.InternalTextApi;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.W0;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@InternalTextApi
@s0({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,335:1\n1#2:336\n36#3:337\n25#3:348\n1057#4,6:338\n1057#4,3:349\n1060#4,3:355\n473#5,4:344\n477#5,2:352\n481#5:358\n473#6:354\n766#7:359\n857#7,2:360\n33#8,6:362\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl\n*L\n167#1:337\n172#1:348\n167#1:338,6\n172#1:349,3\n172#1:355,3\n172#1:344,4\n172#1:352,2\n172#1:358\n172#1:354\n241#1:359\n241#1:360,2\n242#1:362,6\n*E\n"})
public final class PlatformTextInputPluginRegistryImpl implements PlatformTextInputPluginRegistry {
    @StabilityInferred(parameters = 0)
    @InternalTextApi
    @s0({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1#2:336\n*E\n"})
    public static final class AdapterHandle {
        @l
        private final PlatformTextInputAdapter a;
        @l
        private final a b;
        private boolean c;
        public static final int d = 8;

        static {
        }

        public AdapterHandle(@l PlatformTextInputAdapter platformTextInputAdapter0, @l a a0) {
            L.p(platformTextInputAdapter0, "adapter");
            L.p(a0, "onDispose");
            super();
            this.a = platformTextInputAdapter0;
            this.b = a0;
        }

        public final boolean a() {
            if(this.c) {
                throw new IllegalStateException("AdapterHandle already disposed");
            }
            this.c = true;
            return ((Boolean)this.b.invoke()).booleanValue();
        }

        @l
        public final PlatformTextInputAdapter b() {
            return this.a;
        }
    }

    final class AdapterInput implements PlatformTextInput {
        @l
        private final PlatformTextInputPlugin a;
        final PlatformTextInputPluginRegistryImpl b;

        public AdapterInput(@l PlatformTextInputPlugin platformTextInputPlugin0) {
            L.p(platformTextInputPlugin0, "plugin");
            this.b = platformTextInputPluginRegistryImpl0;
            super();
            this.a = platformTextInputPlugin0;
        }

        @Override  // androidx.compose.ui.text.input.PlatformTextInput
        public void a() {
            if(L.g(this.b.d, this.a)) {
                this.b.d = null;
            }
        }

        @Override  // androidx.compose.ui.text.input.PlatformTextInput
        public void b() {
            this.b.d = this.a;
        }
    }

    @s0({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,335:1\n76#2:336\n102#2,2:337\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount\n*L\n291#1:336\n291#1:337,2\n*E\n"})
    final class AdapterWithRefCount {
        @l
        private final PlatformTextInputAdapter a;
        @l
        private final MutableState b;
        final PlatformTextInputPluginRegistryImpl c;

        public AdapterWithRefCount(@l PlatformTextInputAdapter platformTextInputAdapter0) {
            L.p(platformTextInputAdapter0, "adapter");
            this.c = platformTextInputPluginRegistryImpl0;
            super();
            this.a = platformTextInputAdapter0;
            this.b = SnapshotStateKt__SnapshotStateKt.g(0, null, 2, null);
        }

        public final boolean a() {
            this.f(this.c() - 1);
            if(this.c() < 0) {
                throw new IllegalStateException(("AdapterWithRefCount.decrementRefCount called too many times (refCount=" + this.c() + ')').toString());
            }
            if(this.c() == 0) {
                this.c.c = true;
                return true;
            }
            return false;
        }

        @l
        public final PlatformTextInputAdapter b() {
            return this.a;
        }

        private final int c() {
            return ((Number)this.b.getValue()).intValue();
        }

        public final void d() {
            this.f(this.c() + 1);
        }

        public final boolean e() {
            return this.c() == 0;
        }

        private final void f(int v) {
            this.b.setValue(v);
        }
    }

    @l
    private final o a;
    @l
    private final SnapshotStateMap b;
    private boolean c;
    @m
    private PlatformTextInputPlugin d;
    public static final int e;

    static {
    }

    public PlatformTextInputPluginRegistryImpl(@l o o0) {
        L.p(o0, "factory");
        super();
        this.a = o0;
        this.b = SnapshotStateKt.h();
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputPluginRegistry
    @Composable
    @l
    public PlatformTextInputAdapter a(@l PlatformTextInputPlugin platformTextInputPlugin0, @m Composer composer0, int v) {
        L.p(platformTextInputPlugin0, "plugin");
        composer0.V(-845039128);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-845039128, v, -1, "androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter (PlatformTextInputAdapter.kt:161)");
        }
        composer0.V(0x44FAF204);
        boolean z = composer0.t(platformTextInputPlugin0);
        AdapterHandle platformTextInputPluginRegistryImpl$AdapterHandle0 = composer0.W();
        if(z || platformTextInputPluginRegistryImpl$AdapterHandle0 == Composer.a.a()) {
            platformTextInputPluginRegistryImpl$AdapterHandle0 = this.h(platformTextInputPlugin0);
            composer0.O(platformTextInputPluginRegistryImpl$AdapterHandle0);
        }
        composer0.g0();
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
        EffectsKt.c(platformTextInputPluginRegistryImpl$AdapterHandle0, new Function1(compositionScopedCoroutineScopeCanceller0.b(), this) {
            final AdapterHandle e;
            final O f;
            final PlatformTextInputPluginRegistryImpl g;

            {
                this.e = platformTextInputPluginRegistryImpl$AdapterHandle0;
                this.f = o0;
                this.g = platformTextInputPluginRegistryImpl0;
                super(1);
            }

            @l
            public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                L.p(disposableEffectScope0, "$this$DisposableEffect");
                return new DisposableEffectResult() {
                    @Override  // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        if(this.f.a()) {
                            androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter.1.1.1 platformTextInputPluginRegistryImpl$rememberAdapter$1$1$10 = new androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter.1.1.1(this.c, null);
                            k.f(this.g, W0.a, null, platformTextInputPluginRegistryImpl$rememberAdapter$1$1$10, 2, null);
                        }
                    }
                };

                @f(c = "androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1", f = "PlatformTextInputAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                final class androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter.1.1.1 extends kotlin.coroutines.jvm.internal.o implements o {
                    int k;
                    final PlatformTextInputPluginRegistryImpl l;

                    androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter.1.1.1(PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl0, d d0) {
                        this.l = platformTextInputPluginRegistryImpl0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter.1.1.1(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter.1.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.f();
                        return S0.a;
                    }
                }

            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((DisposableEffectScope)object0));
            }
        }, composer0, 8);
        PlatformTextInputAdapter platformTextInputAdapter0 = platformTextInputPluginRegistryImpl$AdapterHandle0.b();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return platformTextInputAdapter0;
    }

    private final void f() {
        if(this.c) {
            this.c = false;
            Set set0 = this.b.entrySet();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: set0) {
                if(((AdapterWithRefCount)((Map.Entry)object0).getValue()).e()) {
                    arrayList0.add(object0);
                }
            }
            int v1 = arrayList0.size();
            for(int v = 0; v < v1; ++v) {
                Map.Entry map$Entry0 = (Map.Entry)arrayList0.get(v);
                PlatformTextInputPlugin platformTextInputPlugin0 = (PlatformTextInputPlugin)map$Entry0.getKey();
                AdapterWithRefCount platformTextInputPluginRegistryImpl$AdapterWithRefCount0 = (AdapterWithRefCount)map$Entry0.getValue();
                if(L.g(this.d, platformTextInputPlugin0)) {
                    this.d = null;
                }
                this.b.remove(platformTextInputPlugin0);
                PlatformTextInputAdapter_androidKt.a(platformTextInputPluginRegistryImpl$AdapterWithRefCount0.b());
            }
        }
    }

    @m
    public final PlatformTextInputAdapter g() {
        AdapterWithRefCount platformTextInputPluginRegistryImpl$AdapterWithRefCount0 = (AdapterWithRefCount)this.b.get(this.d);
        return platformTextInputPluginRegistryImpl$AdapterWithRefCount0 == null ? null : platformTextInputPluginRegistryImpl$AdapterWithRefCount0.b();
    }

    @InternalTextApi
    @l
    public final AdapterHandle h(@l PlatformTextInputPlugin platformTextInputPlugin0) {
        L.p(platformTextInputPlugin0, "plugin");
        AdapterWithRefCount platformTextInputPluginRegistryImpl$AdapterWithRefCount0 = (AdapterWithRefCount)this.b.get(platformTextInputPlugin0);
        if(platformTextInputPluginRegistryImpl$AdapterWithRefCount0 == null) {
            platformTextInputPluginRegistryImpl$AdapterWithRefCount0 = this.i(platformTextInputPlugin0);
        }
        platformTextInputPluginRegistryImpl$AdapterWithRefCount0.d();
        return new AdapterHandle(platformTextInputPluginRegistryImpl$AdapterWithRefCount0.b(), new a() {
            final AdapterWithRefCount e;

            {
                this.e = platformTextInputPluginRegistryImpl$AdapterWithRefCount0;
                super(0);
            }

            @l
            public final Boolean b() {
                return Boolean.valueOf(this.e.a());
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }

    private final AdapterWithRefCount i(PlatformTextInputPlugin platformTextInputPlugin0) {
        AdapterInput platformTextInputPluginRegistryImpl$AdapterInput0 = new AdapterInput(this, platformTextInputPlugin0);
        Object object0 = this.a.invoke(platformTextInputPlugin0, platformTextInputPluginRegistryImpl$AdapterInput0);
        L.n(object0, "null cannot be cast to non-null type T of androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.instantiateAdapter");
        AdapterWithRefCount platformTextInputPluginRegistryImpl$AdapterWithRefCount0 = new AdapterWithRefCount(this, ((PlatformTextInputAdapter)object0));
        this.b.put(platformTextInputPlugin0, platformTextInputPluginRegistryImpl$AdapterWithRefCount0);
        return platformTextInputPluginRegistryImpl$AdapterWithRefCount0;
    }
}

