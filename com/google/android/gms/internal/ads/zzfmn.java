package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzfmn {
    private final HashMap zza;
    private final HashMap zzb;
    private final HashMap zzc;
    private final HashSet zzd;
    private final HashSet zze;
    private final HashSet zzf;
    private final HashMap zzg;
    private final HashSet zzh;
    private final Map zzi;
    private boolean zzj;

    public zzfmn() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashSet();
        this.zze = new HashSet();
        this.zzf = new HashSet();
        this.zzg = new HashMap();
        this.zzh = new HashSet();
        this.zzi = new WeakHashMap();
    }

    public final View zza(String s) {
        return (View)this.zzc.get(s);
    }

    public final zzfmm zzb(View view0) {
        zzfmm zzfmm0 = (zzfmm)this.zzb.get(view0);
        if(zzfmm0 != null) {
            this.zzb.remove(view0);
        }
        return zzfmm0;
    }

    public final String zzc(String s) {
        return (String)this.zzg.get(s);
    }

    public final String zzd(View view0) {
        if(this.zza.size() == 0) {
            return null;
        }
        String s = (String)this.zza.get(view0);
        if(s != null) {
            this.zza.remove(view0);
        }
        return s;
    }

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
        this.zzh.clear();
    }

    public final void zzh() {
        this.zzj = true;
    }

    public final void zzi() {
        Boolean boolean0;
        Activity activity0;
        zzflk zzflk0 = zzflk.zza();
        if(zzflk0 != null) {
            for(Object object0: zzflk0.zzb()) {
                zzfkt zzfkt0 = (zzfkt)object0;
                View view0 = zzfkt0.zzf();
                if(zzfkt0.zzj()) {
                    String s = zzfkt0.zzh();
                    if(view0 == null) {
                        this.zzf.add(s);
                        this.zzg.put(s, "noAdView");
                    }
                    else {
                        boolean z = false;
                        String s1 = null;
                        if(Build.VERSION.SDK_INT >= 24) {
                            Context context0 = view0.getContext();
                            while(true) {
                                activity0 = null;
                                if(context0 instanceof ContextWrapper) {
                                    if(context0 instanceof Activity) {
                                        activity0 = (Activity)context0;
                                    }
                                    else {
                                        context0 = ((ContextWrapper)context0).getBaseContext();
                                        continue;
                                    }
                                }
                                break;
                            }
                            if(activity0 != null) {
                                z = activity0.isInPictureInPictureMode();
                            }
                        }
                        if(z) {
                            this.zzh.add(s);
                        }
                        if(view0.isAttachedToWindow()) {
                            if(view0.hasWindowFocus()) {
                                this.zzi.remove(view0);
                                boolean0 = Boolean.FALSE;
                            }
                            else if(this.zzi.containsKey(view0)) {
                                boolean0 = (Boolean)this.zzi.get(view0);
                            }
                            else {
                                this.zzi.put(view0, Boolean.FALSE);
                                boolean0 = Boolean.FALSE;
                            }
                            if(!boolean0.booleanValue() || z) {
                                HashSet hashSet0 = new HashSet();
                                View view1 = view0;
                                while(true) {
                                    if(view1 != null) {
                                        String s2 = zzfml.zza(view1);
                                        if(s2 == null) {
                                            hashSet0.add(view1);
                                            ViewParent viewParent0 = view1.getParent();
                                            view1 = viewParent0 instanceof View ? ((View)viewParent0) : null;
                                            continue;
                                        }
                                        else {
                                            s1 = s2;
                                            break;
                                        }
                                    }
                                    this.zzd.addAll(hashSet0);
                                    break;
                                }
                            }
                            else {
                                s1 = "noWindowFocus";
                            }
                        }
                        else {
                            s1 = "notAttached";
                        }
                        if(s1 == null) {
                            this.zze.add(s);
                            this.zza.put(view0, s);
                            for(Object object1: zzfkt0.zzi()) {
                                zzfln zzfln0 = (zzfln)object1;
                                View view2 = (View)zzfln0.zzb().get();
                                if(view2 != null) {
                                    zzfmm zzfmm0 = (zzfmm)this.zzb.get(view2);
                                    if(zzfmm0 == null) {
                                        zzfmm zzfmm1 = new zzfmm(zzfln0, zzfkt0.zzh());
                                        this.zzb.put(view2, zzfmm1);
                                    }
                                    else {
                                        zzfmm0.zzc(zzfkt0.zzh());
                                    }
                                }
                            }
                        }
                        else {
                            if(s1 == "noWindowFocus") {
                                continue;
                            }
                            this.zzf.add(s);
                            this.zzc.put(s, view0);
                            this.zzg.put(s, s1);
                        }
                    }
                }
            }
        }
    }

    public final boolean zzj(String s) {
        return this.zzh.contains(s);
    }

    public final boolean zzk(View view0) {
        if(this.zzi.containsKey(view0)) {
            this.zzi.put(view0, Boolean.TRUE);
            return false;
        }
        return true;
    }

    public final int zzl(View view0) {
        if(this.zzd.contains(view0)) {
            return 1;
        }
        return this.zzj ? 2 : 3;
    }
}

