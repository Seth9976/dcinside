package com.google.android.gms.flags;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
@Deprecated
public abstract class Flag {
    @Deprecated
    public static class BooleanFlag extends Flag {
        public BooleanFlag(int v, String s, Boolean boolean0) {
            super(v, s, boolean0, null);
        }

        @Override  // com.google.android.gms.flags.Flag
        public final Object zza(zzc zzc0) {
            return this.zzb(zzc0);
        }

        private final Boolean zzb(zzc zzc0) {
            try {
                return Boolean.valueOf(zzc0.getBooleanFlagValue(this.getKey(), ((Boolean)this.zzb()).booleanValue(), this.getSource()));
            }
            catch(RemoteException unused_ex) {
                return (Boolean)this.zzb();
            }
        }
    }

    @KeepForSdk
    @Deprecated
    public static class IntegerFlag extends Flag {
        public IntegerFlag(int v, String s, Integer integer0) {
            super(v, s, integer0, null);
        }

        @Override  // com.google.android.gms.flags.Flag
        public final Object zza(zzc zzc0) {
            return this.zzc(zzc0);
        }

        private final Integer zzc(zzc zzc0) {
            try {
                return zzc0.getIntFlagValue(this.getKey(), ((int)(((Integer)this.zzb()))), this.getSource());
            }
            catch(RemoteException unused_ex) {
                return (Integer)this.zzb();
            }
        }
    }

    @KeepForSdk
    @Deprecated
    public static class LongFlag extends Flag {
        public LongFlag(int v, String s, Long long0) {
            super(v, s, long0, null);
        }

        @Override  // com.google.android.gms.flags.Flag
        public final Object zza(zzc zzc0) {
            return this.zzd(zzc0);
        }

        private final Long zzd(zzc zzc0) {
            try {
                return zzc0.getLongFlagValue(this.getKey(), ((long)(((Long)this.zzb()))), this.getSource());
            }
            catch(RemoteException unused_ex) {
                return (Long)this.zzb();
            }
        }
    }

    @KeepForSdk
    @Deprecated
    public static class StringFlag extends Flag {
        public StringFlag(int v, String s, String s1) {
            super(v, s, s1, null);
        }

        @Override  // com.google.android.gms.flags.Flag
        public final Object zza(zzc zzc0) {
            return this.zze(zzc0);
        }

        private final String zze(zzc zzc0) {
            try {
                return zzc0.getStringFlagValue(this.getKey(), ((String)this.zzb()), this.getSource());
            }
            catch(RemoteException unused_ex) {
                return (String)this.zzb();
            }
        }
    }

    private final String mKey;
    private final int zze;
    private final Object zzf;

    private Flag(int v, String s, Object object0) {
        this.zze = v;
        this.mKey = s;
        this.zzf = object0;
        Singletons.flagRegistry().zza(this);
    }

    Flag(int v, String s, Object object0, zza zza0) {
        this(v, s, object0);
    }

    @KeepForSdk
    @Deprecated
    public static BooleanFlag define(int v, String s, Boolean boolean0) {
        return new BooleanFlag(v, s, boolean0);
    }

    @KeepForSdk
    @Deprecated
    public static IntegerFlag define(int v, String s, int v1) {
        return new IntegerFlag(v, s, v1);
    }

    @KeepForSdk
    @Deprecated
    public static LongFlag define(int v, String s, long v1) {
        return new LongFlag(v, s, v1);
    }

    @KeepForSdk
    @Deprecated
    public static StringFlag define(int v, String s, String s1) {
        return new StringFlag(v, s, s1);
    }

    @KeepForSdk
    public Object get() {
        return Singletons.zzd().zzb(this);
    }

    public final String getKey() {
        return this.mKey;
    }

    @Deprecated
    public final int getSource() {
        return this.zze;
    }

    protected abstract Object zza(zzc arg1);

    public final Object zzb() {
        return this.zzf;
    }
}

