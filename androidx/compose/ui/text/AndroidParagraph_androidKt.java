package androidx.compose.ui.text;

import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak.Strategy;
import androidx.compose.ui.text.style.LineBreak.Strictness;
import androidx.compose.ui.text.style.LineBreak.WordBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;

public final class AndroidParagraph_androidKt {
    private static final CharSequence i(CharSequence charSequence0) {
        if(charSequence0.length() == 0) {
            return charSequence0;
        }
        CharSequence charSequence1 = charSequence0 instanceof Spannable ? ((Spannable)charSequence0) : new SpannableString(charSequence0);
        SpannableExtensions_androidKt.t(((Spannable)charSequence1), new IndentationFixSpan(), charSequence1.length() - 1, charSequence1.length() - 1);
        return charSequence1;
    }

    private static final int j(TextLayout textLayout0, int v) {
        int v1 = textLayout0.q();
        for(int v2 = 0; v2 < v1; ++v2) {
            if(textLayout0.p(v2) > ((float)v)) {
                return v2;
            }
        }
        return textLayout0.q();
    }

    // 去混淆评级： 低(25)
    private static final boolean k(TextStyle textStyle0, boolean z) {
        if(z && !TextUnit.j(textStyle0.B(), 0x100000000L) && !TextUnit.j(textStyle0.B(), 0x7FC00000L) && textStyle0.K() != null) {
            TextAlign textAlign0 = textStyle0.K();
            if(!(textAlign0 == null ? false : TextAlign.j(textAlign0.m(), 5))) {
                TextAlign textAlign1 = textStyle0.K();
                return !(textAlign1 == null ? false : TextAlign.j(textAlign1.m(), 4));
            }
        }
        return false;
    }

    // 去混淆评级： 低(23)
    private static final int l(TextAlign textAlign0) {
        if((textAlign0 == null ? false : TextAlign.j(textAlign0.m(), 1))) {
            return 3;
        }
        if((textAlign0 == null ? false : TextAlign.j(textAlign0.m(), 2))) {
            return 4;
        }
        if((textAlign0 == null ? false : TextAlign.j(textAlign0.m(), 3))) {
            return 2;
        }
        if(!(textAlign0 == null ? false : TextAlign.j(textAlign0.m(), 5))) {
            return (textAlign0 == null ? false : TextAlign.j(textAlign0.m(), 6)) ? 1 : 0;
        }
        return 0;
    }

    // 去混淆评级： 低(26)
    private static final int m(Strategy lineBreak$Strategy0) {
        if(!(lineBreak$Strategy0 == null ? false : Strategy.g(lineBreak$Strategy0.j(), 1))) {
            if((lineBreak$Strategy0 == null ? false : Strategy.g(lineBreak$Strategy0.j(), 2))) {
                return 1;
            }
            return (lineBreak$Strategy0 == null ? false : Strategy.g(lineBreak$Strategy0.j(), 3)) ? 2 : 0;
        }
        return 0;
    }

    // 去混淆评级： 低(20)
    private static final int n(Hyphens hyphens0) {
        if((hyphens0 == null ? false : Hyphens.f(hyphens0.i(), 2))) {
            return Build.VERSION.SDK_INT > 0x20 ? 3 : 1;
        }
        return 0;
    }

    // 去混淆评级： 低(24)
    private static final int o(Strictness lineBreak$Strictness0) {
        if(!(lineBreak$Strictness0 == null ? false : Strictness.h(lineBreak$Strictness0.k(), 1))) {
            if((lineBreak$Strictness0 == null ? false : Strictness.h(lineBreak$Strictness0.k(), 2))) {
                return 1;
            }
            if((lineBreak$Strictness0 == null ? false : Strictness.h(lineBreak$Strictness0.k(), 3))) {
                return 2;
            }
            return (lineBreak$Strictness0 == null ? false : Strictness.h(lineBreak$Strictness0.k(), 4)) ? 3 : 0;
        }
        return 0;
    }

    // 去混淆评级： 低(30)
    private static final int p(WordBreak lineBreak$WordBreak0) {
        if(!(lineBreak$WordBreak0 == null ? false : WordBreak.f(lineBreak$WordBreak0.i(), 1))) {
            return (lineBreak$WordBreak0 == null ? false : WordBreak.f(lineBreak$WordBreak0.i(), 2)) ? 1 : 0;
        }
        return 0;
    }
}

