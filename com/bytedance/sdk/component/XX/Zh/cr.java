package com.bytedance.sdk.component.XX.Zh;

import android.text.TextUtils;
import com.bytedance.sdk.component.XX.Zh;
import com.bytedance.sdk.component.Zh.PjT.SM;
import com.bytedance.sdk.component.Zh.PjT.cz;
import com.bytedance.sdk.component.Zh.PjT.fDm;
import com.bytedance.sdk.component.Zh.PjT.qj;
import com.bytedance.sdk.component.Zh.PjT.qla;
import com.bytedance.sdk.component.Zh.PjT.xE;
import com.bytedance.sdk.component.Zh.PjT.xs.PjT;
import com.bytedance.sdk.component.Zh.PjT.xs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

public class cr extends ReZ {
    fDm PjT;

    public cr(qj qj0) {
        super(qj0);
        this.PjT = null;
    }

    private byte[] JQp(String s) {
        GZIPOutputStream gZIPOutputStream1;
        ByteArrayOutputStream byteArrayOutputStream0;
        GZIPOutputStream gZIPOutputStream0 = null;
        if(s != null && s.length() != 0) {
            try {
                try {
                    byteArrayOutputStream0 = null;
                    byteArrayOutputStream0 = new ByteArrayOutputStream();
                }
                catch(IOException unused_ex) {
                    goto label_14;
                }
                try {
                    gZIPOutputStream1 = new GZIPOutputStream(byteArrayOutputStream0);
                }
                catch(IOException unused_ex) {
                    goto label_14;
                }
            }
            catch(Throwable throwable0) {
                goto label_20;
            }
            try {
                gZIPOutputStream1.write(s.getBytes("utf-8"));
                goto label_26;
            }
            catch(IOException unused_ex) {
                gZIPOutputStream0 = gZIPOutputStream1;
            label_14:
                if(gZIPOutputStream0 != null) {
                    try {
                        gZIPOutputStream0.close();
                    }
                    catch(IOException unused_ex) {
                    }
                }
                if(byteArrayOutputStream0 == null) {
                    return new byte[0];
                }
                goto label_27;
            }
            catch(Throwable throwable0) {
                gZIPOutputStream0 = gZIPOutputStream1;
            }
        label_20:
            if(gZIPOutputStream0 != null) {
                try {
                    gZIPOutputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            if(byteArrayOutputStream0 != null) {
                byteArrayOutputStream0.toByteArray();
                try {
                    byteArrayOutputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            throw throwable0;
            try {
            label_26:
                gZIPOutputStream1.close();
            }
            catch(IOException unused_ex) {
            }
        label_27:
            byte[] arr_b = byteArrayOutputStream0.toByteArray();
            try {
                byteArrayOutputStream0.close();
            }
            catch(IOException unused_ex) {
            }
            return arr_b;
        }
        return null;
    }

    public fDm JQp() {
        return this.PjT;
    }

    private SM PjT(xE xE0) {
        try {
            return xE0.JQp();
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    private Charset PjT(SM sM0) {
        if(sM0 != null) {
            try {
                return sM0.PjT(com.bytedance.sdk.component.Zh.PjT.Zh.SM.PjT);
            }
            catch(Exception unused_ex) {
                return com.bytedance.sdk.component.Zh.PjT.Zh.SM.PjT;
            }
        }
        return com.bytedance.sdk.component.Zh.PjT.Zh.SM.PjT;
    }

    private void PjT(Zh zh0, qla qla0) {
        if(zh0 != null && qla0 != null) {
            zh0.PjT(qla0.SM());
        }
    }

    public Zh PjT() {
        Zh zh0;
        try {
            PjT xs$PjT0 = new PjT();
            if(TextUtils.isEmpty(this.Au)) {
                return new Zh(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            xs$PjT0.Zh(this.Au);
            if(this.PjT == null) {
                return new Zh(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            this.PjT(xs$PjT0);
            xs$PjT0.PjT(this.ReZ());
            xs xs0 = xs$PjT0.PjT(this.PjT).Zh();
            qla qla0 = this.ReZ.PjT(xs0).Zh();
            if(qla0 != null) {
                HashMap hashMap0 = new HashMap();
                cz cz0 = qla0.XX();
                if(cz0 != null) {
                    for(int v = 0; v < cz0.PjT(); ++v) {
                        String s = cz0.PjT(v);
                        String s1 = cz0.Zh(v);
                        hashMap0.put(s, s1);
                        if(s != null && s.equalsIgnoreCase("content-type")) {
                            hashMap0.put("content-type", (s1 == null ? "" : s1.toLowerCase()));
                        }
                    }
                }
                xE xE0 = qla0.cz();
                if(com.bytedance.sdk.component.XX.ReZ.PjT.PjT(hashMap0)) {
                    byte[] arr_b = xE0.cr();
                    zh0 = new Zh(qla0.cr(), qla0.ReZ(), qla0.JQp(), hashMap0, null, qla0.Zh(), qla0.PjT());
                    zh0.PjT(arr_b);
                }
                else if(this.SM) {
                    byte[] arr_b1 = xE0.cr();
                    String s2 = new String(arr_b1, this.PjT(this.PjT(xE0)));
                    Zh zh1 = new Zh(qla0.cr(), qla0.ReZ(), qla0.JQp(), hashMap0, s2, qla0.Zh(), qla0.PjT());
                    zh1.PjT(arr_b1);
                    zh0 = zh1;
                }
                else if(xE0 != null) {
                    zh0 = new Zh(qla0.cr(), qla0.ReZ(), qla0.JQp(), hashMap0, xE0.Zh(), qla0.Zh(), qla0.PjT());
                }
                else {
                    throw new IOException(qla0.JQp());
                }
                this.PjT(zh0, qla0);
                return zh0;
            }
            return null;
        }
        catch(Throwable throwable0) {
            return new Zh(false, 5001, throwable0.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public void PjT(com.bytedance.sdk.component.XX.PjT.PjT pjT0) {
        try {
            PjT xs$PjT0 = new PjT();
            if(TextUtils.isEmpty(this.Au)) {
                pjT0.PjT(this, new IOException("Url is Empty"));
                return;
            }
            if(!TextUtils.isEmpty(this.JQp)) {
                xs$PjT0.PjT(this.JQp);
            }
            int v = this.cz;
            if(v > 0) {
                xs$PjT0.PjT(v);
            }
            xs$PjT0.Zh(this.Au);
            if(this.PjT == null) {
                if(pjT0 != null) {
                    pjT0.PjT(this, new IOException("RequestBody is null, content type is not support!!"));
                }
                return;
            }
            this.PjT(xs$PjT0);
            xs$PjT0.PjT(this.ReZ());
            xs xs0 = xs$PjT0.PjT(this.PjT).Zh();
            this.ReZ.PjT(xs0).PjT(new com.bytedance.sdk.component.Zh.PjT.ReZ() {
                final cr Zh;

                @Override  // com.bytedance.sdk.component.Zh.PjT.ReZ
                public void PjT(com.bytedance.sdk.component.Zh.PjT.Zh zh0, qla qla0) throws IOException {
                    byte[] arr_b1;
                    Zh zh3;
                    byte[] arr_b;
                    Zh zh2;
                    xE xE0;
                    HashMap hashMap0;
                    Zh zh1;
                    com.bytedance.sdk.component.XX.PjT.PjT pjT0 = pjT0;
                    if(pjT0 != null) {
                        if(qla0 == null) {
                            IOException iOException0 = new IOException("No response");
                            pjT0.PjT(cr.this, iOException0);
                            return;
                        }
                        try {
                            zh1 = null;
                            hashMap0 = new HashMap();
                            cz cz0 = qla0.XX();
                            if(cz0 != null) {
                                for(int v = 0; v < cz0.PjT(); ++v) {
                                    String s = cz0.PjT(v);
                                    String s1 = cz0.Zh(v);
                                    hashMap0.put(s, s1);
                                    if(s != null && s.equalsIgnoreCase("content-type")) {
                                        hashMap0.put("content-type", (s1 == null ? "" : s1.toLowerCase()));
                                    }
                                }
                            }
                            xE0 = qla0.cz();
                            if(com.bytedance.sdk.component.XX.ReZ.PjT.PjT(hashMap0)) {
                                arr_b1 = xE0.cr();
                                zh2 = new Zh(qla0.cr(), qla0.ReZ(), qla0.JQp(), hashMap0, null, qla0.Zh(), qla0.PjT());
                                goto label_41;
                            }
                            else if(!cr.this.SM) {
                                if(xE0 == null) {
                                    throw new IOException(qla0.JQp());
                                }
                                zh2 = new Zh(qla0.cr(), qla0.ReZ(), qla0.JQp(), hashMap0, xE0.Zh(), qla0.Zh(), qla0.PjT());
                            }
                            else {
                                arr_b = xE0.cr();
                                SM sM0 = cr.this.PjT(xE0);
                                String s2 = new String(arr_b, cr.this.PjT(sM0));
                                zh3 = new Zh(qla0.cr(), qla0.ReZ(), qla0.JQp(), hashMap0, s2, qla0.Zh(), qla0.PjT());
                                goto label_30;
                            }
                            goto label_42;
                        }
                        catch(Throwable throwable0) {
                            goto label_46;
                        }
                        try {
                        label_30:
                            zh3.PjT(arr_b);
                            zh2 = zh3;
                            goto label_42;
                        }
                        catch(Throwable throwable0) {
                            zh1 = zh3;
                            goto label_46;
                        }
                        try {
                            arr_b1 = xE0.cr();
                            zh2 = new Zh(qla0.cr(), qla0.ReZ(), qla0.JQp(), hashMap0, null, qla0.Zh(), qla0.PjT());
                            goto label_41;
                        }
                        catch(Throwable throwable0) {
                        }
                        goto label_46;
                        try {
                        label_41:
                            zh2.PjT(arr_b1);
                        label_42:
                            cr.this.PjT(zh2, qla0);
                            goto label_48;
                        }
                        catch(Throwable throwable0) {
                            zh1 = zh2;
                        }
                    label_46:
                        zh2 = zh1;
                        zh1 = new IOException(throwable0);
                    label_48:
                        if(zh2 != null) {
                            pjT0.PjT(cr.this, zh2);
                            return;
                        }
                        com.bytedance.sdk.component.XX.PjT.PjT pjT1 = pjT0;
                        if(pjT1 instanceof com.bytedance.sdk.component.XX.PjT.Zh) {
                            cr cr0 = cr.this;
                            if(zh1 == null) {
                                zh1 = new IOException("Unexpected exception");
                            }
                            ((com.bytedance.sdk.component.XX.PjT.Zh)pjT1).PjT(cr0, ((IOException)zh1), new Zh(qla0.cr(), qla0.ReZ(), qla0.JQp(), null, null, qla0.Zh(), qla0.PjT()));
                            return;
                        }
                        cr cr1 = cr.this;
                        if(zh1 == null) {
                            zh1 = new IOException("Unexpected exception");
                        }
                        pjT1.PjT(cr1, ((IOException)zh1));
                    }
                }

                @Override  // com.bytedance.sdk.component.Zh.PjT.ReZ
                public void PjT(com.bytedance.sdk.component.Zh.PjT.Zh zh0, IOException iOException0) {
                    com.bytedance.sdk.component.XX.PjT.PjT pjT0 = pjT0;
                    if(pjT0 != null) {
                        pjT0.PjT(cr.this, iOException0);
                    }
                }
            });
            return;
        }
        catch(Throwable throwable0) {
        }
        pjT0.PjT(this, new IOException(throwable0.getMessage()));
    }

    public void PjT(String s, boolean z) {
        if(z) {
            this.PjT("application/json; charset=utf-8", this.JQp(s));
            this.Zh("Content-Encoding", "gzip");
            return;
        }
        this.cr(s);
    }

    public void PjT(String s, byte[] arr_b) {
        this.PjT = fDm.PjT(SM.PjT(s), arr_b);
    }

    public void PjT(JSONObject jSONObject0) {
        this.PjT = fDm.PjT(SM.PjT("application/json; charset=utf-8"), (jSONObject0 == null ? "{}" : jSONObject0.toString()));
    }

    public void cr(String s) {
        if(TextUtils.isEmpty(s)) {
            s = "{}";
        }
        this.PjT = fDm.PjT(SM.PjT("application/json; charset=utf-8"), s);
    }
}

