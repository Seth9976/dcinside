package codes.side.andcolorpicker.view.swatch;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import codes.side.andcolorpicker.R.drawable;
import codes.side.andcolorpicker.model.a;
import codes.side.andcolorpicker.model.b;
import java.util.HashMap;
import k.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class SwatchView extends View {
    private final Drawable a;
    private HashMap b;

    @j
    public SwatchView(@l Context context0) {
        this(context0, null, 0, 6, null);
    }

    @j
    public SwatchView(@l Context context0, @m AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public SwatchView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        Drawable drawable0 = ContextCompat.getDrawable(context0, drawable.bg_transparency_pattern);
        if(drawable0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.a = drawable0;
        this.setBackground(new LayerDrawable(new Drawable[]{drawable0, new ColorDrawable()}));
    }

    public SwatchView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public void a() {
        HashMap hashMap0 = this.b;
        if(hashMap0 != null) {
            hashMap0.clear();
        }
    }

    public View b(int v) {
        if(this.b == null) {
            this.b = new HashMap();
        }
        View view0 = (View)this.b.get(v);
        if(view0 == null) {
            view0 = this.findViewById(v);
            this.b.put(v, view0);
        }
        return view0;
    }

    public final void setSwatchColor(@l a a0) {
        L.p(a0, "color");
        Drawable drawable0 = this.getBackground();
        if(drawable0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        }
        Drawable drawable1 = ((LayerDrawable)drawable0).getDrawable(1);
        if(drawable1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
        }
        b b0 = a0.N1();
        ((ColorDrawable)drawable1).setColor(d.b.a(b0).b(a0));
    }

    public final void setSwatchPatternTint(@ColorInt int v) {
        DrawableCompat.n(this.a, v);
    }
}

