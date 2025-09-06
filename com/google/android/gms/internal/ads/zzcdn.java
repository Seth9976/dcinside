package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import jeb.synthetic.FIN;

public final class zzcdn extends zzcde implements zzcbi {
    public static final int zzd;
    private zzcbj zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzccw zzi;
    private long zzj;
    private long zzk;

    public zzcdn(zzcbs zzcbs0, zzcbr zzcbr0) {
        super(zzcbs0);
        zzcef zzcef0 = new zzcef(zzcbs0.getContext(), zzcbr0, ((zzcbs)this.zzc.get()), null);
        zzo.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcef0;
        zzcef0.zzL(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzcde
    public final void release() {
        zzcbj zzcbj0 = this.zze;
        if(zzcbj0 != null) {
            zzcbj0.zzL(null);
            this.zze.zzH();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbi
    public final void zzD(int v, int v1) {
    }

    public final zzcbj zza() {
        synchronized(this) {
            this.zzh = true;
            this.notify();
        }
        this.zze.zzL(null);
        zzcbj zzcbj0 = this.zze;
        this.zze = null;
        return zzcbj0;
    }

    // 检测为 Lambda 实现
    final void zzb() [...]

    protected static final String zzc(String s) {
        return "cache:" + zzf.zzf(s);
    }

    private static String zzd(String s, Exception exception0) {
        return s + "/" + exception0.getClass().getCanonicalName() + ":" + exception0.getMessage();
    }

    @Override  // com.google.android.gms.internal.ads.zzcde
    public final void zzf() {
        synchronized(this) {
            this.zzg = true;
            this.notify();
            this.release();
        }
        String s = this.zzf;
        if(s != null) {
            String s1 = zzcdn.zzc(s);
            this.zzg(this.zzf, s1, "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbi
    public final void zzi(boolean z, long v) {
        zzcbs zzcbs0 = (zzcbs)this.zzc.get();
        if(zzcbs0 != null) {
            zzcdl zzcdl0 = new zzcdl(zzcbs0, z, v);
            zzbzw.zzf.execute(zzcdl0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbi
    public final void zzk(String s, Exception exception0) {
        zzo.zzk("Precache error", exception0);
        zzv.zzp().zzv(exception0, "VideoStreamExoPlayerCache.onError");
    }

    @Override  // com.google.android.gms.internal.ads.zzcbi
    public final void zzl(String s, Exception exception0) {
        zzo.zzk("Precache exception", exception0);
        zzv.zzp().zzv(exception0, "VideoStreamExoPlayerCache.onException");
    }

    @Override  // com.google.android.gms.internal.ads.zzcbi
    public final void zzm(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcde
    public final void zzp(int v) {
        this.zze.zzJ(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcde
    public final void zzq(int v) {
        this.zze.zzK(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcde
    public final void zzr(int v) {
        this.zze.zzM(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcde
    public final void zzs(int v) {
        this.zze.zzN(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcde
    public final boolean zzt(String s) {
        return this.zzu(s, new String[]{s});
    }

    @Override  // com.google.android.gms.internal.ads.zzcde
    public final boolean zzu(String s, String[] arr_s) {
        long v15;
        String s6;
        long v14;
        long v13;
        long v12;
        long v11;
        long v10;
        long v9;
        long v8;
        long v7;
        long v6;
        zzcdn zzcdn1;
        String s5;
        String s4;
        long v5;
        boolean z;
        long v4;
        long v3;
        long v2;
        zzcdn zzcdn0 = this;
        String s1 = s;
        zzcdn0.zzf = s1;
        String s2 = "error";
        String s3 = zzcdn.zzc(s);
        try {
            Uri[] arr_uri = new Uri[arr_s.length];
            for(int v = 0; v < arr_s.length; ++v) {
                arr_uri[v] = Uri.parse(arr_s[v]);
            }
            zzcdn0.zze.zzF(arr_uri, zzcdn0.zzb);
            zzcbs zzcbs0 = (zzcbs)zzcdn0.zzc.get();
            if(zzcbs0 != null) {
                zzcbs0.zzt(s3, zzcdn0);
            }
            Clock clock0 = zzv.zzC();
            long v1 = clock0.currentTimeMillis();
            v2 = (long)(((Long)zzbe.zzc().zza(zzbcl.zzL)));
            v3 = ((long)(((Long)zzbe.zzc().zza(zzbcl.zzK)))) * 1000L;
            v4 = (long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzs)))));
            z = ((Boolean)zzbe.zzc().zza(zzbcl.zzbY)).booleanValue();
            v5 = -1L;
            while(true) {
            label_22:
                __monitor_enter(this);
                break;
            }
        }
        catch(Exception exception0) {
            s4 = s1;
            s5 = s3;
            zzcdn1 = zzcdn0;
            goto label_118;
        }
        try {
            if(clock0.currentTimeMillis() - v1 > v3) {
                goto label_109;
            }
            if(zzcdn0.zzg) {
                goto label_104;
            }
            if(zzcdn0.zzh) {
                __monitor_exit(this);
                return true;
            }
            if(!zzcdn0.zze.zzV()) {
                goto label_99;
            }
            v6 = zzcdn0.zze.zzz();
            if(v6 > 0L) {
                v7 = zzcdn0.zze.zzv();
                if(v7 == v5) {
                    goto label_55;
                }
                else {
                    v8 = z ? zzcdn0.zze.zzA() : -1L;
                    v9 = z ? zzcdn0.zze.zzx() : -1L;
                    v10 = z ? zzcdn0.zze.zzB() : -1L;
                    goto label_42;
                }
                goto label_60;
            }
            else {
                goto label_75;
            }
            goto label_87;
        }
        catch(Throwable throwable0) {
            s4 = s1;
            s5 = s3;
            zzcdn1 = zzcdn0;
            goto label_115;
        }
        try {
        label_42:
            v11 = v6;
            v12 = v4;
            v13 = v3;
            v14 = v2;
            s6 = s3;
            this.zzo(s, s3, v7, v11, v7 > 0L, v8, v9, v10, zzcbj.zzs(), zzcbj.zzu());
            v5 = v7;
            goto label_60;
        }
        catch(Throwable throwable0) {
            zzcdn1 = this;
            s4 = s;
            s5 = s6;
            goto label_115;
        }
        try {
        label_55:
            v11 = v6;
            v12 = v4;
            v13 = v3;
            v14 = v2;
            s6 = s3;
        }
        catch(Throwable throwable0) {
            s4 = s1;
            s5 = s3;
            zzcdn1 = zzcdn0;
            goto label_115;
        }
        try {
        label_60:
            if(v7 >= v11) {
                zzcdn1 = this;
                s4 = s;
                s5 = s6;
                zzcdn1.zzj(s4, s5, v11);
                __monitor_exit(this);
                return true;
            }
            zzcdn1 = this;
            s4 = s;
            s5 = s6;
            if(zzcdn1.zze.zzw() >= v12 && v7 > 0L) {
                __monitor_exit(this);
                return true;
            }
            v15 = v14;
            goto label_87;
        }
        catch(Throwable throwable0) {
            goto label_115;
        }
        try {
        label_75:
            v12 = v4;
            v13 = v3;
            s4 = s1;
            s5 = s3;
            zzcdn1 = zzcdn0;
            v15 = v2;
        }
        catch(Throwable throwable0) {
            s4 = s1;
            s5 = s3;
            zzcdn1 = zzcdn0;
            goto label_115;
        }
        try {
            try {
            label_87:
                zzcdn1.wait(v15);
            }
            catch(InterruptedException unused_ex) {
                s2 = "interrupted";
                throw new IOException("Wait interrupted.");
            }
            __monitor_exit(this);
            zzcdn0 = zzcdn1;
            s1 = s4;
            s3 = s5;
            v2 = v15;
            v4 = v12;
            v3 = v13;
            goto label_22;
        label_99:
            s4 = s1;
            s5 = s3;
            zzcdn1 = zzcdn0;
            s2 = "exoPlayerReleased";
            throw new IOException("ExoPlayer was released during preloading.");
        label_104:
            s4 = s1;
            s5 = s3;
            zzcdn1 = zzcdn0;
            s2 = "externalAbort";
            throw new IOException("Abort requested before buffering finished. ");
        label_109:
            s4 = s1;
            s5 = s3;
            zzcdn1 = zzcdn0;
            s2 = "downloadTimeout";
            throw new IOException("Timeout reached. Limit: " + v3 + " ms");
        label_115:
            __monitor_exit(this);
        }
        catch(Throwable throwable0) {
            goto label_115;
        }
        try {
            throw throwable0;
        }
        catch(Exception exception0) {
        }
    label_118:
        zzo.zzj(("Failed to preload url " + s4 + " Exception: " + exception0.getMessage()));
        zzv.zzp().zzv(exception0, "VideoStreamExoPlayerCache.preload");
        this.release();
        zzcdn1.zzg(s4, s5, s2, zzcdn.zzd(s2, exception0));
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbi
    public final void zzv() {
        zzo.zzj("Precache onRenderedFirstFrame");
    }

    @Override  // com.google.android.gms.internal.ads.zzcde
    public final boolean zzw(String s, String[] arr_s, zzccw zzccw0) {
        this.zzf = s;
        this.zzi = zzccw0;
        String s1 = zzcdn.zzc(s);
        try {
            Uri[] arr_uri = new Uri[arr_s.length];
            for(int v = 0; v < arr_s.length; ++v) {
                arr_uri[v] = Uri.parse(arr_s[v]);
            }
            this.zze.zzF(arr_uri, this.zzb);
            zzcbs zzcbs0 = (zzcbs)this.zzc.get();
            if(zzcbs0 != null) {
                zzcbs0.zzt(s1, this);
            }
            this.zzj = zzv.zzC().currentTimeMillis();
            this.zzk = -1L;
            this.zzx(0L);
            return true;
        }
        catch(Exception exception0) {
        }
        zzo.zzj(("Failed to preload url " + s + " Exception: " + exception0.getMessage()));
        zzv.zzp().zzv(exception0, "VideoStreamExoPlayerCache.preload");
        this.release();
        this.zzg(s, s1, "error", zzcdn.zzd("error", exception0));
        return false;
    }

    private final void zzx(long v) {
        zzcdm zzcdm0 = () -> {
            long v7;
            long v6;
            long v5;
            int v2;
            String s = zzcdn.zzc(this.zzf);
            String s1 = "error";
            try {
                long v = (long)(((Long)zzbe.zzc().zza(zzbcl.zzK)));
                long v1 = (long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzs)))));
                boolean z = ((Boolean)zzbe.zzc().zza(zzbcl.zzbY)).booleanValue();
                __monitor_enter(this);
                v2 = FIN.finallyOpen$NT();
                if(zzv.zzC().currentTimeMillis() - this.zzj > v * 1000L) {
                    s1 = "downloadTimeout";
                    FIN.finallyExec$NT(v2);
                    throw new IOException("Timeout reached. Limit: " + v * 1000L + " ms");
                }
                if(this.zzg) {
                    s1 = "externalAbort";
                    FIN.finallyExec$NT(v2);
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if(this.zzh) {
                    goto label_44;
                }
                else {
                    if(!this.zze.zzV()) {
                        s1 = "exoPlayerReleased";
                        FIN.finallyExec$NT(v2);
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long v3 = this.zze.zzz();
                    if(v3 <= 0L) {
                        goto label_39;
                    }
                    long v4 = this.zze.zzv();
                    if(v4 == this.zzk) {
                        v6 = v4;
                        v5 = v1;
                    }
                    else {
                        v5 = v1;
                        this.zzo(this.zzf, s, v4, v3, v4 > 0L, (z ? this.zze.zzA() : -1L), (z ? this.zze.zzx() : -1L), (z ? this.zze.zzB() : -1L), zzcbj.zzs(), zzcbj.zzu());
                        v6 = v4;
                        this.zzk = v6;
                    }
                    v7 = v3;
                    if(v6 >= v7) {
                        this.zzj(this.zzf, s, v7);
                        goto label_37;
                    }
                    else {
                        if(this.zze.zzw() >= v5 && v6 > 0L) {
                        label_37:
                            FIN.finallyExec$NT(v2);
                            goto label_52;
                        }
                    label_39:
                        FIN.finallyCodeBegin$NT(v2);
                        __monitor_exit(this);
                        FIN.finallyCodeEnd$NT(v2);
                        goto label_42;
                    }
                }
                goto label_52;
            }
            catch(Exception exception0) {
                goto label_47;
            }
        label_42:
            this.zzx(((long)(((Long)zzbe.zzc().zza(zzbcl.zzL)))));
            return;
            try {
            label_44:
                FIN.finallyExec$NT(v2);
            }
            catch(Exception exception0) {
            label_47:
                zzo.zzj(("Failed to preload url " + this.zzf + " Exception: " + exception0.getMessage()));
                zzv.zzp().zzv(exception0, "VideoStreamExoPlayerCache.preload");
                this.release();
                String s2 = zzcdn.zzd(s1, exception0);
                this.zzg(this.zzf, s, s1, s2);
            }
        label_52:
            zzv.zzz().zzc(this.zzi);
        };
        zzs.zza.postDelayed(zzcdm0, v);
    }
}

