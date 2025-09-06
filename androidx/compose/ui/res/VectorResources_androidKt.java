package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector.Companion;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.compat.AndroidVectorParser;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.xmlpull.v1.XmlPullParserException;
import y4.l;
import y4.m;

@s0({"SMAP\nVectorResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n76#2:154\n83#3,3:155\n1114#4,6:158\n1#5:164\n*S KotlinDebug\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n*L\n49#1:154\n53#1:155,3\n53#1:158,6\n*E\n"})
public final class VectorResources_androidKt {
    @l
    public static final ImageVectorEntry a(@m Resources.Theme resources$Theme0, @l Resources resources0, @l XmlResourceParser xmlResourceParser0, int v) throws XmlPullParserException {
        L.p(resources0, "res");
        L.p(xmlResourceParser0, "parser");
        AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
        AndroidVectorParser androidVectorParser0 = new AndroidVectorParser(xmlResourceParser0, 0, 2, null);
        L.o(attributeSet0, "attrs");
        Builder imageVector$Builder0 = XmlVectorParser_androidKt.a(androidVectorParser0, resources0, resources$Theme0, attributeSet0);
        int v1 = 0;
        while(!XmlVectorParser_androidKt.f(xmlResourceParser0)) {
            v1 = XmlVectorParser_androidKt.i(androidVectorParser0, resources0, attributeSet0, resources$Theme0, imageVector$Builder0, v1);
            xmlResourceParser0.next();
        }
        return new ImageVectorEntry(imageVector$Builder0.f(), v);
    }

    public static ImageVectorEntry b(Resources.Theme resources$Theme0, Resources resources0, XmlResourceParser xmlResourceParser0, int v, int v1, Object object0) throws XmlPullParserException {
        if((v1 & 1) != 0) {
            resources$Theme0 = null;
        }
        return VectorResources_androidKt.a(resources$Theme0, resources0, xmlResourceParser0, v);
    }

    @Composable
    @l
    public static final ImageVector c(@l Companion imageVector$Companion0, @DrawableRes int v, @m Composer composer0, int v1) {
        L.p(imageVector$Companion0, "<this>");
        composer0.V(44534090);
        if(ComposerKt.g0()) {
            ComposerKt.w0(44534090, v1, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
        }
        Context context0 = (Context)composer0.L(AndroidCompositionLocals_androidKt.g());
        Resources resources0 = Resources_androidKt.a(composer0, 0);
        Resources.Theme resources$Theme0 = context0.getTheme();
        Object[] arr_object = {v, resources0, resources$Theme0, resources0.getConfiguration()};
        composer0.V(0xDE219177);
        boolean z = false;
        for(int v2 = 0; v2 < 4; ++v2) {
            z |= composer0.t(arr_object[v2]);
        }
        ImageVector imageVector0 = composer0.W();
        if(z || imageVector0 == Composer.a.a()) {
            imageVector0 = VectorResources_androidKt.d(imageVector$Companion0, resources$Theme0, resources0, v);
            composer0.O(imageVector0);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return imageVector0;
    }

    @l
    public static final ImageVector d(@l Companion imageVector$Companion0, @m Resources.Theme resources$Theme0, @l Resources resources0, int v) throws XmlPullParserException {
        L.p(imageVector$Companion0, "<this>");
        L.p(resources0, "res");
        TypedValue typedValue0 = new TypedValue();
        resources0.getValue(v, typedValue0, true);
        XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
        L.o(xmlResourceParser0, "vectorResource$lambda$1");
        XmlVectorParser_androidKt.m(xmlResourceParser0);
        L.o(xmlResourceParser0, "res.getXml(resId).apply { seekToStartTag() }");
        return VectorResources_androidKt.a(resources$Theme0, resources0, xmlResourceParser0, typedValue0.changingConfigurations).f();
    }

    public static ImageVector e(Companion imageVector$Companion0, Resources.Theme resources$Theme0, Resources resources0, int v, int v1, Object object0) throws XmlPullParserException {
        if((v1 & 1) != 0) {
            resources$Theme0 = null;
        }
        return VectorResources_androidKt.d(imageVector$Companion0, resources$Theme0, resources0, v);
    }
}

