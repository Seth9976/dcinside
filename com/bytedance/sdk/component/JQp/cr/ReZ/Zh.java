package com.bytedance.sdk.component.JQp.cr.ReZ;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.JQp.DWo;
import com.bytedance.sdk.component.JQp.ReZ;
import com.bytedance.sdk.component.JQp.gK;
import com.bytedance.sdk.component.JQp.qla;
import com.bytedance.sdk.component.JQp.xs;
import com.bytedance.sdk.component.utils.xE;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;

public class Zh implements qla {
    private volatile cz PjT;

    public static qla PjT(Context context0, xs xs0) {
        qla qla0 = new Zh();
        ((Zh)qla0).Zh(context0, xs0);
        return qla0;
    }

    @Override  // com.bytedance.sdk.component.JQp.qla
    public DWo PjT(String s) {
        return new com.bytedance.sdk.component.JQp.cr.ReZ.ReZ.Zh(this.PjT).ReZ(s);
    }

    @Override  // com.bytedance.sdk.component.JQp.qla
    public InputStream PjT(String s, String s1) {
        if(this.PjT != null) {
            if(TextUtils.isEmpty(s1)) {
                if(TextUtils.isEmpty(s)) {
                    return null;
                }
                s1 = xE.PjT(s);
            }
            gK gK0 = this.PjT.PjT();
            if(gK0 != null) {
                byte[] arr_b = (byte[])gK0.PjT(s1);
                if(arr_b != null) {
                    return new ByteArrayInputStream(arr_b);
                }
            }
            Collection collection0 = this.PjT.Zh();
            if(collection0 != null) {
                for(Object object0: collection0) {
                    InputStream inputStream0 = ((ReZ)object0).PjT(s1);
                    if(inputStream0 != null) {
                        return inputStream0;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override  // com.bytedance.sdk.component.JQp.qla
    public boolean PjT(String s, String s1, String s2) {
        if(this.PjT == null || TextUtils.isEmpty(s2)) {
            return false;
        }
        if(TextUtils.isEmpty(s1)) {
            if(TextUtils.isEmpty(s)) {
                return false;
            }
            s1 = xE.PjT(s);
        }
        ReZ reZ0 = this.PjT.PjT(s2);
        return reZ0 == null ? false : reZ0.Zh(s1);
    }

    private void Zh(Context context0, xs xs0) {
        if(this.PjT != null) {
            Log.w("ImageLoader", "already init!");
        }
        if(xs0 == null) {
            xs0 = JQp.PjT(context0);
        }
        this.PjT = new cz(context0, xs0);
    }
}

