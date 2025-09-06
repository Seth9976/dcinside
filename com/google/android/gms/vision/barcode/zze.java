package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        PersonName barcode$PersonName0 = null;
        String s = null;
        String s1 = null;
        Phone[] arr_barcode$Phone = null;
        Email[] arr_barcode$Email = null;
        String[] arr_s = null;
        Address[] arr_barcode$Address = null;
        while(parcel0.dataPosition() < v) {
            int v1 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v1)) {
                case 2: {
                    barcode$PersonName0 = (PersonName)SafeParcelReader.createParcelable(parcel0, v1, PersonName.CREATOR);
                    break;
                }
                case 3: {
                    s = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 4: {
                    s1 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 5: {
                    arr_barcode$Phone = (Phone[])SafeParcelReader.createTypedArray(parcel0, v1, Phone.CREATOR);
                    break;
                }
                case 6: {
                    arr_barcode$Email = (Email[])SafeParcelReader.createTypedArray(parcel0, v1, Email.CREATOR);
                    break;
                }
                case 7: {
                    arr_s = SafeParcelReader.createStringArray(parcel0, v1);
                    break;
                }
                case 8: {
                    arr_barcode$Address = (Address[])SafeParcelReader.createTypedArray(parcel0, v1, Address.CREATOR);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v1);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new ContactInfo(barcode$PersonName0, s, s1, arr_barcode$Phone, arr_barcode$Email, arr_s, arr_barcode$Address);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ContactInfo[v];
    }
}

