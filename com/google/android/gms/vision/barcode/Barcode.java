package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "BarcodeCreator")
@Reserved({1})
public class Barcode extends AbstractSafeParcelable {
    @Class(creator = "AddressCreator")
    @Reserved({1})
    public static class Address extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator CREATOR = null;
        public static final int HOME = 2;
        public static final int UNKNOWN = 0;
        public static final int WORK = 1;
        @RecentlyNonNull
        @Field(id = 3)
        public String[] addressLines;
        @Field(id = 2)
        public int type;

        static {
            Address.CREATOR = new zza();
        }

        public Address() {
        }

        @Constructor
        public Address(@Param(id = 2) int v, @RecentlyNonNull @Param(id = 3) String[] arr_s) {
            this.type = v;
            this.addressLines = arr_s;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel0, int v) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeInt(parcel0, 2, this.type);
            SafeParcelWriter.writeStringArray(parcel0, 3, this.addressLines, false);
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
        }
    }

    @Class(creator = "CalendarDateTimeCreator")
    @Reserved({1})
    public static class CalendarDateTime extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator CREATOR;
        @Field(id = 4)
        public int day;
        @Field(id = 5)
        public int hours;
        @Field(id = 8)
        public boolean isUtc;
        @Field(id = 6)
        public int minutes;
        @Field(id = 3)
        public int month;
        @RecentlyNonNull
        @Field(id = 9)
        public String rawValue;
        @Field(id = 7)
        public int seconds;
        @Field(id = 2)
        public int year;

        static {
            CalendarDateTime.CREATOR = new zzd();
        }

        public CalendarDateTime() {
        }

        @Constructor
        public CalendarDateTime(@Param(id = 2) int v, @Param(id = 3) int v1, @Param(id = 4) int v2, @Param(id = 5) int v3, @Param(id = 6) int v4, @Param(id = 7) int v5, @Param(id = 8) boolean z, @RecentlyNonNull @Param(id = 9) String s) {
            this.year = v;
            this.month = v1;
            this.day = v2;
            this.hours = v3;
            this.minutes = v4;
            this.seconds = v5;
            this.isUtc = z;
            this.rawValue = s;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel0, int v) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeInt(parcel0, 2, this.year);
            SafeParcelWriter.writeInt(parcel0, 3, this.month);
            SafeParcelWriter.writeInt(parcel0, 4, this.day);
            SafeParcelWriter.writeInt(parcel0, 5, this.hours);
            SafeParcelWriter.writeInt(parcel0, 6, this.minutes);
            SafeParcelWriter.writeInt(parcel0, 7, this.seconds);
            SafeParcelWriter.writeBoolean(parcel0, 8, this.isUtc);
            SafeParcelWriter.writeString(parcel0, 9, this.rawValue, false);
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
        }
    }

    @Class(creator = "CalendarEventCreator")
    @Reserved({1})
    public static class CalendarEvent extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator CREATOR;
        @RecentlyNonNull
        @Field(id = 3)
        public String description;
        @RecentlyNonNull
        @Field(id = 8)
        public CalendarDateTime end;
        @RecentlyNonNull
        @Field(id = 4)
        public String location;
        @RecentlyNonNull
        @Field(id = 5)
        public String organizer;
        @RecentlyNonNull
        @Field(id = 7)
        public CalendarDateTime start;
        @RecentlyNonNull
        @Field(id = 6)
        public String status;
        @RecentlyNonNull
        @Field(id = 2)
        public String summary;

        static {
            CalendarEvent.CREATOR = new zzf();
        }

        public CalendarEvent() {
        }

        @Constructor
        public CalendarEvent(@RecentlyNonNull @Param(id = 2) String s, @RecentlyNonNull @Param(id = 3) String s1, @RecentlyNonNull @Param(id = 4) String s2, @RecentlyNonNull @Param(id = 5) String s3, @RecentlyNonNull @Param(id = 6) String s4, @RecentlyNonNull @Param(id = 7) CalendarDateTime barcode$CalendarDateTime0, @RecentlyNonNull @Param(id = 8) CalendarDateTime barcode$CalendarDateTime1) {
            this.summary = s;
            this.description = s1;
            this.location = s2;
            this.organizer = s3;
            this.status = s4;
            this.start = barcode$CalendarDateTime0;
            this.end = barcode$CalendarDateTime1;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel0, int v) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeString(parcel0, 2, this.summary, false);
            SafeParcelWriter.writeString(parcel0, 3, this.description, false);
            SafeParcelWriter.writeString(parcel0, 4, this.location, false);
            SafeParcelWriter.writeString(parcel0, 5, this.organizer, false);
            SafeParcelWriter.writeString(parcel0, 6, this.status, false);
            SafeParcelWriter.writeParcelable(parcel0, 7, this.start, v, false);
            SafeParcelWriter.writeParcelable(parcel0, 8, this.end, v, false);
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
        }
    }

    @Class(creator = "ContactInfoCreator")
    @Reserved({1})
    public static class ContactInfo extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator CREATOR;
        @RecentlyNonNull
        @Field(id = 8)
        public Address[] addresses;
        @RecentlyNonNull
        @Field(id = 6)
        public Email[] emails;
        @RecentlyNonNull
        @Field(id = 2)
        public PersonName name;
        @RecentlyNonNull
        @Field(id = 3)
        public String organization;
        @RecentlyNonNull
        @Field(id = 5)
        public Phone[] phones;
        @RecentlyNonNull
        @Field(id = 4)
        public String title;
        @RecentlyNonNull
        @Field(id = 7)
        public String[] urls;

        static {
            ContactInfo.CREATOR = new zze();
        }

        public ContactInfo() {
        }

        @Constructor
        public ContactInfo(@RecentlyNonNull @Param(id = 2) PersonName barcode$PersonName0, @RecentlyNonNull @Param(id = 3) String s, @RecentlyNonNull @Param(id = 4) String s1, @RecentlyNonNull @Param(id = 5) Phone[] arr_barcode$Phone, @RecentlyNonNull @Param(id = 6) Email[] arr_barcode$Email, @RecentlyNonNull @Param(id = 7) String[] arr_s, @RecentlyNonNull @Param(id = 8) Address[] arr_barcode$Address) {
            this.name = barcode$PersonName0;
            this.organization = s;
            this.title = s1;
            this.phones = arr_barcode$Phone;
            this.emails = arr_barcode$Email;
            this.urls = arr_s;
            this.addresses = arr_barcode$Address;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel0, int v) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeParcelable(parcel0, 2, this.name, v, false);
            SafeParcelWriter.writeString(parcel0, 3, this.organization, false);
            SafeParcelWriter.writeString(parcel0, 4, this.title, false);
            SafeParcelWriter.writeTypedArray(parcel0, 5, this.phones, v, false);
            SafeParcelWriter.writeTypedArray(parcel0, 6, this.emails, v, false);
            SafeParcelWriter.writeStringArray(parcel0, 7, this.urls, false);
            SafeParcelWriter.writeTypedArray(parcel0, 8, this.addresses, v, false);
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
        }
    }

    @Class(creator = "DriverLicenseCreator")
    @Reserved({1})
    public static class DriverLicense extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator CREATOR;
        @RecentlyNonNull
        @Field(id = 8)
        public String addressCity;
        @RecentlyNonNull
        @Field(id = 9)
        public String addressState;
        @RecentlyNonNull
        @Field(id = 7)
        public String addressStreet;
        @RecentlyNonNull
        @Field(id = 10)
        public String addressZip;
        @RecentlyNonNull
        @Field(id = 14)
        public String birthDate;
        @RecentlyNonNull
        @Field(id = 2)
        public String documentType;
        @RecentlyNonNull
        @Field(id = 13)
        public String expiryDate;
        @RecentlyNonNull
        @Field(id = 3)
        public String firstName;
        @RecentlyNonNull
        @Field(id = 6)
        public String gender;
        @RecentlyNonNull
        @Field(id = 12)
        public String issueDate;
        @RecentlyNonNull
        @Field(id = 15)
        public String issuingCountry;
        @RecentlyNonNull
        @Field(id = 5)
        public String lastName;
        @RecentlyNonNull
        @Field(id = 11)
        public String licenseNumber;
        @RecentlyNonNull
        @Field(id = 4)
        public String middleName;

        static {
            DriverLicense.CREATOR = new zzh();
        }

        public DriverLicense() {
        }

        @Constructor
        public DriverLicense(@RecentlyNonNull @Param(id = 2) String s, @RecentlyNonNull @Param(id = 3) String s1, @RecentlyNonNull @Param(id = 4) String s2, @RecentlyNonNull @Param(id = 5) String s3, @RecentlyNonNull @Param(id = 6) String s4, @RecentlyNonNull @Param(id = 7) String s5, @RecentlyNonNull @Param(id = 8) String s6, @RecentlyNonNull @Param(id = 9) String s7, @RecentlyNonNull @Param(id = 10) String s8, @RecentlyNonNull @Param(id = 11) String s9, @RecentlyNonNull @Param(id = 12) String s10, @RecentlyNonNull @Param(id = 13) String s11, @RecentlyNonNull @Param(id = 14) String s12, @RecentlyNonNull @Param(id = 15) String s13) {
            this.documentType = s;
            this.firstName = s1;
            this.middleName = s2;
            this.lastName = s3;
            this.gender = s4;
            this.addressStreet = s5;
            this.addressCity = s6;
            this.addressState = s7;
            this.addressZip = s8;
            this.licenseNumber = s9;
            this.issueDate = s10;
            this.expiryDate = s11;
            this.birthDate = s12;
            this.issuingCountry = s13;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel0, int v) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeString(parcel0, 2, this.documentType, false);
            SafeParcelWriter.writeString(parcel0, 3, this.firstName, false);
            SafeParcelWriter.writeString(parcel0, 4, this.middleName, false);
            SafeParcelWriter.writeString(parcel0, 5, this.lastName, false);
            SafeParcelWriter.writeString(parcel0, 6, this.gender, false);
            SafeParcelWriter.writeString(parcel0, 7, this.addressStreet, false);
            SafeParcelWriter.writeString(parcel0, 8, this.addressCity, false);
            SafeParcelWriter.writeString(parcel0, 9, this.addressState, false);
            SafeParcelWriter.writeString(parcel0, 10, this.addressZip, false);
            SafeParcelWriter.writeString(parcel0, 11, this.licenseNumber, false);
            SafeParcelWriter.writeString(parcel0, 12, this.issueDate, false);
            SafeParcelWriter.writeString(parcel0, 13, this.expiryDate, false);
            SafeParcelWriter.writeString(parcel0, 14, this.birthDate, false);
            SafeParcelWriter.writeString(parcel0, 15, this.issuingCountry, false);
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
        }
    }

    @Class(creator = "EmailCreator")
    @Reserved({1})
    public static class Email extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator CREATOR = null;
        public static final int HOME = 2;
        public static final int UNKNOWN = 0;
        public static final int WORK = 1;
        @RecentlyNonNull
        @Field(id = 3)
        public String address;
        @RecentlyNonNull
        @Field(id = 5)
        public String body;
        @RecentlyNonNull
        @Field(id = 4)
        public String subject;
        @Field(id = 2)
        public int type;

        static {
            Email.CREATOR = new zzg();
        }

        public Email() {
        }

        @Constructor
        public Email(@Param(id = 2) int v, @RecentlyNonNull @Param(id = 3) String s, @RecentlyNonNull @Param(id = 4) String s1, @RecentlyNonNull @Param(id = 5) String s2) {
            this.type = v;
            this.address = s;
            this.subject = s1;
            this.body = s2;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel0, int v) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeInt(parcel0, 2, this.type);
            SafeParcelWriter.writeString(parcel0, 3, this.address, false);
            SafeParcelWriter.writeString(parcel0, 4, this.subject, false);
            SafeParcelWriter.writeString(parcel0, 5, this.body, false);
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
        }
    }

    @Class(creator = "GeoPointCreator")
    @Reserved({1})
    public static class GeoPoint extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator CREATOR;
        @Field(id = 2)
        public double lat;
        @Field(id = 3)
        public double lng;

        static {
            GeoPoint.CREATOR = new zzj();
        }

        public GeoPoint() {
        }

        @Constructor
        public GeoPoint(@Param(id = 2) double f, @Param(id = 3) double f1) {
            this.lat = f;
            this.lng = f1;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel0, int v) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeDouble(parcel0, 2, this.lat);
            SafeParcelWriter.writeDouble(parcel0, 3, this.lng);
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
        }
    }

    @Class(creator = "PersonNameCreator")
    @Reserved({1})
    public static class PersonName extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator CREATOR;
        @RecentlyNonNull
        @Field(id = 5)
        public String first;
        @RecentlyNonNull
        @Field(id = 2)
        public String formattedName;
        @RecentlyNonNull
        @Field(id = 7)
        public String last;
        @RecentlyNonNull
        @Field(id = 6)
        public String middle;
        @RecentlyNonNull
        @Field(id = 4)
        public String prefix;
        @RecentlyNonNull
        @Field(id = 3)
        public String pronunciation;
        @RecentlyNonNull
        @Field(id = 8)
        public String suffix;

        static {
            PersonName.CREATOR = new zzi();
        }

        public PersonName() {
        }

        @Constructor
        public PersonName(@RecentlyNonNull @Param(id = 2) String s, @RecentlyNonNull @Param(id = 3) String s1, @RecentlyNonNull @Param(id = 4) String s2, @RecentlyNonNull @Param(id = 5) String s3, @RecentlyNonNull @Param(id = 6) String s4, @RecentlyNonNull @Param(id = 7) String s5, @RecentlyNonNull @Param(id = 8) String s6) {
            this.formattedName = s;
            this.pronunciation = s1;
            this.prefix = s2;
            this.first = s3;
            this.middle = s4;
            this.last = s5;
            this.suffix = s6;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel0, int v) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeString(parcel0, 2, this.formattedName, false);
            SafeParcelWriter.writeString(parcel0, 3, this.pronunciation, false);
            SafeParcelWriter.writeString(parcel0, 4, this.prefix, false);
            SafeParcelWriter.writeString(parcel0, 5, this.first, false);
            SafeParcelWriter.writeString(parcel0, 6, this.middle, false);
            SafeParcelWriter.writeString(parcel0, 7, this.last, false);
            SafeParcelWriter.writeString(parcel0, 8, this.suffix, false);
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
        }
    }

    @Class(creator = "PhoneCreator")
    @Reserved({1})
    public static class Phone extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator CREATOR = null;
        public static final int FAX = 3;
        public static final int HOME = 2;
        public static final int MOBILE = 4;
        public static final int UNKNOWN = 0;
        public static final int WORK = 1;
        @RecentlyNonNull
        @Field(id = 3)
        public String number;
        @Field(id = 2)
        public int type;

        static {
            Phone.CREATOR = new zzl();
        }

        public Phone() {
        }

        @Constructor
        public Phone(@Param(id = 2) int v, @RecentlyNonNull @Param(id = 3) String s) {
            this.type = v;
            this.number = s;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel0, int v) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeInt(parcel0, 2, this.type);
            SafeParcelWriter.writeString(parcel0, 3, this.number, false);
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
        }
    }

    @Class(creator = "SmsCreator")
    @Reserved({1})
    public static class Sms extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator CREATOR;
        @RecentlyNonNull
        @Field(id = 2)
        public String message;
        @RecentlyNonNull
        @Field(id = 3)
        public String phoneNumber;

        static {
            Sms.CREATOR = new zzk();
        }

        public Sms() {
        }

        @Constructor
        public Sms(@RecentlyNonNull @Param(id = 2) String s, @RecentlyNonNull @Param(id = 3) String s1) {
            this.message = s;
            this.phoneNumber = s1;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel0, int v) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeString(parcel0, 2, this.message, false);
            SafeParcelWriter.writeString(parcel0, 3, this.phoneNumber, false);
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
        }
    }

    @Class(creator = "UrlBookmarkCreator")
    @Reserved({1})
    public static class UrlBookmark extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator CREATOR;
        @RecentlyNonNull
        @Field(id = 2)
        public String title;
        @RecentlyNonNull
        @Field(id = 3)
        public String url;

        static {
            UrlBookmark.CREATOR = new zzn();
        }

        public UrlBookmark() {
        }

        @Constructor
        public UrlBookmark(@RecentlyNonNull @Param(id = 2) String s, @RecentlyNonNull @Param(id = 3) String s1) {
            this.title = s;
            this.url = s1;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel0, int v) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeString(parcel0, 2, this.title, false);
            SafeParcelWriter.writeString(parcel0, 3, this.url, false);
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
        }
    }

    @Class(creator = "WiFiCreator")
    @Reserved({1})
    public static class WiFi extends AbstractSafeParcelable {
        @RecentlyNonNull
        public static final Parcelable.Creator CREATOR = null;
        public static final int OPEN = 1;
        public static final int WEP = 3;
        public static final int WPA = 2;
        @Field(id = 4)
        public int encryptionType;
        @RecentlyNonNull
        @Field(id = 3)
        public String password;
        @RecentlyNonNull
        @Field(id = 2)
        public String ssid;

        static {
            WiFi.CREATOR = new zzm();
        }

        public WiFi() {
        }

        @Constructor
        public WiFi(@RecentlyNonNull @Param(id = 2) String s, @RecentlyNonNull @Param(id = 3) String s1, @Param(id = 4) int v) {
            this.ssid = s;
            this.password = s1;
            this.encryptionType = v;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel0, int v) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeString(parcel0, 2, this.ssid, false);
            SafeParcelWriter.writeString(parcel0, 3, this.password, false);
            SafeParcelWriter.writeInt(parcel0, 4, this.encryptionType);
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
        }
    }

    public static final int ALL_FORMATS = 0;
    public static final int AZTEC = 0x1000;
    public static final int CALENDAR_EVENT = 11;
    public static final int CODABAR = 8;
    public static final int CODE_128 = 1;
    public static final int CODE_39 = 2;
    public static final int CODE_93 = 4;
    public static final int CONTACT_INFO = 1;
    @RecentlyNonNull
    public static final Parcelable.Creator CREATOR = null;
    public static final int DATA_MATRIX = 16;
    public static final int DRIVER_LICENSE = 12;
    public static final int EAN_13 = 0x20;
    public static final int EAN_8 = 0x40;
    public static final int EMAIL = 2;
    public static final int GEO = 10;
    public static final int ISBN = 3;
    public static final int ITF = 0x80;
    public static final int PDF417 = 0x800;
    public static final int PHONE = 4;
    public static final int PRODUCT = 5;
    public static final int QR_CODE = 0x100;
    public static final int SMS = 6;
    public static final int TEXT = 7;
    public static final int UPC_A = 0x200;
    public static final int UPC_E = 0x400;
    public static final int URL = 8;
    public static final int WIFI = 9;
    @RecentlyNonNull
    @Field(id = 13)
    public CalendarEvent calendarEvent;
    @RecentlyNonNull
    @Field(id = 14)
    public ContactInfo contactInfo;
    @RecentlyNonNull
    @Field(id = 6)
    public Point[] cornerPoints;
    @RecentlyNonNull
    @Field(id = 4)
    public String displayValue;
    @RecentlyNonNull
    @Field(id = 15)
    public DriverLicense driverLicense;
    @RecentlyNonNull
    @Field(id = 7)
    public Email email;
    @Field(id = 2)
    public int format;
    @RecentlyNonNull
    @Field(id = 12)
    public GeoPoint geoPoint;
    @Field(id = 17)
    public boolean isRecognized;
    @RecentlyNonNull
    @Field(id = 8)
    public Phone phone;
    @RecentlyNonNull
    @Field(id = 16)
    public byte[] rawBytes;
    @RecentlyNonNull
    @Field(id = 3)
    public String rawValue;
    @RecentlyNonNull
    @Field(id = 9)
    public Sms sms;
    @RecentlyNonNull
    @Field(id = 11)
    public UrlBookmark url;
    @Field(id = 5)
    public int valueFormat;
    @RecentlyNonNull
    @Field(id = 10)
    public WiFi wifi;

    static {
        Barcode.CREATOR = new zzb();
    }

    public Barcode() {
    }

    @Constructor
    public Barcode(@Param(id = 2) int v, @RecentlyNonNull @Param(id = 3) String s, @RecentlyNonNull @Param(id = 4) String s1, @Param(id = 5) int v1, @RecentlyNonNull @Param(id = 6) Point[] arr_point, @RecentlyNonNull @Param(id = 7) Email barcode$Email0, @RecentlyNonNull @Param(id = 8) Phone barcode$Phone0, @RecentlyNonNull @Param(id = 9) Sms barcode$Sms0, @RecentlyNonNull @Param(id = 10) WiFi barcode$WiFi0, @RecentlyNonNull @Param(id = 11) UrlBookmark barcode$UrlBookmark0, @RecentlyNonNull @Param(id = 12) GeoPoint barcode$GeoPoint0, @RecentlyNonNull @Param(id = 13) CalendarEvent barcode$CalendarEvent0, @RecentlyNonNull @Param(id = 14) ContactInfo barcode$ContactInfo0, @RecentlyNonNull @Param(id = 15) DriverLicense barcode$DriverLicense0, @RecentlyNonNull @Param(id = 16) byte[] arr_b, @Param(id = 17) boolean z) {
        this.format = v;
        this.rawValue = s;
        this.rawBytes = arr_b;
        this.displayValue = s1;
        this.valueFormat = v1;
        this.cornerPoints = arr_point;
        this.isRecognized = z;
        this.email = barcode$Email0;
        this.phone = barcode$Phone0;
        this.sms = barcode$Sms0;
        this.wifi = barcode$WiFi0;
        this.url = barcode$UrlBookmark0;
        this.geoPoint = barcode$GeoPoint0;
        this.calendarEvent = barcode$CalendarEvent0;
        this.contactInfo = barcode$ContactInfo0;
        this.driverLicense = barcode$DriverLicense0;
    }

    @RecentlyNonNull
    public Rect getBoundingBox() {
        int v = 0x7FFFFFFF;
        int v1 = 0x7FFFFFFF;
        int v2 = 0x80000000;
        int v3 = 0x80000000;
        for(int v4 = 0; true; ++v4) {
            Point[] arr_point = this.cornerPoints;
            if(v4 >= arr_point.length) {
                break;
            }
            Point point0 = arr_point[v4];
            v = Math.min(v, point0.x);
            v2 = Math.max(v2, point0.x);
            v1 = Math.min(v1, point0.y);
            v3 = Math.max(v3, point0.y);
        }
        return new Rect(v, v1, v2, v3);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 2, this.format);
        SafeParcelWriter.writeString(parcel0, 3, this.rawValue, false);
        SafeParcelWriter.writeString(parcel0, 4, this.displayValue, false);
        SafeParcelWriter.writeInt(parcel0, 5, this.valueFormat);
        SafeParcelWriter.writeTypedArray(parcel0, 6, this.cornerPoints, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 7, this.email, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 8, this.phone, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 9, this.sms, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 10, this.wifi, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 11, this.url, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 12, this.geoPoint, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 13, this.calendarEvent, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 14, this.contactInfo, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 15, this.driverLicense, v, false);
        SafeParcelWriter.writeByteArray(parcel0, 16, this.rawBytes, false);
        SafeParcelWriter.writeBoolean(parcel0, 17, this.isRecognized);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

