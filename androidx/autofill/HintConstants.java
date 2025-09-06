package androidx.autofill;

import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;

public final class HintConstants {
    public static final String A = "phoneNumber";
    public static final String B = "phoneNumberDevice";
    public static final String C = "phoneCountryCode";
    public static final String D = "phoneNational";
    public static final String E = "newUsername";
    public static final String F = "newPassword";
    public static final String G = "gender";
    public static final String H = "birthDateFull";
    public static final String I = "birthDateDay";
    public static final String J = "birthDateMonth";
    public static final String K = "birthDateYear";
    public static final String L = "smsOTPCode";
    public static final String a = "emailAddress";
    @Deprecated
    public static final String b = "name";
    public static final String c = "username";
    public static final String d = "password";
    @Deprecated
    public static final String e = "phone";
    public static final String f = "postalAddress";
    public static final String g = "postalCode";
    public static final String h = "creditCardNumber";
    public static final String i = "creditCardSecurityCode";
    public static final String j = "creditCardExpirationDate";
    public static final String k = "creditCardExpirationMonth";
    public static final String l = "creditCardExpirationYear";
    public static final String m = "creditCardExpirationDay";
    public static final String n = "addressCountry";
    public static final String o = "addressRegion";
    public static final String p = "addressLocality";
    public static final String q = "streetAddress";
    public static final String r = "extendedAddress";
    public static final String s = "extendedPostalCode";
    public static final String t = "personName";
    public static final String u = "personGivenName";
    public static final String v = "personFamilyName";
    public static final String w = "personMiddleName";
    public static final String x = "personMiddleInitial";
    public static final String y = "personNamePrefix";
    public static final String z = "personNameSuffix";

    @NonNull
    public static String a(int v) {
        Preconditions.g(v, 1, 8, "characterPosition");
        return ("smsOTPCode" + v).intern();
    }
}

