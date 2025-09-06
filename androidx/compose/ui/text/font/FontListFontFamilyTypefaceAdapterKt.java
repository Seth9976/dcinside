package androidx.compose.ui.text.font;

import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.List;
import kotlin.V;
import kotlin.collections.u;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import kotlin.r0;

@s0({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n416#2:428\n417#2,9:430\n416#2:439\n417#2,7:441\n424#2,2:449\n24#3:429\n24#3:440\n1#4:448\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n185#1:428\n185#1:430,9\n201#1:439\n201#1:441,7\n201#1:449,2\n185#1:429\n201#1:440\n*E\n"})
public final class FontListFontFamilyTypefaceAdapterKt {
    private static final V b(List list0, TypefaceRequest typefaceRequest0, AsyncTypefaceCache asyncTypefaceCache0, PlatformFontLoader platformFontLoader0, Function1 function10) {
        Object object1;
        Object object0;
        int v = list0.size();
        int v1 = 0;
        List list1 = null;
        while(v1 < v) {
            Font font0 = (Font)list0.get(v1);
            int v2 = font0.c();
            if(FontLoadingStrategy.g(v2, 0)) {
                SynchronizedObject synchronizedObject0 = asyncTypefaceCache0.d;
                __monitor_enter(synchronizedObject0);
                try {
                    Key asyncTypefaceCache$Key0 = new Key(font0, platformFontLoader0.a());
                    AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult0 = (AsyncTypefaceResult)asyncTypefaceCache0.b.g(asyncTypefaceCache$Key0);
                    if(asyncTypefaceCache$AsyncTypefaceResult0 == null) {
                        asyncTypefaceCache$AsyncTypefaceResult0 = (AsyncTypefaceResult)asyncTypefaceCache0.c.e(asyncTypefaceCache$Key0);
                    }
                    if(asyncTypefaceCache$AsyncTypefaceResult0 == null) {
                        goto label_22;
                    }
                    else {
                        object0 = asyncTypefaceCache$AsyncTypefaceResult0.i();
                        goto label_19;
                    }
                    goto label_29;
                }
                catch(Throwable throwable0) {
                }
                __monitor_exit(synchronizedObject0);
                throw throwable0;
            label_19:
                __monitor_exit(synchronizedObject0);
                Font font1 = font0;
                goto label_29;
            label_22:
                __monitor_exit(synchronizedObject0);
                try {
                    object0 = platformFontLoader0.c(font0);
                }
                catch(Exception exception0) {
                    throw new IllegalStateException("Unable to load font " + font0, exception0);
                }
                font1 = font0;
                AsyncTypefaceCache.f(asyncTypefaceCache0, font0, platformFontLoader0, object0, false, 8, null);
            label_29:
                if(object0 == null) {
                    throw new IllegalStateException("Unable to load font " + font1);
                }
                return r0.a(list1, FontSynthesis_androidKt.a(typefaceRequest0.j(), object0, font1, typefaceRequest0.k(), typefaceRequest0.i()));
            }
            if(FontLoadingStrategy.g(v2, 1)) {
                SynchronizedObject synchronizedObject1 = asyncTypefaceCache0.d;
                __monitor_enter(synchronizedObject1);
                try {
                    Key asyncTypefaceCache$Key1 = new Key(font0, platformFontLoader0.a());
                    AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult1 = (AsyncTypefaceResult)asyncTypefaceCache0.b.g(asyncTypefaceCache$Key1);
                    if(asyncTypefaceCache$AsyncTypefaceResult1 == null) {
                        asyncTypefaceCache$AsyncTypefaceResult1 = (AsyncTypefaceResult)asyncTypefaceCache0.c.e(asyncTypefaceCache$Key1);
                    }
                    if(asyncTypefaceCache$AsyncTypefaceResult1 == null) {
                        goto label_48;
                    }
                    else {
                        object1 = asyncTypefaceCache$AsyncTypefaceResult1.i();
                        goto label_45;
                    }
                    goto label_57;
                }
                catch(Throwable throwable1) {
                }
                __monitor_exit(synchronizedObject1);
                throw throwable1;
            label_45:
                __monitor_exit(synchronizedObject1);
                Font font2 = font0;
                goto label_57;
            label_48:
                __monitor_exit(synchronizedObject1);
                try {
                    object1 = e0.b(platformFontLoader0.c(font0));
                }
                catch(Throwable throwable2) {
                    object1 = e0.b(f0.a(throwable2));
                }
                if(e0.i(object1)) {
                    object1 = null;
                }
                font2 = font0;
                AsyncTypefaceCache.f(asyncTypefaceCache0, font0, platformFontLoader0, object1, false, 8, null);
            label_57:
                if(object1 != null) {
                    return r0.a(list1, FontSynthesis_androidKt.a(typefaceRequest0.j(), object1, font2, typefaceRequest0.k(), typefaceRequest0.i()));
                }
            }
            else {
                if(!FontLoadingStrategy.g(v2, 2)) {
                    throw new IllegalStateException("Unknown font type " + font0);
                }
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult2 = asyncTypefaceCache0.d(font0, platformFontLoader0);
                if(asyncTypefaceCache$AsyncTypefaceResult2 == null) {
                    if(list1 == null) {
                        list1 = u.S(new Font[]{font0});
                    }
                    else {
                        list1.add(font0);
                    }
                }
                else if(!AsyncTypefaceResult.g(asyncTypefaceCache$AsyncTypefaceResult2.i()) && asyncTypefaceCache$AsyncTypefaceResult2.i() != null) {
                    return r0.a(list1, FontSynthesis_androidKt.a(typefaceRequest0.j(), asyncTypefaceCache$AsyncTypefaceResult2.i(), font0, typefaceRequest0.k(), typefaceRequest0.i()));
                }
            }
            ++v1;
        }
        return r0.a(list1, function10.invoke(typefaceRequest0));
    }
}

