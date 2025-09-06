package com.google.android.gms.internal.vision;

import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class zzjb extends zzhf {
    public static final class zza extends zzhg {
        private final zzjb zza;

        public zza(zzjb zzjb0) {
            this.zza = zzjb0;
        }
    }

    public static class zzb extends zzhe {
        protected zzjb zza;
        protected boolean zzb;
        private final zzjb zzc;

        protected zzb(zzjb zzjb0) {
            this.zzc = zzjb0;
            this.zza = (zzjb)zzjb0.zza(zzg.zzd, null, null);
            this.zzb = false;
        }

        @Override  // com.google.android.gms.internal.vision.zzhe
        public Object clone() throws CloneNotSupportedException {
            zzb zzjb$zzb0 = (zzb)this.zzc.zza(zzg.zze, null, null);
            zzjb$zzb0.zza(((zzjb)this.zze()));
            return zzjb$zzb0;
        }

        private static void zza(zzjb zzjb0, zzjb zzjb1) {
            zzky.zza().zza(zzjb0).zzb(zzjb0, zzjb1);
        }

        @Override  // com.google.android.gms.internal.vision.zzhe
        public final zzhe zza() {
            return (zzb)this.clone();
        }

        @Override  // com.google.android.gms.internal.vision.zzhe
        protected final zzhe zza(zzhf zzhf0) {
            return this.zza(((zzjb)zzhf0));
        }

        @Override  // com.google.android.gms.internal.vision.zzhe
        public final zzhe zza(zzif zzif0, zzio zzio0) throws IOException {
            return this.zzb(zzif0, zzio0);
        }

        @Override  // com.google.android.gms.internal.vision.zzhe
        public final zzhe zza(byte[] arr_b, int v, int v1, zzio zzio0) throws zzjk {
            return this.zzb(arr_b, 0, v1, zzio0);
        }

        public final zzb zza(zzjb zzjb0) {
            if(this.zzb) {
                this.zzb();
                this.zzb = false;
            }
            zzb.zza(this.zza, zzjb0);
            return this;
        }

        private final zzb zzb(zzif zzif0, zzio zzio0) throws IOException {
            if(this.zzb) {
                this.zzb();
                this.zzb = false;
            }
            try {
                zzky.zza().zza(this.zza).zza(this.zza, zzig.zza(zzif0), zzio0);
                return this;
            }
            catch(RuntimeException runtimeException0) {
                if(runtimeException0.getCause() instanceof IOException) {
                    throw (IOException)runtimeException0.getCause();
                }
                throw runtimeException0;
            }
        }

        private final zzb zzb(byte[] arr_b, int v, int v1, zzio zzio0) throws zzjk {
            if(this.zzb) {
                this.zzb();
                this.zzb = false;
            }
            try {
                zzky.zza().zza(this.zza).zza(this.zza, arr_b, 0, v1, new zzhn(zzio0));
                return this;
            }
            catch(zzjk zzjk0) {
                throw zzjk0;
            }
            catch(IndexOutOfBoundsException unused_ex) {
                throw zzjk.zza();
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", iOException0);
            }
        }

        protected void zzb() {
            zzjb zzjb0 = (zzjb)this.zza.zza(zzg.zzd, null, null);
            zzb.zza(zzjb0, this.zza);
            this.zza = zzjb0;
        }

        public zzjb zzc() {
            if(this.zzb) {
                return this.zza;
            }
            zzjb zzjb0 = this.zza;
            zzky.zza().zza(zzjb0).zzc(zzjb0);
            this.zzb = true;
            return this.zza;
        }

        public final zzjb zzd() {
            zzjb zzjb0 = (zzjb)this.zze();
            if(!zzjb0.zzk()) {
                throw new zzlv(zzjb0);
            }
            return zzjb0;
        }

        @Override  // com.google.android.gms.internal.vision.zzkn
        public zzkk zze() {
            return this.zzc();
        }

        @Override  // com.google.android.gms.internal.vision.zzkn
        public zzkk zzf() {
            return this.zzd();
        }

        @Override  // com.google.android.gms.internal.vision.zzkm
        public final boolean zzk() {
            return zzjb.zza(this.zza, false);
        }

        @Override  // com.google.android.gms.internal.vision.zzkm
        public final zzkk zzr() {
            return this.zzc;
        }
    }

    public static abstract class zzc extends zzjb implements zzkm {
        protected zziu zzc;

        public zzc() {
            this.zzc = zziu.zza();
        }

        final zziu zza() {
            if(this.zzc.zzc()) {
                this.zzc = (zziu)this.zzc.clone();
            }
            return this.zzc;
        }

        public final Object zzb(zzim zzim0) {
            zze zzjb$zze0 = zzjb.zza(zzim0);
            zzjb zzjb0 = (zzjb)this.zzr();
            if(zzjb$zze0.zza != zzjb0) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            Object object0 = this.zzc.zza(zzjb$zze0.zzd);
            if(object0 == null) {
                return zzjb$zze0.zzb;
            }
            zzf zzjb$zzf0 = zzjb$zze0.zzd;
            if(zzjb$zzf0.zzd) {
                if(zzjb$zzf0.zzc.zza() == zzmo.zzh) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object1: ((List)object0)) {
                        arrayList0.add(zzjb$zze0.zza(object1));
                    }
                    return arrayList0;
                }
                return object0;
            }
            return zzjb$zze0.zza(object0);
        }
    }

    public static class zzd extends zzb implements zzkm {
        protected zzd(zzc zzjb$zzc0) {
            super(zzjb$zzc0);
        }

        @Override  // com.google.android.gms.internal.vision.zzjb$zzb
        protected void zzb() {
            super.zzb();
            zzjb zzjb0 = this.zza;
            ((zzc)zzjb0).zzc = (zziu)((zzc)zzjb0).zzc.clone();
        }

        @Override  // com.google.android.gms.internal.vision.zzjb$zzb
        public zzjb zzc() {
            return (zzc)this.zze();
        }

        @Override  // com.google.android.gms.internal.vision.zzjb$zzb
        public zzkk zze() {
            if(this.zzb) {
                return (zzc)this.zza;
            }
            ((zzc)this.zza).zzc.zzb();
            return (zzc)super.zzc();
        }
    }

    public static final class zze extends zzim {
        final zzkk zza;
        final Object zzb;
        final zzkk zzc;
        final zzf zzd;

        zze(zzkk zzkk0, Object object0, zzkk zzkk1, zzf zzjb$zzf0, Class class0) {
            if(zzkk0 == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if(zzjb$zzf0.zzc == zzml.zzk && zzkk1 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.zza = zzkk0;
            this.zzb = object0;
            this.zzc = zzkk1;
            this.zzd = zzjb$zzf0;
        }

        final Object zza(Object object0) {
            if(this.zzd.zzc.zza() != zzmo.zzh) {
                return object0;
            }
            ((Integer)object0).intValue();
            throw null;
        }
    }

    static final class zzf implements zziw {
        final zzjh zza;
        final int zzb;
        final zzml zzc;
        final boolean zzd;
        final boolean zze;

        zzf(zzjh zzjh0, int v, zzml zzml0, boolean z, boolean z1) {
            this.zza = null;
            this.zzb = 202056002;
            this.zzc = zzml0;
            this.zzd = true;
            this.zze = false;
        }

        @Override
        public final int compareTo(Object object0) {
            return this.zzb - ((zzf)object0).zzb;
        }

        @Override  // com.google.android.gms.internal.vision.zziw
        public final int zza() {
            return this.zzb;
        }

        @Override  // com.google.android.gms.internal.vision.zziw
        public final zzkn zza(zzkn zzkn0, zzkk zzkk0) {
            return ((zzb)zzkn0).zza(((zzjb)zzkk0));
        }

        @Override  // com.google.android.gms.internal.vision.zziw
        public final zzkt zza(zzkt zzkt0, zzkt zzkt1) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.android.gms.internal.vision.zziw
        public final zzml zzb() {
            return this.zzc;
        }

        @Override  // com.google.android.gms.internal.vision.zziw
        public final zzmo zzc() {
            return this.zzc.zza();
        }

        @Override  // com.google.android.gms.internal.vision.zziw
        public final boolean zzd() {
            return this.zzd;
        }

        @Override  // com.google.android.gms.internal.vision.zziw
        public final boolean zze() {
            return false;
        }
    }

    public static final class zzg {
        public static final enum int zza = 1;
        public static final enum int zzb = 2;
        public static final enum int zzc = 3;
        public static final enum int zzd = 4;
        public static final enum int zze = 5;
        public static final enum int zzf = 6;
        public static final enum int zzg = 7;
        private static final int[] zzh;

        static {
            zzg.zzh = new int[]{1, 2, 3, 4, 5, 6, 7};
        }

        public static int[] zza() {
            return (int[])zzg.zzh.clone();
        }
    }

    protected zzlx zzb;
    private int zzc;
    private static Map zzd;

    static {
        zzjb.zzd = new ConcurrentHashMap();
    }

    public zzjb() {
        this.zzb = zzlx.zza();
        this.zzc = -1;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return this.getClass() == object0.getClass() ? zzky.zza().zza(this).zza(this, ((zzjb)object0)) : false;
    }

    @Override
    public int hashCode() {
        int v = this.zza;
        if(v != 0) {
            return v;
        }
        int v1 = zzky.zza().zza(this).zza(this);
        this.zza = v1;
        return v1;
    }

    @Override
    public String toString() {
        return zzkp.zza(this, super.toString());
    }

    static zze zza(zzim zzim0) {
        return (zze)zzim0;
    }

    public static zze zza(zzkk zzkk0, zzkk zzkk1, zzjh zzjh0, int v, zzml zzml0, boolean z, Class class0) {
        return new zze(zzkk0, Collections.emptyList(), zzkk1, new zzf(null, 202056002, zzml0, true, false), class0);
    }

    private static zzjb zza(zzjb zzjb0) throws zzjk {
        if(zzjb0 != null && !zzjb0.zzk()) {
            throw new zzjk(new zzlv(zzjb0).getMessage()).zza(zzjb0);
        }
        return zzjb0;
    }

    protected static zzjb zza(zzjb zzjb0, byte[] arr_b) throws zzjk {
        zzio zzio0 = zzio.zzb();
        return zzjb.zza(zzjb.zza(zzjb0, arr_b, 0, arr_b.length, zzio0));
    }

    private static zzjb zza(zzjb zzjb0, byte[] arr_b, int v, int v1, zzio zzio0) throws zzjk {
        zzjb zzjb1 = (zzjb)zzjb0.zza(zzg.zzd, null, null);
        try {
            zzlc zzlc0 = zzky.zza().zza(zzjb1);
            zzlc0.zza(zzjb1, arr_b, 0, v1, new zzhn(zzio0));
            zzlc0.zzc(zzjb1);
            if(zzjb1.zza != 0) {
                throw new RuntimeException();
            }
            return zzjb1;
        }
        catch(IOException iOException0) {
            throw iOException0.getCause() instanceof zzjk ? ((zzjk)iOException0.getCause()) : new zzjk(iOException0.getMessage()).zza(zzjb1);
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw zzjk.zza().zza(zzjb1);
        }
    }

    protected static zzjb zza(zzjb zzjb0, byte[] arr_b, zzio zzio0) throws zzjk {
        return zzjb.zza(zzjb.zza(zzjb0, arr_b, 0, arr_b.length, zzio0));
    }

    static zzjb zza(Class class0) {
        zzjb zzjb0 = (zzjb)zzjb.zzd.get(class0);
        if(zzjb0 == null) {
            try {
                Class.forName(class0.getName(), true, class0.getClassLoader());
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException0);
            }
            zzjb0 = (zzjb)zzjb.zzd.get(class0);
        }
        if(zzjb0 == null) {
            zzjb0 = (zzjb)((zzjb)zzma.zza(class0)).zza(zzg.zzf, null, null);
            if(zzjb0 == null) {
                throw new IllegalStateException();
            }
            zzjb.zzd.put(class0, zzjb0);
            return zzjb0;
        }
        return zzjb0;
    }

    protected static zzjl zza(zzjl zzjl0) {
        int v = zzjl0.size();
        return v == 0 ? zzjl0.zza(10) : zzjl0.zza(v << 1);
    }

    protected static Object zza(zzkk zzkk0, String s, Object[] arr_object) {
        return new zzla(zzkk0, s, arr_object);
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

    protected static void zza(Class class0, zzjb zzjb0) {
        zzjb.zzd.put(class0, zzjb0);
    }

    protected static final boolean zza(zzjb zzjb0, boolean z) {
        int v = (byte)(((Byte)zzjb0.zza(zzg.zza, null, null)));
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        boolean z1 = zzky.zza().zza(zzjb0).zzd(zzjb0);
        if(z) {
            zzjb0.zza(2, (z1 ? zzjb0 : null), null);
        }
        return z1;
    }

    protected abstract Object zza(int arg1, Object arg2, Object arg3);

    @Override  // com.google.android.gms.internal.vision.zzkk
    public final void zza(zzii zzii0) throws IOException {
        zzky.zza().zza(this).zza(this, zzil.zza(zzii0));
    }

    private static zze zzb(zzim zzim0) [...] // Inlined contents

    @Override  // com.google.android.gms.internal.vision.zzhf
    final void zzb(int v) {
        this.zzc = v;
    }

    @Override  // com.google.android.gms.internal.vision.zzhf
    final int zzi() {
        return this.zzc;
    }

    protected final zzb zzj() {
        return (zzb)this.zza(zzg.zze, null, null);
    }

    @Override  // com.google.android.gms.internal.vision.zzkm
    public final boolean zzk() {
        return zzjb.zza(this, true);
    }

    public final zzb zzl() {
        zzb zzjb$zzb0 = (zzb)this.zza(zzg.zze, null, null);
        zzjb$zzb0.zza(this);
        return zzjb$zzb0;
    }

    @Override  // com.google.android.gms.internal.vision.zzkk
    public final int zzm() {
        if(this.zzc == -1) {
            this.zzc = zzky.zza().zza(this).zzb(this);
        }
        return this.zzc;
    }

    protected static zzjj zzn() {
        return zzjd.zzd();
    }

    protected static zzjl zzo() {
        return zzlb.zzd();
    }

    @Override  // com.google.android.gms.internal.vision.zzkk
    public final zzkn zzp() {
        zzkn zzkn0 = (zzb)this.zza(zzg.zze, null, null);
        ((zzb)zzkn0).zza(this);
        return zzkn0;
    }

    @Override  // com.google.android.gms.internal.vision.zzkk
    public final zzkn zzq() {
        return (zzb)this.zza(zzg.zze, null, null);
    }

    @Override  // com.google.android.gms.internal.vision.zzkm
    public final zzkk zzr() {
        return (zzjb)this.zza(zzg.zzf, null, null);
    }
}

