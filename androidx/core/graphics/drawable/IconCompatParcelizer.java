package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({Scope.a})
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel0) {
        IconCompat iconCompat0 = new IconCompat();
        iconCompat0.a = versionedParcel0.M(iconCompat0.a, 1);
        iconCompat0.c = versionedParcel0.t(iconCompat0.c, 2);
        iconCompat0.d = versionedParcel0.W(iconCompat0.d, 3);
        iconCompat0.e = versionedParcel0.M(iconCompat0.e, 4);
        iconCompat0.f = versionedParcel0.M(iconCompat0.f, 5);
        iconCompat0.g = (ColorStateList)versionedParcel0.W(iconCompat0.g, 6);
        iconCompat0.i = versionedParcel0.d0(iconCompat0.i, 7);
        iconCompat0.j = versionedParcel0.d0(iconCompat0.j, 8);
        iconCompat0.a();
        return iconCompat0;
    }

    public static void write(IconCompat iconCompat0, VersionedParcel versionedParcel0) {
        versionedParcel0.j0(true, true);
        iconCompat0.b(versionedParcel0.i());
        int v = iconCompat0.a;
        if(-1 != v) {
            versionedParcel0.M0(v, 1);
        }
        byte[] arr_b = iconCompat0.c;
        if(arr_b != null) {
            versionedParcel0.u0(arr_b, 2);
        }
        Parcelable parcelable0 = iconCompat0.d;
        if(parcelable0 != null) {
            versionedParcel0.X0(parcelable0, 3);
        }
        int v1 = iconCompat0.e;
        if(v1 != 0) {
            versionedParcel0.M0(v1, 4);
        }
        int v2 = iconCompat0.f;
        if(v2 != 0) {
            versionedParcel0.M0(v2, 5);
        }
        ColorStateList colorStateList0 = iconCompat0.g;
        if(colorStateList0 != null) {
            versionedParcel0.X0(colorStateList0, 6);
        }
        String s = iconCompat0.i;
        if(s != null) {
            versionedParcel0.f1(s, 7);
        }
        String s1 = iconCompat0.j;
        if(s1 != null) {
            versionedParcel0.f1(s1, 8);
        }
    }
}

