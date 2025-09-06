package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class zzfv extends zzfr {
    private final ContentResolver zza;
    @Nullable
    private Uri zzb;
    @Nullable
    private AssetFileDescriptor zzc;
    @Nullable
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzfv(Context context0) {
        super(false);
        this.zza = context0.getContentResolver();
    }

    @Override  // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] arr_b, int v, int v1) throws zzfu {
        int v3;
        if(v1 == 0) {
            return 0;
        }
        long v2 = this.zze;
        if(v2 != 0L) {
            try {
                if(v2 != -1L) {
                    v1 = (int)Math.min(v2, v1);
                }
                v3 = this.zzd.read(arr_b, v, v1);
            }
            catch(IOException iOException0) {
                throw new zzfu(iOException0, 2000);
            }
            if(v3 == -1) {
                return -1;
            }
            long v4 = this.zze;
            if(v4 != -1L) {
                this.zze = v4 - ((long)v3);
            }
            this.zzg(v3);
            return v3;
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgd0) throws zzfu {
        int v7;
        IOException iOException1;
        long v5;
        AssetFileDescriptor assetFileDescriptor0;
        Uri uri0;
        try {
            uri0 = zzgd0.zza.normalizeScheme();
            this.zzb = uri0;
            this.zzi(zzgd0);
            if("content".equals(uri0.getScheme())) {
                Bundle bundle0 = new Bundle();
                bundle0.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptor0 = this.zza.openTypedAssetFileDescriptor(uri0, "*/*", bundle0);
            }
            else {
                assetFileDescriptor0 = this.zza.openAssetFileDescriptor(uri0, "r");
            }
            this.zzc = assetFileDescriptor0;
            if(assetFileDescriptor0 != null) {
                long v = assetFileDescriptor0.getLength();
                FileInputStream fileInputStream0 = new FileInputStream(assetFileDescriptor0.getFileDescriptor());
                this.zzd = fileInputStream0;
                int v1 = Long.compare(v, -1L);
                if(v1 != 0 && zzgd0.zze > v) {
                    throw new zzfu(null, 2008);
                }
                long v2 = assetFileDescriptor0.getStartOffset();
                long v3 = fileInputStream0.skip(zzgd0.zze + v2) - v2;
                if(v3 != zzgd0.zze) {
                    throw new zzfu(null, 2008);
                }
                if(v1 == 0) {
                    FileChannel fileChannel0 = fileInputStream0.getChannel();
                    long v4 = fileChannel0.size();
                    if(v4 == 0L) {
                        this.zze = -1L;
                        v5 = -1L;
                    }
                    else {
                        v5 = v4 - fileChannel0.position();
                        this.zze = v5;
                        if(v5 < 0L) {
                            throw new zzfu(null, 2008);
                        }
                    }
                }
                else {
                    v5 = v - v3;
                    this.zze = v5;
                    if(v5 < 0L) {
                        throw new zzfu(null, 2008);
                    }
                }
                goto label_36;
            }
            goto label_44;
        }
        catch(zzfu zzfu0) {
            throw zzfu0;
        }
        catch(IOException iOException0) {
            v7 = 2000;
            goto label_54;
        }
    label_36:
        long v6 = zzgd0.zzf;
        if(v6 != -1L) {
            if(v5 != -1L) {
                v6 = Math.min(v5, v6);
            }
            this.zze = v6;
        }
        this.zzf = true;
        this.zzj(zzgd0);
        return zzgd0.zzf == -1L ? this.zze : zzgd0.zzf;
        try {
        label_44:
            iOException1 = new IOException("Could not open file descriptor for: " + uri0);
            v7 = 2000;
        }
        catch(zzfu zzfu0) {
            throw zzfu0;
        }
        catch(IOException iOException0) {
            v7 = 2000;
            goto label_54;
        }
        try {
            throw new zzfu(iOException1, 2000);
        }
        catch(zzfu zzfu0) {
            try {
                throw zzfu0;
            }
            catch(zzfu zzfu0) {
            }
            catch(IOException iOException0) {
                v7 = 2000;
                goto label_54;
            }
            throw zzfu0;
        }
        catch(IOException iOException0) {
        }
    label_54:
        if(iOException0 instanceof FileNotFoundException) {
            v7 = 2005;
        }
        throw new zzfu(iOException0, v7);
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws zzfu {
        try {
            try {
                this.zzb = null;
                FileInputStream fileInputStream0 = this.zzd;
                if(fileInputStream0 != null) {
                    fileInputStream0.close();
                }
            }
            catch(IOException iOException0) {
                throw new zzfu(iOException0, 2000);
            }
        }
        catch(Throwable throwable0) {
            try {
                try {
                    this.zzd = null;
                    AssetFileDescriptor assetFileDescriptor0 = this.zzc;
                    if(assetFileDescriptor0 != null) {
                        assetFileDescriptor0.close();
                    }
                }
                catch(IOException iOException1) {
                    throw new zzfu(iOException1, 2000);
                }
            }
            catch(Throwable throwable1) {
                goto label_28;
            }
            this.zzc = null;
            if(this.zzf) {
                this.zzf = false;
                this.zzh();
            }
            throw throwable0;
        }
        try {
            try {
                this.zzd = null;
                AssetFileDescriptor assetFileDescriptor1 = this.zzc;
                if(assetFileDescriptor1 != null) {
                    assetFileDescriptor1.close();
                }
            }
            catch(IOException iOException2) {
                throw new zzfu(iOException2, 2000);
            }
        }
        catch(Throwable throwable1) {
        label_28:
            this.zzc = null;
            if(this.zzf) {
                this.zzf = false;
                this.zzh();
            }
            throw throwable1;
        }
        this.zzc = null;
        if(this.zzf) {
            this.zzf = false;
            this.zzh();
        }
    }
}

