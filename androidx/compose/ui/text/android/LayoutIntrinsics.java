package androidx.compose.ui.text.android;

import android.text.BoringLayout.Metrics;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
public final class LayoutIntrinsics {
    @l
    private final CharSequence a;
    @l
    private final TextPaint b;
    private final int c;
    private float d;
    private float e;
    @m
    private BoringLayout.Metrics f;
    private boolean g;
    public static final int h = 8;

    static {
    }

    public LayoutIntrinsics(@l CharSequence charSequence0, @l TextPaint textPaint0, int v) {
        L.p(charSequence0, "charSequence");
        L.p(textPaint0, "textPaint");
        super();
        this.a = charSequence0;
        this.b = textPaint0;
        this.c = v;
        this.d = NaNf;
        this.e = NaNf;
    }

    @m
    public final BoringLayout.Metrics a() {
        if(!this.g) {
            TextDirectionHeuristic textDirectionHeuristic0 = TextLayoutKt.i(this.c);
            this.f = BoringLayoutFactory.a.d(this.a, this.b, textDirectionHeuristic0);
            this.g = true;
        }
        return this.f;
    }

    public final float b() {
        if(!Float.isNaN(this.d)) {
            return this.d;
        }
        BoringLayout.Metrics boringLayout$Metrics0 = this.a();
        Float float0 = boringLayout$Metrics0 == null ? null : ((float)boringLayout$Metrics0.width);
        if(float0 == null) {
            int v = this.a.length();
            float0 = (float)Math.ceil(Layout.getDesiredWidth(this.a, 0, v, this.b));
        }
        if(LayoutIntrinsicsKt.e(((float)float0), this.a, this.b)) {
            float0 = (float)(((float)float0) + 0.5f);
        }
        float f = (float)float0;
        this.d = f;
        return f;
    }

    public final float c() {
        if(!Float.isNaN(this.e)) {
            return this.e;
        }
        float f = LayoutIntrinsicsKt.c(this.a, this.b);
        this.e = f;
        return f;
    }
}

