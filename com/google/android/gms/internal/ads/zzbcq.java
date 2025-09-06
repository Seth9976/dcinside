package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import o3.j;

@Deprecated
@j
public final class zzbcq {
    @VisibleForTesting
    final BlockingQueue zza;
    @VisibleForTesting
    final LinkedHashMap zzb;
    @VisibleForTesting
    final Map zzc;
    @VisibleForTesting
    String zzd;
    @VisibleForTesting
    Context zze;
    @VisibleForTesting
    String zzf;
    private final HashSet zzg;
    private AtomicBoolean zzh;
    private File zzi;

    public zzbcq() {
        this.zza = new ArrayBlockingQueue(100);
        this.zzb = new LinkedHashMap();
        this.zzc = new HashMap();
        this.zzg = new HashSet(Arrays.asList(new String[]{"noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"}));
    }

    public final zzbcw zza(String s) {
        zzbcw zzbcw0 = (zzbcw)this.zzc.get(s);
        return zzbcw0 == null ? zzbcw.zza : zzbcw0;
    }

    final Map zzb(Map map0, @Nullable Map map1) {
        Map map2 = new LinkedHashMap(map0);
        for(Object object0: map1.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            String s1 = (String)((Map.Entry)object0).getValue();
            String s2 = (String)map2.get(s);
            map2.put(s, this.zza(s).zza(s2, s1));
        }
        return map2;
    }

    // 检测为 Lambda 实现
    public static void zzc(zzbcq zzbcq0) [...]

    public final void zzd(Context context0, String s, String s1, Map map0) {
        this.zze = context0;
        this.zzf = s;
        this.zzd = s1;
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        this.zzh = atomicBoolean0;
        atomicBoolean0.set(((Boolean)zzbeg.zzc.zze()).booleanValue());
        if(this.zzh.get()) {
            File file0 = Environment.getExternalStorageDirectory();
            if(file0 != null) {
                this.zzi = new File(zzfpv.zza(zzfpu.zza(), file0, "sdk_csi_data.txt"));
            }
        }
        for(Object object0: map0.entrySet()) {
            String s2 = (String)((Map.Entry)object0).getKey();
            String s3 = (String)((Map.Entry)object0).getValue();
            this.zzb.put(s2, s3);
        }
        zzbcp zzbcp0 = () -> {
            zzbcz zzbcz0;
            zzbda zzbda0;
            while(true) {
                try {
                label_0:
                    zzbda0 = (zzbda)this.zza.take();
                    zzbcz0 = zzbda0.zza();
                }
                catch(InterruptedException interruptedException0) {
                    zzo.zzk("CsiReporter:reporter interrupted", interruptedException0);
                    return;
                }
                if(TextUtils.isEmpty(zzbcz0.zzb())) {
                    goto label_0;
                }
                Map map0 = zzbda0.zzb();
                this.zzg(this.zzb(this.zzb, map0), zzbcz0);
            }
        };
        zzbzw.zza.execute(zzbcp0);
        this.zzc.put("action", zzbcw.zzb);
        this.zzc.put("ad_format", zzbcw.zzb);
        this.zzc.put("e", zzbcw.zzc);
    }

    public final void zze(String s) {
        if(this.zzg.contains(s)) {
            return;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put("sdkVersion", this.zzf);
        linkedHashMap0.put("ue", s);
        this.zzg(this.zzb(this.zzb, linkedHashMap0), null);
    }

    public final boolean zzf(zzbda zzbda0) {
        return this.zza.offer(zzbda0);
    }

    private final void zzg(Map map0, zzbcz zzbcz0) {
        FileOutputStream fileOutputStream0;
        Uri.Builder uri$Builder0 = Uri.parse(this.zzd).buildUpon();
        for(Object object0: map0.entrySet()) {
            uri$Builder0.appendQueryParameter(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        String s = uri$Builder0.build().toString();
        if(zzbcz0 != null) {
            StringBuilder stringBuilder0 = new StringBuilder(s);
            if(!TextUtils.isEmpty(zzbcz0.zzb())) {
                stringBuilder0.append("&it=");
                stringBuilder0.append(zzbcz0.zzb());
            }
            if(!TextUtils.isEmpty(zzbcz0.zza())) {
                stringBuilder0.append("&blat=");
                stringBuilder0.append(zzbcz0.zza());
            }
            s = stringBuilder0.toString();
        }
        if(this.zzh.get()) {
            File file0 = this.zzi;
            if(file0 != null) {
                try {
                    try {
                        fileOutputStream0 = null;
                        fileOutputStream0 = new FileOutputStream(file0, true);
                        fileOutputStream0.write(s.getBytes());
                        fileOutputStream0.write(10);
                        goto label_39;
                    }
                    catch(IOException iOException0) {
                    }
                    zzo.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", iOException0);
                    if(fileOutputStream0 != null) {
                        goto label_27;
                    }
                    return;
                }
                catch(Throwable throwable0) {
                    goto label_33;
                }
                try {
                label_27:
                    fileOutputStream0.close();
                    return;
                }
                catch(IOException iOException1) {
                    zzo.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", iOException1);
                }
                return;
            label_33:
                if(fileOutputStream0 != null) {
                    try {
                        fileOutputStream0.close();
                    }
                    catch(IOException iOException2) {
                        zzo.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", iOException2);
                    }
                }
                throw throwable0;
                try {
                label_39:
                    fileOutputStream0.close();
                }
                catch(IOException iOException3) {
                    zzo.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", iOException3);
                }
                return;
            }
            zzo.zzj("CsiReporter: File doesn\'t exist. Cannot write CSI data to file.");
            return;
        }
        zzs.zzM(this.zze, this.zzf, s);
    }
}

