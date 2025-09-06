package com.bytedance.adsdk.Zh;

import android.content.Context;
import android.os.Trace;
import com.bytedance.adsdk.Zh.cr.Au;
import com.bytedance.adsdk.Zh.cr.XX;
import com.bytedance.adsdk.Zh.cr.Zh;
import com.bytedance.adsdk.Zh.cr.cz;
import java.io.File;

public class JQp {
    private static int Au = 0;
    private static com.bytedance.adsdk.Zh.cr.JQp DWo = null;
    private static String[] JQp = null;
    public static boolean PjT = false;
    private static boolean ReZ = true;
    private static cz SM = null;
    private static int XX = 0;
    private static boolean Zh = false;
    private static boolean cr = true;
    private static long[] cz;
    private static volatile Au qj;
    private static volatile XX xf;

    static {
    }

    public static Au PjT(Context context0) {
        Au au0 = JQp.qj;
        if(au0 == null) {
            Class class0 = Au.class;
            __monitor_enter(class0);
            try {
                Au au1 = JQp.qj;
                if(au1 == null) {
                    XX xX0 = JQp.Zh(context0);
                    cz cz0 = JQp.SM;
                    if(cz0 == null) {
                        cz0 = new Zh();
                    }
                    au1 = new Au(xX0, cz0);
                    JQp.qj = au1;
                }
                __monitor_exit(class0);
                return au1;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return au0;
    }

    public static void PjT(String s) {
        if(!JQp.Zh) {
            return;
        }
        int v = JQp.XX;
        if(v == 20) {
            ++JQp.Au;
            return;
        }
        JQp.JQp[v] = s;
        JQp.cz[v] = System.nanoTime();
        Trace.beginSection(s);
        ++JQp.XX;
    }

    public static boolean PjT() [...] // 潜在的解密器

    public static float Zh(String s) {
        int v = JQp.Au;
        if(v > 0) {
            JQp.Au = v - 1;
            return 0.0f;
        }
        if(!JQp.Zh) {
            return 0.0f;
        }
        int v1 = JQp.XX - 1;
        JQp.XX = v1;
        if(v1 == -1) {
            throw new IllegalStateException("Can\'t end trace section. There are none.");
        }
        if(!s.equals(JQp.JQp[v1])) {
            throw new IllegalStateException("Unbalanced trace call " + s + ". Expected " + JQp.JQp[JQp.XX] + ".");
        }
        Trace.endSection();
        return ((float)(System.nanoTime() - JQp.cz[JQp.XX])) / 1000000.0f;
    }

    public static XX Zh(Context context0) {
        if(!JQp.ReZ) {
            return null;
        }
        Context context1 = context0.getApplicationContext();
        XX xX0 = JQp.xf;
        if(xX0 == null) {
            Class class0 = XX.class;
            __monitor_enter(class0);
            try {
                XX xX1 = JQp.xf;
                if(xX1 == null) {
                    com.bytedance.adsdk.Zh.cr.JQp jQp0 = JQp.DWo;
                    if(jQp0 == null) {
                        jQp0 = new com.bytedance.adsdk.Zh.cr.JQp() {
                            @Override  // com.bytedance.adsdk.Zh.cr.JQp
                            public File PjT() {
                                return new File(context1.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    xX1 = new XX(jQp0);
                    JQp.xf = xX1;
                }
                __monitor_exit(class0);
                return xX1;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return xX0;
    }
}

