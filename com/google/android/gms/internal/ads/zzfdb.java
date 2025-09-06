package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class zzfdb {
    @Nullable
    private final Pattern zza;

    @VisibleForTesting
    public zzfdb() {
        Pattern pattern0 = null;
        try {
            pattern0 = Pattern.compile(((String)zzbe.zzc().zza(zzbcl.zzgH)));
        }
        catch(PatternSyntaxException unused_ex) {
        }
        this.zza = pattern0;
    }

    @Nullable
    public final String zza(@Nullable String s) {
        Pattern pattern0 = this.zza;
        if(pattern0 != null && s != null) {
            Matcher matcher0 = pattern0.matcher(s);
            return matcher0.find() ? matcher0.group() : null;
        }
        return null;
    }
}

