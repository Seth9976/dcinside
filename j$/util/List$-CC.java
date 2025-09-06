package j$.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

public final class List.-CC {
    public static void $default$replaceAll(List list0, UnaryOperator unaryOperator0) {
        Objects.requireNonNull(unaryOperator0);
        ListIterator listIterator0 = list0.listIterator();
        while(listIterator0.hasNext()) {
            listIterator0.set(unaryOperator0.apply(listIterator0.next()));
        }
    }

    public static void $default$sort(List list0, Comparator comparator0) {
        Object[] arr_object = list0.toArray();
        Arrays.sort(arr_object, comparator0);
        ListIterator listIterator0 = list0.listIterator();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            listIterator0.next();
            listIterator0.set(object0);
        }
    }

    public static Spliterator $default$spliterator(List list0) {
        return list0 instanceof RandomAccess ? new a(list0) : Spliterators.spliterator(list0, 16);
    }
}

