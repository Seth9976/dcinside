package com.bytedance.sdk.component.adexpress.dynamic.ReZ;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Zh.xs;
import com.bytedance.sdk.component.adexpress.cz.ReZ;
import com.bytedance.sdk.component.adexpress.cz.gK;
import com.bytedance.sdk.component.adexpress.cz.ltE;
import com.bytedance.sdk.component.adexpress.cz.yIW;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT.PjT;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT.Zh;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT.cr;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT.cz;
import com.bytedance.sdk.component.adexpress.dynamic.cr.DWo;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp;

public class SM extends FrameLayout implements Au {
    private View.OnTouchListener Au;
    private boolean DWo;
    private XX JQp;
    private Context PjT;
    private com.bytedance.sdk.component.adexpress.dynamic.cr.XX ReZ;
    private int SM;
    private gK XX;
    private JQp Zh;
    private View cr;
    private String cz;
    private DWo qj;
    private xs xf;

    public SM(Context context0, JQp jQp0, com.bytedance.sdk.component.adexpress.dynamic.cr.XX xX0) {
        super(context0);
        this.PjT = context0;
        this.Zh = jQp0;
        this.ReZ = xX0;
        this.XX();
    }

    public SM(Context context0, JQp jQp0, com.bytedance.sdk.component.adexpress.dynamic.cr.XX xX0, DWo dWo0, xs xs0) {
        super(context0);
        this.PjT = context0;
        this.Zh = jQp0;
        this.ReZ = xX0;
        this.qj = dWo0;
        this.xf = xs0;
        this.XX();
    }

    private boolean Au() {
        if(this.ReZ.zZ()) {
            return false;
        }
        if(TextUtils.equals("9", this.cz)) {
            return false;
        }
        if(TextUtils.equals("16", this.cz)) {
            return false;
        }
        if(TextUtils.equals("17", this.cz)) {
            return false;
        }
        if(TextUtils.equals("18", this.cz)) {
            return false;
        }
        if(TextUtils.equals("20", this.cz)) {
            return false;
        }
        return TextUtils.equals("29", this.cz) ? false : !TextUtils.equals("10", this.cz);
    }

    public void JQp() {
        if(this.cr == null) {
            return;
        }
        if(TextUtils.equals(this.cz, "2")) {
            View view0 = this.cr;
            if(view0 instanceof ReZ) {
                ((ReZ)view0).ReZ();
            }
        }
    }

    private void PjT(ViewGroup viewGroup0) {
        if(this.cr == null) {
            return;
        }
        String s = this.cz;
        s.hashCode();
        switch(s) {
            case "0": {
                this.Au = new com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT.JQp(this, this.SM);
                this.setBackgroundColor(Color.parseColor("#80000000"));
                break;
            }
            case "1": {
                goto label_18;
            }
            case "10": {
                this.Au = new cr(this, this.SM, this.DWo);
                break;
            }
            case "11": {
            label_30:
                this.Zh.setClipChildren(false);
                this.Zh.setClipChildren(false);
                ViewGroup viewGroup1 = (ViewGroup)this.Zh.getParent();
                if(viewGroup1 != null) {
                    viewGroup1.setClipChildren(false);
                    viewGroup1.setClipToPadding(false);
                }
                this.Au = new cz(this);
                break;
            }
            case "12": {
                this.Au = new com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT.ReZ(this);
                this.cr.setTag(2);
                break;
            }
            case "13": {
                goto label_64;
            }
            case "14": {
                this.Au = new Zh(this, this);
                break;
            }
            case "16": {
                if(this.cr != null && this.cr instanceof ltE && ((ltE)this.cr).getShakeLayout() != null) {
                    ((ltE)this.cr).getShakeLayout().setTag(2);
                }
                this.cr.setTag(2);
                break;
            }
            case "17": {
                this.cr.setTag(2);
                break;
            }
            case "18": {
                if(this.cr != null && this.cr instanceof yIW && ((yIW)this.cr).getWriggleLayout() != null) {
                    ((yIW)this.cr).getWriggleLayout().setTag(2);
                }
                this.cr.setTag(2);
                break;
            }
            case "2": {
                this.setBackgroundColor(Color.parseColor("#80000000"));
                this.Au = new Zh(this, this);
                break;
            }
            case "20": {
                this.Au = new PjT(this, this.SM, viewGroup0);
                break;
            }
            case "22": {
                this.Au = com.bytedance.sdk.component.adexpress.cr.Zh() ? new com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT.Au(this, this.DWo) : new com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT.XX(this, this.SM, viewGroup0);
                break;
            }
            case "23": {
                if(com.bytedance.sdk.component.adexpress.cr.Zh()) {
                    this.Au = new cz(this);
                }
                break;
            }
            case "24": {
            label_64:
                if(!this.cz.equals("24") || !com.bytedance.sdk.component.adexpress.cr.Zh()) {
                    this.Au = new com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT.JQp(this, this.SM);
                }
                else {
                    this.Zh.setClipChildren(false);
                    this.Au = new cz(this);
                }
                break;
            }
            case "25": {
                if(com.bytedance.sdk.component.adexpress.cr.Zh()) {
                    this.Au = new com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT.Au(this, this.DWo);
                }
                break;
            }
            case "29": {
                if(this.cr != null && this.cr instanceof com.bytedance.sdk.component.adexpress.cz.cz && ((com.bytedance.sdk.component.adexpress.cz.cz)this.cr).getShakeView() != null) {
                    ((com.bytedance.sdk.component.adexpress.cz.cz)this.cr).getShakeView().setTag(2);
                }
                this.Au = new com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT.JQp(this, this.SM);
                break;
            }
            case "5": {
                if(!this.ReZ.Xe() || TextUtils.isEmpty(this.ReZ.kFP())) {
                    this.setBackgroundColor(Color.parseColor("#80000000"));
                }
                else {
                    this.setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.cr.XX.PjT(this.ReZ.kFP()));
                }
                this.Au = new com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT.ReZ(this);
                this.cr.setTag(2);
                break;
            }
            case "6": {
            label_18:
                if(!this.ReZ.Xe() || TextUtils.isEmpty(this.ReZ.kFP())) {
                    this.setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.Au = new cz(this);
                break;
            }
            case "7": {
                this.setBackgroundColor(Color.parseColor("#80000000"));
                this.Au = new Zh(this, this);
                break;
            }
            case "8": {
                goto label_30;
            }
            case "9": {
                this.cr.setTag(2);
            }
        }
        View.OnTouchListener view$OnTouchListener0 = this.Au;
        if(view$OnTouchListener0 != null) {
            this.setOnTouchListener(view$OnTouchListener0);
        }
        if(this.Au()) {
            this.cr.setTag(2);
            this.setOnClickListener(((View.OnClickListener)this.Zh.getDynamicClickListener()));
        }
    }

    // 去混淆评级： 中等(50)
    private boolean PjT(String s) {
        return TextUtils.equals(s, "24") || TextUtils.equals(s, "23") || TextUtils.equals(s, "25") || TextUtils.equals(s, "22") || TextUtils.equals(s, "1");
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.Au
    public void PjT() {
        if(TextUtils.equals(this.cz, "6")) {
            gK gK0 = this.XX;
            if(gK0 != null) {
                gK0.ReZ();
                this.postDelayed(() -> if(SM.this.Au != null) {
                    SM.this.setOnClickListener(((View.OnClickListener)SM.this.Zh.getDynamicClickListener()));
                    SM.this.performClick();
                    if(!SM.this.ReZ.uQg()) {
                        SM.this.setVisibility(8);
                    }
                }, 300L);
            }
        }
        else {
            if(TextUtils.equals(this.cz, "20")) {
                this.postDelayed(() -> if(SM.this.Au != null) {
                    SM.this.setOnClickListener(((View.OnClickListener)SM.this.Zh.getDynamicClickListener()));
                    SM.this.performClick();
                    if(!SM.this.ReZ.uQg()) {
                        SM.this.setVisibility(8);
                    }
                }, 400L);
                return;
            }
            this.SM();
        }

        class com.bytedance.sdk.component.adexpress.dynamic.ReZ.SM.2 implements Runnable {
            final SM PjT;

            @Override
            public void run() {
                SM.this.SM();
            }
        }


        class com.bytedance.sdk.component.adexpress.dynamic.ReZ.SM.3 implements Runnable {
            final SM PjT;

            @Override
            public void run() {
                SM.this.SM();
            }
        }

    }

    public void ReZ() {
        XX xX0 = this.JQp;
        if(xX0 != null) {
            xX0.PjT();
        }
    }

    // 检测为 Lambda 实现
    private void SM() [...]

    private void XX() {
        this.setBackgroundColor(0);
        this.setClipChildren(false);
        this.setClipToPadding(false);
        this.cz = this.ReZ.IJ();
        this.SM = this.ReZ.tY();
        this.DWo = this.ReZ.zZ();
        XX xX0 = com.bytedance.sdk.component.adexpress.dynamic.ReZ.DWo.PjT(this.PjT, this.Zh, this.ReZ, this.qj, this.xf);
        this.JQp = xX0;
        if(xX0 != null) {
            this.cr = xX0.ReZ();
            if(this.ReZ.OMu()) {
                this.setBackgroundColor(Color.parseColor("#50000000"));
            }
            if(TextUtils.equals(this.cz, "6")) {
                this.XX = !this.ReZ.Xe() || TextUtils.isEmpty(this.ReZ.kFP()) ? new gK(this.PjT, Color.parseColor("#99000000")) : new gK(this.PjT, com.bytedance.sdk.component.adexpress.dynamic.cr.XX.PjT(this.ReZ.kFP()));
                FrameLayout frameLayout0 = new FrameLayout(this.PjT);
                frameLayout0.addView(this.XX, new FrameLayout.LayoutParams(-1, -1));
                frameLayout0.setClipChildren(true);
                this.addView(frameLayout0, new FrameLayout.LayoutParams(-1, -1));
                this.post(new Runnable() {
                    final SM PjT;

                    @Override
                    public void run() {
                        SM.this.XX.Zh();
                    }
                });
            }
            if(this.PjT(this.cz) && com.bytedance.sdk.component.adexpress.cr.Zh()) {
                int v = Color.parseColor("#99000000");
                if(this.ReZ.Xe() && !TextUtils.isEmpty(this.ReZ.kFP())) {
                    try {
                        v = com.bytedance.sdk.component.adexpress.dynamic.cr.XX.PjT(this.ReZ.kFP());
                    }
                    catch(Exception unused_ex) {
                    }
                }
                View view0 = new View(this.PjT);
                view0.setBackgroundColor(v);
                this.addView(view0, new FrameLayout.LayoutParams(-1, -1));
            }
            this.addView(this.JQp.ReZ());
            this.PjT(this.JQp.ReZ());
            this.setVisibility(0);
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.Au
    public void Zh() {
        if(this.Au()) {
            this.setOnClickListener(((View.OnClickListener)this.Zh.getDynamicClickListener()));
            this.performClick();
            if(!this.ReZ.uQg()) {
                this.setVisibility(8);
            }
        }
    }

    public void cr() {
        XX xX0 = this.JQp;
        if(xX0 != null) {
            xX0.Zh();
        }
    }

    public void cz() {
        if(this.cr == null) {
            return;
        }
        if(TextUtils.equals(this.cz, "2")) {
            View view0 = this.cr;
            if(view0 instanceof ReZ) {
                ((ReZ)view0).cr();
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            XX xX0 = this.JQp;
            if(xX0 != null) {
                xX0.Zh();
            }
        }
        catch(Exception exception0) {
            exception0.getMessage();
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        return this.Au instanceof com.bytedance.sdk.component.adexpress.dynamic.ReZ.PjT.ReZ ? true : super.onInterceptTouchEvent(motionEvent0);
    }
}

