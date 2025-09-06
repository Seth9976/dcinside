package com.bytedance.sdk.openadsdk.multipro;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.Sks;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.atomic.AtomicBoolean;

public class ReZ {
    private static boolean PjT = true;
    private static final AtomicBoolean Zh;

    static {
        ReZ.Zh = new AtomicBoolean(false);
    }

    public static void PjT() {
        ReZ.PjT = false;
    }

    public static void PjT(Context context0) {
        if(context0 == null) {
            return;
        }
        if(!ReZ.PjT) {
            return;
        }
        if(!ReZ.Zh.compareAndSet(false, true)) {
            return;
        }
        try {
            if(Build.VERSION.SDK_INT >= 28) {
                if(Sks.PjT(context0)) {
                    ReZ.Zh(context0);
                    return;
                }
                String s = Sks.Zh(context0);
                try {
                    if(TextUtils.isEmpty(s)) {
                        s = "com.dcinside.app.android" + Process.myPid();
                    }
                    WebView.setDataDirectorySuffix(s);
                    return;
                }
                catch(IllegalStateException unused_ex) {
                }
                catch(Exception unused_ex) {
                    return;
                }
                ReZ.PjT(s);
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh(throwable0.getMessage(), new Object[0]);
    }

    private static void PjT(File file0) {
        ReZ.PjT(file0, (file0.exists() ? file0.delete() : false));
    }

    private static void PjT(File file0, boolean z) {
        if(z && !file0.exists()) {
            try {
                file0.createNewFile();
            }
            catch(IOException iOException0) {
                RD.Zh("TTAD.TTMultiInitHelper", iOException0.getMessage());
            }
        }
    }

    private static void PjT(String s) {
        Class.class.getDeclaredMethod("getDeclaredField", String.class).setAccessible(true);
        Class class0 = Class.forName("android.webkit.WebViewFactory");
        Field field0 = class0.getDeclaredField("sDataDirectorySuffix");
        field0.setAccessible(true);
        if(TextUtils.isEmpty(((String)field0.get(class0)))) {
            field0.set(class0, s);
        }
    }

    private static String Zh() {
        Class.class.getDeclaredMethod("getDeclaredField", String.class).setAccessible(true);
        Class class0 = Class.forName("android.webkit.WebViewFactory");
        return (String)class0.getDeclaredField("sDataDirectorySuffix").get(class0);
    }

    private static void Zh(Context context0) {
        RandomAccessFile randomAccessFile0;
        FileChannel fileChannel0;
        String s = ReZ.Zh();
        if(!TextUtils.isEmpty(s)) {
            "webview_".concat(String.valueOf(s));
        }
        File file0 = new File(context0.getDir("webview", 0).getPath(), "webview_data.lock");
        file0.getAbsolutePath();
        if(!file0.exists()) {
            return;
        }
        try {
            fileChannel0 = null;
            randomAccessFile0 = null;
            randomAccessFile0 = new RandomAccessFile(file0, "rw");
            goto label_14;
        }
        catch(Exception unused_ex) {
            goto label_25;
        }
        catch(Throwable throwable0) {
        }
        FileChannel fileChannel1 = null;
        throwable1 = throwable0;
        goto label_42;
        try {
        label_14:
            fileChannel1 = randomAccessFile0.getChannel();
            if(fileChannel1 != null) {
                goto label_16;
            }
            goto label_17;
        }
        catch(Exception unused_ex) {
            goto label_25;
        }
        catch(Throwable throwable0) {
            fileChannel1 = fileChannel0;
            throwable1 = throwable0;
            goto label_42;
        }
        try {
        label_16:
            fileChannel0 = fileChannel1.tryLock();
        label_17:
            if(fileChannel0 == null) {
                ReZ.PjT(file0);
            }
            else {
                ((FileLock)fileChannel0).close();
            }
            goto label_53;
        }
        catch(Exception unused_ex) {
        }
        catch(Throwable throwable1) {
            goto label_42;
        }
        fileChannel0 = fileChannel1;
        try {
        label_25:
            ReZ.PjT(file0);
        }
        catch(Throwable throwable0) {
            fileChannel1 = fileChannel0;
            throwable1 = throwable0;
            goto label_42;
        }
        if(fileChannel0 != null) {
            try {
                fileChannel0.close();
            }
            catch(Throwable throwable2) {
                throwable2.getMessage();
            }
        }
        if(randomAccessFile0 != null) {
            try {
                randomAccessFile0.close();
                return;
            }
            catch(Throwable throwable3) {
                throwable3.getMessage();
            }
        }
        return;
    label_42:
        if(fileChannel1 != null) {
            try {
                fileChannel1.close();
            }
            catch(Throwable throwable4) {
                throwable4.getMessage();
            }
        }
        if(randomAccessFile0 != null) {
            try {
                randomAccessFile0.close();
            }
            catch(Throwable throwable5) {
                throwable5.getMessage();
            }
        }
        throw throwable1;
    label_53:
        if(fileChannel1 != null) {
            try {
                fileChannel1.close();
            }
            catch(Throwable throwable6) {
                throwable6.getMessage();
            }
        }
        try {
            randomAccessFile0.close();
        }
        catch(Throwable throwable7) {
            throwable7.getMessage();
        }
    }
}

