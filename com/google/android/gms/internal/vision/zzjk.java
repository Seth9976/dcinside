package com.google.android.gms.internal.vision;

import java.io.IOException;

public class zzjk extends IOException {
    private zzkk zza;

    public zzjk(String s) {
        super(s);
        this.zza = null;
    }

    static zzjk zza() {
        return new zzjk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzjk zza(zzkk zzkk0) {
        this.zza = zzkk0;
        return this;
    }

    static zzjk zzb() {
        return new zzjk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzjk zzc() {
        return new zzjk("CodedInputStream encountered a malformed varint.");
    }

    static zzjk zzd() {
        return new zzjk("Protocol message contained an invalid tag (zero).");
    }

    static zzjk zze() {
        return new zzjk("Protocol message end-group tag did not match expected tag.");
    }

    static zzjn zzf() {
        return new zzjn("Protocol message tag had invalid wire type.");
    }

    static zzjk zzg() {
        return new zzjk("Failed to parse the message.");
    }

    static zzjk zzh() {
        return new zzjk("Protocol message had invalid UTF-8.");
    }
}

