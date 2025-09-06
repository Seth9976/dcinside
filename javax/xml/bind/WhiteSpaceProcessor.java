package javax.xml.bind;

abstract class WhiteSpaceProcessor {
    public static CharSequence collapse(CharSequence charSequence0) {
        int v = charSequence0.length();
        int v2;
        for(v2 = 0; v2 < v && !WhiteSpaceProcessor.isWhiteSpace(charSequence0.charAt(v2)); ++v2) {
        }
        if(v2 == v) {
            return charSequence0;
        }
        CharSequence charSequence1 = new StringBuilder(v);
        if(v2 != 0) {
            for(int v1 = 0; v1 < v2; ++v1) {
                ((StringBuilder)charSequence1).append(charSequence0.charAt(v1));
            }
            ((StringBuilder)charSequence1).append(' ');
        }
        int v3 = v2 + 1;
        boolean z = true;
        while(v3 < v) {
            int v4 = charSequence0.charAt(v3);
            boolean z1 = WhiteSpaceProcessor.isWhiteSpace(((char)v4));
            if(!z || !z1) {
                if(z1) {
                    ((StringBuilder)charSequence1).append(' ');
                }
                else {
                    ((StringBuilder)charSequence1).append(((char)v4));
                }
                z = z1;
            }
            ++v3;
        }
        int v5 = ((StringBuilder)charSequence1).length();
        if(v5 > 0 && ((StringBuilder)charSequence1).charAt(v5 - 1) == 0x20) {
            ((StringBuilder)charSequence1).setLength(v5 - 1);
        }
        return charSequence1;
    }

    public static String collapse(String s) {
        return WhiteSpaceProcessor.collapse(s).toString();
    }

    public static final boolean isWhiteSpace(char c) {
        return c <= 0x20 ? c == 9 || c == 10 || (c == 13 || c == 0x20) : false;
    }

    public static final boolean isWhiteSpace(CharSequence charSequence0) {
        for(int v = charSequence0.length() - 1; v >= 0; --v) {
            if(!WhiteSpaceProcessor.isWhiteSpace(charSequence0.charAt(v))) {
                return false;
            }
        }
        return true;
    }

    protected static final boolean isWhiteSpaceExceptSpace(char c) {
        return c < 0x20 ? c == 9 || c == 10 || c == 13 : false;
    }

    public static CharSequence replace(CharSequence charSequence0) {
        int v;
        for(v = charSequence0.length() - 1; v >= 0 && !WhiteSpaceProcessor.isWhiteSpaceExceptSpace(charSequence0.charAt(v)); --v) {
        }
        if(v < 0) {
            return charSequence0;
        }
        StringBuilder stringBuilder0 = new StringBuilder(charSequence0);
        int v1 = v - 1;
        stringBuilder0.setCharAt(v, ' ');
        while(v1 >= 0) {
            if(WhiteSpaceProcessor.isWhiteSpaceExceptSpace(stringBuilder0.charAt(v1))) {
                stringBuilder0.setCharAt(v1, ' ');
            }
            --v1;
        }
        return new String(stringBuilder0);
    }

    public static String replace(String s) {
        return WhiteSpaceProcessor.replace(s).toString();
    }

    public static CharSequence trim(CharSequence charSequence0) {
        int v = charSequence0.length();
        int v1;
        for(v1 = 0; v1 < v && WhiteSpaceProcessor.isWhiteSpace(charSequence0.charAt(v1)); ++v1) {
        }
        int v2;
        for(v2 = v - 1; v2 > v1 && WhiteSpaceProcessor.isWhiteSpace(charSequence0.charAt(v2)); --v2) {
        }
        return v1 != 0 || v2 != v - 1 ? charSequence0.subSequence(v1, v2 + 1) : charSequence0;
    }
}

