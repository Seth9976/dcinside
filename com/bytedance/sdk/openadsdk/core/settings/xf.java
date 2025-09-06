package com.bytedance.sdk.openadsdk.core.settings;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.Sks;
import com.bytedance.sdk.component.utils.XX;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.Jo;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class xf implements JQp {
    public interface PjT {
        void PjT();

        void Zh();
    }

    public class Zh implements com.bytedance.sdk.openadsdk.core.settings.JQp.PjT {
        final xf PjT;
        private final Object ReZ;
        private final Map Zh;

        public Zh() {
            this.Zh = new HashMap();
            this.ReZ = new Object();
        }

        @Override  // com.bytedance.sdk.openadsdk.core.settings.JQp$PjT
        public com.bytedance.sdk.openadsdk.core.settings.JQp.PjT PjT(String s) {
            synchronized(this.ReZ) {
                this.Zh.put(s, this);
                return this;
            }
        }

        @Override  // com.bytedance.sdk.openadsdk.core.settings.JQp$PjT
        public com.bytedance.sdk.openadsdk.core.settings.JQp.PjT PjT(String s, float f) {
            synchronized(this.ReZ) {
                this.Zh.put(s, f);
                return this;
            }
        }

        @Override  // com.bytedance.sdk.openadsdk.core.settings.JQp$PjT
        public com.bytedance.sdk.openadsdk.core.settings.JQp.PjT PjT(String s, int v) {
            synchronized(this.ReZ) {
                this.Zh.put(s, v);
                return this;
            }
        }

        @Override  // com.bytedance.sdk.openadsdk.core.settings.JQp$PjT
        public com.bytedance.sdk.openadsdk.core.settings.JQp.PjT PjT(String s, long v) {
            synchronized(this.ReZ) {
                this.Zh.put(s, v);
                return this;
            }
        }

        @Override  // com.bytedance.sdk.openadsdk.core.settings.JQp$PjT
        public com.bytedance.sdk.openadsdk.core.settings.JQp.PjT PjT(String s, String s1) {
            synchronized(this.ReZ) {
                this.Zh.put(s, s1);
                return this;
            }
        }

        @Override  // com.bytedance.sdk.openadsdk.core.settings.JQp$PjT
        public com.bytedance.sdk.openadsdk.core.settings.JQp.PjT PjT(String s, boolean z) {
            synchronized(this.ReZ) {
                this.Zh.put(s, Boolean.valueOf(z));
                return this;
            }
        }

        @Override  // com.bytedance.sdk.openadsdk.core.settings.JQp$PjT
        public void PjT() {
            Properties properties0 = new Properties();
            Object object0 = this.ReZ;
            __monitor_enter(object0);
            try {
                properties0.putAll(xf.this.Au);
                boolean z = false;
                for(Object object1: this.Zh.entrySet()) {
                    String s = (String)((Map.Entry)object1).getKey();
                    Object object2 = ((Map.Entry)object1).getValue();
                    if(object2 == this || object2 == null) {
                        if(!properties0.containsKey(s)) {
                            continue;
                        }
                        properties0.remove(s);
                    }
                    else {
                        if(properties0.containsKey(s)) {
                            Object object3 = properties0.get(s);
                            if(object3 == null || !object3.equals(object2)) {
                                goto label_14;
                            }
                            continue;
                        }
                    label_14:
                        properties0.put(s, String.valueOf(object2));
                    }
                    z = true;
                }
                this.Zh.clear();
                if(z) {
                    xf.this.PjT(properties0);
                    xf.this.Au = properties0;
                    xf.this.ReZ.clear();
                }
                __monitor_exit(object0);
                return;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(object0);
            throw throwable0;
        }
    }

    private Properties Au;
    private PjT DWo;
    private final Object JQp;
    private final ConcurrentHashMap ReZ;
    private volatile boolean SM;
    private final String XX;
    private final Object cr;
    private final CountDownLatch cz;

    public xf(String s, PjT xf$PjT0) {
        this.ReZ = new ConcurrentHashMap();
        this.cr = new Object();
        this.JQp = new Object();
        this.cz = new CountDownLatch(1);
        this.Au = new Properties();
        this.SM = false;
        this.XX = s;
        this.DWo = xf$PjT0;
        Jo.PjT(new Au("SetL_" + s) {
            final xf PjT;

            @Override
            public void run() {
                xf.this.PjT(false);
            }
        });
    }

    private void JQp() {
        if(!this.SM) {
            try {
                SystemClock.elapsedRealtime();
                int v = Jo.cz() ? 4 : 8;
                this.cz.await(((long)v), TimeUnit.SECONDS);
            }
            catch(InterruptedException interruptedException0) {
                RD.PjT("SdkSettings.Prop", "awaitLoadedLocked: ", interruptedException0);
            }
        }
    }

    private void PjT(Properties properties0) {
        synchronized(this.JQp) {
            File file0 = this.cz();
            FileOutputStream fileOutputStream0 = null;
            try {
                try {
                    fileOutputStream0 = new FileOutputStream(file0);
                    properties0.store(fileOutputStream0, null);
                    file0.getAbsolutePath();
                }
                catch(Exception exception0) {
                    RD.PjT("SdkSettings.Prop", "saveToLocal: ", exception0);
                    if(fileOutputStream0 != null) {
                        goto label_18;
                    }
                    goto label_19;
                }
            }
            catch(Throwable throwable0) {
                if(fileOutputStream0 != null) {
                    com.bytedance.sdk.openadsdk.utils.xf.PjT(fileOutputStream0);
                }
                throw throwable0;
            }
        label_18:
            com.bytedance.sdk.openadsdk.utils.xf.PjT(fileOutputStream0);
        }
    label_19:
        xs.kWj();
    }

    public float PjT(String s, float f) {
        if(s != null && !s.isEmpty()) {
            this.JQp();
            try {
                return Float.parseFloat(this.Au.getProperty(s, String.valueOf(f)));
            }
            catch(NumberFormatException numberFormatException0) {
                RD.PjT("SdkSettings.Prop", "", numberFormatException0);
            }
        }
        return f;
    }

    public int PjT(String s, int v) {
        if(s != null && !s.isEmpty()) {
            this.JQp();
            try {
                return Integer.parseInt(this.Au.getProperty(s, String.valueOf(v)));
            }
            catch(NumberFormatException numberFormatException0) {
                RD.PjT("SdkSettings.Prop", "", numberFormatException0);
            }
        }
        return v;
    }

    public long PjT(String s, long v) {
        if(s != null && !s.isEmpty()) {
            this.JQp();
            try {
                return Long.parseLong(this.Au.getProperty(s, String.valueOf(v)));
            }
            catch(NumberFormatException numberFormatException0) {
                RD.PjT("SdkSettings.Prop", "", numberFormatException0);
            }
        }
        return v;
    }

    public com.bytedance.sdk.openadsdk.core.settings.JQp.PjT PjT() {
        return new Zh(this);
    }

    public Object PjT(String s, Object object0, com.bytedance.sdk.openadsdk.core.settings.JQp.Zh jQp$Zh0) {
        if(s != null && !s.isEmpty()) {
            if(this.ReZ.containsKey(s)) {
                try {
                    return this.ReZ.get(s);
                }
                catch(Exception exception0) {
                    RD.PjT("SdkSettings.Prop", "", exception0);
                    return object0;
                }
            }
            this.JQp();
            String s1 = this.Au.getProperty(s, null);
            if(s1 == null) {
                return object0;
            }
            if(jQp$Zh0 != null) {
                Object object1 = jQp$Zh0.Zh(s1);
                if(object1 != null) {
                    this.ReZ.put(s, object1);
                    return object1;
                }
            }
        }
        return object0;
    }

    public String PjT(String s, String s1) {
        if(s != null && !s.isEmpty()) {
            this.JQp();
            return this.Au.getProperty(s, s1);
        }
        return s1;
    }

    public void PjT(boolean z) {
        Object object1;
        FileInputStream fileInputStream0;
        Properties properties0;
        File file0;
        synchronized(this.cr) {
            if(this.SM && !z) {
                return;
            }
            file0 = this.cz();
            if(file0.exists()) {
                properties0 = new Properties();
                fileInputStream0 = null;
                goto label_9;
            }
            else {
                goto label_40;
            }
            goto label_57;
        }
        try {
        label_9:
            fileInputStream0 = new FileInputStream(file0);
            properties0.load(fileInputStream0);
            new StringBuilder("items from ").append(file0.getAbsolutePath());
            if(!properties0.isEmpty()) {
                this.Au = properties0;
                this.ReZ.clear();
            }
            goto label_36;
        }
        catch(OutOfMemoryError unused_ex) {
            try {
                XX.ReZ(file0);
            }
            catch(Throwable throwable2) {
                try {
                    RD.PjT("SdkSettings.Prop", "delete: ", throwable2);
                }
                catch(Throwable throwable3) {
                    goto label_28;
                }
            }
            if(fileInputStream0 != null) {
                com.bytedance.sdk.openadsdk.utils.xf.PjT(fileInputStream0);
            }
            object1 = this.cr;
            goto label_38;
        }
        catch(Throwable throwable1) {
            try {
                RD.PjT("SdkSettings.Prop", "reload: ", throwable1);
                goto label_32;
            }
            catch(Throwable throwable3) {
            }
        }
        try {
        label_28:
            if(fileInputStream0 != null) {
                com.bytedance.sdk.openadsdk.utils.xf.PjT(fileInputStream0);
            }
            this.cr.notifyAll();
            throw throwable3;
        label_32:
            if(fileInputStream0 != null) {
                com.bytedance.sdk.openadsdk.utils.xf.PjT(fileInputStream0);
            }
            object1 = this.cr;
            goto label_38;
        label_36:
            com.bytedance.sdk.openadsdk.utils.xf.PjT(fileInputStream0);
            object1 = this.cr;
        label_38:
            object1.notifyAll();
            goto label_57;
        label_40:
            if(Sks.PjT(ub.PjT()) && "tt_sdk_settings.prop".equals(this.XX)) {
                try {
                    boolean z1 = false;
                    SharedPreferences sharedPreferences0 = ub.PjT().getSharedPreferences("tt_sdk_settings", 0);
                    if(!sharedPreferences0.getAll().isEmpty()) {
                        com.bytedance.sdk.openadsdk.core.settings.JQp.PjT jQp$PjT0 = this.PjT();
                        for(Object object2: sharedPreferences0.getAll().entrySet()) {
                            String s = (String)((Map.Entry)object2).getKey();
                            Object object3 = ((Map.Entry)object2).getValue();
                            if(s != null && !s.isEmpty() && object3 != null) {
                                jQp$PjT0.PjT(s, object3.toString());
                                z1 = true;
                            }
                        }
                        if(z1) {
                            jQp$PjT0.PjT();
                        }
                        sharedPreferences0.edit().clear().commit();
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        label_57:
            if(!this.SM) {
                PjT xf$PjT0 = this.DWo;
                if(xf$PjT0 != null) {
                    xf$PjT0.PjT();
                }
            }
            this.SM = true;
            this.cz.countDown();
            return;
        }
        catch(Throwable throwable0) {
        }
        throw throwable0;
    }

    public boolean PjT(String s, boolean z) {
        if(s != null && !s.isEmpty()) {
            this.JQp();
            try {
                return Boolean.parseBoolean(this.Au.getProperty(s, String.valueOf(z)));
            }
            catch(Exception exception0) {
                RD.PjT("SdkSettings.Prop", "", exception0);
            }
        }
        return z;
    }

    public void ReZ() {
        File file0 = this.cz();
        if(file0.exists()) {
            file0.delete();
        }
    }

    public boolean Zh() {
        return this.SM;
    }

    protected void cr() {
        PjT xf$PjT0 = this.DWo;
        if(xf$PjT0 != null) {
            xf$PjT0.Zh();
        }
    }

    private File cz() {
        return new File(ub.PjT().getFilesDir(), this.XX);
    }
}

