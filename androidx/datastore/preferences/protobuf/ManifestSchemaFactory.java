package androidx.datastore.preferences.protobuf;

final class ManifestSchemaFactory implements SchemaFactory {
    static class CompositeMessageInfoFactory implements MessageInfoFactory {
        private MessageInfoFactory[] a;

        CompositeMessageInfoFactory(MessageInfoFactory[] arr_messageInfoFactory) {
            this.a = arr_messageInfoFactory;
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public boolean isSupported(Class class0) {
            MessageInfoFactory[] arr_messageInfoFactory = this.a;
            for(int v = 0; v < arr_messageInfoFactory.length; ++v) {
                if(arr_messageInfoFactory[v].isSupported(class0)) {
                    return true;
                }
            }
            return false;
        }

        @Override  // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public MessageInfo messageInfoFor(Class class0) {
            MessageInfoFactory[] arr_messageInfoFactory = this.a;
            for(int v = 0; v < arr_messageInfoFactory.length; ++v) {
                MessageInfoFactory messageInfoFactory0 = arr_messageInfoFactory[v];
                if(messageInfoFactory0.isSupported(class0)) {
                    return messageInfoFactory0.messageInfoFor(class0);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + class0.getName());
        }
    }

    private final MessageInfoFactory a;
    private static final MessageInfoFactory b;

    static {
        ManifestSchemaFactory.b = new MessageInfoFactory() {
            @Override  // androidx.datastore.preferences.protobuf.MessageInfoFactory
            public boolean isSupported(Class class0) {
                return false;
            }

            @Override  // androidx.datastore.preferences.protobuf.MessageInfoFactory
            public MessageInfo messageInfoFor(Class class0) {
                throw new IllegalStateException("This should never be called.");
            }
        };
    }

    public ManifestSchemaFactory() {
        this(ManifestSchemaFactory.a());
    }

    private ManifestSchemaFactory(MessageInfoFactory messageInfoFactory0) {
        this.a = (MessageInfoFactory)Internal.e(messageInfoFactory0, "messageInfoFactory");
    }

    private static MessageInfoFactory a() {
        return new CompositeMessageInfoFactory(new MessageInfoFactory[]{GeneratedMessageInfoFactory.a(), ManifestSchemaFactory.b()});
    }

    private static MessageInfoFactory b() {
        try {
            return (MessageInfoFactory)Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        }
        catch(Exception unused_ex) {
            return ManifestSchemaFactory.b;
        }
    }

    private static boolean c(MessageInfo messageInfo0) {
        return messageInfo0.getSyntax() == ProtoSyntax.a;
    }

    @Override  // androidx.datastore.preferences.protobuf.SchemaFactory
    public Schema createSchema(Class class0) {
        SchemaUtil.M(class0);
        MessageInfo messageInfo0 = this.a.messageInfoFor(class0);
        if(messageInfo0.isMessageSetWireFormat()) {
            return GeneratedMessageLite.class.isAssignableFrom(class0) ? MessageSetSchema.f(SchemaUtil.S(), ExtensionSchemas.b(), messageInfo0.getDefaultInstance()) : MessageSetSchema.f(SchemaUtil.K(), ExtensionSchemas.a(), messageInfo0.getDefaultInstance());
        }
        return ManifestSchemaFactory.d(class0, messageInfo0);
    }

    private static Schema d(Class class0, MessageInfo messageInfo0) {
        if(GeneratedMessageLite.class.isAssignableFrom(class0)) {
            return ManifestSchemaFactory.c(messageInfo0) ? MessageSchema.L(class0, messageInfo0, NewInstanceSchemas.b(), ListFieldSchema.b(), SchemaUtil.S(), ExtensionSchemas.b(), MapFieldSchemas.b()) : MessageSchema.L(class0, messageInfo0, NewInstanceSchemas.b(), ListFieldSchema.b(), SchemaUtil.S(), null, MapFieldSchemas.b());
        }
        return ManifestSchemaFactory.c(messageInfo0) ? MessageSchema.L(class0, messageInfo0, NewInstanceSchemas.a(), ListFieldSchema.a(), SchemaUtil.K(), ExtensionSchemas.a(), MapFieldSchemas.a()) : MessageSchema.L(class0, messageInfo0, NewInstanceSchemas.a(), ListFieldSchema.a(), SchemaUtil.L(), null, MapFieldSchemas.a());
    }
}

