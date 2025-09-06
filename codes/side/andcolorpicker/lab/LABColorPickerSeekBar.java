package codes.side.andcolorpicker.lab;

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
import codes.side.andcolorpicker.model.f;
import codes.side.andcolorpicker.view.picker.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import k.h;
import kotlin.D;
import kotlin.E;
import kotlin.J;
import kotlin.collections.T;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.ranges.j;
import kotlin.ranges.s;
import m.d;
import y4.l;
import y4.m;

public final class LABColorPickerSeekBar extends e {
    public static enum a {
        OUTPUT_COLOR;

    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }
    }

    public static enum c implements codes.side.andcolorpicker.view.picker.b.c {
        MODE_L(codes.side.andcolorpicker.model.f.b.d.d(), codes.side.andcolorpicker.model.f.b.d.c()),
        MODE_A(codes.side.andcolorpicker.model.f.b.e.d(), codes.side.andcolorpicker.model.f.b.e.c()),
        MODE_B(codes.side.andcolorpicker.model.f.b.f.d(), codes.side.andcolorpicker.model.f.b.f.c());

        private final D a;
        private final D b;
        @l
        private final D c;
        private final int d;
        private final int e;

        private c(int v1, int v2) {
            static final class codes.side.andcolorpicker.lab.LABColorPickerSeekBar.c.a extends N implements A3.a {
                final c e;

                codes.side.andcolorpicker.lab.LABColorPickerSeekBar.c.a(c lABColorPickerSeekBar$c0) {
                    this.e = lABColorPickerSeekBar$c0;
                    super(0);
                }

                @l
                public final kotlin.ranges.l b() {
                    return new kotlin.ranges.l(this.e.a(), this.e.b());
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            }


            static final class codes.side.andcolorpicker.lab.LABColorPickerSeekBar.c.b extends N implements A3.a {
                final c e;

                codes.side.andcolorpicker.lab.LABColorPickerSeekBar.c.b(c lABColorPickerSeekBar$c0) {
                    this.e = lABColorPickerSeekBar$c0;
                    super(0);
                }

                @l
                public final j b() {
                    return s.B1(this.e.e(), 10);
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            }


            static final class codes.side.andcolorpicker.lab.LABColorPickerSeekBar.c.c extends N implements A3.a {
                final c e;

                codes.side.andcolorpicker.lab.LABColorPickerSeekBar.c.c(c lABColorPickerSeekBar$c0) {
                    this.e = lABColorPickerSeekBar$c0;
                    super(0);
                }

                @l
                public final int[] b() {
                    j j0 = this.e.f();
                    ArrayList arrayList0 = new ArrayList(u.b0(j0, 10));
                    Iterator iterator0 = j0.iterator();
                    while(iterator0.hasNext()) {
                        arrayList0.add(((T)iterator0).b());
                    }
                    return u.U5(arrayList0);
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            }

            this.d = v1;
            this.e = v2;
            this.a = E.a(new codes.side.andcolorpicker.lab.LABColorPickerSeekBar.c.a(this));
            this.b = E.a(new codes.side.andcolorpicker.lab.LABColorPickerSeekBar.c.b(this));
            this.c = E.a(new codes.side.andcolorpicker.lab.LABColorPickerSeekBar.c.c(this));
        }

        @Override  // codes.side.andcolorpicker.view.picker.b$c
        public int a() {
            return this.d;
        }

        @Override  // codes.side.andcolorpicker.view.picker.b$c
        public int b() {
            return this.e;
        }

        private final kotlin.ranges.l e() {
            return (kotlin.ranges.l)this.a.getValue();
        }

        private final j f() {
            return (j)this.b.getValue();
        }

        @l
        public final int[] g() {
            return (int[])this.c.getValue();
        }
    }

    private static final a A = null;
    private static final int B = 10;
    @l
    public static final b C = null;
    private boolean t;
    private c u;
    private boolean v;
    private a w;
    private HashMap x;
    private static final String y = "LABColorPickerSeekBar";
    private static final c z;

    static {
        LABColorPickerSeekBar.C = new b(null);
        LABColorPickerSeekBar.z = c.f;
        LABColorPickerSeekBar.A = a.a;
    }

    @z3.j
    public LABColorPickerSeekBar(@l Context context0) {
        this(context0, null, 0, 6, null);
    }

    @z3.j
    public LABColorPickerSeekBar(@l Context context0, @m AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0, 4, null);
    }

    @z3.j
    public LABColorPickerSeekBar(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(new d(), context0, attributeSet0, v);
        this.F(attributeSet0);
    }

    public LABColorPickerSeekBar(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
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
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, styleable.LABColorPickerSeekBar, 0, 0);
        L.o(typedArray0, "context.theme.obtainStyl…r,\n      0,\n      0\n    )");
        c[] arr_lABColorPickerSeekBar$c = c.values();
        this.setMode(arr_lABColorPickerSeekBar$c[typedArray0.getInteger(styleable.LABColorPickerSeekBar_labMode, LABColorPickerSeekBar.z.ordinal())]);
        a[] arr_lABColorPickerSeekBar$a = a.values();
        this.setColoringMode(arr_lABColorPickerSeekBar$a[typedArray0.getInteger(styleable.LABColorPickerSeekBar_labColoringMode, LABColorPickerSeekBar.A.ordinal())]);
        typedArray0.recycle();
    }

    static void G(LABColorPickerSeekBar lABColorPickerSeekBar0, AttributeSet attributeSet0, int v, Object object0) {
        if((v & 1) != 0) {
            attributeSet0 = null;
        }
        lABColorPickerSeekBar0.F(attributeSet0);
    }

    protected boolean H(@l f f0, int v) {
        L.p(f0, "color");
        if(!this.t) {
            return false;
        }
        int v1 = this.getMode().a() + v;
        switch(codes.side.andcolorpicker.lab.a.f[this.getMode().ordinal()]) {
            case 1: {
                if(f0.k() != v1) {
                    f0.o(v1);
                    return true;
                }
                break;
            }
            case 2: {
                if(f0.g() != v1) {
                    f0.l(v1);
                    return true;
                }
                break;
            }
            case 3: {
                if(f0.j() != v1) {
                    f0.n(v1);
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
    protected Integer I(@l f f0) {
        L.p(f0, "color");
        if(!this.t) {
            return null;
        }
        int v = this.getMode().a();
        switch(this.getMode()) {
            case 1: {
                return (int)(((f)this.getInternalPickedColor()).k() - v);
            }
            case 2: {
                return (int)(((f)this.getInternalPickedColor()).g() - v);
            }
            case 3: {
                return (int)(((f)this.getInternalPickedColor()).j() - v);
            }
            default: {
                throw new J();
            }
        }
    }

    protected void J(@l f f0, @l f f1) {
        L.p(f0, "color");
        L.p(f1, "value");
        f0.d(f1);
    }

    private final void K(GradientDrawable gradientDrawable0) {
        if(this.v && this.t) {
            int v = this.getThumbStrokeWidthPx();
            if(codes.side.andcolorpicker.lab.a.g[this.getColoringMode().ordinal()] != 1) {
                throw new J();
            }
            gradientDrawable0.setStroke(v, this.getColorConverter().b(this.getInternalPickedColor()));
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
    protected h getColorConverter() {
        k.a a0 = super.getColorConverter();
        if(a0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type codes.side.andcolorpicker.converter.IntegerLABColorConverter");
        }
        return (h)a0;
    }

    @l
    public final a getColoringMode() {
        a lABColorPickerSeekBar$a0 = this.w;
        if(lABColorPickerSeekBar$a0 == null) {
            throw new IllegalArgumentException("Coloring mode is not initialized yet");
        }
        return lABColorPickerSeekBar$a0;
    }

    @l
    public final c getMode() {
        c lABColorPickerSeekBar$c0 = this.u;
        if(lABColorPickerSeekBar$c0 == null) {
            throw new IllegalArgumentException("Mode is not initialized yet");
        }
        return lABColorPickerSeekBar$c0;
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public boolean o(codes.side.andcolorpicker.model.a a0, int v) {
        return this.H(((f)a0), v);
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    protected void p(@l LayerDrawable layerDrawable0) {
        L.p(layerDrawable0, "progressDrawable");
        if(this.v && this.t) {
            int[] arr_v = this.getMode().g();
            int[] arr_v1 = new int[arr_v.length];
            int v = 0;
            Drawable drawable0 = layerDrawable0.getDrawable(0);
            if(drawable0 != null) {
                switch(this.getMode()) {
                    case 1: {
                        if(codes.side.andcolorpicker.lab.a.b[this.getColoringMode().ordinal()] != 1) {
                            throw new J();
                        }
                        for(int v1 = 0; v < arr_v.length; ++v1) {
                            arr_v1[v1] = ColorUtils.b(arr_v[v], ((f)this.getInternalPickedColor()).g(), ((f)this.getInternalPickedColor()).j());
                            ++v;
                        }
                        ((GradientDrawable)drawable0).setColors(arr_v1);
                        return;
                    }
                    case 2: {
                        if(codes.side.andcolorpicker.lab.a.c[this.getColoringMode().ordinal()] != 1) {
                            throw new J();
                        }
                        for(int v2 = 0; v < arr_v.length; ++v2) {
                            arr_v1[v2] = ColorUtils.b(((f)this.getInternalPickedColor()).k(), arr_v[v], ((f)this.getInternalPickedColor()).j());
                            ++v;
                        }
                        ((GradientDrawable)drawable0).setColors(arr_v1);
                        return;
                    }
                    case 3: {
                        if(codes.side.andcolorpicker.lab.a.d[this.getColoringMode().ordinal()] != 1) {
                            throw new J();
                        }
                        for(int v3 = 0; v < arr_v.length; ++v3) {
                            arr_v1[v3] = ColorUtils.b(((f)this.getInternalPickedColor()).k(), ((f)this.getInternalPickedColor()).g(), arr_v[v]);
                            ++v;
                        }
                        ((GradientDrawable)drawable0).setColors(arr_v1);
                        return;
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
        return this.I(((f)a0));
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

    public final void setColoringMode(@l a lABColorPickerSeekBar$a0) {
        L.p(lABColorPickerSeekBar$a0, "value");
        this.v = true;
        if(this.w == lABColorPickerSeekBar$a0) {
            return;
        }
        this.w = lABColorPickerSeekBar$a0;
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

    public final void setMode(@l c lABColorPickerSeekBar$c0) {
        L.p(lABColorPickerSeekBar$c0, "value");
        this.t = true;
        if(this.u == lABColorPickerSeekBar$c0) {
            return;
        }
        this.u = lABColorPickerSeekBar$c0;
        this.y();
        this.x();
        this.w();
        this.z();
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.View
    @l
    public String toString() {
        return "LABColorPickerSeekBar(tag = " + this.getTag() + ", _mode=" + (this.t ? this.getMode() : null) + ", _currentColor=" + ((f)this.getInternalPickedColor()) + ')';
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public void u(codes.side.andcolorpicker.model.a a0, codes.side.andcolorpicker.model.a a1) {
        this.J(((f)a0), ((f)a1));
    }
}

