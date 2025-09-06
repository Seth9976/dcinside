package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.component.utils.XX;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.cr.PjT;
import com.bytedance.sdk.openadsdk.utils.Qf;
import com.bytedance.sdk.openadsdk.utils.xf;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

public class ReZ {
    private static final ConcurrentHashMap PjT;

    static {
        ReZ.PjT = new ConcurrentHashMap();
    }

    @NonNull
    public static Zh PjT(String s) {
        Zh zh0 = (Zh)ReZ.PjT.get(s);
        return zh0 == null ? ReZ.Zh(s) : zh0;
    }

    private static Zh PjT(JSONObject jSONObject0) {
        return jSONObject0 == null ? null : new Zh(jSONObject0);
    }

    public static void PjT() {
        File file0 = ReZ.Zh();
        if(file0.exists()) {
            file0.delete();
        }
    }

    @WorkerThread
    public static void PjT(JSONArray jSONArray0) {
        FileWriter fileWriter1;
        if(jSONArray0 == null) {
            return;
        }
        File file0 = ReZ.Zh();
        File file1 = new File(file0.getParent(), file0.getName() + ".tmp");
        FileWriter fileWriter0 = null;
        try {
            if(file1.exists()) {
                file1.delete();
            }
            fileWriter1 = new FileWriter(file1);
        }
        catch(Exception exception0) {
            goto label_19;
        }
        catch(Throwable throwable0) {
            goto label_26;
        }
        try {
            fileWriter1.write(jSONArray0.toString());
            file1.renameTo(file0);
            Qf.PjT("tt_sdk_settings", ub.PjT()).PjT("ad_slot_conf");
            goto label_30;
        }
        catch(Exception exception0) {
            fileWriter0 = fileWriter1;
            try {
                while(true) {
                    Log.e("SdkSettings.AdSlot", "saveAdSlotToLocal: ", exception0);
                    break;
                    try {
                        goto label_26;
                    label_19:
                    }
                    catch(Exception exception0) {
                    }
                }
            }
            catch(Throwable throwable0) {
                goto label_26;
            }
            if(file1.exists()) {
                file1.delete();
            }
            xf.PjT(fileWriter0);
            goto label_33;
        }
        catch(Throwable throwable0) {
            fileWriter0 = fileWriter1;
        }
    label_26:
        if(file1.exists()) {
            file1.delete();
        }
        xf.PjT(fileWriter0);
        throw throwable0;
    label_30:
        if(file1.exists()) {
            file1.delete();
        }
        xf.PjT(fileWriter1);
    label_33:
        HashMap hashMap0 = ReZ.Zh(jSONArray0);
        if(!hashMap0.isEmpty()) {
            for(Object object0: hashMap0.entrySet()) {
                String s = (String)((Map.Entry)object0).getKey();
                Zh zh0 = (Zh)((Map.Entry)object0).getValue();
                ReZ.PjT.put(s, zh0);
            }
        }
    }

    @WorkerThread
    public static void PjT(boolean z) {
        File file0 = ReZ.Zh();
        if(!file0.exists()) {
            String s = com.bytedance.sdk.openadsdk.multipro.Zh.ReZ() ? PjT.Zh("tt_sdk_settings", "ad_slot_conf", null) : Qf.PjT("tt_sdk_settings", ub.PjT()).PjT("ad_slot_conf", null);
            if(!TextUtils.isEmpty(s)) {
                try {
                    HashMap hashMap0 = ReZ.Zh(new JSONArray(s));
                    if(!hashMap0.isEmpty()) {
                        ReZ.PjT.clear();
                        ReZ.PjT.putAll(hashMap0);
                    }
                    return;
                }
                catch(Exception unused_ex) {
                }
            }
            return;
        }
        try {
            HashMap hashMap1 = ReZ.Zh(new JSONArray(new String(XX.cr(file0))));
            if(!hashMap1.isEmpty()) {
                for(Object object0: hashMap1.entrySet()) {
                    String s1 = (String)((Map.Entry)object0).getKey();
                    Zh zh0 = (Zh)((Map.Entry)object0).getValue();
                    ReZ.PjT.put(s1, zh0);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private static Zh Zh(String s) {
        return new Zh(s, 1);
    }

    @NonNull
    private static File Zh() {
        return new File(ub.PjT().getFilesDir(), "tt_ads_conf_sr");
    }

    @NonNull
    private static HashMap Zh(JSONArray jSONArray0) {
        HashMap hashMap0 = new HashMap();
        try {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                Zh zh0 = ReZ.PjT(jSONArray0.getJSONObject(v));
                if(zh0 != null) {
                    hashMap0.put(zh0.PjT, zh0);
                }
            }
        }
        catch(Exception unused_ex) {
        }
        return hashMap0;
    }
}

