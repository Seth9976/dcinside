package androidx.media3.ui;

import android.content.Context;
import android.text.Layout.Alignment;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.google.common.base.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

final class WebViewSubtitleOutput extends FrameLayout implements Output {
    private final CanvasSubtitleOutput a;
    private final WebView b;
    private List c;
    private CaptionStyleCompat d;
    private float e;
    private int f;
    private float g;
    private static final float h = 1.2f;
    private static final String i = "default_bg";

    public WebViewSubtitleOutput(Context context0) {
        this(context0, null);
    }

    public WebViewSubtitleOutput(Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.c = Collections.emptyList();
        this.d = CaptionStyleCompat.m;
        this.e = 0.0533f;
        this.f = 0;
        this.g = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput0 = new CanvasSubtitleOutput(context0, attributeSet0);
        this.a = canvasSubtitleOutput0;
        androidx.media3.ui.WebViewSubtitleOutput.1 webViewSubtitleOutput$10 = new WebView(context0, attributeSet0) {
            final WebViewSubtitleOutput a;

            @Override  // android.webkit.WebView
            public boolean onTouchEvent(MotionEvent motionEvent0) {
                super.onTouchEvent(motionEvent0);
                return false;
            }

            @Override  // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.b = webViewSubtitleOutput$10;
        webViewSubtitleOutput$10.setBackgroundColor(0);
        this.addView(canvasSubtitleOutput0);
        this.addView(webViewSubtitleOutput$10);
    }

    @Override  // androidx.media3.ui.SubtitleView$Output
    public void a(List list0, CaptionStyleCompat captionStyleCompat0, float f, int v, float f1) {
        this.d = captionStyleCompat0;
        this.e = f;
        this.f = v;
        this.g = f1;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            Cue cue0 = (Cue)list0.get(v1);
            if(cue0.d == null) {
                arrayList1.add(cue0);
            }
            else {
                arrayList0.add(cue0);
            }
        }
        if(!this.c.isEmpty() || !arrayList1.isEmpty()) {
            this.c = arrayList1;
            this.i();
        }
        this.a.a(arrayList0, captionStyleCompat0, f, v, f1);
        this.invalidate();
    }

    private static int b(int v) {
        switch(v) {
            case 1: {
                return -50;
            }
            case 2: {
                return -100;
            }
            default: {
                return 0;
            }
        }
    }

    private static String c(@Nullable Layout.Alignment layout$Alignment0) {
        if(layout$Alignment0 == null) {
            return "center";
        }
        switch(androidx.media3.ui.WebViewSubtitleOutput.2.a[layout$Alignment0.ordinal()]) {
            case 1: {
                return "start";
            }
            case 2: {
                return "end";
            }
            default: {
                return "center";
            }
        }
    }

    private static String d(CaptionStyleCompat captionStyleCompat0) {
        switch(captionStyleCompat0.d) {
            case 1: {
                return Util.S("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", new Object[]{HtmlUtils.b(captionStyleCompat0.e)});
            }
            case 2: {
                return Util.S("0.1em 0.12em 0.15em %s", new Object[]{HtmlUtils.b(captionStyleCompat0.e)});
            }
            case 3: {
                return Util.S("0.06em 0.08em 0.15em %s", new Object[]{HtmlUtils.b(captionStyleCompat0.e)});
            }
            case 4: {
                return Util.S("-0.05em -0.05em 0.15em %s", new Object[]{HtmlUtils.b(captionStyleCompat0.e)});
            }
            default: {
                return "unset";
            }
        }
    }

    private String e(int v, float f) {
        float f1 = SubtitleViewUtils.h(v, f, this.getHeight(), this.getHeight() - this.getPaddingTop() - this.getPaddingBottom());
        return f1 == -3.402823E+38f ? "unset" : Util.S("%.2fpx", new Object[]{((float)(f1 / this.getContext().getResources().getDisplayMetrics().density))});
    }

    private static String f(int v) {
        switch(v) {
            case 1: {
                return "vertical-rl";
            }
            case 2: {
                return "vertical-lr";
            }
            default: {
                return "horizontal-tb";
            }
        }
    }

    public void g() {
        this.b.destroy();
    }

    private static String h(Cue cue0) {
        float f = cue0.q;
        if(f != 0.0f) {
            return cue0.p == 1 || cue0.p == 2 ? Util.S("%s(%.2fdeg)", new Object[]{"skewY", f}) : Util.S("%s(%.2fdeg)", new Object[]{"skewX", f});
        }
        return "";
    }

    private void i() {
        int v5;
        String s9;
        boolean z;
        int v2;
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(Util.S("<body><div style=\'-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;\'>", new Object[]{HtmlUtils.b(this.d.a), this.e(this.f, this.e), 1.2f, WebViewSubtitleOutput.d(this.d)}));
        HashMap hashMap0 = new HashMap();
        hashMap0.put(".default_bg,.default_bg *", Util.S("background-color:%s;", new Object[]{HtmlUtils.b(this.d.b)}));
        int v = 0;
        while(v < this.c.size()) {
            Cue cue0 = (Cue)this.c.get(v);
            float f = cue0.h == -3.402823E+38f ? 50.0f : cue0.h * 100.0f;
            int v1 = WebViewSubtitleOutput.b(cue0.i);
            float f1 = cue0.e;
            if(f1 == -3.402823E+38f) {
            label_23:
                s = Util.S("%.2f%%", new Object[]{((float)((1.0f - this.g) * 100.0f))});
                v2 = -100;
            }
            else {
                if(cue0.f != 1) {
                    s = Util.S("%.2f%%", new Object[]{((float)(f1 * 100.0f))});
                    v2 = cue0.p == 1 ? -WebViewSubtitleOutput.b(cue0.g) : WebViewSubtitleOutput.b(cue0.g);
                    goto label_25;
                }
                else if(f1 >= 0.0f) {
                    s = Util.S("%.2fem", new Object[]{((float)(f1 * 1.2f))});
                    v2 = 0;
                    goto label_25;
                }
                else {
                    s = Util.S("%.2fem", new Object[]{((float)((-f1 - 1.0f) * 1.2f))});
                    v2 = 0;
                    z = true;
                    goto label_26;
                }
                goto label_23;
            }
        label_25:
            z = false;
        label_26:
            String s1 = cue0.j == -3.402823E+38f ? "fit-content" : Util.S("%.2f%%", new Object[]{((float)(cue0.j * 100.0f))});
            String s2 = WebViewSubtitleOutput.c(cue0.b);
            String s3 = WebViewSubtitleOutput.f(cue0.p);
            String s4 = this.e(cue0.n, cue0.o);
            String s5 = HtmlUtils.b((cue0.l ? cue0.m : this.d.c));
            int v3 = v2;
            int v4 = cue0.p;
            String s6 = "right";
            String s7 = "top";
            String s8 = "left";
            switch(v4) {
                case 1: {
                    if(z) {
                        s6 = "left";
                    }
                    s8 = "top";
                    s7 = s6;
                    break;
                }
                case 2: {
                    if(!z) {
                        s6 = "left";
                    }
                    s8 = "top";
                    s7 = s6;
                    break;
                }
                default: {
                    if(z) {
                        s7 = "bottom";
                    }
                }
            }
            if(v4 == 1 || v4 == 2) {
                s9 = "height";
                v5 = v3;
                v3 = v1;
            }
            else {
                s9 = "width";
                v5 = v1;
            }
            DisplayMetrics displayMetrics0 = this.getContext().getResources().getDisplayMetrics();
            HtmlAndCss spannedToHtmlConverter$HtmlAndCss0 = SpannedToHtmlConverter.a(cue0.a, displayMetrics0.density);
            for(Object object0: hashMap0.keySet()) {
                String s10 = (String)hashMap0.put(((String)object0), ((String)hashMap0.get(((String)object0))));
                Assertions.i(s10 == null || s10.equals(hashMap0.get(((String)object0))));
            }
            stringBuilder0.append(Util.S("<div style=\'position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;\'>", new Object[]{v, s8, f, s7, s, s9, s1, s2, s3, s4, s5, v5, v3, WebViewSubtitleOutput.h(cue0)}));
            stringBuilder0.append("<span class=\'default_bg\'>");
            Layout.Alignment layout$Alignment0 = cue0.c;
            if(layout$Alignment0 == null) {
                stringBuilder0.append(spannedToHtmlConverter$HtmlAndCss0.a);
            }
            else {
                stringBuilder0.append(Util.S("<span style=\'display:inline-block; text-align:%s;\'>", new Object[]{WebViewSubtitleOutput.c(layout$Alignment0)}));
                stringBuilder0.append(spannedToHtmlConverter$HtmlAndCss0.a);
                stringBuilder0.append("</span>");
            }
            stringBuilder0.append("</span>");
            stringBuilder0.append("</div>");
            ++v;
        }
        stringBuilder0.append("</div></body></html>");
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("<html><head><style>");
        for(Object object1: hashMap0.keySet()) {
            stringBuilder1.append(((String)object1));
            stringBuilder1.append("{");
            stringBuilder1.append(((String)hashMap0.get(((String)object1))));
            stringBuilder1.append("}");
        }
        stringBuilder1.append("</style></head>");
        stringBuilder0.insert(0, stringBuilder1.toString());
        String s11 = Base64.encodeToString(stringBuilder0.toString().getBytes(f.c), 1);
        this.b.loadData(s11, "text/html", "base64");
    }

    @Override  // android.widget.FrameLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(z && !this.c.isEmpty()) {
            this.i();
        }
    }

    class androidx.media3.ui.WebViewSubtitleOutput.2 {
        static final int[] a;

        static {
            int[] arr_v = new int[Layout.Alignment.values().length];
            androidx.media3.ui.WebViewSubtitleOutput.2.a = arr_v;
            try {
                arr_v[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                androidx.media3.ui.WebViewSubtitleOutput.2.a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                androidx.media3.ui.WebViewSubtitleOutput.2.a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

}

