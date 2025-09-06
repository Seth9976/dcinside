package com.bytedance.sdk.openadsdk.core.cr;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.JQp;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.XX;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf.ReZ.ReZ;
import com.bytedance.sdk.openadsdk.multipro.Zh;
import com.bytedance.sdk.openadsdk.qla.PjT.cr;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class PjT {
    static class com.bytedance.sdk.openadsdk.core.cr.PjT.PjT {
        private static final PjT PjT;

        static {
            com.bytedance.sdk.openadsdk.core.cr.PjT.PjT.PjT = new PjT();
        }
    }

    private final List PjT;
    private final ConcurrentHashMap ReZ;
    private final ReZ Zh;

    public PjT() {
        this.PjT = new CopyOnWriteArrayList();
        this.Zh = new ReZ(5, 5, true);
        this.ReZ = new ConcurrentHashMap();
    }

    public static PjT PjT() {
        return com.bytedance.sdk.openadsdk.core.cr.PjT.PjT.PjT;
    }

    private File PjT(Context context0, boolean z) {
        String s = new File(CacheDirFactory.getRootDir()).getName();
        return Zh.ReZ() ? XX.PjT(context0, z, s + "/music") : XX.PjT(context0, z, s + "//music");
    }

    private void PjT(int v, long v1, int v2, String s) {
        com.bytedance.sdk.openadsdk.qla.ReZ.PjT("music_preload_finish", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
            final PjT JQp;

            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("result", v);
                long v = v1;
                if(v != -1L) {
                    jSONObject0.put("load_duration", v);
                }
                com.bytedance.sdk.openadsdk.qla.PjT.ReZ reZ0 = cr.Zh().PjT("music_preload_finish").Zh(jSONObject0.toString());
                if(!TextUtils.isEmpty(s)) {
                    ((cr)reZ0).Zh(v2);
                    ((cr)reZ0).cz(s);
                }
                ((cr)reZ0).PjT();
                return reZ0;
            }
        });
    }

    private void PjT(Owx owx0) {
        if(owx0 == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.Owx.PjT owx$PjT0 = owx0.VY();
        if(owx$PjT0 == null) {
            return;
        }
        String s = owx$PjT0.qj();
        if(s != null && s.contains("music_url")) {
            this.ReZ();
            String s1 = owx$PjT0.cr();
            if(TextUtils.isEmpty(s1)) {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("result", 0);
                }
                catch(JSONException jSONException0) {
                    RD.Zh("MusicCacheManager", jSONException0.getMessage());
                }
                this.PjT(0, -1L, 10001, "music url string is null");
                return;
            }
            File file0 = this.Zh(s1);
            if(file0 == null) {
                return;
            }
            file0.getPath();
            if(this.PjT(file0)) {
                this.PjT(2, -1L, -1, null);
                return;
            }
            this.PjT(owx0, s1, file0);
        }
    }

    private void PjT(Owx owx0, String s, File file0) {
        if(!this.ReZ(s)) {
            return;
        }
        Long long0 = SystemClock.elapsedRealtime();
        this.ReZ.put(s, long0);
        com.bytedance.sdk.component.XX.Zh.PjT pjT0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().cr();
        pjT0.Zh(s);
        pjT0.PjT(file0.getParent(), file0.getName());
        pjT0.ReZ(s);
        this.PjT.add(s);
        pjT0.PjT(new com.bytedance.sdk.component.XX.PjT.PjT() {
            final PjT PjT;

            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, com.bytedance.sdk.component.XX.Zh zh0) {
                String s = reZ0.ReZ();
                Long long0 = (Long)PjT.this.ReZ.get(s);
                if(zh0.cz() && zh0.JQp() != null && zh0.JQp().exists()) {
                    if(long0 != null) {
                        PjT.this.ReZ.remove(s);
                        long v = SystemClock.elapsedRealtime();
                        PjT.this.PjT(1, v - ((long)long0), -1, null);
                    }
                    try {
                        XX.Zh(zh0.JQp());
                    }
                    catch(IOException iOException0) {
                        RD.Zh("MusicCacheManager", iOException0.getMessage());
                    }
                }
                if(!zh0.cz() && long0 != null) {
                    long v1 = SystemClock.elapsedRealtime();
                    PjT.this.PjT(0, v1 - ((long)long0), -2, "http response status code isn\'t 200");
                }
            }

            @Override  // com.bytedance.sdk.component.XX.PjT.PjT
            public void PjT(com.bytedance.sdk.component.XX.Zh.ReZ reZ0, IOException iOException0) {
                Long long0 = (Long)PjT.this.ReZ.get(reZ0.ReZ());
                if(long0 != null) {
                    long v = SystemClock.elapsedRealtime();
                    PjT.this.PjT(0, v - ((long)long0), -2, "http response status code isn\'t 200");
                }
            }
        });
    }

    private boolean PjT(File file0) {
        return file0.exists() && file0.length() != 0L;
    }

    public InputStream PjT(String s) {
        File file0 = this.Zh(s);
        if(file0 != null && this.PjT(file0)) {
            try {
                return new FileInputStream(file0);
            }
            catch(Exception exception0) {
                RD.Zh("MusicCacheManager", exception0.getMessage());
            }
        }
        return null;
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.model.PjT pjT0) {
        List list0 = pjT0.cr();
        if(list0 != null && list0.size() != 0) {
            for(int v = 0; v < list0.size(); ++v) {
                Owx owx0 = (Owx)list0.get(v);
                if(owx0 != null) {
                    this.PjT(owx0);
                }
            }
        }
    }

    public void PjT(boolean z) {
        com.bytedance.sdk.openadsdk.qla.ReZ.PjT("music_cache", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
            final PjT Zh;

            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("result", z);
                com.bytedance.sdk.openadsdk.qla.PjT.ReZ reZ0 = cr.Zh().PjT("music_cache").Zh(jSONObject0.toString());
                ((cr)reZ0).PjT();
                return reZ0;
            }
        });
    }

    private boolean ReZ(String s) {
        return !this.PjT.contains(s);
    }

    public void ReZ() {
        com.bytedance.sdk.openadsdk.qla.ReZ.PjT("music_preload_start", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
            final PjT PjT;

            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                com.bytedance.sdk.openadsdk.qla.PjT.ReZ reZ0 = cr.Zh().PjT("music_preload_start");
                ((cr)reZ0).PjT();
                return reZ0;
            }
        });
    }

    public File Zh(String s) {
        String s1 = JQp.PjT(s);
        if(s1 == null) {
            return null;
        }
        String s2 = new File(CacheDirFactory.getRootDir()).getName();
        return Zh.ReZ() ? XX.PjT(ub.PjT(), Zh.ReZ(), s2 + "/music/", s1) : XX.PjT(ub.PjT(), Zh.ReZ(), s2 + "//music/", s1);
    }

    public void Zh() {
        File file0 = this.PjT(ub.PjT(), Zh.ReZ());
        file0.getAbsolutePath();
        try {
            this.Zh.PjT(file0);
        }
        catch(IOException iOException0) {
            RD.PjT("MusicCacheManager", "trimFileCache fail", iOException0);
        }
    }
}

