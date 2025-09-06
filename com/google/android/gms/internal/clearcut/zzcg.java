package com.google.android.gms.internal.clearcut;

import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public abstract class zzcg extends zzas {
    public static class zza extends zzat {
        private final zzcg zzjs;
        protected zzcg zzjt;
        protected boolean zzju;

        protected zza(zzcg zzcg0) {
            this.zzjs = zzcg0;
            this.zzjt = (zzcg)zzcg0.zza(zzg.zzkg, null, null);
            this.zzju = false;
        }

        @Override  // com.google.android.gms.internal.clearcut.zzat
        public Object clone() throws CloneNotSupportedException {
            zza zzcg$zza0 = (zza)this.zzjs.zza(zzg.zzkh, null, null);
            zzcg$zza0.zza(((zzcg)this.zzbi()));
            return zzcg$zza0;
        }

        @Override  // com.google.android.gms.internal.clearcut.zzdq
        public final boolean isInitialized() {
            return zzcg.zza(this.zzjt, false);
        }

        private static void zza(zzcg zzcg0, zzcg zzcg1) {
            zzea.zzcm().zzp(zzcg0).zzc(zzcg0, zzcg1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzat
        protected final zzat zza(zzas zzas0) {
            return this.zza(((zzcg)zzas0));
        }

        public final zza zza(zzcg zzcg0) {
            this.zzbf();
            zza.zza(this.zzjt, zzcg0);
            return this;
        }

        @Override  // com.google.android.gms.internal.clearcut.zzdq
        public final zzdo zzbe() {
            return this.zzjs;
        }

        protected void zzbf() {
            if(this.zzju) {
                zzcg zzcg0 = (zzcg)this.zzjt.zza(zzg.zzkg, null, null);
                zza.zza(zzcg0, this.zzjt);
                this.zzjt = zzcg0;
                this.zzju = false;
            }
        }

        public zzcg zzbg() {
            if(this.zzju) {
                return this.zzjt;
            }
            zzcg zzcg0 = this.zzjt;
            zzea.zzcm().zzp(zzcg0).zzc(zzcg0);
            this.zzju = true;
            return this.zzjt;
        }

        public final zzcg zzbh() {
            zzcg zzcg0 = (zzcg)this.zzbi();
            int v = (byte)(((Byte)zzcg0.zza(zzg.zzkd, null, null)));
            boolean z = true;
            if(v != 1) {
                if(v == 0) {
                    z = false;
                }
                else {
                    z = zzea.zzcm().zzp(zzcg0).zzo(zzcg0);
                    zzcg0.zza(2, (z ? zzcg0 : null), null);
                }
            }
            if(!z) {
                throw new zzew(zzcg0);
            }
            return zzcg0;
        }

        @Override  // com.google.android.gms.internal.clearcut.zzdp
        public zzdo zzbi() {
            return this.zzbg();
        }

        @Override  // com.google.android.gms.internal.clearcut.zzdp
        public final zzdo zzbj() {
            zzdo zzdo0 = (zzcg)this.zzbi();
            int v = (byte)(((Byte)((zzcg)zzdo0).zza(zzg.zzkd, null, null)));
            boolean z = true;
            if(v != 1) {
                if(v == 0) {
                    z = false;
                }
                else {
                    z = zzea.zzcm().zzp(zzdo0).zzo(zzdo0);
                    ((zzcg)zzdo0).zza(2, (z ? zzdo0 : null), null);
                }
            }
            if(!z) {
                throw new zzew(zzdo0);
            }
            return zzdo0;
        }

        @Override  // com.google.android.gms.internal.clearcut.zzat
        public final zzat zzt() {
            return (zza)this.clone();
        }
    }

    public static final class zzb extends zzau {
        private zzcg zzjs;

        public zzb(zzcg zzcg0) {
            this.zzjs = zzcg0;
        }
    }

    public static class zzc extends zza implements zzdq {
        protected zzc(zzd zzcg$zzd0) {
            super(zzcg$zzd0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzcg$zza
        protected final void zzbf() {
            if(!this.zzju) {
                return;
            }
            super.zzbf();
            zzcg zzcg0 = this.zzjt;
            ((zzd)zzcg0).zzjv = (zzby)((zzd)zzcg0).zzjv.clone();
        }

        @Override  // com.google.android.gms.internal.clearcut.zzcg$zza
        public final zzcg zzbg() {
            return (zzd)this.zzbi();
        }

        @Override  // com.google.android.gms.internal.clearcut.zzcg$zza
        public final zzdo zzbi() {
            if(this.zzju) {
                return (zzd)this.zzjt;
            }
            ((zzd)this.zzjt).zzjv.zzv();
            return (zzd)super.zzbg();
        }
    }

    public static abstract class zzd extends zzcg implements zzdq {
        protected zzby zzjv;

        public zzd() {
            this.zzjv = zzby.zzar();
        }
    }

    static final class zze implements zzca {
        final int number;
        private final zzck zzjw;
        final zzfl zzjx;
        final boolean zzjy;
        final boolean zzjz;

        zze(zzck zzck0, int v, zzfl zzfl0, boolean z, boolean z1) {
            this.zzjw = null;
            this.number = 0x3F3FD17;
            this.zzjx = zzfl0;
            this.zzjy = false;
            this.zzjz = false;
        }

        @Override
        public final int compareTo(Object object0) {
            return this.number - ((zze)object0).number;
        }

        @Override  // com.google.android.gms.internal.clearcut.zzca
        public final zzdp zza(zzdp zzdp0, zzdo zzdo0) {
            return ((zza)zzdp0).zza(((zzcg)zzdo0));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzca
        public final zzdv zza(zzdv zzdv0, zzdv zzdv1) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.android.gms.internal.clearcut.zzca
        public final zzfl zzau() {
            return this.zzjx;
        }

        @Override  // com.google.android.gms.internal.clearcut.zzca
        public final zzfq zzav() {
            return this.zzjx.zzek();
        }

        @Override  // com.google.android.gms.internal.clearcut.zzca
        public final boolean zzaw() {
            return false;
        }

        @Override  // com.google.android.gms.internal.clearcut.zzca
        public final boolean zzax() {
            return false;
        }

        @Override  // com.google.android.gms.internal.clearcut.zzca
        public final int zzc() {
            return this.number;
        }
    }

    public static final class zzf extends zzbr {
        private final Object zzdu;
        private final zzdo zzka;
        private final zzdo zzkb;
        private final zze zzkc;

        zzf(zzdo zzdo0, Object object0, zzdo zzdo1, zze zzcg$zze0, Class class0) {
            if(zzdo0 == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if(zzcg$zze0.zzjx == zzfl.zzqm && zzdo1 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.zzka = zzdo0;
            this.zzdu = object0;
            this.zzkb = zzdo1;
            this.zzkc = zzcg$zze0;
        }
    }

    public static final class zzg {
        public static final enum int zzkd = 1;
        public static final enum int zzke = 2;
        public static final enum int zzkf = 3;
        public static final enum int zzkg = 4;
        public static final enum int zzkh = 5;
        public static final enum int zzki = 6;
        public static final enum int zzkj = 7;
        private static final int[] zzkk;
        public static final enum int zzkl;
        public static final enum int zzkm;
        private static final int[] zzkn;
        public static final enum int zzko;
        public static final enum int zzkp;
        private static final int[] zzkq;

        static {
            zzg.zzkk = new int[]{1, 2, 3, 4, 5, 6, 7};
            zzg.zzkl = 1;
            zzg.zzkm = 2;
            zzg.zzkn = new int[]{1, 2};
            zzg.zzko = 1;
            zzg.zzkp = 2;
            zzg.zzkq = new int[]{1, 2};
        }

        public static int[] values$50KLMJ33DTMIUPRFDTJMOP9FE1P6UT3FC9QMCBQ7CLN6ASJ1EHIM8JB5EDPM2PR59HKN8P949LIN8Q3FCHA6UIBEEPNMMP9R0() {
            return (int[])zzg.zzkk.clone();
        }
    }

    protected zzey zzjp;
    private int zzjq;
    private static Map zzjr;

    static {
        zzcg.zzjr = new ConcurrentHashMap();
    }

    public zzcg() {
        this.zzjp = zzey.zzea();
        this.zzjq = -1;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return ((zzcg)this.zza(zzg.zzki, null, null)).getClass().isInstance(object0) ? zzea.zzcm().zzp(this).equals(this, ((zzcg)object0)) : false;
    }

    @Override
    public int hashCode() {
        int v = this.zzex;
        if(v != 0) {
            return v;
        }
        int v1 = zzea.zzcm().zzp(this).hashCode(this);
        this.zzex = v1;
        return v1;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdq
    public final boolean isInitialized() {
        int v = (byte)(((Byte)this.zza(zzg.zzkd, null, null)));
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        boolean z = zzea.zzcm().zzp(this).zzo(this);
        this.zza(2, (z ? this : null), null);
        return z;
    }

    @Override
    public String toString() {
        return zzdr.zza(this, super.toString());
    }

    public static zzf zza(zzdo zzdo0, Object object0, zzdo zzdo1, zzck zzck0, int v, zzfl zzfl0, Class class0) {
        return new zzf(zzdo0, object0, zzdo1, new zze(null, 0x3F3FD17, zzfl0, false, false), class0);
    }

    private static zzcg zza(zzcg zzcg0, byte[] arr_b) throws zzco {
        zzcg zzcg1 = (zzcg)zzcg0.zza(zzg.zzkg, null, null);
        try {
            zzef zzef0 = zzea.zzcm().zzp(zzcg1);
            zzay zzay0 = new zzay();
            zzef0.zza(zzcg1, arr_b, 0, arr_b.length, zzay0);
            zzea.zzcm().zzp(zzcg1).zzc(zzcg1);
            if(zzcg1.zzex != 0) {
                throw new RuntimeException();
            }
            return zzcg1;
        }
        catch(IOException iOException0) {
            throw iOException0.getCause() instanceof zzco ? ((zzco)iOException0.getCause()) : new zzco(iOException0.getMessage()).zzg(zzcg1);
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw zzco.zzbl().zzg(zzcg1);
        }
    }

    protected static Object zza(zzdo zzdo0, String s, Object[] arr_object) {
        return new zzec(zzdo0, s, arr_object);
    }

    static Object zza(Method method0, Object object0, Object[] arr_object) {
        try {
            return method0.invoke(object0, arr_object);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException("Couldn\'t use Java reflection to implement protocol message reflection.", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Throwable throwable0 = invocationTargetException0.getCause();
            if(throwable0 instanceof RuntimeException) {
                throw (RuntimeException)throwable0;
            }
            if(throwable0 instanceof Error) {
                throw (Error)throwable0;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable0);
        }
    }

    protected static void zza(Class class0, zzcg zzcg0) {
        zzcg.zzjr.put(class0, zzcg0);
    }

    protected static final boolean zza(zzcg zzcg0, boolean z) {
        int v = (byte)(((Byte)zzcg0.zza(zzg.zzkd, null, null)));
        if(v == 1) {
            return true;
        }
        return v == 0 ? false : zzea.zzcm().zzp(zzcg0).zzo(zzcg0);
    }

    protected abstract Object zza(int arg1, Object arg2, Object arg3);

    @Override  // com.google.android.gms.internal.clearcut.zzdo
    public final int zzas() {
        if(this.zzjq == -1) {
            this.zzjq = zzea.zzcm().zzp(this).zzm(this);
        }
        return this.zzjq;
    }

    protected static zzcl zzaz() {
        return zzch.zzbk();
    }

    protected static zzcg zzb(zzcg zzcg0, byte[] arr_b) throws zzco {
        zzcg zzcg1 = zzcg.zza(zzcg0, arr_b);
        if(zzcg1 != null) {
            int v = (byte)(((Byte)zzcg1.zza(zzg.zzkd, null, null)));
            boolean z = true;
            if(v != 1) {
                if(v == 0) {
                    z = false;
                }
                else {
                    z = zzea.zzcm().zzp(zzcg1).zzo(zzcg1);
                    zzcg1.zza(2, (z ? zzcg1 : null), null);
                }
            }
            if(!z) {
                throw new zzco(new zzew(zzcg1).getMessage()).zzg(zzcg1);
            }
        }
        return zzcg1;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdo
    public final void zzb(zzbn zzbn0) throws IOException {
        zzea.zzcm().zze(this.getClass()).zza(this, zzbp.zza(zzbn0));
    }

    protected static zzcm zzba() {
        return zzdc.zzbx();
    }

    protected static zzcn zzbb() {
        return zzeb.zzcn();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdo
    public final zzdp zzbc() {
        zzdp zzdp0 = (zza)this.zza(zzg.zzkh, null, null);
        ((zza)zzdp0).zza(this);
        return zzdp0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdo
    public final zzdp zzbd() {
        return (zza)this.zza(zzg.zzkh, null, null);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdq
    public final zzdo zzbe() {
        return (zzcg)this.zza(zzg.zzki, null, null);
    }

    static zzcg zzc(Class class0) {
        zzcg zzcg0 = (zzcg)zzcg.zzjr.get(class0);
        if(zzcg0 == null) {
            try {
                Class.forName(class0.getName(), true, class0.getClassLoader());
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException0);
            }
            zzcg0 = (zzcg)zzcg.zzjr.get(class0);
        }
        if(zzcg0 == null) {
            String s = class0.getName();
            throw new IllegalStateException((s.length() == 0 ? new String("Unable to get default instance for: ") : "Unable to get default instance for: " + s));
        }
        return zzcg0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzas
    final void zzf(int v) {
        this.zzjq = v;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzas
    final int zzs() {
        return this.zzjq;
    }
}

