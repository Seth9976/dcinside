package javax.xml.bind.helpers;

import java.text.MessageFormat;
import java.util.ResourceBundle;

class Messages {
    static final String ERROR = "DefaultValidationEventHandler.Error";
    static final String FATAL_ERROR = "DefaultValidationEventHandler.FatalError";
    static final String ILLEGAL_SEVERITY = "ValidationEventImpl.IllegalSeverity";
    static final String INPUTSTREAM_NOT_NULL = "AbstractUnmarshallerImpl.ISNotNull";
    static final String LOCATION_UNAVAILABLE = "DefaultValidationEventHandler.LocationUnavailable";
    static final String MUST_BE_BOOLEAN = "AbstractMarshallerImpl.MustBeBoolean";
    static final String MUST_BE_STRING = "AbstractMarshallerImpl.MustBeString";
    static final String MUST_NOT_BE_NULL = "Shared.MustNotBeNull";
    static final String SEVERITY_MESSAGE = "DefaultValidationEventHandler.SeverityMessage";
    static final String UNRECOGNIZED_SEVERITY = "DefaultValidationEventHandler.UnrecognizedSeverity";
    static final String WARNING = "DefaultValidationEventHandler.Warning";

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
        return MessageFormat.format(ResourceBundle.getBundle("javax.xml.bind.helpers.Messages").getString(s), arr_object);
    }
}

