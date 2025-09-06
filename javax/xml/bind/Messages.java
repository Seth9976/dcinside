package javax.xml.bind;

import java.text.MessageFormat;
import java.util.ResourceBundle;

class Messages {
    static final String CANT_FIND_PROPERTIES_FILE = "ContextFinder.CantFindPropertiesFile";
    static final String CANT_MIX_PROVIDERS = "ContextFinder.CantMixProviders";
    static final String CONVERTER_MUST_NOT_BE_NULL = "DatatypeConverter.ConverterMustNotBeNull";
    static final String COULD_NOT_INSTANTIATE = "ContextFinder.CouldNotInstantiate";
    static final String DEFAULT_PROVIDER_NOT_FOUND = "ContextFinder.DefaultProviderNotFound";
    static final String ERROR_LOAD_CLASS = "ContextFinder.ErrorLoadClass";
    static final String ILLEGAL_CAST = "JAXBContext.IllegalCast";
    static final String JAXB_CLASSES_NOT_OPEN = "JAXBClasses.notOpen";
    static final String MISSING_PROPERTY = "ContextFinder.MissingProperty";
    static final String NAME_VALUE = "PropertyException.NameValue";
    static final String NO_PACKAGE_IN_CONTEXTPATH = "ContextFinder.NoPackageInContextPath";
    static final String PROVIDER_NOT_FOUND = "ContextFinder.ProviderNotFound";

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
        return MessageFormat.format(ResourceBundle.getBundle("javax.xml.bind.Messages").getString(s), arr_object);
    }
}

