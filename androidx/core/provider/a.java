package androidx.core.provider;

import java.util.Comparator;

public final class a implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return FontProvider.h(((byte[])object0), ((byte[])object1));
    }
}

