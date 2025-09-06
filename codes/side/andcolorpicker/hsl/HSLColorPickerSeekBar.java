package codes.side.andcolorpicker.hsl;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import codes.side.andcolorpicker.R.attr;
import codes.side.andcolorpicker.R.styleable;
import codes.side.andcolorpicker.view.picker.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import kotlin.D;
import kotlin.E;
import kotlin.J;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;
import z3.j;

public final class HSLColorPickerSeekBar extends e {
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
        MODE_HUE(codes.side.andcolorpicker.model.e.b.d.d(), codes.side.andcolorpicker.model.e.b.d.c()),
        MODE_SATURATION(codes.side.andcolorpicker.model.e.b.e.d(), codes.side.andcolorpicker.model.e.b.e.c()),
        MODE_LIGHTNESS(codes.side.andcolorpicker.model.e.b.f.d(), codes.side.andcolorpicker.model.e.b.f.c());

        private final int a;
        private final int b;

        private c(int v1, int v2) {
            this.a = v1;
            this.b = v2;
        }

        @Override  // codes.side.andcolorpicker.view.picker.b$c
        public int a() {
            return this.a;
        }

        @Override  // codes.side.andcolorpicker.view.picker.b$c
        public int b() {
            return this.b;
        }
    }

    private final D A;
    private final D B;
    private final D C;
    private HashMap D;
    private static final c E = null;
    private static final a F = null;
    private static final int G = 90;
    private static final int[] H;
    private static final int I;
    private static final float[] J;
    @l
    public static final b K;
    private boolean t;
    private c u;
    private boolean v;
    private a w;
    private final D x;
    private final D y;
    private final D z;

    static {
        HSLColorPickerSeekBar.K = new b(null);
        HSLColorPickerSeekBar.E = c.c;
        HSLColorPickerSeekBar.F = a.a;
        HSLColorPickerSeekBar.H = new int[]{0xFFFF0000, 0xFFFFFF00, 0xFF00FF00, 0xFF00FFFF, 0xFF0000FF, 0xFFFF00FF, 0xFFFF0000};
        int v = Color.rgb(0x80, 0x80, 0x80);
        HSLColorPickerSeekBar.I = v;
        float[] arr_f = new float[3];
        ColorUtils.q(v, arr_f);
        HSLColorPickerSeekBar.J = arr_f;
    }

    @j
    public HSLColorPickerSeekBar(@l Context context0) {
        this(context0, null, 0, 6, null);
    }

    @j
    public HSLColorPickerSeekBar(@l Context context0, @m AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public HSLColorPickerSeekBar(@l Context context0, @m AttributeSet attributeSet0, int v) {
        static final class d extends N implements A3.a {
            public static final d e;

            static {
                d.e = new d();
            }

            d() {
                super(0);
            }

            @l
            public final float[] b() {
                return new float[3];
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class codes.side.andcolorpicker.hsl.HSLColorPickerSeekBar.e extends N implements A3.a {
            public static final codes.side.andcolorpicker.hsl.HSLColorPickerSeekBar.e e;

            static {
                codes.side.andcolorpicker.hsl.HSLColorPickerSeekBar.e.e = new codes.side.andcolorpicker.hsl.HSLColorPickerSeekBar.e();
            }

            codes.side.andcolorpicker.hsl.HSLColorPickerSeekBar.e() {
                super(0);
            }

            @l
            public final codes.side.andcolorpicker.model.e b() {
                return new codes.side.andcolorpicker.model.e();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class f extends N implements A3.a {
            public static final f e;

            static {
                f.e = new f();
            }

            f() {
                super(0);
            }

            @l
            public final codes.side.andcolorpicker.model.e b() {
                return new codes.side.andcolorpicker.model.e();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class g extends N implements A3.a {
            public static final g e;

            static {
                g.e = new g();
            }

            g() {
                super(0);
            }

            @l
            public final int[] b() {
                return new int[3];
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class h extends N implements A3.a {
            public static final h e;

            static {
                h.e = new h();
            }

            h() {
                super(0);
            }

            @l
            public final int[] b() {
                return new int[2];
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class i extends N implements A3.a {
            public static final i e;

            static {
                i.e = new i();
            }

            i() {
                super(0);
            }

            @l
            public final float[] b() {
                return (float[])HSLColorPickerSeekBar.J.clone();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(context0, "context");
        super(new m.c(), context0, attributeSet0, v);
        this.x = E.a(f.e);
        this.y = E.a(codes.side.andcolorpicker.hsl.HSLColorPickerSeekBar.e.e);
        this.z = E.a(h.e);
        this.A = E.a(g.e);
        this.B = E.a(i.e);
        this.C = E.a(d.e);
        this.H(attributeSet0);
    }

    public HSLColorPickerSeekBar(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = attr.seekBarStyle;
        }
        this(context0, attributeSet0, v);
    }

    private final int[] G() {
        int[] arr_v = HSLColorPickerSeekBar.H;
        ArrayList arrayList0 = new ArrayList(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            ColorUtils.q(arr_v[v], this.getCreateHueOutputColorCheckpointsHSLCache());
            float[] arr_f = this.getCreateHueOutputColorCheckpointsHSLCache();
            arr_f[codes.side.andcolorpicker.model.e.b.e.b()] = ((codes.side.andcolorpicker.model.e)this.getInternalPickedColor()).j();
            float[] arr_f1 = this.getCreateHueOutputColorCheckpointsHSLCache();
            arr_f1[codes.side.andcolorpicker.model.e.b.f.b()] = ((codes.side.andcolorpicker.model.e)this.getInternalPickedColor()).h();
            arrayList0.add(ColorUtils.a(this.getCreateHueOutputColorCheckpointsHSLCache()));
        }
        return u.U5(arrayList0);
    }

    private final void H(AttributeSet attributeSet0) {
        Context context0 = this.getContext();
        L.o(context0, "context");
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, styleable.HSLColorPickerSeekBar, 0, 0);
        L.o(typedArray0, "context.theme.obtainStyl…r,\n      0,\n      0\n    )");
        c[] arr_hSLColorPickerSeekBar$c = c.values();
        this.setMode(arr_hSLColorPickerSeekBar$c[typedArray0.getInteger(styleable.HSLColorPickerSeekBar_hslMode, HSLColorPickerSeekBar.E.ordinal())]);
        a[] arr_hSLColorPickerSeekBar$a = a.values();
        this.setColoringMode(arr_hSLColorPickerSeekBar$a[typedArray0.getInteger(styleable.HSLColorPickerSeekBar_hslColoringMode, HSLColorPickerSeekBar.F.ordinal())]);
        typedArray0.recycle();
    }

    static void I(HSLColorPickerSeekBar hSLColorPickerSeekBar0, AttributeSet attributeSet0, int v, Object object0) {
        if((v & 1) != 0) {
            attributeSet0 = null;
        }
        hSLColorPickerSeekBar0.H(attributeSet0);
    }

    protected boolean J(@l codes.side.andcolorpicker.model.e e0, int v) {
        L.p(e0, "color");
        if(!this.t) {
            return false;
        }
        int v1 = this.getMode().a() + v;
        switch(this.getMode()) {
            case 1: {
                if(e0.l() != v1) {
                    e0.s(v1);
                    return true;
                }
                break;
            }
            case 2: {
                if(e0.n() != v1) {
                    e0.u(v1);
                    return true;
                }
                break;
            }
            case 3: {
                if(e0.m() != v1) {
                    e0.t(v1);
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
    protected Integer K(@l codes.side.andcolorpicker.model.e e0) {
        L.p(e0, "color");
        if(!this.t) {
            return null;
        }
        int v = this.getMode().a();
        switch(this.getMode()) {
            case 1: {
                return (int)(((codes.side.andcolorpicker.model.e)this.getInternalPickedColor()).l() - v);
            }
            case 2: {
                return (int)(((codes.side.andcolorpicker.model.e)this.getInternalPickedColor()).n() - v);
            }
            case 3: {
                return (int)(((codes.side.andcolorpicker.model.e)this.getInternalPickedColor()).m() - v);
            }
            default: {
                throw new J();
            }
        }
    }

    protected void L(@l codes.side.andcolorpicker.model.e e0, @l codes.side.andcolorpicker.model.e e1) {
        L.p(e0, "color");
        L.p(e1, "value");
        e0.d(e1);
    }

    private final void M(GradientDrawable gradientDrawable0) {
        int v2;
        if(this.v && this.t) {
            int v = this.getThumbStrokeWidthPx();
            int v1 = codes.side.andcolorpicker.hsl.a.j[this.getMode().ordinal()];
        alab1:
            switch(v1) {
                case 1: {
                    switch(this.getColoringMode()) {
                        case 1: {
                            v2 = this.getColorConverter().a(this.getInternalPickedColor());
                            break alab1;
                        }
                        case 2: {
                            v2 = this.getColorConverter().b(this.getInternalPickedColor());
                            break alab1;
                        }
                        default: {
                            throw new J();
                        }
                    }
                }
                case 2: {
                    switch(this.getColoringMode()) {
                        case 1: {
                            k.g g2 = this.getColorConverter();
                            codes.side.andcolorpicker.model.e e2 = this.getPaintDrawableStrokeSaturationHSLCache();
                            e2.a(new int[]{((codes.side.andcolorpicker.model.e)this.getInternalPickedColor()).l(), ((codes.side.andcolorpicker.model.e)this.getInternalPickedColor()).n(), codes.side.andcolorpicker.model.e.b.f.a()});
                            v2 = g2.b(e2);
                            break alab1;
                        }
                        case 2: {
                            v2 = this.getColorConverter().b(this.getInternalPickedColor());
                            break alab1;
                        }
                        default: {
                            throw new J();
                        }
                    }
                }
                default: {
                    if(v1 != 3) {
                        throw new J();
                    }
                    switch(this.getColoringMode()) {
                        case 1: {
                            k.g g0 = this.getColorConverter();
                            codes.side.andcolorpicker.model.e e0 = this.getPaintDrawableStrokeLightnessHSLCache();
                            e0.a(new int[]{((codes.side.andcolorpicker.model.e)this.getInternalPickedColor()).l(), codes.side.andcolorpicker.model.e.b.e.a(), s.B(((codes.side.andcolorpicker.model.e)this.getInternalPickedColor()).m(), 90)});
                            v2 = g0.b(e0);
                            break;
                        }
                        case 2: {
                            k.g g1 = this.getColorConverter();
                            codes.side.andcolorpicker.model.e e1 = this.getPaintDrawableStrokeLightnessHSLCache();
                            e1.a(new int[]{((codes.side.andcolorpicker.model.e)this.getInternalPickedColor()).l(), ((codes.side.andcolorpicker.model.e)this.getInternalPickedColor()).n(), s.B(((codes.side.andcolorpicker.model.e)this.getInternalPickedColor()).m(), 90)});
                            v2 = g1.b(e1);
                            break;
                        }
                        default: {
                            throw new J();
                        }
                    }
                }
            }
            gradientDrawable0.setStroke(v, v2);
        }
    }

    private final void N() {
        this.getZeroSaturationOutputColorHSLCache()[2] = ((codes.side.andcolorpicker.model.e)this.getInternalPickedColor()).h();
    }

    @Override  // codes.side.andcolorpicker.view.picker.e
    public void a() {
        HashMap hashMap0 = this.D;
        if(hashMap0 != null) {
            hashMap0.clear();
        }
    }

    @Override  // codes.side.andcolorpicker.view.picker.e
    public View b(int v) {
        if(this.D == null) {
            this.D = new HashMap();
        }
        View view0 = (View)this.D.get(v);
        if(view0 == null) {
            view0 = this.findViewById(v);
            this.D.put(v, view0);
        }
        return view0;
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public k.a getColorConverter() {
        return this.getColorConverter();
    }

    @l
    protected k.g getColorConverter() {
        k.a a0 = super.getColorConverter();
        if(a0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type codes.side.andcolorpicker.converter.IntegerHSLColorConverter");
        }
        return (k.g)a0;
    }

    @l
    public final a getColoringMode() {
        a hSLColorPickerSeekBar$a0 = this.w;
        if(hSLColorPickerSeekBar$a0 == null) {
            throw new IllegalArgumentException("Coloring mode is not initialized yet");
        }
        return hSLColorPickerSeekBar$a0;
    }

    private final float[] getCreateHueOutputColorCheckpointsHSLCache() {
        return (float[])this.C.getValue();
    }

    @l
    public final c getMode() {
        c hSLColorPickerSeekBar$c0 = this.u;
        if(hSLColorPickerSeekBar$c0 == null) {
            throw new IllegalArgumentException("Mode is not initialized yet");
        }
        return hSLColorPickerSeekBar$c0;
    }

    private final codes.side.andcolorpicker.model.e getPaintDrawableStrokeLightnessHSLCache() {
        return (codes.side.andcolorpicker.model.e)this.y.getValue();
    }

    private final codes.side.andcolorpicker.model.e getPaintDrawableStrokeSaturationHSLCache() {
        return (codes.side.andcolorpicker.model.e)this.x.getValue();
    }

    private final int[] getProgressDrawableLightnessColorsCache() {
        return (int[])this.A.getValue();
    }

    private final int[] getProgressDrawableSaturationColorsCache() {
        return (int[])this.z.getValue();
    }

    private final float[] getZeroSaturationOutputColorHSLCache() {
        return (float[])this.B.getValue();
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public boolean o(codes.side.andcolorpicker.model.a a0, int v) {
        return this.J(((codes.side.andcolorpicker.model.e)a0), v);
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    protected void p(@l LayerDrawable layerDrawable0) {
        int v1;
        int[] arr_v;
        L.p(layerDrawable0, "progressDrawable");
        if(this.v && this.t) {
            Drawable drawable0 = layerDrawable0.getDrawable(0);
            if(drawable0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            }
            int v = codes.side.andcolorpicker.hsl.a.e[this.getMode().ordinal()];
        alab1:
            switch(v) {
                case 1: {
                    switch(this.getColoringMode()) {
                        case 1: {
                            arr_v = HSLColorPickerSeekBar.H;
                            break alab1;
                        }
                        case 2: {
                            arr_v = this.G();
                            break alab1;
                        }
                        default: {
                            throw new J();
                        }
                    }
                }
                case 2: {
                    switch(this.getColoringMode()) {
                        case 1: {
                            arr_v = this.getProgressDrawableSaturationColorsCache();
                            arr_v[0] = HSLColorPickerSeekBar.I;
                            arr_v[1] = this.getColorConverter().a(this.getInternalPickedColor());
                            break alab1;
                        }
                        case 2: {
                            this.N();
                            arr_v = this.getProgressDrawableSaturationColorsCache();
                            arr_v[0] = ColorUtils.a(this.getZeroSaturationOutputColorHSLCache());
                            arr_v[1] = this.getColorConverter().b(this.getInternalPickedColor());
                            break alab1;
                        }
                        default: {
                            throw new J();
                        }
                    }
                }
                default: {
                    if(v != 3) {
                        throw new J();
                    }
                    arr_v = this.getProgressDrawableLightnessColorsCache();
                    arr_v[0] = 0xFF000000;
                    switch(this.getColoringMode()) {
                        case 1: {
                            v1 = this.getColorConverter().a(this.getInternalPickedColor());
                            break;
                        }
                        case 2: {
                            v1 = this.getColorConverter().e(this.getInternalPickedColor());
                            break;
                        }
                        default: {
                            throw new J();
                        }
                    }
                    arr_v[1] = v1;
                    arr_v[2] = -1;
                    break;
                }
            }
            ((GradientDrawable)drawable0).setColors(arr_v);
        }
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public Integer q(codes.side.andcolorpicker.model.a a0) {
        return this.K(((codes.side.andcolorpicker.model.e)a0));
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
                this.M(((GradientDrawable)drawable0));
            }
            else if(drawable0 instanceof LayerDrawable) {
                Drawable drawable1 = ((LayerDrawable)drawable0).getDrawable(0);
                if(drawable1 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                }
                this.M(((GradientDrawable)drawable1));
            }
        }
    }

    public final void setColoringMode(@l a hSLColorPickerSeekBar$a0) {
        L.p(hSLColorPickerSeekBar$a0, "value");
        this.v = true;
        if(this.w == hSLColorPickerSeekBar$a0) {
            return;
        }
        this.w = hSLColorPickerSeekBar$a0;
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

    public final void setMode(@l c hSLColorPickerSeekBar$c0) {
        L.p(hSLColorPickerSeekBar$c0, "value");
        this.t = true;
        if(this.u == hSLColorPickerSeekBar$c0) {
            return;
        }
        this.u = hSLColorPickerSeekBar$c0;
        this.y();
        this.x();
        this.w();
        this.z();
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.View
    @l
    public String toString() {
        return "HSLColorPickerSeekBar(tag = " + this.getTag() + ", _mode=" + (this.t ? this.getMode() : null) + ", _currentColor=" + ((codes.side.andcolorpicker.model.e)this.getInternalPickedColor()) + ')';
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public void u(codes.side.andcolorpicker.model.a a0, codes.side.andcolorpicker.model.a a1) {
        this.L(((codes.side.andcolorpicker.model.e)a0), ((codes.side.andcolorpicker.model.e)a1));
    }
}

