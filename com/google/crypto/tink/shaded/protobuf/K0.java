package com.google.crypto.tink.shaded.protobuf;

class k0 implements Q0 {
    private static final k0 a;

    static {
        k0.a = new k0();
    }

    public static k0 a() {
        return k0.a;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.Q0
    public boolean isSupported(Class class0) {
        return l0.class.isAssignableFrom(class0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.Q0
    public P0 messageInfoFor(Class class0) {
        Class class1 = l0.class;
        if(class1.isAssignableFrom(class0)) {
            try {
                return (P0)l0.K1(class0.asSubclass(class1)).r1();
            }
            catch(Exception exception0) {
                throw new RuntimeException("Unable to get message info for " + class0.getName(), exception0);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + class0.getName());
    }
}

