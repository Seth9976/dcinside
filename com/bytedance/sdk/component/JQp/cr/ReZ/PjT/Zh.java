package com.bytedance.sdk.component.JQp.cr.ReZ.PjT;

import android.content.Context;
import java.io.File;

public class Zh implements com.bytedance.sdk.component.JQp.Zh, Cloneable {
    private File Au;
    private boolean JQp;
    private long PjT;
    private int ReZ;
    private static volatile com.bytedance.sdk.component.JQp.Zh SM;
    private boolean XX;
    private int Zh;
    private int cr;
    private boolean cz;

    public Zh(int v, int v1, int v2, long v3, File file0) {
        this(v, v1, v2, v3, v1 != 0, v3 != 0L, file0);
    }

    public Zh(int v, int v1, int v2, long v3, boolean z, boolean z1, File file0) {
        this.PjT = v3;
        this.Zh = v;
        this.ReZ = v1;
        this.cr = v2;
        this.JQp = z;
        this.cz = z1;
        this.Au = file0;
        this.XX = v2 != 0;
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public File Au() {
        return this.Au;
    }

    public static com.bytedance.sdk.component.JQp.Zh DWo() {
        return Zh.SM;
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public boolean JQp() {
        return this.JQp;
    }

    public static com.bytedance.sdk.component.JQp.Zh PjT(File file0) {
        file0.mkdirs();
        if(Zh.SM == null) {
            return new Zh(0, 10, 14, 20L, file0);
        }
        long v = Zh.SM.PjT();
        return new Zh(0, Zh.SM.ReZ(), Zh.SM.cr(), v, file0);
    }

    public static void PjT(Context context0, com.bytedance.sdk.component.JQp.Zh zh0) {
        if(zh0 != null) {
            Zh.SM = zh0;
            return;
        }
        Zh.SM = Zh.PjT(new File(context0.getCacheDir(), "image"));
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public long PjT() {
        return this.PjT;
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public int ReZ() {
        return this.ReZ;
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public boolean SM() {
        return true;
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public boolean XX() {
        return this.cz;
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public int Zh() {
        return this.Zh;
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public int cr() {
        return this.cr;
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public boolean cz() {
        return this.XX;
    }
}

