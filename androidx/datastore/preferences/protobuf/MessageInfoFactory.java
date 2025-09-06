package androidx.datastore.preferences.protobuf;

interface MessageInfoFactory {
    boolean isSupported(Class arg1);

    MessageInfo messageInfoFor(Class arg1);
}

