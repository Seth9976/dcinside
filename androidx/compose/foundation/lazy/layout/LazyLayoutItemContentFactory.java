package androidx.compose.foundation.lazy.layout;

import A3.a;
import A3.o;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
public final class LazyLayoutItemContentFactory {
    @s0({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n76#2:113\n102#2,2:114\n1#3:116\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n*L\n83#1:113\n83#1:114,2\n*E\n"})
    final class CachedItemContent {
        @l
        private final Object a;
        @m
        private final Object b;
        @l
        private final MutableState c;
        @m
        private o d;
        final LazyLayoutItemContentFactory e;

        public CachedItemContent(int v, @l Object object0, @m Object object1) {
            L.p(object0, "key");
            this.e = lazyLayoutItemContentFactory0;
            super();
            this.a = object0;
            this.b = object1;
            this.c = SnapshotStateKt__SnapshotStateKt.g(v, null, 2, null);
        }

        private final o c() {
            return ComposableLambdaKt.c(0x53AF4291, true, new o(this) {
                final LazyLayoutItemContentFactory e;
                final CachedItemContent f;

                {
                    this.e = lazyLayoutItemContentFactory0;
                    this.f = lazyLayoutItemContentFactory$CachedItemContent0;
                    super(2);
                }

                @Composable
                public final void a(@m Composer composer0, int v) {
                    int v1;
                    if((v & 11) == 2 && composer0.c()) {
                        composer0.m();
                        return;
                    }
                    if(ComposerKt.g0()) {
                        ComposerKt.w0(0x53AF4291, v, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:89)");
                    }
                    LazyLayoutItemProvider lazyLayoutItemProvider0 = (LazyLayoutItemProvider)this.e.d().invoke();
                    Integer integer0 = (Integer)lazyLayoutItemProvider0.G().get(this.f.e());
                    if(integer0 == null) {
                        v1 = this.f.f();
                    }
                    else {
                        this.f.h(integer0.intValue());
                        v1 = integer0.intValue();
                    }
                    composer0.V(-715770513);
                    if(v1 < lazyLayoutItemProvider0.getItemCount()) {
                        Object object0 = lazyLayoutItemProvider0.D(v1);
                        if(L.g(object0, this.f.e())) {
                            this.e.a.b(object0, ComposableLambdaKt.b(composer0, 0xB62871FC, true, new o(v1) {
                                final LazyLayoutItemProvider e;
                                final int f;

                                {
                                    this.e = lazyLayoutItemProvider0;
                                    this.f = v;
                                    super(2);
                                }

                                @Composable
                                public final void a(@m Composer composer0, int v) {
                                    if((v & 11) == 2 && composer0.c()) {
                                        composer0.m();
                                        return;
                                    }
                                    if(ComposerKt.g0()) {
                                        ComposerKt.w0(0xB62871FC, v, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous>.<anonymous> (LazyLayoutItemContentFactory.kt:97)");
                                    }
                                    this.e.F(this.f, composer0, 0);
                                    if(ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    this.a(((Composer)object0), ((Number)object1).intValue());
                                    return S0.a;
                                }
                            }), composer0, 568);
                        }
                    }
                    composer0.g0();
                    EffectsKt.c(this.f.e(), new Function1() {
                        final CachedItemContent e;

                        {
                            this.e = lazyLayoutItemContentFactory$CachedItemContent0;
                            super(1);
                        }

                        @l
                        public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                            L.p(disposableEffectScope0, "$this$DisposableEffect");
                            return new DisposableEffectResult() {
                                @Override  // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    this.a.d = null;
                                }
                            };
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.a(((DisposableEffectScope)object0));
                        }
                    }, composer0, 8);
                    if(ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        @l
        public final o d() {
            o o0 = this.d;
            if(o0 == null) {
                o0 = this.c();
                this.d = o0;
            }
            return o0;
        }

        @l
        public final Object e() {
            return this.a;
        }

        public final int f() {
            return ((Number)this.c.getValue()).intValue();
        }

        @m
        public final Object g() {
            return this.b;
        }

        private final void h(int v) {
            this.c.setValue(v);
        }
    }

    @l
    private final SaveableStateHolder a;
    @l
    private final a b;
    @l
    private final Map c;

    public LazyLayoutItemContentFactory(@l SaveableStateHolder saveableStateHolder0, @l a a0) {
        L.p(saveableStateHolder0, "saveableStateHolder");
        L.p(a0, "itemProvider");
        super();
        this.a = saveableStateHolder0;
        this.b = a0;
        this.c = new LinkedHashMap();
    }

    @l
    public final o b(int v, @l Object object0) {
        L.p(object0, "key");
        CachedItemContent lazyLayoutItemContentFactory$CachedItemContent0 = (CachedItemContent)this.c.get(object0);
        Object object1 = ((LazyLayoutItemProvider)this.b.invoke()).E(v);
        if(lazyLayoutItemContentFactory$CachedItemContent0 != null && lazyLayoutItemContentFactory$CachedItemContent0.f() == v && L.g(lazyLayoutItemContentFactory$CachedItemContent0.g(), object1)) {
            return lazyLayoutItemContentFactory$CachedItemContent0.d();
        }
        CachedItemContent lazyLayoutItemContentFactory$CachedItemContent1 = new CachedItemContent(this, v, object0, object1);
        this.c.put(object0, lazyLayoutItemContentFactory$CachedItemContent1);
        return lazyLayoutItemContentFactory$CachedItemContent1.d();
    }

    @m
    public final Object c(@m Object object0) {
        CachedItemContent lazyLayoutItemContentFactory$CachedItemContent0 = (CachedItemContent)this.c.get(object0);
        if(lazyLayoutItemContentFactory$CachedItemContent0 != null) {
            return lazyLayoutItemContentFactory$CachedItemContent0.g();
        }
        LazyLayoutItemProvider lazyLayoutItemProvider0 = (LazyLayoutItemProvider)this.b.invoke();
        Integer integer0 = (Integer)lazyLayoutItemProvider0.G().get(object0);
        return integer0 == null ? null : lazyLayoutItemProvider0.E(((int)integer0));
    }

    @l
    public final a d() {
        return this.b;
    }
}

