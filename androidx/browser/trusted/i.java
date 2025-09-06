package androidx.browser.trusted;

import java.util.Comparator;

public final class i implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return TokenContents.b(((byte[])object0), ((byte[])object1));
    }
}

