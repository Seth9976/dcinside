package com.google.android.gms.internal.ads;

import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

public abstract class zzgxr extends zzgvs {
    private static final int zza = 0x80000000;
    private static final int zzb = 0x7FFFFFFF;
    private static Map zzc = null;
    private int zzd;
    static final int zzr = 0x7FFFFFFF;
    static final int zzs;
    protected zzhai zzt;

    static {
        zzgxr.zzc = new ConcurrentHashMap();
    }

    public zzgxr() {
        this.zzd = -1;
        this.zzt = zzhai.zzc();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return this.getClass() == object0.getClass() ? zzgzm.zza().zzb(this.getClass()).zzk(this, ((zzgxr)object0)) : false;
    }

    @Override
    public int hashCode() {
        if(this.zzcd()) {
            return this.zzaW();
        }
        if(this.zzcc()) {
            this.zzca(this.zzaW());
        }
        return this.zzaX();
    }

    @Override
    public String toString() {
        return zzgze.zza(this, super.toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzgvs
    int zzaL() {
        return this.zzd & 0x7FFFFFFF;
    }

    @Override  // com.google.android.gms.internal.ads.zzgvs
    int zzaM(zzgzv zzgzv0) {
        if(this.zzcd()) {
            int v = this.zzc(zzgzv0);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
            return v;
        }
        if(this.zzaL() != 0x7FFFFFFF) {
            return this.zzaL();
        }
        int v1 = this.zzc(zzgzv0);
        this.zzaS(v1);
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgvs
    public zzgzh zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override  // com.google.android.gms.internal.ads.zzgvs
    void zzaS(int v) {
        if(v < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was " + v);
        }
        this.zzd = v | this.zzd & 0x80000000;
    }

    int zzaW() {
        return zzgzm.zza().zzb(this.getClass()).zzb(this);
    }

    int zzaX() {
        return this.zzq;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzc
    public int zzaY() {
        return this.zzaM(null);
    }

    protected final zzgxl zzaZ() {
        return (zzgxl)this.zzdc(zzgxq.zze, null, null);
    }

    protected static zzgxt zzbA() {
        return zzgvz.zzd();
    }

    protected static zzgxt zzbB(zzgxt zzgxt0) {
        int v = zzgxt0.size();
        return zzgxt0.zze(v + v);
    }

    protected static zzgxu zzbC() {
        return zzgwy.zze();
    }

    protected static zzgxu zzbD(zzgxu zzgxu0) {
        int v = zzgxu0.size();
        return zzgxu0.zzg(v + v);
    }

    protected static zzgxy zzbE() {
        return zzgxi.zze();
    }

    protected static zzgxy zzbF(zzgxy zzgxy0) {
        int v = zzgxy0.size();
        return zzgxy0.zzg(v + v);
    }

    protected static zzgxz zzbG() {
        return zzgxs.zzg();
    }

    protected static zzgxz zzbH(zzgxz zzgxz0) {
        int v = zzgxz0.size();
        return zzgxz0.zzh(v + v);
    }

    protected static zzgyc zzbI() {
        return zzgyr.zzh();
    }

    protected static zzgyc zzbJ(zzgyc zzgyc0) {
        int v = zzgyc0.size();
        return zzgyc0.zze(v + v);
    }

    protected static zzgyd zzbK() {
        return zzgzn.zzd();
    }

    protected static zzgyd zzbL(zzgyd zzgyd0) {
        int v = zzgyd0.size();
        return zzgyd0.zzf(v + v);
    }

    public zzgzb zzbM() {
        return this.zzbc();
    }

    public final zzgzk zzbN() {
        return (zzgzk)this.zzdc(zzgxq.zzg, null, null);
    }

    Object zzbO() throws Exception {
        return this.zzdc(zzgxq.zzc, null, null);
    }

    static Object zzbP(Method method0, Object object0, Object[] arr_object) {
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

    protected static Object zzbQ(zzgzc zzgzc0, String s, Object[] arr_object) {
        return new zzgzo(zzgzc0, s, arr_object);
    }

    static Method zzbR(Class class0, String s, Class[] arr_class) {
        try {
            return class0.getMethod(s, arr_class);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException("Generated message class \"" + class0.getName() + "\" missing method \"" + s + "\".", noSuchMethodException0);
        }
    }

    void zzbS() {
        this.zzq = 0;
    }

    void zzbT() {
        this.zzaS(0x7FFFFFFF);
    }

    protected void zzbU() {
        zzgzm.zza().zzb(this.getClass()).zzf(this);
        this.zzbV();
    }

    void zzbV() {
        this.zzd &= 0x7FFFFFFF;
    }

    protected void zzbW(int v, zzgwj zzgwj0) {
        this.zzj();
        zzhai zzhai0 = this.zzt;
        zzhai0.zzg();
        if(v == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhai0.zzj(v << 3 | 2, zzgwj0);
    }

    protected final void zzbX(zzhai zzhai0) {
        this.zzt = zzhai.zze(this.zzt, zzhai0);
    }

    protected void zzbY(int v, int v1) {
        this.zzj();
        zzhai zzhai0 = this.zzt;
        zzhai0.zzg();
        if(v == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhai0.zzj(v << 3, ((long)v1));
    }

    protected static void zzbZ(Class class0, zzgxr zzgxr0) {
        zzgxr0.zzbV();
        zzgxr.zzc.put(class0, zzgxr0);
    }

    protected final zzgxl zzba(zzgxr zzgxr0) {
        zzgxl zzgxl0 = this.zzaZ();
        zzgxl0.zzbj(zzgxr0);
        return zzgxl0;
    }

    public final zzgxl zzbb() {
        return (zzgxl)this.zzdc(zzgxq.zze, null, null);
    }

    public final zzgxl zzbc() {
        zzgxl zzgxl0 = (zzgxl)this.zzdc(zzgxq.zze, null, null);
        zzgxl0.zzbj(this);
        return zzgxl0;
    }

    static zzgxp zzbd(zzgwz zzgwz0) {
        return (zzgxp)zzgwz0;
    }

    public static zzgxp zzbe(zzgzc zzgzc0, zzgzc zzgzc1, zzgxw zzgxw0, int v, zzhau zzhau0, boolean z, Class class0) {
        return new zzgxp(zzgzc0, zzgzn.zzd(), zzgzc1, new zzgxo(zzgxw0, v, zzhau0, true, z), class0);
    }

    public static zzgxp zzbf(zzgzc zzgzc0, Object object0, zzgzc zzgzc1, zzgxw zzgxw0, int v, zzhau zzhau0, Class class0) {
        return new zzgxp(zzgzc0, object0, zzgzc1, new zzgxo(zzgxw0, v, zzhau0, false, false), class0);
    }

    static zzgxr zzbg(zzgxr zzgxr0, byte[] arr_b, int v, int v1, zzgxb zzgxb0) {
        return zzgxr.zzi(zzgxr0, arr_b, v, v1, zzgxb0);
    }

    static zzgxr zzbh(Class class0) {
        zzgxr zzgxr0 = (zzgxr)zzgxr.zzc.get(class0);
        if(zzgxr0 == null) {
            try {
                Class.forName(class0.getName(), true, class0.getClassLoader());
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException0);
            }
            zzgxr0 = (zzgxr)zzgxr.zzc.get(class0);
        }
        if(zzgxr0 == null) {
            zzgxr0 = ((zzgxr)zzhao.zzg(class0)).zzbi();
            if(zzgxr0 == null) {
                throw new IllegalStateException();
            }
            zzgxr.zzc.put(class0, zzgxr0);
            return zzgxr0;
        }
        return zzgxr0;
    }

    public final zzgxr zzbi() {
        return (zzgxr)this.zzdc(zzgxq.zzf, null, null);
    }

    zzgxr zzbj() {
        return (zzgxr)this.zzdc(zzgxq.zzd, null, null);
    }

    protected static zzgxr zzbk(zzgxr zzgxr0, InputStream inputStream0) throws zzgyg {
        zzgxr zzgxr1 = zzgxr.zzg(zzgxr0, inputStream0, zzgxb.zza);
        zzgxr.zzf(zzgxr1);
        return zzgxr1;
    }

    protected static zzgxr zzbl(zzgxr zzgxr0, InputStream inputStream0, zzgxb zzgxb0) throws zzgyg {
        zzgxr zzgxr1 = zzgxr.zzg(zzgxr0, inputStream0, zzgxb0);
        zzgxr.zzf(zzgxr1);
        return zzgxr1;
    }

    protected static zzgxr zzbm(zzgxr zzgxr0, zzgwj zzgwj0) throws zzgyg {
        zzgxr zzgxr1 = zzgxr.zzbr(zzgxr0, zzgwj0, zzgxb.zza);
        zzgxr.zzf(zzgxr1);
        return zzgxr1;
    }

    protected static zzgxr zzbn(zzgxr zzgxr0, zzgwp zzgwp0) throws zzgyg {
        return zzgxr.zzbs(zzgxr0, zzgwp0, zzgxb.zza);
    }

    protected static zzgxr zzbo(zzgxr zzgxr0, InputStream inputStream0) throws zzgyg {
        zzgxr zzgxr1 = zzgxr.zzbz(zzgxr0, zzgwp.zzG(inputStream0, 0x1000), zzgxb.zza);
        zzgxr.zzf(zzgxr1);
        return zzgxr1;
    }

    protected static zzgxr zzbp(zzgxr zzgxr0, ByteBuffer byteBuffer0) throws zzgyg {
        return zzgxr.zzbv(zzgxr0, byteBuffer0, zzgxb.zza);
    }

    protected static zzgxr zzbq(zzgxr zzgxr0, byte[] arr_b) throws zzgyg {
        zzgxr zzgxr1 = zzgxr.zzi(zzgxr0, arr_b, 0, arr_b.length, zzgxb.zza);
        zzgxr.zzf(zzgxr1);
        return zzgxr1;
    }

    protected static zzgxr zzbr(zzgxr zzgxr0, zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        zzgxr zzgxr1 = zzgxr.zzh(zzgxr0, zzgwj0, zzgxb0);
        zzgxr.zzf(zzgxr1);
        return zzgxr1;
    }

    protected static zzgxr zzbs(zzgxr zzgxr0, zzgwp zzgwp0, zzgxb zzgxb0) throws zzgyg {
        zzgxr zzgxr1 = zzgxr.zzbz(zzgxr0, zzgwp0, zzgxb0);
        zzgxr.zzf(zzgxr1);
        return zzgxr1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzd
    public zzgzc zzbt() {
        return this.zzbi();
    }

    protected static zzgxr zzbu(zzgxr zzgxr0, InputStream inputStream0, zzgxb zzgxb0) throws zzgyg {
        zzgxr zzgxr1 = zzgxr.zzbz(zzgxr0, zzgwp.zzG(inputStream0, 0x1000), zzgxb0);
        zzgxr.zzf(zzgxr1);
        return zzgxr1;
    }

    protected static zzgxr zzbv(zzgxr zzgxr0, ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        zzgwp zzgwp0;
        if(byteBuffer0.hasArray()) {
            zzgwp0 = zzgwp.zzH(byteBuffer0.array(), byteBuffer0.arrayOffset() + byteBuffer0.position(), byteBuffer0.remaining(), false);
        }
        else if(!byteBuffer0.isDirect() || !zzhao.zzB()) {
            int v = byteBuffer0.remaining();
            byte[] arr_b = new byte[v];
            byteBuffer0.duplicate().get(arr_b);
            zzgwp0 = zzgwp.zzH(arr_b, 0, v, true);
        }
        else {
            zzgwp0 = new zzgwn(byteBuffer0, false, null);
        }
        zzgxr zzgxr1 = zzgxr.zzbs(zzgxr0, zzgwp0, zzgxb0);
        zzgxr.zzf(zzgxr1);
        return zzgxr1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzd
    public final boolean zzbw() {
        return zzgxr.zzk(this, true);
    }

    protected static zzgxr zzbx(zzgxr zzgxr0, byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        zzgxr zzgxr1 = zzgxr.zzi(zzgxr0, arr_b, 0, arr_b.length, zzgxb0);
        zzgxr.zzf(zzgxr1);
        return zzgxr1;
    }

    protected static zzgxr zzby(zzgxr zzgxr0, zzgwp zzgwp0) throws zzgyg {
        return zzgxr.zzbz(zzgxr0, zzgwp0, zzgxb.zza);
    }

    static zzgxr zzbz(zzgxr zzgxr0, zzgwp zzgwp0, zzgxb zzgxb0) throws zzgyg {
        zzgxr zzgxr1 = zzgxr0.zzbj();
        try {
            zzgzv zzgzv0 = zzgzm.zza().zzb(zzgxr1.getClass());
            zzgzv0.zzh(zzgxr1, zzgwq.zzq(zzgwp0), zzgxb0);
            zzgzv0.zzf(zzgxr1);
            return zzgxr1;
        }
        catch(zzgyg zzgyg0) {
            throw zzgyg0.zzb() ? new zzgyg(zzgyg0) : zzgyg0;
        }
        catch(zzhag zzhag0) {
            throw zzhag0.zza();
        }
        catch(IOException iOException0) {
            throw iOException0.getCause() instanceof zzgyg ? ((zzgyg)iOException0.getCause()) : new zzgyg(iOException0);
        }
        catch(RuntimeException runtimeException0) {
            if(runtimeException0.getCause() instanceof zzgyg) {
                throw (zzgyg)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
    }

    private int zzc(zzgzv zzgzv0) {
        return zzgzv0 == null ? zzgzm.zza().zzb(this.getClass()).zza(this) : zzgzv0.zza(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzc
    public zzgzb zzcX() {
        return this.zzbb();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzc
    public void zzcY(zzgww zzgww0) throws IOException {
        zzgzm.zza().zzb(this.getClass()).zzj(this, zzgwx.zza(zzgww0));
    }

    void zzca(int v) {
        this.zzq = v;
    }

    boolean zzcc() {
        return this.zzaX() == 0;
    }

    boolean zzcd() {
        return (this.zzd & 0x80000000) != 0;
    }

    protected boolean zzce(int v, zzgwp zzgwp0) throws IOException {
        if((v & 7) == 4) {
            return false;
        }
        this.zzj();
        return this.zzt.zzm(v, zzgwp0);
    }

    private static zzgxp zzd(zzgwz zzgwz0) [...] // Inlined contents

    protected abstract Object zzdc(zzgxq arg1, Object arg2, Object arg3);

    private static zzgxr zzf(zzgxr zzgxr0) throws zzgyg {
        if(zzgxr0 != null && !zzgxr0.zzbw()) {
            throw zzgxr0.zzaP().zza();
        }
        return zzgxr0;
    }

    private static zzgxr zzg(zzgxr zzgxr0, InputStream inputStream0, zzgxb zzgxb0) throws zzgyg {
        int v1;
        try {
            int v = inputStream0.read();
            if(v == -1) {
                return null;
            }
            v1 = zzgwp.zzE(v, inputStream0);
        }
        catch(zzgyg zzgyg0) {
            throw zzgyg0.zzb() ? new zzgyg(zzgyg0) : zzgyg0;
        }
        catch(IOException iOException0) {
            throw new zzgyg(iOException0);
        }
        zzgwp zzgwp0 = zzgwp.zzG(new zzgvq(inputStream0, v1), 0x1000);
        zzgxr zzgxr1 = zzgxr.zzbz(zzgxr0, zzgwp0, zzgxb0);
        zzgwp0.zzy(0);
        return zzgxr1;
    }

    private static zzgxr zzh(zzgxr zzgxr0, zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        zzgwp zzgwp0 = zzgwj0.zzl();
        zzgxr zzgxr1 = zzgxr.zzbz(zzgxr0, zzgwp0, zzgxb0);
        zzgwp0.zzy(0);
        return zzgxr1;
    }

    private static zzgxr zzi(zzgxr zzgxr0, byte[] arr_b, int v, int v1, zzgxb zzgxb0) throws zzgyg {
        if(v1 == 0) {
            return zzgxr0;
        }
        zzgxr zzgxr1 = zzgxr0.zzbj();
        try {
            zzgzv zzgzv0 = zzgzm.zza().zzb(zzgxr1.getClass());
            zzgzv0.zzi(zzgxr1, arr_b, v, v + v1, new zzgvx(zzgxb0));
            zzgzv0.zzf(zzgxr1);
            return zzgxr1;
        }
        catch(zzgyg zzgyg0) {
            throw zzgyg0.zzb() ? new zzgyg(zzgyg0) : zzgyg0;
        }
        catch(zzhag zzhag0) {
            throw zzhag0.zza();
        }
        catch(IOException iOException0) {
            throw iOException0.getCause() instanceof zzgyg ? ((zzgyg)iOException0.getCause()) : new zzgyg(iOException0);
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private void zzj() {
        if(this.zzt == zzhai.zzc()) {
            this.zzt = zzhai.zzf();
        }
    }

    private static final boolean zzk(zzgxr zzgxr0, boolean z) {
        int v = (byte)(((Byte)zzgxr0.zzdc(zzgxq.zza, null, null)));
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        boolean z1 = zzgzm.zza().zzb(zzgxr0.getClass()).zzl(zzgxr0);
        if(z) {
            zzgxr0.zzdc(zzgxq.zzb, (z1 ? zzgxr0 : null), null);
        }
        return z1;
    }
}

