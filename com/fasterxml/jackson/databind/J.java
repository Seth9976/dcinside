package com.fasterxml.jackson.databind;

public class j {
    public static class a implements k {
        public static final a a;

        static {
            a.a = new a();
        }

        @Override  // com.fasterxml.jackson.databind.k
        public String a(String s) {
            StringBuilder stringBuilder0 = null;
            if(s == null) {
                return null;
            }
            int v = 0;
            int v1 = -1;
            do {
                v1 = a.d(s, v1 + 1);
                if(v1 != -1) {
                    if(v == 0) {
                        stringBuilder0 = new StringBuilder(s.length() + 4);
                        stringBuilder0.append(a.f(s.substring(0, v1)));
                    }
                    else {
                        stringBuilder0.append(a.e(s.substring(v, v1)));
                    }
                    v = v1 + 1;
                }
            }
            while(v1 != -1);
            if(v == 0) {
                return a.f(s);
            }
            stringBuilder0.append(a.e(s.substring(v)));
            return stringBuilder0.toString();
        }

        // 去混淆评级： 低(20)
        private static char b(char c) {
            return Character.isUpperCase(c) ? Character.toLowerCase(c) : c;
        }

        // 去混淆评级： 低(20)
        private static char c(char c) {
            return Character.isLowerCase(c) ? Character.toUpperCase(c) : c;
        }

        private static int d(CharSequence charSequence0, int v) {
            int v1 = charSequence0.length();
            while(v < v1) {
                if(0x5F == charSequence0.charAt(v)) {
                    return v;
                }
                ++v;
            }
            return -1;
        }

        private static String e(String s) {
            return s.length() == 0 ? s : a.c(s.charAt(0)) + a.f(s.substring(1));
        }

        private static String f(String s) {
            int v = s.length();
            StringBuilder stringBuilder0 = new StringBuilder(v);
            for(int v1 = 0; v1 < v; ++v1) {
                stringBuilder0.append(a.b(s.charAt(v1)));
            }
            return stringBuilder0.toString();
        }
    }

}

