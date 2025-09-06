package codes.side.andcolorpicker.rgb;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.StringRes;
import androidx.core.graphics.ColorUtils;
import codes.side.andcolorpicker.R.attr;
import codes.side.andcolorpicker.R.string;
import codes.side.andcolorpicker.R.styleable;
import codes.side.andcolorpicker.model.h;
import codes.side.andcolorpicker.view.picker.e;
import java.util.HashMap;
import java.util.Set;
import k.i;
import kotlin.J;
import kotlin.K;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.r0;
import y4.l;
import y4.m;
import z3.j;

public final class RGBColorPickerSeekBar extends e {
    public static enum a {
        PURE_COLOR,
        OUTPUT_COLOR,
        PLAIN_COLOR;

    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class c extends Enum implements codes.side.andcolorpicker.view.picker.b.c {
        private final int a;
        private final int b;
        @l
        private final HashMap c;
        private final int d;
        public static final enum c e;
        public static final enum c f;
        public static final enum c g;
        private static final c[] h;

        static {
            HashMap hashMap0 = Y.M(new V[]{new V(a.a, new int[]{0xFF000000, 0xFFFF0000}), r0.a(a.c, new int[]{0xFFFF0000, 0xFFFF0000})});
            c.e = new c("MODE_R", 0, codes.side.andcolorpicker.model.h.b.d.d(), codes.side.andcolorpicker.model.h.b.d.c(), hashMap0, string.title_red);
            HashMap hashMap1 = Y.M(new V[]{new V(a.a, new int[]{0xFF000000, 0xFF00FF00}), r0.a(a.c, new int[]{0xFF00FF00, 0xFF00FF00})});
            c.f = new c("MODE_G", 1, codes.side.andcolorpicker.model.h.b.e.d(), codes.side.andcolorpicker.model.h.b.e.c(), hashMap1, string.title_green);
            HashMap hashMap2 = Y.M(new V[]{new V(a.a, new int[]{0xFF000000, 0xFF0000FF}), r0.a(a.c, new int[]{0xFF0000FF, 0xFF0000FF})});
            c.g = new c("MODE_B", 2, codes.side.andcolorpicker.model.h.b.f.d(), codes.side.andcolorpicker.model.h.b.f.c(), hashMap2, string.title_blue);
            c.h = new c[]{c.e, c.f, c.g};
        }

        private c(String s, int v, int v1, @StringRes int v2, HashMap hashMap0, int v3) {
            super(s, v);
            this.a = v1;
            this.b = v2;
            this.c = hashMap0;
            this.d = v3;
        }

        @Override  // codes.side.andcolorpicker.view.picker.b$c
        public int a() {
            return this.a;
        }

        @Override  // codes.side.andcolorpicker.view.picker.b$c
        public int b() {
            return this.b;
        }

        @l
        public final HashMap c() {
            return this.c;
        }

        public final int d() {
            return this.d;
        }

        public static c valueOf(String s) {
            return (c)Enum.valueOf(c.class, s);
        }

        public static c[] values() {
            return (c[])c.h.clone();
        }
    }

    @l
    public static final b A;
    private boolean t;
    private c u;
    private boolean v;
    private a w;
    private HashMap x;
    private static final c y;
    private static final a z;

    static {
        RGBColorPickerSeekBar.A = new b(null);
        RGBColorPickerSeekBar.y = c.e;
        RGBColorPickerSeekBar.z = a.a;
    }

    @j
    public RGBColorPickerSeekBar(@l Context context0) {
        this(context0, null, 0, 6, null);
    }

    @j
    public RGBColorPickerSeekBar(@l Context context0, @m AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public RGBColorPickerSeekBar(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(new m.e(), context0, attributeSet0, v);
        this.F(attributeSet0);
    }

    public RGBColorPickerSeekBar(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = attr.seekBarStyle;
        }
        this(context0, attributeSet0, v);
    }

    private final void F(AttributeSet attributeSet0) {
        Context context0 = this.getContext();
        L.o(context0, "context");
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, styleable.RGBColorPickerSeekBar, 0, 0);
        L.o(typedArray0, "context.theme.obtainStyl…r,\n      0,\n      0\n    )");
        c[] arr_rGBColorPickerSeekBar$c = c.values();
        this.setMode(arr_rGBColorPickerSeekBar$c[typedArray0.getInteger(styleable.RGBColorPickerSeekBar_rgbMode, RGBColorPickerSeekBar.y.ordinal())]);
        a[] arr_rGBColorPickerSeekBar$a = a.values();
        this.setColoringMode(arr_rGBColorPickerSeekBar$a[typedArray0.getInteger(styleable.RGBColorPickerSeekBar_rgbColoringMode, RGBColorPickerSeekBar.z.ordinal())]);
        typedArray0.recycle();
    }

    static void G(RGBColorPickerSeekBar rGBColorPickerSeekBar0, AttributeSet attributeSet0, int v, Object object0) {
        if((v & 1) != 0) {
            attributeSet0 = null;
        }
        rGBColorPickerSeekBar0.F(attributeSet0);
    }

    protected boolean H(@l h h0, int v) {
        L.p(h0, "color");
        if(!this.t) {
            return false;
        }
        switch(codes.side.andcolorpicker.rgb.a.c[this.getMode().ordinal()]) {
            case 1: {
                if(h0.n() != v) {
                    h0.u(v);
                    return true;
                }
                break;
            }
            case 2: {
                if(h0.m() != v) {
                    h0.t(v);
                    return true;
                }
                break;
            }
            case 3: {
                if(h0.l() != v) {
                    h0.s(v);
                    return true;
                }
                break;
            }
            default: {
                throw new J();
            }
        }
        return false;
    }

    @m
    protected Integer I(@l h h0) {
        L.p(h0, "color");
        if(!this.t) {
            return null;
        }
        switch(codes.side.andcolorpicker.rgb.a.d[this.getMode().ordinal()]) {
            case 1: {
                return h0.n();
            }
            case 2: {
                return h0.m();
            }
            case 3: {
                return h0.l();
            }
            default: {
                throw new J();
            }
        }
    }

    protected void J(@l h h0, @l h h1) {
        L.p(h0, "color");
        L.p(h1, "value");
        h0.d(h1);
    }

    private final void K(GradientDrawable gradientDrawable0) {
        if(this.v && this.t) {
            int v = this.getProgress();
            int v1 = this.getThumbStrokeWidthPx();
            switch(this.getColoringMode()) {
                case 1: 
                case 2: {
                    Object object0 = this.getMode().c().get(this.getColoringMode());
                    if(object0 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    gradientDrawable0.setStroke(v1, ColorUtils.j(kotlin.collections.l.Nb(((int[])object0)), kotlin.collections.l.wh(((int[])object0)), ((float)v) / ((float)this.getMode().b())));
                    return;
                }
                case 3: {
                    switch(this.getMode()) {
                        case 1: {
                            throw new K(null, 1, null);
                        }
                        case 2: {
                            throw new K(null, 1, null);
                        }
                        case 3: {
                            throw new K(null, 1, null);
                        }
                        default: {
                            throw new J();
                        }
                    }
                }
                default: {
                    throw new J();
                }
            }
        }
    }

    @Override  // codes.side.andcolorpicker.view.picker.e
    public void a() {
        HashMap hashMap0 = this.x;
        if(hashMap0 != null) {
            hashMap0.clear();
        }
    }

    @Override  // codes.side.andcolorpicker.view.picker.e
    public View b(int v) {
        if(this.x == null) {
            this.x = new HashMap();
        }
        View view0 = (View)this.x.get(v);
        if(view0 == null) {
            view0 = this.findViewById(v);
            this.x.put(v, view0);
        }
        return view0;
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public k.a getColorConverter() {
        return this.getColorConverter();
    }

    @l
    protected i getColorConverter() {
        k.a a0 = super.getColorConverter();
        if(a0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type codes.side.andcolorpicker.converter.IntegerRGBColorConverter");
        }
        return (i)a0;
    }

    @l
    public final a getColoringMode() {
        a rGBColorPickerSeekBar$a0 = this.w;
        if(rGBColorPickerSeekBar$a0 == null) {
            throw new IllegalArgumentException("Coloring mode is not initialized yet");
        }
        return rGBColorPickerSeekBar$a0;
    }

    @l
    public final c getMode() {
        c rGBColorPickerSeekBar$c0 = this.u;
        if(rGBColorPickerSeekBar$c0 == null) {
            throw new IllegalArgumentException("Mode is not initialized yet");
        }
        return rGBColorPickerSeekBar$c0;
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public boolean o(codes.side.andcolorpicker.model.a a0, int v) {
        return this.H(((h)a0), v);
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    protected void p(@l LayerDrawable layerDrawable0) {
        L.p(layerDrawable0, "progressDrawable");
        if(this.v && this.t) {
            Drawable drawable0 = layerDrawable0.getDrawable(0);
            if(drawable0 != null) {
                switch(codes.side.andcolorpicker.rgb.a.b[this.getColoringMode().ordinal()]) {
                    case 1: 
                    case 2: {
                        ((GradientDrawable)drawable0).setColors(((int[])this.getMode().c().get(this.getColoringMode())));
                        return;
                    }
                    case 3: {
                        switch(codes.side.andcolorpicker.rgb.a.a[this.getMode().ordinal()]) {
                            case 1: {
                                throw new K(null, 1, null);
                            }
                            case 2: {
                                throw new K(null, 1, null);
                            }
                            case 3: {
                                throw new K(null, 1, null);
                            }
                            default: {
                                throw new J();
                            }
                        }
                    }
                    default: {
                        throw new J();
                    }
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public Integer q(codes.side.andcolorpicker.model.a a0) {
        return this.I(((h)a0));
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    protected void r() {
        if(!this.t) {
            return;
        }
        this.setMax(this.getMode().b());
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    protected void s(@l Set set0) {
        L.p(set0, "thumbColoringDrawables");
        for(Object object0: set0) {
            Drawable drawable0 = (Drawable)object0;
            if(drawable0 instanceof GradientDrawable) {
                this.K(((GradientDrawable)drawable0));
            }
            else if(drawable0 instanceof LayerDrawable) {
                Drawable drawable1 = ((LayerDrawable)drawable0).getDrawable(0);
                if(drawable1 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                }
                this.K(((GradientDrawable)drawable1));
            }
        }
    }

    public final void setColoringMode(@l a rGBColorPickerSeekBar$a0) {
        L.p(rGBColorPickerSeekBar$a0, "value");
        this.v = true;
        if(this.w == rGBColorPickerSeekBar$a0) {
            return;
        }
        this.w = rGBColorPickerSeekBar$a0;
        this.w();
        this.z();
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public void setMax(int v) {
        if(this.t && v != this.k(this.getMode())) {
            throw new IllegalArgumentException("Current mode supports " + this.k(this.getMode()) + " max value only, was " + v);
        }
        super.setMax(v);
    }

    public final void setMode(@l c rGBColorPickerSeekBar$c0) {
        L.p(rGBColorPickerSeekBar$c0, "value");
        this.t = true;
        if(this.u == rGBColorPickerSeekBar$c0) {
            return;
        }
        this.u = rGBColorPickerSeekBar$c0;
        this.y();
        this.x();
        this.w();
        this.z();
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public void u(codes.side.andcolorpicker.model.a a0, codes.side.andcolorpicker.model.a a1) {
        this.J(((h)a0), ((h)a1));
    }
}

