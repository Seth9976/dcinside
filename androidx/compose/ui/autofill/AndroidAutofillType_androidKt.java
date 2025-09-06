package androidx.compose.ui.autofill;

import androidx.compose.ui.ExperimentalComposeUiApi;
import java.util.HashMap;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import y4.l;

@s0({"SMAP\nAndroidAutofillType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillType.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillType_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
public final class AndroidAutofillType_androidKt {
    @l
    private static final HashMap a;

    static {
        AndroidAutofillType_androidKt.a = Y.M(new V[]{r0.a(AutofillType.a, "emailAddress"), r0.a(AutofillType.b, "username"), r0.a(AutofillType.c, "password"), r0.a(AutofillType.d, "newUsername"), r0.a(AutofillType.e, "newPassword"), r0.a(AutofillType.f, "postalAddress"), r0.a(AutofillType.g, "postalCode"), r0.a(AutofillType.h, "creditCardNumber"), r0.a(AutofillType.i, "creditCardSecurityCode"), r0.a(AutofillType.j, "creditCardExpirationDate"), r0.a(AutofillType.k, "creditCardExpirationMonth"), r0.a(AutofillType.l, "creditCardExpirationYear"), r0.a(AutofillType.m, "creditCardExpirationDay"), r0.a(AutofillType.n, "addressCountry"), r0.a(AutofillType.o, "addressRegion"), r0.a(AutofillType.p, "addressLocality"), r0.a(AutofillType.q, "streetAddress"), r0.a(AutofillType.r, "extendedAddress"), r0.a(AutofillType.s, "extendedPostalCode"), r0.a(AutofillType.t, "personName"), r0.a(AutofillType.u, "personGivenName"), r0.a(AutofillType.v, "personFamilyName"), r0.a(AutofillType.w, "personMiddleName"), r0.a(AutofillType.x, "personMiddleInitial"), r0.a(AutofillType.y, "personNamePrefix"), r0.a(AutofillType.z, "personNameSuffix"), r0.a(AutofillType.A, "phoneNumber"), r0.a(AutofillType.B, "phoneNumberDevice"), r0.a(AutofillType.C, "phoneCountryCode"), r0.a(AutofillType.D, "phoneNational"), r0.a(AutofillType.E, "gender"), r0.a(AutofillType.F, "birthDateFull"), r0.a(AutofillType.G, "birthDateDay"), r0.a(AutofillType.H, "birthDateMonth"), r0.a(AutofillType.I, "birthDateYear"), r0.a(AutofillType.J, "smsOTPCode")});
    }

    @ExperimentalComposeUiApi
    private static void a() {
    }

    @l
    public static final String b(@l AutofillType autofillType0) {
        L.p(autofillType0, "<this>");
        String s = (String)AndroidAutofillType_androidKt.a.get(autofillType0);
        if(s == null) {
            throw new IllegalArgumentException("Unsupported autofill type");
        }
        return s;
    }

    @ExperimentalComposeUiApi
    public static void c(AutofillType autofillType0) {
    }
}

