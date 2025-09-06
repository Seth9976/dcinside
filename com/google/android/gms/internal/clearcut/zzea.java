package com.google.android.gms.internal.clearcut;

import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzea {
    private static final zzea zznc;
    private final zzeg zznd;
    private final ConcurrentMap zzne;

    static {
        zzea.zznc = new zzea();
    }

    private zzea() {
        this.zzne = new ConcurrentHashMap();
        zzeg zzeg0 = null;
        for(int v = 0; v <= 0; ++v) {
            zzeg0 = zzea.zzk("com.google.protobuf.AndroidProto3SchemaFactory");
            if(zzeg0 != null) {
                break;
            }
        }
        if(zzeg0 == null) {
            zzeg0 = new zzdd();
        }
        this.zznd = zzeg0;
    }

    public static zzea zzcm() {
        return zzea.zznc;
    }

    public final zzef zze(Class class0) {
        zzci.zza(class0, "messageType");
        zzef zzef0 = (zzef)this.zzne.get(class0);
        if(zzef0 == null) {
            zzef0 = this.zznd.zzd(class0);
            zzci.zza(class0, "messageType");
            zzci.zza(zzef0, "schema");
            zzef zzef1 = (zzef)this.zzne.putIfAbsent(class0, zzef0);
            return zzef1 == null ? zzef0 : zzef1;
        }
        return zzef0;
    }

    private static zzeg zzk(String s) {
        try {
            return (zzeg)Class.forName(s).getConstructor(null).newInstance(null);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public final zzef zzp(Object object0) {
        return this.zze(object0.getClass());
    }
}

