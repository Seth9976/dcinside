package com.bytedance.sdk.openadsdk.Owx.PjT;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.ZX;
import com.bytedance.sdk.component.utils.gK;
import com.bytedance.sdk.component.utils.xE;
import com.bytedance.sdk.openadsdk.Au.cr;
import com.bytedance.sdk.openadsdk.Owx.Zh.PjT;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.settings.SM;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.gK.Zh;
import com.bytedance.sdk.openadsdk.utils.Jo;
import j..util.DesugarCollections;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReZ {
    private final Set JQp;
    private static volatile ReZ PjT;
    private String ReZ;
    private String Zh;
    private String cr;

    public ReZ() {
        this.JQp = DesugarCollections.synchronizedSet(new HashSet());
    }

    private String JQp() {
        if(TextUtils.isEmpty(this.ReZ)) {
            String s = this.cr() + "/" + "common";
            File file0 = new File(s);
            if(!file0.exists()) {
                file0.mkdirs();
            }
            this.ReZ = s;
        }
        return this.ReZ;
    }

    public static ReZ PjT() {
        if(ReZ.PjT == null) {
            Class class0 = ReZ.class;
            __monitor_enter(class0);
            try {
                if(ReZ.PjT == null) {
                    ReZ.PjT = new ReZ();
                }
                __monitor_exit(class0);
                return ReZ.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return ReZ.PjT;
    }

    private void PjT(PjT pjT0, @Nullable PjT pjT1, int v) {
        synchronized(this) {
            List list0 = null;
            this.PjT(pjT0.Zh(), (pjT1 == null ? null : pjT1.Zh()), 1, v);
            List list1 = pjT0.ReZ();
            if(pjT1 != null) {
                list0 = pjT1.ReZ();
            }
            this.PjT(list1, list0, 2, v);
        }
    }

    private void PjT(String s, String s1, String s2, int v, File file0, boolean z) {
        String s3;
        if(this.JQp.contains(s)) {
            return;
        }
        if(v == 2) {
            s3 = s2 + ".zip";
        }
        else {
            s3 = z ? "tmp" + s2 : s2;
        }
        this.JQp.add(s);
        com.bytedance.sdk.component.XX.Zh.PjT pjT0 = Zh.PjT().Zh().cr();
        pjT0.Zh(s);
        pjT0.PjT(s1, s3);
        com.bytedance.sdk.component.XX.Zh zh0 = pjT0.PjT();
        this.JQp.remove(s);
        if(zh0 == null || !zh0.cz() || zh0.JQp() == null || !zh0.JQp().exists()) {
            File file1 = new File(s1 + "/" + s2 + ".tmp");
            if(file1.exists()) {
                try {
                    file1.delete();
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        else {
            if(v == 2) {
                Jo.Zh(new Au("downloadZip") {
                    final ReZ Au;

                    @Override
                    public void run() {
                        try {
                            if(z) {
                                file0.delete();
                            }
                            String s = s1 + "/" + s2;
                            ZX.PjT(zh0.JQp().getAbsolutePath(), s);
                            File file0 = new File(s);
                            File file1 = com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT(file0);
                            if(file1 != null && file1.exists()) {
                                com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().ReZ().put(file0.getName(), file1.getAbsolutePath());
                            }
                            com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.Zh(file0);
                            goto label_12;
                        }
                        catch(Throwable throwable0) {
                        }
                        RD.Zh("PlayableResManager", new Object[]{"unzip error: ", throwable0, "tp=", 2, ", url=", s});
                        try {
                        label_12:
                            zh0.JQp().delete();
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                });
                return;
            }
            if(z) {
                file0.delete();
                zh0.JQp().renameTo(file0);
            }
        }
    }

    private void PjT(@Nullable List list0, @Nullable List list1, int v, int v1) {
        if(list0 != null && !list0.isEmpty()) {
            String s = v == 1 ? this.JQp() : this.cz();
            for(Object object0: list0) {
                com.bytedance.sdk.openadsdk.Owx.Zh.PjT.PjT pjT$PjT0 = (com.bytedance.sdk.openadsdk.Owx.Zh.PjT.PjT)object0;
                String s1 = pjT$PjT0.PjT();
                String s2 = xE.PjT(s1);
                if(!TextUtils.isEmpty(s2)) {
                    if(v == 1) {
                        s2 = s2 + ReZ.ReZ(s1);
                    }
                    File file0 = new File(s, s2);
                    boolean z = file0.exists();
                    if(v1 != 1) {
                        if(!z) {
                            goto label_18;
                        }
                        continue;
                    }
                    else if(z && list1 != null && list1.contains(pjT$PjT0)) {
                        com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.ReZ(file0);
                        continue;
                    }
                label_18:
                    this.PjT(s1, s, s2, v, file0, z);
                }
            }
        }
    }

    public WebResourceResponse PjT(String s) {
        if(SM.PjT() && com.bytedance.sdk.openadsdk.RD.PjT.PjT("plb_res_enable", 0) == 1) {
            String s1 = xE.PjT(s);
            if(TextUtils.isEmpty(s1)) {
                return null;
            }
            File file0 = new File(this.JQp(), s1 + ReZ.ReZ(s));
            if(file0.exists()) {
                try {
                    return new WebResourceResponse(gK.PjT(ub.PjT(), s), "UTF-8", new FileInputStream(file0));
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return null;
    }

    public void PjT(Map map0) {
        if(SM.PjT() && com.bytedance.sdk.openadsdk.RD.PjT.PjT("plb_res_enable", 0) == 1) {
            String s = this.cz();
            if(!TextUtils.isEmpty(s)) {
                File file0 = new File(s);
                if(file0.exists() && file0.isDirectory()) {
                    File[] arr_file = file0.listFiles();
                    if(arr_file != null) {
                        for(int v = 0; v < arr_file.length; ++v) {
                            File file1 = arr_file[v];
                            if(file1 != null) {
                                try {
                                    File file2 = com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT(file1);
                                    if(file2 != null && file2.exists()) {
                                        map0.put(file1.getName(), file2.getAbsolutePath());
                                    }
                                }
                                catch(Throwable unused_ex) {
                                }
                            }
                        }
                    }
                }
            }
            int v1 = com.bytedance.sdk.openadsdk.RD.PjT.PjT("plb_res_delay_fetch_time", 0);
            if(v1 <= 0) {
                this.ReZ();
                return;
            }
            fDm.Zh().postDelayed(() -> {
                Jo.PjT(new Au("pag_plb_res_check") {
                    final ReZ PjT;

                    @Override
                    public void run() {
                        PjT pjT0 = PjT.Zh("");
                        if(pjT0 != null) {
                            ReZ.this.PjT(pjT0, null, 0);
                        }
                    }
                });
            }, ((long)v1));
        }

        class com.bytedance.sdk.openadsdk.Owx.PjT.ReZ.1 implements Runnable {
            final ReZ PjT;

            @Override
            public void run() {
                ReZ.this.ReZ();
            }
        }

    }

    private static String ReZ(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        int v = s.indexOf("?");
        if(v != -1) {
            s = s.substring(0, v);
        }
        int v1 = s.lastIndexOf(".");
        return v1 == -1 ? "" : "." + s.substring(v1 + 1);
    }

    // 检测为 Lambda 实现
    private void ReZ() [...]

    private void Zh(String s) {
        Jo.PjT(new Au("pag_plb_update_config") {
            final ReZ Zh;

            @Override
            public void run() {
                com.bytedance.sdk.component.XX.Zh.Zh zh0 = Zh.PjT().Zh().ReZ();
                try {
                    zh0.Zh(cr.PjT(zh0, s));
                    com.bytedance.sdk.component.XX.Zh zh1 = zh0.PjT();
                    if(zh1 != null && zh1.cz()) {
                        String s = zh1.cr();
                        PjT pjT0 = PjT.Zh(s);
                        com.bytedance.sdk.openadsdk.multipro.cr.cr.PjT("pag_plb_config", "last_update_time", System.currentTimeMillis());
                        if(pjT0 != null) {
                            PjT pjT1 = PjT.Zh("");
                            if(pjT1 == null || !pjT0.PjT().equals(pjT1.PjT())) {
                                com.bytedance.sdk.openadsdk.multipro.cr.cr.PjT("pag_plb_config", "model", s);
                                ReZ.this.PjT(pjT0, pjT1, 1);
                            }
                        }
                    }
                    return;
                }
                catch(Exception exception0) {
                }
                RD.Zh("PlayableResManager", exception0.getMessage());
            }
        });
    }

    public void Zh() {
        if(SM.PjT() && com.bytedance.sdk.openadsdk.RD.PjT.PjT("plb_res_enable", 0) == 1) {
            com.bytedance.sdk.openadsdk.multipro.cr.cr.PjT("pag_plb_config", "last_update_time", 0L);
            long v = (long)com.bytedance.sdk.openadsdk.RD.PjT.PjT("plb_res_fetch_interval", 3600000);
        }

        class com.bytedance.sdk.openadsdk.Owx.PjT.ReZ.3 implements Runnable {
            final ReZ Zh;

            com.bytedance.sdk.openadsdk.Owx.PjT.ReZ.3(String s) {
            }

            @Override
            public void run() {
                ReZ.this.Zh(this.PjT);
            }
        }

    }

    private String cr() {
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
            RD.Zh("PlayableResManager", "init root path error: " + throwable0);
        }
        return this.Zh;
    }

    private String cz() {
        if(TextUtils.isEmpty(this.cr)) {
            String s = this.cr() + "/" + "pregames";
            File file0 = new File(s);
            if(!file0.exists()) {
                file0.mkdirs();
            }
            this.cr = s;
        }
        return this.cr;
    }
}

