package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.adexpress.dynamic.cr.XX;

public class ub extends cz {
    private TextView Owx;
    private TextView PjT;
    private TextView RD;
    private TextView Sks;
    private TextView Zh;
    private LinearLayout tT;

    public ub(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        this.PjT = new TextView(this.qj);
        this.Zh = new TextView(this.qj);
        this.Owx = new TextView(this.qj);
        this.tT = new LinearLayout(this.qj);
        this.RD = new TextView(this.qj);
        this.Sks = new TextView(this.qj);
        this.PjT.setTag(9);
        this.Zh.setTag(10);
        this.Owx.setTag(12);
        this.tT.addView(this.Owx);
        this.tT.addView(this.Sks);
        this.tT.addView(this.Zh);
        this.tT.addView(this.RD);
        this.tT.addView(this.PjT);
        this.addView(this.tT, this.getWidgetLayoutParams());
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    public boolean SM() {
        this.Owx.setText("Function");
        this.Zh.setText("Permission list");
        this.RD.setText(" | ");
        this.Sks.setText(" | ");
        this.PjT.setText("Privacy policy");
        XX xX0 = this.xf;
        if(xX0 != null) {
            this.Owx.setTextColor(xX0.XX());
            this.Owx.setTextSize(this.xf.JQp());
            this.Zh.setTextColor(this.xf.XX());
            this.Zh.setTextSize(this.xf.JQp());
            this.RD.setTextColor(this.xf.XX());
            this.Sks.setTextColor(this.xf.XX());
            this.PjT.setTextColor(this.xf.XX());
            this.PjT.setTextSize(this.xf.JQp());
            return false;
        }
        this.Owx.setTextColor(-1);
        this.Owx.setTextSize(12.0f);
        this.Zh.setTextColor(-1);
        this.Zh.setTextSize(12.0f);
        this.RD.setTextColor(-1);
        this.Sks.setTextColor(-1);
        this.PjT.setTextColor(-1);
        this.PjT.setTextSize(12.0f);
        return false;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp
    protected boolean cr() {
        this.PjT.setOnTouchListener(((View.OnTouchListener)this.getDynamicClickListener()));
        this.PjT.setOnClickListener(((View.OnClickListener)this.getDynamicClickListener()));
        this.Zh.setOnTouchListener(((View.OnTouchListener)this.getDynamicClickListener()));
        this.Zh.setOnClickListener(((View.OnClickListener)this.getDynamicClickListener()));
        this.Owx.setOnTouchListener(((View.OnTouchListener)this.getDynamicClickListener()));
        this.Owx.setOnClickListener(((View.OnClickListener)this.getDynamicClickListener()));
        return true;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.XX, this.Au);
    }
}

