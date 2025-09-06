package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Arrays;
import java.util.Comparator;

@Class(creator = "FlagCreator")
@Reserved({1})
public final class zzi extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final String name;
    @Field(id = 3)
    private final long zzab;
    @Field(id = 4)
    private final boolean zzac;
    @Field(id = 5)
    private final double zzad;
    @Field(id = 6)
    private final String zzae;
    @Field(id = 7)
    private final byte[] zzaf;
    @Field(id = 8)
    private final int zzag;
    @Field(id = 9)
    public final int zzah;
    private static final Comparator zzai;

    static {
        zzi.CREATOR = new zzk();
        zzi.zzai = new zzj();
    }

    @Constructor
    public zzi(@Param(id = 2) String s, @Param(id = 3) long v, @Param(id = 4) boolean z, @Param(id = 5) double f, @Param(id = 6) String s1, @Param(id = 7) byte[] arr_b, @Param(id = 8) int v1, @Param(id = 9) int v2) {
        this.name = s;
        this.zzab = v;
        this.zzac = z;
        this.zzad = f;
        this.zzae = s1;
        this.zzaf = arr_b;
        this.zzag = v1;
        this.zzah = v2;
    }

    private static int compare(int v, int v1) {
        if(v < v1) {
            return -1;
        }
        return v == v1 ? 0 : 1;
    }

    @Override
    public final int compareTo(Object object0) {
        int v = this.name.compareTo(((zzi)object0).name);
        if(v != 0) {
            return v;
        }
        int v1 = zzi.compare(this.zzag, ((zzi)object0).zzag);
        if(v1 != 0) {
            return v1;
        }
        switch(this.zzag) {
            case 1: {
                int v4 = Long.compare(this.zzab, ((zzi)object0).zzab);
                if(v4 < 0) {
                    return -1;
                }
                return v4 == 0 ? 0 : 1;
            }
            case 2: {
                boolean z = this.zzac;
                if(z == ((zzi)object0).zzac) {
                    return 0;
                }
                return z ? 1 : -1;
            }
            case 3: {
                return Double.compare(this.zzad, ((zzi)object0).zzad);
            }
            case 4: {
                String s = this.zzae;
                String s1 = ((zzi)object0).zzae;
                if(s == s1) {
                    return 0;
                }
                if(s == null) {
                    return -1;
                }
                return s1 == null ? 1 : s.compareTo(s1);
            }
            case 5: {
                byte[] arr_b = this.zzaf;
                byte[] arr_b1 = ((zzi)object0).zzaf;
                if(arr_b == arr_b1) {
                    return 0;
                }
                if(arr_b == null) {
                    return -1;
                }
                if(arr_b1 == null) {
                    return 1;
                }
                for(int v2 = 0; v2 < Math.min(this.zzaf.length, ((zzi)object0).zzaf.length); ++v2) {
                    int v3 = this.zzaf[v2] - ((zzi)object0).zzaf[v2];
                    if(v3 != 0) {
                        return v3;
                    }
                }
                return zzi.compare(this.zzaf.length, ((zzi)object0).zzaf.length);
            }
            default: {
                throw new AssertionError("Invalid enum value: " + this.zzag);
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof zzi && zzn.equals(this.name, ((zzi)object0).name)) {
            int v = this.zzag;
            if(v == ((zzi)object0).zzag && this.zzah == ((zzi)object0).zzah) {
                switch(v) {
                    case 1: {
                        return this.zzab == ((zzi)object0).zzab;
                    }
                    case 2: {
                        return this.zzac == ((zzi)object0).zzac;
                    }
                    case 3: {
                        return this.zzad == ((zzi)object0).zzad;
                    }
                    case 4: {
                        return zzn.equals(this.zzae, ((zzi)object0).zzae);
                    }
                    case 5: {
                        return Arrays.equals(this.zzaf, ((zzi)object0).zzaf);
                    }
                    default: {
                        throw new AssertionError("Invalid enum value: " + this.zzag);
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Flag(");
        stringBuilder0.append(this.name);
        stringBuilder0.append(", ");
        switch(this.zzag) {
            case 1: {
                stringBuilder0.append(this.zzab);
                break;
            }
            case 2: {
                stringBuilder0.append(this.zzac);
                break;
            }
            case 3: {
                stringBuilder0.append(this.zzad);
                break;
            }
            case 4: {
                stringBuilder0.append("\'");
                stringBuilder0.append(this.zzae);
                stringBuilder0.append("\'");
                break;
            }
            case 5: {
                if(this.zzaf == null) {
                    stringBuilder0.append("null");
                }
                else {
                    stringBuilder0.append("\'");
                    stringBuilder0.append(Base64.encodeToString(this.zzaf, 3));
                    stringBuilder0.append("\'");
                }
                break;
            }
            default: {
                throw new AssertionError("Invalid type: " + this.name + ", " + this.zzag);
            }
        }
        stringBuilder0.append(", ");
        stringBuilder0.append(this.zzag);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.zzah);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.name, false);
        SafeParcelWriter.writeLong(parcel0, 3, this.zzab);
        SafeParcelWriter.writeBoolean(parcel0, 4, this.zzac);
        SafeParcelWriter.writeDouble(parcel0, 5, this.zzad);
        SafeParcelWriter.writeString(parcel0, 6, this.zzae, false);
        SafeParcelWriter.writeByteArray(parcel0, 7, this.zzaf, false);
        SafeParcelWriter.writeInt(parcel0, 8, this.zzag);
        SafeParcelWriter.writeInt(parcel0, 9, this.zzah);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

