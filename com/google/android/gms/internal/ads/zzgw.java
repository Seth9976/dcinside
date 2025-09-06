package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

public final class zzgw extends zzfr {
    private final Context zza;
    @Nullable
    private zzgd zzb;
    @Nullable
    private AssetFileDescriptor zzc;
    @Nullable
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgw(Context context0) {
        super(false);
        this.zza = context0.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int v) {
        return Uri.parse(("rawresource:///" + v));
    }

    @Override  // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] arr_b, int v, int v1) throws zzgv {
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
                throw new zzgv(null, iOException0, 2000);
            }
            if(v3 == -1) {
                if(this.zze != -1L) {
                    throw new zzgv("End of stream reached having not read sufficient data.", new EOFException(), 2000);
                }
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
    public final long zzb(zzgd zzgd0) throws zzgv {
        long v4;
        this.zzb = zzgd0;
        this.zzi(zzgd0);
        AssetFileDescriptor assetFileDescriptor0 = zzgw.zzl(this.zza, zzgd0);
        this.zzc = assetFileDescriptor0;
        long v = assetFileDescriptor0.getLength();
        FileInputStream fileInputStream0 = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream0;
        int v1 = Long.compare(v, -1L);
        try {
            if(v1 != 0 && zzgd0.zze > v) {
                throw new zzgv(null, null, 2008);
            }
            long v2 = this.zzc.getStartOffset();
            long v3 = fileInputStream0.skip(zzgd0.zze + v2) - v2;
            if(v3 != zzgd0.zze) {
                throw new zzgv(null, null, 2008);
            }
            if(v1 == 0) {
                FileChannel fileChannel0 = fileInputStream0.getChannel();
                if(fileChannel0.size() == 0L) {
                    this.zze = -1L;
                    v4 = -1L;
                }
                else {
                    v4 = fileChannel0.size() - fileChannel0.position();
                    this.zze = v4;
                    if(v4 < 0L) {
                        throw new zzgv(null, null, 2008);
                    }
                }
            }
            else {
                v4 = v - v3;
                this.zze = v4;
                if(v4 < 0L) {
                    throw new zzfz(2008);
                }
            }
            goto label_33;
        }
        catch(zzgv zzgv0) {
        }
        catch(IOException iOException0) {
            throw new zzgv(null, iOException0, 2000);
        }
        throw zzgv0;
    label_33:
        long v5 = zzgd0.zzf;
        if(v5 != -1L) {
            if(v4 != -1L) {
                v5 = Math.min(v4, v5);
            }
            this.zze = v5;
        }
        this.zzf = true;
        this.zzj(zzgd0);
        return zzgd0.zzf == -1L ? this.zze : zzgd0.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        return this.zzb == null ? null : this.zzb.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws zzgv {
        try {
            try {
                this.zzb = null;
                InputStream inputStream0 = this.zzd;
                if(inputStream0 != null) {
                    inputStream0.close();
                }
            }
            catch(IOException iOException0) {
                throw new zzgv(null, iOException0, 2000);
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
                    throw new zzgv(null, iOException1, 2000);
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
                throw new zzgv(null, iOException2, 2000);
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

    private static int zzk(String s) throws zzgv {
        try {
            return Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
            throw new zzgv("Resource identifier must be an integer.", null, 1004);
        }
    }

    private static AssetFileDescriptor zzl(Context context0, zzgd zzgd0) throws zzgv {
        AssetFileDescriptor assetFileDescriptor0;
        int v;
        Resources resources0;
        Uri uri0 = zzgd0.zza.normalizeScheme();
        if(TextUtils.equals("rawresource", uri0.getScheme())) {
            resources0 = context0.getResources();
            List list0 = uri0.getPathSegments();
            if(list0.size() != 1) {
                throw new zzgv("rawresource:// URI must have exactly one path element, found " + list0.size());
            }
            v = zzgw.zzk(((String)list0.get(0)));
            goto label_26;
        }
        if(!TextUtils.equals("android.resource", uri0.getScheme())) {
            throw new zzgv("Unsupported URI scheme (" + uri0.getScheme() + "). Only android.resource is supported.", null, 1004);
        }
        String s = uri0.getPath();
        s.getClass();
        if(s.startsWith("/")) {
            s = s.substring(1);
        }
        String s1 = TextUtils.isEmpty(uri0.getHost()) ? "com.dcinside.app.android" : uri0.getHost();
        if(s1.equals("com.dcinside.app.android")) {
            resources0 = context0.getResources();
        }
        else {
            try {
                resources0 = context0.getPackageManager().getResourcesForApplication(s1);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                throw new zzgv("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", packageManager$NameNotFoundException0, 2005);
            }
        }
        if(s.matches("\\d+")) {
            v = zzgw.zzk(s);
            goto label_26;
        }
        v = resources0.getIdentifier(s1 + ":" + s, "raw", null);
        if(v == 0) {
            throw new zzgv("Resource not found.", null, 2005);
        }
        try {
        label_26:
            assetFileDescriptor0 = resources0.openRawResourceFd(v);
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            throw new zzgv(null, resources$NotFoundException0, 2005);
        }
        if(assetFileDescriptor0 == null) {
            throw new zzgv("Resource is compressed: " + uri0, null, 2000);
        }
        return assetFileDescriptor0;
    }
}

