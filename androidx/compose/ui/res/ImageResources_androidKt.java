package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap.Companion;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nImageResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,60:1\n76#2:61\n25#3:62\n36#3:69\n1114#4,6:63\n1114#4,6:70\n*S KotlinDebug\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n*L\n54#1:61\n55#1:62\n58#1:69\n55#1:63,6\n58#1:70,6\n*E\n"})
public final class ImageResources_androidKt {
    @Composable
    @l
    public static final ImageBitmap a(@l Companion imageBitmap$Companion0, @DrawableRes int v, @m Composer composer0, int v1) {
        L.p(imageBitmap$Companion0, "<this>");
        composer0.V(-304919470);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-304919470, v1, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Context context0 = (Context)composer0.L(AndroidCompositionLocals_androidKt.g());
        composer0.V(0xE2A708A4);
        TypedValue typedValue0 = composer0.W();
        androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.a;
        if(typedValue0 == composer$Companion0.a()) {
            typedValue0 = new TypedValue();
            composer0.O(typedValue0);
        }
        composer0.g0();
        context0.getResources().getValue(v, typedValue0, true);
        CharSequence charSequence0 = typedValue0.string;
        L.m(charSequence0);
        composer0.V(0x44FAF204);
        boolean z = composer0.t(charSequence0.toString());
        ImageBitmap imageBitmap0 = composer0.W();
        if(z || imageBitmap0 == composer$Companion0.a()) {
            Resources resources0 = context0.getResources();
            L.o(resources0, "context.resources");
            imageBitmap0 = ImageResources_androidKt.b(imageBitmap$Companion0, resources0, v);
            composer0.O(imageBitmap0);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return imageBitmap0;
    }

    @l
    public static final ImageBitmap b(@l Companion imageBitmap$Companion0, @l Resources resources0, @DrawableRes int v) {
        L.p(imageBitmap$Companion0, "<this>");
        L.p(resources0, "res");
        Drawable drawable0 = resources0.getDrawable(v, null);
        L.n(drawable0, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Bitmap bitmap0 = ((BitmapDrawable)drawable0).getBitmap();
        L.o(bitmap0, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
        return AndroidImageBitmap_androidKt.c(bitmap0);
    }
}

