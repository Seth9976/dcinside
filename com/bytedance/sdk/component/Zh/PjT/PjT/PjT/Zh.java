package com.bytedance.sdk.component.Zh.PjT.PjT.PjT;

import android.text.TextUtils;
import com.bytedance.sdk.component.Zh.PjT.Au;
import com.bytedance.sdk.component.Zh.PjT.ReZ;
import com.bytedance.sdk.component.Zh.PjT.cr;
import com.bytedance.sdk.component.Zh.PjT.fDm.PjT;
import com.bytedance.sdk.component.Zh.PjT.fDm;
import com.bytedance.sdk.component.Zh.PjT.qj;
import com.bytedance.sdk.component.Zh.PjT.qla;
import com.bytedance.sdk.component.Zh.PjT.xs;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class Zh implements com.bytedance.sdk.component.Zh.PjT.Zh {
    xs PjT;
    private AtomicBoolean ReZ;
    cr Zh;

    Zh(xs xs0, cr cr0) {
        this.ReZ = new AtomicBoolean(false);
        this.PjT = xs0;
        this.Zh = cr0;
    }

    private boolean JQp() {
        return this.PjT.cr() == null ? false : this.PjT.cr().containsKey("Content-Type");
    }

    private static void PjT(HttpURLConnection httpURLConnection0) {
        try {
            Field field0 = httpURLConnection0.getClass().getDeclaredField("delegate");
            field0.setAccessible(true);
            Object object0 = field0.get(httpURLConnection0);
            Field field1 = object0.getClass().getDeclaredField("client");
            field1.setAccessible(true);
            Object object1 = field1.get(object0);
            object1.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(object1, Boolean.FALSE);
        }
        catch(Exception unused_ex) {
        }
    }

    private boolean PjT(fDm fDm0) {
        if(fDm0 == null || (this.PjT == null || !"POST".equalsIgnoreCase(this.PjT.ReZ()))) {
            return false;
        }
        return fDm0.cz == PjT.Zh ? fDm0.JQp != null && fDm0.JQp.length > 0 : false;
    }

    public qla PjT(xs xs0) throws IOException {
        String s2;
        qla qla0;
        Iterator iterator0;
        HttpURLConnection httpURLConnection0;
        int v;
        try {
            v = XX.PjT;
            httpURLConnection0 = null;
            httpURLConnection0 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(new URL(xs0.Zh().PjT().toString()).openConnection())));
            goto label_7;
        }
        catch(Exception exception0) {
        }
        catch(Throwable throwable0) {
            this.Zh.cr().remove(this);
            throw throwable0;
        }
        Exception exception1 = exception0;
        goto label_65;
        try {
        label_7:
            if(xs0.cr() == null || xs0.cr().size() <= 0) {
                goto label_10;
            }
            iterator0 = xs0.cr().entrySet().iterator();
            while(true) {
            label_9:
                if(!iterator0.hasNext()) {
                label_10:
                    qj qj0 = xs0.PjT;
                    if(qj0 != null) {
                        TimeUnit timeUnit0 = qj0.ReZ;
                        if(timeUnit0 != null) {
                            httpURLConnection0.setConnectTimeout(((int)timeUnit0.toMillis(qj0.Zh)));
                        }
                        qj qj1 = xs0.PjT;
                        if(qj1.ReZ != null) {
                            httpURLConnection0.setReadTimeout(((int)qj1.JQp.toMillis(qj1.cr)));
                        }
                    }
                    if(xs0.Au() == null) {
                        httpURLConnection0.setRequestMethod("GET");
                    }
                    else {
                        if(!this.JQp() && xs0.Au().ReZ != null) {
                            httpURLConnection0.addRequestProperty("Content-Type", xs0.Au().ReZ.PjT());
                        }
                        httpURLConnection0.setRequestMethod(xs0.ReZ());
                        if("POST".equalsIgnoreCase(xs0.ReZ())) {
                            OutputStream outputStream0 = httpURLConnection0.getOutputStream();
                            if(this.PjT(xs0.Au())) {
                                outputStream0.write(xs0.Au().JQp);
                            }
                            else if(this.Zh(xs0.Au())) {
                                outputStream0.write(xs0.Au().cr.getBytes());
                            }
                            outputStream0.flush();
                            outputStream0.close();
                        }
                    }
                    com.bytedance.sdk.component.ReZ.PjT.PjT pjT0 = xs0.Zh;
                    if(pjT0 != null) {
                        pjT0.Zh();
                    }
                    httpURLConnection0.connect();
                    com.bytedance.sdk.component.ReZ.PjT.PjT pjT1 = xs0.Zh;
                    if(pjT1 != null) {
                        pjT1.ReZ();
                    }
                    v = httpURLConnection0.getResponseCode();
                    com.bytedance.sdk.component.ReZ.PjT.PjT pjT2 = xs0.Zh;
                    if(pjT2 != null) {
                        pjT2.JQp();
                    }
                    if(this.ReZ.get()) {
                        httpURLConnection0.disconnect();
                        break;
                    }
                    goto label_48;
                }
                goto label_51;
            }
        }
        catch(Exception exception1) {
            goto label_65;
        }
        catch(Throwable throwable0) {
            this.Zh.cr().remove(this);
            throw throwable0;
        }
        this.Zh.cr().remove(this);
        return new XX(v, "internal error", xs0);
        try {
        label_48:
            qla0 = new XX(httpURLConnection0, xs0);
        }
        catch(Exception exception1) {
            goto label_65;
        }
        catch(Throwable throwable0) {
            this.Zh.cr().remove(this);
            throw throwable0;
        }
        this.Zh.cr().remove(this);
        return qla0;
        try {
        label_51:
            Object object0 = iterator0.next();
            String s = (String)((Map.Entry)object0).getKey();
            Iterator iterator1 = ((List)((Map.Entry)object0).getValue()).iterator();
            while(true) {
                if(!iterator1.hasNext()) {
                    goto label_9;
                }
                Object object1 = iterator1.next();
                String s1 = (String)object1;
                if("_disable_retry".equals(s) && "1".equals(s1)) {
                    Zh.PjT(httpURLConnection0);
                }
                else {
                    httpURLConnection0.addRequestProperty(s, s1);
                }
            }
        }
        catch(Exception exception1) {
        }
        catch(Throwable throwable0) {
            this.Zh.cr().remove(this);
            throw throwable0;
        }
        try {
        label_65:
            s2 = httpURLConnection0.getErrorStream().toString();
        }
        catch(Throwable unused_ex) {
            try {
                s2 = exception1.getMessage();
            }
            catch(Throwable throwable0) {
                this.Zh.cr().remove(this);
                throw throwable0;
            }
        }
        this.Zh.cr().remove(this);
        return new XX(v, s2, xs0);
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.Zh
    public xs PjT() {
        return this.PjT;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.Zh
    public void PjT(ReZ reZ0) {
        xs xs0 = this.PjT;
        if(xs0 != null) {
            com.bytedance.sdk.component.ReZ.PjT.PjT pjT0 = xs0.Zh;
            if(pjT0 != null) {
                pjT0.qla();
            }
        }
        this.Zh.Zh().submit(new com.bytedance.sdk.component.Au.ReZ.Zh(this.PjT.XX(), this.PjT.cz()) {
            final Zh Zh;

            @Override
            public void run() {
                try {
                    qla qla0 = Zh.this.Zh();
                    if(qla0 == null) {
                        IOException iOException1 = new IOException("response is null");
                        reZ0.PjT(Zh.this, iOException1);
                        return;
                    }
                    reZ0.PjT(Zh.this, qla0);
                    return;
                }
                catch(IOException iOException0) {
                }
                reZ0.PjT(Zh.this, iOException0);
            }
        });
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.Zh
    public void ReZ() {
        this.ReZ.set(true);
    }

    private boolean Zh(fDm fDm0) {
        if(fDm0 == null || (this.PjT == null || !"POST".equalsIgnoreCase(this.PjT.ReZ()))) {
            return false;
        }
        return fDm0.cz == PjT.PjT ? !TextUtils.isEmpty(fDm0.cr) : false;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.Zh
    public qla Zh() throws IOException {
        xs xs0 = this.PjT;
        if(xs0 != null) {
            com.bytedance.sdk.component.ReZ.PjT.PjT pjT0 = xs0.Zh;
            if(pjT0 != null) {
                if(pjT0.fDm() == 0L) {
                    this.PjT.Zh.qla();
                }
                this.PjT.Zh.PjT();
            }
        }
        this.Zh.ReZ().remove(this);
        this.Zh.cr().add(this);
        if(this.Zh instanceof JQp && (this.Zh.ReZ().size() + this.Zh.cr().size() > this.Zh.PjT() || this.ReZ.get())) {
            this.Zh.cr().remove(this);
            return new XX(XX.PjT, "Maximum number of requests exceeded", this.PjT);
        }
        try {
            qj qj0 = this.PjT.PjT;
            if(qj0 != null && (qj0.PjT != null && qj0.PjT.size() > 0)) {
                ArrayList arrayList0 = new ArrayList(this.PjT.PjT.PjT);
                arrayList0.add(new Au() {
                    final Zh PjT;

                    @Override  // com.bytedance.sdk.component.Zh.PjT.Au
                    public qla PjT(com.bytedance.sdk.component.Zh.PjT.Au.PjT au$PjT0) throws IOException {
                        xs xs0 = au$PjT0.PjT();
                        return Zh.this.PjT(xs0);
                    }
                });
                return ((Au)arrayList0.get(0)).PjT(new com.bytedance.sdk.component.Zh.PjT.PjT.PjT.ReZ(arrayList0, this.PjT));
            }
            return this.PjT(this.PjT);
        }
        catch(Throwable throwable0) {
        }
        throw new IOException(throwable0.getMessage());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.cr();
    }

    public com.bytedance.sdk.component.Zh.PjT.Zh cr() {
        return new Zh(this.PjT, this.Zh);
    }
}

