package j$.util.stream;

import j..util.e;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector.Characteristics;

public abstract class Z2 {
    public static Set a(Set set0) {
        Characteristics collector$Characteristics3;
        Collector.Characteristics collector$Characteristics2;
        Collector.Characteristics collector$Characteristics1;
        Characteristics collector$Characteristics0;
        if(set0 != null && !set0.isEmpty()) {
            Set set1 = new HashSet();
            Object object0 = set0.iterator().next();
            if(object0 instanceof Characteristics) {
                for(Object object1: set0) {
                    try {
                        collector$Characteristics0 = (Characteristics)object1;
                    }
                    catch(ClassCastException classCastException0) {
                        e.a("java.util.stream.Collector.Characteristics", classCastException0);
                        throw null;
                    }
                    if(collector$Characteristics0 == null) {
                        collector$Characteristics1 = null;
                    }
                    else if(collector$Characteristics0 == Characteristics.CONCURRENT) {
                        collector$Characteristics1 = Collector.Characteristics.CONCURRENT;
                    }
                    else {
                        collector$Characteristics1 = collector$Characteristics0 == Characteristics.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
                    }
                    ((HashSet)set1).add(collector$Characteristics1);
                }
                return set1;
            }
            if(object0 instanceof Collector.Characteristics) {
                for(Object object2: set0) {
                    try {
                        collector$Characteristics2 = (Collector.Characteristics)object2;
                    }
                    catch(ClassCastException classCastException1) {
                        e.a("java.util.stream.Collector.Characteristics", classCastException1);
                        throw null;
                    }
                    if(collector$Characteristics2 == null) {
                        collector$Characteristics3 = null;
                    }
                    else if(collector$Characteristics2 == Collector.Characteristics.CONCURRENT) {
                        collector$Characteristics3 = Characteristics.CONCURRENT;
                    }
                    else {
                        collector$Characteristics3 = collector$Characteristics2 == Collector.Characteristics.UNORDERED ? Characteristics.UNORDERED : Characteristics.IDENTITY_FINISH;
                    }
                    ((HashSet)set1).add(collector$Characteristics3);
                }
                return set1;
            }
            e.a("java.util.stream.Collector.Characteristics", object0.getClass());
            throw null;
        }
        return set0;
    }
}

