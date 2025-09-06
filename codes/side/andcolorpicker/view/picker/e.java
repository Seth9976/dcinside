package codes.side.andcolorpicker.view.picker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import codes.side.andcolorpicker.R.attr;
import codes.side.andcolorpicker.R.dimen;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public abstract class e extends b {
    private HashMap s;

    @j
    public e(@l m.b b0, @l Context context0) {
        this(b0, context0, null, 0, 12, null);
    }

    @j
    public e(@l m.b b0, @l Context context0, @m AttributeSet attributeSet0) {
        this(b0, context0, attributeSet0, 0, 8, null);
    }

    @j
    public e(@l m.b b0, @l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(b0, "colorFactory");
        L.p(context0, "context");
        super(b0, context0, attributeSet0, v);
    }

    public e(m.b b0, Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 4) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 8) != 0) {
            v = attr.seekBarStyle;
        }
        this(b0, context0, attributeSet0, v);
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public void a() {
        HashMap hashMap0 = this.s;
        if(hashMap0 != null) {
            hashMap0.clear();
        }
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    public View b(int v) {
        if(this.s == null) {
            this.s = new HashMap();
        }
        View view0 = (View)this.s.get(v);
        if(view0 == null) {
            view0 = this.findViewById(v);
            this.s.put(v, view0);
        }
        return view0;
    }

    @Override  // codes.side.andcolorpicker.view.picker.b
    @l
    protected Drawable[] t(@l Drawable[] arr_drawable) {
        L.p(arr_drawable, "layers");
        List list0 = kotlin.collections.l.Uy(arr_drawable);
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable0.setCornerRadius(((float)this.getResources().getDimensionPixelOffset(dimen.acp_seek_progress_corner_radius)));
        gradientDrawable0.setShape(0);
        list0.add(gradientDrawable0);
        Object[] arr_object = list0.toArray(new Drawable[0]);
        if(arr_object == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        return (Drawable[])arr_object;
    }
}

