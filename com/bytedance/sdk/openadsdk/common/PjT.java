package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.JQp;
import com.bytedance.sdk.component.utils.Sks;
import com.bytedance.sdk.component.utils.XX;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.cr.cr;
import com.bytedance.sdk.openadsdk.qla.ReZ;
import com.bytedance.sdk.openadsdk.utils.wN;
import j..util.DesugarCollections;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import v.c;

public class PjT {
    public interface com.bytedance.sdk.openadsdk.common.PjT.PjT {
        void PjT(boolean arg1, Object arg2);
    }

    public static class Zh {
        private final HashSet Au;
        String JQp;
        protected final String PjT;
        String ReZ;
        String XX;
        String Zh;
        String cr;
        String cz;

        public Zh(String s) {
            this.Au = new HashSet();
            this.Zh = "material_data";
            this.ReZ = "has_played";
            this.cr = "create_time";
            this.JQp = "in_use_process";
            this.cz = "req_id";
            this.XX = "ad_slot";
            if(TextUtils.isEmpty(s)) {
                s = "";
            }
            this.PjT = s;
        }

        public boolean Au(String s) {
            try {
                String s1 = this.PjT(s);
                String s2 = cr.Zh(s1, this.JQp, "");
                if(TextUtils.isEmpty(s2)) {
                    return false;
                }
                if(s2.equals(Sks.Zh(ub.PjT())) && !this.Au.contains(s)) {
                    cr.PjT(s1, this.JQp, "");
                    return false;
                }
            }
            catch(Throwable unused_ex) {
            }
            return true;
        }

        public long JQp(String s) {
            try {
                return cr.PjT(this.PjT(s), this.cr, 0L);
            }
            catch(Throwable unused_ex) {
                return 0L;
            }
        }

        protected String PjT(String s) {
            if(TextUtils.isEmpty(s)) {
                s = "0";
            }
            return this.PjT + "_cache_" + s;
        }

        public void PjT(AdSlot adSlot0, String s, String s1) {
            try {
                String s2 = adSlot0.getCodeId();
                String s3 = this.PjT(s2);
                cr.PjT(s3, this.ReZ, Boolean.FALSE);
                cr.PjT(s3, this.cr, System.currentTimeMillis());
                cr.PjT(s3, this.Zh, s);
                cr.PjT(s3, this.JQp, "");
                cr.PjT(s3, this.cz, s1);
                cr.PjT(s3, this.XX, adSlot0.toJsonObj().toString());
                this.Au.remove(s2);
            }
            catch(Throwable unused_ex) {
            }
        }

        public String ReZ(String s) {
            try {
                return cr.Zh(this.PjT(s), this.cz, null);
            }
            catch(Throwable unused_ex) {
                return null;
            }
        }

        public void SM(String s) {
            try {
                cr.PjT(this.PjT(s));
                this.Au.remove(s);
            }
            catch(Throwable unused_ex) {
            }
        }

        public void XX(String s) {
            try {
                String s1 = Sks.Zh(ub.PjT());
                cr.PjT(this.PjT(s), this.JQp, s1);
                this.Au.add(s);
            }
            catch(Throwable unused_ex) {
            }
        }

        public String Zh(String s) {
            try {
                return cr.Zh(this.PjT(s), this.Zh, null);
            }
            catch(Throwable unused_ex) {
                return null;
            }
        }

        public String cr(String s) {
            try {
                return cr.Zh(this.PjT(s), this.XX, null);
            }
            catch(Throwable unused_ex) {
                return null;
            }
        }

        public boolean cz(String s) {
            try {
                return cr.PjT(this.PjT(s), this.ReZ, true);
            }
            catch(Throwable unused_ex) {
                return true;
            }
        }
    }

    private final String JQp;
    private static final HashMap PjT;
    @SuppressLint({"StaticFieldLeak"})
    private final Context ReZ;
    private static final HashMap Zh;
    private final Zh cr;
    private final Map cz;

    static {
        PjT.PjT = new HashMap();
        PjT.Zh = new HashMap();
    }

    private PjT(Context context0, String s) {
        this.cz = DesugarCollections.synchronizedMap(new HashMap());
        this.ReZ = context0;
        Zh pjT$Zh0 = (Zh)PjT.Zh.get(s);
        if(pjT$Zh0 == null) {
            pjT$Zh0 = new Zh(s);
        }
        this.cr = pjT$Zh0;
        this.JQp = s;
    }

    public static PjT PjT(String s) {
        HashMap hashMap0 = PjT.PjT;
        PjT pjT0 = (PjT)hashMap0.get(s);
        if(pjT0 == null) {
            Class class0 = PjT.class;
            __monitor_enter(class0);
            try {
                PjT pjT1 = (PjT)hashMap0.get(s);
                if(pjT1 == null) {
                    pjT1 = new PjT(ub.PjT(), s);
                    hashMap0.put(s, pjT1);
                }
                __monitor_exit(class0);
                return pjT1;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return pjT0;
    }

    private File PjT(String s, int v) {
        return new File(CacheDirFactory.getICacheDir(v).PjT(), s);
    }

    public static void PjT(String s, Zh pjT$Zh0) {
        PjT.Zh.put(s, pjT$Zh0);
    }

    private void PjT(boolean z, Owx owx0, long v, String s) {
        Long long0 = (Long)this.cz.remove(owx0);
        String s1 = z ? "load_video_success" : "load_video_error";
        ReZ.PjT(s1, false, new com.bytedance.sdk.openadsdk.qla.Zh() {
            final PjT XX;

            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            @Nullable
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = wN.PjT(z, owx0, (long0 == null ? 0L : SystemClock.elapsedRealtime() - ((long)long0)), v, (z || s == null ? null : s));
                return com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().PjT(s1).Zh(jSONObject0.toString());
            }
        });
    }

    public static boolean PjT() {
        return com.bytedance.sdk.openadsdk.RD.PjT.PjT("material_cache_disk_format", 0) == 1;
    }

    public com.bytedance.sdk.openadsdk.core.model.PjT PjT(String s, long v) {
        return System.currentTimeMillis() - this.cr.JQp(s) >= v || this.cr.cz(s) ? null : this.PjT(s, true);
    }

    public com.bytedance.sdk.openadsdk.core.model.PjT PjT(String s, boolean z) {
        com.bytedance.sdk.openadsdk.core.model.PjT pjT0;
        try {
            String s1 = this.cr.Zh(s);
            if(!TextUtils.isEmpty(s1)) {
                JSONObject jSONObject0 = new JSONObject(s1);
                if(jSONObject0.has("cypher")) {
                    jSONObject0 = ub.ReZ().PjT(jSONObject0);
                }
                if(jSONObject0.has("creatives")) {
                    pjT0 = com.bytedance.sdk.openadsdk.core.model.PjT.ReZ(jSONObject0);
                }
                else {
                    Owx owx0 = com.bytedance.sdk.openadsdk.core.Zh.PjT(jSONObject0);
                    com.bytedance.sdk.openadsdk.core.model.PjT pjT1 = new com.bytedance.sdk.openadsdk.core.model.PjT();
                    pjT1.PjT(owx0);
                    pjT0 = pjT1;
                }
                if(pjT0 != null && pjT0.JQp()) {
                    if(z) {
                        Iterator iterator0 = pjT0.cr().iterator();
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            if(!this.Zh(((Owx)object0))) {
                                iterator0.remove();
                            }
                        }
                    }
                    if(pjT0.JQp()) {
                        String s2 = this.cr.cr(s);
                        if(!TextUtils.isEmpty(s2)) {
                            AdSlot adSlot0 = com.bytedance.sdk.openadsdk.core.Zh.Zh(new JSONObject(s2));
                            if(adSlot0 != null) {
                                Owx owx1 = pjT0.cz();
                                if(owx1 != null) {
                                    owx1.PjT(adSlot0);
                                }
                            }
                        }
                        return pjT0;
                    }
                }
            }
        }
        catch(JSONException unused_ex) {
        }
        return null;
    }

    // 去混淆评级： 低(30)
    public String PjT(Owx owx0) {
        return owx0 == null || owx0.MWx() == null || TextUtils.isEmpty(owx0.MWx().I()) ? null : this.PjT(owx0.MWx().I(), "", owx0.hx());
    }

    public String PjT(String s, String s1, int v) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        if(TextUtils.isEmpty(s1)) {
            s1 = JQp.PjT(s);
        }
        File file0 = this.PjT(s1, v);
        return file0 == null || !file0.exists() || !file0.isFile() || file0.length() <= 0L ? null : file0.getAbsolutePath();
    }

    public void PjT(AdSlot adSlot0, com.bytedance.sdk.openadsdk.core.model.PjT pjT0) {
        if(pjT0 != null && pjT0.cz() != null && pjT0.cz().zq()) {
            return;
        }
        if(pjT0 != null && adSlot0 != null && TextUtils.isEmpty(adSlot0.getBidAdm())) {
            Owx owx0 = pjT0.cz();
            if(owx0 == null) {
                return;
            }
            if(owx0.hG() == 2) {
                return;
            }
            try {
                this.cr.PjT(adSlot0, pjT0.fDm(), "");
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public void PjT(Owx owx0, com.bytedance.sdk.openadsdk.common.PjT.PjT pjT$PjT0) {
        Long long0 = SystemClock.elapsedRealtime();
        this.cz.put(owx0, long0);
        if(owx0.MWx() != null && !TextUtils.isEmpty(owx0.MWx().I())) {
            String s = owx0.MWx().I();
            File file0 = this.PjT("", owx0.hx());
            com.bytedance.sdk.component.XX.Zh.PjT pjT0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().cr();
            pjT0.Zh(s);
            pjT0.PjT(file0.getParent(), file0.getName());
            pjT0.PjT(new com.bytedance.sdk.component.XX.PjT.PjT() {
                final PjT ReZ;

                @Override  // com.bytedance.sdk.component.XX.PjT.PjT
                public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, com.bytedance.sdk.component.XX.Zh zh0) {
                    if(zh0.cz() && zh0.JQp() != null && zh0.JQp().exists()) {
                        com.bytedance.sdk.openadsdk.common.PjT.PjT pjT$PjT0 = pjT$PjT0;
                        if(pjT$PjT0 != null) {
                            pjT$PjT0.PjT(true, null);
                        }
                        PjT.this.PjT(true, owx0, ((long)zh0.PjT()), zh0.Zh());
                        return;
                    }
                    com.bytedance.sdk.openadsdk.common.PjT.PjT pjT$PjT1 = pjT$PjT0;
                    if(pjT$PjT1 != null) {
                        pjT$PjT1.PjT(false, null);
                    }
                    PjT.this.PjT(false, owx0, ((long)zh0.PjT()), zh0.Zh());
                }

                @Override  // com.bytedance.sdk.component.XX.PjT.PjT
                public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, IOException iOException0) {
                    com.bytedance.sdk.openadsdk.common.PjT.PjT pjT$PjT0 = pjT$PjT0;
                    if(pjT$PjT0 != null) {
                        pjT$PjT0.PjT(false, null);
                    }
                    PjT.this.PjT(false, owx0, -2L, iOException0.getMessage());
                }
            });
            return;
        }
        if(pjT$PjT0 != null) {
            pjT$PjT0.PjT(false, null);
        }
        this.PjT(false, owx0, -1L, null);
    }

    public void PjT(String s, Owx owx0) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String s1 = this.cr.ReZ(s);
        String s2 = owx0 == null ? "" : owx0.ydj();
        if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2) || s1.equals(s2)) {
            this.cr.SM(s);
        }
    }

    private String ReZ() [...] // 潜在的解密器

    public boolean ReZ(String s) {
        return this.cr.Au(s);
    }

    private boolean Zh(Owx owx0) {
        if(owx0 != null) {
            if(cRA.gK(owx0)) {
                return true;
            }
            c c0 = owx0.MWx();
            return c0 != null && (Build.VERSION.SDK_INT >= 23 || !TextUtils.isEmpty(this.PjT(c0.I(), "", owx0.hx())));
        }
        return false;
    }

    public void Zh() {
        File file1;
        int v1;
        try {
            int v = Build.VERSION.SDK_INT;
            boolean z = SM.XX(this.JQp);
            String s = z ? "files" : "shared_prefs";
            File file0 = v < 24 ? new File(this.ReZ.getDatabasePath("1").getParentFile().getParentFile(), s) : new File(this.ReZ.getDataDir(), s);
            if(file0.exists() && file0.isDirectory()) {
                File[] arr_file = file0.listFiles(new FileFilter() {
                    final PjT PjT;

                    @Override
                    public boolean accept(File file0) {
                        return file0 == null ? false : file0.getName().contains(PjT.this.JQp);
                    }
                });
                if(arr_file != null) {
                    v1 = 0;
                    while(true) {
                    label_8:
                        if(v1 >= arr_file.length) {
                            break;
                        }
                        file1 = arr_file[v1];
                        if(z) {
                            goto label_11;
                        }
                        else {
                            goto label_13;
                        }
                        ++v1;
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        goto label_21;
        try {
        label_11:
            XX.ReZ(file1);
            ++v1;
            goto label_8;
        label_13:
            String s1 = file1.getName().replace(".xml", "");
            if(Build.VERSION.SDK_INT >= 24) {
                this.ReZ.deleteSharedPreferences(s1);
            }
            else {
                this.ReZ.getSharedPreferences(s1, 0).edit().clear().apply();
                XX.ReZ(file1);
            }
        }
        catch(Throwable unused_ex) {
        }
        try {
            ++v1;
            goto label_8;
        }
        catch(Throwable unused_ex) {
            try {
            label_21:
                File file2 = new File("null/video_reward_full");
                if(file2.exists() && file2.isDirectory()) {
                    XX.ReZ(file2);
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public void Zh(String s) {
        this.cr.XX(s);
    }
}

