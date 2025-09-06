package com.bytedance.sdk.openadsdk.xf;

import android.content.Context;
import android.media.AudioManager;

public class DWo {
    private final AudioManager PjT;
    private boolean ReZ;
    private int Zh;

    public DWo(Context context0) {
        this.Zh = -1;
        this.ReZ = false;
        this.PjT = (AudioManager)context0.getApplicationContext().getSystemService("audio");
    }

    private void PjT(int v, int v1, int v2) {
        try {
            this.PjT.setStreamVolume(v, v1, v2);
        }
        catch(Throwable unused_ex) {
        }
    }

    public int PjT() {
        return this.Zh;
    }

    public void PjT(boolean z) {
        this.PjT(z, false);
    }

    public void PjT(boolean z, boolean z1) {
        int v = 0;
        if(this.PjT == null) {
            return;
        }
        if(z) {
            if(!z1) {
                return;
            }
            this.PjT(3, 0, 0);
            this.ReZ = true;
            return;
        }
        int v1 = this.Zh;
        if(v1 == 0) {
            v1 = 0;
            v = 1;
        }
        else if(v1 == -1) {
            if(z1) {
                v1 = 0;
                v = 1;
                this.Zh = -1;
                this.PjT(3, v1, v);
                this.ReZ = true;
                return;
            }
            return;
        }
        this.Zh = -1;
        this.PjT(3, v1, v);
        this.ReZ = true;
    }
}

