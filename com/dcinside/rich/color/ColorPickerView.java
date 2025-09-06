package com.dcinside.rich.color;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import com.dcinside.rich.R.array;
import com.dcinside.rich.R.styleable;

public class ColorPickerView extends HorizontalScrollView {
    private LinearLayout a;
    private c b;
    private Bundle c;
    private int[] d;

    public ColorPickerView(Context context0) {
        this(context0, null);
    }

    public ColorPickerView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ColorPickerView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.c = new Bundle();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ColorPickerView);
        int v1 = typedArray0.getDimensionPixelSize(styleable.ColorPickerView_colorViewWidth, 40);
        int v2 = typedArray0.getDimensionPixelSize(styleable.ColorPickerView_colorViewHeight, 40);
        int v3 = typedArray0.getDimensionPixelSize(styleable.ColorPickerView_colorViewMarginLeft, 5);
        int v4 = typedArray0.getDimensionPixelSize(styleable.ColorPickerView_colorViewMarginRight, 5);
        int v5 = typedArray0.getInt(styleable.ColorPickerView_colorViewCheckedType, 0);
        int v6 = typedArray0.getResourceId(styleable.ColorPickerView_colors, array.colorPickerColors);
        this.d = typedArray0.getResources().getIntArray(v6);
        typedArray0.recycle();
        this.c.putInt("ATTR_VIEW_WIDTH", v1);
        this.c.putInt("ATTR_VIEW_HEIGHT", v2);
        this.c.putInt("ATTR_MARGIN_LEFT", v3);
        this.c.putInt("ATTR_MARGIN_RIGHT", v4);
        this.c.putInt("ATTR_CHECKED_TYPE", v5);
        this.c();
    }

    private void c() {
        class a implements View.OnClickListener {
            final d a;
            final ColorPickerView b;

            a(d d0) {
                this.a = d0;
                super();
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(this.a.getChecked()) {
                    if(ColorPickerView.this.b != null) {
                        ColorPickerView.this.b.a(this.a.getColor());
                    }
                    return;
                }
                int v = ColorPickerView.this.a.getChildCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    View view1 = ColorPickerView.this.a.getChildAt(v1);
                    if(view1 instanceof d && ((d)view1).getChecked()) {
                        ((d)view1).setChecked(false);
                    }
                }
                this.a.setChecked(true);
                if(ColorPickerView.this.b != null) {
                    ColorPickerView.this.b.a(this.a.getColor());
                }
            }
        }

        Context context0 = this.getContext();
        this.a = new LinearLayout(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -1);
        this.a.setLayoutParams(linearLayout$LayoutParams0);
        int[] arr_v = this.d;
        for(int v = 0; v < arr_v.length; ++v) {
            d d0 = new d(context0, arr_v[v], this.c);
            d0.setFocusable(false);
            d0.setFocusableInTouchMode(false);
            this.a.addView(d0);
            d0.setOnClickListener(new a(this, d0));
        }
        this.addView(this.a);
    }

    public void setColor(int v) {
        int v1 = this.a.getChildCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            View view0 = this.a.getChildAt(v2);
            if(view0 instanceof d && ((d)view0).getColor() == v) {
                view0.performClick();
                return;
            }
        }
    }

    public void setColorPickerListener(c c0) {
        this.b = c0;
    }
}

