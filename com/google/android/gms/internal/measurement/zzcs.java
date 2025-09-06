package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import com.google.common.collect.D4;
import com.google.common.collect.u5;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

final class zzcs implements SharedPreferences.Editor {
    private boolean zza;
    private Set zzb;
    private Map zzc;
    private final zzcp zzd;

    private zzcs(zzcp zzcp0) {
        this.zzd = zzcp0;
        super();
        this.zza = false;
        this.zzb = new HashSet();
        this.zzc = new HashMap();
    }

    zzcs(zzcp zzcp0, zzcr zzcr0) {
        this(zzcp0);
    }

    @Override  // android.content.SharedPreferences$Editor
    public final void apply() {
        this.commit();
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor clear() {
        this.zza = true;
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final boolean commit() {
        if(this.zza) {
            this.zzd.zza.clear();
        }
        this.zzd.zza.keySet().removeAll(this.zzb);
        for(Object object0: this.zzc.entrySet()) {
            this.zzd.zza.put(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        for(Object object1: this.zzd.zzb) {
            SharedPreferences.OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener0 = (SharedPreferences.OnSharedPreferenceChangeListener)object1;
            u5 u50 = D4.O(this.zzb, this.zzc.keySet()).c();
            while(u50.hasNext()) {
                Object object2 = u50.next();
                sharedPreferences$OnSharedPreferenceChangeListener0.onSharedPreferenceChanged(this.zzd, ((String)object2));
            }
        }
        return this.zza || !this.zzb.isEmpty() || !this.zzc.isEmpty();
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putBoolean(String s, boolean z) {
        this.zza(s, Boolean.valueOf(z));
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putFloat(String s, float f) {
        this.zza(s, f);
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putInt(String s, int v) {
        this.zza(s, v);
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putLong(String s, long v) {
        this.zza(s, v);
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putString(String s, String s1) {
        this.zza(s, s1);
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putStringSet(String s, Set set0) {
        this.zza(s, set0);
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor remove(String s) {
        this.zzb.add(s);
        return this;
    }

    private final void zza(String s, Object object0) {
        if(object0 != null) {
            this.zzc.put(s, object0);
            return;
        }
        this.remove(s);
    }
}

