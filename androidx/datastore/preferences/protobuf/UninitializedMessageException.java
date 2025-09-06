package androidx.datastore.preferences.protobuf;

import j..util.DesugarCollections;
import java.util.List;

public class UninitializedMessageException extends RuntimeException {
    private final List a;
    private static final long b = 0x986022C4D65DB14DL;

    public UninitializedMessageException(MessageLite messageLite0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.a = null;
    }

    public UninitializedMessageException(List list0) {
        super(UninitializedMessageException.b(list0));
        this.a = list0;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(this.getMessage());
    }

    private static String b(List list0) {
        StringBuilder stringBuilder0 = new StringBuilder("Message missing required fields: ");
        boolean z = true;
        for(Object object0: list0) {
            if(z) {
                z = false;
            }
            else {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((String)object0));
        }
        return stringBuilder0.toString();
    }

    public List c() {
        return DesugarCollections.unmodifiableList(this.a);
    }
}

