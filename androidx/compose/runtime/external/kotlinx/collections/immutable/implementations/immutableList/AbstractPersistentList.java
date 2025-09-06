package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nAbstractPersistentList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n41#2:61\n41#2:62\n1726#3,3:63\n*S KotlinDebug\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n*L\n18#1:61\n22#1:62\n50#1:63,3\n*E\n"})
public abstract class AbstractPersistentList extends c implements PersistentList {
    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection addAll(Collection collection0) {
        return this.addAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList addAll(int v, @l Collection collection0) {
        L.p(collection0, "c");
        Builder persistentList$Builder0 = this.builder();
        persistentList$Builder0.addAll(v, collection0);
        return persistentList$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList addAll(@l Collection collection0) {
        L.p(collection0, "elements");
        Builder persistentList$Builder0 = this.builder();
        persistentList$Builder0.addAll(collection0);
        return persistentList$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection clear() {
        return this.clear();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList clear() {
        return UtilsKt.b();
    }

    @Override  // kotlin.collections.a
    public boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    @Override  // kotlin.collections.a
    public boolean containsAll(@l Collection collection0) {
        L.p(collection0, "elements");
        if(!collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(!this.contains(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Override  // kotlin.collections.c
    @l
    public Iterator iterator() {
        return this.listIterator();
    }

    @Override  // kotlin.collections.c
    @l
    public ListIterator listIterator() {
        return this.listIterator(0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection remove(Object object0) {
        return this.remove(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList remove(Object object0) {
        int v = this.indexOf(object0);
        return v != -1 ? this.o2(v) : this;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection removeAll(Collection collection0) {
        return this.removeAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList removeAll(@l Collection collection0) {
        L.p(collection0, "elements");
        return this.e(new Function1() {
            final Collection e;

            {
                this.e = collection0;
                super(1);
            }

            @l
            public final Boolean a(Object object0) {
                return Boolean.valueOf(this.e.contains(object0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(object0);
            }
        });
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection retainAll(Collection collection0) {
        return this.retainAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList retainAll(@l Collection collection0) {
        L.p(collection0, "elements");
        return this.e(new Function1() {
            final Collection e;

            {
                this.e = collection0;
                super(1);
            }

            @l
            public final Boolean a(Object object0) {
                return Boolean.valueOf(!this.e.contains(object0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(object0);
            }
        });
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    @l
    public ImmutableList subList(int v, int v1) {
        return a.a(this, v, v1);
    }

    @Override  // kotlin.collections.c, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    public List subList(int v, int v1) {
        return this.subList(v, v1);
    }
}

