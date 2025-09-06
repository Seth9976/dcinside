package com.google.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

@k
public abstract class ByteString implements Serializable, Iterable {
    public interface ByteIterator extends Iterator {
        byte nextByte();
    }

    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY;
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        static {
            Output.EMPTY_BYTE_ARRAY = new byte[0];
        }

        Output(int v) {
            if(v < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.initialCapacity = v;
            this.flushedBuffers = new ArrayList();
            this.buffer = new byte[v];
        }

        private void flushFullBuffer(int v) {
            i byteString$i0 = new i(this.buffer);
            this.flushedBuffers.add(byteString$i0);
            int v1 = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = v1;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(v, v1 >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int v = this.bufferPos;
            byte[] arr_b = this.buffer;
            if(v >= arr_b.length) {
                i byteString$i1 = new i(this.buffer);
                this.flushedBuffers.add(byteString$i1);
                this.buffer = Output.EMPTY_BYTE_ARRAY;
            }
            else if(v > 0) {
                i byteString$i0 = new i(Arrays.copyOf(arr_b, v));
                this.flushedBuffers.add(byteString$i0);
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public void reset() {
            synchronized(this) {
                this.flushedBuffers.clear();
                this.flushedBuffersTotalBytes = 0;
                this.bufferPos = 0;
            }
        }

        public int size() {
            synchronized(this) {
            }
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public ByteString toByteString() {
            synchronized(this) {
                this.flushLastBuffer();
                return ByteString.copyFrom(this.flushedBuffers);
            }
        }

        @Override
        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.size());
        }

        @Override
        public void write(int v) {
            synchronized(this) {
                if(this.bufferPos == this.buffer.length) {
                    this.flushFullBuffer(1);
                }
                int v2 = this.bufferPos;
                this.bufferPos = v2 + 1;
                this.buffer[v2] = (byte)v;
            }
        }

        @Override
        public void write(byte[] arr_b, int v, int v1) {
            synchronized(this) {
                byte[] arr_b1 = this.buffer;
                int v3 = this.bufferPos;
                if(v1 <= arr_b1.length - v3) {
                    System.arraycopy(arr_b, v, arr_b1, v3, v1);
                    this.bufferPos += v1;
                }
                else {
                    int v4 = arr_b1.length - v3;
                    System.arraycopy(arr_b, v, arr_b1, v3, v4);
                    int v5 = v1 - v4;
                    this.flushFullBuffer(v5);
                    System.arraycopy(arr_b, v + v4, this.buffer, 0, v5);
                    this.bufferPos = v5;
                }
            }
        }

        public void writeTo(OutputStream outputStream0) throws IOException {
            int v2;
            byte[] arr_b;
            ByteString[] arr_byteString;
            synchronized(this) {
                arr_byteString = (ByteString[])this.flushedBuffers.toArray(new ByteString[0]);
                arr_b = this.buffer;
                v2 = this.bufferPos;
            }
            for(int v1 = 0; v1 < arr_byteString.length; ++v1) {
                arr_byteString[v1].writeTo(outputStream0);
            }
            outputStream0.write(Arrays.copyOf(arr_b, v2));
        }
    }

    class b implements Comparator {
        b() {
            super();
        }

        public int compare(ByteString byteString0, ByteString byteString1) {
            ByteIterator byteString$ByteIterator0 = byteString0.iterator();
            ByteIterator byteString$ByteIterator1 = byteString1.iterator();
            while(byteString$ByteIterator0.hasNext() && byteString$ByteIterator1.hasNext()) {
                int v = ByteString.access$200(byteString$ByteIterator0.nextByte()).compareTo(ByteString.access$200(byteString$ByteIterator1.nextByte()));
                if(v != 0) {
                    return v;
                }
                if(false) {
                    break;
                }
            }
            return byteString0.size().compareTo(byteString1.size());
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.compare(((ByteString)object0), ((ByteString)object1));
        }
    }

    static abstract class c implements ByteIterator {
        public final Byte next() {
            return this.nextByte();
        }

        @Override
        public Object next() {
            return this.next();
        }

        @Override
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static final class d implements f {
        private d() {
        }

        d(a byteString$a0) {
        }

        @Override  // com.google.protobuf.ByteString$f
        public byte[] copyFrom(byte[] arr_b, int v, int v1) {
            return Arrays.copyOfRange(arr_b, v, v1 + v);
        }
    }

    static final class e extends i {
        private final int bytesLength;
        private final int bytesOffset;
        private static final long serialVersionUID = 1L;

        e(byte[] arr_b, int v, int v1) {
            super(arr_b);
            ByteString.checkRange(v, v + v1, arr_b.length);
            this.bytesOffset = v;
            this.bytesLength = v1;
        }

        @Override  // com.google.protobuf.ByteString$i
        public byte byteAt(int v) {
            ByteString.checkIndex(v, this.size());
            return this.bytes[this.bytesOffset + v];
        }

        @Override  // com.google.protobuf.ByteString$i
        protected void copyToInternal(byte[] arr_b, int v, int v1, int v2) {
            System.arraycopy(this.bytes, this.getOffsetIntoBytes() + v, arr_b, v1, v2);
        }

        @Override  // com.google.protobuf.ByteString$i
        protected int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        @Override  // com.google.protobuf.ByteString$i
        byte internalByteAt(int v) {
            return this.bytes[this.bytesOffset + v];
        }

        private void readObject(ObjectInputStream objectInputStream0) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override  // com.google.protobuf.ByteString$i
        public int size() {
            return this.bytesLength;
        }

        Object writeReplace() {
            return ByteString.wrap(this.toByteArray());
        }
    }

    interface f {
        byte[] copyFrom(byte[] arg1, int arg2, int arg3);
    }

    static final class g {
        private final byte[] buffer;
        private final CodedOutputStream output;

        private g(int v) {
            byte[] arr_b = new byte[v];
            this.buffer = arr_b;
            this.output = CodedOutputStream.newInstance(arr_b);
        }

        g(int v, a byteString$a0) {
            this(v);
        }

        public ByteString build() {
            this.output.checkNoSpaceLeft();
            return new i(this.buffer);
        }

        public CodedOutputStream getCodedOutput() {
            return this.output;
        }
    }

    static abstract class h extends ByteString {
        private static final long serialVersionUID = 1L;

        abstract boolean equalsRange(ByteString arg1, int arg2, int arg3);

        @Override  // com.google.protobuf.ByteString
        protected final int getTreeDepth() {
            return 0;
        }

        @Override  // com.google.protobuf.ByteString
        protected final boolean isBalanced() {
            return true;
        }

        @Override  // com.google.protobuf.ByteString
        public Iterator iterator() {
            return super.iterator();
        }

        @Override  // com.google.protobuf.ByteString
        void writeToReverse(ByteOutput byteOutput0) throws IOException {
            this.writeTo(byteOutput0);
        }
    }

    static class i extends h {
        protected final byte[] bytes;
        private static final long serialVersionUID = 1L;

        i(byte[] arr_b) {
            arr_b.getClass();
            this.bytes = arr_b;
        }

        @Override  // com.google.protobuf.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, this.getOffsetIntoBytes(), this.size()).asReadOnlyBuffer();
        }

        @Override  // com.google.protobuf.ByteString
        public final List asReadOnlyByteBufferList() {
            return Collections.singletonList(this.asReadOnlyByteBuffer());
        }

        @Override  // com.google.protobuf.ByteString
        public byte byteAt(int v) {
            return this.bytes[v];
        }

        @Override  // com.google.protobuf.ByteString
        public final void copyTo(ByteBuffer byteBuffer0) {
            byteBuffer0.put(this.bytes, this.getOffsetIntoBytes(), this.size());
        }

        @Override  // com.google.protobuf.ByteString
        protected void copyToInternal(byte[] arr_b, int v, int v1, int v2) {
            System.arraycopy(this.bytes, v, arr_b, v1, v2);
        }

        @Override  // com.google.protobuf.ByteString
        public final boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            if(!(object0 instanceof ByteString)) {
                return false;
            }
            if(this.size() != ((ByteString)object0).size()) {
                return false;
            }
            if(this.size() == 0) {
                return true;
            }
            if(object0 instanceof i) {
                int v = this.peekCachedHashCode();
                int v1 = ((i)object0).peekCachedHashCode();
                return v == 0 || v1 == 0 || v == v1 ? this.equalsRange(((i)object0), 0, this.size()) : false;
            }
            return object0.equals(this);
        }

        @Override  // com.google.protobuf.ByteString$h
        final boolean equalsRange(ByteString byteString0, int v, int v1) {
            if(v1 > byteString0.size()) {
                throw new IllegalArgumentException("Length too large: " + v1 + this.size());
            }
            int v2 = v + v1;
            if(v2 > byteString0.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + v + ", " + v1 + ", " + byteString0.size());
            }
            if(byteString0 instanceof i) {
                byte[] arr_b = this.bytes;
                byte[] arr_b1 = ((i)byteString0).bytes;
                int v3 = this.getOffsetIntoBytes();
                int v4 = this.getOffsetIntoBytes();
                for(int v5 = ((i)byteString0).getOffsetIntoBytes() + v; v4 < v3 + v1; ++v5) {
                    if(arr_b[v4] != arr_b1[v5]) {
                        return false;
                    }
                    ++v4;
                }
                return true;
            }
            return byteString0.substring(v, v2).equals(this.substring(0, v1));
        }

        protected int getOffsetIntoBytes() {
            return 0;
        }

        @Override  // com.google.protobuf.ByteString
        byte internalByteAt(int v) {
            return this.bytes[v];
        }

        @Override  // com.google.protobuf.ByteString
        public final boolean isValidUtf8() {
            int v = this.getOffsetIntoBytes();
            return k0.isValidUtf8(this.bytes, v, this.size() + v);
        }

        @Override  // com.google.protobuf.ByteString
        public final CodedInputStream newCodedInput() {
            return CodedInputStream.newInstance(this.bytes, this.getOffsetIntoBytes(), this.size(), true);
        }

        @Override  // com.google.protobuf.ByteString
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, this.getOffsetIntoBytes(), this.size());
        }

        @Override  // com.google.protobuf.ByteString
        protected final int partialHash(int v, int v1, int v2) {
            return Internal.partialHash(v, this.bytes, this.getOffsetIntoBytes() + v1, v2);
        }

        @Override  // com.google.protobuf.ByteString
        protected final int partialIsValidUtf8(int v, int v1, int v2) {
            int v3 = this.getOffsetIntoBytes();
            return k0.partialIsValidUtf8(v, this.bytes, v3 + v1, v2 + (v3 + v1));
        }

        @Override  // com.google.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override  // com.google.protobuf.ByteString
        public final ByteString substring(int v, int v1) {
            int v2 = ByteString.checkRange(v, v1, this.size());
            return v2 == 0 ? ByteString.EMPTY : new e(this.bytes, this.getOffsetIntoBytes() + v, v2);
        }

        @Override  // com.google.protobuf.ByteString
        protected final String toStringInternal(Charset charset0) {
            return new String(this.bytes, this.getOffsetIntoBytes(), this.size(), charset0);
        }

        @Override  // com.google.protobuf.ByteString
        final void writeTo(ByteOutput byteOutput0) throws IOException {
            byteOutput0.writeLazy(this.bytes, this.getOffsetIntoBytes(), this.size());
        }

        @Override  // com.google.protobuf.ByteString
        public final void writeTo(OutputStream outputStream0) throws IOException {
            outputStream0.write(this.toByteArray());
        }

        @Override  // com.google.protobuf.ByteString
        final void writeToInternal(OutputStream outputStream0, int v, int v1) throws IOException {
            outputStream0.write(this.bytes, this.getOffsetIntoBytes() + v, v1);
        }
    }

    static final class j implements f {
        private j() {
        }

        j(a byteString$a0) {
        }

        @Override  // com.google.protobuf.ByteString$f
        public byte[] copyFrom(byte[] arr_b, int v, int v1) {
            byte[] arr_b1 = new byte[v1];
            System.arraycopy(arr_b, v, arr_b1, 0, v1);
            return arr_b1;
        }
    }

    static final int CONCATENATE_BY_COPY_SIZE = 0x80;
    public static final ByteString EMPTY = null;
    static final int MAX_READ_FROM_CHUNK_SIZE = 0x2000;
    static final int MIN_READ_FROM_CHUNK_SIZE = 0x100;
    private static final int UNSIGNED_BYTE_MASK = 0xFF;
    private static final Comparator UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = null;
    private static final f byteArrayCopier = null;
    private int hash;
    private static final long serialVersionUID = 1L;

    static {
        ByteString.EMPTY = new i(Internal.EMPTY_BYTE_ARRAY);
        ByteString.byteArrayCopier = new d(null);
        ByteString.UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new b();
    }

    ByteString() {
        this.hash = 0;
    }

    static int access$200(byte b) {
        return b & 0xFF;
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List asReadOnlyByteBufferList();

    private static ByteString balancedConcat(Iterator iterator0, int v) {
        if(v < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", v));
        }
        return v == 1 ? iterator0.next() : ByteString.balancedConcat(iterator0, v >>> 1).concat(ByteString.balancedConcat(iterator0, v - (v >>> 1)));
    }

    public abstract byte byteAt(int arg1);

    static void checkIndex(int v, int v1) {
        if((v1 - (v + 1) | v) < 0) {
            throw v >= 0 ? new ArrayIndexOutOfBoundsException("Index > length: " + v + ", " + v1) : new ArrayIndexOutOfBoundsException("Index < 0: " + v);
        }
    }

    @com.google.protobuf.j
    static int checkRange(int v, int v1, int v2) {
        int v3 = v1 - v;
        if((v | v1 | v3 | v2 - v1) < 0) {
            if(v < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + v + " < 0");
            }
            throw v1 >= v ? new IndexOutOfBoundsException("End index: " + v1 + " >= " + v2) : new IndexOutOfBoundsException("Beginning index larger than ending index: " + v + ", " + v1);
        }
        return v3;
    }

    public final ByteString concat(ByteString byteString0) {
        if(0x7FFFFFFF - this.size() < byteString0.size()) {
            throw new IllegalArgumentException("ByteString would be too long: " + this.size() + "+" + byteString0.size());
        }
        return b0.concatenate(this, byteString0);
    }

    public static ByteString copyFrom(Iterable iterable0) {
        int v;
        if(!(iterable0 instanceof Collection)) {
            v = 0;
            Iterator iterator0 = iterable0.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                ++v;
            }
            return v == 0 ? ByteString.EMPTY : ByteString.balancedConcat(iterable0.iterator(), v);
        }
        v = ((Collection)iterable0).size();
        return v == 0 ? ByteString.EMPTY : ByteString.balancedConcat(iterable0.iterator(), v);
    }

    public static ByteString copyFrom(String s, String s1) throws UnsupportedEncodingException {
        return new i(s.getBytes(s1));
    }

    public static ByteString copyFrom(String s, Charset charset0) {
        return new i(s.getBytes(charset0));
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer0) {
        return ByteString.copyFrom(byteBuffer0, byteBuffer0.remaining());
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer0, int v) {
        ByteString.checkRange(0, v, byteBuffer0.remaining());
        byte[] arr_b = new byte[v];
        byteBuffer0.get(arr_b);
        return new i(arr_b);
    }

    public static ByteString copyFrom(byte[] arr_b) {
        return ByteString.copyFrom(arr_b, 0, arr_b.length);
    }

    public static ByteString copyFrom(byte[] arr_b, int v, int v1) {
        ByteString.checkRange(v, v + v1, arr_b.length);
        return new i(ByteString.byteArrayCopier.copyFrom(arr_b, v, v1));
    }

    public static ByteString copyFromUtf8(String s) {
        return new i(s.getBytes(Internal.UTF_8));
    }

    public abstract void copyTo(ByteBuffer arg1);

    public void copyTo(byte[] arr_b, int v) {
        this.copyTo(arr_b, 0, v, this.size());
    }

    @Deprecated
    public final void copyTo(byte[] arr_b, int v, int v1, int v2) {
        ByteString.checkRange(v, v + v2, this.size());
        ByteString.checkRange(v1, v1 + v2, arr_b.length);
        if(v2 > 0) {
            this.copyToInternal(arr_b, v, v1, v2);
        }
    }

    protected abstract void copyToInternal(byte[] arg1, int arg2, int arg3, int arg4);

    public static final ByteString empty() {
        return ByteString.EMPTY;
    }

    public final boolean endsWith(ByteString byteString0) {
        return this.size() >= byteString0.size() && this.substring(this.size() - byteString0.size()).equals(byteString0);
    }

    @Override
    public abstract boolean equals(Object arg1);

    private static int extractHexDigit(String s, int v) {
        int v1 = ByteString.hexDigit(s.charAt(v));
        if(v1 == -1) {
            throw new NumberFormatException("Invalid hexString " + s + " must only contain [0-9a-fA-F] but contained " + s.charAt(v) + " at index " + v);
        }
        return v1;
    }

    public static ByteString fromHex(@n String s) {
        if(s.length() % 2 != 0) {
            throw new NumberFormatException("Invalid hexString " + s + " of length " + s.length() + " must be even.");
        }
        int v = s.length();
        byte[] arr_b = new byte[v / 2];
        for(int v1 = 0; v1 < v / 2; ++v1) {
            int v2 = ByteString.extractHexDigit(s, v1 * 2);
            arr_b[v1] = (byte)(ByteString.extractHexDigit(s, v1 * 2 + 1) | v2 << 4);
        }
        return new i(arr_b);
    }

    protected abstract int getTreeDepth();

    @Override
    public final int hashCode() {
        int v = this.hash;
        if(v == 0) {
            int v1 = this.size();
            v = this.partialHash(v1, 0, v1);
            if(v == 0) {
                v = 1;
            }
            this.hash = v;
        }
        return v;
    }

    private static int hexDigit(char c) {
        if(c >= 0x30 && c <= 57) {
            return c - 0x30;
        }
        if(c >= 65 && c <= 70) {
            return c - 55;
        }
        return c < 97 || c > 102 ? -1 : c - 87;
    }

    abstract byte internalByteAt(int arg1);

    protected abstract boolean isBalanced();

    public final boolean isEmpty() {
        return this.size() == 0;
    }

    public abstract boolean isValidUtf8();

    public ByteIterator iterator() {
        class a extends c {
            private final int limit;
            private int position;

            a() {
                this.position = 0;
                this.limit = byteString0.size();
            }

            @Override
            public boolean hasNext() {
                return this.position < this.limit;
            }

            @Override  // com.google.protobuf.ByteString$ByteIterator
            public byte nextByte() {
                int v = this.position;
                if(v >= this.limit) {
                    throw new NoSuchElementException();
                }
                this.position = v + 1;
                return ByteString.this.internalByteAt(v);
            }
        }

        return new a(this);
    }

    @Override
    public Iterator iterator() {
        return this.iterator();
    }

    static g newCodedBuilder(int v) {
        return new g(v, null);
    }

    public abstract CodedInputStream newCodedInput();

    public abstract InputStream newInput();

    public static Output newOutput() {
        return new Output(0x80);
    }

    public static Output newOutput(int v) {
        return new Output(v);
    }

    protected abstract int partialHash(int arg1, int arg2, int arg3);

    protected abstract int partialIsValidUtf8(int arg1, int arg2, int arg3);

    protected final int peekCachedHashCode() {
        return this.hash;
    }

    private static ByteString readChunk(InputStream inputStream0, int v) throws IOException {
        byte[] arr_b = new byte[v];
        int v1;
        for(v1 = 0; v1 < v; v1 += v2) {
            int v2 = inputStream0.read(arr_b, v1, v - v1);
            if(v2 == -1) {
                break;
            }
        }
        return v1 == 0 ? null : ByteString.copyFrom(arr_b, 0, v1);
    }

    public static ByteString readFrom(InputStream inputStream0) throws IOException {
        return ByteString.readFrom(inputStream0, 0x100, 0x2000);
    }

    public static ByteString readFrom(InputStream inputStream0, int v) throws IOException {
        return ByteString.readFrom(inputStream0, v, v);
    }

    public static ByteString readFrom(InputStream inputStream0, int v, int v1) throws IOException {
        ArrayList arrayList0 = new ArrayList();
        ByteString byteString0;
        while((byteString0 = ByteString.readChunk(inputStream0, v)) != null) {
            arrayList0.add(byteString0);
            v = Math.min(v * 2, v1);
        }
        return ByteString.copyFrom(arrayList0);
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString0) {
        return this.size() >= byteString0.size() && this.substring(0, byteString0.size()).equals(byteString0);
    }

    public final ByteString substring(int v) {
        return this.substring(v, this.size());
    }

    public abstract ByteString substring(int arg1, int arg2);

    public final byte[] toByteArray() {
        int v = this.size();
        if(v == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] arr_b = new byte[v];
        this.copyToInternal(arr_b, 0, 0, v);
        return arr_b;
    }

    private static int toInt(byte value) [...] // Inlined contents

    @Override
    public final String toString() {
        Locale locale0 = Locale.ROOT;
        String s = this.truncateAndEscapeForDisplay();
        return String.format(locale0, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), this.size(), s);
    }

    public final String toString(String s) throws UnsupportedEncodingException {
        try {
            return this.toString(Charset.forName(s));
        }
        catch(UnsupportedCharsetException unsupportedCharsetException0) {
            UnsupportedEncodingException unsupportedEncodingException0 = new UnsupportedEncodingException(s);
            unsupportedEncodingException0.initCause(unsupportedCharsetException0);
            throw unsupportedEncodingException0;
        }
    }

    public final String toString(Charset charset0) {
        return this.size() == 0 ? "" : this.toStringInternal(charset0);
    }

    protected abstract String toStringInternal(Charset arg1);

    public final String toStringUtf8() {
        return this.toString(Internal.UTF_8);
    }

    private String truncateAndEscapeForDisplay() {
        return this.size() > 50 ? g0.escapeBytes(this.substring(0, 0x2F)) + "..." : g0.escapeBytes(this);
    }

    public static Comparator unsignedLexicographicalComparator() {
        return ByteString.UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    static ByteString wrap(ByteBuffer byteBuffer0) {
        if(byteBuffer0.hasArray()) {
            int v = byteBuffer0.arrayOffset();
            return ByteString.wrap(byteBuffer0.array(), v + byteBuffer0.position(), byteBuffer0.remaining());
        }
        return new U(byteBuffer0);
    }

    static ByteString wrap(byte[] arr_b) {
        return new i(arr_b);
    }

    static ByteString wrap(byte[] arr_b, int v, int v1) {
        return new e(arr_b, v, v1);
    }

    abstract void writeTo(ByteOutput arg1) throws IOException;

    public abstract void writeTo(OutputStream arg1) throws IOException;

    final void writeTo(OutputStream outputStream0, int v, int v1) throws IOException {
        ByteString.checkRange(v, v + v1, this.size());
        if(v1 > 0) {
            this.writeToInternal(outputStream0, v, v1);
        }
    }

    abstract void writeToInternal(OutputStream arg1, int arg2, int arg3) throws IOException;

    abstract void writeToReverse(ByteOutput arg1) throws IOException;
}

