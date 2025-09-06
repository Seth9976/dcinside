package javax.xml.bind;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;

final class DatatypeConverterImpl implements DatatypeConverterInterface {
    static final class CalendarFormatter {
        public static String doFormat(String s, Calendar calendar0) throws IllegalArgumentException {
            int v = s.length();
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = 0;
            while(v1 < v) {
                int v2 = v1 + 1;
                int v3 = s.charAt(v1);
                if(v3 == 37) {
                    v1 += 2;
                    switch(s.charAt(v2)) {
                        case 68: {
                            CalendarFormatter.formatDays(calendar0, stringBuilder0);
                            break;
                        }
                        case 77: {
                            CalendarFormatter.formatMonth(calendar0, stringBuilder0);
                            break;
                        }
                        case 89: {
                            CalendarFormatter.formatYear(calendar0, stringBuilder0);
                            break;
                        }
                        case 104: {
                            CalendarFormatter.formatHours(calendar0, stringBuilder0);
                            break;
                        }
                        case 109: {
                            CalendarFormatter.formatMinutes(calendar0, stringBuilder0);
                            break;
                        }
                        case 0x73: {
                            CalendarFormatter.formatSeconds(calendar0, stringBuilder0);
                            break;
                        }
                        case 0x7A: {
                            CalendarFormatter.formatTimeZone(calendar0, stringBuilder0);
                            break;
                        }
                        default: {
                            throw new InternalError();
                        }
                    }
                }
                else {
                    stringBuilder0.append(((char)v3));
                    v1 = v2;
                }
            }
            return stringBuilder0.toString();
        }

        private static void formatDays(Calendar calendar0, StringBuilder stringBuilder0) {
            CalendarFormatter.formatTwoDigits(calendar0.get(5), stringBuilder0);
        }

        private static void formatHours(Calendar calendar0, StringBuilder stringBuilder0) {
            CalendarFormatter.formatTwoDigits(calendar0.get(11), stringBuilder0);
        }

        private static void formatMinutes(Calendar calendar0, StringBuilder stringBuilder0) {
            CalendarFormatter.formatTwoDigits(calendar0.get(12), stringBuilder0);
        }

        private static void formatMonth(Calendar calendar0, StringBuilder stringBuilder0) {
            CalendarFormatter.formatTwoDigits(calendar0.get(2) + 1, stringBuilder0);
        }

        private static void formatSeconds(Calendar calendar0, StringBuilder stringBuilder0) {
            CalendarFormatter.formatTwoDigits(calendar0.get(13), stringBuilder0);
            if(calendar0.isSet(14)) {
                int v = calendar0.get(14);
                if(v != 0) {
                    String s;
                    for(s = Integer.toString(v); s.length() < 3; s = '0' + s) {
                    }
                    stringBuilder0.append('.');
                    stringBuilder0.append(s);
                }
            }
        }

        private static void formatTimeZone(Calendar calendar0, StringBuilder stringBuilder0) {
            TimeZone timeZone0 = calendar0.getTimeZone();
            if(timeZone0 == null) {
                return;
            }
            int v = timeZone0.getOffset(calendar0.getTime().getTime());
            if(v == 0) {
                stringBuilder0.append('Z');
                return;
            }
            if(v >= 0) {
                stringBuilder0.append('+');
            }
            else {
                stringBuilder0.append('-');
                v = -v;
            }
            CalendarFormatter.formatTwoDigits(v / 60000 / 60, stringBuilder0);
            stringBuilder0.append(':');
            CalendarFormatter.formatTwoDigits(v / 60000 % 60, stringBuilder0);
        }

        private static void formatTwoDigits(int v, StringBuilder stringBuilder0) {
            if(v < 10) {
                stringBuilder0.append('0');
            }
            stringBuilder0.append(v);
        }

        private static void formatYear(Calendar calendar0, StringBuilder stringBuilder0) {
            int v = calendar0.get(1);
            String s;
            for(s = v > 0 ? Integer.toString(v) : Integer.toString(1 - v); s.length() < 4; s = '0' + s) {
            }
            if(v <= 0) {
                s = '-' + s;
            }
            stringBuilder0.append(s);
        }
    }

    static final boolean $assertionsDisabled = false;
    private static final byte PADDING = 0x7F;
    private static final DatatypeFactory datatypeFactory;
    private static final byte[] decodeMap;
    private static final char[] encodeMap;
    private static final char[] hexCode;
    public static final DatatypeConverterInterface theInstance;

    static {
        DatatypeConverterImpl.theInstance = new DatatypeConverterImpl();
        DatatypeConverterImpl.hexCode = "0123456789ABCDEF".toCharArray();
        DatatypeConverterImpl.decodeMap = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 0x3F, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, 0x7F, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 0x1F, 0x20, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 0x2F, 0x30, 49, 50, 51, -1, -1, -1, -1, -1};
        DatatypeConverterImpl.encodeMap = DatatypeConverterImpl.initEncodeMap();
        try {
            DatatypeConverterImpl.datatypeFactory = DatatypeFactory.newInstance();
        }
        catch(DatatypeConfigurationException datatypeConfigurationException0) {
            throw new Error(datatypeConfigurationException0);
        }
    }

    public static byte[] _parseBase64Binary(String s) {
        int v = DatatypeConverterImpl.guessLength(s);
        byte[] arr_b = new byte[v];
        int v1 = s.length();
        byte[] arr_b1 = new byte[4];
        int v3 = 0;
        int v4 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            byte b = DatatypeConverterImpl.decodeMap[s.charAt(v2)];
            if(b != -1) {
                arr_b1[v4] = b;
                ++v4;
            }
            if(v4 == 4) {
                int v5 = v3 + 1;
                arr_b[v3] = (byte)(arr_b1[0] << 2 | arr_b1[1] >> 4);
                int v6 = arr_b1[2];
                if(v6 != 0x7F) {
                    arr_b[v5] = (byte)(v6 >> 2 | arr_b1[1] << 4);
                    v5 = v3 + 2;
                }
                int v7 = arr_b1[3];
                if(v7 == 0x7F) {
                    v3 = v5;
                }
                else {
                    arr_b[v5] = (byte)(v7 | arr_b1[2] << 6);
                    v3 = v5 + 1;
                }
                v4 = 0;
            }
        }
        if(v == v3) {
            return arr_b;
        }
        byte[] arr_b2 = new byte[v3];
        System.arraycopy(arr_b, 0, arr_b2, 0, v3);
        return arr_b2;
    }

    public static Boolean _parseBoolean(CharSequence charSequence0) {
        int v3;
        if(charSequence0 == null) {
            return null;
        }
        int v = charSequence0.length();
        if(charSequence0.length() <= 0) {
            return null;
        }
        int v1 = 0;
        for(int v2 = 0; true; v2 = v3) {
            v3 = v2 + 1;
            int v4 = charSequence0.charAt(v2);
            if(!WhiteSpaceProcessor.isWhiteSpace(((char)v4)) || v3 >= v) {
                break;
            }
        }
        switch(v4) {
            case 49: {
                break;
            }
            case 102: {
                int v5;
                for(v5 = 0; "alse".charAt(v5) == charSequence0.charAt(v3) && v3 + 1 < v && v5 + 1 < 4; ++v5) {
                    ++v3;
                }
                if(v5 + 1 == 4) {
                    ++v3;
                    goto label_30;
                }
                return false;
            }
            case 0x74: {
                while("rue".charAt(v1) == charSequence0.charAt(v3) && v3 + 1 < v && v1 + 1 < 3) {
                    ++v3;
                    ++v1;
                }
                if(v1 + 1 == 3) {
                    ++v3;
                    break;
                }
                return false;
            }
            default: {
                goto label_30;
            }
        }
        v1 = 1;
    label_30:
        if(v3 < v) {
            while(WhiteSpaceProcessor.isWhiteSpace(charSequence0.charAt(v3)) && v3 + 1 < v) {
                ++v3;
            }
            ++v3;
        }
        return v3 == v ? Boolean.valueOf(((boolean)v1)) : null;
    }

    public static byte _parseByte(CharSequence charSequence0) {
        return (byte)DatatypeConverterImpl._parseInt(charSequence0);
    }

    public static GregorianCalendar _parseDateTime(CharSequence charSequence0) {
        String s = WhiteSpaceProcessor.trim(charSequence0).toString();
        return DatatypeConverterImpl.datatypeFactory.newXMLGregorianCalendar(s).toGregorianCalendar();
    }

    public static BigDecimal _parseDecimal(CharSequence charSequence0) {
        CharSequence charSequence1 = WhiteSpaceProcessor.trim(charSequence0);
        return charSequence1.length() > 0 ? new BigDecimal(charSequence1.toString()) : null;
    }

    public static double _parseDouble(CharSequence charSequence0) {
        String s = WhiteSpaceProcessor.trim(charSequence0).toString();
        if(s.equals("NaN")) {
            return NaN;
        }
        if(s.equals("INF")) {
            return Infinity;
        }
        if(s.equals("-INF")) {
            return -Infinity;
        }
        if(s.length() == 0 || !DatatypeConverterImpl.isDigitOrPeriodOrSign(s.charAt(0)) || !DatatypeConverterImpl.isDigitOrPeriodOrSign(s.charAt(s.length() - 1))) {
            throw new NumberFormatException(s);
        }
        return Double.parseDouble(s);
    }

    public static float _parseFloat(CharSequence charSequence0) {
        String s = WhiteSpaceProcessor.trim(charSequence0).toString();
        if(s.equals("NaN")) {
            return NaNf;
        }
        if(s.equals("INF")) {
            return Infinityf;
        }
        if(s.equals("-INF")) {
            return -Infinityf;
        }
        if(s.length() == 0 || !DatatypeConverterImpl.isDigitOrPeriodOrSign(s.charAt(0)) || !DatatypeConverterImpl.isDigitOrPeriodOrSign(s.charAt(s.length() - 1))) {
            throw new NumberFormatException();
        }
        return Float.parseFloat(s);
    }

    public static int _parseInt(CharSequence charSequence0) {
        int v = charSequence0.length();
        int v1 = 1;
        int v3 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            int v4 = charSequence0.charAt(v2);
            if(!WhiteSpaceProcessor.isWhiteSpace(((char)v4))) {
                if(0x30 <= v4 && v4 <= 57) {
                    v3 = v3 * 10 + (v4 - 0x30);
                }
                else if(v4 == 45) {
                    v1 = -1;
                }
                else if(v4 != 43) {
                    throw new NumberFormatException("Not a number: " + charSequence0);
                }
            }
        }
        return v3 * v1;
    }

    public static BigInteger _parseInteger(CharSequence charSequence0) {
        return new BigInteger(DatatypeConverterImpl.removeOptionalPlus(WhiteSpaceProcessor.trim(charSequence0)).toString());
    }

    public static long _parseLong(CharSequence charSequence0) {
        return Long.parseLong(DatatypeConverterImpl.removeOptionalPlus(WhiteSpaceProcessor.trim(charSequence0)).toString());
    }

    public static QName _parseQName(CharSequence charSequence0, NamespaceContext namespaceContext0) {
        int v = charSequence0.length();
        int v1;
        for(v1 = 0; v1 < v && WhiteSpaceProcessor.isWhiteSpace(charSequence0.charAt(v1)); ++v1) {
        }
        while(v > v1 && WhiteSpaceProcessor.isWhiteSpace(charSequence0.charAt(v - 1))) {
            --v;
        }
        if(v == v1) {
            throw new IllegalArgumentException("input is empty");
        }
        int v2;
        for(v2 = v1 + 1; v2 < v && charSequence0.charAt(v2) != 58; ++v2) {
        }
        if(v2 == v) {
            return new QName(namespaceContext0.getNamespaceURI(""), charSequence0.subSequence(v1, v).toString(), "");
        }
        String s = charSequence0.subSequence(v1, v2).toString();
        String s1 = charSequence0.subSequence(v2 + 1, v).toString();
        String s2 = namespaceContext0.getNamespaceURI(s);
        if(s2 == null || s2.length() == 0) {
            throw new IllegalArgumentException("prefix " + s + " is not bound to a namespace");
        }
        return new QName(s2, s1, s);
    }

    public static short _parseShort(CharSequence charSequence0) {
        return (short)DatatypeConverterImpl._parseInt(charSequence0);
    }

    public static int _printBase64Binary(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2) {
        while(v1 >= 3) {
            arr_b1[v2] = DatatypeConverterImpl.encodeByte(arr_b[v] >> 2);
            arr_b1[v2 + 1] = DatatypeConverterImpl.encodeByte((arr_b[v] & 3) << 4 | arr_b[v + 1] >> 4 & 15);
            int v3 = v2 + 3;
            arr_b1[v2 + 2] = DatatypeConverterImpl.encodeByte(3 & arr_b[v + 2] >> 6 | (arr_b[v + 1] & 15) << 2);
            v2 += 4;
            arr_b1[v3] = DatatypeConverterImpl.encodeByte(arr_b[v + 2] & 0x3F);
            v1 -= 3;
            v += 3;
        }
        if(v1 == 1) {
            arr_b1[v2] = DatatypeConverterImpl.encodeByte(arr_b[v] >> 2);
            arr_b1[v2 + 1] = DatatypeConverterImpl.encodeByte((arr_b[v] & 3) << 4);
            int v4 = v2 + 3;
            arr_b1[v2 + 2] = 61;
            v2 += 4;
            arr_b1[v4] = 61;
        }
        if(v1 == 2) {
            arr_b1[v2] = DatatypeConverterImpl.encodeByte(arr_b[v] >> 2);
            arr_b1[v2 + 1] = DatatypeConverterImpl.encodeByte((3 & arr_b[v]) << 4 | arr_b[v + 1] >> 4 & 15);
            int v5 = v2 + 3;
            arr_b1[v2 + 2] = DatatypeConverterImpl.encodeByte((arr_b[v + 1] & 15) << 2);
            v2 += 4;
            arr_b1[v5] = 61;
        }
        return v2;
    }

    public static int _printBase64Binary(byte[] arr_b, int v, int v1, char[] arr_c, int v2) {
        while(v1 >= 3) {
            arr_c[v2] = DatatypeConverterImpl.encode(arr_b[v] >> 2);
            arr_c[v2 + 1] = DatatypeConverterImpl.encode((arr_b[v] & 3) << 4 | arr_b[v + 1] >> 4 & 15);
            int v3 = v2 + 3;
            arr_c[v2 + 2] = DatatypeConverterImpl.encode(3 & arr_b[v + 2] >> 6 | (arr_b[v + 1] & 15) << 2);
            v2 += 4;
            arr_c[v3] = DatatypeConverterImpl.encode(arr_b[v + 2] & 0x3F);
            v1 -= 3;
            v += 3;
        }
        if(v1 == 1) {
            arr_c[v2] = DatatypeConverterImpl.encode(arr_b[v] >> 2);
            arr_c[v2 + 1] = DatatypeConverterImpl.encode((arr_b[v] & 3) << 4);
            int v4 = v2 + 3;
            arr_c[v2 + 2] = '=';
            v2 += 4;
            arr_c[v4] = '=';
        }
        if(v1 == 2) {
            arr_c[v2] = DatatypeConverterImpl.encode(arr_b[v] >> 2);
            arr_c[v2 + 1] = DatatypeConverterImpl.encode((3 & arr_b[v]) << 4 | arr_b[v + 1] >> 4 & 15);
            int v5 = v2 + 3;
            arr_c[v2 + 2] = DatatypeConverterImpl.encode((arr_b[v + 1] & 15) << 2);
            v2 += 4;
            arr_c[v5] = '=';
        }
        return v2;
    }

    public static String _printBase64Binary(byte[] arr_b) {
        return DatatypeConverterImpl._printBase64Binary(arr_b, 0, arr_b.length);
    }

    public static String _printBase64Binary(byte[] arr_b, int v, int v1) {
        char[] arr_c = new char[(v1 + 2) / 3 * 4];
        DatatypeConverterImpl._printBase64Binary(arr_b, v, v1, arr_c, 0);
        return new String(arr_c);
    }

    // 去混淆评级： 低(20)
    public static String _printBoolean(boolean z) {
        return z ? "true" : "false";
    }

    public static String _printByte(byte b) {
        return String.valueOf(b);
    }

    // 去混淆评级： 低(20)
    public static String _printDate(Calendar calendar0) {
        return CalendarFormatter.doFormat("%Y-%M-%D%z", calendar0);
    }

    public static String _printDateTime(Calendar calendar0) {
        return CalendarFormatter.doFormat("%Y-%M-%DT%h:%m:%s%z", calendar0);
    }

    public static String _printDecimal(BigDecimal bigDecimal0) {
        return bigDecimal0.toPlainString();
    }

    public static String _printDouble(double f) {
        if(Double.isNaN(f)) {
            return "NaN";
        }
        if(f == Infinity) {
            return "INF";
        }
        return f == -Infinity ? "-INF" : String.valueOf(f);
    }

    public static String _printFloat(float f) {
        if(Float.isNaN(f)) {
            return "NaN";
        }
        switch(f) {
            case 0xFF800000: {
                return "-INF";
            }
            case 0x7F800000: {
                return "INF";
            }
            default: {
                return String.valueOf(f);
            }
        }
    }

    public static String _printInt(int v) {
        return String.valueOf(v);
    }

    public static String _printInteger(BigInteger bigInteger0) {
        return bigInteger0.toString();
    }

    public static String _printLong(long v) {
        return String.valueOf(v);
    }

    public static String _printQName(QName qName0, NamespaceContext namespaceContext0) {
        String s = namespaceContext0.getPrefix(qName0.getNamespaceURI());
        String s1 = qName0.getLocalPart();
        return s == null || s.length() == 0 ? s1 : s + ':' + s1;
    }

    public static String _printShort(short v) {
        return String.valueOf(v);
    }

    public static char encode(int v) {
        return DatatypeConverterImpl.encodeMap[v & 0x3F];
    }

    public static byte encodeByte(int v) {
        return (byte)DatatypeConverterImpl.encodeMap[v & 0x3F];
    }

    private static int guessLength(String s) {
        int v = s.length();
        int v1 = v - 1;
        while(v1 >= 0) {
            int v2 = DatatypeConverterImpl.decodeMap[s.charAt(v1)];
            if(v2 == 0x7F) {
                --v1;
                continue;
            }
            if(v2 != -1) {
                break;
            }
            return s.length() / 4 * 3;
        }
        int v3 = v - (v1 + 1);
        return v3 <= 2 ? s.length() / 4 * 3 - v3 : s.length() / 4 * 3;
    }

    private static int hexToBin(char c) {
        if(0x30 <= c && c <= 57) {
            return c - 0x30;
        }
        if(65 <= c && c <= 70) {
            return c - 55;
        }
        return 97 > c || c > 102 ? -1 : c - 87;
    }

    private static byte[] initDecodeMap() {
        byte[] arr_b = new byte[0x80];
        for(int v = 0; v < 0x80; ++v) {
            arr_b[v] = -1;
        }
        for(int v1 = 65; v1 <= 90; ++v1) {
            arr_b[v1] = (byte)(v1 - 65);
        }
        for(int v2 = 97; v2 <= 0x7A; ++v2) {
            arr_b[v2] = (byte)(v2 - 71);
        }
        for(int v3 = 0x30; v3 <= 57; ++v3) {
            arr_b[v3] = (byte)(v3 + 4);
        }
        arr_b[43] = 62;
        arr_b[0x2F] = 0x3F;
        arr_b[61] = 0x7F;
        return arr_b;
    }

    private static char[] initEncodeMap() {
        char[] arr_c = new char[0x40];
        for(int v = 0; v < 26; ++v) {
            arr_c[v] = (char)(v + 65);
        }
        for(int v1 = 26; v1 < 52; ++v1) {
            arr_c[v1] = (char)(v1 + 71);
        }
        for(int v2 = 52; v2 < 62; ++v2) {
            arr_c[v2] = (char)(v2 - 4);
        }
        arr_c[62] = '+';
        arr_c[0x3F] = '/';
        return arr_c;
    }

    public static String installHook(String s) {
        DatatypeConverter.setDatatypeConverter(DatatypeConverterImpl.theInstance);
        return s;
    }

    private static boolean isDigitOrPeriodOrSign(char c) {
        return 0x30 > c || c > 57 ? c == 43 || c == 45 || c == 46 : true;
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String parseAnySimpleType(String s) {
        return s;
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public byte[] parseBase64Binary(String s) {
        return DatatypeConverterImpl._parseBase64Binary(s);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public boolean parseBoolean(String s) {
        Boolean boolean0 = DatatypeConverterImpl._parseBoolean(s);
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public byte parseByte(String s) {
        return DatatypeConverterImpl._parseByte(s);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public Calendar parseDate(String s) {
        return DatatypeConverterImpl.datatypeFactory.newXMLGregorianCalendar(s).toGregorianCalendar();
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public Calendar parseDateTime(String s) {
        return DatatypeConverterImpl._parseDateTime(s);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public BigDecimal parseDecimal(String s) {
        return DatatypeConverterImpl._parseDecimal(s);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public double parseDouble(String s) {
        return DatatypeConverterImpl._parseDouble(s);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public float parseFloat(String s) {
        return DatatypeConverterImpl._parseFloat(s);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public byte[] parseHexBinary(String s) {
        int v = s.length();
        if(v % 2 != 0) {
            throw new IllegalArgumentException("hexBinary needs to be even-length: " + s);
        }
        byte[] arr_b = new byte[v / 2];
        for(int v1 = 0; v1 < v; v1 += 2) {
            int v2 = DatatypeConverterImpl.hexToBin(s.charAt(v1));
            int v3 = DatatypeConverterImpl.hexToBin(s.charAt(v1 + 1));
            if(v2 == -1 || v3 == -1) {
                throw new IllegalArgumentException("contains illegal character for hexBinary: " + s);
            }
            arr_b[v1 / 2] = (byte)(v2 * 16 + v3);
        }
        return arr_b;
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public int parseInt(String s) {
        return DatatypeConverterImpl._parseInt(s);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public BigInteger parseInteger(String s) {
        return DatatypeConverterImpl._parseInteger(s);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public long parseLong(String s) {
        return DatatypeConverterImpl._parseLong(s);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public QName parseQName(String s, NamespaceContext namespaceContext0) {
        return DatatypeConverterImpl._parseQName(s, namespaceContext0);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public short parseShort(String s) {
        return DatatypeConverterImpl._parseShort(s);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String parseString(String s) {
        return s;
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public Calendar parseTime(String s) {
        return DatatypeConverterImpl.datatypeFactory.newXMLGregorianCalendar(s).toGregorianCalendar();
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public long parseUnsignedInt(String s) {
        return DatatypeConverterImpl._parseLong(s);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public int parseUnsignedShort(String s) {
        return DatatypeConverterImpl._parseInt(s);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printAnySimpleType(String s) {
        return s;
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printBase64Binary(byte[] arr_b) {
        return DatatypeConverterImpl._printBase64Binary(arr_b);
    }

    // 去混淆评级： 低(20)
    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printBoolean(boolean z) {
        return z ? "true" : "false";
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printByte(byte b) {
        return DatatypeConverterImpl._printByte(b);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printDate(Calendar calendar0) {
        return DatatypeConverterImpl._printDate(calendar0);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printDateTime(Calendar calendar0) {
        return DatatypeConverterImpl._printDateTime(calendar0);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printDecimal(BigDecimal bigDecimal0) {
        return DatatypeConverterImpl._printDecimal(bigDecimal0);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printDouble(double f) {
        return DatatypeConverterImpl._printDouble(f);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printFloat(float f) {
        return DatatypeConverterImpl._printFloat(f);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printHexBinary(byte[] arr_b) {
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length * 2);
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            stringBuilder0.append(DatatypeConverterImpl.hexCode[v1 >> 4 & 15]);
            stringBuilder0.append(DatatypeConverterImpl.hexCode[v1 & 15]);
        }
        return stringBuilder0.toString();
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printInt(int v) {
        return DatatypeConverterImpl._printInt(v);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printInteger(BigInteger bigInteger0) {
        return DatatypeConverterImpl._printInteger(bigInteger0);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printLong(long v) {
        return DatatypeConverterImpl._printLong(v);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printQName(QName qName0, NamespaceContext namespaceContext0) {
        return DatatypeConverterImpl._printQName(qName0, namespaceContext0);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printShort(short v) {
        return DatatypeConverterImpl._printShort(v);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printString(String s) {
        return s;
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printTime(Calendar calendar0) {
        return CalendarFormatter.doFormat("%h:%m:%s%z", calendar0);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printUnsignedInt(long v) {
        return DatatypeConverterImpl._printLong(v);
    }

    @Override  // javax.xml.bind.DatatypeConverterInterface
    public String printUnsignedShort(int v) {
        return String.valueOf(v);
    }

    private static CharSequence removeOptionalPlus(CharSequence charSequence0) {
        int v = charSequence0.length();
        if(v > 1 && charSequence0.charAt(0) == 43) {
            CharSequence charSequence1 = charSequence0.subSequence(1, v);
            int v1 = charSequence1.charAt(0);
            if(0x30 <= v1 && v1 <= 57) {
                return charSequence1;
            }
            if(46 != v1) {
                throw new NumberFormatException();
            }
            return charSequence1;
        }
        return charSequence0;
    }
}

