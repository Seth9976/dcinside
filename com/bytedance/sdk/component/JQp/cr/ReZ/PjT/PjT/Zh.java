package com.bytedance.sdk.component.JQp.cr.ReZ.PjT.PjT;

import com.bytedance.sdk.component.JQp.ReZ;
import com.bytedance.sdk.component.utils.DWo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Zh implements ReZ {
    private int PjT;
    private PjT Zh;

    public Zh(File file0, long v) {
        this.PjT = (int)v;
        this.Zh = PjT.PjT(((int)v), file0);
    }

    @Override  // com.bytedance.sdk.component.JQp.ReZ
    public InputStream PjT(String s) {
        return this.Zh == null ? null : this.Zh.PjT(s);
    }

    @Override  // com.bytedance.sdk.component.JQp.PjT
    public Object PjT(Object object0) {
        return this.Zh(((String)object0));
    }

    @Override  // com.bytedance.sdk.component.JQp.PjT
    public boolean PjT(Object object0, Object object1) {
        return this.PjT(((String)object0), ((byte[])object1));
    }

    public boolean PjT(String s, byte[] arr_b) {
        return this.Zh == null || arr_b == null || s == null ? false : this.Zh.PjT(s, arr_b);
    }

    public boolean ReZ(String s) {
        InputStream inputStream0;
        boolean z = false;
        try {
            inputStream0 = this.Zh.PjT(s);
        }
        catch(Throwable unused_ex) {
            try {
                throwable0.getMessage();
                return false;
            }
            finally {
                DWo.PjT(null);
            }
        }
        if(inputStream0 != null) {
            z = true;
        }
        DWo.PjT(inputStream0);
        return z;
    }

    @Override  // com.bytedance.sdk.component.JQp.PjT
    public boolean Zh(Object object0) {
        return this.ReZ(((String)object0));
    }

    public byte[] Zh(String s) {
        byte[] arr_b1;
        Throwable throwable1;
        ByteArrayOutputStream byteArrayOutputStream0;
        InputStream inputStream0;
        PjT pjT0 = this.Zh;
        if(pjT0 != null && s != null) {
            try {
                inputStream0 = null;
                inputStream0 = pjT0.PjT(s);
            }
            catch(IOException unused_ex) {
                byteArrayOutputStream0 = null;
                goto label_34;
            }
            catch(Throwable throwable0) {
                byteArrayOutputStream0 = null;
                throwable1 = throwable0;
                goto label_28;
            }
            if(inputStream0 == null) {
                goto label_23;
            }
            else {
                try {
                    byteArrayOutputStream0 = null;
                    byteArrayOutputStream0 = new ByteArrayOutputStream();
                    goto label_18;
                }
                catch(IOException unused_ex) {
                    goto label_34;
                }
                catch(Throwable throwable2) {
                }
                try {
                    throwable1 = throwable2;
                    goto label_28;
                label_18:
                    byte[] arr_b = new byte[0x400];
                    while(true) {
                        int v = inputStream0.read(arr_b);
                        if(v == -1) {
                            goto label_24;
                        }
                        byteArrayOutputStream0.write(arr_b, 0, v);
                    }
                label_23:
                    byteArrayOutputStream0 = null;
                label_24:
                    if(byteArrayOutputStream0 != null) {
                        arr_b1 = byteArrayOutputStream0.toByteArray();
                        goto label_31;
                    }
                    goto label_34;
                }
                catch(IOException unused_ex) {
                    goto label_34;
                }
                catch(Throwable throwable1) {
                    goto label_28;
                }
            }
            goto label_24;
        label_28:
            DWo.PjT(inputStream0);
            DWo.PjT(byteArrayOutputStream0);
            throw throwable1;
        label_31:
            DWo.PjT(inputStream0);
            DWo.PjT(byteArrayOutputStream0);
            return arr_b1;
        label_34:
            DWo.PjT(inputStream0);
            DWo.PjT(byteArrayOutputStream0);
            return null;
        }
        return null;
    }
}

