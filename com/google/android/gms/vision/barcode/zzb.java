package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        String s = null;
        String s1 = null;
        Point[] arr_point = null;
        Email barcode$Email0 = null;
        Phone barcode$Phone0 = null;
        Sms barcode$Sms0 = null;
        WiFi barcode$WiFi0 = null;
        UrlBookmark barcode$UrlBookmark0 = null;
        GeoPoint barcode$GeoPoint0 = null;
        CalendarEvent barcode$CalendarEvent0 = null;
        ContactInfo barcode$ContactInfo0 = null;
        DriverLicense barcode$DriverLicense0 = null;
        byte[] arr_b = null;
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v3 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v3)) {
                case 2: {
                    v1 = SafeParcelReader.readInt(parcel0, v3);
                    break;
                }
                case 3: {
                    s = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 4: {
                    s1 = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 5: {
                    v2 = SafeParcelReader.readInt(parcel0, v3);
                    break;
                }
                case 6: {
                    arr_point = (Point[])SafeParcelReader.createTypedArray(parcel0, v3, Point.CREATOR);
                    break;
                }
                case 7: {
                    barcode$Email0 = (Email)SafeParcelReader.createParcelable(parcel0, v3, Email.CREATOR);
                    break;
                }
                case 8: {
                    barcode$Phone0 = (Phone)SafeParcelReader.createParcelable(parcel0, v3, Phone.CREATOR);
                    break;
                }
                case 9: {
                    barcode$Sms0 = (Sms)SafeParcelReader.createParcelable(parcel0, v3, Sms.CREATOR);
                    break;
                }
                case 10: {
                    barcode$WiFi0 = (WiFi)SafeParcelReader.createParcelable(parcel0, v3, WiFi.CREATOR);
                    break;
                }
                case 11: {
                    barcode$UrlBookmark0 = (UrlBookmark)SafeParcelReader.createParcelable(parcel0, v3, UrlBookmark.CREATOR);
                    break;
                }
                case 12: {
                    barcode$GeoPoint0 = (GeoPoint)SafeParcelReader.createParcelable(parcel0, v3, GeoPoint.CREATOR);
                    break;
                }
                case 13: {
                    barcode$CalendarEvent0 = (CalendarEvent)SafeParcelReader.createParcelable(parcel0, v3, CalendarEvent.CREATOR);
                    break;
                }
                case 14: {
                    barcode$ContactInfo0 = (ContactInfo)SafeParcelReader.createParcelable(parcel0, v3, ContactInfo.CREATOR);
                    break;
                }
                case 15: {
                    barcode$DriverLicense0 = (DriverLicense)SafeParcelReader.createParcelable(parcel0, v3, DriverLicense.CREATOR);
                    break;
                }
                case 16: {
                    arr_b = SafeParcelReader.createByteArray(parcel0, v3);
                    break;
                }
                case 17: {
                    z = SafeParcelReader.readBoolean(parcel0, v3);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v3);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new Barcode(v1, s, s1, v2, arr_point, barcode$Email0, barcode$Phone0, barcode$Sms0, barcode$WiFi0, barcode$UrlBookmark0, barcode$GeoPoint0, barcode$CalendarEvent0, barcode$ContactInfo0, barcode$DriverLicense0, arr_b, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Barcode[v];
    }
}

