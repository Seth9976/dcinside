package dagger.internal;

public final class p {
    public static void a(Object object0, Class class0) {
        if(object0 == null) {
            throw new IllegalStateException(class0.getCanonicalName() + " must be set");
        }
    }

    public static Object b(Object object0) {
        object0.getClass();
        return object0;
    }

    public static Object c(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
        return object0;
    }

    public static Object d(Object object0, String s, Object object1) {
        if(object0 == null) {
            if(!s.contains("%s")) {
                throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
            }
            if(s.indexOf("%s") != s.lastIndexOf("%s")) {
                throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
            }
            throw new NullPointerException(s.replace("%s", (object1 instanceof Class ? ((Class)object1).getCanonicalName() : String.valueOf(object1))));
        }
        return object0;
    }
}

