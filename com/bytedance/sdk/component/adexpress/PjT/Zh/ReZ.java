package com.bytedance.sdk.component.adexpress.PjT.Zh;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.XX.Zh;
import com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT;
import com.bytedance.sdk.component.utils.JQp;
import com.bytedance.sdk.component.utils.ZX;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class ReZ {
    public static void PjT(File file0, PjT pjT0, String s) {
        FileOutputStream fileOutputStream0;
        if(pjT0 == null) {
            return;
        }
        String s1 = pjT0.DWo();
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        File file1 = new File(file0, s);
        File file2 = new File(file1 + ".tmp");
        if(file2.exists()) {
            file2.delete();
        }
        try {
            fileOutputStream0 = null;
            fileOutputStream0 = new FileOutputStream(file2);
            fileOutputStream0.write(s1.getBytes("utf-8"));
            if(file1.exists()) {
                file1.delete();
            }
            file2.renameTo(file1);
        }
        catch(Throwable unused_ex) {
            if(fileOutputStream0 != null) {
                try {
                    fileOutputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            return;
        }
        try {
            fileOutputStream0.close();
        }
        catch(IOException unused_ex) {
        }
    }

    @Deprecated
    public static boolean PjT(PjT pjT0, String s) {
        if(pjT0 == null) {
            return true;
        }
        else {
            try {
                if(!TextUtils.isEmpty(pjT0.ReZ())) {
                    return TextUtils.isEmpty(s) ? false : ReZ.PjT(pjT0.ReZ(), s);
                }
                return true;
            }
            catch(Throwable unused_ex) {
            }
        }
        return false;
    }

    private static boolean PjT(String s, String s1) {
        String[] arr_s = s1.split("\\.");
        String[] arr_s1 = s.split("\\.");
        int v = Math.min(arr_s.length, arr_s1.length);
        int v1 = 0;
        while(v1 < v) {
            int v2 = arr_s[v1].length() - arr_s1[v1].length();
            if(v2 == 0) {
                int v3 = arr_s[v1].compareTo(arr_s1[v1]);
                if(v3 > 0) {
                    return true;
                }
                if(v3 < 0) {
                    return false;
                }
                if(v1 == v - 1) {
                    return arr_s.length > arr_s1.length;
                }
                ++v1;
                continue;
            }
            return v2 > 0;
        }
        return false;
    }

    private boolean PjT(List list0, List list1) {
        for(Object object0: list0) {
            String s = ((com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0).PjT();
            String s1 = JQp.PjT(s);
            File file0 = new File(this.PjT(), s1);
            File file1 = new File(file0 + ".tmp");
            if(file0.exists()) {
                try {
                    file0.delete();
                }
                catch(Throwable unused_ex) {
                }
            }
            if(file1.exists()) {
                try {
                    file1.delete();
                }
                catch(Throwable unused_ex) {
                }
            }
            com.bytedance.sdk.component.XX.Zh.PjT pjT0 = com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().ReZ().cz();
            pjT0.Zh(s);
            pjT0.PjT(this.PjT().getAbsolutePath(), s1);
            Zh zh0 = pjT0.PjT();
            list1.add(((com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0));
            if(zh0 == null || !zh0.cz() || zh0.JQp() == null || !zh0.JQp().exists()) {
                this.ReZ(list1);
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private static boolean PjT(Map map0, Map map1) {
        if(map0.size() != map1.size()) {
            return true;
        }
        for(Object object0: map1.keySet()) {
            PjT pjT0 = (PjT)map0.get(((String)object0));
            if(pjT0 == null) {
                return true;
            }
            PjT pjT1 = (PjT)map1.get(((String)object0));
            if(pjT1 == null) {
                return false;
            }
            if(ReZ.PjT(pjT0.ReZ(), pjT1.ReZ())) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public abstract File PjT();

    public List PjT(PjT pjT0, PjT pjT1) {
        Map map0 = pjT0.PjT();
        List list0 = new ArrayList();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        if(map0.size() != 0) {
            if(pjT1 != null && pjT1.PjT().size() != 0) {
                Map map2 = pjT1.PjT();
                for(Object object1: map0.keySet()) {
                    PjT pjT3 = (PjT)map0.get(((String)object1));
                    PjT pjT4 = (PjT)map2.get(((String)object1));
                    if(pjT4 == null && pjT3 != null) {
                        arrayList0.addAll(pjT3.cz());
                    }
                    else if(pjT3 == null && pjT4 != null) {
                        list0.addAll(pjT4.cz());
                    }
                    else if(pjT3 != null) {
                        for(Object object2: pjT3.cz()) {
                            com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT pjT$PjT0 = (com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object2;
                            if(pjT$PjT0 != null && !pjT4.cz().contains(pjT$PjT0) && pjT$PjT0.Zh() != null && pjT$PjT0.PjT() != null) {
                                arrayList0.add(pjT$PjT0);
                            }
                        }
                        for(Object object3: pjT4.cz()) {
                            com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT pjT$PjT1 = (com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object3;
                            if(pjT$PjT1 != null && !pjT3.cz().contains(pjT$PjT1)) {
                                list0.add(pjT$PjT1);
                            }
                        }
                    }
                }
                return this.PjT(arrayList0, arrayList1) ? list0 : null;
            }
            if(map0.size() != 0) {
                for(Object object4: map0.keySet()) {
                    PjT pjT5 = (PjT)map0.get(((String)object4));
                    if(pjT5 != null) {
                        arrayList0.addAll(pjT5.cz());
                    }
                }
            }
        }
        else if(pjT1 != null && pjT1.PjT().size() != 0) {
            Map map1 = pjT1.PjT();
            for(Object object0: map1.keySet()) {
                PjT pjT2 = (PjT)map1.get(((String)object0));
                if(pjT2 != null) {
                    list0.addAll(pjT2.cz());
                }
            }
            return this.PjT(arrayList0, arrayList1) ? list0 : null;
        }
        return this.PjT(arrayList0, arrayList1) ? list0 : null;
    }

    public void PjT(int v) {
        if(com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().cr() != null) {
            com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().cr().PjT(v);
        }
    }

    protected boolean PjT(com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.Zh pjT$Zh0) {
        if(pjT$Zh0 != null && this.PjT() != null) {
            List list0 = pjT$Zh0.Zh();
            if(list0 != null && list0.size() > 0) {
                for(Object object0: list0) {
                    File file0 = new File(this.PjT(), ((String)((Pair)object0).first));
                    if(!file0.exists() || !file0.isFile()) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean PjT(String s) {
        String s1 = JQp.PjT(s);
        File file0 = new File(this.PjT().getAbsoluteFile(), s1 + ".zip");
        com.bytedance.sdk.component.XX.Zh.PjT pjT0 = com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().ReZ().cz();
        pjT0.Zh(s);
        pjT0.PjT(file0.getParent(), file0.getName());
        Zh zh0 = pjT0.PjT();
        if(zh0.cz() && zh0.JQp() != null && zh0.JQp().exists()) {
            try {
                File file1 = zh0.JQp();
                ZX.PjT(file1.getAbsolutePath(), file0.getParent());
                if(file1.exists()) {
                    file1.delete();
                }
                return true;
            }
            catch(Exception unused_ex) {
            }
        }
        return false;
    }

    protected boolean PjT(List list0) {
        if(list0 != null && list0.size() > 0 && this.PjT() != null) {
            for(Object object0: list0) {
                String s = JQp.PjT(((com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0).PjT());
                if(TextUtils.isEmpty(s)) {
                    return false;
                }
                File file0 = new File(this.PjT(), s);
                String s1 = JQp.PjT(file0);
                if(!file0.exists() || !file0.isFile() || ((com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0).Zh() == null || !((com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0).Zh().equals(s1)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    protected boolean PjT(Map map0) {
        if(map0 != null && map0.size() != 0) {
            for(Object object0: map0.keySet()) {
                PjT pjT0 = (PjT)map0.get(((String)object0));
                if(pjT0 != null && !this.PjT(pjT0.cz())) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean ReZ(PjT pjT0, PjT pjT1) {
        if(pjT0 != null) {
            try {
                if(!TextUtils.isEmpty(pjT0.ReZ())) {
                    if(pjT1 == null) {
                        return false;
                    }
                    String s = pjT1.XX();
                    if(!TextUtils.isEmpty(s) && !s.equals(pjT0.XX())) {
                        return true;
                    }
                    if(ReZ.PjT(pjT0.ReZ(), pjT1.ReZ())) {
                        return true;
                    }
                    Map map0 = pjT0.PjT();
                    Map map1 = pjT1.PjT();
                    if(map0.isEmpty()) {
                        return !map1.isEmpty();
                    }
                    return map1.isEmpty() ? false : ReZ.PjT(map0, map1);
                }
                return true;
            }
            catch(Throwable unused_ex) {
            }
            return false;
        }
        return true;
    }

    public void ReZ(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                String s = JQp.PjT(((com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0).PjT());
                File file0 = new File(this.PjT(), s);
                File file1 = new File(file0 + ".tmp");
                if(file0.exists()) {
                    try {
                        file0.delete();
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                if(file1.exists()) {
                    try {
                        file1.delete();
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
        }
    }

    public static void Zh(File file0, PjT pjT0, String s) {
        if(pjT0 == null) {
            return;
        }
        if(file0 == null) {
            return;
        }
        try {
            new File(file0, s).delete();
        }
        catch(Throwable unused_ex) {
        }
        if(pjT0.cz() != null) {
            for(Object object0: pjT0.cz()) {
                com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT pjT$PjT0 = (com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0;
                try {
                    new File(file0, JQp.PjT(pjT$PjT0.PjT())).delete();
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    public List Zh(PjT pjT0, PjT pjT1) {
        List list0 = new ArrayList();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        if(pjT1 != null && !pjT1.cz().isEmpty()) {
            if(pjT0.cz().isEmpty()) {
                list0.addAll(pjT1.cz());
                return this.PjT(arrayList0, arrayList1) ? list0 : null;
            }
            for(Object object0: pjT0.cz()) {
                com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT pjT$PjT0 = (com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0;
                if(!pjT1.cz().contains(pjT$PjT0) && pjT$PjT0 != null && pjT$PjT0.PjT() != null && pjT$PjT0.Zh() != null) {
                    arrayList0.add(pjT$PjT0);
                }
            }
            for(Object object1: pjT1.cz()) {
                com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT pjT$PjT1 = (com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object1;
                if(!pjT0.cz().contains(pjT$PjT1)) {
                    list0.add(pjT$PjT1);
                }
            }
            return this.PjT(arrayList0, arrayList1) ? list0 : null;
        }
        arrayList0.addAll(pjT0.cz());
        return this.PjT(arrayList0, arrayList1) ? list0 : null;
    }

    public void Zh(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                String s = JQp.PjT(((com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT.PjT)object0).PjT());
                File file0 = new File(this.PjT(), s);
                File file1 = new File(file0 + ".tmp");
                if(file0.exists()) {
                    try {
                        file0.delete();
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                if(file1.exists()) {
                    try {
                        file1.delete();
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
        }
    }
}

