package com.google.android.gms.internal.clearcut;

final class zzbs {
    private static final Class zzgl;

    static {
        zzbs.zzgl = zzbs.zzak();
    }

    private static Class zzak() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        }
        catch(ClassNotFoundException unused_ex) {
            return null;
        }
    }

    public static zzbt zzal() {
        Class class0 = zzbs.zzgl;
        if(class0 != null) {
            try {
                return (zzbt)class0.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
            }
            catch(Exception unused_ex) {
            }
        }
        return zzbt.zzgo;
    }
}

