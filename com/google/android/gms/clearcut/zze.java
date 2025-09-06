package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.internal.clearcut.zzha;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;

@Class(creator = "LogEventParcelableCreator")
@Reserved({1})
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final zzha zzaa;
    @Field(id = 2)
    public zzr zzag;
    @Field(id = 3)
    public byte[] zzah;
    @Field(id = 4)
    private int[] zzai;
    @Field(id = 5)
    private String[] zzaj;
    @Field(id = 6)
    private int[] zzak;
    @Field(id = 7)
    private byte[][] zzal;
    @Field(id = 9)
    private ExperimentTokens[] zzam;
    public final zzb zzan;
    public final zzb zzt;
    @Field(defaultValue = "true", id = 8)
    private boolean zzz;

    static {
        zze.CREATOR = new zzf();
    }

    public zze(zzr zzr0, zzha zzha0, zzb clearcutLogger$zzb0, zzb clearcutLogger$zzb1, int[] arr_v, String[] arr_s, int[] arr_v1, byte[][] arr2_b, ExperimentTokens[] arr_experimentTokens, boolean z) {
        this.zzag = zzr0;
        this.zzaa = zzha0;
        this.zzt = clearcutLogger$zzb0;
        this.zzan = null;
        this.zzai = arr_v;
        this.zzaj = null;
        this.zzak = arr_v1;
        this.zzal = null;
        this.zzam = null;
        this.zzz = z;
    }

    @Constructor
    zze(@Param(id = 2) zzr zzr0, @Param(id = 3) byte[] arr_b, @Param(id = 4) int[] arr_v, @Param(id = 5) String[] arr_s, @Param(id = 6) int[] arr_v1, @Param(id = 7) byte[][] arr2_b, @Param(id = 8) boolean z, @Param(id = 9) ExperimentTokens[] arr_experimentTokens) {
        this.zzag = zzr0;
        this.zzah = arr_b;
        this.zzai = arr_v;
        this.zzaj = arr_s;
        this.zzaa = null;
        this.zzt = null;
        this.zzan = null;
        this.zzak = arr_v1;
        this.zzal = arr2_b;
        this.zzam = arr_experimentTokens;
        this.zzz = z;
    }

    // 去混淆评级： 中等(120)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof zze && Objects.equal(this.zzag, ((zze)object0).zzag) && Arrays.equals(this.zzah, ((zze)object0).zzah) && Arrays.equals(this.zzai, ((zze)object0).zzai) && Arrays.equals(this.zzaj, ((zze)object0).zzaj) && Objects.equal(this.zzaa, ((zze)object0).zzaa) && Objects.equal(this.zzt, ((zze)object0).zzt) && Objects.equal(this.zzan, ((zze)object0).zzan) && Arrays.equals(this.zzak, ((zze)object0).zzak) && Arrays.deepEquals(this.zzal, ((zze)object0).zzal) && Arrays.equals(this.zzam, ((zze)object0).zzam) && this.zzz == ((zze)object0).zzz;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zzag, this.zzah, this.zzai, this.zzaj, this.zzaa, this.zzt, this.zzan, this.zzak, this.zzal, this.zzam, Boolean.valueOf(this.zzz)});
    }

    @Override
    public final String toString() {
        return "LogEventParcelable[" + this.zzag + ", LogEventBytes: " + (this.zzah == null ? null : new String(this.zzah)) + ", TestCodes: " + Arrays.toString(this.zzai) + ", MendelPackages: " + Arrays.toString(this.zzaj) + ", LogEvent: " + this.zzaa + ", ExtensionProducer: " + this.zzt + ", VeProducer: " + this.zzan + ", ExperimentIDs: " + Arrays.toString(this.zzak) + ", ExperimentTokens: " + Arrays.toString(this.zzal) + ", ExperimentTokensParcelables: " + Arrays.toString(this.zzam) + ", AddPhenotypeExperimentTokens: " + this.zzz + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.zzag, v, false);
        SafeParcelWriter.writeByteArray(parcel0, 3, this.zzah, false);
        SafeParcelWriter.writeIntArray(parcel0, 4, this.zzai, false);
        SafeParcelWriter.writeStringArray(parcel0, 5, this.zzaj, false);
        SafeParcelWriter.writeIntArray(parcel0, 6, this.zzak, false);
        SafeParcelWriter.writeByteArrayArray(parcel0, 7, this.zzal, false);
        SafeParcelWriter.writeBoolean(parcel0, 8, this.zzz);
        SafeParcelWriter.writeTypedArray(parcel0, 9, this.zzam, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

