package com.bytedance.adsdk.Zh.cr;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.Zh.xf;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

public class Au {
    private final XX PjT;
    private final cz Zh;

    public Au(XX xX0, cz cz0) {
        this.PjT = xX0;
        this.Zh = cz0;
    }

    private xf PjT(Context context0, String s, InputStream inputStream0, String s1) throws IOException {
        if(s1 != null) {
            return this.PjT == null ? com.bytedance.adsdk.Zh.Au.PjT(context0, new ZipInputStream(inputStream0), null) : com.bytedance.adsdk.Zh.Au.PjT(context0, new ZipInputStream(new FileInputStream(this.PjT.PjT(s, inputStream0, ReZ.Zh))), s);
        }
        return com.bytedance.adsdk.Zh.Au.PjT(context0, new ZipInputStream(inputStream0), null);
    }

    private xf PjT(Context context0, String s, InputStream inputStream0, String s1, String s2) throws IOException {
        xf xf0;
        ReZ reZ0;
        if(s1 == null) {
            s1 = "application/json";
        }
        if(s1.contains("application/zip") || s1.contains("application/x-zip") || s1.contains("application/x-zip-compressed") || s.split("\\?")[0].endsWith(".lottie")) {
            xf0 = this.PjT(context0, s, inputStream0, s2);
            reZ0 = ReZ.Zh;
        }
        else {
            reZ0 = ReZ.PjT;
            xf0 = this.PjT(s, inputStream0, s2);
        }
        if(s2 != null && xf0.PjT() != null) {
            XX xX0 = this.PjT;
            if(xX0 != null) {
                xX0.PjT(s, reZ0);
            }
        }
        return xf0;
    }

    private xf PjT(String s, InputStream inputStream0, String s1) throws IOException {
        if(s1 != null) {
            return this.PjT == null ? com.bytedance.adsdk.Zh.Au.Zh(inputStream0, null) : com.bytedance.adsdk.Zh.Au.Zh(new FileInputStream(this.PjT.PjT(s, inputStream0, ReZ.PjT).getAbsolutePath()), s);
        }
        return com.bytedance.adsdk.Zh.Au.Zh(inputStream0, null);
    }

    public xf PjT(Context context0, String s, String s1) {
        com.bytedance.adsdk.Zh.XX xX0 = this.Zh(context0, s, s1);
        return xX0 == null ? this.ReZ(context0, s, s1) : new xf(xX0);
    }

    private xf ReZ(Context context0, String s, String s1) {
        xf xf2;
        xf xf1;
        xf xf0;
        cr cr0 = null;
        try {
            cr0 = this.Zh.PjT(s);
            if(cr0.PjT()) {
                xf0 = this.PjT(context0, s, cr0.Zh(), cr0.ReZ(), s1);
                goto label_4;
            }
            xf1 = new xf(new IllegalArgumentException(cr0.cr()));
            goto label_17;
        }
        catch(Exception exception0) {
            goto label_9;
        }
        catch(Throwable throwable0) {
            goto label_14;
        }
        try {
        label_4:
            cr0.close();
        }
        catch(IOException unused_ex) {
        }
        return xf0;
        try {
            try {
                xf1 = new xf(new IllegalArgumentException(cr0.cr()));
                goto label_17;
            }
            catch(Exception exception0) {
            }
        label_9:
            xf2 = new xf(exception0);
            if(cr0 != null) {
                goto label_11;
            }
            return xf2;
        }
        catch(Throwable throwable0) {
            goto label_14;
        }
        try {
        label_11:
            cr0.close();
        }
        catch(IOException unused_ex) {
        }
        return xf2;
    label_14:
        if(cr0 != null) {
            try {
                cr0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable0;
        try {
        label_17:
            cr0.close();
        }
        catch(IOException unused_ex) {
        }
        return xf1;
    }

    private com.bytedance.adsdk.Zh.XX Zh(Context context0, String s, String s1) {
        if(s1 != null) {
            XX xX0 = this.PjT;
            if(xX0 != null) {
                Pair pair0 = xX0.PjT(s);
                if(pair0 == null) {
                    return null;
                }
                ReZ reZ0 = (ReZ)pair0.first;
                InputStream inputStream0 = (InputStream)pair0.second;
                xf xf0 = reZ0 == ReZ.Zh ? com.bytedance.adsdk.Zh.Au.PjT(context0, new ZipInputStream(inputStream0), s1) : com.bytedance.adsdk.Zh.Au.Zh(inputStream0, s1);
                return xf0.PjT() == null ? null : ((com.bytedance.adsdk.Zh.XX)xf0.PjT());
            }
        }
        return null;
    }
}

