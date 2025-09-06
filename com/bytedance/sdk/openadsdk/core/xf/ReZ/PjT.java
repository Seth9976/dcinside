package com.bytedance.sdk.openadsdk.core.xf.ReZ;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.JQp;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.XX;
import com.bytedance.sdk.component.utils.ZX;
import com.bytedance.sdk.component.utils.gK;
import com.bytedance.sdk.openadsdk.Owx.PjT.ReZ;
import com.bytedance.sdk.openadsdk.Owx.PjT.cr;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.Jo;
import j..util.DesugarCollections;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class PjT {
    public interface com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT {
    }

    static class Zh {
        long PjT;
        long ReZ;
        long Zh;
        long cr;

        private Zh() {
        }

        Zh(com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.1 pjT$10) {
        }

        public long PjT() {
            return this.Zh - this.PjT;
        }

        public Zh PjT(long v) {
            this.PjT = v;
            return this;
        }

        public Zh ReZ(long v) {
            this.ReZ = v;
            return this;
        }

        public long Zh() {
            return this.cr - this.ReZ;
        }

        public Zh Zh(long v) {
            this.Zh = v;
            return this;
        }

        public Zh cr(long v) {
            this.cr = v;
            return this;
        }
    }

    private final Map Au;
    private final AtomicBoolean JQp;
    private static volatile PjT PjT;
    private final Map ReZ;
    private final ConcurrentHashMap XX;
    private String Zh;
    private final Map cr;
    private final Set cz;

    private PjT() {
        this.ReZ = new ConcurrentHashMap();
        this.cr = new ConcurrentHashMap();
        this.JQp = new AtomicBoolean(false);
        this.cz = DesugarCollections.synchronizedSet(new HashSet());
        this.XX = new ConcurrentHashMap();
        this.Au = new ConcurrentHashMap();
    }

    private String JQp() {
        if(TextUtils.isEmpty(this.Zh)) {
            try {
                File file0 = new File(ub.PjT().getCacheDir(), "playable");
                if(!file0.exists()) {
                    file0.mkdirs();
                }
                this.Zh = file0.getAbsolutePath();
                return this.Zh;
            }
            catch(Throwable throwable0) {
            }
            RD.Zh("PlayableCache", "init root path error: " + throwable0);
        }
        return this.Zh;
    }

    // 去混淆评级： 低(30)
    private boolean JQp(File file0) {
        return file0 != null && file0.exists() && file0.isFile() && file0.canRead();
    }

    public static PjT PjT() {
        if(PjT.PjT == null) {
            Class class0 = PjT.class;
            __monitor_enter(class0);
            try {
                if(PjT.PjT == null) {
                    PjT.PjT = new PjT();
                }
                __monitor_exit(class0);
                return PjT.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return PjT.PjT;
    }

    public static File PjT(File file0) {
        if(file0 != null && file0.isDirectory()) {
            File[] arr_file = file0.listFiles();
            if(arr_file != null && arr_file.length != 0) {
                for(int v1 = 0; v1 < arr_file.length; ++v1) {
                    File file1 = arr_file[v1];
                    if(file1 != null && file1.isFile() && "index.html".equals(file1.getName())) {
                        return file0;
                    }
                }
                for(int v = 0; v < arr_file.length; ++v) {
                    File file2 = arr_file[v];
                    if(file2 != null && file2.isDirectory()) {
                        return PjT.PjT(file2);
                    }
                }
            }
        }
        return null;
    }

    private String PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        String[] arr_s = s.split("\\?");
        if(arr_s != null && arr_s.length == 2) {
            String s1 = arr_s[0];
            if(s1 != null && s1.endsWith("/")) {
                s = s.substring(0, arr_s.length - 1);
            }
            String s2 = arr_s[0];
            if(s2 != null && s2.endsWith("index.html")) {
                s = arr_s[0];
            }
        }
        return s.replace("index.html", "");
    }

    private JSONObject PjT(File file0, boolean z) {
        try {
            if(this.JQp(file0)) {
                byte[] arr_b = XX.cr(file0);
                if(arr_b != null && arr_b.length > 0) {
                    String s = TextUtils.equals(file0.getName(), "tt_open_ad_sdk_check_res.dat") ? com.bytedance.sdk.component.utils.PjT.ReZ(new String(arr_b)) : com.bytedance.sdk.component.cr.PjT.Zh(new String(arr_b), com.bytedance.sdk.openadsdk.core.PjT.Zh());
                    if(!TextUtils.isEmpty(s)) {
                        JSONObject jSONObject0 = new JSONObject(s);
                        if(z && jSONObject0.length() > 0) {
                            String s1 = file0.getParentFile().getName();
                            this.cr.put(s1, jSONObject0);
                        }
                        return jSONObject0;
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    private void PjT(com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT pjT$PjT0, boolean z) {
        Jo.PjT(new Runnable() {
            final PjT ReZ;

            @Override
            public void run() {
            }
        });
    }

    private boolean PjT(String s, String s1, File file0) {
        if(file0 != null && file0.exists()) {
            JSONObject jSONObject0 = (JSONObject)this.cr.get(s);
            if(jSONObject0 == null) {
                return true;
            }
            String s2 = jSONObject0.optString(s1);
            return s2 != null && s2.equalsIgnoreCase(JQp.PjT(file0));
        }
        return false;
    }

    public WebResourceResponse PjT(String s, String s1, String s2) {
        File file0;
        try {
            WebResourceResponse webResourceResponse0 = ReZ.PjT().PjT(s2);
            if(webResourceResponse0 != null) {
                return webResourceResponse0;
            }
            if(!this.JQp.get()) {
                return null;
            }
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) {
                goto label_6;
            }
        }
        catch(Throwable throwable0) {
            RD.PjT("PlayableCache", "playable intercept error: ", throwable0);
        }
        return null;
        try {
        label_6:
            if((s2.startsWith("http://") || s2.startsWith("https://")) && s2.contains("?")) {
                s2 = s2.split("\\?")[0];
                if(s2.endsWith("/")) {
                    s2 = s2.substring(0, s2.length() - 1);
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        try {
            String s3 = gK.PjT(ub.PjT(), s2);
            com.bytedance.sdk.openadsdk.qla.ReZ.ReZ(s3, s2);
            if(TextUtils.isEmpty(s3)) {
                return null;
            }
            String s4 = JQp.PjT(s);
            if(TextUtils.isEmpty(s4)) {
                return null;
            }
            String s5 = (String)this.Au.get(s4);
            if(TextUtils.isEmpty(s5)) {
                file0 = PjT.PjT(new File(this.cr(), s4));
                if(file0 != null && file0.exists()) {
                    String s6 = file0.getAbsolutePath();
                    this.Au.put(s4, s6);
                }
            }
            else {
                file0 = new File(s5);
            }
            if(file0 != null && file0.exists()) {
                String s7 = this.PjT(s1);
                if(TextUtils.isEmpty(s7)) {
                    return null;
                }
                String s8 = s2.replace(s7, "");
                if(TextUtils.isEmpty(s8) || s8.startsWith("https://") || s8.startsWith("http://")) {
                    return null;
                }
                File file1 = new File(file0, s8);
                if(file1.exists() && this.PjT(s4, s8, file1) && file1.getCanonicalPath().startsWith(file0.getCanonicalPath())) {
                    return new WebResourceResponse(s3, "utf-8", new FileInputStream(file1));
                }
            }
            return null;
        }
        catch(Throwable throwable0) {
        }
        RD.PjT("PlayableCache", "playable intercept error: ", throwable0);
        return null;
    }

    @SuppressLint({"[ByDesign4.2]BadDomainNameVerifier"})
    public void PjT(Owx owx0, com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT pjT$PjT0) {
        File file1;
        if(cr.PjT().Zh() && owx0 != null && cRA.cz(owx0) && owx0.ig() != null && !TextUtils.isEmpty(owx0.ig().getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.xf.ReZ.Zh.PjT(owx0, -705, "server bidding pre render");
            this.PjT(pjT$PjT0, false);
            return;
        }
        if(owx0 != null && owx0.MWx() != null && !TextUtils.isEmpty(owx0.MWx().N())) {
            String s = owx0.MWx().N();
            if(this.cz.contains(s)) {
                return;
            }
            Zh pjT$Zh0 = new Zh(null).PjT(System.currentTimeMillis());
            this.ReZ.put(owx0, pjT$Zh0);
            com.bytedance.sdk.openadsdk.core.xf.ReZ.Zh.PjT(owx0);
            String s1 = JQp.PjT(s);
            File file0 = new File(this.cr(), s1);
            String s2 = (String)this.Au.get(s1);
            if(TextUtils.isEmpty(s2)) {
                file1 = PjT.PjT(file0);
                if(file1 != null && file1.exists()) {
                    String s3 = file1.getAbsolutePath();
                    this.Au.put(s1, s3);
                }
            }
            else {
                file1 = new File(s2);
            }
            if(file1 != null && file1.exists()) {
                com.bytedance.sdk.openadsdk.core.xf.ReZ.Zh.PjT(owx0, -702, null);
                PjT.ReZ(file0);
                this.ReZ.remove(owx0);
                this.PjT(pjT$PjT0, true);
                return;
            }
            try {
                XX.ReZ(file0);
            }
            catch(Throwable unused_ex) {
            }
            this.cz.add(s);
            File file2 = new File(this.JQp(), s1 + ".zip");
            com.bytedance.sdk.component.XX.Zh.PjT pjT0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().cr();
            this.XX.put(s, pjT0);
            pjT0.Zh(s);
            pjT0.PjT(file2.getParent(), file2.getName());
            pjT0.PjT(7);
            pjT0.PjT("playable_download");
            pjT0.PjT(new com.bytedance.sdk.component.XX.PjT.PjT() {
                final PjT JQp;

                @Override  // com.bytedance.sdk.component.XX.PjT.PjT
                public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, com.bytedance.sdk.component.XX.Zh zh0) {
                    PjT.this.cz.remove(s);
                    PjT.this.XX.remove(s);
                    Zh pjT$Zh0 = (Zh)PjT.this.ReZ.remove(owx0);
                    if(pjT$Zh0 != null) {
                        pjT$Zh0.Zh(System.currentTimeMillis());
                    }
                    if(zh0.cz() && zh0.JQp() != null && zh0.JQp().exists()) {
                        Jo.Zh(new Au("downloadZip") {
                            final com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.2 ReZ;

                            @Override
                            public void run() {
                                boolean z;
                                long v1;
                                long v;
                                try {
                                    Zh pjT$Zh0 = pjT$Zh0;
                                    if(pjT$Zh0 != null) {
                                        pjT$Zh0.ReZ(System.currentTimeMillis());
                                    }
                                    ZX.PjT(zh0.JQp().getAbsolutePath(), com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.2.this.ReZ.getAbsolutePath());
                                    Zh pjT$Zh1 = pjT$Zh0;
                                    if(pjT$Zh1 != null) {
                                        pjT$Zh1.cr(System.currentTimeMillis());
                                    }
                                    Zh pjT$Zh2 = pjT$Zh0;
                                    if(pjT$Zh2 == null) {
                                        v = 0L;
                                        v1 = 0L;
                                    }
                                    else {
                                        v = pjT$Zh2.PjT();
                                        v1 = pjT$Zh0.Zh();
                                    }
                                    com.bytedance.sdk.openadsdk.core.xf.ReZ.Zh.PjT(com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.2.this.Zh, v, v1);
                                    PjT.Zh(com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.2.this.ReZ);
                                    z = true;
                                    goto label_23;
                                }
                                catch(Throwable throwable0) {
                                }
                                RD.PjT("PlayableCache", "unzip error: ", throwable0);
                                com.bytedance.sdk.openadsdk.core.xf.ReZ.Zh.PjT(com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.2.this.Zh, -704, throwable0.getMessage());
                                z = false;
                                goto label_28;
                                try {
                                label_23:
                                    File file0 = PjT.PjT(com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.2.this.ReZ);
                                    if(file0 != null && file0.exists()) {
                                        PjT.this.Au.put(com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.2.this.ReZ.getName(), file0.getAbsolutePath());
                                    }
                                    File file1 = PjT.this.cr(file0);
                                    PjT.this.PjT(file1, true);
                                }
                                catch(Throwable unused_ex) {
                                }
                                try {
                                label_28:
                                    zh0.JQp().delete();
                                }
                                catch(Throwable unused_ex) {
                                }
                                PjT.this.PjT(com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.2.this.cr, z);
                            }
                        });
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.xf.ReZ.Zh.PjT(owx0, (zh0.PjT() == 0 ? -700 : zh0.PjT()), null);
                    PjT.this.PjT(pjT$PjT0, false);
                }

                @Override  // com.bytedance.sdk.component.XX.PjT.PjT
                public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, IOException iOException0) {
                    PjT.this.cz.remove(s);
                    PjT.this.XX.remove(s);
                    PjT.this.ReZ.remove(owx0);
                    com.bytedance.sdk.openadsdk.core.xf.ReZ.Zh.PjT(owx0, -700, iOException0.getMessage());
                    PjT.this.PjT(pjT$PjT0, false);
                }
            });
            return;
        }
        com.bytedance.sdk.openadsdk.core.xf.ReZ.Zh.PjT(owx0, -701, null);
        this.PjT(pjT$PjT0, false);
    }

    public boolean PjT(Owx owx0) {
        if(!this.JQp.get()) {
            return false;
        }
        if(owx0 != null && owx0.MWx() != null && owx0.MWx().N() != null) {
            try {
                String s = JQp.PjT(owx0.MWx().N());
                if(!TextUtils.isEmpty(((String)this.Au.get(s)))) {
                    return true;
                }
            }
            catch(Throwable unused_ex) {
            }
        }
        return false;
    }

    public static void ReZ(File file0) {
        try {
            if(file0.exists() && !file0.setLastModified(System.currentTimeMillis())) {
                file0.renameTo(file0);
                file0.lastModified();
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public Map ReZ() {
        return this.Au;
    }

    public static void Zh(File file0) {
        PjT.ReZ(file0);
        try {
            SM.Zh().xE().PjT(file0);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void Zh() {
        if(!this.JQp.get()) {
            Jo.PjT(new Au("PlayableCache_init") {
                final PjT PjT;

                @Override
                public void run() {
                    try {
                        String s = PjT.this.cr();
                        if(!TextUtils.isEmpty(s)) {
                            File file0 = new File(s);
                            if(file0.exists() && file0.isDirectory()) {
                                File[] arr_file = file0.listFiles();
                                if(arr_file != null) {
                                    for(int v = 0; v < arr_file.length; ++v) {
                                        File file1 = arr_file[v];
                                        if(file1 != null) {
                                            try {
                                                File file2 = PjT.PjT(file1);
                                                if(file2 != null && file2.exists()) {
                                                    String s1 = file1.getName();
                                                    String s2 = file2.getAbsolutePath();
                                                    PjT.this.Au.put(s1, s2);
                                                }
                                                File file3 = PjT.this.cr(file2);
                                                PjT.this.PjT(file3, true);
                                            }
                                            catch(Throwable unused_ex) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    ReZ.PjT().PjT(PjT.this.Au);
                    PjT.this.JQp.set(true);
                }
            });
        }
    }

    public void Zh(Owx owx0) {
        if(owx0 != null && owx0.MWx() != null && !TextUtils.isEmpty(owx0.MWx().N()) && com.bytedance.sdk.openadsdk.RD.PjT.PjT("can_cancel_playable", false)) {
            String s = owx0.MWx().N();
            com.bytedance.sdk.component.XX.Zh.PjT pjT0 = (com.bytedance.sdk.component.XX.Zh.PjT)this.XX.get(s);
            if(pjT0 != null) {
                pjT0.Zh();
            }
        }
    }

    private File cr(File file0) {
        File file1 = new File(file0, "tt_open_ad_sdk_check_res.dat");
        return this.JQp(file1) ? file1 : new File(file0, "tt_open_ad_sdk_check_res.dat");
    }

    private String cr() {
        File file0 = new File(this.JQp(), "games");
        if(!file0.exists()) {
            file0.mkdirs();
        }
        return file0.getAbsolutePath();
    }
}

