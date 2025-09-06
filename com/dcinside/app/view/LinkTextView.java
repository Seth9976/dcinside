package com.dcinside.app.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.DynamicLayout.Builder;
import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import androidx.appcompat.widget.AppCompatTextView;
import com.dcinside.app.span.e;
import com.dcinside.app.util.vk;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;
import z3.j;

public final class LinkTextView extends AppCompatTextView {
    private int h;
    @m
    private CharSequence i;
    @m
    private final Pattern j;

    @j
    public LinkTextView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public LinkTextView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public LinkTextView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.j = Pattern.compile("https?://[^\"\'\\s()\\[\\]<>]+");
        this.setMovementMethod(LinkMovementMethod.getInstance());
        LinkTextView.x(this, 0, 1, null);
    }

    public LinkTextView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView
    protected void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getSize(v) - this.getCompoundPaddingStart() - this.getCompoundPaddingEnd();
        if(v2 == this.h && L.g(this.i, this.getText())) {
            super.onMeasure(v, v1);
            return;
        }
        this.h = v2;
        this.i = this.getText();
        this.w(v2);
        super.onMeasure(v, v1);
    }

    private final CharSequence v(int v) {
        CharSequence charSequence0 = new SpannableStringBuilder();
        DynamicLayout dynamicLayout0 = Build.VERSION.SDK_INT < 28 ? new DynamicLayout(charSequence0, charSequence0, this.getPaint(), v, Layout.Alignment.ALIGN_NORMAL, this.getLineSpacingMultiplier(), 0.0f, false) : DynamicLayout.Builder.obtain(charSequence0, this.getPaint(), v).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).setLineSpacing(0.0f, this.getLineSpacingMultiplier()).build();
        L.m(dynamicLayout0);
        ((SpannableStringBuilder)charSequence0).append(this.getText());
        Pattern pattern0 = this.j;
        if(pattern0 != null) {
            Matcher matcher0 = pattern0.matcher(charSequence0);
            while(matcher0.find()) {
                int v1 = matcher0.start();
                int v2 = matcher0.end();
                String s = ((SpannableStringBuilder)charSequence0).subSequence(v1, v2).toString();
                Context context0 = this.getContext();
                L.o(context0, "getContext(...)");
                ((SpannableStringBuilder)charSequence0).setSpan(new e(vk.b(context0, 0x7F0401F8), true, s, null, 8, null), v1, v2, 33);  // attr:dcBodyLinkColor
            }
        }
        if(dynamicLayout0.getLineCount() > this.getMaxLines()) {
            ((SpannableStringBuilder)charSequence0).replace(dynamicLayout0.getLineVisibleEnd(s.u(this.getMaxLines() - 1, 0)) - 2, ((SpannableStringBuilder)charSequence0).length(), "…");
        }
        return charSequence0;
    }

    private final void w(int v) {
        if(v <= 0) {
            return;
        }
        this.setText(this.v(v));
    }

    static void x(LinkTextView linkTextView0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = linkTextView0.getMeasuredWidth() - linkTextView0.getCompoundPaddingStart() - linkTextView0.getCompoundPaddingEnd();
        }
        linkTextView0.w(v);
    }
}

