package kotlinx.coroutines.debug.internal;

import kotlin.jvm.internal.L;

public final class h {
    private static final String b(String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('\"');
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            switch(v2) {
                case 8: {
                    stringBuilder0.append("\\b");
                    break;
                }
                case 9: {
                    stringBuilder0.append("\\t");
                    break;
                }
                case 10: {
                    stringBuilder0.append("\\n");
                    break;
                }
                case 13: {
                    stringBuilder0.append("\\r");
                    break;
                }
                case 34: {
                    stringBuilder0.append("\\\"");
                    break;
                }
                case 92: {
                    stringBuilder0.append("\\\\");
                    break;
                }
                default: {
                    stringBuilder0.append(((char)v2));
                }
            }
        }
        stringBuilder0.append('\"');
        String s1 = stringBuilder0.toString();
        L.o(s1, "toString(...)");
        return s1;
    }
}

