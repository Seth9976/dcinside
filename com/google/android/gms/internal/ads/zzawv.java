package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class zzawv extends zzaxr {
    public zzawv(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1) {
        super(zzawd0, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", zzasc0, v, 24);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    public final Object call() throws Exception {
        this.zzk();
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if(!this.zza.zzq()) {
            synchronized(this.zzd) {
                String s = (String)this.zze.invoke(null, this.zza.zzb());
                this.zzd.zzs(s);
            }
            return;
        }
        this.zzc();
    }

    private final void zzc() {
        AdvertisingIdClient advertisingIdClient0 = this.zza.zzh();
        if(advertisingIdClient0 != null) {
            try {
                Info advertisingIdClient$Info0 = advertisingIdClient0.getInfo();
                String s = advertisingIdClient$Info0.getId();
                if(s != null && s.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                    UUID uUID0 = UUID.fromString(s);
                    byte[] arr_b = new byte[16];
                    ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
                    byteBuffer0.putLong(uUID0.getMostSignificantBits());
                    byteBuffer0.putLong(uUID0.getLeastSignificantBits());
                    s = zzatr.zza(arr_b, true);
                }
                if(s != null) {
                    synchronized(this.zzd) {
                        this.zzd.zzs(s);
                        this.zzd.zzr(advertisingIdClient$Info0.isLimitAdTrackingEnabled());
                        this.zzd.zzab(6);
                    }
                }
            }
            catch(IOException unused_ex) {
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    public final Void zzk() throws Exception {
        if(this.zza.zzr()) {
            super.zzk();
            return null;
        }
        if(this.zza.zzq()) {
            this.zzc();
        }
        return null;
    }
}

