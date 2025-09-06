package androidx.compose.runtime.saveable;

import A3.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.S0;
import kotlin.collections.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n145#2,2:143\n25#2:145\n147#2,2:152\n1114#3,6:146\n1855#4,2:154\n1#5:156\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n*L\n76#1:143,2\n77#1:145\n76#1:152,2\n77#1:146,6\n102#1:154,2\n*E\n"})
final class SaveableStateHolderImpl implements SaveableStateHolder {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Saver a() {
            return SaveableStateHolderImpl.e;
        }
    }

    public final class RegistryHolder {
        @l
        private final Object a;
        private boolean b;
        @l
        private final SaveableStateRegistry c;
        final SaveableStateHolderImpl d;

        public RegistryHolder(@l Object object0) {
            L.p(object0, "key");
            this.d = saveableStateHolderImpl0;
            super();
            this.a = object0;
            this.b = true;
            this.c = SaveableStateRegistryKt.a(((Map)saveableStateHolderImpl0.a.get(object0)), new Function1() {
                final SaveableStateHolderImpl e;

                {
                    this.e = saveableStateHolderImpl0;
                    super(1);
                }

                @l
                public final Boolean a(@l Object object0) {
                    L.p(object0, "it");
                    SaveableStateRegistry saveableStateRegistry0 = this.e.g();
                    return saveableStateRegistry0 == null ? true : Boolean.valueOf(saveableStateRegistry0.a(object0));
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(object0);
                }
            });
        }

        @l
        public final Object a() {
            return this.a;
        }

        @l
        public final SaveableStateRegistry b() {
            return this.c;
        }

        public final boolean c() {
            return this.b;
        }

        public final void d(@l Map map0) {
            L.p(map0, "map");
            if(this.b) {
                Map map1 = this.c.c();
                if(map1.isEmpty()) {
                    map0.remove(this.a);
                    return;
                }
                map0.put(this.a, map1);
            }
        }

        public final void e(boolean z) {
            this.b = z;
        }
    }

    @l
    private final Map a;
    @l
    private final Map b;
    @m
    private SaveableStateRegistry c;
    @l
    public static final Companion d;
    @l
    private static final Saver e;

    static {
        SaveableStateHolderImpl.d = new Companion(null);
        SaveableStateHolderImpl.e = SaverKt.a(SaveableStateHolderImpl.Companion.Saver.1.e, SaveableStateHolderImpl.Companion.Saver.2.e);
    }

    public SaveableStateHolderImpl() {
        this(null, 1, null);
    }

    public SaveableStateHolderImpl(@l Map map0) {
        L.p(map0, "savedStates");
        super();
        this.a = map0;
        this.b = new LinkedHashMap();
    }

    public SaveableStateHolderImpl(Map map0, int v, w w0) {
        if((v & 1) != 0) {
            map0 = new LinkedHashMap();
        }
        this(map0);
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateHolder
    @Composable
    public void b(@l Object object0, @l o o0, @m Composer composer0, int v) {
        L.p(object0, "key");
        L.p(o0, "content");
        Composer composer1 = composer0.G(0xB88FC293);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xB88FC293, v, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:74)");
        }
        composer1.V(0x1A7D48FD);
        composer1.i(0xCF, object0);
        composer1.V(0xE2A708A4);
        RegistryHolder saveableStateHolderImpl$RegistryHolder0 = composer1.W();
        if(saveableStateHolderImpl$RegistryHolder0 == Composer.a.a()) {
            SaveableStateRegistry saveableStateRegistry0 = this.g();
            if(!(saveableStateRegistry0 == null ? true : saveableStateRegistry0.a(object0))) {
                throw new IllegalArgumentException(("Type of the key " + object0 + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            saveableStateHolderImpl$RegistryHolder0 = new RegistryHolder(this, object0);
            composer1.O(saveableStateHolderImpl$RegistryHolder0);
        }
        composer1.g0();
        CompositionLocalKt.b(new ProvidedValue[]{SaveableStateRegistryKt.b().f(saveableStateHolderImpl$RegistryHolder0.b())}, o0, composer1, v & 0x70 | 8);
        androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider.1.1 saveableStateHolderImpl$SaveableStateProvider$1$10 = new Function1(object0, saveableStateHolderImpl$RegistryHolder0) {
            final SaveableStateHolderImpl e;
            final Object f;
            final RegistryHolder g;

            {
                this.e = saveableStateHolderImpl0;
                this.f = object0;
                this.g = saveableStateHolderImpl$RegistryHolder0;
                super(1);
            }

            @l
            public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                L.p(disposableEffectScope0, "$this$DisposableEffect");
                boolean z = this.e.b.containsKey(this.f);
                Object object0 = this.f;
                if(z) {
                    throw new IllegalArgumentException(("Key " + object0 + " was used multiple times ").toString());
                }
                this.e.a.remove(this.f);
                this.e.b.put(this.f, this.g);
                return new DisposableEffectResult() {
                    @Override  // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        this.e.d(this.f.a);
                        this.f.b.remove(this.c);
                    }
                };
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((DisposableEffectScope)object0));
            }
        };
        EffectsKt.c(S0.a, saveableStateHolderImpl$SaveableStateProvider$1$10, composer1, 6);
        composer1.U();
        composer1.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, o0, v) {
                final SaveableStateHolderImpl e;
                final Object f;
                final o g;
                final int h;

                {
                    this.e = saveableStateHolderImpl0;
                    this.f = object0;
                    this.g = o0;
                    this.h = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    this.e.b(this.f, this.g, composer0, (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateHolder
    public void d(@l Object object0) {
        L.p(object0, "key");
        RegistryHolder saveableStateHolderImpl$RegistryHolder0 = (RegistryHolder)this.b.get(object0);
        if(saveableStateHolderImpl$RegistryHolder0 != null) {
            saveableStateHolderImpl$RegistryHolder0.e(false);
            return;
        }
        this.a.remove(object0);
    }

    @m
    public final SaveableStateRegistry g() {
        return this.c;
    }

    private final Map h() {
        Map map0 = Y.J0(this.a);
        for(Object object0: this.b.values()) {
            ((RegistryHolder)object0).d(map0);
        }
        return map0.isEmpty() ? null : map0;
    }

    public final void i(@m SaveableStateRegistry saveableStateRegistry0) {
        this.c = saveableStateRegistry0;
    }
}

