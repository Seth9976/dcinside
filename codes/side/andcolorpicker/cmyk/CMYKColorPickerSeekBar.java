package codes.side.andcolorpicker.cmyk;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import codes.side.andcolorpicker.R.attr;
import codes.side.andcolorpicker.R.styleable;
import codes.side.andcolorpicker.view.picker.e;
import java.util.HashMap;
import java.util.Set;
import k.f;
import kotlin.J;
import kotlin.K;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;
import z3.j;

public final class CMYKColorPickerSeekBar extends e {
    public static enum a {
        PURE_COLOR,
        OUTPUT_COLOR;

    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }
    }

    public static enum c implements codes.side.andcolorpicker.view.picker.b.c {
        MODE_C(codes.side.andcolorpicker.model.c.b.d.d(), codes.side.andcolorpicker.model.c.b.d.c(), new int[]{-1, 0xFF00FFFF}),
        MODE_M(codes.side.andcolorpicker.model.c.b.e.d(), codes.side.andcolorpicker.model.c.b.e.c(), new int[]{-1, 0xFFFF00FF}),
        MODE_Y(codes.side.andcolorpicker.model.c.b.f.d(), codes.side.andcolorpicker.model.c.b.f.c(), new int[]{-1, 0xFFFFFF00}),
        MODE_K(codes.side.andcolorpicker.model.c.b.g.d(), codes.side.andcolorpicker.model.c.b.g.c(), new int[]{-1, 0xFF000000});

        private final int a;
        private final int b;
        @l
        private final int[] c;

        private c(int v1, int v2, int[] arr_v) {
            this.a = v1;
            this.b = v2;
            this.c = arr_v;
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
        public final int[] c() {
            return this.c;
        }
    }

    private static final int A = 15;
    @l
    public static final b B;
    private boolean t;
    private c u;
    private boolean v;
    private a w;
    private HashMap x;
    private static final c y;
    private static final a z;

    static {
        CMYKColorPickerSeekBar.B = new b(null);
        CMYKColorPickerSeekBar.y = c.d;
        CMYKColorPickerSeekBar.z = a.a;
    }

    @j
    public CMYKColorPickerSeekBar(@l Context context0) {
        this(context0, null, 0, 6, null);
    }

    @j
    public CMYKColorPickerSeekBar(@l Context context0, @m AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public CMYKColorPickerSeekBar(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(new m.a(), context0, attributeSet0, v);
        this.F(attributeSet0);
    }

    public CMYKColorPickerSeekBar(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
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
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, styleable.CMYKColorPickerSeekBar, 0, 0);
        L.o(typedArray0, "context.theme.obtainStyl…r,\n      0,\n      0\n    )");
        c[] arr_cMYKColorPickerSeekBar$c = c.values();
        this.setMode(arr_cMYKColorPickerSeekBar$c[typedArray0.getInteger(styleable.CMYKColorPickerSeekBar_cmykMode, CMYKColorPickerSeekBar.y.ordinal())]);
        a[] arr_cMYKColorPickerSeekBar$a = a.values();
        this.setColoringMode(arr_cMYKColorPickerSeekBar$a[typedArray0.getInteger(styleable.CMYKColorPickerSeekBar_cmykColoringMode, CMYKColorPickerSeekBar.z.ordinal())]);
        typedArray0.recycle();
    }

    static void G(CMYKColorPickerSeekBar cMYKColorPickerSeekBar0, AttributeSet attributeSet0, int v, Object object0) {
        if((v & 1) != 0) {
            attributeSet0 = null;
        }
        cMYKColorPickerSeekBar0.F(attributeSet0);
    }

    protected boolean H(@l codes.side.andcolorpicker.model.c c0, int v) {
        L.p(c0, "color");
        if(!this.t) {
            return false;
        }
        int v1 = this.getMode().a() + v;
        switch(codes.side.andcolorpicker.cmyk.a.g[this.getMode().ordinal()]) {
            case 1: {
                if(c0.m() != v1) {
                    c0.v(v1);
                    return true;
                }
                break;
            }
            case 2: {
                if(c0.o() != v1) {
                    c0.x(v1);
                    return true;
                }
                break;
            }
            case 3: {
                if(c0.p() != v1) {
                    c0.y(v1);
                    return true;
                }
                break;
            }
            case 4: {
                if(c0.n() != v1) {
                    c0.w(v1);
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
    protected Integer I(@l codes.side.andcolorpicker.model.c c0) {
        L.p(c0, "color");
        if(!this.t) {
            return null;
        }
        int v = this.getMode().a();
        switch(codes.side.andcolorpicker.cmyk.a.a[this.getMode().ordinal()]) {
            case 1: {
                return (int)(((codes.side.andcolorpicker.model.c)this.getInternalPickedColor()).m() - v);
            }
            case 2: {
                return (int)(((codes.side.andcolorpicker.model.c)this.getInternalPickedColor()).o() - v);
            }
            case 3: {
                return (int)(((codes.side.andcolorpicker.model.c)this.getInternalPickedColor()).p() - v);
            }
            case 4: {
                return (int)(((codes.side.andcolorpicker.model.c)this.getInternalPickedColor()).n() - v);
            }
            default: {
                throw new J();
            }
        }
    }

    protected void J(@l codes.side.andcolorpicker.model.c c0, @l codes.side.andcolorpicker.model.c c1) {
        L.p(c0, "color");
        L.p(c1, "value");
        c0.d(c1);
    }

    private final void K(GradientDrawable gradientDrawable0) {
        int v2;
        if(this.v && this.t) {
            int v = this.getProgress();
            int v1 = this.getThumbStrokeWidthPx();
        alab1:
            switch(codes.side.andcolorpicker.cmyk.a.l[this.getMode().ordinal()]) {
                case 1: {
                    switch(codes.side.andcolorpicker.cmyk.a.h[this.getColoringMode().ordinal()]) {
                        case 1: {
                            v2 = ColorUtils.j(-1, 0xFF00FFFF, ((float)s.u(v, 15)) / ((float)this.getMode().b()));
                            break alab1;
                        }
                        case 2: {
                            throw new K(null, 1, null);
                        }
                        default: {
                            throw new J();
                        }
                    }
                }
                case 2: {
                    switch(codes.side.andcolorpicker.cmyk.a.i[this.getColoringMode().ordinal()]) {
                        case 1: {
                            v2 = ColorUtils.j(-1, 0xFFFF00FF, ((float)s.u(v, 15)) / ((float)this.getMode().b()));
                            break alab1;
                        }
                        case 2: {
                            throw new K(null, 1, null);
                        }
                        default: {
                            throw new J();
                        }
                    }
                }
                case 3: {
                    switch(codes.side.andcolorpicker.cmyk.a.j[this.getColoringMode().ordinal()]) {
                        case 1: {
                            v2 = ColorUtils.j(-1, 0xFFFFFF00, ((float)s.u(v, 15)) / ((float)this.getMode().b()));
                            break alab1;
                        }
                        case 2: {
                            throw new K(null, 1, null);
                        }
                        default: {
                            throw new J();
                        }
                    }
                }
                case 4: {
                    switch(codes.side.andcolorpicker.cmyk.a.k[this.getColoringMode().ordinal()]) {
                        case 1: {
                            v2 = ColorUtils.j(-1, 0xFF000000, ((float)s.u(v, 15)) / ((float)this.getMode().b()));
                            break alab1;
                        }
                        case 2: {
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
            gradientDrawable0.setStroke(v1, v2);
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
    protected f getColorConverter() {
        k.a a0 = super.getColorConverter();
        if(a0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type codes.side.andcolorpicker.converter.IntegerCMYKColorConverter");
        }
        return (f)a0;
    }

    @l
    public final a getColoringMode() {
        a cMYKColorPickerSeekBar$a0 = this.w;
        if(cMYKColorPickerSeekBar$a0 == null) {
            throw new IllegalArgumentException("Coloring mode is not initialized yet");
        }
        return cMYKColorPickerSeekBar$a0;
    }

    @l
    public final c getMode() {
        c cMYKColorPickerSeekBar$c0 = this.u;
        if(cMYKColorPickerSeekBar$c0 == null) {
            throw new IllegalArgumentException("Mode is not initialized yet");
        }
        return cMYKColorPickerSeekBar$c0;
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public boolean o(codes.side.andcolorpicker.model.a a0, int v) {
        return this.H(((codes.side.andcolorpicker.model.c)a0), v);
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    protected void p(@l LayerDrawable layerDrawable0) {
        int[] arr_v;
        L.p(layerDrawable0, "progressDrawable");
        if(this.v && this.t) {
            Drawable drawable0 = layerDrawable0.getDrawable(0);
            if(drawable0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            }
        alab1:
            switch(codes.side.andcolorpicker.cmyk.a.f[this.getMode().ordinal()]) {
                case 1: {
                    switch(codes.side.andcolorpicker.cmyk.a.b[this.getColoringMode().ordinal()]) {
                        case 1: {
                            arr_v = c.d.c();
                            break alab1;
                        }
                        case 2: {
                            throw new K(null, 1, null);
                        }
                        default: {
                            throw new J();
                        }
                    }
                }
                case 2: {
                    switch(codes.side.andcolorpicker.cmyk.a.c[this.getColoringMode().ordinal()]) {
                        case 1: {
                            arr_v = c.e.c();
                            break alab1;
                        }
                        case 2: {
                            throw new K(null, 1, null);
                        }
                        default: {
                            throw new J();
                        }
                    }
                }
                case 3: {
                    switch(codes.side.andcolorpicker.cmyk.a.d[this.getColoringMode().ordinal()]) {
                        case 1: {
                            arr_v = c.f.c();
                            break alab1;
                        }
                        case 2: {
                            throw new K(null, 1, null);
                        }
                        default: {
                            throw new J();
                        }
                    }
                }
                case 4: {
                    switch(codes.side.andcolorpicker.cmyk.a.e[this.getColoringMode().ordinal()]) {
                        case 1: {
                            arr_v = c.g.c();
                            break alab1;
                        }
                        case 2: {
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
            ((GradientDrawable)drawable0).setColors(arr_v);
        }
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public Integer q(codes.side.andcolorpicker.model.a a0) {
        return this.I(((codes.side.andcolorpicker.model.c)a0));
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    protected void r() {
        if(!this.t) {
            return;
        }
        this.setMax(this.k(this.getMode()));
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

    public final void setColoringMode(@l a cMYKColorPickerSeekBar$a0) {
        L.p(cMYKColorPickerSeekBar$a0, "value");
        this.v = true;
        if(this.w == cMYKColorPickerSeekBar$a0) {
            return;
        }
        this.w = cMYKColorPickerSeekBar$a0;
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

    public final void setMode(@l c cMYKColorPickerSeekBar$c0) {
        L.p(cMYKColorPickerSeekBar$c0, "value");
        this.t = true;
        if(this.u == cMYKColorPickerSeekBar$c0) {
            return;
        }
        this.u = cMYKColorPickerSeekBar$c0;
        this.y();
        this.x();
        this.w();
        this.z();
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public void u(codes.side.andcolorpicker.model.a a0, codes.side.andcolorpicker.model.a a1) {
        this.J(((codes.side.andcolorpicker.model.c)a0), ((codes.side.andcolorpicker.model.c)a1));
    }
}

