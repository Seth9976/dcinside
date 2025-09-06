package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import y4.l;

public class PjT {
    public interface com.bytedance.sdk.component.PjT.PjT {
        ExecutorService getExecutorService();

        HandlerThread getSafeHandlerThread(String arg1, int arg2);
    }

    public class ReZ implements SharedPreferences.Editor {
        final PjT PjT;
        @GuardedBy("mEditorLock")
        private final Map ReZ;
        private final Object Zh;
        @GuardedBy("mEditorLock")
        private boolean cr;

        public ReZ() {
            this.Zh = new Object();
            this.ReZ = new HashMap();
            this.cr = false;
        }

        public ReZ PjT() {
            synchronized(this.Zh) {
                this.cr = true;
            }
            return this;
        }

        public ReZ PjT(String s) {
            synchronized(this.Zh) {
                this.ReZ.put(s, this);
                return this;
            }
        }

        public ReZ PjT(String s, float f) {
            synchronized(this.Zh) {
                this.ReZ.put(s, f);
                return this;
            }
        }

        public ReZ PjT(String s, int v) {
            synchronized(this.Zh) {
                this.ReZ.put(s, v);
                return this;
            }
        }

        public ReZ PjT(String s, long v) {
            synchronized(this.Zh) {
                this.ReZ.put(s, v);
                return this;
            }
        }

        public ReZ PjT(String s, String s1) {
            synchronized(this.Zh) {
                this.ReZ.put(s, s1);
                return this;
            }
        }

        public ReZ PjT(String s, Set set0) {
            synchronized(this.Zh) {
                HashSet hashSet0 = set0 == null ? null : new HashSet(set0);
                this.ReZ.put(s, hashSet0);
                return this;
            }
        }

        public ReZ PjT(String s, boolean z) {
            synchronized(this.Zh) {
                this.ReZ.put(s, Boolean.valueOf(z));
                return this;
            }
        }

        private Zh Zh() {
            int v1;
            Object object1;
            Properties properties1;
            int v;
            Object object0 = PjT.this.ReZ;
            synchronized(object0) {
                if(PjT.this.XX > 0) {
                    Properties properties0 = new Properties();
                    properties0.putAll(PjT.this.JQp);
                    PjT.this.JQp = properties0;
                }
                v = 0;
                properties1 = PjT.this.JQp;
                PjT.JQp(PjT.this);
                object1 = this.Zh;
                __monitor_enter(object1);
            }
            try {
                if(this.cr) {
                    if(properties1.isEmpty()) {
                        v1 = 0;
                    }
                    else {
                        properties1.clear();
                        v1 = 1;
                    }
                    this.cr = false;
                    v = v1;
                }
                for(Object object2: this.ReZ.entrySet()) {
                    String s = (String)((Map.Entry)object2).getKey();
                    Object object3 = ((Map.Entry)object2).getValue();
                    if(object3 == this || object3 == null) {
                        if(!properties1.containsKey(s)) {
                            continue;
                        }
                        properties1.remove(s);
                    }
                    else {
                        if(properties1.containsKey(s)) {
                            Object object4 = properties1.get(s);
                            if(object4 == null || !object4.equals(String.valueOf(object3))) {
                                goto label_28;
                            }
                            continue;
                        }
                    label_28:
                        properties1.put(s, String.valueOf(object3));
                    }
                    v = 1;
                }
                this.ReZ.clear();
                if(v != 0) {
                    PjT.cz(PjT.this);
                }
                __monitor_exit(object1);
                goto label_42;
            }
            catch(Throwable throwable1) {
            }
            try {
                __monitor_exit(object1);
                throw throwable1;
            label_42:
                __monitor_exit(object0);
                return new Zh(PjT.this.Au, properties1, null);
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(object0);
            throw throwable0;
        }

        @Override  // android.content.SharedPreferences$Editor
        public void apply() {
            Zh pjT$Zh0 = this.Zh();
            PjT.this.PjT(pjT$Zh0, false);
        }

        @Override  // android.content.SharedPreferences$Editor
        public SharedPreferences.Editor clear() {
            return this.PjT();
        }

        // 去混淆评级： 低(24)
        @Override  // android.content.SharedPreferences$Editor
        public boolean commit() {
            Zh pjT$Zh0 = this.Zh();
            PjT.this.PjT(pjT$Zh0, true);
            try {
                pjT$Zh0.ReZ.await();
                return pjT$Zh0.cr;
            }
            catch(InterruptedException unused_ex) {
                return false;
            }
        }

        @Override  // android.content.SharedPreferences$Editor
        public SharedPreferences.Editor putBoolean(String s, boolean z) {
            return this.PjT(s, z);
        }

        @Override  // android.content.SharedPreferences$Editor
        public SharedPreferences.Editor putFloat(String s, float f) {
            return this.PjT(s, f);
        }

        @Override  // android.content.SharedPreferences$Editor
        public SharedPreferences.Editor putInt(String s, int v) {
            return this.PjT(s, v);
        }

        @Override  // android.content.SharedPreferences$Editor
        public SharedPreferences.Editor putLong(String s, long v) {
            return this.PjT(s, v);
        }

        @Override  // android.content.SharedPreferences$Editor
        public SharedPreferences.Editor putString(String s, String s1) {
            return this.PjT(s, s1);
        }

        @Override  // android.content.SharedPreferences$Editor
        public SharedPreferences.Editor putStringSet(String s, Set set0) {
            return this.PjT(s, set0);
        }

        @Override  // android.content.SharedPreferences$Editor
        public SharedPreferences.Editor remove(String s) {
            return this.PjT(s);
        }
    }

    static class Zh {
        boolean JQp;
        final long PjT;
        final CountDownLatch ReZ;
        final Properties Zh;
        @GuardedBy("mWritingToDiskLock")
        volatile boolean cr;

        private Zh(long v, Properties properties0) {
            this.ReZ = new CountDownLatch(1);
            this.cr = false;
            this.JQp = false;
            this.PjT = v;
            this.Zh = properties0;
        }

        Zh(long v, Properties properties0, com.bytedance.sdk.component.PjT.1 pjT$10) {
            this(v, properties0);
        }

        void PjT(boolean z, boolean z1) {
            this.JQp = z;
            this.cr = z1;
            this.ReZ.countDown();
        }
    }

    @GuardedBy("this")
    private long Au;
    private final File DWo;
    @GuardedBy("mLoadLock")
    private Properties JQp;
    protected static com.bytedance.sdk.component.PjT.PjT PjT = null;
    private final Object ReZ;
    @GuardedBy("mWriteLock")
    private long SM;
    @GuardedBy("mLoadLock")
    private int XX;
    private static boolean Zh = false;
    private final Object cr;
    private volatile boolean cz;
    private final File qj;
    @GuardedBy("TTPropHelper.class")
    private static ArrayMap xf;
    private static ArrayMap xs;

    static {
    }

    private PjT(File file0) {
        Object object0 = new Object();
        this.ReZ = object0;
        this.cr = new Object();
        this.JQp = new Properties();
        this.cz = false;
        this.XX = 0;
        this.DWo = file0;
        this.qj = PjT.PjT(file0);
        synchronized(object0) {
            this.cz = false;
        }
        if(PjT.PjT != null && PjT.PjT.getExecutorService() != null) {
            PjT.PjT.getExecutorService().execute(() -> {
                FileInputStream fileInputStream0;
                Object object0 = PjT.this.ReZ;
                synchronized(object0) {
                    if(PjT.this.cz) {
                        if(PjT.Zh) {
                            Log.d("TTPropHelper", "reload: already loaded, ignore");
                        }
                        __monitor_exit(object0);
                        return;
                    }
                    if(PjT.this.qj.exists()) {
                        PjT.this.DWo.delete();
                        PjT.this.qj.renameTo(PjT.this.DWo);
                    }
                    __monitor_exit(object0);
                }
                if(PjT.Zh) {
                    Log.d("TTPropHelper", "reload: " + PjT.this.DWo.getAbsolutePath() + ", exist? " + PjT.this.DWo.exists());
                }
                Properties properties0 = null;
                if(PjT.this.DWo.exists()) {
                    Properties properties1 = new Properties();
                    try {
                        fileInputStream0 = new FileInputStream(PjT.this.DWo);
                    }
                    catch(Throwable throwable1) {
                        try {
                            fileInputStream0 = null;
                            Log.e("TTPropHelper", "reload: ", throwable1);
                            goto label_40;
                        }
                        catch(Throwable throwable2) {
                            goto label_34;
                        }
                    }
                    try {
                        properties1.load(fileInputStream0);
                        if(PjT.Zh) {
                            Log.d("TTPropHelper", "reload: find " + properties1.size() + " ,items from " + PjT.this.DWo.getAbsolutePath());
                            goto label_41;
                        }
                        else {
                            goto label_43;
                        }
                        goto label_47;
                    }
                    catch(Throwable throwable3) {
                        try {
                            Log.e("TTPropHelper", "reload: ", throwable3);
                            goto label_40;
                        }
                        catch(Throwable throwable2) {
                        }
                    }
                label_34:
                    if(fileInputStream0 != null) {
                        try {
                            fileInputStream0.close();
                        }
                        catch(Throwable throwable4) {
                            Log.w("TTPropHelper", throwable4.getMessage());
                        }
                    }
                    throw throwable2;
                label_40:
                    if(fileInputStream0 != null) {
                        try {
                        label_41:
                            fileInputStream0.close();
                            goto label_47;
                        label_43:
                            fileInputStream0.close();
                        }
                        catch(Throwable throwable5) {
                            Log.w("TTPropHelper", throwable5.getMessage());
                        }
                    }
                label_47:
                    properties0 = properties1;
                }
                Object object1 = PjT.this.ReZ;
                __monitor_enter(object1);
                try {
                    if(properties0 != null && !properties0.isEmpty()) {
                        PjT.this.JQp = properties0;
                    }
                    PjT.this.cz = true;
                    PjT.this.ReZ.notifyAll();
                    __monitor_exit(object1);
                    return;
                }
                catch(Throwable throwable6) {
                }
                __monitor_exit(object1);
                throw throwable6;
            });
            return;
        }
        new Thread("TTPropHelper") {
            final PjT PjT;

            @Override
            public void run() {
                PjT.this.PjT();
            }
        }.start();

        class com.bytedance.sdk.component.PjT.2 implements Runnable {
            final PjT PjT;

            @Override
            public void run() {
                PjT.this.PjT();
            }
        }

    }

    static int JQp(PjT pjT0) {
        int v = pjT0.XX;
        pjT0.XX = v + 1;
        return v;
    }

    @RequiresApi(api = 19)
    public static PjT PjT(@l Context context0, String s) {
        if(TextUtils.isEmpty(s)) {
            s = "tt_prop";
        }
        synchronized(PjT.class) {
            if(PjT.xf == null) {
                PjT.xf = new ArrayMap();
            }
            File file0 = (File)PjT.xf.get(s);
            if(file0 == null) {
                file0 = new File(context0.getFilesDir(), s);
                PjT.xf.put(s, file0);
            }
            if(PjT.xs == null) {
                PjT.xs = new ArrayMap();
            }
            PjT pjT0 = (PjT)PjT.xs.get(file0);
            if(pjT0 == null) {
                PjT pjT1 = new PjT(file0);
                PjT.xs.put(file0, pjT1);
                return pjT1;
            }
            return pjT0;
        }
    }

    static File PjT(PjT pjT0) {
        return pjT0.DWo;
    }

    static File PjT(File file0) {
        return new File(file0.getPath() + ".bak");
    }

    public static void PjT(@l com.bytedance.sdk.component.PjT.PjT pjT$PjT0) {
        PjT.PjT = pjT$PjT0;
    }

    private void PjT(Zh pjT$Zh0, boolean z) {
        com.bytedance.sdk.component.PjT.3 pjT$30 = new Runnable() {
            final PjT ReZ;

            @Override
            public void run() {
                synchronized(PjT.this.cr) {
                    try {
                        PjT.this.Zh(pjT$Zh0, z);
                    }
                    catch(OutOfMemoryError unused_ex) {
                    }
                }
                synchronized(PjT.this.ReZ) {
                    PjT.SM(PjT.this);
                }
            }
        };
        if(z && this.XX == 1) {
            pjT$30.run();
            return;
        }
        com.bytedance.sdk.component.Zh.PjT(pjT$30, ((boolean)(true ^ z)));
    }

    public float PjT(String s, float f) {
        float f1;
        if(TextUtils.isEmpty(s)) {
            return f;
        }
        Object object0 = this.ReZ;
        __monitor_enter(object0);
        try {
            try {
                this.cr();
                f1 = Float.parseFloat(this.JQp.getProperty(s, String.valueOf(f)));
            }
            catch(NumberFormatException numberFormatException0) {
                Log.e("TTPropHelper", numberFormatException0.getMessage());
                __monitor_exit(object0);
                return f;
            }
            __monitor_exit(object0);
            return f1;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(object0);
        throw throwable0;
    }

    public int PjT(String s, int v) {
        int v1;
        if(TextUtils.isEmpty(s)) {
            return v;
        }
        Object object0 = this.ReZ;
        __monitor_enter(object0);
        try {
            try {
                this.cr();
                v1 = Integer.parseInt(this.JQp.getProperty(s, String.valueOf(v)));
            }
            catch(NumberFormatException numberFormatException0) {
                Log.e("TTPropHelper", numberFormatException0.getMessage());
                __monitor_exit(object0);
                return v;
            }
            __monitor_exit(object0);
            return v1;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(object0);
        throw throwable0;
    }

    public long PjT(String s, long v) {
        long v1;
        if(TextUtils.isEmpty(s)) {
            return v;
        }
        Object object0 = this.ReZ;
        __monitor_enter(object0);
        try {
            try {
                this.cr();
                v1 = Long.parseLong(this.JQp.getProperty(s, String.valueOf(v)));
            }
            catch(NumberFormatException numberFormatException0) {
                Log.e("TTPropHelper", numberFormatException0.getMessage());
                __monitor_exit(object0);
                return v;
            }
            __monitor_exit(object0);
            return v1;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(object0);
        throw throwable0;
    }

    public String PjT(String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            return s1;
        }
        synchronized(this.ReZ) {
            this.cr();
            return this.JQp.getProperty(s, s1);
        }
    }

    // 检测为 Lambda 实现
    public void PjT() [...]

    public boolean PjT(String s) {
        boolean z;
        Object object0 = this.ReZ;
        __monitor_enter(object0);
        try {
            try {
                this.cr();
                z = this.JQp.containsKey(s);
            }
            catch(NumberFormatException numberFormatException0) {
                Log.e("TTPropHelper", numberFormatException0.getMessage());
                __monitor_exit(object0);
                return false;
            }
            __monitor_exit(object0);
            return z;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(object0);
        throw throwable0;
    }

    public boolean PjT(String s, boolean z) {
        boolean z1;
        if(TextUtils.isEmpty(s)) {
            return z;
        }
        Object object0 = this.ReZ;
        __monitor_enter(object0);
        try {
            try {
                this.cr();
                z1 = Boolean.parseBoolean(this.JQp.getProperty(s, String.valueOf(z)));
            }
            catch(NumberFormatException numberFormatException0) {
                Log.e("TTPropHelper", numberFormatException0.getMessage());
                __monitor_exit(object0);
                return z;
            }
            __monitor_exit(object0);
            return z1;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(object0);
        throw throwable0;
    }

    static boolean ReZ() [...] // 潜在的解密器

    static int SM(PjT pjT0) {
        int v = pjT0.XX;
        pjT0.XX = v - 1;
        return v;
    }

    @GuardedBy("mWriteLock")
    private void Zh(Zh pjT$Zh0, boolean z) {
        String s;
        Throwable throwable3;
        long v3;
        FileOutputStream fileOutputStream0;
        Object object0;
        boolean z2;
        long v2;
        long v1;
        long v = PjT.Zh ? System.currentTimeMillis() : 0L;
        boolean z1 = this.DWo.exists();
        if(PjT.Zh) {
            v1 = System.currentTimeMillis();
            v2 = v1;
        }
        else {
            v1 = 0L;
            v2 = 0L;
        }
        if(z1) {
            if(this.SM >= pjT$Zh0.PjT) {
                z2 = false;
            }
            else if(z) {
                z2 = true;
            }
            else {
                synchronized(this.ReZ) {
                    z2 = this.Au == pjT$Zh0.PjT;
                }
            }
            if(!z2) {
                pjT$Zh0.PjT(false, true);
                return;
            }
            boolean z3 = this.qj.exists();
            if(PjT.Zh) {
                v2 = System.currentTimeMillis();
            }
            if(z3) {
                this.DWo.delete();
            }
            else if(!this.DWo.renameTo(this.qj)) {
                Log.e("TTPropHelper", "Couldn\'t rename file " + this.DWo + " to backup file " + this.qj);
                pjT$Zh0.PjT(false, false);
                return;
            }
        }
        try {
            object0 = this.cr;
            __monitor_enter(object0);
        }
        catch(Throwable throwable0) {
            goto label_86;
        }
        try {
            fileOutputStream0 = null;
            try {
                fileOutputStream0 = new FileOutputStream(this.DWo);
            }
            catch(Exception exception0) {
                v3 = 0L;
                Log.e("TTPropHelper", "saveToLocal: ", exception0);
                pjT$Zh0.PjT(false, false);
                goto label_53;
            }
        }
        catch(Throwable throwable1) {
            throwable3 = throwable1;
            goto label_61;
        }
        try {
            v3 = PjT.Zh ? System.currentTimeMillis() : 0L;
            try {
                pjT$Zh0.Zh.store(fileOutputStream0, null);
                if(PjT.Zh) {
                    Log.d("TTPropHelper", "save: " + pjT$Zh0.Zh);
                    Log.d("TTPropHelper", "saveToLocal: save to" + this.DWo.getAbsolutePath() + "success");
                }
                goto label_67;
            }
            catch(Exception exception0) {
            }
        }
        catch(Throwable throwable2) {
            goto label_60;
        }
        try {
            Log.e("TTPropHelper", "saveToLocal: ", exception0);
            pjT$Zh0.PjT(false, false);
        }
        catch(Throwable throwable1) {
            throwable3 = throwable1;
            goto label_61;
        }
    label_53:
        if(fileOutputStream0 == null) {
            goto label_76;
        }
        else {
            try {
                fileOutputStream0.close();
                goto label_76;
            }
            catch(Throwable throwable4) {
                try {
                    s = throwable4.getMessage();
                    goto label_71;
                }
                catch(Throwable throwable5) {
                    goto label_74;
                }
            }
        label_60:
            throwable3 = throwable2;
        label_61:
            if(fileOutputStream0 != null) {
                try {
                    fileOutputStream0.close();
                }
                catch(Throwable throwable6) {
                    try {
                        Log.w("TTPropHelper", throwable6.getMessage());
                        throw throwable3;
                    }
                    catch(Throwable throwable5) {
                        goto label_74;
                    }
                }
            }
            throw throwable3;
            try {
            label_67:
                fileOutputStream0.close();
                goto label_76;
            }
            catch(Throwable throwable7) {
                try {
                    s = throwable7.getMessage();
                label_71:
                    Log.w("TTPropHelper", s);
                    goto label_76;
                }
                catch(Throwable throwable5) {
                }
            }
            try {
            label_74:
                __monitor_exit(object0);
                throw throwable5;
            label_76:
                __monitor_exit(object0);
                long v4 = PjT.Zh ? System.currentTimeMillis() : 0L;
                this.qj.delete();
                long v5 = PjT.Zh ? System.currentTimeMillis() : 0L;
                this.SM = pjT$Zh0.PjT;
                pjT$Zh0.PjT(true, true);
                if(PjT.Zh) {
                    Log.d("TTPropHelper", "write: " + (v1 - v) + "/" + (v2 - v) + "/" + (v3 - v) + "/" + (v4 - v) + "/" + (v5 - v));
                }
                return;
            }
            catch(Throwable throwable0) {
            }
        }
    label_86:
        Log.w("TTPropHelper", "writeToFile: Got exception:", throwable0);
        if(this.DWo.exists() && !this.DWo.delete()) {
            Log.e("TTPropHelper", "Couldn\'t clean up partially-written file " + this.DWo);
        }
        pjT$Zh0.PjT(false, false);
    }

    public ReZ Zh() {
        return new ReZ(this);
    }

    private void cr() {
        while(!this.cz) {
            try {
                this.ReZ.wait();
            }
            catch(InterruptedException unused_ex) {
            }
        }
    }

    static long cz(PjT pjT0) {
        long v = pjT0.Au;
        pjT0.Au = v + 1L;
        return v;
    }
}

