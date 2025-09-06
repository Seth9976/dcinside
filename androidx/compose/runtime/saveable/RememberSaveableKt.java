package androidx.compose.runtime.saveable;

import A3.a;
import A3.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.c;
import y4.l;
import y4.m;

@s0({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,200:1\n76#2:201\n83#3,3:202\n1114#4,6:205\n*S KotlinDebug\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n*L\n81#1:201\n83#1:202,3\n83#1:205,6\n*E\n"})
public final class RememberSaveableKt {
    private static final int a = 36;

    static {
    }

    private static final Saver b(Saver saver0) {
        L.n(saver0, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.a(new o(saver0) {
            final Saver e;

            {
                this.e = saver0;
                super(2);
            }

            @m
            public final MutableState a(@l SaverScope saverScope0, @l MutableState mutableState0) {
                L.p(saverScope0, "$this$Saver");
                L.p(mutableState0, "state");
                if(!(mutableState0 instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                Object object0 = mutableState0.getValue();
                Object object1 = this.e.a(saverScope0, object0);
                SnapshotMutationPolicy snapshotMutationPolicy0 = ((SnapshotMutableState)mutableState0).a();
                L.n(snapshotMutationPolicy0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return SnapshotStateKt.j(object1, snapshotMutationPolicy0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((SaverScope)object0), ((MutableState)object1));
            }
        }, new Function1(saver0) {
            final Saver e;

            {
                this.e = saver0;
                super(1);
            }

            @m
            public final MutableState a(@l MutableState mutableState0) {
                Object object1;
                L.p(mutableState0, "it");
                if(!(mutableState0 instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if(mutableState0.getValue() == null) {
                    object1 = null;
                }
                else {
                    Object object0 = mutableState0.getValue();
                    L.m(object0);
                    object1 = this.e.b(object0);
                }
                SnapshotMutationPolicy snapshotMutationPolicy0 = ((SnapshotMutableState)mutableState0).a();
                L.n(snapshotMutationPolicy0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$2?>");
                MutableState mutableState1 = SnapshotStateKt.j(object1, snapshotMutationPolicy0);
                L.n(mutableState1, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$2>");
                return mutableState1;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((MutableState)object0));
            }
        });
    }

    @Composable
    @l
    public static final MutableState c(@l Object[] arr_object, @l Saver saver0, @m String s, @l a a0, @m Composer composer0, int v, int v1) {
        L.p(arr_object, "inputs");
        L.p(saver0, "stateSaver");
        L.p(a0, "init");
        composer0.V(-202053668);
        if((v1 & 4) != 0) {
            s = null;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(-202053668, v, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:136)");
        }
        MutableState mutableState0 = (MutableState)RememberSaveableKt.d(Arrays.copyOf(arr_object, arr_object.length), RememberSaveableKt.b(saver0), s, a0, composer0, v & 0x380 | 8 | v & 0x1C00, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return mutableState0;
    }

    @Composable
    @l
    public static final Object d(@l Object[] arr_object, @m Saver saver0, @m String s, @l a a0, @m Composer composer0, int v, int v1) {
        L.p(arr_object, "inputs");
        L.p(a0, "init");
        composer0.V(0x1A56BFAB);
        if((v1 & 2) != 0) {
            saver0 = SaverKt.b();
        }
        Object object0 = null;
        if((v1 & 4) != 0) {
            s = null;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x1A56BFAB, v, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:65)");
        }
        composer0.V(0x3F24A645);
        if(s == null || s.length() == 0) {
            s = Integer.toString(ComposablesKt.j(composer0, 0), c.a(RememberSaveableKt.a));
            L.o(s, "toString(this, checkRadix(radix))");
        }
        composer0.g0();
        L.n(saver0, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        SaveableStateRegistry saveableStateRegistry0 = (SaveableStateRegistry)composer0.L(SaveableStateRegistryKt.b());
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        composer0.V(0xDE219177);
        boolean z = false;
        for(int v2 = 0; v2 < arr_object1.length; ++v2) {
            z |= composer0.t(arr_object1[v2]);
        }
        Object object1 = composer0.W();
        if(z || object1 == Composer.a.a()) {
            if(saveableStateRegistry0 != null) {
                Object object2 = saveableStateRegistry0.f(s);
                if(object2 != null) {
                    object0 = saver0.b(object2);
                }
            }
            object1 = object0 == null ? a0.invoke() : object0;
            composer0.O(object1);
        }
        composer0.g0();
        if(saveableStateRegistry0 != null) {
            EffectsKt.b(saveableStateRegistry0, s, new Function1(saveableStateRegistry0, s, SnapshotStateKt.t(saver0, composer0, 0), SnapshotStateKt.t(object1, composer0, 0)) {
                final SaveableStateRegistry e;
                final String f;
                final State g;
                final State h;

                {
                    this.e = saveableStateRegistry0;
                    this.f = s;
                    this.g = state0;
                    this.h = state1;
                    super(1);
                }

                @l
                public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                    L.p(disposableEffectScope0, "$this$DisposableEffect");
                    androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable.1.valueProvider.1 rememberSaveableKt$rememberSaveable$1$valueProvider$10 = new a(this.h, this.e) {
                        final State e;
                        final State f;
                        final SaveableStateRegistry g;

                        {
                            this.e = state0;
                            this.f = state1;
                            this.g = saveableStateRegistry0;
                            super(0);
                        }

                        @Override  // A3.a
                        @m
                        public final Object invoke() {
                            return ((Saver)this.e.getValue()).a(new SaverScope() {
                                @Override  // androidx.compose.runtime.saveable.SaverScope
                                public final boolean a(@l Object object0) {
                                    L.p(object0, "it");
                                    return this.a.a(object0);
                                }
                            }, this.f.getValue());
                        }
                    };
                    Object object0 = rememberSaveableKt$rememberSaveable$1$valueProvider$10.invoke();
                    RememberSaveableKt.e(this.e, object0);
                    return new DisposableEffectResult() {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            this.a.a();
                        }
                    };
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((DisposableEffectScope)object0));
                }
            }, composer0, 0);
        }
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return object1;
    }

    private static final void e(SaveableStateRegistry saveableStateRegistry0, Object object0) {
        String s;
        if(object0 != null && !saveableStateRegistry0.a(object0)) {
            if(!(object0 instanceof SnapshotMutableState)) {
                s = object0 + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
            }
            else if(((SnapshotMutableState)object0).a() != SnapshotStateKt.l() && ((SnapshotMutableState)object0).a() != SnapshotStateKt.w() && ((SnapshotMutableState)object0).a() != SnapshotStateKt.s()) {
                s = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
            else {
                s = "MutableState containing " + ((SnapshotMutableState)object0).getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            }
            throw new IllegalArgumentException(s);
        }
    }
}

