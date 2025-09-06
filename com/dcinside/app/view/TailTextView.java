package com.dcinside.app.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.DynamicLayout.Builder;
import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout.Builder;
import android.text.StaticLayout;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import androidx.core.text.TextDirectionHeuristicsCompat;
import java.util.Iterator;
import kotlin.collections.T;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nTailTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TailTextView.kt\ncom/dcinside/app/view/TailTextView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
public final class TailTextView extends ResizeTextView {
    public static final class a {
        @m
        private final CharSequence a;
        @m
        private final CharSequence b;

        public a(@m CharSequence charSequence0, @m CharSequence charSequence1) {
            this.a = charSequence0;
            this.b = charSequence1;
        }

        @m
        public final CharSequence a() {
            return this.a;
        }

        @m
        public final CharSequence b() {
            return this.b;
        }

        @l
        public final a c(@m CharSequence charSequence0, @m CharSequence charSequence1) {
            return new a(charSequence0, charSequence1);
        }

        public static a d(a tailTextView$a0, CharSequence charSequence0, CharSequence charSequence1, int v, Object object0) {
            if((v & 1) != 0) {
                charSequence0 = tailTextView$a0.a;
            }
            if((v & 2) != 0) {
                charSequence1 = tailTextView$a0.b;
            }
            return tailTextView$a0.c(charSequence0, charSequence1);
        }

        @m
        public final CharSequence e() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof a)) {
                return false;
            }
            return L.g(this.a, ((a)object0).a) ? L.g(this.b, ((a)object0).b) : false;
        }

        @m
        public final CharSequence f() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            CharSequence charSequence0 = this.b;
            if(charSequence0 != null) {
                v = charSequence0.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @l
        public String toString() {
            return "DisplayTexts(originalText=" + this.a + ", tailText=" + this.b + ")";
        }
    }

    @l
    private String j;
    @l
    private CharSequence k;
    @l
    private CharSequence l;
    private int m;
    @m
    private StaticLayout n;

    @j
    public TailTextView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public TailTextView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public TailTextView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.j = "";
        this.k = "";
        this.l = "";
        this.setEllipsize(TextUtils.TruncateAt.END);
    }

    public TailTextView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    static void A(TailTextView tailTextView0, boolean z, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = tailTextView0.getMeasuredWidth() - tailTextView0.getCompoundPaddingStart() - tailTextView0.getCompoundPaddingEnd();
        }
        tailTextView0.z(z, v);
    }

    @l
    public final a getDisplayTexts() {
        return new a(this.k, this.l);
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView
    protected void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getSize(v) - this.getCompoundPaddingStart() - this.getCompoundPaddingEnd();
        if(v2 == this.m) {
            super.onMeasure(v, v1);
            return;
        }
        this.m = v2;
        this.z(true, v2);
        super.onMeasure(v, v1);
    }

    public final void setDisplayTexts(@l a tailTextView$a0) {
        L.p(tailTextView$a0, "value");
        CharSequence charSequence0 = tailTextView$a0.e();
        if(charSequence0 == null) {
            charSequence0 = this.k;
        }
        this.setOriginalText(charSequence0);
        this.l = tailTextView$a0.f() == null ? this.l : tailTextView$a0.f();
        TailTextView.A(this, true, 0, 2, null);
    }

    @Override  // android.widget.TextView
    public void setEllipsize(@m TextUtils.TruncateAt textUtils$TruncateAt0) {
        super.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override  // android.widget.TextView
    public void setMaxLines(int v) {
        super.setMaxLines(v);
        TailTextView.A(this, false, 0, 2, null);
    }

    private final void setOriginalText(CharSequence charSequence0) {
        this.k = charSequence0;
        this.j = charSequence0.toString();
    }

    private final StaticLayout w(int v, CharSequence charSequence0, int v1) {
        int v2 = s.u(v1, 0);
        Layout.Alignment layout$Alignment0 = Layout.Alignment.ALIGN_NORMAL;
        if(Build.VERSION.SDK_INT >= 23) {
            StaticLayout staticLayout0 = StaticLayout.Builder.obtain(charSequence0, 0, charSequence0.length(), this.getPaint(), v2).setIncludePad(false).setMaxLines(v).setAlignment(layout$Alignment0).setEllipsize(TextUtils.TruncateAt.END).setLineSpacing(this.getLineSpacingExtra(), this.getLineSpacingMultiplier()).build();
            L.o(staticLayout0, "build(...)");
            return staticLayout0;
        }
        StaticLayout staticLayout1 = G0.a.a(charSequence0, 0, charSequence0.length(), this.getPaint(), v2, layout$Alignment0, this.getLineSpacingMultiplier(), this.getLineSpacingExtra(), false, TextUtils.TruncateAt.END, v2, v, TextDirectionHeuristicsCompat.c);
        L.o(staticLayout1, "create(...)");
        return staticLayout1;
    }

    private final SpannableStringBuilder x(int v, SpannableStringBuilder spannableStringBuilder0) {
        DynamicLayout dynamicLayout0 = Build.VERSION.SDK_INT < 28 ? new DynamicLayout(spannableStringBuilder0, spannableStringBuilder0, this.getPaint(), v, Layout.Alignment.ALIGN_NORMAL, this.getLineSpacingMultiplier(), this.getLineSpacingExtra(), false) : DynamicLayout.Builder.obtain(spannableStringBuilder0, this.getPaint(), v).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).setLineSpacing(this.getLineSpacingExtra(), this.getLineSpacingMultiplier()).build();
        L.m(dynamicLayout0);
        int v1 = this.getMaxLines();
        StaticLayout staticLayout0 = this.n;
        L.m(staticLayout0);
        for(int v2 = v.s3(spannableStringBuilder0, staticLayout0.getText().toString(), 0, false, 6, null) - 1; v2 >= 0 && dynamicLayout0.getLineCount() > v1; --v2) {
            spannableStringBuilder0.delete(v2, v2 + 1);
        }
        return spannableStringBuilder0;
    }

    private final CharSequence y(StaticLayout staticLayout0) {
        CharSequence charSequence0 = staticLayout0.getText();
        L.o(charSequence0, "getText(...)");
        if(!L.g(charSequence0.toString(), this.j)) {
            int v = staticLayout0.getWidth();
            int v1 = 0;
            Iterator iterator0 = s.W1(0, staticLayout0.getLineCount()).iterator();
            while(iterator0.hasNext()) {
                v1 += (int)staticLayout0.getLineWidth(((T)iterator0).b());
            }
            StaticLayout staticLayout1 = this.n;
            L.m(staticLayout1);
            float f = staticLayout1.getLineWidth(0);
            CharSequence charSequence1 = TextUtils.ellipsize(this.k, this.getPaint(), ((float)v1) - f, TextUtils.TruncateAt.END);
            L.m(charSequence1);
            int v2 = v.G3(charSequence1, '…', 0, false, 6, null);
            if(L.g(charSequence1, "")) {
                StaticLayout staticLayout2 = this.n;
                L.m(staticLayout2);
                return staticLayout2.getText();
            }
            if(v2 == -1) {
                return charSequence0;
            }
            SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder().append(charSequence1);
            StaticLayout staticLayout3 = this.n;
            L.m(staticLayout3);
            SpannableStringBuilder spannableStringBuilder1 = spannableStringBuilder0.replace(v2, v2 + 1, staticLayout3.getText());
            L.m(spannableStringBuilder1);
            return this.x(v, spannableStringBuilder1);
        }
        return this.k;
    }

    private final void z(boolean z, int v) {
        if(v <= 0) {
            return;
        }
        StaticLayout staticLayout0 = this.w(this.getMaxLines(), this.k, v);
        if(z) {
            this.n = this.w(1, this.l, v);
        }
        this.setText(this.y(staticLayout0));
    }
}

