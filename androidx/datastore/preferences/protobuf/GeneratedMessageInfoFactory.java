package androidx.datastore.preferences.protobuf;

class GeneratedMessageInfoFactory implements MessageInfoFactory {
    private static final GeneratedMessageInfoFactory a;

    static {
        GeneratedMessageInfoFactory.a = new GeneratedMessageInfoFactory();
    }

    public static GeneratedMessageInfoFactory a() {
        return GeneratedMessageInfoFactory.a;
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public boolean isSupported(Class class0) {
        return GeneratedMessageLite.class.isAssignableFrom(class0);
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public MessageInfo messageInfoFor(Class class0) {
        Class class1 = GeneratedMessageLite.class;
        if(class1.isAssignableFrom(class0)) {
            try {
                return (MessageInfo)GeneratedMessageLite.d0(class0.asSubclass(class1)).O();
            }
            catch(Exception exception0) {
                throw new RuntimeException("Unable to get message info for " + class0.getName(), exception0);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + class0.getName());
    }
}

