package com.google.android.gms.internal.clearcut;

public final class zzt {
    public static final class zza extends zzcg implements zzdq {
        public static final class com.google.android.gms.internal.clearcut.zzt.zza.zza extends com.google.android.gms.internal.clearcut.zzcg.zza implements zzdq {
            private com.google.android.gms.internal.clearcut.zzt.zza.zza() {
                super(zza.zzbf);
            }

            com.google.android.gms.internal.clearcut.zzt.zza.zza(zzu zzu0) {
            }
        }

        public static enum zzb implements zzcj {
            ARCH_UNKNOWN(0),
            ARCH_NON_NATIVE(1),
            ARCH_ARMV5(2),
            ARCH_ARMV7(4),
            ARCH_ARM64(5),
            ARCH_MIPS(6),
            ARCH_MIPS_64(7),
            ARCH_X86(8),
            ARCH_X86_64(9);

            private final int value;
            private static final zzck zzbq;

            static {
                zzb.zzbq = (int v) -> switch(v) {
                    case 0: {
                        return zzb.zzbh;
                    }
                    case 1: {
                        return zzb.zzbi;
                    }
                    case 2: {
                        return zzb.zzbj;
                    }
                    case 4: {
                        return zzb.zzbk;
                    }
                    case 5: {
                        return zzb.zzbl;
                    }
                    case 6: {
                        return zzb.zzbm;
                    }
                    case 7: {
                        return zzb.zzbn;
                    }
                    case 8: {
                        return zzb.zzbo;
                    }
                    case 9: {
                        return zzb.zzbp;
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
            public static zzb zza(int v) [...]

            @Override  // com.google.android.gms.internal.clearcut.zzcj
            public final int zzc() {
                return this.value;
            }

            public static zzck zzd() {
                return zzb.zzbq;
            }
        }

        public static enum zzc implements zzcj {
            BUILD_TYPE_UNKNOWN(0),
            BUILD_TYPE_PROD(1),
            BUILD_TYPE_INTERNAL(2),
            BUILD_TYPE_PRODLMP(3),
            BUILD_TYPE_THINGS(4),
            BUILD_TYPE_PRODMNC(5),
            BUILD_TYPE_WEARABLE(6),
            BUILD_TYPE_AUTO(7),
            BUILD_TYPE_SIDEWINDERMNC(8),
            BUILD_TYPE_ATV(9),
            BUILD_TYPE_PRODPIX(10),
            BUILD_TYPE_PRODPI(11);

            private final int value;
            private static final zzck zzbq;

            static {
                zzc.zzbq = (int v) -> switch(v) {
                    case 0: {
                        return zzc.zzbs;
                    }
                    case 1: {
                        return zzc.zzbt;
                    }
                    case 2: {
                        return zzc.zzbu;
                    }
                    case 3: {
                        return zzc.zzbv;
                    }
                    case 4: {
                        return zzc.zzbw;
                    }
                    case 5: {
                        return zzc.zzbx;
                    }
                    case 6: {
                        return zzc.zzby;
                    }
                    case 7: {
                        return zzc.zzbz;
                    }
                    case 8: {
                        return zzc.zzca;
                    }
                    case 9: {
                        return zzc.zzcb;
                    }
                    case 10: {
                        return zzc.zzcc;
                    }
                    case 11: {
                        return zzc.zzcd;
                    }
                    default: {
                        return null;
                    }
                };
            }

            private zzc(int v1) {
                this.value = v1;
            }

            // 检测为 Lambda 实现
            public static zzc zzc(int v) [...]

            @Override  // com.google.android.gms.internal.clearcut.zzcj
            public final int zzc() {
                return this.value;
            }

            public static zzck zzd() {
                return zzc.zzbq;
            }
        }

        public static enum zzd implements zzcj {
            DENSITY_UNKNOWN(0),
            DENSITY_ALLDPI(1),
            DENSITY_LDPI(2),
            DENSITY_MDPI(3),
            DENSITY_TVDPI(4),
            DENSITY_HDPI(5),
            DENSITY_XHDPI(7),
            DENSITY_DPI400(8),
            DENSITY_XXHDPI(9),
            DENSITY_XXXHDPI(10);

            private final int value;
            private static final zzck zzbq;

            static {
                zzd.zzbq = (int v) -> switch(v) {
                    case 0: {
                        return zzd.zzcf;
                    }
                    case 1: {
                        return zzd.zzcg;
                    }
                    case 2: {
                        return zzd.zzch;
                    }
                    case 3: {
                        return zzd.zzci;
                    }
                    case 4: {
                        return zzd.zzcj;
                    }
                    case 5: {
                        return zzd.zzck;
                    }
                    case 7: {
                        return zzd.zzcl;
                    }
                    case 8: {
                        return zzd.zzcm;
                    }
                    case 9: {
                        return zzd.zzcn;
                    }
                    case 10: {
                        return zzd.zzco;
                    }
                    default: {
                        return null;
                    }
                };
            }

            private zzd(int v1) {
                this.value = v1;
            }

            @Override  // com.google.android.gms.internal.clearcut.zzcj
            public final int zzc() {
                return this.value;
            }

            public static zzck zzd() {
                return zzd.zzbq;
            }

            // 检测为 Lambda 实现
            public static zzd zzd(int v) [...]
        }

        private int zzbb;
        private int zzbc;
        private int zzbd;
        private int zzbe;
        private static final zza zzbf;
        private static volatile zzdz zzbg;

        static {
            zza zzt$zza0 = new zza();
            zza.zzbf = zzt$zza0;
            zzcg.zza(zza.class, zzt$zza0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzcg
        protected final Object zza(int v, Object object0, Object object1) {
            switch(zzu.zzba[v - 1]) {
                case 1: {
                    return new zza();
                }
                case 2: {
                    return new com.google.android.gms.internal.clearcut.zzt.zza.zza(null);
                }
                case 3: {
                    return zzcg.zza(zza.zzbf, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002", new Object[]{"zzbb", "zzbc", zzc.zzd(), "zzbd", zzb.zzd(), "zzbe", zzd.zzd()});
                }
                case 4: {
                    return zza.zzbf;
                }
                case 5: {
                    zzdz zzdz0 = zza.zzbg;
                    if(zzdz0 == null) {
                        Class class0 = zza.class;
                        synchronized(class0) {
                            zzdz0 = zza.zzbg;
                            if(zzdz0 == null) {
                                zzdz0 = new com.google.android.gms.internal.clearcut.zzcg.zzb(zza.zzbf);
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

