package com.google.android.gms.internal.clearcut;

public final class zzap {
    public static final class zza extends zzcg implements zzdq {
        public static final class com.google.android.gms.internal.clearcut.zzap.zza.zza extends com.google.android.gms.internal.clearcut.zzcg.zza implements zzdq {
            private com.google.android.gms.internal.clearcut.zzap.zza.zza() {
                super(zza.zzes);
            }

            com.google.android.gms.internal.clearcut.zzap.zza.zza(zzaq zzaq0) {
            }
        }

        public static enum zzb implements zzcj {
            UNKNOWN(0),
            ON(1),
            OFF(2);

            private final int value;
            private static final zzck zzbq;

            static {
                zzb.zzbq = (int v) -> switch(v) {
                    case 0: {
                        return zzb.zzet;
                    }
                    case 1: {
                        return zzb.zzeu;
                    }
                    case 2: {
                        return zzb.zzev;
                    }
                    default: {
                        return null;
                    }
                };
            }

            private zzb(int v1) {
                this.value = v1;
            }

            @Override  // com.google.android.gms.internal.clearcut.zzcj
            public final int zzc() {
                return this.value;
            }

            public static zzck zzd() {
                return zzb.zzbq;
            }

            // 检测为 Lambda 实现
            public static zzb zze(int v) [...]
        }

        private int zzbb;
        private static volatile zzdz zzbg;
        private int zzel;
        private int zzem;
        private int zzen;
        private int zzeo;
        private int zzep;
        private int zzeq;
        private int zzer;
        private static final zza zzes;

        static {
            zza zzap$zza0 = new zza();
            zza.zzes = zzap$zza0;
            zzcg.zza(zza.class, zzap$zza0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzcg
        protected final Object zza(int v, Object object0, Object object1) {
            switch(zzaq.zzba[v - 1]) {
                case 1: {
                    return new zza();
                }
                case 2: {
                    return new com.google.android.gms.internal.clearcut.zzap.zza.zza(null);
                }
                case 3: {
                    return zzcg.zza(zza.zzes, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003\u0005\f\u0004\u0006\f\u0005\u0007\f\u0006", new Object[]{"zzbb", "zzel", zzb.zzd(), "zzem", zzb.zzd(), "zzen", zzb.zzd(), "zzeo", zzb.zzd(), "zzep", zzb.zzd(), "zzeq", zzb.zzd(), "zzer", zzb.zzd()});
                }
                case 4: {
                    return zza.zzes;
                }
                case 5: {
                    zzdz zzdz0 = zza.zzbg;
                    if(zzdz0 == null) {
                        Class class0 = zza.class;
                        synchronized(class0) {
                            zzdz0 = zza.zzbg;
                            if(zzdz0 == null) {
                                zzdz0 = new com.google.android.gms.internal.clearcut.zzcg.zzb(zza.zzes);
                                zza.zzbg = zzdz0;
                            }
                        }
                    }
                    return zzdz0;
                }
                case 6: {
                    return (byte)1;
                }
                case 7: {
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }
    }

}

