package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.JQp.qj;
import com.bytedance.sdk.component.JQp.xE;
import com.bytedance.sdk.component.utils.JQp;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.XX;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.ltE;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.iZZ;
import com.bytedance.sdk.openadsdk.core.model.tT;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.cr.cr;
import com.bytedance.sdk.openadsdk.utils.Co;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import t.a.a;
import v.b;

public class cz {
    class PjT extends Au {
        final cz PjT;
        private final com.bytedance.sdk.openadsdk.component.JQp.PjT Zh;

        public PjT(com.bytedance.sdk.openadsdk.component.JQp.PjT pjT0) {
            super("App Open Ad Write Cache");
            this.Zh = pjT0;
        }

        @Override
        public void run() {
            try {
                if(com.bytedance.sdk.openadsdk.common.PjT.PjT()) {
                    com.bytedance.sdk.openadsdk.common.PjT.PjT("tt_openad_materialMeta").PjT(this.Zh.Zh().ig(), this.Zh.ReZ());
                    return;
                }
                String s = com.bytedance.sdk.component.utils.PjT.PjT(this.Zh.Zh().dDm()).toString();
                cr.PjT("tt_openad_materialMeta", "material" + this.Zh.PjT(), s);
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    interface ReZ {
        void PjT();

        void PjT(int arg1, String arg2);
    }

    public interface Zh {
        void PjT();

        void PjT(@Nullable com.bytedance.sdk.openadsdk.gK.PjT.Zh arg1);
    }

    public interface com.bytedance.sdk.openadsdk.component.cz.cr {
        void PjT(Bitmap arg1);
    }

    private final ltE JQp;
    private static String PjT = "/openad_image_cache";
    private static volatile cz ReZ = null;
    private final Map XX;
    private static String Zh = "openad_image_cache";
    private final com.bytedance.sdk.openadsdk.Zh.Zh cr;
    private final Context cz;

    static {
    }

    private cz(Context context0) {
        this.XX = new ConcurrentHashMap();
        this.cz = context0 == null ? ub.PjT() : context0.getApplicationContext();
        this.cr = new com.bytedance.sdk.openadsdk.Zh.Zh(10, 8, true);
        this.JQp = ub.ReZ();
        com.bytedance.sdk.openadsdk.common.PjT.PjT("tt_openad_materialMeta", new com.bytedance.sdk.openadsdk.common.PjT.Zh("tt_openad_materialMeta") {
            final cz Au;

            @Override  // com.bytedance.sdk.openadsdk.common.PjT$Zh
            protected String PjT(String s) {
                return "tt_openad_materialMeta";
            }

            @Override  // com.bytedance.sdk.openadsdk.common.PjT$Zh
            public void PjT(AdSlot adSlot0, String s, String s1) {
                String s2 = adSlot0.getCodeId();
                cr.PjT("tt_openad_materialMeta", "material" + s2, s);
                cr.PjT("tt_openad_materialMeta", "ad_slot" + s2, adSlot0.toJsonObj().toString());
            }

            @Override  // com.bytedance.sdk.openadsdk.common.PjT$Zh
            public String Zh(String s) {
                return cr.Zh("tt_openad_materialMeta", "material" + s, null);
            }

            @Override  // com.bytedance.sdk.openadsdk.common.PjT$Zh
            public String cr(String s) {
                return cr.Zh("tt_openad_materialMeta", "ad_slot" + s, null);
            }
        });
    }

    @Nullable
    public Owx JQp(int v) {
        Owx owx0;
        if(com.bytedance.sdk.openadsdk.common.PjT.PjT()) {
            com.bytedance.sdk.openadsdk.core.model.PjT pjT0 = com.bytedance.sdk.openadsdk.common.PjT.PjT("tt_openad_materialMeta").PjT(String.valueOf(v), false);
            owx0 = pjT0 == null ? null : pjT0.cz();
        }
        else {
            owx0 = this.cz(v);
        }
        long v1 = cr.PjT("tt_openad", "material_expiration_time" + v, -1L);
        if(System.currentTimeMillis() / 1000L < v1 && owx0 != null) {
            return owx0;
        }
        if(owx0 != null || v1 != -1L) {
            this.XX(v);
            if(owx0 != null) {
                com.bytedance.sdk.openadsdk.component.cr.PjT.PjT(owx0);
            }
        }
        return null;
    }

    public static cz PjT(Context context0) {
        if(cz.ReZ == null) {
            Class class0 = cz.class;
            __monitor_enter(class0);
            try {
                if(cz.ReZ == null) {
                    cz.ReZ = new cz(context0);
                }
                __monitor_exit(class0);
                return cz.ReZ;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return cz.ReZ;
    }

    private void PjT(@NonNull Owx owx0, AdSlot adSlot0, iZZ iZZ0, com.bytedance.sdk.openadsdk.core.model.PjT pjT0) {
        this.PjT(owx0, adSlot0, iZZ0, new ReZ() {
            final cz cz;

            @Override  // com.bytedance.sdk.openadsdk.component.cz$ReZ
            public void PjT() {
                com.bytedance.sdk.openadsdk.component.JQp.PjT pjT0 = new com.bytedance.sdk.openadsdk.component.JQp.PjT(owx0.joj(), owx0, pjT0);
                cz.this.PjT(pjT0);
                com.bytedance.sdk.openadsdk.component.cr.PjT.PjT(pjT0.Zh(), 1, iZZ0);
                cz.this.Zh(adSlot0);
            }

            @Override  // com.bytedance.sdk.openadsdk.component.cz$ReZ
            public void PjT(int v, String s) {
                cz.this.Zh(adSlot0);
            }
        });
    }

    public static void PjT(Owx owx0, com.bytedance.sdk.openadsdk.component.cz.cr cz$cr0) {
        cz.PjT(owx0, cz$cr0, 0);
    }

    public static void PjT(Owx owx0, com.bytedance.sdk.openadsdk.component.cz.cr cz$cr0, int v) {
        String s = owx0.MWx().c();
        if(TextUtils.isEmpty(s)) {
            return;
        }
        com.bytedance.sdk.openadsdk.SM.cr.PjT(s).PjT(owx0.MWx().o()).Zh(owx0.MWx().w()).JQp(qZS.JQp(ub.PjT())).cr(qZS.ReZ(ub.PjT())).ReZ(2).PjT(new com.bytedance.sdk.component.JQp.Au() {
            @Override  // com.bytedance.sdk.component.JQp.Au
            public Bitmap PjT(Bitmap bitmap0) {
                return v > 0 ? com.bytedance.sdk.component.adexpress.cr.PjT.PjT(ub.PjT(), bitmap0, v) : bitmap0;
            }
        }).PjT(new com.bytedance.sdk.openadsdk.SM.Zh(owx0, s, new xE() {
            @Override  // com.bytedance.sdk.component.JQp.xE
            public void PjT(int v, String s, @Nullable Throwable throwable0) {
            }

            @Override  // com.bytedance.sdk.component.JQp.xE
            public void PjT(qj qj0) {
                if(qj0 != null && qj0.Zh() != null && qj0.ReZ() != null) {
                    com.bytedance.sdk.openadsdk.component.cz.cr cz$cr0 = cz$cr0;
                    if(cz$cr0 != null) {
                        cz$cr0.PjT(((Bitmap)qj0.Zh()));
                    }
                }
            }
        }));
    }

    // 去混淆评级： 低(22)
    @Nullable
    public String PjT(Owx owx0) {
        if(owx0 != null && owx0.MWx() != null && !TextUtils.isEmpty(owx0.MWx().I())) {
            File file0 = com.bytedance.sdk.openadsdk.component.XX.PjT.PjT(JQp.PjT(owx0.MWx().I()));
            return !file0.exists() || !file0.isFile() ? null : file0.getAbsolutePath();
        }
        return null;
    }

    public void PjT() {
        File file1;
        int v;
        try {
            cr.PjT("tt_openad_materialMeta");
            cr.PjT("tt_openad");
        }
        catch(Throwable unused_ex) {
        }
        try {
            File file0 = this.cz.getCacheDir();
            if(file0 != null && file0.exists() && file0.isDirectory()) {
                File[] arr_file = file0.listFiles(new FileFilter() {
                    final cz PjT;

                    @Override
                    public boolean accept(File file0) {
                        if(file0 != null) {
                            String s = file0.getName();
                            return s.contains("openad_image_cache") || s.contains("openad_video_cache");
                        }
                        return false;
                    }
                });
                if(arr_file != null) {
                    v = 0;
                    while(true) {
                    label_7:
                        if(v >= arr_file.length) {
                            break;
                        }
                        file1 = arr_file[v];
                        goto label_9;
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return;
        try {
        label_9:
            XX.ReZ(file1);
        }
        catch(Throwable unused_ex) {
        }
        try {
            ++v;
            goto label_7;
        }
        catch(Throwable unused_ex) {
        }
    }

    public void PjT(int v) {
        cr.PjT("tt_openad", "video_has_cached" + v, Boolean.TRUE);
    }

    public void PjT(AdSlot adSlot0) {
        if(adSlot0 != null && TextUtils.isEmpty(adSlot0.getBidAdm())) {
            AtomicInteger atomicInteger0 = (AtomicInteger)this.XX.get(adSlot0.getCodeId());
            if(atomicInteger0 == null) {
                atomicInteger0 = new AtomicInteger(0);
            }
            if(atomicInteger0.get() + this.ReZ(adSlot0) > 0) {
                return;
            }
            atomicInteger0.incrementAndGet();
            this.XX.put(adSlot0.getCodeId(), atomicInteger0);
            iZZ iZZ0 = new iZZ();
            iZZ0.PjT(Co.Zh());
            tT tT0 = new tT();
            tT0.DWo = iZZ0;
            tT0.cr = 2;
            tT0.Au = 2;
            com.bytedance.sdk.openadsdk.component.cz.4 cz$40 = new com.bytedance.sdk.openadsdk.core.ltE.PjT() {
                final cz ReZ;

                @Override  // com.bytedance.sdk.openadsdk.core.ltE$PjT
                public void PjT(int v, String s) {
                    cz.this.Zh(adSlot0);
                }

                @Override  // com.bytedance.sdk.openadsdk.core.ltE$PjT
                public void PjT(com.bytedance.sdk.openadsdk.core.model.PjT pjT0, com.bytedance.sdk.openadsdk.core.model.ReZ reZ0) {
                    if(pjT0 != null && pjT0.cr() != null && pjT0.cr().size() != 0) {
                        Owx owx0 = (Owx)pjT0.cr().get(0);
                        if(owx0 != null && owx0.Pv()) {
                            com.bytedance.sdk.openadsdk.component.JQp.PjT pjT1 = new com.bytedance.sdk.openadsdk.component.JQp.PjT(owx0.joj(), owx0, pjT0);
                            cz.this.PjT(pjT1);
                            com.bytedance.sdk.openadsdk.component.cr.PjT.PjT(pjT1.Zh(), 1, iZZ0);
                            cz.this.Zh(adSlot0);
                            return;
                        }
                        if(Owx.JQp(owx0)) {
                            cz.this.PjT(owx0, adSlot0, iZZ0, pjT0);
                            return;
                        }
                        cz.this.Zh(owx0, adSlot0, iZZ0, pjT0);
                        return;
                    }
                    reZ0.PjT(-3);
                    com.bytedance.sdk.openadsdk.core.model.ReZ.PjT(reZ0);
                }
            };
            this.JQp.PjT(adSlot0, tT0, 3, cz$40);
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.component.JQp.PjT pjT0) {
        if(pjT0.Zh() != null && !Owx.cz(pjT0.Zh()) && !pjT0.Zh().zq()) {
            cr.PjT("tt_openad", "material_expiration_time" + pjT0.PjT(), pjT0.Zh().UR());
            this.Zh(pjT0);
        }
    }

    public void PjT(@NonNull Owx owx0, AdSlot adSlot0, iZZ iZZ0, ReZ cz$ReZ0) {
        Co co0 = Co.Zh();
        int v = owx0.joj();
        File file0 = com.bytedance.sdk.openadsdk.component.XX.PjT.PjT(JQp.PjT(owx0.MWx().I()));
        if(file0.exists()) {
            com.bytedance.sdk.openadsdk.component.XX.PjT.PjT(file0);
            this.PjT(v);
            long v1 = co0.cr();
            if(iZZ0 != null) {
                iZZ0.PjT(v1);
                iZZ0.PjT(1);
            }
            cz$ReZ0.PjT();
            cz.PjT(owx0, null);
            return;
        }
        if(ub.cr().yIW(String.valueOf(v)) && !com.bytedance.sdk.component.utils.ltE.cr(ub.PjT())) {
            cz$ReZ0.PjT(100, "OnlyWifi");
            return;
        }
        com.bytedance.sdk.openadsdk.core.xf.PjT.Zh zh0 = Owx.PjT(file0.getParent(), owx0);
        zh0.PjT("material_meta", owx0);
        zh0.PjT("ad_slot", adSlot0);
        com.bytedance.sdk.openadsdk.core.xf.JQp.PjT.PjT(zh0, new a() {
            final cz XX;

            @Override  // t.a$a
            public void PjT(b b0, int v) {
                cz.this.PjT(v);
                long v1 = co0.cr();
                com.bytedance.sdk.openadsdk.component.cr.PjT.Zh(owx0, v1, true);
                iZZ iZZ0 = iZZ0;
                if(iZZ0 != null) {
                    iZZ0.PjT(v1);
                    iZZ0.PjT(2);
                }
                cz$ReZ0.PjT();
                cz.PjT(owx0, null);
            }

            @Override  // t.a$a
            public void PjT(b b0, int v, String s) {
                long v1 = co0.cr();
                com.bytedance.sdk.openadsdk.component.cr.PjT.Zh(owx0, v1, false);
                iZZ iZZ0 = iZZ0;
                if(iZZ0 != null) {
                    iZZ0.PjT(v1);
                }
                cz$ReZ0.PjT(v, s);
                try {
                    if(file0.exists() && file0.isFile()) {
                        XX.ReZ(file0);
                    }
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // t.a$a
            public void Zh(b b0, int v) {
            }
        });
        if(Build.VERSION.SDK_INT < 23) {
            this.PjT(new File(s.b.b().getCacheDir(), "proxy_cache"));
            this.PjT(v);
            long v2 = co0.cr();
            com.bytedance.sdk.openadsdk.component.cr.PjT.Zh(owx0, v2, true);
            if(iZZ0 != null) {
                iZZ0.PjT(v2);
                iZZ0.PjT(2);
            }
            cz$ReZ0.PjT();
            cz.PjT(owx0, null);
        }
    }

    public void PjT(Owx owx0, iZZ iZZ0, Zh cz$Zh0) {
        Co co0 = Co.Zh();
        int v = owx0.joj();
        com.bytedance.sdk.openadsdk.core.model.xE xE0 = (com.bytedance.sdk.openadsdk.core.model.xE)owx0.CY().get(0);
        String s = xE0.XX();
        String s1 = xE0.PjT();
        int v1 = xE0.Zh();
        int v2 = xE0.ReZ();
        String s2 = TextUtils.isEmpty(s) ? JQp.PjT(s1) : s;
        if(TextUtils.isEmpty(s2)) {
            if(cz$Zh0 != null) {
                cz$Zh0.PjT();
            }
            return;
        }
        File file0 = com.bytedance.sdk.openadsdk.component.XX.PjT.Zh(s2);
        if(this.PjT(s1, s)) {
            this.ReZ(v);
            long v3 = co0.cr();
            if(iZZ0 != null) {
                iZZ0.PjT(v3);
                iZZ0.PjT(1);
            }
            cz$Zh0.PjT(null);
            return;
        }
        com.bytedance.sdk.openadsdk.utils.xE.PjT(new com.bytedance.sdk.openadsdk.gK.PjT(s1, xE0.XX()), v1, v2, new com.bytedance.sdk.openadsdk.utils.xE.PjT() {
            final cz cz;

            @Override  // com.bytedance.sdk.openadsdk.utils.xE$PjT
            @MainThread
            public void PjT() {
                long v = co0.cr();
                com.bytedance.sdk.openadsdk.component.cr.PjT.PjT(owx0, v, false);
                cz$Zh0.PjT();
            }

            @Override  // com.bytedance.sdk.openadsdk.utils.xE$PjT
            @MainThread
            public void PjT(@NonNull com.bytedance.sdk.openadsdk.gK.PjT.Zh zh0) {
                if(zh0.cr()) {
                    cz.this.ReZ(v);
                    long v = co0.cr();
                    com.bytedance.sdk.openadsdk.component.cr.PjT.PjT(owx0, v, true);
                    iZZ iZZ0 = iZZ0;
                    if(iZZ0 != null) {
                        iZZ0.PjT(v);
                        iZZ0.PjT(2);
                    }
                    cz$Zh0.PjT(zh0);
                    return;
                }
                long v1 = co0.cr();
                com.bytedance.sdk.openadsdk.component.cr.PjT.PjT(owx0, v1, false);
                cz$Zh0.PjT();
            }
        }, file0.getParent());
    }

    public void PjT(File file0) {
        try {
            this.cr.PjT(file0);
        }
        catch(IOException iOException0) {
            RD.PjT("TTAppOpenAdCacheManager", "trimFileCache fail", iOException0);
        }
    }

    public boolean PjT(String s, String s1) {
        boolean z;
        try {
            if(TextUtils.isEmpty(s1)) {
                s1 = JQp.PjT(s);
            }
            File file0 = com.bytedance.sdk.openadsdk.component.XX.PjT.Zh(s1);
            InputStream inputStream0 = com.bytedance.sdk.openadsdk.SM.cr.PjT(s, s1);
            if(inputStream0 == null) {
                z = false;
            }
            else {
                try {
                    inputStream0.close();
                }
                catch(IOException iOException0) {
                    RD.Zh("TTAppOpenAdCacheManager", iOException0.getMessage());
                }
                z = true;
            }
            return z || !com.bytedance.sdk.openadsdk.SM.cr.PjT(s, s1, file0.getParent()) && !new File(file0.getPath() + ".0").exists() ? z : true;
        }
        catch(Exception exception0) {
        }
        RD.Zh("TTAppOpenAdCacheManager", exception0.getMessage());
        return false;
    }

    private int ReZ(AdSlot adSlot0) {
        return cr.PjT("tt_openad", "material_expiration_time" + adSlot0.getCodeId(), -1L) == -1L ? 0 : 1;
    }

    // 去混淆评级： 低(20)
    static String ReZ() [...] // 潜在的解密器

    public void ReZ(int v) {
        cr.PjT("tt_openad", "image_has_cached" + v, Boolean.TRUE);
    }

    public void XX(int v) {
        cr.PjT("tt_openad_materialMeta", "material" + v);
        cr.PjT("tt_openad", "material_expiration_time" + v);
        cr.PjT("tt_openad", "video_has_cached" + v);
        cr.PjT("tt_openad", "image_has_cached" + v);
    }

    private void Zh(AdSlot adSlot0) {
        AtomicInteger atomicInteger0 = (AtomicInteger)this.XX.get(adSlot0.getCodeId());
        if(atomicInteger0 == null) {
            atomicInteger0 = new AtomicInteger(0);
        }
        else {
            atomicInteger0.decrementAndGet();
        }
        this.XX.put(adSlot0.getCodeId(), atomicInteger0);
    }

    private void Zh(com.bytedance.sdk.openadsdk.component.JQp.PjT pjT0) {
        Jo.PjT(new PjT(this, pjT0), 5);
    }

    private void Zh(@NonNull Owx owx0, AdSlot adSlot0, iZZ iZZ0, com.bytedance.sdk.openadsdk.core.model.PjT pjT0) {
        this.PjT(owx0, iZZ0, new Zh() {
            final cz cz;

            @Override  // com.bytedance.sdk.openadsdk.component.cz$Zh
            public void PjT() {
                cz.this.Zh(adSlot0);
            }

            @Override  // com.bytedance.sdk.openadsdk.component.cz$Zh
            public void PjT(com.bytedance.sdk.openadsdk.gK.PjT.Zh zh0) {
                com.bytedance.sdk.openadsdk.component.JQp.PjT pjT0 = new com.bytedance.sdk.openadsdk.component.JQp.PjT(owx0.joj(), owx0, pjT0);
                cz.this.PjT(pjT0);
                com.bytedance.sdk.openadsdk.component.cr.PjT.PjT(pjT0.Zh(), 1, iZZ0);
                cz.this.Zh(adSlot0);
            }
        });
    }

    // 去混淆评级： 低(30)
    public String Zh() {
        String s = new File(CacheDirFactory.getRootDir()).getName();
        return com.bytedance.sdk.openadsdk.multipro.Zh.ReZ() ? s + "/" + "openad_image_cache" + "/" : s + "/" + "/openad_image_cache" + "/";
    }

    public boolean Zh(int v) {
        return cr.PjT("tt_openad", "video_has_cached" + v, false);
    }

    public boolean Zh(Owx owx0) {
        if(owx0 != null && owx0.CY() != null && owx0.CY().size() != 0 && !TextUtils.isEmpty(((com.bytedance.sdk.openadsdk.core.model.xE)owx0.CY().get(0)).PjT())) {
            com.bytedance.sdk.openadsdk.core.model.xE xE0 = (com.bytedance.sdk.openadsdk.core.model.xE)owx0.CY().get(0);
            return this.PjT(xE0.PjT(), xE0.XX());
        }
        return false;
    }

    public boolean cr(int v) {
        return cr.PjT("tt_openad", "image_has_cached" + v, false);
    }

    @Nullable
    public Owx cz(int v) {
        String s = cr.Zh("tt_openad_materialMeta", "material" + v, null);
        if(!TextUtils.isEmpty(s)) {
            try {
                JSONObject jSONObject0 = new JSONObject(s);
                JSONObject jSONObject1 = ub.ReZ().PjT(jSONObject0);
                return jSONObject1.has("creatives") ? com.bytedance.sdk.openadsdk.core.model.PjT.ReZ(jSONObject1).cz() : com.bytedance.sdk.openadsdk.core.Zh.PjT(jSONObject1);
            }
            catch(Exception exception0) {
            }
            RD.Zh("TTAppOpenAdCacheManager", exception0.getMessage());
        }
        return null;
    }
}

