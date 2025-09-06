package j$.util;

import java.util.Comparator;
import java.util.List;

public final class List.-EL {
    public static void sort(List list0, Comparator comparator0) {
        if(list0 instanceof j..util.List) {
            ((j..util.List)list0).sort(comparator0);
            return;
        }
        List.-CC.$default$sort(list0, comparator0);
    }
}

