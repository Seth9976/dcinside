package com.bytedance.sdk.openadsdk.gK.PjT;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.cr;
import java.util.List;
import java.util.Map;

public class Zh {
    private List JQp;
    int PjT;
    private Bitmap ReZ;
    private byte[] Zh;
    private Bitmap cr;
    private Map cz;

    public Zh(Bitmap bitmap0, Bitmap bitmap1, int v) {
        this.Zh = null;
        this.JQp = null;
        this.cz = null;
        this.cr = bitmap1;
        this.ReZ = bitmap0;
        this.PjT = v;
    }

    public Zh(byte[] arr_b, int v) {
        this.ReZ = null;
        this.cr = null;
        this.JQp = null;
        this.cz = null;
        this.Zh = arr_b;
        this.PjT = v;
    }

    public Bitmap PjT() {
        return this.ReZ;
    }

    public byte[] ReZ() {
        if(this.Zh == null) {
            try {
                this.Zh = cr.PjT(this.ReZ);
                return this.Zh;
            }
            catch(OutOfMemoryError outOfMemoryError0) {
                RD.Zh("GifRequestResult", outOfMemoryError0.getMessage());
            }
        }
        return this.Zh;
    }

    public Bitmap Zh() {
        return this.cr;
    }

    public boolean cr() {
        return this.ReZ == null ? this.Zh != null && this.Zh.length > 0 : true;
    }
}

