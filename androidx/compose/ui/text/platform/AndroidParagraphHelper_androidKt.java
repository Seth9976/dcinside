package androidx.compose.ui.text.platform;

import A3.q;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.platform.extensions.PlaceholderExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidParagraphHelper_androidKt {
    @l
    private static final AndroidParagraphHelper_androidKt.NoopSpan.1 a;

    static {
        AndroidParagraphHelper_androidKt.a = new AndroidParagraphHelper_androidKt.NoopSpan.1();
    }

    @l
    public static final CharSequence a(@l String s, float f, @l TextStyle textStyle0, @l List list0, @l List list1, @l Density density0, @l q q0, boolean z) {
        L.p(s, "text");
        L.p(textStyle0, "contextTextStyle");
        L.p(list0, "spanStyles");
        L.p(list1, "placeholders");
        L.p(density0, "density");
        L.p(q0, "resolveTypeface");
        L.o(s, "if (useEmojiCompat && Em…else {\n        text\n    }");
        if(list0.isEmpty() && list1.isEmpty() && L.g(textStyle0.O(), TextIndent.c.a()) && TextUnitKt.s(textStyle0.D())) {
            return s;
        }
        CharSequence charSequence0 = s instanceof Spannable ? ((Spannable)s) : new SpannableString(s);
        if(L.g(textStyle0.L(), TextDecoration.b.f())) {
            SpannableExtensions_androidKt.t(((Spannable)charSequence0), AndroidParagraphHelper_androidKt.a, 0, s.length());
        }
        if(!AndroidParagraphHelper_androidKt.b(textStyle0) || textStyle0.E() != null) {
            LineHeightStyle lineHeightStyle0 = textStyle0.E();
            if(lineHeightStyle0 == null) {
                lineHeightStyle0 = LineHeightStyle.c.a();
            }
            SpannableExtensions_androidKt.p(((Spannable)charSequence0), textStyle0.D(), f, density0, lineHeightStyle0);
        }
        else {
            SpannableExtensions_androidKt.q(((Spannable)charSequence0), textStyle0.D(), f, density0);
        }
        SpannableExtensions_androidKt.x(((Spannable)charSequence0), textStyle0.O(), f, density0);
        SpannableExtensions_androidKt.v(((Spannable)charSequence0), textStyle0, list0, density0, q0);
        PlaceholderExtensions_androidKt.f(((Spannable)charSequence0), list1, density0);
        return charSequence0;
    }

    public static final boolean b(@l TextStyle textStyle0) {
        L.p(textStyle0, "<this>");
        PlatformTextStyle platformTextStyle0 = textStyle0.H();
        if(platformTextStyle0 != null) {
            PlatformParagraphStyle platformParagraphStyle0 = platformTextStyle0.a();
            return platformParagraphStyle0 == null ? true : platformParagraphStyle0.c();
        }
        return true;
    }
}

