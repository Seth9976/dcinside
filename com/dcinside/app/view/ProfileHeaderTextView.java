package com.dcinside.app.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.text.DynamicLayout.Builder;
import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import androidx.core.content.ContextCompat;
import com.dcinside.app.model.ProfileInfo;
import com.dcinside.app.span.a;
import com.dcinside.app.util.vk;
import java.util.List;
import kotlin.V;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.ranges.s;
import y4.l;
import y4.m;
import z3.j;

public final class ProfileHeaderTextView extends ResizeTextView {
    private float j;
    private int k;
    @l
    private List l;
    private boolean m;
    private int n;
    private int o;

    @j
    public ProfileHeaderTextView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public ProfileHeaderTextView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public ProfileHeaderTextView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.l = u.H();
        this.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public ProfileHeaderTextView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final void A(boolean z, int v, int v1, float f, @l List list0) {
        L.p(list0, "profileInfos");
        if(this.m != z || this.k != v || this.n != v1 || this.j != f || !L.g(this.l, list0)) {
            this.k = v;
            this.m = z;
            this.n = v1;
            this.j = f;
            this.l = list0;
            this.setPadding(0, 0, v, 0);
            ProfileHeaderTextView.C(this, 0, 1, null);
        }
    }

    private final void B(int v) {
        if(v <= 0) {
            return;
        }
        V v1 = this.z(v);
        this.setLineSpacing(((Number)v1.b()).floatValue(), this.getLineSpacingMultiplier());
        this.setText(((CharSequence)v1.a()));
    }

    static void C(ProfileHeaderTextView profileHeaderTextView0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = profileHeaderTextView0.getMeasuredWidth() - profileHeaderTextView0.getCompoundPaddingStart() - profileHeaderTextView0.getCompoundPaddingEnd();
        }
        profileHeaderTextView0.B(v);
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView
    protected void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getSize(v) - this.getCompoundPaddingStart() - this.getCompoundPaddingEnd();
        if(v2 == this.o) {
            super.onMeasure(v, v1);
            return;
        }
        this.o = v2;
        this.B(v2);
        super.onMeasure(v, v1);
    }

    @Override  // android.widget.TextView
    public void setMaxLines(int v) {
        super.setMaxLines(v);
        ProfileHeaderTextView.C(this, 0, 1, null);
    }

    private final void w(SpannableStringBuilder spannableStringBuilder0) {
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        int v = vk.b(context0, 0x7F04012E);  // attr:colorAccent
        int v1 = ContextCompat.getColor(this.getContext(), 0x7F0605B8);  // color:white
        Resources resources0 = this.getContext().getResources();
        L.o("인증", "getString(...)");
        Rect rect0 = new Rect();
        TextPaint textPaint0 = new TextPaint();
        textPaint0.setTextSize(0.0f);
        textPaint0.getTextBounds("인증", 0, 2, rect0);
        rect0.set(0, 0, rect0.width() + resources0.getDimensionPixelSize(0x7F0703C0), rect0.height() + resources0.getDimensionPixelSize(0x7F0703C1));  // dimen:person_header_certified_padding_horizontal
        com.dcinside.app.span.m m0 = com.dcinside.app.span.m.a().o().i(v1).c().f(rect0.width()).h(rect0.height()).b(0.0f).j().n("인증", v, ((float)rect0.height()) / 2.0f);
        m0.setBounds(0, 0, m0.getIntrinsicWidth(), m0.getIntrinsicHeight());
        spannableStringBuilder0.append(' ');
        L.m(m0);
        com.dcinside.app.internal.l.a(spannableStringBuilder0, "인증", new a(m0, resources0.getDimension(0x7F0703BF)));  // dimen:person_header_certified_bottom_spacing
    }

    private final void x(SpannableStringBuilder spannableStringBuilder0, String s) {
        if(spannableStringBuilder0.length() > 0) {
            spannableStringBuilder0.append('\n');
        }
        int v = spannableStringBuilder0.length();
        spannableStringBuilder0.append(s);
        spannableStringBuilder0.append(' ');
        spannableStringBuilder0.setSpan(new ForegroundColorSpan(this.n), v, s.length() + v, 33);
    }

    private final float y(Layout layout0) {
        Paint.FontMetrics paint$FontMetrics0 = layout0.getPaint().getFontMetrics();
        float f = s.t(this.getContext().getResources().getDimension(0x7F0703C3) - paint$FontMetrics0.descent, 0.0f);  // dimen:person_header_profile_descent_base
        int v = this.getMaxLines();
        float f1 = s.t(paint$FontMetrics0.descent - paint$FontMetrics0.ascent, 0.0f);
        return Math.max(f, s.t((this.j - f1 * ((float)v)) / ((float)s.u(v - 1, 1)), 0.0f));
    }

    private final V z(int v) {
        this.getMaxLines();
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
        DynamicLayout dynamicLayout0 = Build.VERSION.SDK_INT < 28 ? new DynamicLayout(spannableStringBuilder0, spannableStringBuilder0, this.getPaint(), v, Layout.Alignment.ALIGN_NORMAL, this.getLineSpacingMultiplier(), 0.0f, false) : DynamicLayout.Builder.obtain(spannableStringBuilder0, this.getPaint(), v).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).setLineSpacing(0.0f, this.getLineSpacingMultiplier()).build();
        L.m(dynamicLayout0);
        int v1 = 0;
        for(Object object0: this.l) {
            ProfileInfo profileInfo0 = (ProfileInfo)object0;
            ++v1;
        }
        return r0.a(spannableStringBuilder0, this.y(dynamicLayout0));
    }
}

