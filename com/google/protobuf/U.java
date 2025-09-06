package com.google.protobuf;

class u implements L {
    private static final u instance;

    static {
        u.instance = new u();
    }

    public static u getInstance() {
        return u.instance;
    }

    @Override  // com.google.protobuf.L
    public boolean isSupported(Class class0) {
        return GeneratedMessageLite.class.isAssignableFrom(class0);
    }

    @Override  // com.google.protobuf.L
    public K messageInfoFor(Class class0) {
        Class class1 = GeneratedMessageLite.class;
        if(class1.isAssignableFrom(class0)) {
            try {
                return (K)GeneratedMessageLite.getDefaultInstance(class0.asSubclass(class1)).buildMessageInfo();
            }
            catch(Exception exception0) {
                throw new RuntimeException("Unable to get message info for " + class0.getName(), exception0);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + class0.getName());
    }
}

