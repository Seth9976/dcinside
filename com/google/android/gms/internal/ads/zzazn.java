package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@VisibleForTesting
final class zzazn {
    @VisibleForTesting
    ByteArrayOutputStream zza;
    @VisibleForTesting
    Base64OutputStream zzb;

    public zzazn() {
        this.zza = new ByteArrayOutputStream(0x1000);
        this.zzb = new Base64OutputStream(this.zza, 10);
    }

    @Override
    public final String toString() {
        String s;
        try {
            this.zzb.close();
        }
        catch(IOException iOException0) {
            zzo.zzh("HashManager: Unable to convert to Base64.", iOException0);
        }
        try {
            this.zza.close();
            s = this.zza.toString();
        }
        catch(IOException iOException1) {
            zzo.zzh("HashManager: Unable to convert to Base64.", iOException1);
            s = "";
        }
        finally {
            this.zza = null;
            this.zzb = null;
        }
        return s;
    }
}

