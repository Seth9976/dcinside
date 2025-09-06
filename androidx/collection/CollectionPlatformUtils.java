package androidx.collection;

import y4.l;

public final class CollectionPlatformUtils {
    @l
    public static final CollectionPlatformUtils a;

    static {
        CollectionPlatformUtils.a = new CollectionPlatformUtils();
    }

    @l
    public final IndexOutOfBoundsException a() {
        return new ArrayIndexOutOfBoundsException();
    }
}

