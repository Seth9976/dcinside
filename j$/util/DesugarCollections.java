package j$.util;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

public class DesugarCollections {
    public static Collection synchronizedCollection(Collection collection0) {
        return new f(collection0);
    }

    public static List synchronizedList(List list0) {
        return list0 instanceof RandomAccess ? new i(list0) : new g(list0);  // 初始化器: Lj$/util/g;-><init>(Ljava/util/List;)V
    }

    public static Map synchronizedMap(Map map0) {
        return new h(map0);
    }

    public static Set synchronizedSet(Set set0) {
        return new j(set0);  // 初始化器: Lj$/util/f;-><init>(Ljava/util/Collection;)V
    }

    public static Collection unmodifiableCollection(Collection collection0) {
        return new l(collection0);
    }

    public static List unmodifiableList(List list0) {
        return list0 instanceof RandomAccess ? new t(list0) : new n(list0);  // 初始化器: Lj$/util/n;-><init>(Ljava/util/List;)V
    }

    public static Map unmodifiableMap(Map map0) {
        return new s(map0);
    }

    public static Set unmodifiableSet(Set set0) {
        return new u(set0);  // 初始化器: Lj$/util/l;-><init>(Ljava/util/Collection;)V
    }

    public static SortedMap unmodifiableSortedMap(SortedMap sortedMap0) {
        return new v(sortedMap0);
    }

    public static SortedSet unmodifiableSortedSet(SortedSet sortedSet0) {
        return new w(sortedSet0);
    }
}

