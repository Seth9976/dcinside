package androidx.datastore.preferences.protobuf;

import j..util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ExtensionRegistryLite {
    static final class ObjectIntPair {
        private final Object a;
        private final int b;

        ObjectIntPair(Object object0, int v) {
            this.a = object0;
            this.b = v;
        }

        @Override
        public boolean equals(Object object0) {
            return object0 instanceof ObjectIntPair ? this.a == ((ObjectIntPair)object0).a && this.b == ((ObjectIntPair)object0).b : false;
        }

        @Override
        public int hashCode() {
            return System.identityHashCode(this.a) * 0xFFFF + this.b;
        }
    }

    private final Map a;
    private static volatile boolean b = false;
    private static boolean c = true;
    static final String d = "androidx.datastore.preferences.protobuf.Extension";
    private static final Class e;
    private static volatile ExtensionRegistryLite f;
    static final ExtensionRegistryLite g;

    static {
        ExtensionRegistryLite.e = ExtensionRegistryLite.h();
        ExtensionRegistryLite.g = new ExtensionRegistryLite(true);
    }

    ExtensionRegistryLite() {
        this.a = new HashMap();
    }

    ExtensionRegistryLite(ExtensionRegistryLite extensionRegistryLite0) {
        if(extensionRegistryLite0 == ExtensionRegistryLite.g) {
            this.a = Collections.emptyMap();
            return;
        }
        this.a = DesugarCollections.unmodifiableMap(extensionRegistryLite0.a);
    }

    ExtensionRegistryLite(boolean z) {
        this.a = Collections.emptyMap();
    }

    public final void a(ExtensionLite extensionLite0) {
        Class class0 = extensionLite0.getClass();
        if(GeneratedExtension.class.isAssignableFrom(class0)) {
            this.b(((GeneratedExtension)extensionLite0));
        }
        if(ExtensionRegistryLite.c && ExtensionRegistryFactory.d(this)) {
            try {
                this.getClass().getMethod("add", ExtensionRegistryLite.e).invoke(this, extensionLite0);
            }
            catch(Exception exception0) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", extensionLite0), exception0);
            }
        }
    }

    public final void b(GeneratedExtension generatedMessageLite$GeneratedExtension0) {
        ObjectIntPair extensionRegistryLite$ObjectIntPair0 = new ObjectIntPair(generatedMessageLite$GeneratedExtension0.h(), generatedMessageLite$GeneratedExtension0.d());
        this.a.put(extensionRegistryLite$ObjectIntPair0, generatedMessageLite$GeneratedExtension0);
    }

    public GeneratedExtension c(MessageLite messageLite0, int v) {
        ObjectIntPair extensionRegistryLite$ObjectIntPair0 = new ObjectIntPair(messageLite0, v);
        return (GeneratedExtension)this.a.get(extensionRegistryLite$ObjectIntPair0);
    }

    public static ExtensionRegistryLite d() {
        ExtensionRegistryLite extensionRegistryLite0 = ExtensionRegistryLite.f;
        if(extensionRegistryLite0 == null) {
            synchronized(ExtensionRegistryLite.class) {
                extensionRegistryLite0 = ExtensionRegistryLite.f;
                if(extensionRegistryLite0 == null) {
                    extensionRegistryLite0 = ExtensionRegistryLite.c ? ExtensionRegistryFactory.b() : ExtensionRegistryLite.g;
                    ExtensionRegistryLite.f = extensionRegistryLite0;
                }
            }
        }
        return extensionRegistryLite0;
    }

    public ExtensionRegistryLite e() {
        return new ExtensionRegistryLite(this);
    }

    public static boolean f() {
        return ExtensionRegistryLite.b;
    }

    // 去混淆评级： 低(20)
    public static ExtensionRegistryLite g() {
        return ExtensionRegistryLite.c ? ExtensionRegistryFactory.a() : new ExtensionRegistryLite();
    }

    static Class h() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        }
        catch(ClassNotFoundException unused_ex) {
            return null;
        }
    }

    public static void i(boolean z) {
        ExtensionRegistryLite.b = z;
    }
}

