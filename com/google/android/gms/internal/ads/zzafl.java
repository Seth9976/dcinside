package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class zzafl {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzafl() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0x200);
        this.zza = byteArrayOutputStream0;
        this.zzb = new DataOutputStream(byteArrayOutputStream0);
    }

    public final byte[] zza(zzafk zzafk0) {
        this.zza.reset();
        try {
            zzafl.zzb(this.zzb, zzafk0.zza);
            zzafl.zzb(this.zzb, (zzafk0.zzb == null ? "" : zzafk0.zzb));
            this.zzb.writeLong(zzafk0.zzc);
            this.zzb.writeLong(zzafk0.zzd);
            this.zzb.write(zzafk0.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        }
        catch(IOException iOException0) {
        }
        throw new RuntimeException(iOException0);
    }

    private static void zzb(DataOutputStream dataOutputStream0, String s) throws IOException {
        dataOutputStream0.writeBytes(s);
        dataOutputStream0.writeByte(0);
    }
}

