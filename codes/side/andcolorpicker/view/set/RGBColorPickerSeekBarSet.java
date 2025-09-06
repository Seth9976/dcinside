package codes.side.andcolorpicker.view.set;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import codes.side.andcolorpicker.rgb.RGBColorPickerSeekBar.c;
import codes.side.andcolorpicker.rgb.RGBColorPickerSeekBar;
import java.util.HashMap;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class RGBColorPickerSeekBarSet extends ColorPickerSeekBarSet {
    private HashMap f;

    @j
    public RGBColorPickerSeekBarSet(@l Context context0) {
        this(context0, null, 0, 6, null);
    }

    @j
    public RGBColorPickerSeekBarSet(@l Context context0, @m AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public RGBColorPickerSeekBarSet(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        c[] arr_rGBColorPickerSeekBar$c = c.values();
        for(int v1 = 0; v1 < arr_rGBColorPickerSeekBar$c.length; ++v1) {
            c rGBColorPickerSeekBar$c0 = arr_rGBColorPickerSeekBar$c[v1];
            this.c(rGBColorPickerSeekBar$c0.d());
            RGBColorPickerSeekBar rGBColorPickerSeekBar0 = new RGBColorPickerSeekBar(context0, null, 0, 6, null);
            rGBColorPickerSeekBar0.setMode(rGBColorPickerSeekBar$c0);
            this.getPickerGroup().k(rGBColorPickerSeekBar0);
            this.addView(rGBColorPickerSeekBar0);
        }
    }

    public RGBColorPickerSeekBarSet(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // codes.side.andcolorpicker.view.set.ColorPickerSeekBarSet
    public void a() {
        HashMap hashMap0 = this.f;
        if(hashMap0 != null) {
            hashMap0.clear();
        }
    }

    @Override  // codes.side.andcolorpicker.view.set.ColorPickerSeekBarSet
    public View b(int v) {
        if(this.f == null) {
            this.f = new HashMap();
        }
        View view0 = (View)this.f.get(v);
        if(view0 == null) {
            view0 = this.findViewById(v);
            this.f.put(v, view0);
        }
        return view0;
    }
}

