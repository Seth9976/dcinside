package okhttp3.internal.ws;

import okio.o;
import y4.l;

public final class MessageDeflaterKt {
    @l
    private static final o EMPTY_DEFLATE_BLOCK = null;
    private static final int LAST_OCTETS_COUNT_TO_REMOVE_AFTER_DEFLATION = 4;

    static {
        MessageDeflaterKt.EMPTY_DEFLATE_BLOCK = o.d.i("000000ffff");
    }
}

