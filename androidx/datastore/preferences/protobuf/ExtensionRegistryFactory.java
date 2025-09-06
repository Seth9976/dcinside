package androidx.datastore.preferences.protobuf;

final class ExtensionRegistryFactory {
    static final String a = "androidx.datastore.preferences.protobuf.ExtensionRegistry";
    static final Class b;

    static {
        ExtensionRegistryFactory.b = ExtensionRegistryFactory.e();
    }

    public static ExtensionRegistryLite a() {
        if(ExtensionRegistryFactory.b != null) {
            try {
                return ExtensionRegistryFactory.c("newInstance");
            }
            catch(Exception unused_ex) {
            }
        }
        return new ExtensionRegistryLite();
    }

    public static ExtensionRegistryLite b() {
        if(ExtensionRegistryFactory.b != null) {
            try {
                return ExtensionRegistryFactory.c("getEmptyRegistry");
            }
            catch(Exception unused_ex) {
            }
        }
        return ExtensionRegistryLite.g;
    }

    private static final ExtensionRegistryLite c(String s) throws Exception {
        return (ExtensionRegistryLite)ExtensionRegistryFactory.b.getDeclaredMethod(s, null).invoke(null, null);
    }

    static boolean d(ExtensionRegistryLite extensionRegistryLite0) {
        return ExtensionRegistryFactory.b != null && ExtensionRegistryFactory.b.isAssignableFrom(extensionRegistryLite0.getClass());
    }

    static Class e() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        }
        catch(ClassNotFoundException unused_ex) {
            return null;
        }
    }
}

