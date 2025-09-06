package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbod {
    public static final zzboa zza;
    public static final zzbny zzb;
    private static final Charset zzc;

    static {
        zzbod.zzc = Charset.forName("UTF-8");
        zzbod.zza = new zzboc();
        zzbod.zzb = (JSONObject jSONObject0) -> new ByteArrayInputStream(jSONObject0.toString().getBytes(zzbod.zzc));
    }

    // 检测为 Lambda 实现
    static InputStream zza(JSONObject jSONObject0) throws JSONException [...]
}

