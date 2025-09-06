package androidx.compose.ui.res;

import androidx.annotation.ArrayRes;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class StringResources_androidKt {
    @Composable
    @ReadOnlyComposable
    @l
    public static final String a(@PluralsRes int v, int v1, @m Composer composer0, int v2) {
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x6A60FE9A, v2, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:73)");
        }
        String s = Resources_androidKt.a(composer0, 0).getQuantityString(v, v1);
        L.o(s, "resources.getQuantityString(id, count)");
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return s;
    }

    @Composable
    @ReadOnlyComposable
    @l
    public static final String b(@PluralsRes int v, int v1, @l Object[] arr_object, @m Composer composer0, int v2) {
        L.p(arr_object, "formatArgs");
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x1F2F822D, v2, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String s = Resources_androidKt.a(composer0, 0).getQuantityString(v, v1, Arrays.copyOf(arr_object, arr_object.length));
        L.o(s, "resources.getQuantityStr…g(id, count, *formatArgs)");
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return s;
    }

    @Composable
    @ReadOnlyComposable
    @l
    public static final String[] c(@ArrayRes int v, @m Composer composer0, int v1) {
        if(ComposerKt.g0()) {
            ComposerKt.w0(1562162650, v1, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:59)");
        }
        String[] arr_s = Resources_androidKt.a(composer0, 0).getStringArray(v);
        L.o(arr_s, "resources.getStringArray(id)");
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return arr_s;
    }

    @Composable
    @ReadOnlyComposable
    @l
    public static final String d(@StringRes int v, @m Composer composer0, int v1) {
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x48F30C41, v1, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String s = Resources_androidKt.a(composer0, 0).getString(v);
        L.o(s, "resources.getString(id)");
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return s;
    }

    @Composable
    @ReadOnlyComposable
    @l
    public static final String e(@StringRes int v, @l Object[] arr_object, @m Composer composer0, int v1) {
        L.p(arr_object, "formatArgs");
        if(ComposerKt.g0()) {
            ComposerKt.w0(2071230100, v1, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String s = Resources_androidKt.a(composer0, 0).getString(v, Arrays.copyOf(arr_object, arr_object.length));
        L.o(s, "resources.getString(id, *formatArgs)");
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return s;
    }
}

