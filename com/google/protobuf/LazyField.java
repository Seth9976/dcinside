package com.google.protobuf;

import java.util.Iterator;
import java.util.Map.Entry;

public class LazyField extends LazyFieldLite {
    static class a {
    }

    static class b implements Map.Entry {
        private Map.Entry entry;

        private b(Map.Entry map$Entry0) {
            this.entry = map$Entry0;
        }

        b(Map.Entry map$Entry0, a lazyField$a0) {
            this(map$Entry0);
        }

        public LazyField getField() {
            return (LazyField)this.entry.getValue();
        }

        @Override
        public Object getKey() {
            return this.entry.getKey();
        }

        @Override
        public Object getValue() {
            LazyField lazyField0 = (LazyField)this.entry.getValue();
            return lazyField0 == null ? null : lazyField0.getValue();
        }

        @Override
        public Object setValue(Object object0) {
            if(!(object0 instanceof MessageLite)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            return ((LazyField)this.entry.getValue()).setValue(((MessageLite)object0));
        }
    }

    static class c implements Iterator {
        private Iterator iterator;

        public c(Iterator iterator0) {
            this.iterator = iterator0;
        }

        @Override
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override
        public Object next() {
            return this.next();
        }

        public Map.Entry next() {
            Object object0 = this.iterator.next();
            return ((Map.Entry)object0).getValue() instanceof LazyField ? new b(((Map.Entry)object0), null) : ((Map.Entry)object0);
        }

        @Override
        public void remove() {
            this.iterator.remove();
        }
    }

    private final MessageLite defaultInstance;

    public LazyField(MessageLite messageLite0, ExtensionRegistryLite extensionRegistryLite0, ByteString byteString0) {
        super(extensionRegistryLite0, byteString0);
        this.defaultInstance = messageLite0;
    }

    @Override  // com.google.protobuf.LazyFieldLite
    public boolean containsDefaultInstance() {
        return super.containsDefaultInstance() || this.value == this.defaultInstance;
    }

    @Override  // com.google.protobuf.LazyFieldLite
    public boolean equals(Object object0) {
        return this.getValue().equals(object0);
    }

    public MessageLite getValue() {
        return this.getValue(this.defaultInstance);
    }

    @Override  // com.google.protobuf.LazyFieldLite
    public int hashCode() {
        return this.getValue().hashCode();
    }

    @Override
    public String toString() {
        return this.getValue().toString();
    }
}

