package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.t0;
import j..util.Optional;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class zzfkh {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzbpe zzd;
    protected zzft zze;
    protected final AtomicBoolean zzf;
    private final zzcf zzg;
    private final ConcurrentLinkedQueue zzh;
    private final zzfjg zzi;
    private final AtomicBoolean zzj;
    private final ScheduledExecutorService zzk;
    private final AtomicBoolean zzl;
    private final AtomicBoolean zzm;
    private zzfjp zzn;
    private final Clock zzo;

    public zzfkh(ClientApi clientApi0, Context context0, int v, zzbpe zzbpe0, @NonNull zzft zzft0, @NonNull zzcf zzcf0, @NonNull ScheduledExecutorService scheduledExecutorService0, zzfjg zzfjg0, Clock clock0) {
        this.zza = clientApi0;
        this.zzb = context0;
        this.zzc = v;
        this.zzd = zzbpe0;
        this.zze = zzft0;
        this.zzg = zzcf0;
        this.zzh = new ConcurrentLinkedQueue();
        this.zzf = new AtomicBoolean(true);
        this.zzj = new AtomicBoolean(false);
        this.zzk = scheduledExecutorService0;
        this.zzi = zzfjg0;
        this.zzl = new AtomicBoolean(true);
        this.zzm = new AtomicBoolean(false);
        this.zzo = clock0;
    }

    private final void zzA(zze zze0) {
        synchronized(this) {
            this.zzj.set(false);
            if(zze0.zza != 1 && zze0.zza != 8 && zze0.zza != 10 && zze0.zza != 11) {
                this.zzC(true);
                return;
            }
            zzo.zzi(("Preloading " + this.zze.zzb + ", for adUnitId:" + this.zze.zza + ", Ad load failed. Stop preloading due to non-retriable error:"));
            this.zzf.set(false);
        }
    }

    private final void zzB() {
        synchronized(this) {
            Iterator iterator0 = this.zzh.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(((zzfjx)object0).zzc()) {
                    iterator0.remove();
                }
            }
        }
    }

    private final void zzC(boolean z) {
        synchronized(this) {
            if(!this.zzi.zze()) {
                if(z) {
                    this.zzi.zzb();
                }
                zzfjy zzfjy0 = () -> synchronized(this) {
                    this.zzB();
                    this.zzz();
                    if(!this.zzj.get() && this.zzf.get() && this.zzh.size() < this.zze.zzd) {
                        this.zzj.set(true);
                        zzgch.zzr(this.zza(), new zzfkg(this), this.zzk);
                    }
                };
                long v1 = this.zzi.zza();
                this.zzk.schedule(zzfjy0, v1, TimeUnit.MILLISECONDS);
            }
        }
    }

    private static final Optional zzD(Optional optional0) {
        return optional0.filter(new zzfjz(zzcvm.class)).map(new zzfka(zzcvm.class)).map(new zzfkb());
    }

    protected abstract t0 zza();

    protected abstract Optional zzb(Object arg1);

    public final zzfkh zzc() {
        synchronized(this) {
            zzfjy zzfjy0 = () -> synchronized(this) {
                this.zzB();
                this.zzz();
                if(!this.zzj.get() && this.zzf.get() && this.zzh.size() < this.zze.zzd) {
                    this.zzj.set(true);
                    zzgch.zzr(this.zza(), new zzfkg(this), this.zzk);
                }
            };
            this.zzk.submit(zzfjy0);
            return this;
        }
    }

    @Nullable
    protected final Object zzd() {
        zzfjx zzfjx0;
        synchronized(this) {
            zzfjx0 = (zzfjx)this.zzh.peek();
            if(zzfjx0 == null) {
                return null;
            }
        }
        return zzfjx0.zzb();
    }

    @Nullable
    public final Object zze() {
        zzfjx zzfjx0;
        synchronized(this) {
            this.zzi.zzc();
            zzfjx0 = (zzfjx)this.zzh.poll();
            this.zzm.set(zzfjx0 != null);
            this.zzl();
            if(zzfjx0 == null) {
                return null;
            }
        }
        return zzfjx0.zzb();
    }

    public final Optional zzf() {
        synchronized(this) {
            Object object0 = this.zzd();
            return zzfkh.zzD((object0 == null ? Optional.empty() : this.zzb(object0)));
        }
    }

    // 检测为 Lambda 实现
    protected final void zzl() [...]

    // 检测为 Lambda 实现
    final void zzm(long v, Optional optional0) [...]

    // 检测为 Lambda 实现
    final void zzn() [...]

    public final void zzo(int v) {
        synchronized(this) {
            Preconditions.checkArgument(v >= 5);
            this.zzi.zzd(v);
        }
    }

    public final void zzp() {
        synchronized(this) {
            this.zzf.set(true);
            this.zzl.set(true);
            zzfjy zzfjy0 = () -> synchronized(this) {
                this.zzB();
                this.zzz();
                if(!this.zzj.get() && this.zzf.get() && this.zzh.size() < this.zze.zzd) {
                    this.zzj.set(true);
                    zzgch.zzr(this.zza(), new zzfkg(this), this.zzk);
                }
            };
            this.zzk.submit(zzfjy0);
        }
    }

    public final void zzq(zzfjp zzfjp0) {
        this.zzn = zzfjp0;
    }

    public final void zzr() {
        this.zzf.set(false);
        this.zzl.set(false);
    }

    protected final void zzs(int v) {
        synchronized(this) {
            Preconditions.checkArgument(v > 0);
            zzft zzft0 = this.zze;
            String s = zzft0.zza;
            int v2 = zzft0.zzb;
            zzm zzm0 = zzft0.zzc;
            if(v <= 0) {
                v = zzft0.zzd;
            }
            this.zze = new zzft(s, v2, zzm0, v);
        }
    }

    public final boolean zzt() {
        synchronized(this) {
            this.zzB();
        }
        return !this.zzh.isEmpty();
    }

    private final void zzu(Object object0) {
        synchronized(this) {
            zzfjx zzfjx0 = new zzfjx(object0, this.zzo);
            this.zzh.add(zzfjx0);
            Optional optional0 = this.zzb(object0);
            long v1 = this.zzo.currentTimeMillis();
            zzfkc zzfkc0 = () -> synchronized(this) {
                if(this.zzl.get()) {
                    try {
                        this.zzg.zze(this.zze);
                    }
                    catch(RemoteException unused_ex) {
                        zzo.zzj("Failed to call onAdsAvailable");
                    }
                }
            };
            zzs.zza.post(zzfkc0);
            zzfkd zzfkd0 = () -> {
                zzfjp zzfjp0 = this.zzn;
                if(zzfjp0 != null) {
                    zzfjp0.zzb(AdFormat.getAdFormat(this.zze.zzb), v1, zzfkh.zzD(optional0));
                }
            };
            this.zzk.execute(zzfkd0);
            zzfjy zzfjy0 = () -> synchronized(this) {
                this.zzB();
                this.zzz();
                if(!this.zzj.get() && this.zzf.get() && this.zzh.size() < this.zze.zzd) {
                    this.zzj.set(true);
                    zzgch.zzr(this.zza(), new zzfkg(this), this.zzk);
                }
            };
            long v2 = zzfjx0.zza();
            this.zzk.schedule(zzfjy0, v2, TimeUnit.MILLISECONDS);
        }
    }

    private final void zzv(Throwable throwable0) {
        synchronized(this) {
            this.zzj.set(false);
            if(throwable0 instanceof zzfjc && ((zzfjc)throwable0).zza() == 0) {
                throw null;
            }
            this.zzC(true);
        }
    }

    private final void zzw(Object object0) {
        synchronized(this) {
            boolean z = false;
            this.zzj.set(false);
            if(object0 != null) {
                this.zzi.zzc();
                this.zzm.set(true);
                this.zzu(object0);
            }
            if(object0 == null) {
                z = true;
            }
            this.zzC(z);
        }
    }

    // 检测为 Lambda 实现
    private final void zzx() [...]

    // 检测为 Lambda 实现
    private final void zzy() [...]

    private final void zzz() {
        synchronized(this) {
            if(this.zzm.get() && this.zzh.isEmpty()) {
                this.zzm.set(false);
                zzfke zzfke0 = () -> synchronized(this) {
                    if(this.zzl.get()) {
                        try {
                            this.zzg.zzf(this.zze);
                        }
                        catch(RemoteException unused_ex) {
                            zzo.zzj("Failed to call onAdsExhausted");
                        }
                    }
                };
                zzs.zza.post(zzfke0);
                zzfkf zzfkf0 = () -> {
                    zzfjp zzfjp0 = this.zzn;
                    if(zzfjp0 != null) {
                        zzfjp0.zzc(AdFormat.getAdFormat(this.zze.zzb), this.zzo.currentTimeMillis());
                    }
                };
                this.zzk.execute(zzfkf0);
            }
        }
    }
}

