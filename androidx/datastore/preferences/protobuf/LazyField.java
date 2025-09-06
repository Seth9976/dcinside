package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map.Entry;

public class LazyField extends LazyFieldLite {
    static class LazyEntry implements Map.Entry {
        private Map.Entry a;

        private LazyEntry(Map.Entry map$Entry0) {
            this.a = map$Entry0;
        }

        LazyEntry(Map.Entry map$Entry0, androidx.datastore.preferences.protobuf.LazyField.1 lazyField$10) {
            this(map$Entry0);
        }

        public LazyField a() {
            return (LazyField)this.a.getValue();
        }

        @Override
        public Object getKey() {
            return this.a.getKey();
        }

        @Override
        public Object getValue() {
            LazyField lazyField0 = (LazyField)this.a.getValue();
            return lazyField0 == null ? null : lazyField0.p();
        }

        @Override
        public Object setValue(Object object0) {
            if(!(object0 instanceof MessageLite)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            return ((LazyField)this.a.getValue()).m(((MessageLite)object0));
        }
    }

    static class LazyIterator implements Iterator {
        private Iterator a;

        public LazyIterator(Iterator iterator0) {
            this.a = iterator0;
        }

        public Map.Entry a() {
            Object object0 = this.a.next();
            return ((Map.Entry)object0).getValue() instanceof LazyField ? new LazyEntry(((Map.Entry)object0), null) : ((Map.Entry)object0);
        }

        @Override
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override
        public Object next() {
            return this.a();
        }

        @Override
        public void remove() {
            this.a.remove();
        }
    }

    private final MessageLite f;

    public LazyField(MessageLite messageLite0, ExtensionRegistryLite extensionRegistryLite0, ByteString byteString0) {
        super(extensionRegistryLite0, byteString0);
        this.f = messageLite0;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyFieldLite
    public boolean c() {
        return super.c() || this.c == this.f;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyFieldLite
    public boolean equals(Object object0) {
        return this.p().equals(object0);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyFieldLite
    public int hashCode() {
        return this.p().hashCode();
    }

    public MessageLite p() {
        return this.g(this.f);
    }

    @Override
    public String toString() {
        return this.p().toString();
    }

    class androidx.datastore.preferences.protobuf.LazyField.1 {
    }

}

