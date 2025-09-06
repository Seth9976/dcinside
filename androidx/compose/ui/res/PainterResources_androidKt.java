package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nPainterResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,116:1\n76#2:117\n76#2:135\n25#3:118\n67#3,3:125\n66#3:128\n1114#4,6:119\n1114#4,6:129\n*S KotlinDebug\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n*L\n58#1:117\n88#1:135\n60#1:118\n69#1:125,3\n69#1:128\n60#1:119,6\n69#1:129,6\n*E\n"})
public final class PainterResources_androidKt {
    @l
    private static final String a = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG";

    private static final ImageBitmap b(Resources resources0, int v) {
        try {
            return ImageResources_androidKt.b(ImageBitmap.a, resources0, v);
        }
        catch(Throwable unused_ex) {
            throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
        }
    }

    @Composable
    private static final ImageVector c(Resources.Theme resources$Theme0, Resources resources0, int v, int v1, Composer composer0, int v2) {
        composer0.V(0x14D7D89);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x14D7D89, v2, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:81)");
        }
        ImageVectorCache imageVectorCache0 = (ImageVectorCache)composer0.L(AndroidCompositionLocals_androidKt.h());
        Key imageVectorCache$Key0 = new Key(resources$Theme0, v);
        ImageVectorEntry imageVectorCache$ImageVectorEntry0 = imageVectorCache0.b(imageVectorCache$Key0);
        if(imageVectorCache$ImageVectorEntry0 == null) {
            XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
            L.o(xmlResourceParser0, "res.getXml(id)");
            if(!L.g(XmlVectorParser_androidKt.m(xmlResourceParser0).getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
            }
            imageVectorCache$ImageVectorEntry0 = VectorResources_androidKt.a(resources$Theme0, resources0, xmlResourceParser0, v1);
            imageVectorCache0.d(imageVectorCache$Key0, imageVectorCache$ImageVectorEntry0);
        }
        ImageVector imageVector0 = imageVectorCache$ImageVectorEntry0.f();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return imageVector0;
    }

    @Composable
    @l
    public static final Painter d(@DrawableRes int v, @m Composer composer0, int v1) {
        Painter painter0;
        composer0.V(0x1C403A8F);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x1C403A8F, v1, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context0 = (Context)composer0.L(AndroidCompositionLocals_androidKt.g());
        Resources resources0 = Resources_androidKt.a(composer0, 0);
        composer0.V(0xE2A708A4);
        TypedValue typedValue0 = composer0.W();
        Companion composer$Companion0 = Composer.a;
        if(typedValue0 == composer$Companion0.a()) {
            typedValue0 = new TypedValue();
            composer0.O(typedValue0);
        }
        composer0.g0();
        resources0.getValue(v, typedValue0, true);
        CharSequence charSequence0 = typedValue0.string;
        if(charSequence0 == null || !v.c3(charSequence0, ".xml", false, 2, null)) {
            composer0.V(0xD3FEF7AC);
            Resources.Theme resources$Theme1 = context0.getTheme();
            composer0.V(0x607FB4C4);
            boolean z = composer0.t(charSequence0);
            boolean z1 = composer0.t(v);
            boolean z2 = composer0.t(resources$Theme1);
            ImageBitmap imageBitmap0 = composer0.W();
            if((z1 | z | z2) != 0 || imageBitmap0 == composer$Companion0.a()) {
                imageBitmap0 = PainterResources_androidKt.b(resources0, v);
                composer0.O(imageBitmap0);
            }
            composer0.g0();
            painter0 = new BitmapPainter(imageBitmap0, 0L, 0L, 6, null);
        }
        else {
            composer0.V(0xD3FEF711);
            Resources.Theme resources$Theme0 = context0.getTheme();
            L.o(resources$Theme0, "context.theme");
            painter0 = VectorPainterKt.c(PainterResources_androidKt.c(resources$Theme0, resources0, v, typedValue0.changingConfigurations, composer0, v1 << 6 & 0x380 | 72), composer0, 0);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return painter0;
    }
}

