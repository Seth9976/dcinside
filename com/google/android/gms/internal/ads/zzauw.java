package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Arrays;
import java.util.LinkedList;

public abstract class zzauw implements zzauv {
    protected static volatile zzawd zza;
    protected MotionEvent zzb;
    protected final LinkedList zzc;
    protected long zzd;
    protected long zze;
    protected long zzf;
    protected long zzg;
    protected long zzh;
    protected long zzi;
    protected long zzj;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected boolean zzp;
    protected DisplayMetrics zzq;
    @Nullable
    protected zzavv zzr;
    private double zzs;
    private double zzt;
    private boolean zzu;

    static {
    }

    protected zzauw(Context context0) {
        this.zzc = new LinkedList();
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzh = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        this.zzu = false;
        this.zzp = false;
        try {
            zzaty.zze();
            this.zzq = context0.getResources().getDisplayMetrics();
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzcT)).booleanValue()) {
                this.zzr = new zzavv();
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    protected abstract long zza(StackTraceElement[] arg1) throws zzavt;

    protected abstract zzasc zzb(Context arg1, View arg2, Activity arg3);

    protected abstract zzasc zzc(Context arg1, zzarp arg2);

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final String zzd(Context context0, @Nullable String s, @Nullable View view0) {
        return this.zzp(context0, s, 3, view0, null, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final String zze(Context context0, @Nullable String s, @Nullable View view0, @Nullable Activity activity0) {
        return this.zzp(context0, s, 3, view0, activity0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final String zzf(Context context0) {
        if(zzawg.zzc()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return this.zzp(context0, null, 1, null, null, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final String zzg(Context context0) {
        return "19";
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final String zzh(Context context0, @Nullable View view0, @Nullable Activity activity0) {
        return this.zzp(context0, null, 2, view0, activity0, null);
    }

    protected abstract zzasc zzi(Context arg1, View arg2, Activity arg3);

    protected abstract zzawf zzj(MotionEvent arg1) throws zzavt;

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final void zzk(@Nullable MotionEvent motionEvent0) {
        synchronized(this) {
            if(this.zzu) {
                this.zzm();
                this.zzu = false;
            }
            switch(motionEvent0.getAction()) {
                case 0: {
                    this.zzk = 0.0;
                    this.zzs = (double)motionEvent0.getRawX();
                    this.zzt = (double)motionEvent0.getRawY();
                    break;
                }
                case 1: 
                case 2: {
                    double f = (double)motionEvent0.getRawX();
                    double f1 = (double)motionEvent0.getRawY();
                    double f2 = f - this.zzs;
                    double f3 = f1 - this.zzt;
                    this.zzk += Math.sqrt(f2 * f2 + f3 * f3);
                    this.zzs = f;
                    this.zzt = f1;
                }
            }
            int v1 = motionEvent0.getAction();
            switch(v1) {
                case 0: {
                    this.zzl = motionEvent0.getX();
                    this.zzm = motionEvent0.getY();
                    this.zzn = motionEvent0.getRawX();
                    this.zzo = motionEvent0.getRawY();
                    ++this.zzd;
                    break;
                }
                case 1: {
                    MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
                    this.zzb = motionEvent1;
                    this.zzc.add(motionEvent1);
                    if(this.zzc.size() > 6) {
                        ((MotionEvent)this.zzc.remove()).recycle();
                    }
                    try {
                        ++this.zzf;
                        this.zzh = this.zza(new Throwable().getStackTrace());
                    }
                    catch(zzavt unused_ex) {
                    }
                    break;
                }
                case 2: {
                    this.zze += (long)(motionEvent0.getHistorySize() + 1);
                    try {
                        zzawf zzawf0 = this.zzj(motionEvent0);
                        Long long0 = zzawf0.zzd;
                        if(long0 != null && zzawf0.zzg != null) {
                            this.zzi += ((long)long0) + ((long)zzawf0.zzg);
                        }
                        if(this.zzq != null) {
                            Long long1 = zzawf0.zze;
                            if(long1 != null && zzawf0.zzh != null) {
                                this.zzj += ((long)long1) + ((long)zzawf0.zzh);
                            }
                        }
                    }
                    catch(zzavt unused_ex) {
                    }
                    break;
                }
                default: {
                    if(v1 == 3) {
                        ++this.zzg;
                    }
                }
            }
            this.zzp = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final void zzl(int v, int v1, int v2) {
        synchronized(this) {
            if(this.zzb != null) {
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzcE)).booleanValue()) {
                    this.zzm();
                }
                else {
                    this.zzb.recycle();
                }
            }
            DisplayMetrics displayMetrics0 = this.zzq;
            this.zzb = displayMetrics0 == null ? null : MotionEvent.obtain(0L, v2, 1, ((float)v) * displayMetrics0.density, ((float)v1) * displayMetrics0.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            this.zzp = false;
        }
    }

    private final void zzm() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if(this.zzc.isEmpty()) {
            MotionEvent motionEvent0 = this.zzb;
            if(motionEvent0 != null) {
                motionEvent0.recycle();
            }
        }
        else {
            for(Object object0: this.zzc) {
                ((MotionEvent)object0).recycle();
            }
            this.zzc.clear();
        }
        this.zzb = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final void zzn(StackTraceElement[] arr_stackTraceElement) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzcT)).booleanValue()) {
            zzavv zzavv0 = this.zzr;
            if(zzavv0 != null) {
                zzavv0.zzb(Arrays.asList(arr_stackTraceElement));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public void zzo(View view0) {
    }

    private final String zzp(Context context0, String s, int v, View view0, Activity activity0, byte[] arr_b) {
        int v6;
        int v5;
        String s2;
        int v3;
        int v2;
        String s1;
        zzauu zzauu0;
        long v1 = System.currentTimeMillis();
        boolean z = ((Boolean)zzbe.zzc().zza(zzbcl.zzcG)).booleanValue();
        zzasc zzasc0 = null;
        if(z) {
            zzauu0 = zzauw.zza == null ? null : zzauw.zza.zzd();
            s1 = "be";
        }
        else {
            zzauu0 = null;
            s1 = null;
        }
        try {
            switch(v) {
                case 2: {
                    zzasc0 = this.zzi(context0, view0, activity0);
                    v2 = 0x3F0;
                    break;
                }
                case 3: {
                    zzasc0 = this.zzb(context0, view0, activity0);
                    this.zzu = true;
                    v2 = 1002;
                    break;
                }
                default: {
                    zzasc0 = this.zzc(context0, null);
                    v2 = 1000;
                }
            }
            if(z && zzauu0 != null) {
                zzauu0.zzc(v2, -1, System.currentTimeMillis() - v1, s1, null);
            }
        }
        catch(Exception exception0) {
            if(z && zzauu0 != null) {
                if(v == 3) {
                    v3 = 1003;
                }
                else if(v == 2) {
                    v3 = 1009;
                }
                else {
                    v = 1;
                    v3 = 1001;
                }
                zzauu0.zzc(v3, -1, System.currentTimeMillis() - v1, s1, exception0);
            }
        }
        long v4 = System.currentTimeMillis();
        if(zzasc0 == null) {
            return "5";
        }
        try {
            if(((zzasy)zzasc0.zzbn()).zzaY() == 0) {
                return "5";
            }
            s2 = zzaty.zzb(((zzasy)zzasc0.zzbn()).zzaV(), s);
            if(z && zzauu0 != null) {
                if(v == 3) {
                    v5 = 1006;
                }
                else {
                    v5 = v == 2 ? 1010 : 1004;
                }
                zzauu0.zzc(v5, -1, System.currentTimeMillis() - v4, s1, null);
                return s2;
            }
        }
        catch(Exception unused_ex) {
            s2 = "7";
            if(z && zzauu0 != null) {
                if(v == 3) {
                    v6 = 1007;
                }
                else {
                    v6 = v == 2 ? 0x3F3 : 1005;
                }
                zzauu0.zzc(v6, -1, System.currentTimeMillis() - v4, s1, exception1);
            }
        }
        return s2;
    }
}

