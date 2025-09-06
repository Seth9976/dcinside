package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import j..util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;

public final class zzaqi implements zzaow {
    private final Map zza;
    private long zzb;
    private final zzaqh zzc;
    private final int zzd;

    public zzaqi(zzaqh zzaqh0, int v) {
        this.zza = new LinkedHashMap(16, 0.75f, true);
        this.zzb = 0L;
        this.zzc = zzaqh0;
        this.zzd = 0x500000;
    }

    public zzaqi(File file0, int v) {
        this.zza = new LinkedHashMap(16, 0.75f, true);
        this.zzb = 0L;
        this.zzc = new zzaqe(this, file0);
        this.zzd = 0x1400000;
    }

    @Override  // com.google.android.gms.internal.ads.zzaow
    public final zzaov zza(String s) {
        zzaov zzaov0;
        zzaqf zzaqf1;
        zzaqg zzaqg0;
        synchronized(this) {
            zzaqf zzaqf0 = (zzaqf)this.zza.get(s);
            if(zzaqf0 == null) {
                return null;
            }
            File file0 = this.zzg(s);
            try {
                zzaqg0 = new zzaqg(new BufferedInputStream(new FileInputStream(file0)), file0.length());
            }
            catch(IOException iOException0) {
                zzapy.zza("%s: %s", new Object[]{file0.getAbsolutePath(), iOException0.toString()});
                this.zzi(s);
                return null;
            }
            try {
                zzaqf1 = zzaqf.zza(zzaqg0);
                if(TextUtils.equals(s, zzaqf1.zzb)) {
                    byte[] arr_b = zzaqi.zzm(zzaqg0, zzaqg0.zza());
                    zzaov0 = new zzaov();
                    zzaov0.zza = arr_b;
                    zzaov0.zzb = zzaqf0.zzc;
                    zzaov0.zzc = zzaqf0.zzd;
                    zzaov0.zzd = zzaqf0.zze;
                    zzaov0.zze = zzaqf0.zzf;
                    zzaov0.zzf = zzaqf0.zzg;
                    TreeMap treeMap0 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                    for(Object object0: zzaqf0.zzh) {
                        treeMap0.put(((zzape)object0).zza(), ((zzape)object0).zzb());
                    }
                    zzaov0.zzg = treeMap0;
                    zzaov0.zzh = DesugarCollections.unmodifiableList(zzaqf0.zzh);
                    goto label_28;
                }
                goto label_31;
            }
            catch(Throwable throwable0) {
                goto label_35;
            }
            try {
            label_28:
                zzaqg0.close();
                return zzaov0;
            }
            catch(IOException iOException0) {
                zzapy.zza("%s: %s", new Object[]{file0.getAbsolutePath(), iOException0.toString()});
                this.zzi(s);
                return null;
            }
            try {
            label_31:
                zzapy.zza("%s: key=%s, found=%s", new Object[]{file0.getAbsolutePath(), s, zzaqf1.zzb});
                this.zzp(s);
                goto label_38;
            }
            catch(Throwable throwable0) {
                try {
                label_35:
                    zzaqg0.close();
                    throw throwable0;
                label_38:
                    zzaqg0.close();
                    return null;
                }
                catch(IOException iOException0) {
                }
            }
            zzapy.zza("%s: %s", new Object[]{file0.getAbsolutePath(), iOException0.toString()});
            this.zzi(s);
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaow
    public final void zzb() {
        synchronized(this) {
            File file0 = this.zzc.zza();
            if(file0.exists()) {
                File[] arr_file = file0.listFiles();
                if(arr_file != null) {
                    for(int v = 0; v < arr_file.length; ++v) {
                        File file1 = arr_file[v];
                        try {
                            long v2 = file1.length();
                            zzaqg zzaqg0 = new zzaqg(new BufferedInputStream(new FileInputStream(file1)), v2);
                            try {
                                zzaqf zzaqf0 = zzaqf.zza(zzaqg0);
                                zzaqf0.zza = v2;
                                this.zzo(zzaqf0.zzb, zzaqf0);
                            }
                            catch(Throwable throwable0) {
                                zzaqg0.close();
                                throw throwable0;
                            }
                            zzaqg0.close();
                        }
                        catch(IOException unused_ex) {
                            file1.delete();
                        }
                    }
                }
            }
            else if(!file0.mkdirs()) {
                zzapy.zzb("Unable to create cache dir %s", new Object[]{file0.getAbsolutePath()});
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaow
    public final void zzc(String s, boolean z) {
        synchronized(this) {
            zzaov zzaov0 = this.zza(s);
            if(zzaov0 != null) {
                zzaov0.zzf = 0L;
                zzaov0.zze = 0L;
                this.zzd(s, zzaov0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaow
    public final void zzd(String s, zzaov zzaov0) {
        zzaqf zzaqf0;
        BufferedOutputStream bufferedOutputStream0;
        synchronized(this) {
            int v1 = zzaov0.zza.length;
            if(this.zzb + ((long)v1) <= ((long)this.zzd) || ((float)v1) <= ((float)this.zzd) * 0.9f) {
                File file0 = this.zzg(s);
                try {
                    bufferedOutputStream0 = new BufferedOutputStream(new FileOutputStream(file0));
                    zzaqf0 = new zzaqf(s, zzaov0);
                }
                catch(IOException unused_ex) {
                    goto label_58;
                }
                try {
                    zzaqi.zzj(bufferedOutputStream0, 0x20150306);
                    zzaqi.zzl(bufferedOutputStream0, zzaqf0.zzb);
                    zzaqi.zzl(bufferedOutputStream0, (zzaqf0.zzc == null ? "" : zzaqf0.zzc));
                    zzaqi.zzk(bufferedOutputStream0, zzaqf0.zzd);
                    zzaqi.zzk(bufferedOutputStream0, zzaqf0.zze);
                    zzaqi.zzk(bufferedOutputStream0, zzaqf0.zzf);
                    zzaqi.zzk(bufferedOutputStream0, zzaqf0.zzg);
                    List list0 = zzaqf0.zzh;
                    if(list0 == null) {
                        zzaqi.zzj(bufferedOutputStream0, 0);
                    }
                    else {
                        zzaqi.zzj(bufferedOutputStream0, list0.size());
                        for(Object object0: list0) {
                            zzaqi.zzl(bufferedOutputStream0, ((zzape)object0).zza());
                            zzaqi.zzl(bufferedOutputStream0, ((zzape)object0).zzb());
                        }
                    }
                    bufferedOutputStream0.flush();
                    goto label_32;
                }
                catch(IOException iOException0) {
                }
                try {
                    zzapy.zza("%s", new Object[]{iOException0.toString()});
                    bufferedOutputStream0.close();
                    zzapy.zza("Failed to write header for %s", new Object[]{file0.getAbsolutePath()});
                    goto label_58;
                label_32:
                    bufferedOutputStream0.write(zzaov0.zza);
                    bufferedOutputStream0.close();
                    zzaqf0.zza = file0.length();
                    this.zzo(s, zzaqf0);
                    if(this.zzb >= ((long)this.zzd)) {
                        if(zzapy.zzb) {
                            zzapy.zzd("Pruning old cache entries.", new Object[0]);
                        }
                        long v2 = this.zzb;
                        long v3 = SystemClock.elapsedRealtime();
                        int v4 = 0;
                        Iterator iterator1 = this.zza.entrySet().iterator();
                        while(iterator1.hasNext()) {
                            Object object1 = iterator1.next();
                            zzaqf zzaqf1 = (zzaqf)((Map.Entry)object1).getValue();
                            if(this.zzg(zzaqf1.zzb).delete()) {
                                this.zzb -= zzaqf1.zza;
                            }
                            else {
                                String s1 = zzaqi.zzq(zzaqf1.zzb);
                                zzapy.zza("Could not delete cache entry for key=%s, filename=%s", new Object[]{zzaqf1.zzb, s1});
                            }
                            iterator1.remove();
                            ++v4;
                            if(((float)this.zzb) < ((float)this.zzd) * 0.9f) {
                                break;
                            }
                        }
                        if(zzapy.zzb) {
                            zzapy.zzd("pruned %d files, %d bytes, %d ms", new Object[]{v4, ((long)(this.zzb - v2)), ((long)(SystemClock.elapsedRealtime() - v3))});
                        }
                    }
                }
                catch(IOException unused_ex) {
                label_58:
                    if(!file0.delete()) {
                        zzapy.zza("Could not clean up file %s", new Object[]{file0.getAbsolutePath()});
                    }
                    if(!this.zzc.zza().exists()) {
                        zzapy.zza("Re-initializing cache after external clearing.", new Object[0]);
                        this.zza.clear();
                        this.zzb = 0L;
                        this.zzb();
                    }
                }
            }
        }
    }

    static int zze(InputStream inputStream0) throws IOException {
        int v = zzaqi.zzn(inputStream0);
        int v1 = zzaqi.zzn(inputStream0);
        int v2 = zzaqi.zzn(inputStream0);
        return zzaqi.zzn(inputStream0) << 24 | (v | v1 << 8 | v2 << 16);
    }

    static long zzf(InputStream inputStream0) throws IOException {
        return ((long)zzaqi.zzn(inputStream0)) & 0xFFL | (((long)zzaqi.zzn(inputStream0)) & 0xFFL) << 8 | (((long)zzaqi.zzn(inputStream0)) & 0xFFL) << 16 | (((long)zzaqi.zzn(inputStream0)) & 0xFFL) << 24 | (((long)zzaqi.zzn(inputStream0)) & 0xFFL) << 0x20 | (((long)zzaqi.zzn(inputStream0)) & 0xFFL) << 40 | (((long)zzaqi.zzn(inputStream0)) & 0xFFL) << 0x30 | (((long)zzaqi.zzn(inputStream0)) & 0xFFL) << 56;
    }

    public final File zzg(String s) {
        return new File(this.zzc.zza(), zzaqi.zzq(s));
    }

    static String zzh(zzaqg zzaqg0) throws IOException {
        return new String(zzaqi.zzm(zzaqg0, zzaqi.zzf(zzaqg0)), "UTF-8");
    }

    public final void zzi(String s) {
        synchronized(this) {
            boolean z = this.zzg(s).delete();
            this.zzp(s);
            if(!z) {
                zzapy.zza("Could not delete cache entry for key=%s, filename=%s", new Object[]{s, zzaqi.zzq(s)});
            }
        }
    }

    static void zzj(OutputStream outputStream0, int v) throws IOException {
        outputStream0.write(v & 0xFF);
        outputStream0.write(v >> 8 & 0xFF);
        outputStream0.write(v >> 16 & 0xFF);
        outputStream0.write(v >> 24 & 0xFF);
    }

    static void zzk(OutputStream outputStream0, long v) throws IOException {
        outputStream0.write(((int)(((byte)(((int)v))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 8)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 16)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 24)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 0x20)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 40)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 0x30)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 56)))))));
    }

    static void zzl(OutputStream outputStream0, String s) throws IOException {
        byte[] arr_b = s.getBytes("UTF-8");
        zzaqi.zzk(outputStream0, ((long)arr_b.length));
        outputStream0.write(arr_b, 0, arr_b.length);
    }

    @VisibleForTesting
    static byte[] zzm(zzaqg zzaqg0, long v) throws IOException {
        long v1 = zzaqg0.zza();
        if(Long.compare(v, 0L) < 0 || v > v1 || ((long)(((int)v))) != v) {
            throw new IOException("streamToBytes length=" + v + ", maxLength=" + v1);
        }
        byte[] arr_b = new byte[((int)v)];
        new DataInputStream(zzaqg0).readFully(arr_b);
        return arr_b;
    }

    private static int zzn(InputStream inputStream0) throws IOException {
        int v = inputStream0.read();
        if(v == -1) {
            throw new EOFException();
        }
        return v;
    }

    private final void zzo(String s, zzaqf zzaqf0) {
        if(this.zza.containsKey(s)) {
            zzaqf zzaqf1 = (zzaqf)this.zza.get(s);
            this.zzb += zzaqf0.zza - zzaqf1.zza;
        }
        else {
            this.zzb += zzaqf0.zza;
        }
        this.zza.put(s, zzaqf0);
    }

    private final void zzp(String s) {
        zzaqf zzaqf0 = (zzaqf)this.zza.remove(s);
        if(zzaqf0 != null) {
            this.zzb -= zzaqf0.zza;
        }
    }

    private static final String zzq(String s) {
        int v = s.length();
        return s.substring(0, v / 2).hashCode() + String.valueOf(s.substring(v / 2).hashCode());
    }
}

