package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Clock;
import j..util.DesugarCollections;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;

public final class zzcdh extends zzcde {
    public static final int zzd;
    private static final Set zze;
    private static final DecimalFormat zzf;
    private File zzg;
    private boolean zzh;

    static {
        zzcdh.zze = DesugarCollections.synchronizedSet(new HashSet());
        zzcdh.zzf = new DecimalFormat("#,###");
    }

    public zzcdh(zzcbs zzcbs0) {
        super(zzcbs0);
        File file0 = this.zza.getCacheDir();
        if(file0 == null) {
            zzo.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file1 = new File(zzfpv.zza(zzfpu.zza(), file0, "admobVideoStreams"));
        this.zzg = file1;
        if(!file1.isDirectory() && !this.zzg.mkdirs()) {
            zzo.zzj(("Could not create preload cache directory at " + this.zzg.getAbsolutePath()));
            this.zzg = null;
            return;
        }
        if(this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        zzo.zzj(("Could not set cache file permissions at " + this.zzg.getAbsolutePath()));
        this.zzg = null;
    }

    private final File zza(File file0) {
        return new File(zzfpv.zza(zzfpu.zza(), this.zzg, file0.getName() + ".done"));
    }

    @Override  // com.google.android.gms.internal.ads.zzcde
    public final void zzf() {
        this.zzh = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzcde
    public final boolean zzt(String s) {
        String s12;
        String s11;
        String s10;
        String s9;
        String s8;
        int v15;
        int v14;
        ReadableByteChannel readableByteChannel1;
        FileChannel fileChannel1;
        String s7;
        zzbx zzbx1;
        String s6;
        String s5;
        FileOutputStream fileOutputStream2;
        int v13;
        int v12;
        long v11;
        zzbx zzbx0;
        ByteBuffer byteBuffer0;
        FileChannel fileChannel0;
        FileOutputStream fileOutputStream1;
        ReadableByteChannel readableByteChannel0;
        int v9;
        int v8;
        int v7;
        boolean z;
        int v;
        FileOutputStream fileOutputStream0 = null;
        if(this.zzg != null) {
            while(true) {
                File file0 = this.zzg;
                if(file0 == null) {
                    v = 0;
                }
                else {
                    File[] arr_file = file0.listFiles();
                    v = 0;
                    for(int v1 = 0; v1 < arr_file.length; ++v1) {
                        if(!arr_file[v1].getName().endsWith(".done")) {
                            ++v;
                        }
                    }
                }
                if(v > ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzq))))) {
                    File file1 = this.zzg;
                    if(file1 != null) {
                        File[] arr_file1 = file1.listFiles();
                        long v2 = 0x7FFFFFFFFFFFFFFFL;
                        File file2 = null;
                        for(int v3 = 0; v3 < arr_file1.length; ++v3) {
                            File file3 = arr_file1[v3];
                            if(!file3.getName().endsWith(".done")) {
                                long v4 = file3.lastModified();
                                if(v4 < v2) {
                                    file2 = file3;
                                    v2 = v4;
                                }
                            }
                        }
                        if(file2 == null) {
                            z = false;
                        }
                        else {
                            z = file2.delete();
                            File file4 = this.zza(file2);
                            if(file4.isFile()) {
                                z &= file4.delete();
                            }
                        }
                        if(z) {
                            continue;
                        }
                    }
                    zzo.zzj("Unable to expire stream cache");
                    this.zzg(s, null, "expireFailed", null);
                    return false;
                }
                break;
            }
            String s1 = zzf.zzf(s);
            File file5 = new File(zzfpv.zza(zzfpu.zza(), this.zzg, s1));
            File file6 = this.zza(file5);
            if(file5.isFile() && file6.isFile()) {
                int v5 = (int)file5.length();
                zzo.zze(("Stream cache hit at " + s));
                this.zzh(s, file5.getAbsolutePath(), v5);
                return true;
            }
            String s2 = this.zzg.getAbsolutePath();
            Set set0 = zzcdh.zze;
            String s3 = s2 + s;
            synchronized(set0) {
                if(set0.contains(s3)) {
                    zzo.zzj(("Stream cache already in progress at " + s));
                    this.zzg(s, file5.getAbsolutePath(), "inProgress", null);
                    return false;
                }
                set0.add(s3);
            }
            try {
                HttpURLConnection httpURLConnection0 = zzfqf.zza().zzn(new zzcdg(s), 0x109, -1);
                if(!(httpURLConnection0 instanceof HttpURLConnection)) {
                    goto label_69;
                }
                v7 = httpURLConnection0.getResponseCode();
                if(v7 < 400) {
                label_69:
                    v8 = httpURLConnection0.getContentLength();
                    if(v8 < 0) {
                        zzo.zzj(("Stream cache aborted, missing content-length header at " + s));
                        this.zzg(s, file5.getAbsolutePath(), "contentLengthMissing", null);
                        set0.remove(s3);
                        return false;
                    }
                    String s4 = zzcdh.zzf.format(((long)v8));
                    v9 = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzr)));
                    if(v8 > v9) {
                        zzo.zzj(("Content length " + s4 + " exceeds limit at " + s));
                        this.zzg(s, file5.getAbsolutePath(), "sizeExceeded", "File too big for full file cache. Size: " + s4);
                        set0.remove(s3);
                        return false;
                    }
                    zzo.zze(("Caching " + s4 + " bytes from " + s));
                    readableByteChannel0 = Channels.newChannel(httpURLConnection0.getInputStream());
                    fileOutputStream1 = new FileOutputStream(file5);
                    goto label_85;
                }
                goto label_183;
            }
            catch(IOException | RuntimeException iOException0) {
                s5 = s3;
                s8 = "error";
                s11 = null;
                goto label_195;
            }
            try {
            label_85:
                fileChannel0 = fileOutputStream1.getChannel();
                byteBuffer0 = ByteBuffer.allocate(0x100000);
                Clock clock0 = zzv.zzC();
                long v10 = clock0.currentTimeMillis();
                zzbx0 = new zzbx(((long)(((Long)zzbe.zzc().zza(zzbcl.zzL)))));
                v11 = (long)(((Long)zzbe.zzc().zza(zzbcl.zzK)));
                v12 = 0;
                while(true) {
                label_92:
                    v13 = readableByteChannel0.read(byteBuffer0);
                    break;
                }
            }
            catch(IOException | RuntimeException iOException0) {
                fileOutputStream2 = fileOutputStream1;
                s5 = s3;
                s8 = "error";
                fileOutputStream0 = fileOutputStream2;
                s11 = null;
                goto label_195;
            }
            if(v13 < 0) {
                goto label_160;
            }
            v12 += v13;
            if(v12 > v9) {
                goto label_146;
            }
            try {
                byteBuffer0.flip();
                while(fileChannel0.write(byteBuffer0) > 0) {
                }
                byteBuffer0.clear();
                if(clock0.currentTimeMillis() - v10 <= 1000L * v11) {
                    if(this.zzh) {
                        goto label_138;
                    }
                    if(zzbx0.zzb()) {
                        s6 = file5.getAbsolutePath();
                        zzbx1 = zzbx0;
                        s7 = s3;
                        fileChannel1 = fileChannel0;
                        fileOutputStream2 = fileOutputStream1;
                        readableByteChannel1 = readableByteChannel0;
                        v14 = v9;
                        v15 = v8;
                        goto label_121;
                    }
                    else {
                        goto label_123;
                    }
                    goto label_130;
                }
                goto label_141;
            }
            catch(IOException | RuntimeException iOException0) {
                try {
                    fileOutputStream2 = fileOutputStream1;
                    s7 = s3;
                    goto label_174;
                label_121:
                    zzf.zza.post(new zzccy(this, s, s6, v12, v8, false));
                    goto label_130;
                label_123:
                    zzbx1 = zzbx0;
                    fileChannel1 = fileChannel0;
                    fileOutputStream2 = fileOutputStream1;
                    readableByteChannel1 = readableByteChannel0;
                    v14 = v9;
                    v15 = v8;
                    s7 = s3;
                label_130:
                    readableByteChannel0 = readableByteChannel1;
                    zzbx0 = zzbx1;
                    s3 = s7;
                    fileChannel0 = fileChannel1;
                    fileOutputStream1 = fileOutputStream2;
                    v9 = v14;
                    v8 = v15;
                    goto label_92;
                label_138:
                    fileOutputStream2 = fileOutputStream1;
                    s8 = "externalAbort";
                }
                catch(IOException | RuntimeException iOException0) {
                    goto label_174;
                }
            }
            try {
                throw new IOException("abort requested");
            }
            catch(IOException | RuntimeException iOException0) {
                s5 = s3;
                fileOutputStream0 = fileOutputStream2;
                s11 = null;
                goto label_195;
            }
            try {
            label_141:
                fileOutputStream2 = fileOutputStream1;
                s9 = s3;
                s8 = "downloadTimeout";
            }
            catch(IOException | RuntimeException iOException0) {
                goto label_174;
            }
            try {
                s10 = "Timeout exceeded. Limit: " + Long.toString(v11) + " sec";
            }
            catch(IOException | RuntimeException iOException0) {
                s5 = s3;
                fileOutputStream0 = fileOutputStream2;
                s11 = null;
                goto label_195;
            }
            try {
                throw new IOException("stream cache time limit exceeded");
            }
            catch(IOException | RuntimeException iOException0) {
                s11 = s10;
                s5 = s9;
                fileOutputStream0 = fileOutputStream2;
                goto label_195;
            }
            try {
            label_146:
                fileOutputStream2 = fileOutputStream1;
                s9 = s3;
                s8 = "sizeExceeded";
            }
            catch(IOException | RuntimeException iOException0) {
                goto label_174;
            }
            try {
                s10 = "File too big for full file cache. Size: " + Integer.toString(v12);
            }
            catch(IOException | RuntimeException iOException0) {
                s5 = s3;
                fileOutputStream0 = fileOutputStream2;
                s11 = null;
                goto label_195;
            }
            try {
                throw new IOException("stream cache file size limit exceeded");
            }
            catch(IOException | RuntimeException iOException0) {
                s11 = s10;
                s5 = s9;
                fileOutputStream0 = fileOutputStream2;
                goto label_195;
            }
            try {
                try {
                label_160:
                    fileOutputStream2 = fileOutputStream1;
                    s7 = s3;
                    fileOutputStream2.close();
                    if(zzo.zzm(3)) {
                        zzo.zze(("Preloaded " + zzcdh.zzf.format(((long)v12)) + " bytes from " + s));
                    }
                    file5.setReadable(true, false);
                    if(file6.isFile()) {
                        file6.setLastModified(System.currentTimeMillis());
                        goto label_170;
                    }
                }
                catch(IOException iOException0) {
                    goto label_174;
                }
                try {
                    file6.createNewFile();
                }
                catch(IOException unused_ex) {
                }
                try {
                label_170:
                    this.zzh(s, file5.getAbsolutePath(), v12);
                    s5 = s7;
                    goto label_176;
                label_174:
                    s5 = s7;
                    s8 = "error";
                    fileOutputStream0 = fileOutputStream2;
                    s11 = null;
                    goto label_195;
                }
                catch(IOException iOException0) {
                    goto label_174;
                }
            }
            catch(RuntimeException iOException0) {
                goto label_174;
            }
            try {
            label_176:
                zzcdh.zze.remove(s5);
                return true;
            }
            catch(IOException | RuntimeException iOException0) {
            }
            s8 = "error";
            fileOutputStream0 = fileOutputStream2;
            s11 = null;
            goto label_195;
            try {
            label_183:
                s8 = "badUrl";
                s12 = "HTTP request failed. Code: " + Integer.toString(v7);
            }
            catch(IOException | RuntimeException iOException0) {
                s5 = s3;
                s8 = "error";
                s11 = null;
                goto label_195;
            }
            try {
                throw new IOException("HTTP status code " + v7 + " at " + s);
            }
            catch(IOException | RuntimeException iOException0) {
                s11 = s12;
                s5 = s3;
            }
        label_195:
            if(iOException0 instanceof RuntimeException) {
                zzv.zzp().zzw(iOException0, "VideoStreamFullFileCache.preload");
            }
            try {
                fileOutputStream0.close();
            }
            catch(IOException | NullPointerException unused_ex) {
            }
            if(this.zzh) {
                zzo.zzi(("Preload aborted for URL \"" + s + "\""));
            }
            else {
                zzo.zzk(("Preload failed for URL \"" + s + "\""), iOException0);
            }
            if(file5.exists() && !file5.delete()) {
                zzo.zzj(("Could not delete partial cache file at " + file5.getAbsolutePath()));
            }
            this.zzg(s, file5.getAbsolutePath(), s8, s11);
            zzcdh.zze.remove(s5);
            return false;
        }
        this.zzg(s, null, "noCacheDir", null);
        return false;
    }
}

