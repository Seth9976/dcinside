package com.bytedance.sdk.component.JQp.ReZ.PjT;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.sdk.component.JQp.Zh;
import java.io.File;

public class PjT implements Zh, Cloneable {
    private File JQp;
    private long PjT;
    private boolean ReZ;
    private int Zh;
    private boolean cr;
    private static volatile Zh cz;

    public PjT(int v, long v1, File file0) {
        this(v, v1, v != 0, v1 != 0L, file0);
    }

    public PjT(int v, long v1, boolean z, boolean z1, File file0) {
        this.PjT = v1;
        this.Zh = v;
        this.ReZ = z;
        this.cr = z1;
        this.JQp = file0;
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public File Au() {
        return this.JQp;
    }

    public static Zh DWo() {
        return PjT.cz;
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public boolean JQp() {
        return this.ReZ;
    }

    public static Zh PjT(File file0) {
        file0.mkdirs();
        return PjT.cz == null ? new PjT(Math.max(Math.min(Runtime.getRuntime().maxMemory().intValue() / 16, 0x1E00000), 0x1900000), Math.max(Math.min(PjT.qj() / 16L, 0x2800000L), 0x1400000L), file0) : new PjT(Math.max(Math.min(PjT.cz.Zh() / 2, 0x1E00000), 0x1900000), Math.max(Math.min(PjT.cz.PjT() / 2L, 0x2800000L), 0x1400000L), file0);
    }

    public static void PjT(Context context0, Zh zh0) {
        if(zh0 != null) {
            PjT.cz = zh0;
            return;
        }
        PjT.cz = PjT.PjT(new File(context0.getCacheDir(), "image"));
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public long PjT() {
        return this.PjT;
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public int ReZ() {
        return 0;
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public boolean SM() {
        return true;
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public boolean XX() {
        return this.cr;
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public int Zh() {
        return this.Zh;
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public int cr() {
        return 0;
    }

    @Override  // com.bytedance.sdk.component.JQp.Zh
    public boolean cz() {
        return false;
    }

    private static long qj() {
        StatFs statFs0 = new StatFs(Environment.getDataDirectory().getPath());
        long v = (long)statFs0.getBlockSize();
        return ((long)statFs0.getAvailableBlocks()) * v;
    }
}

