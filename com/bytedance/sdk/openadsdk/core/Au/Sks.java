package com.bytedance.sdk.openadsdk.core.Au;

import android.content.Context;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.Zh.cz;
import com.bytedance.sdk.openadsdk.core.model.DWo;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class Sks extends GestureDetector {
    static class PjT extends GestureDetector.SimpleOnGestureListener {
        boolean PjT;

        PjT() {
            this.PjT = false;
        }

        void PjT() {
            this.PjT = false;
        }

        boolean Zh() {
            return this.PjT;
        }

        @Override  // android.view.GestureDetector$SimpleOnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent0) {
            this.PjT = true;
            return super.onSingleTapUp(motionEvent0);
        }
    }

    private final PjT PjT;
    private final cz Zh;

    public Sks(Context context0) {
        this(context0, new PjT());
    }

    public Sks(Context context0, PjT sks$PjT0) {
        super(context0, sks$PjT0);
        this.PjT = sks$PjT0;
        this.Zh = new cz();
        this.setIsLongpressEnabled(false);
    }

    public DWo PjT(Context context0, View view0, View view1) {
        if(this.Zh == null) {
            return new com.bytedance.sdk.openadsdk.core.model.DWo.PjT().PjT();
        }
        com.bytedance.sdk.openadsdk.core.model.DWo.PjT dWo$PjT0 = new com.bytedance.sdk.openadsdk.core.model.DWo.PjT().cz(this.Zh.PjT).JQp(this.Zh.Zh).cr(this.Zh.ReZ).ReZ(this.Zh.cr).Zh(this.Zh.JQp).PjT(this.Zh.cz).Zh(qZS.PjT(view0)).PjT(qZS.PjT(view1)).ReZ(qZS.ReZ(view0)).cr(qZS.ReZ(view1)).cr(this.Zh.XX).JQp(this.Zh.Au).cz(this.Zh.SM).PjT(this.Zh.xf);
        return SM.Zh().PjT() ? dWo$PjT0.Zh(1).PjT("vessel").PjT(qZS.XX(context0)).ReZ(qZS.SM(context0)).Zh(qZS.Au(context0)).PjT() : dWo$PjT0.Zh(2).PjT("vessel").PjT(qZS.XX(context0)).ReZ(qZS.SM(context0)).Zh(qZS.Au(context0)).PjT();
    }

    void PjT() {
        this.PjT.PjT();
    }

    public boolean Zh() {
        return this.PjT.Zh();
    }

    @Override  // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        this.Zh.PjT(motionEvent0);
        return super.onTouchEvent(motionEvent0);
    }
}

