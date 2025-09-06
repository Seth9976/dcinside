package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene;
import com.bytedance.sdk.openadsdk.multipro.cr.cr;
import com.bytedance.sdk.openadsdk.qla.ReZ;
import com.bytedance.sdk.openadsdk.qla.Zh;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public class Sks {
    private static final AtomicInteger PjT;
    private static final AtomicInteger ReZ;
    private static final AtomicInteger Zh;
    private static final AtomicInteger cr;

    static {
        AtomicInteger atomicInteger0 = new AtomicInteger();
        Sks.PjT = atomicInteger0;
        AtomicInteger atomicInteger1 = new AtomicInteger();
        Sks.Zh = atomicInteger1;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        Sks.ReZ = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        Sks.cr = atomicInteger3;
        atomicInteger0.addAndGet(cr.PjT("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger1.addAndGet(cr.PjT("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger2.addAndGet(cr.PjT("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger3.addAndGet(cr.PjT("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    public static void PjT() {
        try {
            long v = cr.PjT("encrypt_statistics_file", "upload_time_key", 0L);
            int v1 = Long.compare(v, 0L);
            if(v1 > 0 && System.currentTimeMillis() - v >= 86400000L) {
                Sks.Zh();
                synchronized(Sks.class) {
                    Sks.PjT.set(0);
                    Sks.Zh.set(0);
                    Sks.ReZ.set(0);
                    Sks.cr.set(0);
                    cr.PjT("encrypt_statistics_file");
                    cr.PjT("encrypt_statistics_file", "upload_time_key", System.currentTimeMillis());
                }
                return;
            }
            if(v1 <= 0 || v > System.currentTimeMillis()) {
                cr.PjT("encrypt_statistics_file", "upload_time_key", System.currentTimeMillis());
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void PjT(int v, CryptDataScene pangleEncryptConstant$CryptDataScene0, int v1) {
        ReZ.PjT("crypt_v4_fail", false, new Zh() {
            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            @Nullable
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("crypt", v);
                    jSONObject0.put("scene", pangleEncryptConstant$CryptDataScene0.value());
                    jSONObject0.put("reason", v1);
                    if(v1 == 6) {
                        jSONObject0.put("model", Build.MODEL);
                        jSONObject0.put("vendor", Build.MANUFACTURER);
                    }
                }
                catch(Throwable unused_ex) {
                }
                return com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().PjT("crypt_v4_fail").Zh(jSONObject0.toString());
            }
        });
    }

    public static void PjT(JSONObject jSONObject0) {
        Sks.Zh(jSONObject0 != null && jSONObject0.optInt("cypher") == 4);
    }

    public static void PjT(boolean z) {
        synchronized(Sks.class) {
            if(z) {
                cr.PjT("encrypt_statistics_file", "decrypt_success_count", Sks.ReZ.incrementAndGet());
                return;
            }
            cr.PjT("encrypt_statistics_file", "decrypt_fail_count", Sks.ReZ.incrementAndGet());
        }
    }

    private static void Zh() {
        ReZ.PjT("crypt_v4_statistics", false, new Zh() {
            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            @Nullable
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("encrypt_success_count", Sks.PjT.get());
                    jSONObject0.put("encrypt_fail_count", Sks.Zh.get());
                    jSONObject0.put("decrypt_success_count", Sks.ReZ.get());
                    jSONObject0.put("decrypt_fail_count", Sks.cr.get());
                }
                catch(Throwable unused_ex) {
                }
                return com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().PjT("crypt_v4_statistics").Zh(jSONObject0.toString());
            }
        });
    }

    public static void Zh(boolean z) {
        synchronized(Sks.class) {
            if(z) {
                cr.PjT("encrypt_statistics_file", "encrypt_success_count", Sks.PjT.incrementAndGet());
                return;
            }
            cr.PjT("encrypt_statistics_file", "encrypt_fail_count", Sks.Zh.incrementAndGet());
        }
    }
}

