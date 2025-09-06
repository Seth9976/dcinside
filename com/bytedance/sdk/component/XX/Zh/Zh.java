package com.bytedance.sdk.component.XX.Zh;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.Zh.PjT.PjT;
import com.bytedance.sdk.component.Zh.PjT.cz;
import com.bytedance.sdk.component.Zh.PjT.qj;
import com.bytedance.sdk.component.Zh.PjT.qla;
import com.bytedance.sdk.component.Zh.PjT.xE;
import com.bytedance.sdk.component.Zh.PjT.xs;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class Zh extends ReZ {
    private PjT DWo;
    public static final PjT PjT;
    public static final PjT Zh;
    private boolean qj;
    private Map xf;

    static {
        Zh.PjT = new com.bytedance.sdk.component.Zh.PjT.PjT.PjT().PjT().Zh();
        Zh.Zh = new com.bytedance.sdk.component.Zh.PjT.PjT.PjT().Zh();
    }

    public Zh(qj qj0) {
        super(qj0);
        this.DWo = Zh.PjT;
        this.qj = false;
        this.xf = new HashMap();
    }

    public com.bytedance.sdk.component.XX.Zh PjT() {
        try {
            String s = "";
            com.bytedance.sdk.component.Zh.PjT.xs.PjT xs$PjT0 = new com.bytedance.sdk.component.Zh.PjT.xs.PjT();
            if(this.qj) {
                xs$PjT0.Zh(this.Au);
            }
            else {
                com.bytedance.sdk.component.Zh.PjT.XX.PjT xX$PjT0 = new com.bytedance.sdk.component.Zh.PjT.XX.PjT();
                Uri uri0 = Uri.parse(this.Au);
                xX$PjT0.PjT(uri0.getScheme());
                xX$PjT0.Zh(uri0.getHost());
                String s1 = uri0.getEncodedPath();
                if(!TextUtils.isEmpty(s1)) {
                    if(s1.startsWith("/")) {
                        s1 = s1.substring(1);
                    }
                    xX$PjT0.ReZ(s1);
                }
                Set set0 = uri0.getQueryParameterNames();
                if(set0 != null && set0.size() > 0) {
                    for(Object object0: set0) {
                        this.xf.put(((String)object0), uri0.getQueryParameter(((String)object0)));
                    }
                }
                for(Object object1: this.xf.entrySet()) {
                    String s2 = (String)((Map.Entry)object1).getKey();
                    String s3 = (String)((Map.Entry)object1).getValue();
                    if(!TextUtils.isEmpty(s2)) {
                        String s4 = URLEncoder.encode(s2, "UTF-8");
                        if(s3 == null) {
                            s3 = "";
                        }
                        xX$PjT0.PjT(s4, URLEncoder.encode(s3, "UTF-8"));
                    }
                }
                xs$PjT0.PjT(xX$PjT0.Zh());
            }
            this.PjT(xs$PjT0);
            xs$PjT0.PjT(this.DWo);
            xs$PjT0.PjT(this.ReZ());
            xs xs0 = xs$PjT0.PjT().Zh();
            qla qla0 = this.ReZ.PjT(xs0).Zh();
            if(qla0 != null) {
                HashMap hashMap0 = new HashMap();
                cz cz0 = qla0.XX();
                if(cz0 != null) {
                    for(int v = 0; v < cz0.PjT(); ++v) {
                        hashMap0.put(cz0.PjT(v), cz0.Zh(v));
                    }
                }
                xE xE0 = qla0.cz();
                if(xE0 != null) {
                    s = xE0.Zh();
                }
                return new com.bytedance.sdk.component.XX.Zh(qla0.cr(), qla0.ReZ(), qla0.JQp(), hashMap0, s, qla0.Zh(), qla0.PjT());
            }
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public void PjT(com.bytedance.sdk.component.XX.PjT.PjT pjT0) {
        try {
            com.bytedance.sdk.component.Zh.PjT.xs.PjT xs$PjT0 = new com.bytedance.sdk.component.Zh.PjT.xs.PjT();
            if(this.qj) {
                xs$PjT0.Zh(this.Au);
            }
            else {
                com.bytedance.sdk.component.Zh.PjT.XX.PjT xX$PjT0 = new com.bytedance.sdk.component.Zh.PjT.XX.PjT();
                Uri uri0 = Uri.parse(this.Au);
                xX$PjT0.PjT(uri0.getScheme());
                xX$PjT0.Zh(uri0.getHost());
                String s = uri0.getEncodedPath();
                if(!TextUtils.isEmpty(s)) {
                    if(s.startsWith("/")) {
                        s = s.substring(1);
                    }
                    xX$PjT0.ReZ(s);
                }
                Set set0 = uri0.getQueryParameterNames();
                if(set0 != null && set0.size() > 0) {
                    for(Object object0: set0) {
                        this.xf.put(((String)object0), uri0.getQueryParameter(((String)object0)));
                    }
                }
                for(Object object1: this.xf.entrySet()) {
                    String s1 = (String)((Map.Entry)object1).getKey();
                    String s2 = (String)((Map.Entry)object1).getValue();
                    if(!TextUtils.isEmpty(s1)) {
                        String s3 = URLEncoder.encode(s1, "UTF-8");
                        if(s2 == null) {
                            s2 = "";
                        }
                        xX$PjT0.PjT(s3, URLEncoder.encode(s2, "UTF-8"));
                    }
                }
                xs$PjT0.PjT(xX$PjT0.Zh());
            }
            this.PjT(xs$PjT0);
            xs$PjT0.PjT(this.DWo);
            xs$PjT0.PjT(this.ReZ());
            if(!TextUtils.isEmpty(this.JQp)) {
                xs$PjT0.PjT(this.JQp);
            }
            int v = this.cz;
            if(v > 0) {
                xs$PjT0.PjT(v);
            }
            xs xs0 = xs$PjT0.PjT().Zh();
            this.ReZ.PjT(xs0).PjT(new com.bytedance.sdk.component.Zh.PjT.ReZ() {
                final Zh Zh;

                @Override  // com.bytedance.sdk.component.Zh.PjT.ReZ
                public void PjT(com.bytedance.sdk.component.Zh.PjT.Zh zh0, qla qla0) throws IOException {
                    if(pjT0 != null) {
                        HashMap hashMap0 = new HashMap();
                        if(qla0 != null) {
                            cz cz0 = qla0.XX();
                            if(cz0 != null) {
                                for(int v = 0; v < cz0.PjT(); ++v) {
                                    hashMap0.put(cz0.PjT(v), cz0.Zh(v));
                                }
                            }
                            xE xE0 = qla0.cz();
                            String s = xE0 == null ? "" : xE0.Zh();
                            com.bytedance.sdk.component.XX.Zh zh1 = new com.bytedance.sdk.component.XX.Zh(qla0.cr(), qla0.ReZ(), qla0.JQp(), hashMap0, s, qla0.Zh(), qla0.PjT());
                            pjT0.PjT(Zh.this, zh1);
                        }
                    }
                }

                @Override  // com.bytedance.sdk.component.Zh.PjT.ReZ
                public void PjT(com.bytedance.sdk.component.Zh.PjT.Zh zh0, IOException iOException0) {
                    com.bytedance.sdk.component.XX.PjT.PjT pjT0 = pjT0;
                    if(pjT0 != null) {
                        pjT0.PjT(Zh.this, iOException0);
                    }
                }
            });
            return;
        label_44:
            if(pjT0 != null) {
                goto label_45;
            }
            return;
        }
        catch(Throwable throwable0) {
            goto label_44;
        }
    label_45:
        pjT0.PjT(this, new IOException(throwable0.getMessage()));
    }

    public void PjT(boolean z) {
        this.qj = z;
    }
}

