package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class zzgn extends zzfr {
    @Nullable
    private RandomAccessFile zza;
    @Nullable
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzgn() {
        super(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] arr_b, int v, int v1) throws zzgm {
        int v3;
        if(v1 == 0) {
            return 0;
        }
        long v2 = this.zzc;
        if(v2 == 0L) {
            return -1;
        }
        try {
            v3 = this.zza.read(arr_b, v, ((int)Math.min(v2, v1)));
        }
        catch(IOException iOException0) {
            throw new zzgm(iOException0, 2000);
        }
        if(v3 > 0) {
            this.zzc -= (long)v3;
            this.zzg(v3);
        }
        return v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgd0) throws zzgm {
        long v1;
        RandomAccessFile randomAccessFile0;
        Uri uri0 = zzgd0.zza;
        this.zzb = uri0;
        this.zzi(zzgd0);
        int v = 2006;
        try {
            String s = uri0.getPath();
            if(s == null) {
                throw null;
            }
            randomAccessFile0 = new RandomAccessFile(s, "r");
            this.zza = randomAccessFile0;
        }
        catch(FileNotFoundException fileNotFoundException0) {
            if(!TextUtils.isEmpty(uri0.getQuery()) || !TextUtils.isEmpty(uri0.getFragment())) {
                throw new zzgm(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing \'?\' or \'#\'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri0.getPath(), uri0.getQuery(), uri0.getFragment()), fileNotFoundException0, 1004);
            }
            if(!(fileNotFoundException0.getCause() instanceof ErrnoException) || ((ErrnoException)fileNotFoundException0.getCause()).errno != OsConstants.EACCES) {
                v = 2005;
            }
            throw new zzgm(fileNotFoundException0, v);
        }
        catch(SecurityException securityException0) {
            throw new zzgm(securityException0, 2006);
        }
        catch(RuntimeException runtimeException0) {
            throw new zzgm(runtimeException0, 2000);
        }
        try {
            randomAccessFile0.seek(zzgd0.zze);
            v1 = zzgd0.zzf;
            if(v1 == -1L) {
                v1 = this.zza.length() - zzgd0.zze;
            }
        }
        catch(IOException iOException0) {
            throw new zzgm(iOException0, 2000);
        }
        this.zzc = v1;
        if(v1 < 0L) {
            throw new zzgm(null, null, 2008);
        }
        this.zzd = true;
        this.zzj(zzgd0);
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws zzgm {
        try {
            this.zzb = null;
            RandomAccessFile randomAccessFile0 = this.zza;
            if(randomAccessFile0 != null) {
                randomAccessFile0.close();
            }
        }
        catch(IOException iOException0) {
            throw new zzgm(iOException0, 2000);
        }
        finally {
            this.zza = null;
            if(this.zzd) {
                this.zzd = false;
                this.zzh();
            }
        }
    }
}

