package androidx.datastore.preferences.protobuf;

final class NewInstanceSchemaLite implements NewInstanceSchema {
    @Override  // androidx.datastore.preferences.protobuf.NewInstanceSchema
    public Object newInstance(Object object0) {
        return ((GeneratedMessageLite)object0).T(MethodToInvoke.d);
    }
}

