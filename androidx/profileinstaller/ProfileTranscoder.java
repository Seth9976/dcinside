package androidx.profileinstaller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map.Entry;
import java.util.TreeMap;

class ProfileTranscoder {
    private static final int a = 1;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 4;
    private static final int e = 4;
    private static final int f = 6;
    private static final int g = 7;
    static final byte[] h;
    static final byte[] i;

    static {
        ProfileTranscoder.h = new byte[]{0x70, 0x72, 0x6F, 0};
        ProfileTranscoder.i = new byte[]{0x70, 0x72, 109, 0};
    }

    private static void A(@NonNull byte[] arr_b, int v, int v1, @NonNull DexProfileData dexProfileData0) {
        int v2 = ProfileTranscoder.m(v, v1, dexProfileData0.g);
        arr_b[v2 / 8] = (byte)(1 << v2 % 8 | arr_b[v2 / 8]);
    }

    private static void B(@NonNull InputStream inputStream0) throws IOException {
        Encoding.h(inputStream0);
        int v = Encoding.j(inputStream0);
        if(v == 6) {
            return;
        }
        if(v == 7) {
            return;
        }
        while(v > 0) {
            Encoding.j(inputStream0);
            for(int v1 = Encoding.j(inputStream0); v1 > 0; --v1) {
                Encoding.h(inputStream0);
            }
            --v;
        }
    }

    static boolean C(@NonNull OutputStream outputStream0, @NonNull byte[] arr_b, @NonNull DexProfileData[] arr_dexProfileData) throws IOException {
        if(Arrays.equals(arr_b, ProfileVersion.a)) {
            ProfileTranscoder.P(outputStream0, arr_dexProfileData);
            return true;
        }
        if(Arrays.equals(arr_b, ProfileVersion.b)) {
            ProfileTranscoder.O(outputStream0, arr_dexProfileData);
            return true;
        }
        if(Arrays.equals(arr_b, ProfileVersion.d)) {
            ProfileTranscoder.M(outputStream0, arr_dexProfileData);
            return true;
        }
        if(Arrays.equals(arr_b, ProfileVersion.c)) {
            ProfileTranscoder.N(outputStream0, arr_dexProfileData);
            return true;
        }
        if(Arrays.equals(arr_b, ProfileVersion.e)) {
            ProfileTranscoder.L(outputStream0, arr_dexProfileData);
            return true;
        }
        return false;
    }

    private static void D(@NonNull OutputStream outputStream0, @NonNull DexProfileData dexProfileData0) throws IOException {
        int[] arr_v = dexProfileData0.h;
        int v = 0;
        for(int v1 = 0; v < arr_v.length; v1 = v2) {
            int v2 = arr_v[v];
            Encoding.p(outputStream0, v2 - v1);
            ++v;
        }
    }

    private static WritableFileSection E(@NonNull DexProfileData[] arr_dexProfileData) throws IOException {
        try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
            Encoding.p(byteArrayOutputStream0, arr_dexProfileData.length);
            int v = 2;
            for(int v1 = 0; true; ++v1) {
                if(v1 >= arr_dexProfileData.length) {
                    break;
                }
                DexProfileData dexProfileData0 = arr_dexProfileData[v1];
                Encoding.q(byteArrayOutputStream0, dexProfileData0.c);
                Encoding.q(byteArrayOutputStream0, dexProfileData0.d);
                Encoding.q(byteArrayOutputStream0, ((long)dexProfileData0.g));
                String s = ProfileTranscoder.j(dexProfileData0.a, dexProfileData0.b, ProfileVersion.a);
                int v2 = Encoding.k(s);
                Encoding.p(byteArrayOutputStream0, v2);
                v = v + 14 + v2;
                Encoding.n(byteArrayOutputStream0, s);
            }
            byte[] arr_b = byteArrayOutputStream0.toByteArray();
            if(v != arr_b.length) {
                throw Encoding.c(("Expected size " + v + ", does not match actual size " + arr_b.length));
            }
            return new WritableFileSection(FileSectionType.b, v, arr_b, false);
        }
    }

    static void F(@NonNull OutputStream outputStream0, byte[] arr_b) throws IOException {
        outputStream0.write(ProfileTranscoder.h);
        outputStream0.write(arr_b);
    }

    private static void G(@NonNull OutputStream outputStream0, @NonNull DexProfileData dexProfileData0) throws IOException {
        ProfileTranscoder.K(outputStream0, dexProfileData0);
        ProfileTranscoder.D(outputStream0, dexProfileData0);
        ProfileTranscoder.I(outputStream0, dexProfileData0);
    }

    private static void H(@NonNull OutputStream outputStream0, @NonNull DexProfileData dexProfileData0, @NonNull String s) throws IOException {
        Encoding.p(outputStream0, Encoding.k(s));
        Encoding.p(outputStream0, dexProfileData0.e);
        Encoding.q(outputStream0, ((long)dexProfileData0.f));
        Encoding.q(outputStream0, dexProfileData0.c);
        Encoding.q(outputStream0, ((long)dexProfileData0.g));
        Encoding.n(outputStream0, s);
    }

    private static void I(@NonNull OutputStream outputStream0, @NonNull DexProfileData dexProfileData0) throws IOException {
        byte[] arr_b = new byte[ProfileTranscoder.k(dexProfileData0.g)];
        for(Object object0: dexProfileData0.i.entrySet()) {
            int v = (int)(((Integer)((Map.Entry)object0).getKey()));
            int v1 = (int)(((Integer)((Map.Entry)object0).getValue()));
            if((v1 & 2) != 0) {
                ProfileTranscoder.A(arr_b, 2, v, dexProfileData0);
            }
            if((v1 & 4) != 0) {
                ProfileTranscoder.A(arr_b, 4, v, dexProfileData0);
            }
        }
        outputStream0.write(arr_b);
    }

    private static void J(@NonNull OutputStream outputStream0, int v, @NonNull DexProfileData dexProfileData0) throws IOException {
        byte[] arr_b = new byte[ProfileTranscoder.l(v, dexProfileData0.g)];
        for(Object object0: dexProfileData0.i.entrySet()) {
            int v1 = (int)(((Integer)((Map.Entry)object0).getKey()));
            int v2 = (int)(((Integer)((Map.Entry)object0).getValue()));
            int v3 = 0;
            for(int v4 = 1; v4 <= 4; v4 <<= 1) {
                if(v4 != 1 && (v4 & v) != 0) {
                    if((v4 & v2) == v4) {
                        int v5 = dexProfileData0.g * v3 + v1;
                        arr_b[v5 / 8] = (byte)(1 << v5 % 8 | arr_b[v5 / 8]);
                    }
                    ++v3;
                }
            }
        }
        outputStream0.write(arr_b);
    }

    private static void K(@NonNull OutputStream outputStream0, @NonNull DexProfileData dexProfileData0) throws IOException {
        int v = 0;
        for(Object object0: dexProfileData0.i.entrySet()) {
            int v1 = (int)(((Integer)((Map.Entry)object0).getKey()));
            if((((int)(((Integer)((Map.Entry)object0).getValue()))) & 1) != 0) {
                Encoding.p(outputStream0, v1 - v);
                Encoding.p(outputStream0, 0);
                v = v1;
            }
        }
    }

    private static void L(@NonNull OutputStream outputStream0, @NonNull DexProfileData[] arr_dexProfileData) throws IOException {
        Encoding.p(outputStream0, arr_dexProfileData.length);
        for(int v = 0; v < arr_dexProfileData.length; ++v) {
            DexProfileData dexProfileData0 = arr_dexProfileData[v];
            String s = ProfileTranscoder.j(dexProfileData0.a, dexProfileData0.b, ProfileVersion.e);
            Encoding.p(outputStream0, Encoding.k(s));
            Encoding.p(outputStream0, dexProfileData0.i.size());
            Encoding.p(outputStream0, dexProfileData0.h.length);
            Encoding.q(outputStream0, dexProfileData0.c);
            Encoding.n(outputStream0, s);
            for(Object object0: dexProfileData0.i.keySet()) {
                Encoding.p(outputStream0, ((int)(((Integer)object0))));
            }
            int[] arr_v = dexProfileData0.h;
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                Encoding.p(outputStream0, arr_v[v1]);
            }
        }
    }

    private static void M(@NonNull OutputStream outputStream0, @NonNull DexProfileData[] arr_dexProfileData) throws IOException {
        Encoding.r(outputStream0, arr_dexProfileData.length);
        for(int v = 0; v < arr_dexProfileData.length; ++v) {
            DexProfileData dexProfileData0 = arr_dexProfileData[v];
            String s = ProfileTranscoder.j(dexProfileData0.a, dexProfileData0.b, ProfileVersion.d);
            Encoding.p(outputStream0, Encoding.k(s));
            Encoding.p(outputStream0, dexProfileData0.h.length);
            Encoding.q(outputStream0, ((long)(dexProfileData0.i.size() * 4)));
            Encoding.q(outputStream0, dexProfileData0.c);
            Encoding.n(outputStream0, s);
            for(Object object0: dexProfileData0.i.keySet()) {
                Encoding.p(outputStream0, ((int)(((Integer)object0))));
                Encoding.p(outputStream0, 0);
            }
            int[] arr_v = dexProfileData0.h;
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                Encoding.p(outputStream0, arr_v[v1]);
            }
        }
    }

    private static void N(@NonNull OutputStream outputStream0, @NonNull DexProfileData[] arr_dexProfileData) throws IOException {
        byte[] arr_b = ProfileTranscoder.b(arr_dexProfileData, ProfileVersion.c);
        Encoding.r(outputStream0, arr_dexProfileData.length);
        Encoding.m(outputStream0, arr_b);
    }

    private static void O(@NonNull OutputStream outputStream0, @NonNull DexProfileData[] arr_dexProfileData) throws IOException {
        byte[] arr_b = ProfileTranscoder.b(arr_dexProfileData, ProfileVersion.b);
        Encoding.r(outputStream0, arr_dexProfileData.length);
        Encoding.m(outputStream0, arr_b);
    }

    private static void P(@NonNull OutputStream outputStream0, @NonNull DexProfileData[] arr_dexProfileData) throws IOException {
        ProfileTranscoder.Q(outputStream0, arr_dexProfileData);
    }

    private static void Q(@NonNull OutputStream outputStream0, @NonNull DexProfileData[] arr_dexProfileData) throws IOException {
        int v3;
        ArrayList arrayList0 = new ArrayList(3);
        ArrayList arrayList1 = new ArrayList(3);
        arrayList0.add(ProfileTranscoder.E(arr_dexProfileData));
        arrayList0.add(ProfileTranscoder.c(arr_dexProfileData));
        arrayList0.add(ProfileTranscoder.d(arr_dexProfileData));
        long v = ((long)ProfileVersion.a.length) + ((long)ProfileTranscoder.h.length) + 4L + ((long)(arrayList0.size() * 16));
        Encoding.q(outputStream0, ((long)arrayList0.size()));
        for(int v2 = 0; v2 < arrayList0.size(); ++v2) {
            WritableFileSection writableFileSection0 = (WritableFileSection)arrayList0.get(v2);
            Encoding.q(outputStream0, writableFileSection0.a.c());
            Encoding.q(outputStream0, v);
            if(writableFileSection0.d) {
                byte[] arr_b = Encoding.b(writableFileSection0.c);
                arrayList1.add(arr_b);
                Encoding.q(outputStream0, ((long)arr_b.length));
                Encoding.q(outputStream0, ((long)writableFileSection0.c.length));
                v3 = arr_b.length;
            }
            else {
                arrayList1.add(writableFileSection0.c);
                Encoding.q(outputStream0, ((long)writableFileSection0.c.length));
                Encoding.q(outputStream0, 0L);
                v3 = writableFileSection0.c.length;
            }
            v += (long)v3;
        }
        for(int v1 = 0; v1 < arrayList1.size(); ++v1) {
            outputStream0.write(((byte[])arrayList1.get(v1)));
        }
    }

    private static int a(@NonNull DexProfileData dexProfileData0) {
        int v = 0;
        for(Object object0: dexProfileData0.i.entrySet()) {
            v |= (int)(((Integer)((Map.Entry)object0).getValue()));
        }
        return v;
    }

    @NonNull
    private static byte[] b(@NonNull DexProfileData[] arr_dexProfileData, @NonNull byte[] arr_b) throws IOException {
        int v = 0;
        int v2 = 0;
        for(int v1 = 0; v1 < arr_dexProfileData.length; ++v1) {
            DexProfileData dexProfileData0 = arr_dexProfileData[v1];
            v2 += Encoding.k(ProfileTranscoder.j(dexProfileData0.a, dexProfileData0.b, arr_b)) + 16 + dexProfileData0.e * 2 + dexProfileData0.f + ProfileTranscoder.k(dexProfileData0.g);
        }
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(v2);
        if(Arrays.equals(arr_b, ProfileVersion.c)) {
            while(v < arr_dexProfileData.length) {
                DexProfileData dexProfileData1 = arr_dexProfileData[v];
                ProfileTranscoder.H(byteArrayOutputStream0, dexProfileData1, ProfileTranscoder.j(dexProfileData1.a, dexProfileData1.b, arr_b));
                ProfileTranscoder.G(byteArrayOutputStream0, dexProfileData1);
                ++v;
            }
        }
        else {
            for(int v3 = 0; v3 < arr_dexProfileData.length; ++v3) {
                DexProfileData dexProfileData2 = arr_dexProfileData[v3];
                ProfileTranscoder.H(byteArrayOutputStream0, dexProfileData2, ProfileTranscoder.j(dexProfileData2.a, dexProfileData2.b, arr_b));
            }
            while(v < arr_dexProfileData.length) {
                ProfileTranscoder.G(byteArrayOutputStream0, arr_dexProfileData[v]);
                ++v;
            }
        }
        if(byteArrayOutputStream0.size() != v2) {
            throw Encoding.c(("The bytes saved do not match expectation. actual=" + byteArrayOutputStream0.size() + " expected=" + v2));
        }
        return byteArrayOutputStream0.toByteArray();
    }

    private static WritableFileSection c(@NonNull DexProfileData[] arr_dexProfileData) throws IOException {
        try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
            int v1 = 0;
            for(int v = 0; true; ++v) {
                if(v >= arr_dexProfileData.length) {
                    break;
                }
                DexProfileData dexProfileData0 = arr_dexProfileData[v];
                Encoding.p(byteArrayOutputStream0, v);
                Encoding.p(byteArrayOutputStream0, dexProfileData0.e);
                v1 = v1 + 4 + dexProfileData0.e * 2;
                ProfileTranscoder.D(byteArrayOutputStream0, dexProfileData0);
            }
            byte[] arr_b = byteArrayOutputStream0.toByteArray();
            if(v1 != arr_b.length) {
                throw Encoding.c(("Expected size " + v1 + ", does not match actual size " + arr_b.length));
            }
            return new WritableFileSection(FileSectionType.d, v1, arr_b, true);
        }
    }

    private static WritableFileSection d(@NonNull DexProfileData[] arr_dexProfileData) throws IOException {
        try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
            int v1 = 0;
            for(int v = 0; true; ++v) {
                if(v >= arr_dexProfileData.length) {
                    break;
                }
                DexProfileData dexProfileData0 = arr_dexProfileData[v];
                int v2 = ProfileTranscoder.a(dexProfileData0);
                byte[] arr_b = ProfileTranscoder.e(v2, dexProfileData0);
                byte[] arr_b1 = ProfileTranscoder.f(dexProfileData0);
                Encoding.p(byteArrayOutputStream0, v);
                int v3 = arr_b.length + 2 + arr_b1.length;
                Encoding.q(byteArrayOutputStream0, ((long)v3));
                Encoding.p(byteArrayOutputStream0, v2);
                byteArrayOutputStream0.write(arr_b);
                byteArrayOutputStream0.write(arr_b1);
                v1 = v1 + 6 + v3;
            }
            byte[] arr_b2 = byteArrayOutputStream0.toByteArray();
            if(v1 != arr_b2.length) {
                throw Encoding.c(("Expected size " + v1 + ", does not match actual size " + arr_b2.length));
            }
            return new WritableFileSection(FileSectionType.e, v1, arr_b2, true);
        }
    }

    private static byte[] e(int v, @NonNull DexProfileData dexProfileData0) throws IOException {
        try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
            ProfileTranscoder.J(byteArrayOutputStream0, v, dexProfileData0);
            return byteArrayOutputStream0.toByteArray();
        }
    }

    private static byte[] f(@NonNull DexProfileData dexProfileData0) throws IOException {
        try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
            ProfileTranscoder.K(byteArrayOutputStream0, dexProfileData0);
            return byteArrayOutputStream0.toByteArray();
        }
    }

    @NonNull
    private static String g(@NonNull String s, @NonNull String s1) {
        if("!".equals(s1)) {
            return s.replace(":", "!");
        }
        return ":".equals(s1) ? s.replace("!", ":") : s;
    }

    @NonNull
    private static String h(@NonNull String s) {
        int v = s.indexOf("!");
        if(v < 0) {
            v = s.indexOf(":");
        }
        return v <= 0 ? s : s.substring(v + 1);
    }

    @Nullable
    private static DexProfileData i(@NonNull DexProfileData[] arr_dexProfileData, @NonNull String s) {
        if(arr_dexProfileData.length <= 0) {
            return null;
        }
        String s1 = ProfileTranscoder.h(s);
        for(int v = 0; v < arr_dexProfileData.length; ++v) {
            if(arr_dexProfileData[v].b.equals(s1)) {
                return arr_dexProfileData[v];
            }
        }
        return null;
    }

    @NonNull
    private static String j(@NonNull String s, @NonNull String s1, @NonNull byte[] arr_b) {
        String s2 = ProfileVersion.a(arr_b);
        if(s.length() <= 0) {
            return ProfileTranscoder.g(s1, s2);
        }
        if(s1.equals("classes.dex")) {
            return s;
        }
        if(!s1.contains("!") && !s1.contains(":")) {
            return s1.endsWith(".apk") ? s1 : s + ProfileVersion.a(arr_b) + s1;
        }
        return ProfileTranscoder.g(s1, s2);
    }

    private static int k(int v) {
        return (v * 2 + 7 & -8) / 8;
    }

    private static int l(int v, int v1) {
        return (Integer.bitCount(v & -2) * v1 + 7 & -8) / 8;
    }

    private static int m(int v, int v1, int v2) {
        switch(v) {
            case 1: {
                throw Encoding.c("HOT methods are not stored in the bitmap");
            }
            case 2: {
                return v1;
            }
            case 4: {
                return v1 + v2;
            }
            default: {
                throw Encoding.c(("Unexpected flag: " + v));
            }
        }
    }

    private static int[] n(@NonNull InputStream inputStream0, int v) throws IOException {
        int[] arr_v = new int[v];
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += Encoding.h(inputStream0);
            arr_v[v1] = v2;
        }
        return arr_v;
    }

    private static int o(@NonNull BitSet bitSet0, int v, int v1) {
        int v2 = bitSet0.get(ProfileTranscoder.m(2, v, v1)) ? 2 : 0;
        return bitSet0.get(ProfileTranscoder.m(4, v, v1)) ? v2 | 4 : v2;
    }

    static byte[] p(@NonNull InputStream inputStream0, @NonNull byte[] arr_b) throws IOException {
        if(!Arrays.equals(arr_b, Encoding.d(inputStream0, arr_b.length))) {
            throw Encoding.c("Invalid magic");
        }
        return Encoding.d(inputStream0, ProfileVersion.b.length);
    }

    private static void q(@NonNull InputStream inputStream0, @NonNull DexProfileData dexProfileData0) throws IOException {
        int v = inputStream0.available() - dexProfileData0.f;
        int v1 = 0;
        while(inputStream0.available() > v) {
            v1 += Encoding.h(inputStream0);
            dexProfileData0.i.put(v1, 1);
            for(int v2 = Encoding.h(inputStream0); v2 > 0; --v2) {
                ProfileTranscoder.B(inputStream0);
            }
        }
        if(inputStream0.available() != v) {
            throw Encoding.c("Read too much data during profile line parse");
        }
    }

    @NonNull
    static DexProfileData[] r(@NonNull InputStream inputStream0, @NonNull byte[] arr_b, @NonNull byte[] arr_b1, DexProfileData[] arr_dexProfileData) throws IOException {
        if(Arrays.equals(arr_b, ProfileVersion.f)) {
            if(Arrays.equals(ProfileVersion.a, arr_b1)) {
                throw Encoding.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return ProfileTranscoder.s(inputStream0, arr_b, arr_dexProfileData);
        }
        if(!Arrays.equals(arr_b, ProfileVersion.g)) {
            throw Encoding.c("Unsupported meta version");
        }
        return ProfileTranscoder.u(inputStream0, arr_b1, arr_dexProfileData);
    }

    @NonNull
    static DexProfileData[] s(@NonNull InputStream inputStream0, @NonNull byte[] arr_b, DexProfileData[] arr_dexProfileData) throws IOException {
        if(!Arrays.equals(arr_b, ProfileVersion.f)) {
            throw Encoding.c("Unsupported meta version");
        }
        int v = Encoding.j(inputStream0);
        long v1 = Encoding.i(inputStream0);
        byte[] arr_b1 = Encoding.e(inputStream0, ((int)Encoding.i(inputStream0)), ((int)v1));
        if(inputStream0.read() <= 0) {
            try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b1)) {
                return ProfileTranscoder.t(byteArrayInputStream0, v, arr_dexProfileData);
            }
        }
        throw Encoding.c("Content found after the end of file");
    }

    @NonNull
    private static DexProfileData[] t(@NonNull InputStream inputStream0, int v, DexProfileData[] arr_dexProfileData) throws IOException {
        if(inputStream0.available() == 0) {
            return new DexProfileData[0];
        }
        if(v != arr_dexProfileData.length) {
            throw Encoding.c("Mismatched number of dex files found in metadata");
        }
        String[] arr_s = new String[v];
        int[] arr_v = new int[v];
        for(int v2 = 0; v2 < v; ++v2) {
            int v3 = Encoding.h(inputStream0);
            arr_v[v2] = Encoding.h(inputStream0);
            arr_s[v2] = Encoding.f(inputStream0, v3);
        }
        for(int v1 = 0; v1 < v; ++v1) {
            DexProfileData dexProfileData0 = arr_dexProfileData[v1];
            if(!dexProfileData0.b.equals(arr_s[v1])) {
                throw Encoding.c("Order of dexfiles in metadata did not match baseline");
            }
            int v4 = arr_v[v1];
            dexProfileData0.e = v4;
            dexProfileData0.h = ProfileTranscoder.n(inputStream0, v4);
        }
        return arr_dexProfileData;
    }

    @NonNull
    static DexProfileData[] u(@NonNull InputStream inputStream0, @NonNull byte[] arr_b, DexProfileData[] arr_dexProfileData) throws IOException {
        int v = Encoding.h(inputStream0);
        long v1 = Encoding.i(inputStream0);
        byte[] arr_b1 = Encoding.e(inputStream0, ((int)Encoding.i(inputStream0)), ((int)v1));
        if(inputStream0.read() <= 0) {
            try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b1)) {
                return ProfileTranscoder.v(byteArrayInputStream0, arr_b, v, arr_dexProfileData);
            }
        }
        throw Encoding.c("Content found after the end of file");
    }

    @NonNull
    private static DexProfileData[] v(@NonNull InputStream inputStream0, @NonNull byte[] arr_b, int v, DexProfileData[] arr_dexProfileData) throws IOException {
        if(inputStream0.available() == 0) {
            return new DexProfileData[0];
        }
        if(v != arr_dexProfileData.length) {
            throw Encoding.c("Mismatched number of dex files found in metadata");
        }
        for(int v1 = 0; v1 < v; ++v1) {
            Encoding.h(inputStream0);
            String s = Encoding.f(inputStream0, Encoding.h(inputStream0));
            long v2 = Encoding.i(inputStream0);
            int v3 = Encoding.h(inputStream0);
            DexProfileData dexProfileData0 = ProfileTranscoder.i(arr_dexProfileData, s);
            if(dexProfileData0 == null) {
                throw Encoding.c(("Missing profile key: " + s));
            }
            dexProfileData0.d = v2;
            int[] arr_v = ProfileTranscoder.n(inputStream0, v3);
            if(Arrays.equals(arr_b, ProfileVersion.e)) {
                dexProfileData0.e = v3;
                dexProfileData0.h = arr_v;
            }
        }
        return arr_dexProfileData;
    }

    private static void w(@NonNull InputStream inputStream0, @NonNull DexProfileData dexProfileData0) throws IOException {
        BitSet bitSet0 = BitSet.valueOf(Encoding.d(inputStream0, (dexProfileData0.g * 2 + 7 & -8) / 8));
        for(int v = 0; true; ++v) {
            int v1 = dexProfileData0.g;
            if(v >= v1) {
                break;
            }
            int v2 = ProfileTranscoder.o(bitSet0, v, v1);
            if(v2 != 0) {
                Integer integer0 = (Integer)dexProfileData0.i.get(v);
                if(integer0 == null) {
                    integer0 = 0;
                }
                dexProfileData0.i.put(v, ((int)(v2 | ((int)integer0))));
            }
        }
    }

    @NonNull
    static DexProfileData[] x(@NonNull InputStream inputStream0, @NonNull byte[] arr_b, @NonNull String s) throws IOException {
        if(!Arrays.equals(arr_b, ProfileVersion.b)) {
            throw Encoding.c("Unsupported version");
        }
        int v = Encoding.j(inputStream0);
        long v1 = Encoding.i(inputStream0);
        byte[] arr_b1 = Encoding.e(inputStream0, ((int)Encoding.i(inputStream0)), ((int)v1));
        if(inputStream0.read() <= 0) {
            try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b1)) {
                return ProfileTranscoder.y(byteArrayInputStream0, s, v);
            }
        }
        throw Encoding.c("Content found after the end of file");
    }

    @NonNull
    private static DexProfileData[] y(@NonNull InputStream inputStream0, @NonNull String s, int v) throws IOException {
        if(inputStream0.available() == 0) {
            return new DexProfileData[0];
        }
        DexProfileData[] arr_dexProfileData = new DexProfileData[v];
        for(int v2 = 0; v2 < v; ++v2) {
            int v3 = Encoding.h(inputStream0);
            int v4 = Encoding.h(inputStream0);
            long v5 = Encoding.i(inputStream0);
            long v6 = Encoding.i(inputStream0);
            long v7 = Encoding.i(inputStream0);
            String s1 = Encoding.f(inputStream0, v3);
            TreeMap treeMap0 = new TreeMap();
            arr_dexProfileData[v2] = new DexProfileData(s, s1, v6, 0L, v4, ((int)v5), ((int)v7), new int[v4], treeMap0);
        }
        for(int v1 = 0; v1 < v; ++v1) {
            DexProfileData dexProfileData0 = arr_dexProfileData[v1];
            ProfileTranscoder.q(inputStream0, dexProfileData0);
            dexProfileData0.h = ProfileTranscoder.n(inputStream0, dexProfileData0.e);
            ProfileTranscoder.w(inputStream0, dexProfileData0);
        }
        return arr_dexProfileData;
    }

    private static int z(int v) [...] // Inlined contents
}

