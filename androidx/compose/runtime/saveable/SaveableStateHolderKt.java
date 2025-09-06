package androidx.compose.runtime.saveable;

import A3.a;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,142:1\n76#2:143\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderKt\n*L\n65#1:143\n*E\n"})
public final class SaveableStateHolderKt {
    @Composable
    @l
    public static final SaveableStateHolder a(@m Composer composer0, int v) {
        composer0.V(0xEBD1AB);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xEBD1AB, v, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:58)");
        }
        Saver saver0 = SaveableStateHolderImpl.d.a();
        SaveableStateHolder saveableStateHolder0 = (SaveableStateHolderImpl)RememberSaveableKt.d(new Object[0], saver0, null, androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder.1.e, composer0, 3080, 4);
        ((SaveableStateHolderImpl)saveableStateHolder0).i(((SaveableStateRegistry)composer0.L(SaveableStateRegistryKt.b())));
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return saveableStateHolder0;

        final class androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder.1 extends N implements a {
            public static final androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder.1 e;

            static {
                androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder.1.e = new androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder.1();
            }

            androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder.1() {
                super(0);
            }

            @l
            public final SaveableStateHolderImpl b() {
                return new SaveableStateHolderImpl(null, 1, null);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

    }
}

