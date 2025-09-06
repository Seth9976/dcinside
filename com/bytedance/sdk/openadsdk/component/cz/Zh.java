package com.bytedance.sdk.openadsdk.component.cz;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

public class Zh implements Handler.Callback {
    private int JQp;
    private Handler PjT;
    private PjT ReZ;
    private boolean XX;
    private final com.bytedance.sdk.openadsdk.component.Au.PjT Zh;
    private int cr;
    private int cz;

    public Zh(com.bytedance.sdk.openadsdk.component.Au.PjT pjT0) {
        this.PjT = new Handler(Looper.myLooper(), this);
        this.cr = 0;
        this.JQp = 5;
        this.cz = 0;
        this.Zh = pjT0;
    }

    public void JQp() {
        this.PjT.removeCallbacksAndMessages(null);
        this.PjT = null;
    }

    public int PjT() {
        return this.cz;
    }

    public void PjT(float f) {
        this.JQp = (int)f;
        if(((int)f) <= 0) {
            this.JQp = 5;
        }
    }

    public void PjT(int v) {
        this.cr = v;
        int v1 = this.JQp - v;
        this.Zh.PjT(((long)v1));
        boolean z = true;
        if(v <= 0) {
            PjT pjT0 = this.ReZ;
            if(pjT0 != null && !this.XX) {
                pjT0.Zh();
                this.XX = true;
            }
            v = 0;
        }
        PjT pjT1 = this.ReZ;
        if(pjT1 != null) {
            int v2 = this.cz;
            if(v != 0 && v1 < v2) {
                z = false;
            }
            pjT1.PjT(v2 - v1, z);
        }
    }

    public void PjT(PjT pjT0) {
        this.ReZ = pjT0;
    }

    public void ReZ() {
        if(this.PjT != null) {
            Message message0 = Message.obtain();
            message0.what = 100;
            message0.arg1 = this.cr;
            this.PjT.sendMessage(message0);
        }
    }

    public void Zh() {
        Handler handler0 = this.PjT;
        if(handler0 != null) {
            handler0.sendMessage(handler0.obtainMessage(100, this.JQp, 0));
        }
    }

    public void Zh(int v) {
        this.cz = Math.min(v, this.JQp);
    }

    public void cr() {
        Handler handler0 = this.PjT;
        if(handler0 != null) {
            handler0.removeMessages(100);
        }
    }

    @Override  // android.os.Handler$Callback
    public boolean handleMessage(@NonNull Message message0) {
        if(message0.what == 100 && this.PjT != null) {
            int v = message0.arg1;
            this.PjT(v);
            if(v > 0) {
                Message message1 = Message.obtain();
                message1.what = 100;
                message1.arg1 = v - 1;
                this.PjT.sendMessageDelayed(message1, 1000L);
            }
        }
        return true;
    }
}

