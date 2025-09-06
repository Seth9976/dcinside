package com.bytedance.sdk.component.Zh.PjT.PjT.PjT;

import android.text.TextUtils;
import com.bytedance.sdk.component.ReZ.PjT.PjT;
import com.bytedance.sdk.component.Zh.PjT.DWo;
import com.bytedance.sdk.component.Zh.PjT.cz;
import com.bytedance.sdk.component.Zh.PjT.qla;
import com.bytedance.sdk.component.Zh.PjT.xE;
import com.bytedance.sdk.component.Zh.PjT.xf;
import com.bytedance.sdk.component.Zh.PjT.xs;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class XX extends qla {
    String JQp;
    public static int PjT = -1;
    xs ReZ;
    HttpURLConnection Zh;
    int cr;

    static {
    }

    public XX(int v, String s, xs xs0) {
        this.JQp = s;
        this.ReZ = xs0;
        this.cr = v;
    }

    public XX(HttpURLConnection httpURLConnection0, xs xs0) {
        this.cr = XX.PjT;
        this.Zh = httpURLConnection0;
        this.ReZ = xs0;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.qla
    public xf Au() {
        return xf.Zh;
    }

    public xs DWo() {
        return this.ReZ;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.qla
    public String JQp() throws IOException {
        return TextUtils.isEmpty(this.JQp) ? this.Zh.getResponseMessage() : this.JQp;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.qla
    public long PjT() {
        return 0L;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.qla
    public int ReZ() {
        try {
            return this.Zh.getResponseCode();
        }
        catch(Exception unused_ex) {
            return this.cr;
        }
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.qla
    public DWo SM() {
        return this.DWo() == null || this.DWo().Zh == null ? null : new DWo(this.DWo().Zh);
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.qla
    public cz XX() {
        if(this.Zh == null) {
            return new cz(new String[0]);
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.Zh.getHeaderFields().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            for(Object object1: ((List)map$Entry0.getValue())) {
                String s = (String)object1;
                if(!"Content-Range".equalsIgnoreCase(((String)map$Entry0.getKey())) || this.ReZ() != 206) {
                    arrayList0.add(map$Entry0.getKey());
                    arrayList0.add(s);
                }
            }
        }
        return new cz(((String[])arrayList0.toArray(new String[arrayList0.size()])));
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.qla
    public long Zh() {
        return 0L;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.qla
    public void close() {
        try {
            this.cz().close();
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.qla
    public boolean cr() {
        return this.ReZ() >= 200 && this.ReZ() < 300;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.qla
    public xE cz() {
        xE xE0;
        xs xs0 = this.ReZ;
        if(xs0 != null) {
            PjT pjT0 = xs0.Zh;
            if(pjT0 != null) {
                pjT0.qj();
            }
        }
        try {
            xE0 = new Au(this.Zh);
        }
        catch(Exception unused_ex) {
            try {
                xE0 = new Au(this.Zh, this.Zh.getErrorStream());
            }
            catch(Throwable throwable0) {
                throwable0.getMessage();
                xE0 = null;
            }
        }
        xs xs1 = this.ReZ;
        if(xs1 != null) {
            PjT pjT1 = xs1.Zh;
            if(pjT1 != null) {
                pjT1.xs();
            }
        }
        return xE0;
    }

    @Override
    public String toString() {
        return "";
    }
}

