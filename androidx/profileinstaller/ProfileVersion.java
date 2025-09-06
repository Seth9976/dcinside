package androidx.profileinstaller;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

@RestrictTo({Scope.a})
public class ProfileVersion {
    static final byte[] a = null;
    static final byte[] b = null;
    static final byte[] c = null;
    static final byte[] d = null;
    static final byte[] e = null;
    static final byte[] f = null;
    static final byte[] g = null;
    public static final int h = 24;

    static {
        ProfileVersion.a = new byte[]{0x30, 49, 53, 0};
        ProfileVersion.b = new byte[]{0x30, 49, 0x30, 0};
        ProfileVersion.c = new byte[]{0x30, 0x30, 57, 0};
        ProfileVersion.d = new byte[]{0x30, 0x30, 53, 0};
        ProfileVersion.e = new byte[]{0x30, 0x30, 49, 0};
        ProfileVersion.f = new byte[]{0x30, 0x30, 49, 0};
        ProfileVersion.g = new byte[]{0x30, 0x30, 50, 0};
    }

    static String a(byte[] arr_b) {
        if(Arrays.equals(arr_b, ProfileVersion.e)) {
            return ":";
        }
        return Arrays.equals(arr_b, ProfileVersion.d) ? ":" : "!";
    }
}

