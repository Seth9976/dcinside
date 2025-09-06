package com.google.android.gms.internal.clearcut;

public final class zzgt {
    public static final class zza extends zzcg implements zzdq {
        public static final class com.google.android.gms.internal.clearcut.zzgt.zza.zza extends com.google.android.gms.internal.clearcut.zzcg.zza implements zzdq {
            private com.google.android.gms.internal.clearcut.zzgt.zza.zza() {
                super(zza.zzbil);
            }

            com.google.android.gms.internal.clearcut.zzgt.zza.zza(zzgu zzgu0) {
            }
        }

        public static enum zzb implements zzcj {
            NO_RESTRICTION(0),
            SIDEWINDER_DEVICE(1),
            LATCHSKY_DEVICE(2);

            private final int value;
            private static final zzck zzbq;

            static {
                zzb.zzbq = (int v) -> switch(v) {
                    case 0: {
                        return zzb.zzbim;
                    }
                    case 1: {
                        return zzb.zzbin;
                    }
                    case 2: {
                        return zzb.zzbio;
                    }
                    default: {
                        return null;
                    }
                };
            }

            private zzb(int v1) {
                this.value = v1;
            }

            // 检测为 Lambda 实现
            public static zzb zzbe(int v) [...]

            @Override  // com.google.android.gms.internal.clearcut.zzcj
            public final int zzc() {
                return this.value;
            }

            public static zzck zzd() {
                return zzb.zzbq;
            }
        }

        private static volatile zzdz zzbg;
        private static final zza zzbil;

        static {
            zza zzgt$zza0 = new zza();
            zza.zzbil = zzgt$zza0;
            zzcg.zza(zza.class, zzgt$zza0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzcg
        protected final Object zza(int v, Object object0, Object object1) {
            switch(zzgu.zzba[v - 1]) {
                case 1: {
                    return new zza();
                }
                case 2: {
                    return new com.google.android.gms.internal.clearcut.zzgt.zza.zza(null);
                }
                case 3: {
                    return zzcg.zza(zza.zzbil, "\u0001\u0000", null);
                }
                case 4: {
                    return zza.zzbil;
                }
                case 5: {
                    zzdz zzdz0 = zza.zzbg;
                    if(zzdz0 == null) {
                        Class class0 = zza.class;
                        synchronized(class0) {
                            zzdz0 = zza.zzbg;
                            if(zzdz0 == null) {
                                zzdz0 = new com.google.android.gms.internal.clearcut.zzcg.zzb(zza.zzbil);
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

