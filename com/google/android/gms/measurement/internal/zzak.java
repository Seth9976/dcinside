package com.google.android.gms.measurement.internal;

enum zzak {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzl;

    private zzak(char c) {
        this.zzl = c;
    }

    public static zzak zza(char c) {
        zzak[] arr_zzak = zzak.values();
        for(int v = 0; v < arr_zzak.length; ++v) {
            zzak zzak0 = arr_zzak[v];
            if(zzak0.zzl == c) {
                return zzak0;
            }
        }
        return zzak.zza;
    }
}

