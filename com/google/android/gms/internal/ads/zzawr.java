package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzbe;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzawr extends zzaxr {
    private static final zzaxs zzh;
    private final zzary zzi;
    private final Context zzj;
    private final zzatv zzk;

    static {
        zzawr.zzh = new zzaxs();
    }

    public zzawr(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1, Context context0, zzarp zzarp0, zzary zzary0, zzatv zzatv0) {
        super(zzawd0, "oRkhOtgSewU4ggMi3si9uC+Dt7XbP2h/HAjAAMrrDLJEH1okiq6gMjsyB44PqaXr", "iO2i4E5kKwgdMIyURHCZV/iLx1KtGqgpgsfiaMoXkaQ=", zzasc0, v, 27);
        this.zzj = context0;
        this.zzi = zzary0;
        this.zzk = zzatv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzats zzats3;
        zzats zzats1;
        AtomicReference atomicReference0 = zzawr.zzh.zza("com.dcinside.app.android");
        synchronized(atomicReference0) {
            zzats zzats0 = (zzats)atomicReference0.get();
            if(zzats0 == null || zzawg.zzd(zzats0.zza) || zzats0.zza.equals("E") || zzats0.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if(this.zzk == null) {
                    Boolean boolean0 = Boolean.valueOf(!this.zzi.zzd());
                    Boolean boolean1 = (Boolean)zzbe.zzc().zza(zzbcl.zzcB);
                    String s = ((Boolean)zzbe.zzc().zza(zzbcl.zzcA)).booleanValue() ? this.zzb() : null;
                    if(boolean1.booleanValue() && this.zza.zzp() && zzawg.zzd(s)) {
                        s = this.zzd();
                    }
                    zzats zzats2 = new zzats(((String)this.zze.invoke(null, this.zzj, boolean0, s)));
                    boolean z = !zzawg.zzd(zzats2.zza) && !zzats2.zza.equals("E");
                    zzats1 = zzats2;
                }
                else {
                    zzats1 = this.zzc();
                }
                atomicReference0.set(zzats1);
            }
            zzats3 = (zzats)atomicReference0.get();
        }
        synchronized(this.zzd) {
            if(zzats3 != null) {
                this.zzd.zzx(zzats3.zza);
                this.zzd.zzX(zzats3.zzb);
                this.zzd.zzZ(zzats3.zzc);
                this.zzd.zzi(zzats3.zzd);
                this.zzd.zzw(zzats3.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory0 = CertificateFactory.getInstance("X.509");
            byte[] arr_b = zzawg.zzf(((String)zzbe.zzc().zza(zzbcl.zzcC)));
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(certificateFactory0.generateCertificate(new ByteArrayInputStream(arr_b)));
            if(!Build.TYPE.equals("user")) {
                arrayList0.add(certificateFactory0.generateCertificate(new ByteArrayInputStream(zzawg.zzf(((String)zzbe.zzc().zza(zzbcl.zzcD))))));
            }
            Context context0 = this.zzj;
            if(Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
                zzgdb zzgdb0 = zzgdb.zze();
                context0.getPackageManager().requestChecksums("com.dcinside.app.android", false, 8, arrayList0, new zzaxt(zzgdb0));
                return (String)zzgdb0.get();
            }
        }
        catch(CertificateEncodingException | PackageManager.NameNotFoundException | ExecutionException | InterruptedException | CertificateException | NoClassDefFoundError unused_ex) {
        }
        return null;
    }

    private final zzats zzc() throws IllegalAccessException, InvocationTargetException {
        int v = ((Boolean)zzbe.zzc().zza(zzbcl.zzcN)).booleanValue() ? ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzcS)))) : this.zzi.zza();
        zzats zzats0 = new zzats(((String)this.zze.invoke(null, this.zzj, Boolean.FALSE, "")));
        zzatv zzatv0 = this.zzk;
        String s = "E";
        if(zzatv0 != null && zzatv0.zza() != null) {
            try {
                s = (String)zzatv0.zza().get(((long)v), TimeUnit.MILLISECONDS);
            }
            catch(InterruptedException | ExecutionException | TimeoutException unused_ex) {
            }
        }
        zzats0.zza = s;
        return zzats0;
    }

    private final String zzd() {
        try {
            if(this.zza.zzl() != null) {
                this.zza.zzl().get();
            }
            zzasy zzasy0 = this.zza.zzc();
            if(zzasy0 != null && zzasy0.zzaj()) {
                return zzasy0.zzh();
            }
        }
        catch(InterruptedException | ExecutionException unused_ex) {
        }
        return null;
    }
}

