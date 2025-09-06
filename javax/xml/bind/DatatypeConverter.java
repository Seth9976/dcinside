package javax.xml.bind;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;

public final class DatatypeConverter {
    private static final JAXBPermission SET_DATATYPE_CONVERTER_PERMISSION;
    private static volatile DatatypeConverterInterface theConverter;

    static {
        DatatypeConverter.SET_DATATYPE_CONVERTER_PERMISSION = new JAXBPermission("setDatatypeConverter");
    }

    private static void initConverter() {
        synchronized(DatatypeConverter.class) {
            DatatypeConverter.theConverter = new DatatypeConverterImpl();
        }
    }

    public static String parseAnySimpleType(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseAnySimpleType(s);
    }

    public static byte[] parseBase64Binary(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseBase64Binary(s);
    }

    public static boolean parseBoolean(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseBoolean(s);
    }

    public static byte parseByte(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseByte(s);
    }

    public static Calendar parseDate(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseDate(s);
    }

    public static Calendar parseDateTime(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseDateTime(s);
    }

    public static BigDecimal parseDecimal(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseDecimal(s);
    }

    public static double parseDouble(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseDouble(s);
    }

    public static float parseFloat(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseFloat(s);
    }

    public static byte[] parseHexBinary(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseHexBinary(s);
    }

    public static int parseInt(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseInt(s);
    }

    public static BigInteger parseInteger(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseInteger(s);
    }

    public static long parseLong(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseLong(s);
    }

    public static QName parseQName(String s, NamespaceContext namespaceContext0) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseQName(s, namespaceContext0);
    }

    public static short parseShort(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseShort(s);
    }

    public static String parseString(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseString(s);
    }

    public static Calendar parseTime(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseTime(s);
    }

    public static long parseUnsignedInt(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseUnsignedInt(s);
    }

    public static int parseUnsignedShort(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.parseUnsignedShort(s);
    }

    public static String printAnySimpleType(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printAnySimpleType(s);
    }

    public static String printBase64Binary(byte[] arr_b) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printBase64Binary(arr_b);
    }

    public static String printBoolean(boolean z) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printBoolean(z);
    }

    public static String printByte(byte b) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printByte(b);
    }

    public static String printDate(Calendar calendar0) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printDate(calendar0);
    }

    public static String printDateTime(Calendar calendar0) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printDateTime(calendar0);
    }

    public static String printDecimal(BigDecimal bigDecimal0) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printDecimal(bigDecimal0);
    }

    public static String printDouble(double f) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printDouble(f);
    }

    public static String printFloat(float f) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printFloat(f);
    }

    public static String printHexBinary(byte[] arr_b) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printHexBinary(arr_b);
    }

    public static String printInt(int v) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printInt(v);
    }

    public static String printInteger(BigInteger bigInteger0) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printInteger(bigInteger0);
    }

    public static String printLong(long v) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printLong(v);
    }

    public static String printQName(QName qName0, NamespaceContext namespaceContext0) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printQName(qName0, namespaceContext0);
    }

    public static String printShort(short v) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printShort(v);
    }

    public static String printString(String s) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printString(s);
    }

    public static String printTime(Calendar calendar0) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printTime(calendar0);
    }

    public static String printUnsignedInt(long v) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printUnsignedInt(v);
    }

    public static String printUnsignedShort(int v) {
        if(DatatypeConverter.theConverter == null) {
            DatatypeConverter.initConverter();
        }
        return DatatypeConverter.theConverter.printUnsignedShort(v);
    }

    public static void setDatatypeConverter(DatatypeConverterInterface datatypeConverterInterface0) {
        if(datatypeConverterInterface0 == null) {
            throw new IllegalArgumentException(Messages.format("DatatypeConverter.ConverterMustNotBeNull"));
        }
        if(DatatypeConverter.theConverter == null) {
            SecurityManager securityManager0 = System.getSecurityManager();
            if(securityManager0 != null) {
                securityManager0.checkPermission(DatatypeConverter.SET_DATATYPE_CONVERTER_PERMISSION);
            }
            DatatypeConverter.theConverter = datatypeConverterInterface0;
        }
    }
}

