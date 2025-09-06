package com.bytedance.sdk.component.adexpress.PjT.Zh;

import com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONObject;

public class Au {
    private static PjT PjT;

    public static void PjT() {
        InputStream inputStream0 = null;
        try {
            File file0 = new File(JQp.Au(), "temp_pkg_info.json");
            long v = file0.length();
            Long long0 = v;
            if(v <= 0L || !file0.exists() || !file0.isFile()) {
                goto label_17;
            }
            else {
                byte[] arr_b = new byte[long0.intValue()];
                FileInputStream fileInputStream0 = new FileInputStream(file0);
                try {
                    fileInputStream0.read(arr_b);
                    PjT pjT0 = PjT.PjT(new JSONObject(new String(arr_b, "utf-8")));
                    if(pjT0 != null) {
                        Au.PjT = pjT0;
                    }
                    inputStream0 = fileInputStream0;
                    goto label_17;
                }
                catch(Throwable unused_ex) {
                    inputStream0 = fileInputStream0;
                    goto label_14;
                }
            }
            return;
        }
        catch(Throwable unused_ex) {
        }
    label_14:
        if(inputStream0 != null) {
            try {
                inputStream0.close();
                return;
            label_17:
                if(inputStream0 != null) {
                    try {
                        inputStream0.close();
                    }
                    catch(IOException unused_ex) {
                    }
                }
            }
            catch(IOException unused_ex) {
            }
        }
    }

    public static void PjT(PjT pjT0) {
        synchronized(Au.class) {
            if(pjT0 != null && pjT0.Au()) {
                Au.PjT = pjT0;
            }
        }
    }

    public static boolean PjT(String s) {
        return ReZ.PjT(Au.Zh(), s);
    }

    public static void ReZ() {
        ReZ.PjT(JQp.Au(), Au.Zh(), "temp_pkg_info.json");
    }

    public static PjT Zh() {
        synchronized(Au.class) {
        }
        return Au.PjT;
    }

    public static boolean Zh(PjT pjT0) {
        return ReZ.ReZ(Au.Zh(), pjT0);
    }

    public static void cr() {
        ReZ.Zh(JQp.Au(), Au.Zh(), "temp_pkg_info.json");
        Au.PjT = null;
    }
}

