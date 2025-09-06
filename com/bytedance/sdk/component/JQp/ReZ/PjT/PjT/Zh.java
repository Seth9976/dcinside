package com.bytedance.sdk.component.JQp.ReZ.PjT.PjT;

import android.util.Log;
import com.bytedance.sdk.component.JQp.ReZ;
import com.bytedance.sdk.component.utils.DWo;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

public class Zh implements ReZ {
    private long PjT;
    private PjT Zh;

    public Zh(File file0, long v, ExecutorService executorService0) {
        this.PjT = v;
        try {
            this.Zh = PjT.PjT(file0, 20210302, 1, v, executorService0);
        }
        catch(IOException iOException0) {
            Log.w("LruCountDiskCache", iOException0.toString());
        }
    }

    @Override  // com.bytedance.sdk.component.JQp.ReZ
    public InputStream PjT(String s) {
        try {
            PjT pjT0 = this.Zh;
            if(pjT0 == null) {
                return null;
            }
            com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.ReZ pjT$ReZ0 = pjT0.PjT(s);
            if(pjT$ReZ0 != null) {
                return pjT$ReZ0.PjT(0);
            }
        }
        catch(IOException iOException0) {
            Log.w("LruCountDiskCache", iOException0.getMessage());
        }
        return null;
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
        com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT pjT$PjT0;
        OutputStream outputStream0;
        PjT pjT0 = this.Zh;
        if(pjT0 != null && arr_b != null && s != null) {
            try {
                outputStream0 = null;
                pjT$PjT0 = pjT0.Zh(s);
                goto label_8;
            }
            catch(IOException iOException0) {
                OutputStream outputStream1 = null;
                goto label_24;
            label_8:
                if(pjT$PjT0 == null) {
                    try {
                        Log.w("LruCountDiskCache", "save " + s + " failed for edit null");
                    }
                    catch(IOException iOException0) {
                        goto label_22;
                    }
                    catch(Throwable throwable0) {
                        DWo.PjT(outputStream0);
                        throw throwable0;
                    }
                    DWo.PjT(null);
                    return false;
                }
                try {
                    outputStream0 = pjT$PjT0.PjT(0);
                    if(outputStream0 == PjT.ReZ) {
                        Log.w("LruCountDiskCache", "save " + s + " failed for null OutputStream");
                        goto label_15;
                    }
                    goto label_17;
                }
                catch(IOException iOException0) {
                    goto label_22;
                }
                catch(Throwable throwable0) {
                    DWo.PjT(outputStream0);
                    throw throwable0;
                }
            label_15:
                DWo.PjT(outputStream0);
                return false;
                try {
                label_17:
                    outputStream0.write(arr_b);
                    pjT$PjT0.PjT();
                    this.Zh.PjT();
                    goto label_36;
                }
                catch(IOException iOException0) {
                }
                catch(Throwable throwable0) {
                    DWo.PjT(outputStream0);
                    throw throwable0;
                }
            label_22:
                outputStream1 = outputStream0;
                outputStream0 = pjT$PjT0;
                try {
                label_24:
                    Log.w("LruCountDiskCache", iOException0.toString());
                    if(outputStream0 != null) {
                        try {
                            ((com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.PjT)outputStream0).Zh();
                        }
                        catch(IOException unused_ex) {
                        }
                    }
                }
                catch(Throwable throwable0) {
                    outputStream0 = outputStream1;
                    DWo.PjT(outputStream0);
                    throw throwable0;
                }
                DWo.PjT(outputStream1);
                return false;
            }
            catch(Throwable throwable0) {
            }
            DWo.PjT(outputStream0);
            throw throwable0;
        label_36:
            DWo.PjT(outputStream0);
            return true;
        }
        return false;
    }

    public boolean ReZ(String s) {
        com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.ReZ pjT$ReZ0;
        boolean z;
        try {
            try {
                z = false;
                pjT$ReZ0 = this.Zh.PjT(s);
                goto label_10;
            }
            catch(IOException iOException0) {
            }
            Log.w("LruCountDiskCache", iOException0.getMessage());
        }
        catch(Throwable throwable0) {
            DWo.PjT(null);
            throw throwable0;
        }
        DWo.PjT(null);
        return false;
    label_10:
        if(pjT$ReZ0 != null) {
            z = true;
        }
        DWo.PjT(pjT$ReZ0);
        return z;
    }

    @Override  // com.bytedance.sdk.component.JQp.PjT
    public boolean Zh(Object object0) {
        return this.ReZ(((String)object0));
    }

    public byte[] Zh(String s) {
        byte[] arr_b1;
        Closeable closeable1;
        InputStream inputStream0;
        PjT pjT0 = this.Zh;
        Closeable closeable0 = null;
        if(pjT0 != null && s != null) {
            try {
                com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.PjT.ReZ pjT$ReZ0 = pjT0.PjT(s);
                if(pjT$ReZ0 != null) {
                    inputStream0 = pjT$ReZ0.PjT(0);
                    goto label_14;
                }
                goto label_39;
            }
            catch(IOException iOException0) {
                inputStream0 = null;
                closeable1 = null;
                goto label_29;
            }
            catch(Throwable throwable0) {
                closeable1 = null;
                DWo.PjT(closeable0);
                DWo.PjT(closeable1);
                throw throwable0;
            }
        label_14:
            if(inputStream0 == null) {
                closeable1 = null;
                arr_b1 = ((ByteArrayOutputStream)closeable1).toByteArray();
                goto label_36;
            }
            else {
                try {
                    try {
                        closeable1 = null;
                        closeable1 = new ByteArrayOutputStream();
                        byte[] arr_b = new byte[0x400];
                        while(true) {
                            int v = inputStream0.read(arr_b);
                            if(v == -1) {
                                arr_b1 = ((ByteArrayOutputStream)closeable1).toByteArray();
                                goto label_36;
                            }
                            ((ByteArrayOutputStream)closeable1).write(arr_b, 0, v);
                        }
                        closeable1 = null;
                        arr_b1 = ((ByteArrayOutputStream)closeable1).toByteArray();
                        goto label_36;
                    }
                    catch(IOException iOException0) {
                    }
                label_29:
                    Log.w("LruCountDiskCache", iOException0.toString());
                    goto label_30;
                }
                catch(Throwable throwable0) {
                    closeable0 = inputStream0;
                    DWo.PjT(closeable0);
                    DWo.PjT(closeable1);
                    throw throwable0;
                }
            }
            arr_b1 = ((ByteArrayOutputStream)closeable1).toByteArray();
            goto label_36;
        label_30:
            DWo.PjT(inputStream0);
            DWo.PjT(closeable1);
            return null;
        label_36:
            DWo.PjT(inputStream0);
            DWo.PjT(closeable1);
            return arr_b1;
        label_39:
            DWo.PjT(null);
            DWo.PjT(null);
            return null;
        }
        return null;
    }
}

