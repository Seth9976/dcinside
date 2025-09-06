package androidx.compose.foundation.lazy.layout;

import A3.a;
import A3.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry.Entry;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n76#2:107\n102#2,2:108\n1855#3,2:110\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n*L\n68#1:107\n68#1:108,2\n75#1:110,2\n*E\n"})
final class LazySaveableStateHolder implements SaveableStateHolder, SaveableStateRegistry {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Saver a(@m SaveableStateRegistry saveableStateRegistry0) {
            androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.Companion.saver.2 lazySaveableStateHolder$Companion$saver$20 = new Function1() {
                final SaveableStateRegistry e;

                {
                    this.e = saveableStateRegistry0;
                    super(1);
                }

                @m
                public final LazySaveableStateHolder a(@l Map map0) {
                    L.p(map0, "restored");
                    return new LazySaveableStateHolder(this.e, map0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Map)object0));
                }
            };
            return SaverKt.a(androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.Companion.saver.1.e, lazySaveableStateHolder$Companion$saver$20);

            @s0({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$Companion$saver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
            final class androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.Companion.saver.1 extends N implements o {
                public static final androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.Companion.saver.1 e;

                static {
                    androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.Companion.saver.1.e = new androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.Companion.saver.1();
                }

                androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.Companion.saver.1() {
                    super(2);
                }

                @m
                public final Map a(@l SaverScope saverScope0, @l LazySaveableStateHolder lazySaveableStateHolder0) {
                    L.p(saverScope0, "$this$Saver");
                    L.p(lazySaveableStateHolder0, "it");
                    Map map0 = lazySaveableStateHolder0.c();
                    return map0.isEmpty() ? null : map0;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((SaverScope)object0), ((LazySaveableStateHolder)object1));
                }
            }

        }
    }

    @l
    private final SaveableStateRegistry a;
    @l
    private final MutableState b;
    @l
    private final Set c;
    @l
    public static final Companion d;

    static {
        LazySaveableStateHolder.d = new Companion(null);
    }

    public LazySaveableStateHolder(@l SaveableStateRegistry saveableStateRegistry0) {
        L.p(saveableStateRegistry0, "wrappedRegistry");
        super();
        this.a = saveableStateRegistry0;
        this.b = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.c = new LinkedHashSet();
    }

    public LazySaveableStateHolder(@m SaveableStateRegistry saveableStateRegistry0, @m Map map0) {
        this(SaveableStateRegistryKt.a(map0, new Function1() {
            final SaveableStateRegistry e;

            {
                this.e = saveableStateRegistry0;
                super(1);
            }

            @l
            public final Boolean a(@l Object object0) {
                L.p(object0, "it");
                return this.e == null ? true : Boolean.valueOf(this.e.a(object0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(object0);
            }
        }));
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean a(@l Object object0) {
        L.p(object0, "value");
        return this.a.a(object0);
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateHolder
    @Composable
    public void b(@l Object object0, @l o o0, @m Composer composer0, int v) {
        L.p(object0, "key");
        L.p(o0, "content");
        Composer composer1 = composer0.G(0xD671DF0F);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xD671DF0F, v, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
        }
        SaveableStateHolder saveableStateHolder0 = this.h();
        if(saveableStateHolder0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        saveableStateHolder0.b(object0, o0, composer1, v & 0x70 | 520);
        EffectsKt.c(object0, new Function1(object0) {
            final LazySaveableStateHolder e;
            final Object f;

            {
                this.e = lazySaveableStateHolder0;
                this.f = object0;
                super(1);
            }

            @l
            public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                L.p(disposableEffectScope0, "$this$DisposableEffect");
                this.e.c.remove(this.f);
                return new DisposableEffectResult() {
                    @Override  // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        this.f.c.add(this.b);
                    }
                };
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((DisposableEffectScope)object0));
            }
        }, composer1, 8);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, o0, v) {
                final LazySaveableStateHolder e;
                final Object f;
                final o g;
                final int h;

                {
                    this.e = lazySaveableStateHolder0;
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

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    @l
    public Map c() {
        SaveableStateHolder saveableStateHolder0 = this.h();
        if(saveableStateHolder0 != null) {
            for(Object object0: this.c) {
                saveableStateHolder0.d(object0);
            }
        }
        return this.a.c();
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateHolder
    public void d(@l Object object0) {
        L.p(object0, "key");
        SaveableStateHolder saveableStateHolder0 = this.h();
        if(saveableStateHolder0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        saveableStateHolder0.d(object0);
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    @l
    public Entry e(@l String s, @l a a0) {
        L.p(s, "key");
        L.p(a0, "valueProvider");
        return this.a.e(s, a0);
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    @m
    public Object f(@l String s) {
        L.p(s, "key");
        return this.a.f(s);
    }

    @m
    public final SaveableStateHolder h() {
        return (SaveableStateHolder)this.b.getValue();
    }

    public final void i(@m SaveableStateHolder saveableStateHolder0) {
        this.b.setValue(saveableStateHolder0);
    }
}

