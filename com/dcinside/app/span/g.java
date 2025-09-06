package com.dcinside.app.span;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import com.dcinside.app.memo.F;
import com.dcinside.app.model.ManagerItem;
import com.dcinside.app.read.Q0;
import com.dcinside.app.type.r;
import com.dcinside.app.type.s;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.vk;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nSpanFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanFactory.kt\ncom/dcinside/app/span/SpanFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,721:1\n1#2:722\n13346#3,2:723\n13346#3,2:725\n*S KotlinDebug\n*F\n+ 1 SpanFactory.kt\ncom/dcinside/app/span/SpanFactory\n*L\n349#1:723,2\n617#1:725,2\n*E\n"})
public final class g {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[r.values().length];
            try {
                arr_v[r.f.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[r.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[r.j.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    @l
    public static final g a;

    static {
        g.a = new g();
    }

    @m
    @n
    public static final CharSequence A(@l Context context0, @m String s, @m String s1, @m String s2) {
        L.p(context0, "context");
        if(s2 != null && s2.length() > 0) {
            V v0 = F.D(s1, s2, null, 4, null);
            String s3 = v0 == null ? null : ((String)v0.e());
            if(s3 != null && s3.length() > 0) {
                CharSequence charSequence0 = new SpannableStringBuilder();
                ((SpannableStringBuilder)charSequence0).append('-');
                ((SpannableStringBuilder)charSequence0).append(s3);
                ((SpannableStringBuilder)charSequence0).setSpan(new TextAppearanceSpan(context0, vk.f(context0, 0x7F04066F)), 0, ((SpannableStringBuilder)charSequence0).length(), 33);  // attr:textTypeSub
                Integer integer0 = (Integer)v0.f();
                ((SpannableStringBuilder)charSequence0).setSpan(new ForegroundColorSpan((integer0 == null ? vk.b(context0, 0x7F040157) : ((int)integer0))), 0, ((SpannableStringBuilder)charSequence0).length(), 33);  // attr:colorPostExt
                return charSequence0;
            }
        }
        else if(s != null && s.length() > 0) {
            V v1 = F.D(s1, s, null, 4, null);
            String s4 = v1 == null ? null : ((String)v1.e());
            if(s4 != null && s4.length() > 0) {
                CharSequence charSequence1 = new SpannableStringBuilder();
                ((SpannableStringBuilder)charSequence1).append('-');
                ((SpannableStringBuilder)charSequence1).append(s4);
                ((SpannableStringBuilder)charSequence1).setSpan(new TextAppearanceSpan(context0, vk.f(context0, 0x7F04066F)), 0, ((SpannableStringBuilder)charSequence1).length(), 33);  // attr:textTypeSub
                Integer integer1 = (Integer)v1.f();
                ((SpannableStringBuilder)charSequence1).setSpan(new ForegroundColorSpan((integer1 == null ? vk.b(context0, 0x7F040157) : ((int)integer1))), 0, ((SpannableStringBuilder)charSequence1).length(), 33);  // attr:colorPostExt
                return charSequence1;
            }
        }
        return null;
    }

    public static CharSequence B(Context context0, String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        if((v & 8) != 0) {
            s2 = null;
        }
        return g.A(context0, s, s1, s2);
    }

    private final void C(SpannableStringBuilder spannableStringBuilder0, h h0, int v, int v1) {
        if(h0 != null) {
            String s = h0.b();
            if(s != null) {
                Integer integer0 = s.length();
                if(integer0.intValue() <= 0) {
                    integer0 = null;
                }
                if(integer0 != null) {
                    int v2 = v.s3(spannableStringBuilder0, s, v, false, 4, null);
                    if(v2 >= 0 && ((int)integer0) + v2 <= v1) {
                        int v3 = h0.b().length() + v2;
                        if(h0.a() != 0) {
                            spannableStringBuilder0.setSpan(new BackgroundColorSpan(h0.a()), v2, v3, 33);
                        }
                        if(h0.c() != null) {
                            spannableStringBuilder0.setSpan(new TextAppearanceSpan(null, 0, -1, h0.c(), null), v2, v3, 33);
                        }
                    }
                }
            }
        }
    }

    static void D(g g0, SpannableStringBuilder spannableStringBuilder0, h h0, int v, int v1, int v2, Object object0) {
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = spannableStringBuilder0.length();
        }
        g0.C(spannableStringBuilder0, h0, v, v1);
    }

    @l
    @n
    public static final SpannableStringBuilder a(@l Context context0, @l SpannableStringBuilder spannableStringBuilder0, @m String s, boolean z, boolean z1) {
        L.p(context0, "ctx");
        L.p(spannableStringBuilder0, "builder");
        if(z1) {
            s = "매니저";
        }
        if(s != null && s.length() > 0) {
            int v = spannableStringBuilder0.length();
            spannableStringBuilder0.append('[');
            spannableStringBuilder0.append(s);
            spannableStringBuilder0.append(']');
            if(!z) {
                spannableStringBuilder0.setSpan(new AlignSuperscriptSpan(0.9f, 0.5f), 0, spannableStringBuilder0.length(), 33);
            }
            if(z1) {
                spannableStringBuilder0.setSpan(new ForegroundColorSpan(vk.b(context0, 0x7F0403EF)), v, spannableStringBuilder0.length(), 33);  // attr:managerHeadColor
            }
            spannableStringBuilder0.append(' ');
        }
        return spannableStringBuilder0;
    }

    public static SpannableStringBuilder b(Context context0, SpannableStringBuilder spannableStringBuilder0, String s, boolean z, boolean z1, int v, Object object0) {
        if((v & 8) != 0) {
            z = false;
        }
        if((v & 16) != 0) {
            z1 = false;
        }
        return g.a(context0, spannableStringBuilder0, s, z, z1);
    }

    public final void c(@l Context context0, int v, int v1, @l SpannableStringBuilder[] arr_spannableStringBuilder) {
        L.p(context0, "ctx");
        L.p(arr_spannableStringBuilder, "list");
        if(v > 0 || v1 > 0) {
            TextAppearanceSpan textAppearanceSpan0 = new TextAppearanceSpan(null, 0, -1, vk.c(context0, 0x7F04012E), null);  // attr:colorAccent
            AlignSuperscriptSpan alignSuperscriptSpan0 = new AlignSuperscriptSpan(0.85f, 0.5f);
            for(int v2 = 0; v2 < arr_spannableStringBuilder.length; ++v2) {
                SpannableStringBuilder spannableStringBuilder0 = arr_spannableStringBuilder[v2];
                int v3 = spannableStringBuilder0.length();
                spannableStringBuilder0.append(" [");
                spannableStringBuilder0.append(String.valueOf(v));
                if(v1 > 0) {
                    spannableStringBuilder0.append('/');
                    spannableStringBuilder0.append(String.valueOf(v1));
                }
                spannableStringBuilder0.append(']');
                spannableStringBuilder0.setSpan(textAppearanceSpan0, v3, spannableStringBuilder0.length(), 33);
                spannableStringBuilder0.setSpan(alignSuperscriptSpan0, v3, spannableStringBuilder0.length(), 33);
            }
        }
    }

    private final void d(ManagerItem managerItem0, Context context0, SpannableStringBuilder spannableStringBuilder0, int v, Rect rect0, TextPaint textPaint0) {
        String s1;
        String s;
        r r0 = s.a(managerItem0);
        int[] arr_v = a.a;
        switch(arr_v[r0.ordinal()]) {
            case 1: {
                s = null;
                break;
            }
            case 2: {
                s = context0.getString(r0.d(), new Object[]{managerItem0.h()});
                break;
            }
            default: {
                s = context0.getString(r0.d());
            }
        }
        int v1 = this.m(s, rect0, textPaint0);
        if(arr_v[r0.ordinal()] == 3) {
            s1 = "";
        }
        else {
            String s2 = managerItem0.l();
            if(s2 != null && s2.length() > 0) {
            label_18:
                StringBuilder stringBuilder0 = new StringBuilder();
                String s4 = managerItem0.i();
                if(s4 != null && s4.length() > 0) {
                    stringBuilder0.append("()");
                    stringBuilder0.insert(1, managerItem0.i());
                }
                CharSequence charSequence0 = v < 0 || 0x7FFFFFFF <= v ? managerItem0.l() : TextUtils.ellipsize(managerItem0.l(), textPaint0, ((float)v) - ((float)v1) - ((float)this.m(stringBuilder0.toString(), rect0, textPaint0)), TextUtils.TruncateAt.END);
                stringBuilder0.insert(0, charSequence0);
                s1 = stringBuilder0.toString();
            }
            else {
                String s3 = managerItem0.i();
                if(s3 == null || s3.length() <= 0) {
                    s1 = null;
                    goto label_29;
                }
                goto label_18;
            }
        }
    label_29:
        if(spannableStringBuilder0.length() > 0) {
            spannableStringBuilder0.append('\n');
        }
        boolean z = s1 != null && s1.length() > 0;
        if(z) {
            spannableStringBuilder0.append(s1);
        }
        L.o("부재중입니다.", "getString(...)");
        if(L.g(managerItem0.l(), "부재중입니다.") && s1 != null && s1.length() > 0) {
            int v2 = v.s3(spannableStringBuilder0, s1, 0, false, 6, null);
            int v3 = vk.b(context0, 0x1010038);
            spannableStringBuilder0.setSpan(new ForegroundColorSpan(Color.argb(0x7F, Color.red(v3), Color.green(v3), Color.blue(v3))), v2, v2 + 7, 33);
        }
        if(s != null && s.length() > 0) {
            int v4 = spannableStringBuilder0.length();
            if(z) {
                spannableStringBuilder0.append(' ');
            }
            spannableStringBuilder0.append(s);
            int v5 = spannableStringBuilder0.length();
            spannableStringBuilder0.setSpan(new TextAppearanceSpan(null, 0, -1, ContextCompat.getColorStateList(context0, 0x7F0600A5), null), v4, v5, 33);  // color:caution
        }
    }

    @l
    public final SpannableStringBuilder e(@l SpannableStringBuilder spannableStringBuilder0, @l String s, int v, boolean z) {
        L.p(spannableStringBuilder0, "builder");
        L.p(s, "target");
        Integer integer0 = v.s3(spannableStringBuilder0, s, 0, false, 6, null);
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v1 = (int)integer0;
            int v2 = z ? s.length() + v1 : spannableStringBuilder0.length();
            spannableStringBuilder0.setSpan(new ForegroundColorSpan(v), v1, v2, 33);
        }
        return spannableStringBuilder0;
    }

    public static SpannableStringBuilder f(g g0, SpannableStringBuilder spannableStringBuilder0, String s, int v, boolean z, int v1, Object object0) {
        if((v1 & 8) != 0) {
            z = true;
        }
        return g0.e(spannableStringBuilder0, s, v, z);
    }

    @l
    @n
    public static final Spannable g(@l Context context0, int v, @m String s, @m String s1, @m String s2, @m h h0) {
        L.p(context0, "context");
        Spannable spannable0 = new SpannableStringBuilder();
        if(s != null && s.length() > 0) {
            int v1 = ((SpannableStringBuilder)spannable0).length();
            ((SpannableStringBuilder)spannable0).append(s);
            if(v == 0 || v == 4) {
                g.D(g.a, ((SpannableStringBuilder)spannable0), h0, v1, 0, 8, null);
            }
        }
        if(s1 != null && s1.length() > 0) {
            if(spannable0.length() > 0) {
                ((SpannableStringBuilder)spannable0).append(' ');
                com.dcinside.app.internal.l.a(((SpannableStringBuilder)spannable0), "**", new b(context0, 0x7F08019D, null, 0, 0, false, null, 0x7C, null));  // drawable:divider_text
                ((SpannableStringBuilder)spannable0).append(' ');
            }
            int v2 = ((SpannableStringBuilder)spannable0).length();
            ((SpannableStringBuilder)spannable0).append(s1);
            if(v == 0 || v == 3) {
                g.D(g.a, ((SpannableStringBuilder)spannable0), h0, v2, 0, 8, null);
            }
        }
        if(s2 != null && s2.length() > 0) {
            if(spannable0.length() > 0) {
                ((SpannableStringBuilder)spannable0).append(' ');
                com.dcinside.app.internal.l.a(((SpannableStringBuilder)spannable0), "**", new b(context0, 0x7F08019D, null, 0, 0, false, null, 0x7C, null));  // drawable:divider_text
                ((SpannableStringBuilder)spannable0).append(' ');
            }
            ((SpannableStringBuilder)spannable0).append(s2);
        }
        return spannable0;
    }

    public static Spannable h(Context context0, int v, String s, String s1, String s2, h h0, int v1, Object object0) {
        String s3 = (v1 & 4) == 0 ? s : null;
        String s4 = (v1 & 8) == 0 ? s1 : null;
        String s5 = (v1 & 16) == 0 ? s2 : null;
        return (v1 & 0x20) == 0 ? g.g(context0, v, s3, s4, s5, h0) : g.g(context0, v, s3, s4, s5, null);
    }

    @l
    public final Spannable i(@l TextPaint textPaint0, @l TextView textView0, @l TextView textView1, @l String s) {
        String s3;
        float f2;
        L.p(textPaint0, "prefixPaint");
        L.p(textView0, "baseView");
        L.p(textView1, "editView");
        L.p(s, "folderName");
        Rect rect0 = new Rect();
        Context context0 = textView0.getContext();
        TextPaint textPaint1 = textView0.getPaint();
        String s1 = textView1.getText().toString();
        TextPaint textPaint2 = textView1.getPaint();
        L.o(textPaint2, "getPaint(...)");
        int v = this.m(s1, rect0, textPaint2);
        int v1 = textView1.getPaddingStart();
        int v2 = textView1.getPaddingEnd();
        float f = 0.0f - ((float)(textView0.getPaddingStart() + textView0.getPaddingEnd())) - ((float)v) - ((float)(v1 + v2));
        L.o("가나다라마바", "getString(...)");
        int v3 = this.m("가나다라마바", rect0, textPaint0);
        int v4 = rect0.height();
        boolean z = true;
        String s2 = context0.getString(0x7F1500E3, new Object[]{s});  // string:archive_change_write_msg2 "%1$s 보관함 폴더에 저장 완료"
        L.o(s2, "getString(...)");
        L.m(textPaint1);
        int v5 = this.m(s2, rect0, textPaint1) - this.m(s, rect0, textPaint1);
        float f1 = ((float)this.m(s, rect0, textPaint0)) + 0.0f + ((float)v5);
        if(f1 > f) {
            if(f1 < 1.3f * f) {
                f2 = f - ((float)v5) - 0.0f;
                if(f2 < ((float)v3)) {
                    f2 = f - 0.0f;
                }
            }
            else {
                f2 = f - 0.0f;
            }
            s3 = this.j(s, textPaint0, f2);
        }
        else {
            s3 = s;
        }
        this.m(s3, rect0, textPaint0);
        com.dcinside.app.span.m m0 = com.dcinside.app.span.m.a().o().l(textPaint0).i(-1).f(((int)(((float)rect0.width()) + 0.0f))).h(((int)(((float)v4) + 0.0f))).b(textPaint0.getTextSize()).e(0.5f, -1).j().n(s3, 0, 0.5f);
        m0.setBounds(0, 0, m0.getIntrinsicWidth(), m0.getIntrinsicHeight());
        if(((float)(m0.getBounds().width() + v5)) < f) {
            z = false;
        }
        Spannable spannable0 = new SpannableStringBuilder(s2);
        float f3 = z ? textView0.getLineSpacingExtra() : 0.0f;
        L.m(m0);
        ((SpannableStringBuilder)spannable0).setSpan(new com.dcinside.app.span.a(m0, f3), 0, s.length(), 33);
        return spannable0;
    }

    private final String j(String s, TextPaint textPaint0, float f) {
        return TextUtils.ellipsize(s, textPaint0, f, TextUtils.TruncateAt.END).toString();
    }

    private final String k(String s) {
        int v = Calendar.getInstance().get(1);
        if(s != null) {
            List list0 = v.V4(s, new String[]{"."}, false, 0, 6, null);
            if(list0 != null) {
                if(list0.size() != 3) {
                    list0 = null;
                }
                if(list0 != null) {
                    Integer integer0 = v.b1(((String)list0.get(0)));
                    if(integer0 != null && ((int)integer0) == v) {
                        s = String.format("%s.%s", Arrays.copyOf(new Object[]{list0.get(1), list0.get(2)}, 2));
                        L.o(s, "format(...)");
                        return s;
                    }
                    s = String.format("%s.%s.%s", Arrays.copyOf(new Object[]{list0.get(0), list0.get(1), list0.get(2)}, 3));
                    L.o(s, "format(...)");
                    Date date0 = Bk.f(s);
                    return date0 == null ? s : Bk.K(date0.getTime());
                }
            }
        }
        return s;
    }

    public final int l(@m TextView textView0) {
        String s;
        if(textView0 == null) {
            return 0;
        }
        Rect rect0 = new Rect();
        CharSequence charSequence0 = textView0.getText();
        if(charSequence0 == null) {
            s = "";
        }
        else {
            s = charSequence0.toString();
            if(s == null) {
                s = "";
            }
        }
        TextPaint textPaint0 = textView0.getPaint();
        L.m(textPaint0);
        return this.m(s, rect0, textPaint0);
    }

    public final int m(@m String s, @l Rect rect0, @l TextPaint textPaint0) {
        L.p(rect0, "rect");
        L.p(textPaint0, "paint");
        if(s != null && s.length() > 0) {
            textPaint0.getTextBounds(s, 0, s.length(), rect0);
            return rect0.width();
        }
        return 0;
    }

    @l
    @n
    public static final Spannable n(@l String s, @m h h0) {
        L.p(s, "text");
        Spannable spannable0 = new SpannableStringBuilder(s);
        g.D(g.a, ((SpannableStringBuilder)spannable0), h0, 0, 0, 12, null);
        return spannable0;
    }

    @l
    @n
    public static final Spannable o(@l TextView textView0, int v, @ColorRes int v1, @l ManagerItem[] arr_managerItem) {
        L.p(textView0, "textView");
        L.p(arr_managerItem, "managers");
        Context context0 = textView0.getContext();
        Spannable spannable0 = new SpannableStringBuilder();
        if(arr_managerItem.length != 0) {
            Rect rect0 = new Rect();
            TextPaint textPaint0 = textView0.getPaint();
            int v2 = v < 0 || 0x7FFFFFFF <= v ? -1 : -v - com.dcinside.app.internal.s.h(textView0);
            for(int v3 = 0; v3 < arr_managerItem.length; ++v3) {
                ManagerItem managerItem0 = arr_managerItem[v3];
                L.m(context0);
                L.m(textPaint0);
                g.a.d(managerItem0, context0, ((SpannableStringBuilder)spannable0), v2, rect0, textPaint0);
            }
        }
        if(spannable0.length() > 0) {
            return spannable0;
        }
        ((SpannableStringBuilder)spannable0).append("없음");
        if(v1 != 0) {
            ((SpannableStringBuilder)spannable0).setSpan(new TextAppearanceSpan(null, 0, -1, ContextCompat.getColorStateList(context0, v1), null), 0, ((SpannableStringBuilder)spannable0).length(), 33);
        }
        return spannable0;
    }

    @l
    @n
    public static final Spannable p(@l TextView textView0, int v, @l ManagerItem[] arr_managerItem) {
        L.p(textView0, "textView");
        L.p(arr_managerItem, "managers");
        return g.o(textView0, v, 0, ((ManagerItem[])Arrays.copyOf(arr_managerItem, arr_managerItem.length)));
    }

    @l
    @n
    public static final Spannable q(@l Context context0, @m String s, @m String s1, @m String s2, @m String s3, @m i i0, @m h h0, @m String s4, boolean z) {
        L.p(context0, "context");
        Spannable spannable0 = new SpannableStringBuilder();
        if(s != null && s.length() > 0) {
            ((SpannableStringBuilder)spannable0).append(s);
            ((SpannableStringBuilder)spannable0).setSpan(new AlignSuperscriptSpan(0.9f, 0.5f), 0, ((SpannableStringBuilder)spannable0).length(), 33);
            ((SpannableStringBuilder)spannable0).append(' ');
            com.dcinside.app.internal.l.a(((SpannableStringBuilder)spannable0), "**", new b(context0, 0x7F08019D, null, 0, 0, false, null, 0x7C, null));  // drawable:divider_text
            ((SpannableStringBuilder)spannable0).append(' ');
        }
        int v = ((SpannableStringBuilder)spannable0).length();
        ((SpannableStringBuilder)spannable0).append((s1 == null ? "" : s1));
        if(spannable0.length() > 0 && L.g("1", s3)) {
            ((SpannableStringBuilder)spannable0).setSpan(new AlignSuperscriptSpan(1.1f, 0.5f), 0, ((SpannableStringBuilder)spannable0).length(), 33);
            ((SpannableStringBuilder)spannable0).setSpan(new StyleSpan(1), 0, ((SpannableStringBuilder)spannable0).length(), 33);
        }
        else if(z && L.g(s1, "<b>운영자</b>")) {
            ((SpannableStringBuilder)spannable0).setSpan(new AlignSuperscriptSpan(1.1f, 0.5f), 0, ((SpannableStringBuilder)spannable0).length(), 33);
            ((SpannableStringBuilder)spannable0).setSpan(new StyleSpan(1), 0, ((SpannableStringBuilder)spannable0).length(), 33);
        }
        g.D(g.a, ((SpannableStringBuilder)spannable0), h0, v, 0, 8, null);
        if(i0 != null && i0.i() != 0) {
            if(spannable0.length() > 0) {
                ((SpannableStringBuilder)spannable0).append(' ');
            }
            com.dcinside.app.internal.l.a(((SpannableStringBuilder)spannable0), "**", new b(context0, i0));
        }
        if((s4 == null || s4.length() <= 0) && s2 != null && s2.length() > 0) {
            int v1 = ((SpannableStringBuilder)spannable0).length();
            ((SpannableStringBuilder)spannable0).append('(');
            ((SpannableStringBuilder)spannable0).append(m0.a.a.m(s2, ".*"));
            ((SpannableStringBuilder)spannable0).append(')');
            ((SpannableStringBuilder)spannable0).append(' ');
            ((SpannableStringBuilder)spannable0).setSpan(new ForegroundColorSpan(vk.b(context0, 0x7F040157)), v1, ((SpannableStringBuilder)spannable0).length(), 33);  // attr:colorPostExt
        }
        return spannable0;
    }

    public static Spannable r(Context context0, String s, String s1, String s2, String s3, i i0, h h0, String s4, boolean z, int v, Object object0) {
        String s5 = (v & 2) == 0 ? s : null;
        String s6 = (v & 4) == 0 ? s1 : null;
        String s7 = (v & 8) == 0 ? s2 : null;
        String s8 = (v & 16) == 0 ? s3 : null;
        i i1 = (v & 0x20) == 0 ? i0 : null;
        h h1 = (v & 0x40) == 0 ? h0 : null;
        return (v & 0x80) == 0 ? g.q(context0, s5, s6, s7, s8, i1, h1, s4, z) : g.q(context0, s5, s6, s7, s8, i1, h1, null, z);
    }

    @l
    @n
    public static final Spannable s(@l Context context0, @m String s, int v, int v1, boolean z, @m String s1, @m String s2, @m String s3) {
        String s4 = null;
        L.p(context0, "context");
        Spannable spannable0 = new SpannableStringBuilder();
        if(s3 != null && s3.length() > 0) {
            ((SpannableStringBuilder)spannable0).append(s3);
        }
        else if(s2 != null && s2.length() > 0) {
            V v2 = F.D(s1, s2, null, 4, null);
            if(v2 != null) {
                s4 = (String)v2.e();
            }
            if(s4 != null && s4.length() > 0) {
                ((SpannableStringBuilder)spannable0).append('-');
                ((SpannableStringBuilder)spannable0).append(s4);
                ((SpannableStringBuilder)spannable0).append(' ');
                com.dcinside.app.internal.l.a(((SpannableStringBuilder)spannable0), "**", new b(context0, 0x7F08019D, null, 0, 0, false, null, 0x7C, null));  // drawable:divider_text
                ((SpannableStringBuilder)spannable0).append(' ');
                Integer integer0 = (Integer)v2.f();
                ((SpannableStringBuilder)spannable0).setSpan(new ForegroundColorSpan((integer0 == null ? vk.b(context0, 0x7F040157) : ((int)integer0))), 0, ((SpannableStringBuilder)spannable0).length(), 33);  // attr:colorPostExt
            }
        }
        else if(s != null && s.length() > 0) {
            V v3 = F.D(s1, s, null, 4, null);
            if(v3 != null) {
                s4 = (String)v3.e();
            }
            if(s4 != null && s4.length() > 0) {
                ((SpannableStringBuilder)spannable0).append('-');
                ((SpannableStringBuilder)spannable0).append(s4);
                ((SpannableStringBuilder)spannable0).append(' ');
                com.dcinside.app.internal.l.a(((SpannableStringBuilder)spannable0), "**", new b(context0, 0x7F08019D, null, 0, 0, false, null, 0x7C, null));  // drawable:divider_text
                ((SpannableStringBuilder)spannable0).append(' ');
                Integer integer1 = (Integer)v3.f();
                ((SpannableStringBuilder)spannable0).setSpan(new ForegroundColorSpan((integer1 == null ? vk.b(context0, 0x7F040157) : ((int)integer1))), 0, ((SpannableStringBuilder)spannable0).length(), 33);  // attr:colorPostExt
            }
        }
        if(z) {
            ((SpannableStringBuilder)spannable0).append(' ');
            com.dcinside.app.internal.l.a(((SpannableStringBuilder)spannable0), "**", new b(context0, 0x7F08019D, null, 0, 0, false, null, 0x7C, null));  // drawable:divider_text
            ((SpannableStringBuilder)spannable0).append(' ');
        }
        ((SpannableStringBuilder)spannable0).append(context0.getString(0x7F1507C5, new Object[]{v}));  // string:post_item_hit "조회 %1$d"
        ((SpannableStringBuilder)spannable0).append(' ');
        com.dcinside.app.internal.l.a(((SpannableStringBuilder)spannable0), "**", new b(context0, 0x7F08019D, null, 0, 0, false, null, 0x7C, null));  // drawable:divider_text
        ((SpannableStringBuilder)spannable0).append(' ');
        ((SpannableStringBuilder)spannable0).append("추천 ");
        int v4 = spannable0.length();
        ((SpannableStringBuilder)spannable0).append(String.valueOf(v1));
        if(jl.a.w0() && v1 >= 5) {
            ((SpannableStringBuilder)spannable0).setSpan(new TextAppearanceSpan(null, 0, -1, vk.c(context0, 0x7F04012E), null), v4, spannable0.length(), 33);  // attr:colorAccent
        }
        return spannable0;
    }

    public static Spannable t(Context context0, String s, int v, int v1, boolean z, String s1, String s2, String s3, int v2, Object object0) {
        String s4 = (v2 & 0x20) == 0 ? s1 : null;
        String s5 = (v2 & 0x40) == 0 ? s2 : null;
        return (v2 & 0x80) == 0 ? g.s(context0, s, v, v1, z, s4, s5, s3) : g.s(context0, s, v, v1, z, s4, s5, null);
    }

    @l
    @n
    public static final Spannable u(@l Context context0, @m String s, @m String s1) {
        L.p(context0, "context");
        Spannable spannable0 = new SpannableStringBuilder();
        if(s != null && s.length() > 0) {
            ((SpannableStringBuilder)spannable0).append(s);
        }
        String s2 = g.a.k(s1);
        if(s2 != null && s2.length() > 0) {
            if(spannable0.length() > 0) {
                ((SpannableStringBuilder)spannable0).append(' ');
                com.dcinside.app.internal.l.a(((SpannableStringBuilder)spannable0), "**", new b(context0, 0x7F08019D, null, 0, 0, false, null, 0x7C, null));  // drawable:divider_text
                ((SpannableStringBuilder)spannable0).append(' ');
            }
            ((SpannableStringBuilder)spannable0).append(s2);
        }
        return spannable0;
    }

    @n
    public static final void v(@l SpannableStringBuilder spannableStringBuilder0, @m h h0) {
        L.p(spannableStringBuilder0, "builder");
        g.D(g.a, spannableStringBuilder0, h0, 0, 0, 12, null);
    }

    @l
    @n
    public static final SpannableStringBuilder w(@l Context context0, @l Q0 q00, @l String s, @l String s1, @l String s2, boolean z) {
        L.p(context0, "context");
        L.p(q00, "replyMode");
        L.p(s, "name");
        L.p(s1, "ip");
        L.p(s2, "guestKey");
        if(s.length() == 0) {
            return new SpannableStringBuilder("");
        }
        if(!z && s1.length() == 0 && v.v2(s, "글쓴", false, 2, null)) {
            s = v.o2(s, ' ', ' ', false, 4, null);
        }
        SpannableStringBuilder spannableStringBuilder0 = L.g(s, "<b>운영자</b>") ? new SpannableStringBuilder(Dl.c(s)) : new SpannableStringBuilder(s);
        if(s2.length() > 0 && !L.g(s2, "0")) {
            if(L.g(s2, "owner")) {
                spannableStringBuilder0.insert(0, "글쓴 ");
            }
            else {
                spannableStringBuilder0.append(s2);
            }
        }
        if(!z && s1.length() > 0) {
            spannableStringBuilder0.append(' ');
            spannableStringBuilder0.append('(');
            spannableStringBuilder0.append(m0.a.a.m(s1, ".*"));
            spannableStringBuilder0.append(')');
        }
        if(q00 == Q0.d) {
            spannableStringBuilder0.insert(0, "@");
        }
        return spannableStringBuilder0;
    }

    @l
    @n
    public static final Spannable x(@l TextView textView0, @m String s, @m String s1, int v, int v1, @m Integer integer0, @m i i0, @m i[] arr_i, @m h h0, @m j j0, @m View view0, boolean z, boolean z1, boolean z2) {
        int v2 = 0;
        L.p(textView0, "textView");
        Context context0 = textView0.getContext();
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
        L.m(context0);
        g.a(context0, spannableStringBuilder0, s, z1, z2);
        if(i0 != null && i0.i() != 0) {
            com.dcinside.app.internal.l.a(spannableStringBuilder0, "**", new b(context0, i0));
            spannableStringBuilder0.append(' ');
        }
        int v3 = spannableStringBuilder0.length();
        if(arr_i != null) {
            for(int v4 = 0; v4 < arr_i.length; ++v4) {
                i i1 = arr_i[v4];
                if(i1 != null && i1.i() != 0) {
                    spannableStringBuilder0.append(' ');
                    com.dcinside.app.internal.l.a(spannableStringBuilder0, "**", new b(context0, i1));
                }
            }
        }
        g g0 = g.a;
        g0.c(context0, v, v1, new SpannableStringBuilder[]{spannableStringBuilder0});
        if(s1 != null && s1.length() != 0) {
            TextPaint textPaint0 = textView0.getPaint();
            String s2 = spannableStringBuilder0.toString();
            L.o(s2, "toString(...)");
            if(s2.length() > 0) {
                int v5 = Dk.d(Math.max(0, dl.a.Q0().b()) + 2);
                Rect rect0 = new Rect();
                L.m(textPaint0);
                v2 = v5 + g0.m(s2, rect0, textPaint0);
            }
            Resources resources0 = context0.getResources();
            int v6 = Math.max(textView0.getMaxLines(), 1);
            int v7 = resources0.getDimensionPixelSize(0x7F070119);  // dimen:list_subject_add_margin
            CharSequence charSequence0 = TextUtils.ellipsize(s1, textPaint0, ((float)((view0 == null ? 0 : view0.getWidth()) * v6)) - ((float)v7) * ((float)v6) - ((float)v2), TextUtils.TruncateAt.END);
            L.o(charSequence0, "ellipsize(...)");
            spannableStringBuilder0.insert(v3, charSequence0);
            g.D(g0, spannableStringBuilder0, h0, v3, 0, 8, null);
            if(j0 != null) {
                int v8 = v.s3(charSequence0, j0.d(), 0, false, 6, null);
                if(v8 >= 0) {
                    spannableStringBuilder0.setSpan(new TextAppearanceSpan(null, 0, -1, (dl.a.q2().m() ? vk.c(context0, 0x7F0405CA) : vk.c(context0, 0x7F0405CB)), null), v8 + v3, j0.d().length() + (v8 + v3), 33);  // attr:spoilerTextColorDark
                }
            }
            if(integer0 != null) {
                ColorStateList colorStateList0 = ColorStateList.valueOf(((int)integer0));
                L.o(colorStateList0, "valueOf(...)");
                spannableStringBuilder0.setSpan(new TextAppearanceSpan(null, 0, -1, colorStateList0, null), v3, charSequence0.length() + v3, 33);
            }
            if(z) {
                int v9 = charSequence0.length();
                spannableStringBuilder0.setSpan(new StyleSpan(1), v3, v9 + v3, 33);
            }
        }
        return spannableStringBuilder0;
    }

    public static Spannable y(TextView textView0, String s, String s1, int v, int v1, Integer integer0, i i0, i[] arr_i, h h0, j j0, View view0, boolean z, boolean z1, boolean z2, int v2, Object object0) {
        int v3 = (v2 & 8) == 0 ? v : 0;
        int v4 = (v2 & 16) == 0 ? v1 : 0;
        Integer integer1 = (v2 & 0x20) == 0 ? integer0 : null;
        i i1 = (v2 & 0x40) == 0 ? i0 : null;
        i[] arr_i1 = (v2 & 0x80) == 0 ? arr_i : null;
        h h1 = (v2 & 0x100) == 0 ? h0 : null;
        j j1 = (v2 & 0x200) == 0 ? j0 : null;
        View view1 = (v2 & 0x400) == 0 ? view0 : null;
        boolean z3 = (v2 & 0x800) == 0 ? z : false;
        boolean z4 = (v2 & 0x1000) == 0 ? z1 : false;
        return (v2 & 0x2000) == 0 ? g.x(textView0, s, s1, v3, v4, integer1, i1, arr_i1, h1, j1, view1, z3, z4, z2) : g.x(textView0, s, s1, v3, v4, integer1, i1, arr_i1, h1, j1, view1, z3, z4, false);
    }

    @l
    @n
    public static final Spannable z(@m CharSequence charSequence0) {
        Spannable spannable0 = new SpannableStringBuilder();
        if(charSequence0 != null && charSequence0.length() > 0) {
            com.dcinside.app.internal.l.a(((SpannableStringBuilder)spannable0), charSequence0, new UnderlineSpan());
        }
        return spannable0;
    }
}

