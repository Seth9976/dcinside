package com.bytedance.sdk.component.JQp.cr.ReZ.PjT.PjT;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.DWo;
import com.bytedance.sdk.component.utils.XX;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import jeb.synthetic.FIN;

public class PjT {
    private int PjT;
    private File Zh;

    private PjT(int v, File file0) {
        this.PjT = v;
        this.Zh = file0;
    }

    public static PjT PjT(int v, File file0) {
        try {
            PjT pjT0 = new PjT(v, file0);
            if(file0 != null) {
                file0.mkdirs();
            }
            return pjT0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private List PjT(File file0) {
        if(file0 != null) {
            try {
                if(file0.exists() && file0.isDirectory()) {
                    File[] arr_file = file0.listFiles();
                    if(arr_file != null && arr_file.length != 0) {
                        List list0 = Arrays.asList(arr_file);
                        List list1 = new ArrayList();
                        for(Object object0: list0) {
                            File file1 = (File)object0;
                            if(file1 != null && file1.isFile() && !TextUtils.isEmpty(file1.getName()) && !file1.getName().endsWith(".temp")) {
                                list1.add(file1);
                            }
                        }
                        return list1;
                    }
                }
                return null;
            }
            catch(Throwable unused_ex) {
            }
        }
        return null;
    }

    private void PjT(File file0, File file1, boolean z) throws IOException {
        if(z) {
            PjT.cr(file1);
        }
        if(!file0.renameTo(file1)) {
            throw new IOException();
        }
    }

    public InputStream PjT(String s) {
        InputStream inputStream0;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(this.PjT <= 0) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v);
            return null;
        }
        File file0 = this.Zh(s);
        try {
            inputStream0 = null;
            inputStream0 = new FileInputStream(file0);
            this.ReZ(file0);
            FIN.finallyExec$NT(v);
            return inputStream0;
        }
        catch(FileNotFoundException unused_ex) {
            DWo.PjT(inputStream0);
            FIN.finallyExec$NT(v);
            return null;
        }
        catch(Throwable unused_ex) {
            FIN.finallyExec$NT(v);
            return null;
        }
    }

    public void PjT(int v) {
        __monitor_enter(this);
        try {
            if(v <= this.PjT) {
                List list0 = this.Zh(this.Zh);
                if(list0 != null && list0.size() > v) {
                    while(true) {
                        if(v >= list0.size()) {
                            break;
                        }
                        File file0 = (File)list0.get(v);
                        if(file0 != null && file0.exists()) {
                            file0.delete();
                        }
                        ++v;
                    }
                }
                goto label_12;
            }
            goto label_14;
        }
        catch(Throwable unused_ex) {
            __monitor_exit(this);
            return;
        }
    label_12:
        __monitor_exit(this);
        return;
    label_14:
        __monitor_exit(this);
    }

    public boolean PjT(String s, byte[] arr_b) {
        synchronized(this) {
            if(this.PjT > 0 && s != null && arr_b != null) {
                File file0 = this.ReZ(s);
                FileOutputStream fileOutputStream0 = null;
                try {
                    fileOutputStream0 = new FileOutputStream(file0);
                    fileOutputStream0.write(arr_b);
                    if(file0.exists()) {
                        this.PjT(file0, this.Zh(s), true);
                    }
                }
                catch(FileNotFoundException unused_ex) {
                    try {
                        File file1 = this.Zh;
                        if(file1 != null) {
                            file1.mkdirs();
                        }
                        return false;
                    }
                    finally {
                        DWo.PjT(fileOutputStream0);
                        List list0 = this.PjT(this.Zh);
                        if(list0 != null) {
                            int v2 = this.PjT;
                            if(list0.size() > v2) {
                                this.PjT(((int)(((double)v2) * 0.7)));
                            }
                        }
                    }
                }
                catch(Throwable unused_ex) {
                    DWo.PjT(fileOutputStream0);
                    List list1 = this.PjT(this.Zh);
                    if(list1 != null) {
                        int v3 = this.PjT;
                        if(list1.size() > v3) {
                            this.PjT(((int)(((double)v3) * 0.7)));
                        }
                    }
                    return false;
                }
                DWo.PjT(fileOutputStream0);
                List list2 = this.PjT(this.Zh);
                if(list2 != null) {
                    int v4 = this.PjT;
                    if(list2.size() > v4) {
                        this.PjT(((int)(((double)v4) * 0.7)));
                    }
                }
                return true;
            }
            return false;
        }
    }

    private File ReZ(String s) {
        return new File(this.Zh, s + ".temp");
    }

    private void ReZ(File file0) {
        if(file0 == null) {
            return;
        }
        try {
            XX.Zh(file0);
        }
        catch(Throwable unused_ex) {
        }
    }

    private File Zh(String s) {
        return new File(this.Zh, s);
    }

    private List Zh(File file0) {
        List list0 = this.PjT(file0);
        if(list0 != null && !list0.isEmpty()) {
            HashMap hashMap0 = new HashMap();
            for(Object object0: list0) {
                hashMap0.put(((File)object0), ((File)object0).lastModified());
            }
            Collections.sort(list0, new Comparator() {
                final PjT Zh;

                public int PjT(File file0, File file1) {
                    if(file0 == null && file1 == null) {
                        return 0;
                    }
                    if(file0 == null) {
                        return 1;
                    }
                    return file1 == null ? -1 : Long.compare(((long)(((Long)hashMap0.get(file1)))), ((long)(((Long)hashMap0.get(file0)))));
                }

                @Override
                public int compare(Object object0, Object object1) {
                    return this.PjT(((File)object0), ((File)object1));
                }
            });
            return list0;
        }
        return null;
    }

    private static void cr(File file0) throws IOException {
        if(file0.exists() && !file0.delete()) {
            throw new IOException();
        }
    }
}

