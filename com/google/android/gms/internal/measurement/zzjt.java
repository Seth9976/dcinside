package com.google.android.gms.internal.measurement;

import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public abstract class zzjt extends zzib {
    public static final class zza extends zzif {
        public zza(zzjt zzjt0) {
        }
    }

    public static class zzb extends zzid {
        protected zzjt zza;
        private final zzjt zzb;

        protected zzb(zzjt zzjt0) {
            this.zzb = zzjt0;
            if(zzjt0.zzco()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = zzjt0.zzce();
        }

        @Override  // com.google.android.gms.internal.measurement.zzid
        public Object clone() throws CloneNotSupportedException {
            zzb zzjt$zzb0 = (zzb)this.zzb.zza(zze.zze, null, null);
            zzjt$zzb0.zza = (zzjt)this.zzaj();
            return zzjt$zzb0;
        }

        private static void zza(Object object0, Object object1) {
            zzlq.zza().zza(object0).zza(object0, object1);
        }

        @Override  // com.google.android.gms.internal.measurement.zzid
        public final zzid zza(zziw zziw0, zzjg zzjg0) throws IOException {
            return (zzb)this.zzb(zziw0, zzjg0);
        }

        @Override  // com.google.android.gms.internal.measurement.zzid
        public final zzid zza(byte[] arr_b, int v, int v1) throws zzkb {
            return this.zzb(arr_b, 0, v1, zzjg.zza);
        }

        @Override  // com.google.android.gms.internal.measurement.zzid
        public final zzid zza(byte[] arr_b, int v, int v1, zzjg zzjg0) throws zzkb {
            return this.zzb(arr_b, 0, v1, zzjg0);
        }

        public final zzb zza(zzjt zzjt0) {
            if(this.zzb.equals(zzjt0)) {
                return this;
            }
            if(!this.zza.zzco()) {
                this.zzal();
            }
            zzb.zza(this.zza, zzjt0);
            return this;
        }

        @Override  // com.google.android.gms.internal.measurement.zzid
        public final zzid zzaf() {
            return (zzb)this.clone();
        }

        public final zzjt zzag() {
            zzjt zzjt0 = (zzjt)this.zzaj();
            if(!zzjt.zza(zzjt0, true)) {
                throw new zzmh(zzjt0);
            }
            return zzjt0;
        }

        public zzjt zzah() {
            if(!this.zza.zzco()) {
                return this.zza;
            }
            this.zza.zzcl();
            return this.zza;
        }

        @Override  // com.google.android.gms.internal.measurement.zzlb
        public zzlc zzai() {
            return this.zzag();
        }

        @Override  // com.google.android.gms.internal.measurement.zzlb
        public zzlc zzaj() {
            return this.zzah();
        }

        protected final void zzak() {
            if(!this.zza.zzco()) {
                this.zzal();
            }
        }

        protected void zzal() {
            zzjt zzjt0 = this.zzb.zzce();
            zzb.zza(zzjt0, this.zza);
            this.zza = zzjt0;
        }

        private final zzb zzb(byte[] arr_b, int v, int v1, zzjg zzjg0) throws zzkb {
            if(!this.zza.zzco()) {
                this.zzal();
            }
            try {
                zzlq.zza().zza(this.zza).zza(this.zza, arr_b, 0, v1, new zzij(zzjg0));
                return this;
            }
            catch(zzkb zzkb0) {
                throw zzkb0;
            }
            catch(IndexOutOfBoundsException unused_ex) {
                throw zzkb.zzi();
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", iOException0);
            }
        }

        @Override  // com.google.android.gms.internal.measurement.zzid
        public final zzlb zzb(zziw zziw0, zzjg zzjg0) throws IOException {
            return this.zzc(zziw0, zzjg0);
        }

        private final zzb zzc(zziw zziw0, zzjg zzjg0) throws IOException {
            if(!this.zza.zzco()) {
                this.zzal();
            }
            try {
                zzlq.zza().zza(this.zza).zza(this.zza, zzjb.zza(zziw0), zzjg0);
                return this;
            }
            catch(RuntimeException runtimeException0) {
                if(runtimeException0.getCause() instanceof IOException) {
                    throw (IOException)runtimeException0.getCause();
                }
                throw runtimeException0;
            }
        }

        @Override  // com.google.android.gms.internal.measurement.zzle
        public final zzlc zzck() {
            return this.zzb;
        }

        @Override  // com.google.android.gms.internal.measurement.zzle
        public final boolean zzcn() {
            return zzjt.zza(this.zza, false);
        }
    }

    static final class zzc implements zzjo {
        @Override
        public final int compareTo(Object object0) {
            throw new NoSuchMethodError();
        }

        @Override  // com.google.android.gms.internal.measurement.zzjo
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override  // com.google.android.gms.internal.measurement.zzjo
        public final zzlb zza(zzlb zzlb0, zzlc zzlc0) {
            throw new NoSuchMethodError();
        }

        @Override  // com.google.android.gms.internal.measurement.zzjo
        public final zzlh zza(zzlh zzlh0, zzlh zzlh1) {
            throw new NoSuchMethodError();
        }

        @Override  // com.google.android.gms.internal.measurement.zzjo
        public final zzms zzb() {
            throw new NoSuchMethodError();
        }

        @Override  // com.google.android.gms.internal.measurement.zzjo
        public final zzmz zzc() {
            throw new NoSuchMethodError();
        }

        @Override  // com.google.android.gms.internal.measurement.zzjo
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override  // com.google.android.gms.internal.measurement.zzjo
        public final boolean zze() {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class zzd extends zzjt implements zzle {
        protected zzjm zzc;

        public zzd() {
            this.zzc = zzjm.zzb();
        }

        final zzjm zza() {
            if(this.zzc.zzf()) {
                this.zzc = (zzjm)this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public static final class zze {
        public static final enum int zza = 1;
        public static final enum int zzb = 2;
        public static final enum int zzc = 3;
        public static final enum int zzd = 4;
        public static final enum int zze = 5;
        public static final enum int zzf = 6;
        public static final enum int zzg = 7;
        private static final int[] zzh;

        static {
            zze.zzh = new int[]{1, 2, 3, 4, 5, 6, 7};
        }

        public static int[] zza() {
            return (int[])zze.zzh.clone();
        }
    }

    public static final class zzf extends zzjh {
    }

    protected zzmj zzb;
    private static Map zzc;
    private int zzd;

    static {
        zzjt.zzc = new ConcurrentHashMap();
    }

    public zzjt() {
        this.zzd = -1;
        this.zzb = zzmj.zzc();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return this.getClass() == object0.getClass() ? zzlq.zza().zza(this).zzb(this, ((zzjt)object0)) : false;
    }

    @Override
    public int hashCode() {
        if(this.zzco()) {
            return this.zza();
        }
        if(this.zza == 0) {
            this.zza = this.zza();
        }
        return this.zza;
    }

    @Override
    public String toString() {
        return zzld.zza(this, super.toString());
    }

    private final int zza() {
        return zzlq.zza().zza(this).zzb(this);
    }

    static zzjt zza(Class class0) {
        zzjt zzjt0 = (zzjt)zzjt.zzc.get(class0);
        if(zzjt0 == null) {
            try {
                Class.forName(class0.getName(), true, class0.getClassLoader());
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException0);
            }
            zzjt0 = (zzjt)zzjt.zzc.get(class0);
        }
        if(zzjt0 == null) {
            zzjt0 = (zzjt)((zzjt)zzml.zza(class0)).zza(zze.zzf, null, null);
            if(zzjt0 == null) {
                throw new IllegalStateException();
            }
            zzjt.zzc.put(class0, zzjt0);
            return zzjt0;
        }
        return zzjt0;
    }

    protected static zzjz zza(zzjz zzjz0) {
        return zzjz0.zzc(zzjz0.size() << 1);
    }

    protected static zzkc zza(zzkc zzkc0) {
        return zzkc0.zza(zzkc0.size() << 1);
    }

    protected static Object zza(zzlc zzlc0, String s, Object[] arr_object) {
        return new zzls(zzlc0, s, arr_object);
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

    protected static void zza(Class class0, zzjt zzjt0) {
        zzjt0.zzcm();
        zzjt.zzc.put(class0, zzjt0);
    }

    protected static final boolean zza(zzjt zzjt0, boolean z) {
        int v = (byte)(((Byte)zzjt0.zza(zze.zza, null, null)));
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        boolean z1 = zzlq.zza().zza(zzjt0).zze(zzjt0);
        if(z) {
            zzjt0.zza(2, (z1 ? zzjt0 : null), null);
        }
        return z1;
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    final int zza(zzlu zzlu0) {
        if(this.zzco()) {
            int v = this.zzb(zzlu0);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
            return v;
        }
        if(this.zzby() != 0x7FFFFFFF) {
            return this.zzby();
        }
        int v1 = this.zzb(zzlu0);
        this.zzc(v1);
        return v1;
    }

    protected final zzb zza(zzjt zzjt0) {
        return this.zzcc().zza(zzjt0);
    }

    protected abstract Object zza(int arg1, Object arg2, Object arg3);

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zza(zzjc zzjc0) throws IOException {
        zzlq.zza().zza(this).zza(this, zzjf.zza(zzjc0));
    }

    private final int zzb(zzlu zzlu0) {
        return zzlu0 == null ? zzlq.zza().zza(this).zza(this) : zzlu0.zza(this);
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    final int zzby() {
        return this.zzd & 0x7FFFFFFF;
    }

    @Override  // com.google.android.gms.internal.measurement.zzib
    final void zzc(int v) {
        if(v < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was " + v);
        }
        this.zzd = v & 0x7FFFFFFF | this.zzd & 0x80000000;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final int zzcb() {
        return this.zza(null);
    }

    protected final zzb zzcc() {
        return (zzb)this.zza(zze.zze, null, null);
    }

    public final zzb zzcd() {
        return ((zzb)this.zza(zze.zze, null, null)).zza(this);
    }

    final zzjt zzce() {
        return (zzjt)this.zza(zze.zzd, null, null);
    }

    protected static zzka zzcf() {
        return zzjw.zzd();
    }

    protected static zzjz zzcg() {
        return zzkn.zzd();
    }

    protected static zzkc zzch() {
        return zzlp.zzd();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final zzlb zzci() {
        return (zzb)this.zza(zze.zze, null, null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final zzlb zzcj() {
        return ((zzb)this.zza(zze.zze, null, null)).zza(this);
    }

    @Override  // com.google.android.gms.internal.measurement.zzle
    public final zzlc zzck() {
        return (zzjt)this.zza(zze.zzf, null, null);
    }

    protected final void zzcl() {
        zzlq.zza().zza(this).zzd(this);
        this.zzcm();
    }

    final void zzcm() {
        this.zzd &= 0x7FFFFFFF;
    }

    @Override  // com.google.android.gms.internal.measurement.zzle
    public final boolean zzcn() {
        return zzjt.zza(this, true);
    }

    final boolean zzco() {
        return (this.zzd & 0x80000000) != 0;
    }
}

