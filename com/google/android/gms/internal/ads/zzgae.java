package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public final class zzgae implements FilenameFilter {
    private final Pattern zza;

    public zzgae(Pattern pattern0) {
        pattern0.getClass();
        this.zza = pattern0;
    }

    @Override
    public final boolean accept(File file0, String s) {
        return this.zza.matcher(s).matches();
    }
}

