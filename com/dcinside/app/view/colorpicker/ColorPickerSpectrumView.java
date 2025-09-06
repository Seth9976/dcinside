package com.dcinside.app.view.colorpicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import top.defaults.colorpicker.ColorWheelView;
import top.defaults.colorpicker.c;
import top.defaults.colorpicker.e;
import y4.l;
import y4.m;
import z3.j;

public final class ColorPickerSpectrumView extends ConstraintLayout implements c {
    @l
    private final ColorWheelView a;
    @l
    private ColorVerticalSliderView b;
    @m
    private c c;
    private int d;
    private boolean e;
    @l
    private List f;

    @j
    public ColorPickerSpectrumView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public ColorPickerSpectrumView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public ColorPickerSpectrumView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.d = 0xFF000000;
        this.f = new ArrayList();
        LayoutInflater.from(context0).inflate(0x7F0E01B2, this);  // layout:view_color_picker_spectrum
        View view0 = this.findViewById(0x7F0B02E6);  // id:color_spectrum_wheel
        L.o(view0, "findViewById(...)");
        this.a = (ColorWheelView)view0;
        View view1 = this.findViewById(0x7F0B02E5);  // id:color_spectrum_bright_slider
        L.o(view1, "findViewById(...)");
        this.b = (ColorVerticalSliderView)view1;
        ((ColorVerticalSliderView)view1).d(((ColorWheelView)view0));
        this.A();
    }

    public ColorPickerSpectrumView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final void A() {
        if(this.c != null) {
            for(Object object0: this.f) {
                e e0 = (e)object0;
                c c0 = this.c;
                if(c0 != null) {
                    c0.c(e0);
                }
            }
        }
        this.a.setOnlyUpdateOnTouchEventUp(false);
        this.b.setOnlyUpdateOnTouchEventUp(false);
        this.c = this.b;
        this.b.setOnlyUpdateOnTouchEventUp(this.e);
        for(Object object1: this.f) {
            c c1 = this.c;
            L.m(c1);
            c1.m(((e)object1));
            c c2 = this.c;
            L.m(c2);
            ((e)object1).e(c2.getColor(), false, true);
        }
    }

    @Override  // top.defaults.colorpicker.c
    public void c(@l e e0) {
        L.p(e0, "observer");
        c c0 = this.c;
        if(c0 != null) {
            c0.c(e0);
        }
        this.f.remove(e0);
    }

    @Override  // top.defaults.colorpicker.c
    public int getColor() {
        return this.c == null ? 0 : this.c.getColor();
    }

    @Override  // top.defaults.colorpicker.c
    public void m(@l e e0) {
        L.p(e0, "observer");
        c c0 = this.c;
        if(c0 != null) {
            c0.m(e0);
        }
        this.f.add(e0);
    }

    public final void setInitialColor(int v) {
        this.d = v;
        this.a.d(v, true);
    }
}

