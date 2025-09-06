package com.dcinside.rich.html;

import android.text.Editable;
import android.text.Layout.Alignment;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.ParagraphStyle;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.dcinside.rich.spans.HashSpan;
import java.util.Arrays;
import java.util.Comparator;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import y4.l;
import y4.m;
import z3.f;
import z3.j;

@s0({"SMAP\nRichHtml.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RichHtml.kt\ncom/dcinside/rich/html/RichHtml\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,436:1\n299#1,2:439\n301#1:443\n6143#2,2:437\n6143#2,2:441\n*S KotlinDebug\n*F\n+ 1 RichHtml.kt\ncom/dcinside/rich/html/RichHtml\n*L\n309#1:439,2\n309#1:443\n300#1:437,2\n309#1:441,2\n*E\n"})
public final class a {
    public interface com.dcinside.rich.html.a.a {
        void a(boolean arg1, @l String arg2, @l Editable arg3, @l XMLReader arg4);
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[Layout.Alignment.values().length];
            try {
                arr_v[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    @l
    public static final a a = null;
    @f
    public static boolean b = false;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 8;
    public static final int h = 16;
    public static final int i = 0x20;
    private static final int j = 1;

    static {
        a.a = new a();
    }

    private final void a(StringBuilder stringBuilder0, Spanned spanned0, int v) {
        int v1 = spanned0.length();
        for(int v2 = 0; v2 < v1; v2 = v3) {
            int v3 = spanned0.nextSpanTransition(v2, v1, ParagraphStyle.class);
            ParagraphStyle[] arr_paragraphStyle = (ParagraphStyle[])spanned0.getSpans(v2, v3, ParagraphStyle.class);
            L.m(arr_paragraphStyle);
            String s = " ";
            boolean z = false;
            for(int v4 = 0; v4 < arr_paragraphStyle.length; ++v4) {
                ParagraphStyle paragraphStyle0 = arr_paragraphStyle[v4];
                if(paragraphStyle0 instanceof AlignmentSpan) {
                    Layout.Alignment layout$Alignment0 = ((AlignmentSpan)paragraphStyle0).getAlignment();
                    z = true;
                    switch((layout$Alignment0 == null ? -1 : b.a[layout$Alignment0.ordinal()])) {
                        case 1: {
                            s = "align=\"center\" " + s;
                            break;
                        }
                        case 2: {
                            s = "align=\"right\" " + s;
                            break;
                        }
                        default: {
                            s = "align=\"left\" " + s;
                        }
                    }
                }
            }
            if(z) {
                stringBuilder0.append("<div ");
                stringBuilder0.append(s);
                stringBuilder0.append(">");
            }
            this.k(stringBuilder0, spanned0, v2, v3, v);
            if(z) {
                stringBuilder0.append("</div>");
            }
        }
    }

    @l
    @j
    public final Spanned b(@l String s, int v) {
        L.p(s, "source");
        return a.d(this, s, v, null, 4, null);
    }

    @l
    @j
    public final Spanned c(@l String s, int v, @m com.dcinside.rich.html.a.a a$a0) {
        L.p(s, "source");
        org.ccil.cowan.tagsoup.l l0 = new org.ccil.cowan.tagsoup.l();
        try {
            l0.setProperty("http://www.ccil.org/~cowan/tagsoup/properties/schema", com.dcinside.rich.html.b.a);
        }
        catch(SAXNotRecognizedException sAXNotRecognizedException0) {
            throw new RuntimeException(sAXNotRecognizedException0);
        }
        catch(SAXNotSupportedException sAXNotSupportedException0) {
            throw new RuntimeException(sAXNotSupportedException0);
        }
        Spanned spanned0 = new c(s, a$a0, l0, v).c();
        L.o(spanned0, "convert(...)");
        return spanned0;
    }

    public static Spanned d(a a0, String s, int v, com.dcinside.rich.html.a.a a$a0, int v1, Object object0) {
        if((v1 & 4) != 0) {
            a$a0 = null;
        }
        return a0.c(s, v, a$a0);
    }

    private final Object[] e(Spanned spanned0, int v, int v1, Class class0) {
        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RichHtml.kt\ncom/dcinside/rich/html/RichHtml\n*L\n1#1,328:1\n300#2:329\n*E\n"})
        public static final class com.dcinside.rich.html.a.c implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                int v = 0;
                Integer integer0 = (int)(object0 instanceof ForegroundColorSpan ? -1 : 0);
                if(object1 instanceof ForegroundColorSpan) {
                    v = -1;
                }
                return kotlin.comparisons.a.l(integer0, v);
            }
        }

        Object[] arr_object = spanned0.getSpans(v, v1, class0);
        if(arr_object == null) {
            L.y(0, "T");
            arr_object = new Object[0];
        }
        if(arr_object.length > 1) {
            L.w();
            kotlin.collections.l.h4(arr_object, new com.dcinside.rich.html.a.c());
        }
        return arr_object;
    }

    private final String f(Spanned spanned0, int v, int v1) {
        AlignmentSpan[] arr_alignmentSpan = (AlignmentSpan[])spanned0.getSpans(v, v1, AlignmentSpan.class);
        int v2 = arr_alignmentSpan.length - 1;
        String s = null;
        if(v2 >= 0) {
            while(true) {
                Layout.Alignment layout$Alignment0 = arr_alignmentSpan[v2].getAlignment();
                switch((layout$Alignment0 == null ? -1 : b.a[layout$Alignment0.ordinal()])) {
                    case 1: {
                        s = " style=\'text-align:center;\'";
                        break;
                    }
                    case 2: {
                        s = " style=\'text-align:right;\'";
                        break;
                    }
                    case 3: {
                        s = " style=\'text-align:left;\'";
                    }
                }
                if(v2 - 1 < 0) {
                    break;
                }
                --v2;
            }
        }
        return s == null ? "" : s;
    }

    @k(message = "use {@link #toHtml(Spanned, int)} instead.", replaceWith = @c0(expression = "toHtml(text, TO_HTML_PARAGRAPH_LINES_CONSECUTIVE)", imports = {"com.dcinside.rich.html.Html.toHtml", "com.dcinside.rich.html.Html.TO_HTML_PARAGRAPH_LINES_CONSECUTIVE"}))
    @l
    public final String g(@l Spanned spanned0) {
        L.p(spanned0, "text");
        return this.h(spanned0, 0);
    }

    @l
    public final String h(@l Spanned spanned0, int v) {
        L.p(spanned0, "text");
        StringBuilder stringBuilder0 = new StringBuilder();
        this.l(stringBuilder0, spanned0, v);
        String s = stringBuilder0.toString();
        L.o(s, "toString(...)");
        return s;
    }

    private final void i(StringBuilder stringBuilder0, Spanned spanned0, int v, int v1) {
        stringBuilder0.append("<p>");
        while(v < v1) {
            int v2 = TextUtils.indexOf(spanned0, '\n', v, v1);
            if(v2 < 0) {
                v2 = v1;
            }
            int v3 = 0;
            while(v2 < v1 && spanned0.charAt(v2) == 10) {
                ++v3;
                ++v2;
            }
            this.m(stringBuilder0, spanned0, v, v2 - v3);
            if(v3 == 1) {
                stringBuilder0.append("<br>\n");
            }
            else {
                for(int v4 = 2; v4 < v3; ++v4) {
                    stringBuilder0.append("<br>");
                }
                if(v2 != v1) {
                    stringBuilder0.append("</p>\n");
                    stringBuilder0.append("<p>");
                }
            }
            v = v2;
        }
        stringBuilder0.append("</p>\n");
    }

    private final void j(StringBuilder stringBuilder0, Spanned spanned0, int v, int v1) {
        while(v <= v1) {
            int v2 = TextUtils.indexOf(spanned0, '\n', v, v1);
            if(v2 < 0) {
                v2 = v1;
            }
            if(v2 == v) {
                stringBuilder0.append("<br>\n");
            }
            else {
                stringBuilder0.append("<");
                stringBuilder0.append("p");
                stringBuilder0.append(this.f(spanned0, v, v2));
                stringBuilder0.append(">");
                this.m(stringBuilder0, spanned0, v, v2);
                stringBuilder0.append("</");
                stringBuilder0.append("p");
                stringBuilder0.append(">\n");
            }
            v = v2 + 1;
        }
    }

    private final void k(StringBuilder stringBuilder0, Spanned spanned0, int v, int v1, int v2) {
        if((v2 & 1) == 0) {
            this.i(stringBuilder0, spanned0, v, v1);
            return;
        }
        this.j(stringBuilder0, spanned0, v, v1);
    }

    private final void l(StringBuilder stringBuilder0, Spanned spanned0, int v) {
        if((v & 1) == 0) {
            this.a(stringBuilder0, spanned0, v);
            return;
        }
        this.k(stringBuilder0, spanned0, 0, spanned0.length(), v);
    }

    private final void m(StringBuilder stringBuilder0, Spanned spanned0, int v, int v1) {
        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RichHtml.kt\ncom/dcinside/rich/html/RichHtml\n*L\n1#1,328:1\n300#2:329\n*E\n"})
        public static final class d implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                int v = 0;
                Integer integer0 = (int)(object0 instanceof ForegroundColorSpan ? -1 : 0);
                if(object1 instanceof ForegroundColorSpan) {
                    v = -1;
                }
                return kotlin.comparisons.a.l(integer0, v);
            }
        }

        while(v < v1) {
            int v2 = spanned0.nextSpanTransition(v, v1, CharacterStyle.class);
            Object[] arr_object = spanned0.getSpans(v, v2, CharacterStyle.class);
            if(arr_object == null) {
                arr_object = new CharacterStyle[0];
            }
            else {
                L.m(arr_object);
            }
            if(arr_object.length > 1) {
                kotlin.collections.l.h4(arr_object, new d());
            }
            CharacterStyle[] arr_characterStyle = (CharacterStyle[])arr_object;
            for(int v3 = 0; v3 < arr_characterStyle.length; ++v3) {
                CharacterStyle characterStyle0 = arr_characterStyle[v3];
                if(characterStyle0 instanceof p0.c) {
                    stringBuilder0.append(((p0.c)characterStyle0).a());
                    v = v2;
                }
                else {
                    if(characterStyle0 instanceof StyleSpan) {
                        int v4 = ((StyleSpan)characterStyle0).getStyle();
                        if((v4 & 1) != 0) {
                            stringBuilder0.append("<b>");
                        }
                        if((v4 & 2) != 0) {
                            stringBuilder0.append("<i>");
                        }
                    }
                    if(characterStyle0 instanceof UnderlineSpan) {
                        stringBuilder0.append("<u>");
                    }
                    else if(characterStyle0 instanceof StrikethroughSpan) {
                        stringBuilder0.append("<span style=\"text-decoration:line-through;\">");
                    }
                    else if(characterStyle0 instanceof AbsoluteSizeSpan) {
                        float f = (float)((AbsoluteSizeSpan)characterStyle0).getSize();
                        if(!((AbsoluteSizeSpan)characterStyle0).getDip()) {
                            f /= 1.5f;
                        }
                        String s = String.format("<span style=\"font-size:%.0fpx;\">", Arrays.copyOf(new Object[]{f}, 1));
                        L.o(s, "format(...)");
                        stringBuilder0.append(s);
                    }
                    else if(characterStyle0 instanceof RelativeSizeSpan) {
                        String s1 = String.format("<span style=\"font-size:%.2fem;\">", Arrays.copyOf(new Object[]{((RelativeSizeSpan)characterStyle0).getSizeChange()}, 1));
                        L.o(s1, "format(...)");
                        stringBuilder0.append(s1);
                    }
                    else if(characterStyle0 instanceof ForegroundColorSpan && !(characterStyle0 instanceof HashSpan)) {
                        String s2 = String.format("<span style=\"color:#%06X;\">", Arrays.copyOf(new Object[]{((int)(((ForegroundColorSpan)characterStyle0).getForegroundColor() & 0xFFFFFF))}, 1));
                        L.o(s2, "format(...)");
                        stringBuilder0.append(s2);
                    }
                }
            }
            this.n(stringBuilder0, spanned0, v, v2);
            int v5 = arr_characterStyle.length - 1;
            if(v5 >= 0) {
                while(true) {
                    CharacterStyle characterStyle1 = arr_characterStyle[v5];
                    if(characterStyle1 instanceof ForegroundColorSpan && !(characterStyle1 instanceof HashSpan)) {
                        stringBuilder0.append("</span>");
                    }
                    else if(characterStyle1 instanceof RelativeSizeSpan) {
                        stringBuilder0.append("</span>");
                    }
                    else if(characterStyle1 instanceof AbsoluteSizeSpan) {
                        stringBuilder0.append("</span>");
                    }
                    else if(characterStyle1 instanceof StrikethroughSpan) {
                        stringBuilder0.append("</span>");
                    }
                    else if(characterStyle1 instanceof UnderlineSpan) {
                        stringBuilder0.append("</u>");
                    }
                    else if(characterStyle1 instanceof StyleSpan) {
                        int v6 = ((StyleSpan)characterStyle1).getStyle();
                        if((v6 & 1) != 0) {
                            stringBuilder0.append("</b>");
                        }
                        if((v6 & 2) != 0) {
                            stringBuilder0.append("</i>");
                        }
                    }
                    if(v5 - 1 < 0) {
                        break;
                    }
                    --v5;
                }
            }
            v = v2;
        }
    }

    private final void n(StringBuilder stringBuilder0, CharSequence charSequence0, int v, int v1) {
        while(v < v1) {
            int v2 = charSequence0.charAt(v);
            if(v2 == 60) {
                stringBuilder0.append("&lt;");
            }
            else {
                switch(v2) {
                    case 38: {
                        stringBuilder0.append("&amp;");
                        break;
                    }
                    case 62: {
                        stringBuilder0.append("&gt;");
                        break;
                    }
                    default: {
                        if(0xD800 > v2 || v2 >= 0xE000) {
                            if(v2 > 0x7E || L.t(v2, 0x20) < 0) {
                                if(a.b) {
                                    stringBuilder0.append("&#");
                                    stringBuilder0.append(v2);
                                    stringBuilder0.append(";");
                                }
                                else {
                                    stringBuilder0.append(((char)v2));
                                }
                            }
                            else if(v2 == 0x20) {
                                while(v + 1 < v1 && charSequence0.charAt(v + 1) == 0x20) {
                                    stringBuilder0.append("&nbsp;");
                                    ++v;
                                }
                                stringBuilder0.append(' ');
                            }
                            else {
                                stringBuilder0.append(((char)v2));
                            }
                        }
                        else if(v2 < 0xDC00 && v + 1 < v1) {
                            int v3 = charSequence0.charAt(v + 1);
                            if(0xDC00 <= v3 && v3 < 0xE000) {
                                stringBuilder0.append("&#");
                                stringBuilder0.append(v2 - 0xD800 << 10 | 0x10000 | v3 - 0xDC00);
                                stringBuilder0.append(";");
                                ++v;
                            }
                        }
                    }
                }
            }
            ++v;
        }
    }
}

