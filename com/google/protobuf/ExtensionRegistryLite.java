package com.google.protobuf;

import j..util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ExtensionRegistryLite {
    static class a {
        static final Class INSTANCE;

        static {
            a.INSTANCE = a.resolveExtensionClass();
        }

        static Class resolveExtensionClass() {
            try {
                return Class.forName("com.google.protobuf.Extension");
            }
            catch(ClassNotFoundException unused_ex) {
                return null;
            }
        }
    }

    static final class b {
        private final int number;
        private final Object object;

        b(Object object0, int v) {
            this.object = object0;
            this.number = v;
        }

        @Override
        public boolean equals(Object object0) {
            return object0 instanceof b ? this.object == ((b)object0).object && this.number == ((b)object0).number : false;
        }

        @Override
        public int hashCode() {
            return System.identityHashCode(this.object) * 0xFFFF + this.number;
        }
    }

    static final ExtensionRegistryLite EMPTY_REGISTRY_LITE = null;
    static final String EXTENSION_CLASS_NAME = "com.google.protobuf.Extension";
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile ExtensionRegistryLite emptyRegistry;
    private final Map extensionsByNumber;

    static {
        ExtensionRegistryLite.EMPTY_REGISTRY_LITE = new ExtensionRegistryLite(true);
    }

    ExtensionRegistryLite() {
        this.extensionsByNumber = new HashMap();
    }

    ExtensionRegistryLite(ExtensionRegistryLite extensionRegistryLite0) {
        if(extensionRegistryLite0 == ExtensionRegistryLite.EMPTY_REGISTRY_LITE) {
            this.extensionsByNumber = Collections.emptyMap();
            return;
        }
        this.extensionsByNumber = DesugarCollections.unmodifiableMap(extensionRegistryLite0.extensionsByNumber);
    }

    ExtensionRegistryLite(boolean z) {
        this.extensionsByNumber = Collections.emptyMap();
    }

    public final void add(ExtensionLite extensionLite0) {
        Class class0 = extensionLite0.getClass();
        if(GeneratedExtension.class.isAssignableFrom(class0)) {
            this.add(((GeneratedExtension)extensionLite0));
        }
        if(ExtensionRegistryLite.doFullRuntimeInheritanceCheck && p.isFullRegistry(this)) {
            try {
                this.getClass().getMethod("add", a.INSTANCE).invoke(this, extensionLite0);
            }
            catch(Exception exception0) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", extensionLite0), exception0);
            }
        }
    }

    public final void add(GeneratedExtension generatedMessageLite$GeneratedExtension0) {
        b extensionRegistryLite$b0 = new b(generatedMessageLite$GeneratedExtension0.getContainingTypeDefaultInstance(), generatedMessageLite$GeneratedExtension0.getNumber());
        this.extensionsByNumber.put(extensionRegistryLite$b0, generatedMessageLite$GeneratedExtension0);
    }

    public GeneratedExtension findLiteExtensionByNumber(MessageLite messageLite0, int v) {
        b extensionRegistryLite$b0 = new b(messageLite0, v);
        return (GeneratedExtension)this.extensionsByNumber.get(extensionRegistryLite$b0);
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        if(!ExtensionRegistryLite.doFullRuntimeInheritanceCheck) {
            return ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
        }
        ExtensionRegistryLite extensionRegistryLite0 = ExtensionRegistryLite.emptyRegistry;
        if(extensionRegistryLite0 == null) {
            synchronized(ExtensionRegistryLite.class) {
                extensionRegistryLite0 = ExtensionRegistryLite.emptyRegistry;
                if(extensionRegistryLite0 == null) {
                    extensionRegistryLite0 = p.createEmpty();
                    ExtensionRegistryLite.emptyRegistry = extensionRegistryLite0;
                }
            }
        }
        return extensionRegistryLite0;
    }

    public ExtensionRegistryLite getUnmodifiable() {
        return new ExtensionRegistryLite(this);
    }

    public static boolean isEagerlyParseMessageSets() {
        return ExtensionRegistryLite.eagerlyParseMessageSets;
    }

    // 去混淆评级： 低(20)
    public static ExtensionRegistryLite newInstance() {
        return ExtensionRegistryLite.doFullRuntimeInheritanceCheck ? p.create() : new ExtensionRegistryLite();
    }

    public static void setEagerlyParseMessageSets(boolean z) {
        ExtensionRegistryLite.eagerlyParseMessageSets = z;
    }
}

