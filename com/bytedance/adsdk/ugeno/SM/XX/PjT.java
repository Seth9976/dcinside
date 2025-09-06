package com.bytedance.adsdk.ugeno.SM.XX;

import android.content.Context;

public abstract class PjT extends com.bytedance.adsdk.ugeno.Zh.PjT {
    public PjT(Context context0) {
        super(context0);
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public void PjT(String s, String s1) {
        super.PjT(s, s1);
        s.hashCode();
        int v = -1;
        switch(s) {
            case "onVideoFinish": {
                v = 1;
                break;
            }
            case "onVideoPause": {
                v = 4;
                break;
            }
            case "onVideoPlay": {
                v = 2;
                break;
            }
            case "onVideoProgress": {
                v = 0;
                break;
            }
            case "onVideoResume": {
                v = 3;
            }
        }
        if(v == 0 || v == 1 || v == 2 || v == 3 || v == 4) {
            this.Zh(s, s1);
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.PjT
    public void Zh() {
        super.Zh();
    }
}

