package androidx.compose.ui.layout;

import B3.a;
import androidx.compose.runtime.internal.StabilityInferred;
import j..lang.Iterable.-CC;
import j..util.Collection.-CC;
import j..util.Collection;
import j..util.Spliterator.Wrapper;
import j..util.Spliterator;
import j..util.stream.Stream.Wrapper;
import j..util.stream.Stream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public interface SubcomposeSlotReusePolicy {
    @StabilityInferred(parameters = 0)
    public static final class SlotIdsSet implements a, Collection, java.util.Collection {
        @l
        private final Set a;
        public static final int b = 8;

        static {
        }

        public SlotIdsSet() {
            this(null, 1, null);
        }

        public SlotIdsSet(@l Set set0) {
            L.p(set0, "set");
            super();
            this.a = set0;
        }

        public SlotIdsSet(Set set0, int v, w w0) {
            if((v & 1) != 0) {
                set0 = new LinkedHashSet();
            }
            this(set0);
        }

        public final boolean a(@m Object object0) {
            return this.a.add(object0);
        }

        @Override
        public boolean add(Object object0) {
            return this.a(object0);
        }

        @Override
        public boolean addAll(java.util.Collection collection0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public int b() {
            return this.a.size();
        }

        public final boolean c(@l Function1 function10) {
            L.p(function10, "predicate");
            return u.G0(this.a, function10);
        }

        @Override
        public final void clear() {
            this.a.clear();
        }

        @Override
        public boolean contains(@m Object object0) {
            return this.a.contains(object0);
        }

        @Override
        public boolean containsAll(@l java.util.Collection collection0) {
            L.p(collection0, "elements");
            return this.a.containsAll(collection0);
        }

        public final boolean d(@l Function1 function10) {
            L.p(function10, "predicate");
            return u.Q0(this.a, function10);
        }

        @Override  // j$.util.Collection
        public void forEach(Consumer consumer0) {
            Iterable.-CC.$default$forEach(this, consumer0);
        }

        @Override
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override
        @l
        public Iterator iterator() {
            return this.a.iterator();
        }

        @Override  // j$.util.Collection
        public Stream parallelStream() {
            return Collection.-CC.$default$parallelStream(this);
        }

        @Override
        public java.util.stream.Stream parallelStream() {
            return Stream.Wrapper.convert(this.parallelStream());
        }

        @Override
        public final boolean remove(@m Object object0) {
            return this.a.remove(object0);
        }

        @Override
        public final boolean removeAll(@l java.util.Collection collection0) {
            L.p(collection0, "slotIds");
            return this.a.remove(collection0);
        }

        @Override  // j$.util.Collection
        public boolean removeIf(Predicate predicate0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public final boolean retainAll(@l java.util.Collection collection0) {
            L.p(collection0, "slotIds");
            return this.a.retainAll(collection0);
        }

        @Override
        public final int size() {
            return this.b();
        }

        @Override  // j$.util.Collection
        public Spliterator spliterator() {
            return Collection.-CC.$default$spliterator(this);
        }

        @Override
        public java.util.Spliterator spliterator() {
            return Spliterator.Wrapper.convert(this.spliterator());
        }

        @Override  // j$.util.Collection
        public Stream stream() {
            return Collection.-CC.$default$stream(this);
        }

        @Override
        public java.util.stream.Stream stream() {
            return Stream.Wrapper.convert(this.stream());
        }

        @Override
        public Object[] toArray() {
            return v.a(this);
        }

        @Override  // j$.util.Collection
        public Object[] toArray(IntFunction intFunction0) {
            return Collection.-CC.$default$toArray(this, intFunction0);
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            L.p(arr_object, "array");
            return v.b(this, arr_object);
        }
    }

    void a(@l SlotIdsSet arg1);

    boolean b(@m Object arg1, @m Object arg2);
}

