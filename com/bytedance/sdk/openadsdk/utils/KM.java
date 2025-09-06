package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.Au.ReZ.cr;
import com.bytedance.sdk.component.Au.SM;
import com.bytedance.sdk.component.Au.cz;
import com.bytedance.sdk.component.adexpress.PjT.Zh.Zh;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.Yo;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Properties;

public class KM implements Thread.UncaughtExceptionHandler {
    public static volatile boolean PjT;
    private String ReZ;
    private final Thread.UncaughtExceptionHandler Zh;

    private KM() {
        this.Zh = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.Zh();
    }

    public static KM PjT() {
        return new KM();
    }

    private void PjT(Thread thread0, Throwable throwable0) {
        Properties properties1;
        FileOutputStream fileOutputStream1;
        FileOutputStream fileOutputStream0;
        boolean z;
        int v1;
        int v;
        FileInputStream fileInputStream1;
        Properties properties0;
        File file0;
        FileInputStream fileInputStream0 = null;
        try {
            if(TextUtils.isEmpty(this.ReZ)) {
                this.Zh();
            }
            if(TextUtils.isEmpty(this.ReZ)) {
                return;
            }
            file0 = new File(this.ReZ, "tt_crash_count.properties");
            if(!file0.exists() || (!file0.isFile() || !file0.canRead())) {
                goto label_48;
            }
            else {
                properties0 = new Properties();
                fileInputStream1 = new FileInputStream(file0);
                goto label_9;
            }
            return;
        }
        catch(Throwable throwable1) {
            fileOutputStream1 = null;
            goto label_59;
        }
        try {
        label_9:
            properties0.load(fileInputStream1);
            String s = properties0.getProperty("crash_count", "0");
            String s1 = properties0.getProperty("crash_last_time", "0");
            v = (int)Integer.valueOf(s);
            v1 = 0;
            z = true;
            if(System.currentTimeMillis() - ((long)Long.valueOf(s1)) < 300000L) {
                goto label_16;
            }
            else {
                goto label_19;
            }
            goto label_21;
        }
        catch(Throwable throwable1) {
            fileOutputStream1 = fileInputStream0;
            fileInputStream0 = fileInputStream1;
            goto label_59;
        }
    label_16:
        int v2 = v + 1;
        boolean z1 = false;
        goto label_21;
    label_19:
        z1 = true;
        v2 = 1;
    label_21:
        if(v2 < 3) {
            v1 = v2;
            z = false;
        }
        if(z) {
            try {
                file0.delete();
            }
            catch(Throwable unused_ex) {
            }
        }
        else {
            try {
                properties0.setProperty("crash_count", String.valueOf(v1));
                if(z1) {
                    properties0.setProperty("crash_last_time", "1757089264572");
                }
                fileOutputStream0 = new FileOutputStream(file0);
            }
            catch(Throwable throwable1) {
                fileOutputStream1 = fileInputStream0;
                fileInputStream0 = fileInputStream1;
                goto label_59;
            }
            try {
                properties0.store(fileOutputStream0, "tt_crash_info");
                fileInputStream0 = fileOutputStream0;
            }
            catch(Throwable throwable2) {
                fileOutputStream1 = fileOutputStream0;
                throwable1 = throwable2;
                fileInputStream0 = fileInputStream1;
                goto label_59;
            }
        }
        if(z) {
            try {
                this.ReZ();
                fileOutputStream1 = fileInputStream0;
                fileInputStream0 = fileInputStream1;
                goto label_72;
            }
            catch(Throwable throwable1) {
            }
            fileOutputStream1 = fileInputStream0;
            fileInputStream0 = fileInputStream1;
            goto label_59;
        }
        fileOutputStream1 = fileInputStream0;
        fileInputStream0 = fileInputStream1;
        goto label_72;
        try {
        label_48:
            properties1 = new Properties();
            properties1.setProperty("crash_count", "1");
            properties1.setProperty("crash_last_time", "1757089264572");
            fileOutputStream1 = new FileOutputStream(file0);
        }
        catch(Throwable throwable1) {
            fileOutputStream1 = null;
            goto label_59;
        }
        try {
            properties1.store(fileOutputStream1, "tt_crash_info");
            goto label_72;
        }
        catch(Throwable throwable1) {
        }
        try {
        label_59:
            RD.PjT("TTCrashHandler", "crash count error", throwable1);
        }
        catch(Throwable throwable3) {
            if(fileInputStream0 != null) {
                try {
                    fileInputStream0.close();
                }
                catch(Throwable unused_ex) {
                }
            }
            if(fileOutputStream1 != null) {
                try {
                    fileOutputStream1.close();
                }
                catch(Throwable unused_ex) {
                }
            }
            throw throwable3;
        }
        if(fileInputStream0 != null) {
            try {
                fileInputStream0.close();
            }
            catch(Throwable unused_ex) {
            }
        }
        if(fileOutputStream1 != null) {
            try {
                fileOutputStream1.close();
            }
            catch(Throwable unused_ex) {
            }
            return;
        label_72:
            if(fileInputStream0 != null) {
                try {
                    fileInputStream0.close();
                }
                catch(Throwable unused_ex) {
                }
            }
            if(fileOutputStream1 != null) {
                try {
                    fileOutputStream1.close();
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    private void ReZ() {
        Class class0;
        try {
            class0 = Context.class;
            Method method0 = Yo.PjT("com.bytedance.sdk.openadsdk.TTC2Proxy", "a", new Class[]{class0});
            if(method0 != null) {
                method0.invoke(null, ub.PjT());
            }
        }
        catch(Throwable unused_ex) {
        }
        try {
            Method method1 = Yo.PjT("com.bytedance.sdk.openadsdk.TTC3Proxy", "a", new Class[]{class0});
            if(method1 != null) {
                method1.invoke(null, ub.PjT());
            }
        }
        catch(Throwable unused_ex) {
        }
        try {
            xs.Gr().PjT();
        }
        catch(Throwable unused_ex) {
        }
        try {
            Zh.Zh();
        }
        catch(Throwable unused_ex) {
        }
    }

    private void Zh() {
        Context context0 = ub.PjT();
        if(context0 == null) {
            return;
        }
        try {
            File file0 = new File(context0.getFilesDir(), "TTCache");
            file0.mkdirs();
            this.ReZ = file0.getPath();
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override
    public void uncaughtException(Thread thread0, Throwable throwable0) {
        KM.PjT = true;
        SM.sCrashHappened = true;
        cr.ReZ = true;
        boolean z = false;
        cz.PjT(false);
        try {
            StringWriter stringWriter0 = new StringWriter();
            throwable0.printStackTrace(new PrintWriter(stringWriter0));
            String s = stringWriter0.toString();
            if(s != null) {
                z = s.contains(AdSlot.class.getPackage().getName());
            }
        }
        catch(Throwable unused_ex) {
        }
        if(z) {
            this.PjT(thread0, throwable0);
        }
        Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = this.Zh;
        if(thread$UncaughtExceptionHandler0 != null && thread$UncaughtExceptionHandler0 != this) {
            thread$UncaughtExceptionHandler0.uncaughtException(thread0, throwable0);
        }
    }
}

