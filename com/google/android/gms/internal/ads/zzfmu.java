package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfmu implements zzflv {
    private static final zzfmu zza;
    private static final Handler zzb;
    private static Handler zzc;
    private static final Runnable zzd;
    private static final Runnable zze;
    private final List zzf;
    private int zzg;
    private boolean zzh;
    private final List zzi;
    private final zzflx zzj;
    private final zzfmn zzk;
    private final zzfmo zzl;
    private long zzm;

    static {
        zzfmu.zza = new zzfmu();
        zzfmu.zzb = new Handler(Looper.getMainLooper());
        zzfmu.zzc = null;
        zzfmu.zzd = () -> {
            zzfmu.zzd().zzg = 0;
            zzfmu.zzd().zzi.clear();
            zzfmu.zzd().zzh = false;
            for(Object object0: zzflk.zza().zzb()) {
                zzfkt zzfkt0 = (zzfkt)object0;
            }
            zzfmu.zzd().zzm = System.nanoTime();
            zzfmu.zzd().zzk.zzi();
            long v = System.nanoTime();
            zzflw zzflw0 = zzfmu.zzd().zzj.zza();
            if(zzfmu.zzd().zzk.zze().size() > 0) {
                for(Object object1: zzfmu.zzd().zzk.zze()) {
                    String s = (String)object1;
                    JSONObject jSONObject0 = zzflw0.zza(null);
                    View view0 = zzfmu.zzd().zzk.zza(s);
                    zzflw zzflw1 = zzfmu.zzd().zzj.zzb();
                    String s1 = zzfmu.zzd().zzk.zzc(s);
                    if(s1 != null) {
                        JSONObject jSONObject1 = zzflw1.zza(view0);
                        zzfmg.zzb(jSONObject1, s);
                        try {
                            jSONObject1.put("notVisibleReason", s1);
                        }
                        catch(JSONException jSONException0) {
                            zzfmh.zza("Error with setting not visible reason", jSONException0);
                        }
                        zzfmg.zzc(jSONObject0, jSONObject1);
                    }
                    zzfmg.zzf(jSONObject0);
                    HashSet hashSet0 = new HashSet();
                    hashSet0.add(s);
                    zzfmu.zzd().zzl.zzc(jSONObject0, hashSet0, v);
                }
            }
            if(zzfmu.zzd().zzk.zzf().size() > 0) {
                JSONObject jSONObject2 = zzflw0.zza(null);
                zzfmu.zzd().zzk(null, zzflw0, jSONObject2, 1, false);
                zzfmg.zzf(jSONObject2);
                zzfmu.zzd().zzl.zzd(jSONObject2, zzfmu.zzd().zzk.zzf(), v);
            }
            else {
                zzfmu.zzd().zzl.zzb();
            }
            zzfmu.zzd().zzk.zzg();
            long v1 = System.nanoTime() - zzfmu.zzd().zzm;
            if(zzfmu.zzd().zzf.size() > 0) {
                for(Object object2: zzfmu.zzd().zzf) {
                    zzfmt zzfmt0 = (zzfmt)object2;
                    TimeUnit.NANOSECONDS.toMillis(v1);
                    zzfmt0.zzb();
                    if(zzfmt0 instanceof zzfms) {
                        ((zzfms)zzfmt0).zza();
                    }
                }
            }
            zzflu.zza().zzc();
        };
        zzfmu.zze = new zzfmr();
    }

    zzfmu() {
        this.zzf = new ArrayList();
        this.zzh = false;
        this.zzi = new ArrayList();
        this.zzk = new zzfmn();
        this.zzj = new zzflx();
        this.zzl = new zzfmo(new zzfmx());
    }

    @Override  // com.google.android.gms.internal.ads.zzflv
    public final void zza(View view0, zzflw zzflw0, JSONObject jSONObject0, boolean z) {
        boolean z2;
        if(zzfml.zza(view0) == null) {
            int v = this.zzk.zzl(view0);
            if(v != 3) {
                JSONObject jSONObject1 = zzflw0.zza(view0);
                zzfmg.zzc(jSONObject0, jSONObject1);
                String s = this.zzk.zzd(view0);
                if(s == null) {
                    zzfmm zzfmm0 = this.zzk.zzb(view0);
                    if(zzfmm0 == null) {
                        z2 = false;
                    }
                    else {
                        zzfln zzfln0 = zzfmm0.zza();
                        JSONArray jSONArray0 = new JSONArray();
                        ArrayList arrayList0 = zzfmm0.zzb();
                        int v1 = arrayList0.size();
                        for(int v2 = 0; v2 < v1; ++v2) {
                            jSONArray0.put(((String)arrayList0.get(v2)));
                        }
                        try {
                            jSONObject1.put("isFriendlyObstructionFor", jSONArray0);
                            jSONObject1.put("friendlyObstructionClass", zzfln0.zzd());
                            jSONObject1.put("friendlyObstructionPurpose", zzfln0.zza());
                            jSONObject1.put("friendlyObstructionReason", zzfln0.zzc());
                        }
                        catch(JSONException jSONException2) {
                            zzfmh.zza("Error with setting friendly obstruction", jSONException2);
                        }
                        z2 = true;
                    }
                    this.zzk(view0, zzflw0, jSONObject1, v, z || z2);
                }
                else {
                    zzfmg.zzb(jSONObject1, s);
                    Boolean boolean0 = Boolean.valueOf(this.zzk.zzk(view0));
                    try {
                        jSONObject1.put("hasWindowFocus", boolean0);
                    }
                    catch(JSONException jSONException0) {
                        zzfmh.zza("Error with setting has window focus", jSONException0);
                    }
                    boolean z1 = this.zzk.zzj(s);
                    Boolean boolean1 = Boolean.valueOf(z1);
                    if(z1) {
                        try {
                            jSONObject1.put("isPipActive", boolean1);
                        }
                        catch(JSONException jSONException1) {
                            zzfmh.zza("Error with setting is picture-in-picture active", jSONException1);
                        }
                    }
                    this.zzk.zzh();
                }
                ++this.zzg;
            }
        }
    }

    public static zzfmu zzd() {
        return zzfmu.zza;
    }

    // 检测为 Lambda 实现
    static void zzg(zzfmu zzfmu0) [...]

    public final void zzh() {
        zzfmu.zzl();
    }

    public final void zzi() {
        if(zzfmu.zzc == null) {
            Handler handler0 = new Handler(Looper.getMainLooper());
            zzfmu.zzc = handler0;
            handler0.post(zzfmu.zzd);
            zzfmu.zzc.postDelayed(zzfmu.zze, 200L);
        }
    }

    public final void zzj() {
        zzfmu.zzl();
        this.zzf.clear();
        zzfmp zzfmp0 = new zzfmp(this);
        zzfmu.zzb.post(zzfmp0);
    }

    private final void zzk(View view0, zzflw zzflw0, JSONObject jSONObject0, int v, boolean z) {
        zzflw0.zzb(view0, jSONObject0, this, v == 1, z);
    }

    private static final void zzl() {
        Handler handler0 = zzfmu.zzc;
        if(handler0 != null) {
            handler0.removeCallbacks(zzfmu.zze);
            zzfmu.zzc = null;
        }
    }
}

