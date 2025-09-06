package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public final class zzfow {
    private final zzaxz zza;
    private final File zzb;
    private final File zzc;
    private final File zzd;
    private byte[] zze;

    public zzfow(@NonNull zzaxz zzaxz0, @NonNull File file0, @NonNull File file1, @NonNull File file2) {
        this.zza = zzaxz0;
        this.zzb = file0;
        this.zzc = file2;
        this.zzd = file1;
    }

    public final zzaxz zza() {
        return this.zza;
    }

    public final File zzb() {
        return this.zzc;
    }

    public final File zzc() {
        return this.zzb;
    }

    public final boolean zzd(long v) {
        return this.zza.zzb() - System.currentTimeMillis() / 1000L < 3600L;
    }

    public final byte[] zze() {
        byte[] arr_b1;
        FileInputStream fileInputStream0;
        Closeable closeable0 = null;
        if(this.zze == null) {
            try {
                fileInputStream0 = null;
                fileInputStream0 = new FileInputStream(this.zzd);
                goto label_7;
            }
            catch(IOException unused_ex) {
                IOUtils.closeQuietly(fileInputStream0);
                arr_b1 = null;
                this.zze = arr_b1;
                return this.zze == null ? null : Arrays.copyOf(this.zze, this.zze.length);
            }
            catch(Throwable throwable0) {
            }
            IOUtils.closeQuietly(closeable0);
            throw throwable0;
            try {
            label_7:
                ArrayList arrayList0 = new ArrayList();
                for(int v = 0x100; true; v = Math.min(v + v, 0x2000)) {
                    byte[] arr_b = new byte[v];
                    int v1;
                    for(v1 = 0; v1 < v; v1 += v2) {
                        int v2 = fileInputStream0.read(arr_b, v1, v - v1);
                        if(v2 == -1) {
                            break;
                        }
                    }
                    zzgwj zzgwj0 = v1 == 0 ? null : zzgwj.zzv(arr_b, 0, v1);
                    if(zzgwj0 == null) {
                        break;
                    }
                    arrayList0.add(zzgwj0);
                }
                arr_b1 = zzgwj.zzu(arrayList0).zzA();
                goto label_31;
            }
            catch(IOException unused_ex) {
            }
            catch(Throwable throwable0) {
                closeable0 = fileInputStream0;
                IOUtils.closeQuietly(closeable0);
                throw throwable0;
            }
            IOUtils.closeQuietly(fileInputStream0);
            arr_b1 = null;
            this.zze = arr_b1;
            return this.zze == null ? null : Arrays.copyOf(this.zze, this.zze.length);
        label_31:
            IOUtils.closeQuietly(fileInputStream0);
            this.zze = arr_b1;
        }
        return this.zze == null ? null : Arrays.copyOf(this.zze, this.zze.length);
    }
}

