package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@RequiresApi(api = 26)
@s0({"SMAP\nAndroidPreloadedFont.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPreloadedFont.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,235:1\n151#2,3:236\n33#2,4:239\n154#2,2:243\n38#2:245\n156#2:246\n37#3,2:247\n*S KotlinDebug\n*F\n+ 1 AndroidPreloadedFont.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n*L\n230#1:236,3\n230#1:239,4\n230#1:243,2\n230#1:245\n230#1:246\n232#1:247,2\n*E\n"})
final class TypefaceBuilderCompat {
    @l
    public static final TypefaceBuilderCompat a;

    static {
        TypefaceBuilderCompat.a = new TypefaceBuilderCompat();
    }

    @DoNotInline
    @ExperimentalTextApi
    @m
    public final Typeface a(@l AssetManager assetManager0, @l String s, @m Context context0, @l Settings fontVariation$Settings0) {
        L.p(assetManager0, "assetManager");
        L.p(s, "path");
        L.p(fontVariation$Settings0, "variationSettings");
        return context0 == null ? null : h.a(assetManager0, s).setFontVariationSettings(this.d(fontVariation$Settings0, context0)).build();
    }

    @DoNotInline
    @ExperimentalTextApi
    @m
    public final Typeface b(@l File file0, @m Context context0, @l Settings fontVariation$Settings0) {
        L.p(file0, "file");
        L.p(fontVariation$Settings0, "variationSettings");
        return context0 == null ? null : g.a(file0).setFontVariationSettings(this.d(fontVariation$Settings0, context0)).build();
    }

    @DoNotInline
    @ExperimentalTextApi
    @m
    public final Typeface c(@l ParcelFileDescriptor parcelFileDescriptor0, @m Context context0, @l Settings fontVariation$Settings0) {
        L.p(parcelFileDescriptor0, "fileDescriptor");
        L.p(fontVariation$Settings0, "variationSettings");
        return context0 == null ? null : k.a(parcelFileDescriptor0.getFileDescriptor()).setFontVariationSettings(this.d(fontVariation$Settings0, context0)).build();
    }

    @RequiresApi(26)
    @ExperimentalTextApi
    private final FontVariationAxis[] d(Settings fontVariation$Settings0, Context context0) {
        Density density0;
        if(context0 != null) {
            density0 = AndroidDensity_androidKt.a(context0);
        }
        else if(!fontVariation$Settings0.a()) {
            density0 = DensityKt.a(1.0f, 1.0f);
        }
        else {
            throw new IllegalStateException("Required density, but not provided");
        }
        List list0 = fontVariation$Settings0.b();
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Setting fontVariation$Setting0 = (Setting)list0.get(v1);
            arrayList0.add(i.a(fontVariation$Setting0.a(), fontVariation$Setting0.c(density0)));
        }
        return (FontVariationAxis[])arrayList0.toArray(new FontVariationAxis[0]);
    }
}

