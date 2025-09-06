package com.bytedance.sdk.openadsdk.ReZ;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.util.List;

public class Au extends ViewGroup implements ReZ {
    private final DWo PjT;

    public Au(Context context0, DWo dWo0) {
        super(context0);
        this.PjT = dWo0;
        dWo0.PjT(this);
    }

    private ColorStateList PjT() {
        return new ColorStateList(new int[][]{new int[]{0x10100A1}, new int[0]}, new int[]{Color.rgb(0xFF, 44, 85), 0xFF000000});
    }

    @Override  // com.bytedance.sdk.openadsdk.ReZ.DWo$ReZ
    public void PjT(FilterWord filterWord0) {
        if(filterWord0 == null) {
            return;
        }
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            if(view0 != null) {
                if(DWo.PjT.equals(filterWord0)) {
                    view0.setSelected(false);
                }
                else {
                    view0.setSelected(filterWord0.equals(view0.getTag()));
                }
            }
        }
    }

    public void PjT(List list0) {
        if(list0 == null) {
            return;
        }
        for(int v = 0; v < list0.size(); ++v) {
            FilterWord filterWord0 = (FilterWord)list0.get(v);
            if(filterWord0 != null) {
                this.addView(this.Zh(filterWord0));
            }
        }
    }

    private Drawable Zh() {
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        float f = (float)qZS.Zh(this.getContext(), 5.0f);
        gradientDrawable0.setCornerRadius(f);
        gradientDrawable0.setColor(Color.parseColor("#0D000000"));
        GradientDrawable gradientDrawable1 = new GradientDrawable();
        gradientDrawable1.setStroke(qZS.Zh(this.getContext(), 1.0f), Color.parseColor("#FE2C55"));
        gradientDrawable1.setCornerRadius(f);
        gradientDrawable1.setColor(Color.parseColor("#12FE2C55"));
        Drawable drawable0 = new StateListDrawable();
        ((StateListDrawable)drawable0).addState(new int[]{0x10100A1}, gradientDrawable1);
        ((StateListDrawable)drawable0).addState(new int[0], gradientDrawable0);
        return drawable0;
    }

    private View Zh(FilterWord filterWord0) {
        View view0 = new TextView(this.getContext());
        view0.setTag(filterWord0);
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = new ViewGroup.MarginLayoutParams(-2, -2);
        int v = qZS.Zh(this.getContext(), 8.0f);
        viewGroup$MarginLayoutParams0.leftMargin = v;
        viewGroup$MarginLayoutParams0.bottomMargin = v;
        ((TextView)view0).setTextColor(this.PjT());
        ((TextView)view0).setText(filterWord0.getName());
        ((TextView)view0).setPadding(v, v, v, v);
        view0.setBackground(this.Zh());
        ((TextView)view0).setSelected(false);
        view0.setOnClickListener(new View.OnClickListener() {
            final Au PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(Au.this.PjT != null) {
                    if(view0.isSelected()) {
                        Au.this.PjT.PjT(DWo.PjT);
                        return;
                    }
                    Object object0 = view0.getTag();
                    if(object0 instanceof FilterWord) {
                        Au.this.PjT.PjT(((FilterWord)object0));
                    }
                }
            }
        });
        ((TextView)view0).setSelected(false);
        view0.setLayoutParams(viewGroup$MarginLayoutParams0);
        return view0;
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new ViewGroup.MarginLayoutParams(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v11;
        int v4 = this.getChildCount();
        int v6 = 0;
        int v7 = 0;
        for(int v5 = 0; v5 < v4; ++v5) {
            View view0 = this.getChildAt(v5);
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
            int v8 = view0.getMeasuredWidth();
            int v9 = view0.getMeasuredHeight();
            int v10 = v5 == 0 ? 0 : viewGroup$MarginLayoutParams0.leftMargin;
            if(v8 + v10 + v6 < v2 - v) {
                v11 = v6 + v10;
            }
            else {
                v7 += viewGroup$MarginLayoutParams0.bottomMargin + v9;
                v11 = 0;
            }
            view0.layout(v11, viewGroup$MarginLayoutParams0.topMargin + v7, v11 + v8, v9 + v7);
            v6 = v11 + (v8 + viewGroup$MarginLayoutParams0.rightMargin);
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        View.MeasureSpec.getMode(v);
        View.MeasureSpec.getMode(v1);
        int v2 = View.MeasureSpec.getSize(v);
        View.MeasureSpec.getSize(v1);
        int v4 = 0;
        int v5 = 0;
        for(int v3 = 0; v3 < this.getChildCount(); ++v3) {
            View view0 = this.getChildAt(v3);
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
            this.measureChild(view0, v, v1);
            int v6 = view0.getMeasuredWidth();
            int v7 = view0.getMeasuredHeight();
            int v8 = v3 == 0 ? 0 : viewGroup$MarginLayoutParams0.leftMargin;
            int v9 = v6 + v8 + v5 >= v2 ? 0 : v5 + v8;
            if(v9 == 0) {
                v4 += v7 + viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin;
            }
            v5 = v9 + (v6 + viewGroup$MarginLayoutParams0.rightMargin);
        }
        this.setMeasuredDimension(v2, v4);
    }
}

