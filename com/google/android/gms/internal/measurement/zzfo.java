package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfo {
    public static final class zza extends zzjt implements zzle {
        public static final class com.google.android.gms.internal.measurement.zzfo.zza.zza extends zzb implements zzle {
            private com.google.android.gms.internal.measurement.zzfo.zza.zza() {
                super(zza.zzc);
            }

            com.google.android.gms.internal.measurement.zzfo.zza.zza(zzfs zzfs0) {
            }

            public final int zza() {
                return ((zza)this.zza).zzb();
            }

            public final com.google.android.gms.internal.measurement.zzfo.zza.zza zza(int v, com.google.android.gms.internal.measurement.zzfo.zzb.zza zzfo$zzb$zza0) {
                this.zzak();
                zza.zza(((zza)this.zza), v, ((com.google.android.gms.internal.measurement.zzfo.zzb)(((zzjt)zzfo$zzb$zza0.zzai()))));
                return this;
            }

            public final com.google.android.gms.internal.measurement.zzfo.zza.zza zza(int v, com.google.android.gms.internal.measurement.zzfo.zze.zza zzfo$zze$zza0) {
                this.zzak();
                zza.zza(((zza)this.zza), v, ((zze)(((zzjt)zzfo$zze$zza0.zzai()))));
                return this;
            }

            public final com.google.android.gms.internal.measurement.zzfo.zzb zza(int v) {
                return ((zza)this.zza).zza(v);
            }

            public final int zzb() {
                return ((zza)this.zza).zzc();
            }

            public final zze zzb(int v) {
                return ((zza)this.zza).zzb(v);
            }
        }

        private static final zza zzc;
        private static volatile zzll zzd;
        private int zze;
        private int zzf;
        private zzkc zzg;
        private zzkc zzh;
        private boolean zzi;
        private boolean zzj;

        static {
            zza zzfo$zza0 = new zza();
            zza.zzc = zzfo$zza0;
            zzjt.zza(zza.class, zzfo$zza0);
        }

        private zza() {
            this.zzg = zzjt.zzch();
            this.zzh = zzjt.zzch();
        }

        static void zza(zza zzfo$zza0, int v, com.google.android.gms.internal.measurement.zzfo.zzb zzfo$zzb0) {
            zzfo$zzb0.getClass();
            zzkc zzkc0 = zzfo$zza0.zzh;
            if(!zzkc0.zzc()) {
                zzfo$zza0.zzh = zzjt.zza(zzkc0);
            }
            zzfo$zza0.zzh.set(v, zzfo$zzb0);
        }

        static void zza(zza zzfo$zza0, int v, zze zzfo$zze0) {
            zzfo$zze0.getClass();
            zzkc zzkc0 = zzfo$zza0.zzg;
            if(!zzkc0.zzc()) {
                zzfo$zza0.zzg = zzjt.zza(zzkc0);
            }
            zzfo$zza0.zzg.set(v, zzfo$zze0);
        }

        public final int zza() {
            return this.zzf;
        }

        public final com.google.android.gms.internal.measurement.zzfo.zzb zza(int v) {
            return (com.google.android.gms.internal.measurement.zzfo.zzb)this.zzh.get(v);
        }

        @Override  // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int v, Object object0, Object object1) {
            switch(zzfn.zza[v - 1]) {
                case 1: {
                    return new zza();
                }
                case 2: {
                    return new com.google.android.gms.internal.measurement.zzfo.zza.zza(null);
                }
                case 3: {
                    return zzjt.zza(zza.zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001B\u0003\u001B\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zze.class, "zzh", com.google.android.gms.internal.measurement.zzfo.zzb.class, "zzi", "zzj"});
                }
                case 4: {
                    return zza.zzc;
                }
                case 5: {
                    zzll zzll0 = zza.zzd;
                    if(zzll0 == null) {
                        Class class0 = zza.class;
                        synchronized(class0) {
                            zzll0 = zza.zzd;
                            if(zzll0 == null) {
                                zzll0 = new com.google.android.gms.internal.measurement.zzjt.zza(zza.zzc);
                                zza.zzd = zzll0;
                            }
                        }
                    }
                    return zzll0;
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

        public final int zzb() {
            return this.zzh.size();
        }

        public final zze zzb(int v) {
            return (zze)this.zzg.get(v);
        }

        public final int zzc() {
            return this.zzg.size();
        }

        public final List zze() {
            return this.zzh;
        }

        public final List zzf() {
            return this.zzg;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }
    }

    public static final class com.google.android.gms.internal.measurement.zzfo.zzb extends zzjt implements zzle {
        public static final class com.google.android.gms.internal.measurement.zzfo.zzb.zza extends zzb implements zzle {
            private com.google.android.gms.internal.measurement.zzfo.zzb.zza() {
                super(com.google.android.gms.internal.measurement.zzfo.zzb.zzc);
            }

            com.google.android.gms.internal.measurement.zzfo.zzb.zza(zzfs zzfs0) {
            }

            public final int zza() {
                return ((com.google.android.gms.internal.measurement.zzfo.zzb)this.zza).zza();
            }

            public final com.google.android.gms.internal.measurement.zzfo.zzb.zza zza(int v, zzc zzfo$zzc0) {
                this.zzak();
                com.google.android.gms.internal.measurement.zzfo.zzb.zza(((com.google.android.gms.internal.measurement.zzfo.zzb)this.zza), v, zzfo$zzc0);
                return this;
            }

            public final com.google.android.gms.internal.measurement.zzfo.zzb.zza zza(String s) {
                this.zzak();
                com.google.android.gms.internal.measurement.zzfo.zzb.zza(((com.google.android.gms.internal.measurement.zzfo.zzb)this.zza), s);
                return this;
            }

            public final zzc zza(int v) {
                return ((com.google.android.gms.internal.measurement.zzfo.zzb)this.zza).zza(v);
            }

            public final String zzb() {
                return ((com.google.android.gms.internal.measurement.zzfo.zzb)this.zza).zzf();
            }
        }

        private static final com.google.android.gms.internal.measurement.zzfo.zzb zzc;
        private static volatile zzll zzd;
        private int zze;
        private int zzf;
        private String zzg;
        private zzkc zzh;
        private boolean zzi;
        private zzd zzj;
        private boolean zzk;
        private boolean zzl;
        private boolean zzm;

        static {
            com.google.android.gms.internal.measurement.zzfo.zzb zzfo$zzb0 = new com.google.android.gms.internal.measurement.zzfo.zzb();
            com.google.android.gms.internal.measurement.zzfo.zzb.zzc = zzfo$zzb0;
            zzjt.zza(com.google.android.gms.internal.measurement.zzfo.zzb.class, zzfo$zzb0);
        }

        private com.google.android.gms.internal.measurement.zzfo.zzb() {
            this.zzg = "";
            this.zzh = zzjt.zzch();
        }

        static void zza(com.google.android.gms.internal.measurement.zzfo.zzb zzfo$zzb0, int v, zzc zzfo$zzc0) {
            zzfo$zzc0.getClass();
            zzkc zzkc0 = zzfo$zzb0.zzh;
            if(!zzkc0.zzc()) {
                zzfo$zzb0.zzh = zzjt.zza(zzkc0);
            }
            zzfo$zzb0.zzh.set(v, zzfo$zzc0);
        }

        static void zza(com.google.android.gms.internal.measurement.zzfo.zzb zzfo$zzb0, String s) {
            s.getClass();
            zzfo$zzb0.zze |= 2;
            zzfo$zzb0.zzg = s;
        }

        public final int zza() {
            return this.zzh.size();
        }

        public final zzc zza(int v) {
            return (zzc)this.zzh.get(v);
        }

        @Override  // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int v, Object object0, Object object1) {
            switch(zzfn.zza[v - 1]) {
                case 1: {
                    return new com.google.android.gms.internal.measurement.zzfo.zzb();
                }
                case 2: {
                    return new com.google.android.gms.internal.measurement.zzfo.zzb.zza(null);
                }
                case 3: {
                    return zzjt.zza(com.google.android.gms.internal.measurement.zzfo.zzb.zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001B\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", zzc.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
                }
                case 4: {
                    return com.google.android.gms.internal.measurement.zzfo.zzb.zzc;
                }
                case 5: {
                    zzll zzll0 = com.google.android.gms.internal.measurement.zzfo.zzb.zzd;
                    if(zzll0 == null) {
                        Class class0 = com.google.android.gms.internal.measurement.zzfo.zzb.class;
                        synchronized(class0) {
                            zzll0 = com.google.android.gms.internal.measurement.zzfo.zzb.zzd;
                            if(zzll0 == null) {
                                zzll0 = new com.google.android.gms.internal.measurement.zzjt.zza(com.google.android.gms.internal.measurement.zzfo.zzb.zzc);
                                com.google.android.gms.internal.measurement.zzfo.zzb.zzd = zzll0;
                            }
                        }
                    }
                    return zzll0;
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

        public final int zzb() {
            return this.zzf;
        }

        public static com.google.android.gms.internal.measurement.zzfo.zzb.zza zzc() {
            return (com.google.android.gms.internal.measurement.zzfo.zzb.zza)com.google.android.gms.internal.measurement.zzfo.zzb.zzc.zzcc();
        }

        public final zzd zze() {
            return this.zzj == null ? zzd.zzc() : this.zzj;
        }

        public final String zzf() [...] // 潜在的解密器

        public final List zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            return this.zzl;
        }

        public final boolean zzj() {
            return this.zzm;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 0x40) != 0;
        }
    }

    public static final class zzc extends zzjt implements zzle {
        public static final class com.google.android.gms.internal.measurement.zzfo.zzc.zza extends zzb implements zzle {
            private com.google.android.gms.internal.measurement.zzfo.zzc.zza() {
                super(zzc.zzc);
            }

            com.google.android.gms.internal.measurement.zzfo.zzc.zza(zzfs zzfs0) {
            }

            public final com.google.android.gms.internal.measurement.zzfo.zzc.zza zza(String s) {
                this.zzak();
                zzc.zza(((zzc)this.zza), s);
                return this;
            }
        }

        private static final zzc zzc;
        private static volatile zzll zzd;
        private int zze;
        private zzf zzf;
        private zzd zzg;
        private boolean zzh;
        private String zzi;

        static {
            zzc zzfo$zzc0 = new zzc();
            zzc.zzc = zzfo$zzc0;
            zzjt.zza(zzc.class, zzfo$zzc0);
        }

        private zzc() {
            this.zzi = "";
        }

        static void zza(zzc zzfo$zzc0, String s) {
            s.getClass();
            zzfo$zzc0.zze |= 8;
            zzfo$zzc0.zzi = s;
        }

        @Override  // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int v, Object object0, Object object1) {
            switch(zzfn.zza[v - 1]) {
                case 1: {
                    return new zzc();
                }
                case 2: {
                    return new com.google.android.gms.internal.measurement.zzfo.zzc.zza(null);
                }
                case 3: {
                    return zzjt.zza(zzc.zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                }
                case 4: {
                    return zzc.zzc;
                }
                case 5: {
                    zzll zzll0 = zzc.zzd;
                    if(zzll0 == null) {
                        Class class0 = zzc.class;
                        synchronized(class0) {
                            zzll0 = zzc.zzd;
                            if(zzll0 == null) {
                                zzll0 = new com.google.android.gms.internal.measurement.zzjt.zza(zzc.zzc);
                                zzc.zzd = zzll0;
                            }
                        }
                    }
                    return zzll0;
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

        public static zzc zzb() {
            return zzc.zzc;
        }

        public final zzd zzc() {
            return this.zzg == null ? zzd.zzc() : this.zzg;
        }

        public final zzf zzd() {
            return this.zzf == null ? zzf.zzd() : this.zzf;
        }

        public final String zze() [...] // 潜在的解密器

        public final boolean zzf() {
            return this.zzh;
        }

        public final boolean zzg() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 1) != 0;
        }
    }

    public static final class zzd extends zzjt implements zzle {
        public static final class com.google.android.gms.internal.measurement.zzfo.zzd.zza extends zzb implements zzle {
            private com.google.android.gms.internal.measurement.zzfo.zzd.zza() {
                super(zzd.zzc);
            }

            com.google.android.gms.internal.measurement.zzfo.zzd.zza(zzfs zzfs0) {
            }
        }

        public static enum com.google.android.gms.internal.measurement.zzfo.zzd.zzb implements zzjy {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);

            private final int zzg;

            private com.google.android.gms.internal.measurement.zzfo.zzd.zzb(int v1) {
                this.zzg = v1;
            }

            // 去混淆评级： 低(40)
            @Override
            public final String toString() {
                return "<com.google.android.gms.internal.measurement.zzfo$zzd$zzb" + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + this.name() + '>';
            }

            public static com.google.android.gms.internal.measurement.zzfo.zzd.zzb zza(int v) {
                switch(v) {
                    case 0: {
                        return com.google.android.gms.internal.measurement.zzfo.zzd.zzb.zza;
                    }
                    case 1: {
                        return com.google.android.gms.internal.measurement.zzfo.zzd.zzb.zzb;
                    }
                    case 2: {
                        return com.google.android.gms.internal.measurement.zzfo.zzd.zzb.zzc;
                    }
                    case 3: {
                        return com.google.android.gms.internal.measurement.zzfo.zzd.zzb.zzd;
                    }
                    case 4: {
                        return com.google.android.gms.internal.measurement.zzfo.zzd.zzb.zze;
                    }
                    default: {
                        return null;
                    }
                }
            }

            @Override  // com.google.android.gms.internal.measurement.zzjy
            public final int zza() {
                return this.zzg;
            }

            public static zzjx zzb() {
                return zzfp.zza;
            }
        }

        private static final zzd zzc;
        private static volatile zzll zzd;
        private int zze;
        private int zzf;
        private boolean zzg;
        private String zzh;
        private String zzi;
        private String zzj;

        static {
            zzd zzfo$zzd0 = new zzd();
            zzd.zzc = zzfo$zzd0;
            zzjt.zza(zzd.class, zzfo$zzd0);
        }

        private zzd() {
            this.zzh = "";
            this.zzi = "";
            this.zzj = "";
        }

        public final com.google.android.gms.internal.measurement.zzfo.zzd.zzb zza() {
            com.google.android.gms.internal.measurement.zzfo.zzd.zzb zzfo$zzd$zzb0 = com.google.android.gms.internal.measurement.zzfo.zzd.zzb.zza(this.zzf);
            return zzfo$zzd$zzb0 == null ? com.google.android.gms.internal.measurement.zzfo.zzd.zzb.zza : zzfo$zzd$zzb0;
        }

        @Override  // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int v, Object object0, Object object1) {
            switch(zzfn.zza[v - 1]) {
                case 1: {
                    return new zzd();
                }
                case 2: {
                    return new com.google.android.gms.internal.measurement.zzfo.zzd.zza(null);
                }
                case 3: {
                    return zzjt.zza(zzd.zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", com.google.android.gms.internal.measurement.zzfo.zzd.zzb.zzb(), "zzg", "zzh", "zzi", "zzj"});
                }
                case 4: {
                    return zzd.zzc;
                }
                case 5: {
                    zzll zzll0 = zzd.zzd;
                    if(zzll0 == null) {
                        Class class0 = zzd.class;
                        synchronized(class0) {
                            zzll0 = zzd.zzd;
                            if(zzll0 == null) {
                                zzll0 = new com.google.android.gms.internal.measurement.zzjt.zza(zzd.zzc);
                                zzd.zzd = zzll0;
                            }
                        }
                    }
                    return zzll0;
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

        public static zzd zzc() {
            return zzd.zzc;
        }

        public final String zzd() [...] // 潜在的解密器

        public final String zze() [...] // 潜在的解密器

        public final String zzf() [...] // 潜在的解密器

        public final boolean zzg() {
            return this.zzg;
        }

        public final boolean zzh() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 8) != 0;
        }
    }

    public static final class zze extends zzjt implements zzle {
        public static final class com.google.android.gms.internal.measurement.zzfo.zze.zza extends zzb implements zzle {
            private com.google.android.gms.internal.measurement.zzfo.zze.zza() {
                super(zze.zzc);
            }

            com.google.android.gms.internal.measurement.zzfo.zze.zza(zzfs zzfs0) {
            }

            public final com.google.android.gms.internal.measurement.zzfo.zze.zza zza(String s) {
                this.zzak();
                zze.zza(((zze)this.zza), s);
                return this;
            }
        }

        private static final zze zzc;
        private static volatile zzll zzd;
        private int zze;
        private int zzf;
        private String zzg;
        private zzc zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        static {
            zze zzfo$zze0 = new zze();
            zze.zzc = zzfo$zze0;
            zzjt.zza(zze.class, zzfo$zze0);
        }

        private zze() {
            this.zzg = "";
        }

        static void zza(zze zzfo$zze0, String s) {
            s.getClass();
            zzfo$zze0.zze |= 2;
            zzfo$zze0.zzg = s;
        }

        public final int zza() {
            return this.zzf;
        }

        @Override  // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int v, Object object0, Object object1) {
            switch(zzfn.zza[v - 1]) {
                case 1: {
                    return new zze();
                }
                case 2: {
                    return new com.google.android.gms.internal.measurement.zzfo.zze.zza(null);
                }
                case 3: {
                    return zzjt.zza(zze.zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                }
                case 4: {
                    return zze.zzc;
                }
                case 5: {
                    zzll zzll0 = zze.zzd;
                    if(zzll0 == null) {
                        Class class0 = zze.class;
                        synchronized(class0) {
                            zzll0 = zze.zzd;
                            if(zzll0 == null) {
                                zzll0 = new com.google.android.gms.internal.measurement.zzjt.zza(zze.zzc);
                                zze.zzd = zzll0;
                            }
                        }
                    }
                    return zzll0;
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

        public final zzc zzb() {
            return this.zzh == null ? zzc.zzb() : this.zzh;
        }

        public static com.google.android.gms.internal.measurement.zzfo.zze.zza zzc() {
            return (com.google.android.gms.internal.measurement.zzfo.zze.zza)zze.zzc.zzcc();
        }

        public final String zze() [...] // 潜在的解密器

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 0x20) != 0;
        }
    }

    public static final class zzf extends zzjt implements zzle {
        public static final class com.google.android.gms.internal.measurement.zzfo.zzf.zza extends zzb implements zzle {
            private com.google.android.gms.internal.measurement.zzfo.zzf.zza() {
                super(zzf.zzc);
            }

            com.google.android.gms.internal.measurement.zzfo.zzf.zza(zzfs zzfs0) {
            }
        }

        public static enum com.google.android.gms.internal.measurement.zzfo.zzf.zzb implements zzjy {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);

            private final int zzi;

            private com.google.android.gms.internal.measurement.zzfo.zzf.zzb(int v1) {
                this.zzi = v1;
            }

            // 去混淆评级： 低(40)
            @Override
            public final String toString() {
                return "<com.google.android.gms.internal.measurement.zzfo$zzf$zzb" + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + this.name() + '>';
            }

            public static com.google.android.gms.internal.measurement.zzfo.zzf.zzb zza(int v) {
                switch(v) {
                    case 0: {
                        return com.google.android.gms.internal.measurement.zzfo.zzf.zzb.zza;
                    }
                    case 1: {
                        return com.google.android.gms.internal.measurement.zzfo.zzf.zzb.zzb;
                    }
                    case 2: {
                        return com.google.android.gms.internal.measurement.zzfo.zzf.zzb.zzc;
                    }
                    case 3: {
                        return com.google.android.gms.internal.measurement.zzfo.zzf.zzb.zzd;
                    }
                    case 4: {
                        return com.google.android.gms.internal.measurement.zzfo.zzf.zzb.zze;
                    }
                    case 5: {
                        return com.google.android.gms.internal.measurement.zzfo.zzf.zzb.zzf;
                    }
                    case 6: {
                        return com.google.android.gms.internal.measurement.zzfo.zzf.zzb.zzg;
                    }
                    default: {
                        return null;
                    }
                }
            }

            @Override  // com.google.android.gms.internal.measurement.zzjy
            public final int zza() {
                return this.zzi;
            }

            public static zzjx zzb() {
                return zzfq.zza;
            }
        }

        private static final zzf zzc;
        private static volatile zzll zzd;
        private int zze;
        private int zzf;
        private String zzg;
        private boolean zzh;
        private zzkc zzi;

        static {
            zzf zzfo$zzf0 = new zzf();
            zzf.zzc = zzfo$zzf0;
            zzjt.zza(zzf.class, zzfo$zzf0);
        }

        private zzf() {
            this.zzg = "";
            this.zzi = zzjt.zzch();
        }

        public final int zza() {
            return this.zzi.size();
        }

        @Override  // com.google.android.gms.internal.measurement.zzjt
        protected final Object zza(int v, Object object0, Object object1) {
            switch(zzfn.zza[v - 1]) {
                case 1: {
                    return new zzf();
                }
                case 2: {
                    return new com.google.android.gms.internal.measurement.zzfo.zzf.zza(null);
                }
                case 3: {
                    return zzjt.zza(zzf.zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001A", new Object[]{"zze", "zzf", com.google.android.gms.internal.measurement.zzfo.zzf.zzb.zzb(), "zzg", "zzh", "zzi"});
                }
                case 4: {
                    return zzf.zzc;
                }
                case 5: {
                    zzll zzll0 = zzf.zzd;
                    if(zzll0 == null) {
                        Class class0 = zzf.class;
                        synchronized(class0) {
                            zzll0 = zzf.zzd;
                            if(zzll0 == null) {
                                zzll0 = new com.google.android.gms.internal.measurement.zzjt.zza(zzf.zzc);
                                zzf.zzd = zzll0;
                            }
                        }
                    }
                    return zzll0;
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

        public final com.google.android.gms.internal.measurement.zzfo.zzf.zzb zzb() {
            com.google.android.gms.internal.measurement.zzfo.zzf.zzb zzfo$zzf$zzb0 = com.google.android.gms.internal.measurement.zzfo.zzf.zzb.zza(this.zzf);
            return zzfo$zzf$zzb0 == null ? com.google.android.gms.internal.measurement.zzfo.zzf.zzb.zza : zzfo$zzf$zzb0;
        }

        public static zzf zzd() {
            return zzf.zzc;
        }

        public final String zze() [...] // 潜在的解密器

        public final List zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 1) != 0;
        }
    }

}

