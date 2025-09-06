package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.XX;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.common.PjT.Zh;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.PjT;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.qla.PjT.cr;
import com.bytedance.sdk.openadsdk.qla.ReZ;
import com.bytedance.sdk.openadsdk.utils.wN;
import j..util.DesugarCollections;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import v.c;

public class xf {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile xf PjT;
    private final Zh ReZ;
    private final Context Zh;
    private final Map cr;

    private xf(Context context0) {
        this.cr = DesugarCollections.synchronizedMap(new HashMap());
        this.Zh = context0 == null ? ub.PjT() : context0.getApplicationContext();
        this.ReZ = new Zh("sp_reward_video");
    }

    public static xf PjT(Context context0) {
        if(xf.PjT == null) {
            Class class0 = xf.class;
            __monitor_enter(class0);
            try {
                if(xf.PjT == null) {
                    xf.PjT = new xf(context0);
                }
                __monitor_exit(class0);
                return xf.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return xf.PjT;
    }

    private File PjT(String s, int v) {
        return new File(CacheDirFactory.getICacheDir(v).PjT(), s);
    }

    private void PjT(boolean z, Owx owx0, long v, String s) {
        Long long0 = (Long)this.cr.remove(owx0);
        String s1 = z ? "load_video_success" : "load_video_error";
        ReZ.PjT(s1, false, new com.bytedance.sdk.openadsdk.qla.Zh() {
            final xf XX;

            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            @Nullable
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = wN.PjT(z, owx0, (long0 == null ? 0L : SystemClock.elapsedRealtime() - ((long)long0)), v, (z || s == null ? null : s));
                return cr.Zh().PjT(s1).Zh(jSONObject0.toString());
            }
        });
    }

    public PjT PjT(String s, boolean z) {
        PjT pjT2;
        if(com.bytedance.sdk.openadsdk.common.PjT.PjT()) {
            com.bytedance.sdk.openadsdk.common.PjT pjT0 = com.bytedance.sdk.openadsdk.common.PjT.PjT("sp_reward_video");
            PjT pjT1 = pjT0.PjT(s, 10500000L);
            return !z || pjT1 == null || JQp.Zh() != 2 || !pjT0.ReZ(s) ? pjT1 : null;
        }
        long v = this.ReZ.JQp(s);
        boolean z1 = this.ReZ.cz(s);
        boolean z2 = this.ReZ.Au(s);
        if(System.currentTimeMillis() - v < 10500000L && !z1 && (!z || JQp.Zh() != 2 || !z2)) {
            try {
                String s1 = this.ReZ.Zh(s);
                if(!TextUtils.isEmpty(s1)) {
                    JSONObject jSONObject0 = new JSONObject(s1);
                    if(jSONObject0.has("cypher")) {
                        jSONObject0 = ub.ReZ().PjT(jSONObject0);
                    }
                    if(jSONObject0.has("creatives")) {
                        pjT2 = PjT.ReZ(jSONObject0);
                    }
                    else {
                        Owx owx0 = com.bytedance.sdk.openadsdk.core.Zh.PjT(jSONObject0);
                        PjT pjT3 = new PjT();
                        pjT3.PjT(owx0);
                        pjT2 = pjT3;
                    }
                    if(pjT2 != null && pjT2.JQp()) {
                        Iterator iterator0 = pjT2.cr().iterator();
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            if(!this.Zh(((Owx)object0))) {
                                iterator0.remove();
                            }
                        }
                        return pjT2.JQp() ? pjT2 : null;
                    }
                }
                return null;
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    public String PjT(Owx owx0) {
        if(com.bytedance.sdk.openadsdk.common.PjT.PjT()) {
            return com.bytedance.sdk.openadsdk.common.PjT.PjT("sp_reward_video").PjT(owx0);
        }
        return owx0 == null || owx0.MWx() == null || TextUtils.isEmpty(owx0.MWx().I()) ? null : this.PjT(owx0.MWx().I(), "", owx0.hx());
    }

    public String PjT(String s, String s1, int v) {
        if(com.bytedance.sdk.openadsdk.common.PjT.PjT()) {
            return com.bytedance.sdk.openadsdk.common.PjT.PjT("sp_reward_video").PjT(s, s1, v);
        }
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        File file0 = this.PjT(s1, v);
        return file0 == null || !file0.exists() || !file0.isFile() || file0.length() <= 0L ? null : file0.getAbsolutePath();
    }

    public void PjT() {
        File file3;
        File file1;
        int v2;
        int v;
        if(com.bytedance.sdk.openadsdk.common.PjT.PjT()) {
            com.bytedance.sdk.openadsdk.common.PjT.PjT("sp_reward_video").Zh();
            return;
        }
        try {
            v = 0;
            int v1 = Build.VERSION.SDK_INT;
            boolean z = SM.XX("sp_reward_video");
            File file0 = v1 < 24 ? new File(this.Zh.getDatabasePath("1").getParentFile().getParentFile(), "shared_prefs") : new File(this.Zh.getDataDir(), "shared_prefs");
            if(file0.exists() && file0.isDirectory()) {
                File[] arr_file = file0.listFiles(new FileFilter() {
                    final xf PjT;

                    @Override
                    public boolean accept(File file0) {
                        return file0 == null ? false : file0.getName().contains("sp_reward_video");
                    }
                });
                if(arr_file != null) {
                    v2 = 0;
                    while(true) {
                    label_11:
                        if(v2 >= arr_file.length) {
                            break;
                        }
                        file1 = arr_file[v2];
                        if(z) {
                            goto label_14;
                        }
                        else {
                            goto label_16;
                        }
                        ++v2;
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        goto label_24;
        try {
        label_14:
            XX.ReZ(file1);
            ++v2;
            goto label_11;
        label_16:
            String s = file1.getName().replace(".xml", "");
            if(Build.VERSION.SDK_INT >= 24) {
                this.Zh.deleteSharedPreferences(s);
            }
            else {
                this.Zh.getSharedPreferences(s, 0).edit().clear().apply();
                XX.ReZ(file1);
            }
        }
        catch(Throwable unused_ex) {
        }
        try {
            ++v2;
            goto label_11;
        }
        catch(Throwable unused_ex) {
            try {
            label_24:
                File file2 = this.Zh.getCacheDir();
                if(file2 != null && file2.exists() && file2.isDirectory()) {
                    File[] arr_file1 = file2.listFiles(new FileFilter() {
                        final xf PjT;

                        @Override
                        public boolean accept(File file0) {
                            return file0 == null ? false : file0.getName().contains("reward_video_cache");
                        }
                    });
                    if(arr_file1 != null) {
                        while(true) {
                        label_28:
                            if(v >= arr_file1.length) {
                                break;
                            }
                            file3 = arr_file1[v];
                            goto label_30;
                        }
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
            return;
            try {
            label_30:
                XX.ReZ(file3);
            }
            catch(Throwable unused_ex) {
            }
            try {
                ++v;
                goto label_28;
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public void PjT(AdSlot adSlot0, PjT pjT0) {
        if(pjT0 != null && pjT0.cz() != null && pjT0.cz().zq()) {
            return;
        }
        if(com.bytedance.sdk.openadsdk.common.PjT.PjT()) {
            com.bytedance.sdk.openadsdk.common.PjT.PjT("sp_reward_video").PjT(adSlot0, pjT0);
            return;
        }
        if(pjT0 != null && !pjT0.DWo() && adSlot0 != null && TextUtils.isEmpty(adSlot0.getBidAdm())) {
            Owx owx0 = pjT0.cz();
            if(owx0 == null) {
                return;
            }
            if(owx0.hG() == 2) {
                return;
            }
            __monitor_enter(pjT0);
            try {
                if(!pjT0.DWo()) {
                    String s = pjT0.xs().toString();
                    this.ReZ.PjT(adSlot0, s, "");
                }
                goto label_17;
            }
            catch(Throwable unused_ex) {
                try {
                    pjT0.qj();
                label_17:
                    __monitor_exit(pjT0);
                    return;
                }
                catch(Throwable throwable0) {
                }
            }
            __monitor_exit(pjT0);
            throw throwable0;
        }
    }

    public void PjT(Owx owx0, com.bytedance.sdk.openadsdk.common.PjT.PjT pjT$PjT0) {
        if(!com.bytedance.sdk.openadsdk.core.xf.JQp.PjT.PjT()) {
            pjT$PjT0.PjT(true, null);
            return;
        }
        if(com.bytedance.sdk.openadsdk.common.PjT.PjT()) {
            com.bytedance.sdk.openadsdk.common.PjT.PjT("sp_reward_video").PjT(owx0, pjT$PjT0);
            return;
        }
        Long long0 = SystemClock.elapsedRealtime();
        this.cr.put(owx0, long0);
        if(owx0 != null && owx0.MWx() != null && !TextUtils.isEmpty(owx0.MWx().I())) {
            String s = owx0.MWx().I();
            File file0 = this.PjT("", owx0.hx());
            com.bytedance.sdk.component.XX.Zh.PjT pjT0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().cr();
            pjT0.Zh(s);
            pjT0.PjT(file0.getParent(), file0.getName());
            pjT0.PjT(new com.bytedance.sdk.component.XX.PjT.PjT() {
                final xf ReZ;

                @Override  // com.bytedance.sdk.component.XX.PjT.PjT
                public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, com.bytedance.sdk.component.XX.Zh zh0) {
                    if(zh0.cz() && zh0.JQp() != null && zh0.JQp().exists()) {
                        com.bytedance.sdk.openadsdk.common.PjT.PjT pjT$PjT0 = pjT$PjT0;
                        if(pjT$PjT0 != null) {
                            pjT$PjT0.PjT(true, null);
                        }
                        xf.this.PjT(true, owx0, ((long)zh0.PjT()), zh0.Zh());
                        return;
                    }
                    com.bytedance.sdk.openadsdk.common.PjT.PjT pjT$PjT1 = pjT$PjT0;
                    if(pjT$PjT1 != null) {
                        pjT$PjT1.PjT(false, null);
                    }
                    xf.this.PjT(false, owx0, ((long)zh0.PjT()), zh0.Zh());
                }

                @Override  // com.bytedance.sdk.component.XX.PjT.PjT
                public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, IOException iOException0) {
                    com.bytedance.sdk.openadsdk.common.PjT.PjT pjT$PjT0 = pjT$PjT0;
                    if(pjT$PjT0 != null) {
                        pjT$PjT0.PjT(false, null);
                    }
                    xf.this.PjT(false, owx0, -2L, iOException0.getMessage());
                }
            });
            return;
        }
        if(pjT$PjT0 != null) {
            pjT$PjT0.PjT(false, null);
        }
        this.PjT(false, owx0, -1L, null);
    }

    public void PjT(String s) {
        if(com.bytedance.sdk.openadsdk.common.PjT.PjT()) {
            com.bytedance.sdk.openadsdk.common.PjT.PjT("sp_reward_video").Zh(s);
            return;
        }
        this.ReZ.XX(s);
    }

    public void PjT(String s, Owx owx0) {
        if(com.bytedance.sdk.openadsdk.common.PjT.PjT()) {
            com.bytedance.sdk.openadsdk.common.PjT.PjT("sp_reward_video").PjT(s, owx0);
            return;
        }
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String s1 = this.ReZ.ReZ(s);
        String s2 = owx0 == null ? "" : owx0.ydj();
        if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2) || s1.equals(s2)) {
            this.ReZ.SM(s);
        }
    }

    private boolean Zh(Owx owx0) {
        if(owx0 != null) {
            if(cRA.ReZ(owx0)) {
                return true;
            }
            c c0 = owx0.MWx();
            return c0 != null && (Build.VERSION.SDK_INT >= 23 || !TextUtils.isEmpty(this.PjT(c0.I(), "", owx0.hx())));
        }
        return false;
    }
}

