package javax.xml.bind.util;

import java.text.MessageFormat;
import java.util.ResourceBundle;

class Messages {
    static final String RESULT_NULL_CONTEXT = "JAXBResult.NullContext";
    static final String RESULT_NULL_UNMARSHALLER = "JAXBResult.NullUnmarshaller";
    static final String SOURCE_NULL_CONTENT = "JAXBSource.NullContent";
    static final String SOURCE_NULL_CONTEXT = "JAXBSource.NullContext";
    static final String SOURCE_NULL_MARSHALLER = "JAXBSource.NullMarshaller";
    static final String UNRECOGNIZED_SEVERITY = "ValidationEventCollector.UnrecognizedSeverity";

    static String format(String s) {
        return Messages.format(s, null);
    }

    static String format(String s, Object object0) {
        return Messages.format(s, new Object[]{object0});
    }

    static String format(String s, Object object0, Object object1) {
        return Messages.format(s, new Object[]{object0, object1});
    }

    static String format(String s, Object object0, Object object1, Object object2) {
        return Messages.format(s, new Object[]{object0, object1, object2});
    }

    // 去混淆评级： 低(20)
    static String format(String s, Object[] arr_object) {
        return MessageFormat.format(ResourceBundle.getBundle("javax.xml.bind.util.Messages").getString(s), arr_object);
    }
}

