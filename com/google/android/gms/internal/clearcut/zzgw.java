package com.google.android.gms.internal.clearcut;

import java.util.List;

public final class zzgw {
    public static final class zza extends zzcg implements zzdq {
        public static final class com.google.android.gms.internal.clearcut.zzgw.zza.zza extends com.google.android.gms.internal.clearcut.zzcg.zza implements zzdq {
            private com.google.android.gms.internal.clearcut.zzgw.zza.zza() {
                super(zza.zzbir);
            }

            com.google.android.gms.internal.clearcut.zzgw.zza.zza(zzgx zzgx0) {
            }
        }

        public static final class zzb extends zzcg implements zzdq {
            public static final class com.google.android.gms.internal.clearcut.zzgw.zza.zzb.zza extends com.google.android.gms.internal.clearcut.zzcg.zza implements zzdq {
                private com.google.android.gms.internal.clearcut.zzgw.zza.zzb.zza() {
                    super(zzb.zzbiv);
                }

                com.google.android.gms.internal.clearcut.zzgw.zza.zzb.zza(zzgx zzgx0) {
                }

                public final com.google.android.gms.internal.clearcut.zzgw.zza.zzb.zza zzn(String s) {
                    this.zzbf();
                    ((zzb)this.zzjt).zzm(s);
                    return this;
                }

                public final com.google.android.gms.internal.clearcut.zzgw.zza.zzb.zza zzr(long v) {
                    this.zzbf();
                    ((zzb)this.zzjt).zzp(v);
                    return this;
                }

                public final com.google.android.gms.internal.clearcut.zzgw.zza.zzb.zza zzs(long v) {
                    this.zzbf();
                    ((zzb)this.zzjt).zzq(v);
                    return this;
                }
            }

            private int zzbb;
            private static volatile zzdz zzbg;
            private String zzbis;
            private long zzbit;
            private long zzbiu;
            private static final zzb zzbiv;
            private int zzya;

            static {
                zzb zzgw$zza$zzb0 = new zzb();
                zzb.zzbiv = zzgw$zza$zzb0;
                zzcg.zza(zzb.class, zzgw$zza$zzb0);
            }

            private zzb() {
                this.zzbis = "";
            }

            public final int getEventCode() {
                return this.zzya;
            }

            @Override  // com.google.android.gms.internal.clearcut.zzcg
            protected final Object zza(int v, Object object0, Object object1) {
                switch(zzgx.zzba[v - 1]) {
                    case 1: {
                        return new zzb();
                    }
                    case 2: {
                        return new com.google.android.gms.internal.clearcut.zzgw.zza.zzb.zza(null);
                    }
                    case 3: {
                        return zzcg.zza(zzb.zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
                    }
                    case 4: {
                        return zzb.zzbiv;
                    }
                    case 5: {
                        zzdz zzdz0 = zzb.zzbg;
                        if(zzdz0 == null) {
                            Class class0 = zzb.class;
                            synchronized(class0) {
                                zzdz0 = zzb.zzbg;
                                if(zzdz0 == null) {
                                    zzdz0 = new com.google.android.gms.internal.clearcut.zzcg.zzb(zzb.zzbiv);
                                    zzb.zzbg = zzdz0;
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

            public final boolean zzfv() {
                return (this.zzbb & 1) == 1;
            }

            public final String zzfw() [...] // 潜在的解密器

            public final long zzfx() {
                return this.zzbit;
            }

            public final long zzfy() {
                return this.zzbiu;
            }

            public static com.google.android.gms.internal.clearcut.zzgw.zza.zzb.zza zzfz() {
                return (com.google.android.gms.internal.clearcut.zzgw.zza.zzb.zza)(((com.google.android.gms.internal.clearcut.zzcg.zza)zzb.zzbiv.zza(zzg.zzkh, null, null)));
            }

            private final void zzm(String s) {
                s.getClass();
                this.zzbb |= 2;
                this.zzbis = s;
            }

            private final void zzp(long v) {
                this.zzbb |= 4;
                this.zzbit = v;
            }

            private final void zzq(long v) {
                this.zzbb |= 8;
                this.zzbiu = v;
            }
        }

        private static volatile zzdz zzbg;
        private zzcn zzbiq;
        private static final zza zzbir;

        static {
            zza zzgw$zza0 = new zza();
            zza.zzbir = zzgw$zza0;
            zzcg.zza(zza.class, zzgw$zza0);
        }

        private zza() {
            this.zzbiq = zzcg.zzbb();
        }

        @Override  // com.google.android.gms.internal.clearcut.zzcg
        protected final Object zza(int v, Object object0, Object object1) {
            switch(zzgx.zzba[v - 1]) {
                case 1: {
                    return new zza();
                }
                case 2: {
                    return new com.google.android.gms.internal.clearcut.zzgw.zza.zza(null);
                }
                case 3: {
                    return zzcg.zza(zza.zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001B", new Object[]{"zzbiq", zzb.class});
                }
                case 4: {
                    return zza.zzbir;
                }
                case 5: {
                    zzdz zzdz0 = zza.zzbg;
                    if(zzdz0 == null) {
                        Class class0 = zza.class;
                        synchronized(class0) {
                            zzdz0 = zza.zzbg;
                            if(zzdz0 == null) {
                                zzdz0 = new com.google.android.gms.internal.clearcut.zzcg.zzb(zza.zzbir);
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

        public final List zzfs() {
            return this.zzbiq;
        }

        public static zza zzft() {
            return zza.zzbir;
        }

        public static zza zzi(byte[] arr_b) throws zzco {
            return (zza)zzcg.zzb(zza.zzbir, arr_b);
        }
    }

}

