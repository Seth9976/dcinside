package androidx.compose.foundation.lazy;

import y4.l;

public interface LazyListItemInfo {
    int getIndex();

    @l
    Object getKey();

    int getOffset();

    int getSize();
}

