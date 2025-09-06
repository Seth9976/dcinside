package com.bytedance.adsdk.ugeno.SM.Zh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.adsdk.ugeno.Zh.PjT;

public class Zh extends PjT {
    public static class com.bytedance.adsdk.ugeno.SM.Zh.Zh.PjT extends com.bytedance.adsdk.ugeno.Zh.PjT.PjT {
        protected int yIW;

        public com.bytedance.adsdk.ugeno.SM.Zh.Zh.PjT(PjT pjT0) {
            super(pjT0);
            this.yIW = -1;
        }

        private int PjT(String s) {
            if(TextUtils.isEmpty(s)) {
                return -1;
            }
            String[] arr_s = s.split("\\|");
            if(arr_s != null && arr_s.length > 0) {
                int v1 = 0;
                for(int v = 0; v < arr_s.length; ++v) {
                    v1 |= this.Zh(arr_s[v]);
                }
                return v1;
            }
            return -1;
        }

        @Override  // com.bytedance.adsdk.ugeno.Zh.PjT$PjT
        public ViewGroup.LayoutParams PjT() {
            return this.Zh();
        }

        @Override  // com.bytedance.adsdk.ugeno.Zh.PjT$PjT
        public void PjT(Context context0, String s, String s1) {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            super.PjT(context0, s, s1);
            if(TextUtils.equals(s, "layoutGravity")) {
                this.yIW = this.PjT(s1);
            }
        }

        private int Zh(String s) {
            s.hashCode();
            switch(s) {
                case "bottom": {
                    return 80;
                }
                case "center": {
                    return 17;
                }
                case "center_horizontal": {
                    return 1;
                }
                case "center_vertical": {
                    return 16;
                }
                case "left": {
                    return 3;
                }
                case "right": {
                    return 5;
                }
                case "top": {
                    return 0x30;
                }
                default: {
                    return -1;
                }
            }
        }

        public FrameLayout.LayoutParams Zh() {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(((int)this.PjT), ((int)this.Zh));
            frameLayout$LayoutParams0.leftMargin = (int)this.cz;
            frameLayout$LayoutParams0.rightMargin = (int)this.XX;
            frameLayout$LayoutParams0.topMargin = (int)this.Au;
            frameLayout$LayoutParams0.bottomMargin = (int)this.SM;
            frameLayout$LayoutParams0.gravity = this.yIW;
            return frameLayout$LayoutParams0;
        }
    }

    private com.bytedance.adsdk.ugeno.SM.Zh.PjT OL;

    public Zh(Context context0) {
        super(context0);
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.PjT
    public com.bytedance.adsdk.ugeno.Zh.PjT.PjT DWo() {
        return new com.bytedance.adsdk.ugeno.SM.Zh.Zh.PjT(this);
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public View PjT() {
        return this.ReZ();
    }

    public com.bytedance.adsdk.ugeno.SM.Zh.PjT ReZ() {
        com.bytedance.adsdk.ugeno.SM.Zh.PjT pjT0 = new com.bytedance.adsdk.ugeno.SM.Zh.PjT(this.Zh);
        this.OL = pjT0;
        pjT0.PjT(this);
        return this.OL;
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.PjT
    public void Zh() {
        this.OL.setEventMap(this.Vs);
        super.Zh();
    }
}

