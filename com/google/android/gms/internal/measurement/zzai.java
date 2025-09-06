package com.google.android.gms.internal.measurement;

import com.fasterxml.jackson.databind.deser.std.f;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

public final class zzai implements zzaq {
    private final Double zza;

    public zzai(Double double0) {
        if(double0 == null) {
            this.zza = NaN;
            return;
        }
        this.zza = double0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof zzai ? this.zza.equals(((zzai)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override
    public final String toString() {
        return this.zzf();
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String s, zzh zzh0, List list0) {
        if(!"toString".equals(s)) {
            throw new IllegalArgumentException(String.format("%s.%s is not a function.", this.zzf(), s));
        }
        return new zzas(this.zzf());
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzai(this.zza);
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Double.isNaN(((double)this.zza)) || ((double)this.zza) == 0.0 ? false : true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        if(Double.isNaN(((double)this.zza))) {
            return "NaN";
        }
        if(Double.isInfinite(((double)this.zza))) {
            return ((double)this.zza) > 0.0 ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimal0 = BigDecimal.valueOf(((double)this.zza));
        BigDecimal bigDecimal1 = bigDecimal0.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : f.a(bigDecimal0);
        DecimalFormat decimalFormat0 = new DecimalFormat("0E0");
        decimalFormat0.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat0.setMinimumFractionDigits((bigDecimal1.scale() <= 0 ? bigDecimal1.scale() : bigDecimal1.precision()) - 1);
        String s = decimalFormat0.format(bigDecimal1);
        int v = s.indexOf("E");
        if(v > 0) {
            int v1 = Integer.parseInt(s.substring(v + 1));
            return (v1 >= 0 || v1 <= -7) && (v1 < 0 || v1 >= 21) ? s.replace("E-", "e-").replace("E", "e+") : bigDecimal1.toPlainString();
        }
        return s;
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Iterator zzh() {
        return null;
    }
}

