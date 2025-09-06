package com.bytedance.sdk.component.Zh.PjT.Zh;

import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

public final class SM {
    public static final Charset PjT;

    static {
        SM.PjT = Charset.forName("UTF-8");
    }

    public static int PjT(char c) {
        if(c >= 0x30 && c <= 57) {
            return c - 0x30;
        }
        if(c >= 97 && c <= 102) {
            return c - 87;
        }
        return c < 65 || c > 70 ? -1 : c - 55;
    }

    public static int PjT(String s, int v, int v1) {
        while(v < v1) {
            switch(s.charAt(v)) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    ++v;
                    continue;
                }
                default: {
                    return v;
                }
            }
        }
        return v1;
    }

    public static int PjT(String s, int v, int v1, char c) {
        while(v < v1) {
            if(s.charAt(v) == c) {
                return v;
            }
            ++v;
        }
        return v1;
    }

    public static int PjT(String s, int v, int v1, String s1) {
        while(v < v1) {
            if(s1.indexOf(s.charAt(v)) != -1) {
                return v;
            }
            ++v;
        }
        return v1;
    }

    public static String PjT(String s) {
        if(s.contains(":")) {
            InetAddress inetAddress0 = !s.startsWith("[") || !s.endsWith("]") ? SM.ReZ(s, 0, s.length()) : SM.ReZ(s, 1, s.length() - 1);
            if(inetAddress0 == null) {
                return null;
            }
            byte[] arr_b = inetAddress0.getAddress();
            if(arr_b.length != 16) {
                throw new AssertionError("Invalid IPv6 address: \'" + s + "\'");
            }
            return SM.PjT(arr_b);
        }
        try {
            String s1 = IDN.toASCII(s).toLowerCase(Locale.US);
            if(s1.isEmpty()) {
                return null;
            }
            return SM.Zh(s1) ? null : s1;
        }
        catch(IllegalArgumentException unused_ex) {
            return null;
        }
    }

    private static String PjT(byte[] arr_b) {
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
        PjT pjT0 = new PjT();
        while(v1 < arr_b.length) {
            if(v1 == v) {
                pjT0.Zh(58);
                v1 += v3;
                if(v1 != 16) {
                    continue;
                }
                pjT0.Zh(58);
            }
            else {
                if(v1 > 0) {
                    pjT0.Zh(58);
                }
                pjT0.Zh(((long)((arr_b[v1] & 0xFF) << 8 | arr_b[v1 + 1] & 0xFF)));
                v1 += 2;
            }
        }
        return "";
    }

    public static void PjT(long v, long v1, long v2) {
        if((v1 | v2) < 0L || v1 > v || v - v1 < v2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private static boolean PjT(String s, int v, int v1, byte[] arr_b, int v2) {
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
                if(v6 < 0x30 || v6 > 57) {
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

    public static boolean PjT(byte[] arr_b, int v, byte[] arr_b1, int v1, int v2) {
        for(int v3 = 0; v3 < v2; ++v3) {
            if(arr_b[v3 + v] != arr_b1[v3 + v1]) {
                return false;
            }
        }
        return true;
    }

    private static InetAddress ReZ(String s, int v, int v1) {
        byte[] arr_b = new byte[16];
        int v2 = 0;
        int v3 = -1;
        int v4 = -1;
        while(v < v1) {
            if(v2 == 16) {
                return null;
            }
            if(v + 2 > v1 || !s.regionMatches(v, "::", 0, 2)) {
                if(v2 != 0) {
                    if(s.regionMatches(v, ":", 0, 1)) {
                        ++v;
                        goto label_23;
                    }
                    if(!s.regionMatches(v, ".", 0, 1) || !SM.PjT(s, v4, v1, arr_b, v2 - 2)) {
                        return null;
                    }
                    v2 += 2;
                    break;
                }
            label_23:
                v4 = v;
            }
            else {
                if(v3 != -1) {
                    return null;
                }
                v2 += 2;
                v3 = v2;
                if(v + 2 == v1) {
                    break;
                }
                v4 = v + 2;
            }
            v = v4;
            int v5 = 0;
            while(v < v1) {
                int v6 = SM.PjT(s.charAt(v));
                if(v6 == -1) {
                    break;
                }
                v5 = (v5 << 4) + v6;
                ++v;
            }
            if(v - v4 != 0 && v - v4 <= 4) {
                int v7 = v2 + 1;
                arr_b[v2] = (byte)(v5 >>> 8 & 0xFF);
                v2 += 2;
                arr_b[v7] = (byte)(v5 & 0xFF);
                continue;
            }
            return null;
        }
        if(v2 != 16) {
            if(v3 == -1) {
                return null;
            }
            System.arraycopy(arr_b, v3, arr_b, 16 - (v2 - v3), v2 - v3);
            Arrays.fill(arr_b, v3, 16 - v2 + v3, 0);
        }
        try {
            return InetAddress.getByAddress(arr_b);
        }
        catch(UnknownHostException unused_ex) {
            throw new AssertionError();
        }
    }

    public static int Zh(String s, int v, int v1) {
        int v2 = v1 - 1;
        while(v2 >= v) {
            switch(s.charAt(v2)) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    --v2;
                    continue;
                }
                default: {
                    return v2 + 1;
                }
            }
        }
        return v;
    }

    private static boolean Zh(String s) {
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(v1 <= 0x1F || v1 >= 0x7F || " #%/:?@[\\]".indexOf(v1) != -1) {
                return true;
            }
        }
        return false;
    }
}

