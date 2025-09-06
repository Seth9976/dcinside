package okhttp3.internal;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import okio.l;
import y4.m;

public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String s) {
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(L.t(v2, 0x1F) <= 0 || L.t(v2, 0x7F) >= 0 || v.r3(" #%/:?@[\\]", ((char)v2), 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String s, int v, int v1, byte[] arr_b, int v2) {
        int v3 = v2;
        while(v < v1) {
            if(v3 == arr_b.length) {
                return false;
            }
            if(v3 != v2) {
                if(s.charAt(v) != 46) {
                    return false;
                }
                ++v;
            }
            int v4 = v;
            int v5 = 0;
            while(v4 < v1) {
                int v6 = s.charAt(v4);
                if(L.t(v6, 0x30) < 0 || L.t(v6, 57) > 0) {
                    break;
                }
                if(v5 == 0 && v != v4) {
                    return false;
                }
                v5 = v5 * 10 + v6 - 0x30;
                if(v5 > 0xFF) {
                    return false;
                }
                ++v4;
            }
            if(v4 - v == 0) {
                return false;
            }
            arr_b[v3] = (byte)v5;
            ++v3;
            v = v4;
        }
        return v3 == v2 + 4;
    }

    private static final InetAddress decodeIpv6(String s, int v, int v1) {
        byte[] arr_b = new byte[16];
        int v2 = v;
        int v3 = 0;
        int v4 = -1;
        int v5 = -1;
        while(v2 < v1) {
            if(v3 == 16) {
                return null;
            }
            if(v2 + 2 > v1 || !v.u2(s, "::", v2, false, 4, null)) {
                if(v3 != 0) {
                    if(v.u2(s, ":", v2, false, 4, null)) {
                        ++v2;
                        goto label_26;
                    }
                    if(!v.u2(s, ".", v2, false, 4, null) || !HostnamesKt.decodeIpv4Suffix(s, v5, v1, arr_b, v3 - 2)) {
                        return null;
                    }
                    v3 += 2;
                    break;
                }
            label_26:
                v5 = v2;
            }
            else {
                if(v4 != -1) {
                    return null;
                }
                v3 += 2;
                if(v2 + 2 == v1) {
                    v4 = v3;
                    break;
                }
                v5 = v2 + 2;
                v4 = v3;
            }
            v2 = v5;
            int v6 = 0;
            while(v2 < v1) {
                int v7 = Util.parseHexDigit(s.charAt(v2));
                if(v7 == -1) {
                    break;
                }
                v6 = (v6 << 4) + v7;
                ++v2;
            }
            if(v2 - v5 != 0 && v2 - v5 <= 4) {
                int v8 = v3 + 1;
                arr_b[v3] = (byte)(v6 >>> 8 & 0xFF);
                v3 += 2;
                arr_b[v8] = (byte)(v6 & 0xFF);
                continue;
            }
            return null;
        }
        if(v3 != 16) {
            if(v4 == -1) {
                return null;
            }
            System.arraycopy(arr_b, v4, arr_b, 16 - (v3 - v4), v3 - v4);
            Arrays.fill(arr_b, v4, 16 - v3 + v4, 0);
        }
        return InetAddress.getByAddress(arr_b);
    }

    private static final String inet6AddressToAscii(byte[] arr_b) {
        int v = -1;
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_b.length; v2 = v4 + 2) {
            int v4;
            for(v4 = v2; v4 < 16 && arr_b[v4] == 0 && arr_b[v4 + 1] == 0; v4 += 2) {
            }
            int v5 = v4 - v2;
            if(v5 > v3 && v5 >= 4) {
                v = v2;
                v3 = v5;
            }
        }
        l l0 = new l();
        while(v1 < arr_b.length) {
            if(v1 == v) {
                l0.e2(58);
                v1 += v3;
                if(v1 != 16) {
                    continue;
                }
                l0.e2(58);
            }
            else {
                if(v1 > 0) {
                    l0.e2(58);
                }
                l0.i2(((long)(Util.and(arr_b[v1], ((byte)0xFF)) << 8 | Util.and(arr_b[v1 + 1], ((byte)0xFF)))));
                v1 += 2;
            }
        }
        return "";
    }

    @m
    public static final String toCanonicalHost(@y4.l String s) {
        L.p(s, "<this>");
        if(v.W2(s, ":", false, 2, null)) {
            InetAddress inetAddress0 = !v.v2(s, "[", false, 2, null) || !v.N1(s, "]", false, 2, null) ? HostnamesKt.decodeIpv6(s, 0, s.length()) : HostnamesKt.decodeIpv6(s, 1, s.length() - 1);
            if(inetAddress0 == null) {
                return null;
            }
            byte[] arr_b = inetAddress0.getAddress();
            if(arr_b.length == 16) {
                L.o(arr_b, "address");
                return HostnamesKt.inet6AddressToAscii(arr_b);
            }
            if(arr_b.length != 4) {
                throw new AssertionError("Invalid IPv6 address: \'" + s + '\'');
            }
            return inetAddress0.getHostAddress();
        }
        try {
            String s1 = IDN.toASCII(s);
            L.o(s1, "toASCII(host)");
            Locale locale0 = Locale.US;
            L.o(locale0, "US");
            String s2 = s1.toLowerCase(locale0);
            L.o(s2, "this as java.lang.String).toLowerCase(locale)");
            if(s2.length() == 0) {
                return null;
            }
            if(!HostnamesKt.containsInvalidHostnameAsciiCodes(s2)) {
                return s2;
            }
        }
        catch(IllegalArgumentException unused_ex) {
        }
        return null;
    }
}

