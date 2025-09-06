package javax.xml.bind;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;

public interface DatatypeConverterInterface {
    String parseAnySimpleType(String arg1);

    byte[] parseBase64Binary(String arg1);

    boolean parseBoolean(String arg1);

    byte parseByte(String arg1);

    Calendar parseDate(String arg1);

    Calendar parseDateTime(String arg1);

    BigDecimal parseDecimal(String arg1);

    double parseDouble(String arg1);

    float parseFloat(String arg1);

    byte[] parseHexBinary(String arg1);

    int parseInt(String arg1);

    BigInteger parseInteger(String arg1);

    long parseLong(String arg1);

    QName parseQName(String arg1, NamespaceContext arg2);

    short parseShort(String arg1);

    String parseString(String arg1);

    Calendar parseTime(String arg1);

    long parseUnsignedInt(String arg1);

    int parseUnsignedShort(String arg1);

    String printAnySimpleType(String arg1);

    String printBase64Binary(byte[] arg1);

    String printBoolean(boolean arg1);

    String printByte(byte arg1);

    String printDate(Calendar arg1);

    String printDateTime(Calendar arg1);

    String printDecimal(BigDecimal arg1);

    String printDouble(double arg1);

    String printFloat(float arg1);

    String printHexBinary(byte[] arg1);

    String printInt(int arg1);

    String printInteger(BigInteger arg1);

    String printLong(long arg1);

    String printQName(QName arg1, NamespaceContext arg2);

    String printShort(short arg1);

    String printString(String arg1);

    String printTime(Calendar arg1);

    String printUnsignedInt(long arg1);

    String printUnsignedShort(int arg1);
}

