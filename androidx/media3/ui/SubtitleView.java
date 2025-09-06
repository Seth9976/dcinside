package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Dimension;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue.Builder;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@UnstableApi
public final class SubtitleView extends FrameLayout {
    interface Output {
        void a(List arg1, CaptionStyleCompat arg2, float arg3, int arg4, float arg5);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface ViewType {
    }

    private List a;
    private CaptionStyleCompat b;
    private int c;
    private float d;
    private float e;
    private boolean f;
    private boolean g;
    private int h;
    private Output i;
    private View j;
    public static final float k = 0.0533f;
    public static final float l = 0.08f;
    public static final int m = 1;
    public static final int n = 2;

    public SubtitleView(Context context0) {
        this(context0, null);
    }

    public SubtitleView(Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = Collections.emptyList();
        this.b = CaptionStyleCompat.m;
        this.c = 0;
        this.d = 0.0533f;
        this.e = 0.08f;
        this.f = true;
        this.g = true;
        CanvasSubtitleOutput canvasSubtitleOutput0 = new CanvasSubtitleOutput(context0);
        this.i = canvasSubtitleOutput0;
        this.j = canvasSubtitleOutput0;
        this.addView(canvasSubtitleOutput0);
        this.h = 1;
    }

    private Cue a(Cue cue0) {
        Builder cue$Builder0 = cue0.a();
        if(!this.f) {
            SubtitleViewUtils.e(cue$Builder0);
            return cue$Builder0.a();
        }
        if(!this.g) {
            SubtitleViewUtils.f(cue$Builder0);
        }
        return cue$Builder0.a();
    }

    public void b(@Dimension int v, float f) {
        Context context0 = this.getContext();
        this.d(2, TypedValue.applyDimension(v, f, (context0 == null ? Resources.getSystem() : context0.getResources()).getDisplayMetrics()));
    }

    public void c(float f, boolean z) {
        this.d(((int)z), f);
    }

    private void d(int v, float f) {
        this.c = v;
        this.d = f;
        this.g();
    }

    public void e() {
        this.setStyle(this.getUserCaptionStyle());
    }

    public void f() {
        this.setFractionalTextSize(this.getUserCaptionFontScale() * 0.0533f);
    }

    private void g() {
        this.i.a(this.getCuesWithStylingPreferencesApplied(), this.b, this.d, this.c, this.e);
    }

    private List getCuesWithStylingPreferencesApplied() {
        if(this.f && this.g) {
            return this.a;
        }
        List list0 = new ArrayList(this.a.size());
        for(int v = 0; v < this.a.size(); ++v) {
            list0.add(this.a(((Cue)this.a.get(v))));
        }
        return list0;
    }

    private float getUserCaptionFontScale() {
        if(this.isInEditMode()) {
            return 1.0f;
        }
        CaptioningManager captioningManager0 = (CaptioningManager)this.getContext().getSystemService("captioning");
        return captioningManager0 == null || !captioningManager0.isEnabled() ? 1.0f : captioningManager0.getFontScale();
    }

    private CaptionStyleCompat getUserCaptionStyle() {
        if(this.isInEditMode()) {
            return CaptionStyleCompat.m;
        }
        CaptioningManager captioningManager0 = (CaptioningManager)this.getContext().getSystemService("captioning");
        return captioningManager0 == null || !captioningManager0.isEnabled() ? CaptionStyleCompat.m : CaptionStyleCompat.a(captioningManager0.getUserStyle());
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.g = z;
        this.g();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f = z;
        this.g();
    }

    public void setBottomPaddingFraction(float f) {
        this.e = f;
        this.g();
    }

    public void setCues(@Nullable List list0) {
        if(list0 == null) {
            list0 = Collections.emptyList();
        }
        this.a = list0;
        this.g();
    }

    public void setFractionalTextSize(float f) {
        this.c(f, false);
    }

    public void setStyle(CaptionStyleCompat captionStyleCompat0) {
        this.b = captionStyleCompat0;
        this.g();
    }

    private void setView(View view0) {
        this.removeView(this.j);
        View view1 = this.j;
        if(view1 instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput)view1).g();
        }
        this.j = view0;
        this.i = (Output)view0;
        this.addView(view0);
    }

    public void setViewType(int v) {
        if(this.h == v) {
            return;
        }
        switch(v) {
            case 1: {
                this.setView(new CanvasSubtitleOutput(this.getContext()));
                break;
            }
            case 2: {
                this.setView(new WebViewSubtitleOutput(this.getContext()));
                break;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
        this.h = v;
    }
}

