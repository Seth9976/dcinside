package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.TempListUtilsKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import androidx.compose.ui.text.font.FontMatcher;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.V;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,174:1\n35#2,3:175\n38#2,2:182\n40#2:185\n56#2,4:197\n60#2,3:205\n63#2:209\n33#3,4:178\n38#3:184\n151#3,3:186\n33#3,4:189\n154#3,2:193\n38#3:195\n156#3:196\n33#3,4:201\n38#3:208\n33#3,6:210\n*S KotlinDebug\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n*L\n67#1:175,3\n67#1:182,2\n67#1:185\n72#1:197,4\n72#1:205,3\n72#1:209\n67#1:178,4\n67#1:184\n70#1:186,3\n70#1:189,4\n70#1:193,2\n70#1:195\n70#1:196\n72#1:201,4\n72#1:208\n80#1:210,6\n*E\n"})
@k(message = "This is not supported after downloadable fonts.")
public final class AndroidFontListTypeface implements AndroidTypeface {
    static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final FontMatcher a() {
            return AndroidFontListTypeface.e;
        }
    }

    @l
    private final FontMatcher a;
    @l
    private final Map b;
    @l
    private final FontFamily c;
    @l
    private static final Companion d;
    @Deprecated
    @l
    private static final FontMatcher e;

    static {
        AndroidFontListTypeface.d = new Companion(null);
        AndroidFontListTypeface.e = new FontMatcher();
    }

    public AndroidFontListTypeface(@l FontListFontFamily fontListFontFamily0, @l Context context0, @m List list0, @l FontMatcher fontMatcher0) {
        L.p(fontListFontFamily0, "fontFamily");
        ArrayList arrayList2;
        L.p(context0, "context");
        L.p(fontMatcher0, "fontMatcher");
        super();
        this.a = fontMatcher0;
        List list1 = fontListFontFamily0.o();
        ArrayList arrayList0 = new ArrayList(list1.size());
        int v = list1.size();
        for(int v2 = 0; v2 < v; ++v2) {
            Object object0 = list1.get(v2);
            if(FontLoadingStrategy.g(((Font)object0).c(), 0)) {
                arrayList0.add(object0);
            }
        }
        if(list0 == null) {
            arrayList2 = null;
        }
        else {
            ArrayList arrayList1 = new ArrayList(list0.size());
            int v3 = list0.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                V v5 = (V)list0.get(v4);
                arrayList1.add(((Font)u.G2(this.a.e(arrayList0, ((FontWeight)v5.a()), ((FontStyle)v5.b()).j()))));
            }
            List list2 = TempListUtilsKt.f(arrayList1);
            if(list2 == null) {
                arrayList2 = null;
            }
            else {
                HashSet hashSet0 = new HashSet(list2.size());
                arrayList2 = new ArrayList(list2.size());
                int v6 = list2.size();
                for(int v7 = 0; v7 < v6; ++v7) {
                    Object object1 = list2.get(v7);
                    if(hashSet0.add(((Font)object1))) {
                        arrayList2.add(object1);
                    }
                }
            }
        }
        if(arrayList2 != null) {
            arrayList0 = arrayList2;
        }
        if(arrayList0.isEmpty()) {
            throw new IllegalStateException("Could not match font");
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        int v8 = arrayList0.size();
        for(int v1 = 0; v1 < v8; ++v1) {
            Font font0 = (Font)arrayList0.get(v1);
            try {
                linkedHashMap0.put(font0, AndroidTypefaceCache.a.b(context0, font0));
            }
            catch(Exception unused_ex) {
                throw new IllegalStateException("Cannot create Typeface from " + font0);
            }
        }
        this.b = linkedHashMap0;
        this.c = fontListFontFamily0;
    }

    public AndroidFontListTypeface(FontListFontFamily fontListFontFamily0, Context context0, List list0, FontMatcher fontMatcher0, int v, w w0) {
        if((v & 4) != 0) {
            list0 = null;
        }
        if((v & 8) != 0) {
            fontMatcher0 = AndroidFontListTypeface.e;
        }
        this(fontListFontFamily0, context0, list0, fontMatcher0);
    }

    @Override  // androidx.compose.ui.text.font.Typeface
    @l
    public FontFamily a() {
        return this.c;
    }

    @Override  // androidx.compose.ui.text.platform.AndroidTypeface
    @l
    public Typeface b(@l FontWeight fontWeight0, int v, int v1) {
        L.p(fontWeight0, "fontWeight");
        ArrayList arrayList0 = new ArrayList(this.b.keySet());
        Font font0 = (Font)u.G2(this.a.e(arrayList0, fontWeight0, v));
        if(font0 == null) {
            throw new IllegalStateException("Could not load font");
        }
        Typeface typeface0 = (Typeface)this.b.get(font0);
        if(typeface0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object object0 = FontSynthesis_androidKt.a(v1, typeface0, font0, fontWeight0, v);
        L.n(object0, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface)object0;
    }

    @l
    public final FontMatcher d() {
        return this.a;
    }
}

