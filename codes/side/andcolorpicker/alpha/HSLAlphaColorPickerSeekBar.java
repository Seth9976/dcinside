package codes.side.andcolorpicker.alpha;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import codes.side.andcolorpicker.R.attr;
import codes.side.andcolorpicker.model.e.b;
import codes.side.andcolorpicker.model.e;
import java.util.HashMap;
import k.g;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import m.c;
import y4.l;
import y4.m;
import z3.j;

public final class HSLAlphaColorPickerSeekBar extends a {
    private boolean t;
    private HashMap u;

    @j
    public HSLAlphaColorPickerSeekBar(@l Context context0) {
        this(context0, null, 0, 6, null);
    }

    @j
    public HSLAlphaColorPickerSeekBar(@l Context context0, @m AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public HSLAlphaColorPickerSeekBar(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(new c(), context0, attributeSet0, v);
        this.y();
        this.t = true;
    }

    public HSLAlphaColorPickerSeekBar(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = attr.seekBarStyle;
        }
        this(context0, attributeSet0, v);
    }

    protected boolean G(@l e e0, int v) {
        L.p(e0, "color");
        if(((e)this.getInternalPickedColor()).k() != v) {
            ((e)this.getInternalPickedColor()).r(v);
            return true;
        }
        return false;
    }

    @l
    protected Integer H(@l e e0) {
        L.p(e0, "color");
        return e0.k();
    }

    protected void I(@l e e0, @l e e1) {
        L.p(e0, "color");
        L.p(e1, "value");
        e0.d(e1);
    }

    @Override  // codes.side.andcolorpicker.alpha.a
    public void a() {
        HashMap hashMap0 = this.u;
        if(hashMap0 != null) {
            hashMap0.clear();
        }
    }

    @Override  // codes.side.andcolorpicker.alpha.a
    public View b(int v) {
        if(this.u == null) {
            this.u = new HashMap();
        }
        View view0 = (View)this.u.get(v);
        if(view0 == null) {
            view0 = this.findViewById(v);
            this.u.put(v, view0);
        }
        return view0;
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public k.a getColorConverter() {
        return this.getColorConverter();
    }

    @l
    protected g getColorConverter() {
        k.a a0 = super.getColorConverter();
        if(a0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type codes.side.andcolorpicker.converter.IntegerHSLColorConverter");
        }
        return (g)a0;
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public boolean o(codes.side.andcolorpicker.model.a a0, int v) {
        return this.G(((e)a0), v);
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public Integer q(codes.side.andcolorpicker.model.a a0) {
        return this.H(((e)a0));
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    protected void r() {
        this.setMax(b.g.c());
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public void setMax(int v) {
        if(this.t) {
            b e$b0 = b.g;
            if(v != e$b0.c()) {
                throw new IllegalArgumentException("Current mode supports " + e$b0.c() + " max value only, was " + v);
            }
        }
        super.setMax(v);
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public void u(codes.side.andcolorpicker.model.a a0, codes.side.andcolorpicker.model.a a1) {
        this.I(((e)a0), ((e)a1));
    }
}

