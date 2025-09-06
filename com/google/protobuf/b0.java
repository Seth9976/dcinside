package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class b0 extends ByteString {
    static class b {
        private final ArrayDeque prefixesStack;

        private b() {
            this.prefixesStack = new ArrayDeque();
        }

        b(a b0$a0) {
        }

        private ByteString balance(ByteString byteString0, ByteString byteString1) {
            this.doBalance(byteString0);
            this.doBalance(byteString1);
            ByteString byteString2;
            for(byteString2 = (ByteString)this.prefixesStack.pop(); !this.prefixesStack.isEmpty(); byteString2 = new b0(((ByteString)this.prefixesStack.pop()), byteString2, null)) {
            }
            return byteString2;
        }

        private void doBalance(ByteString byteString0) {
            if(byteString0.isBalanced()) {
                this.insert(byteString0);
                return;
            }
            if(!(byteString0 instanceof b0)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString0.getClass());
            }
            this.doBalance(((b0)byteString0).left);
            this.doBalance(((b0)byteString0).right);
        }

        private int getDepthBinForLength(int v) {
            int v1 = Arrays.binarySearch(b0.minLengthByDepth, v);
            return v1 >= 0 ? v1 : -(v1 + 1) - 1;
        }

        private void insert(ByteString byteString0) {
            int v = this.getDepthBinForLength(byteString0.size());
            int v1 = b0.minLength(v + 1);
            if(!this.prefixesStack.isEmpty() && ((ByteString)this.prefixesStack.peek()).size() < v1) {
                int v2 = b0.minLength(v);
                ByteString byteString1;
                for(byteString1 = (ByteString)this.prefixesStack.pop(); !this.prefixesStack.isEmpty() && ((ByteString)this.prefixesStack.peek()).size() < v2; byteString1 = new b0(((ByteString)this.prefixesStack.pop()), byteString1, null)) {
                }
                b0 b00;
                for(b00 = new b0(byteString1, byteString0, null); !this.prefixesStack.isEmpty(); b00 = new b0(((ByteString)this.prefixesStack.pop()), b00, null)) {
                    int v3 = b0.minLength(this.getDepthBinForLength(b00.size()) + 1);
                    if(((ByteString)this.prefixesStack.peek()).size() >= v3) {
                        break;
                    }
                }
                this.prefixesStack.push(b00);
                return;
            }
            this.prefixesStack.push(byteString0);
        }
    }

    static final class c implements Iterator {
        private final ArrayDeque breadCrumbs;
        private h next;

        private c(ByteString byteString0) {
            if(byteString0 instanceof b0) {
                ArrayDeque arrayDeque0 = new ArrayDeque(((b0)byteString0).getTreeDepth());
                this.breadCrumbs = arrayDeque0;
                arrayDeque0.push(((b0)byteString0));
                this.next = this.getLeafByLeft(((b0)byteString0).left);
                return;
            }
            this.breadCrumbs = null;
            this.next = (h)byteString0;
        }

        c(ByteString byteString0, a b0$a0) {
            this(byteString0);
        }

        private h getLeafByLeft(ByteString byteString0) {
            while(byteString0 instanceof b0) {
                this.breadCrumbs.push(((b0)byteString0));
                byteString0 = ((b0)byteString0).left;
            }
            return (h)byteString0;
        }

        private h getNextNonEmptyLeaf() {
            while(this.breadCrumbs != null && !this.breadCrumbs.isEmpty()) {
                h byteString$h0 = this.getLeafByLeft(((b0)this.breadCrumbs.pop()).right);
                if(!byteString$h0.isEmpty()) {
                    return byteString$h0;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            return this.next != null;
        }

        public h next() {
            h byteString$h0 = this.next;
            if(byteString$h0 == null) {
                throw new NoSuchElementException();
            }
            this.next = this.getNextNonEmptyLeaf();
            return byteString$h0;
        }

        @Override
        public Object next() {
            return this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class d extends InputStream {
        private h currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private c pieceIterator;

        public d() {
            this.initialize();
        }

        private void advanceIfCurrentPieceFullyRead() {
            if(this.currentPiece != null) {
                int v = this.currentPieceSize;
                if(this.currentPieceIndex == v) {
                    this.currentPieceOffsetInRope += v;
                    this.currentPieceIndex = 0;
                    if(this.pieceIterator.hasNext()) {
                        h byteString$h0 = this.pieceIterator.next();
                        this.currentPiece = byteString$h0;
                        this.currentPieceSize = byteString$h0.size();
                        return;
                    }
                    this.currentPiece = null;
                    this.currentPieceSize = 0;
                }
            }
        }

        @Override
        public int available() throws IOException {
            return this.availableInternal();
        }

        private int availableInternal() {
            return b0.this.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
        }

        private void initialize() {
            c b0$c0 = new c(b0.this, null);
            this.pieceIterator = b0$c0;
            h byteString$h0 = b0$c0.next();
            this.currentPiece = byteString$h0;
            this.currentPieceSize = byteString$h0.size();
            this.currentPieceIndex = 0;
            this.currentPieceOffsetInRope = 0;
        }

        @Override
        public void mark(int v) {
            this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
        }

        @Override
        public boolean markSupported() {
            return true;
        }

        @Override
        public int read() throws IOException {
            this.advanceIfCurrentPieceFullyRead();
            h byteString$h0 = this.currentPiece;
            if(byteString$h0 == null) {
                return -1;
            }
            int v = this.currentPieceIndex;
            this.currentPieceIndex = v + 1;
            return byteString$h0.byteAt(v) & 0xFF;
        }

        @Override
        public int read(byte[] arr_b, int v, int v1) {
            arr_b.getClass();
            if(v < 0 || v1 < 0 || v1 > arr_b.length - v) {
                throw new IndexOutOfBoundsException();
            }
            int v2 = this.readSkipInternal(arr_b, v, v1);
            return v2 != 0 || v1 <= 0 && this.availableInternal() != 0 ? v2 : -1;
        }

        private int readSkipInternal(byte[] arr_b, int v, int v1) {
            int v2;
            for(v2 = v1; v2 > 0; v2 -= v3) {
                this.advanceIfCurrentPieceFullyRead();
                if(this.currentPiece == null) {
                    break;
                }
                int v3 = Math.min(this.currentPieceSize - this.currentPieceIndex, v2);
                if(arr_b != null) {
                    this.currentPiece.copyTo(arr_b, this.currentPieceIndex, v, v3);
                    v += v3;
                }
                this.currentPieceIndex += v3;
            }
            return v1 - v2;
        }

        @Override
        public void reset() {
            synchronized(this) {
                this.initialize();
                this.readSkipInternal(null, 0, this.mark);
            }
        }

        @Override
        public long skip(long v) {
            if(v < 0L) {
                throw new IndexOutOfBoundsException();
            }
            if(v > 0x7FFFFFFFL) {
                v = 0x7FFFFFFFL;
            }
            return (long)this.readSkipInternal(null, 0, ((int)v));
        }
    }

    private final ByteString left;
    private final int leftLength;
    static final int[] minLengthByDepth = null;
    private final ByteString right;
    private static final long serialVersionUID = 1L;
    private final int totalLength;
    private final int treeDepth;

    static {
        b0.minLengthByDepth = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 0x90, 0xE9, 377, 610, 987, 0x63D, 0xA18, 0x1055, 6765, 10946, 0x452F, 0x6FF1, 0xB520, 75025, 0x1DA31, 0x2FF42, 0x4D973, 0x7D8B5, 832040, 0x148ADD, 0x213D05, 0x35C7E2, 0x5704E7, 0x8CCCC9, 0xE3D1B0, 0x1709E79, 0x2547029, 0x3C50EA2, 102334155, 165580141, 0xFF80C38, 0x19D699A5, 701408733, 1134903170, 0x6D73E55F, 0x7FFFFFFF};
    }

    private b0(ByteString byteString0, ByteString byteString1) {
        this.left = byteString0;
        this.right = byteString1;
        int v = byteString0.size();
        this.leftLength = v;
        this.totalLength = v + byteString1.size();
        this.treeDepth = Math.max(byteString0.getTreeDepth(), byteString1.getTreeDepth()) + 1;
    }

    b0(ByteString byteString0, ByteString byteString1, a b0$a0) {
        this(byteString0, byteString1);
    }

    @Override  // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.toByteArray()).asReadOnlyBuffer();
    }

    @Override  // com.google.protobuf.ByteString
    public List asReadOnlyByteBufferList() {
        List list0 = new ArrayList();
        c b0$c0 = new c(this, null);
        while(b0$c0.hasNext()) {
            list0.add(b0$c0.next().asReadOnlyByteBuffer());
        }
        return list0;
    }

    @Override  // com.google.protobuf.ByteString
    public byte byteAt(int v) {
        ByteString.checkIndex(v, this.totalLength);
        return this.internalByteAt(v);
    }

    static ByteString concatenate(ByteString byteString0, ByteString byteString1) {
        if(byteString1.size() == 0) {
            return byteString0;
        }
        if(byteString0.size() == 0) {
            return byteString1;
        }
        int v = byteString0.size() + byteString1.size();
        if(v < 0x80) {
            return b0.concatenateBytes(byteString0, byteString1);
        }
        if(byteString0 instanceof b0) {
            if(((b0)byteString0).right.size() + byteString1.size() < 0x80) {
                ByteString byteString2 = b0.concatenateBytes(((b0)byteString0).right, byteString1);
                return new b0(((b0)byteString0).left, byteString2);
            }
            if(((b0)byteString0).left.getTreeDepth() > ((b0)byteString0).right.getTreeDepth() && ((b0)byteString0).getTreeDepth() > byteString1.getTreeDepth()) {
                b0 b00 = new b0(((b0)byteString0).right, byteString1);
                return new b0(((b0)byteString0).left, b00);
            }
        }
        return v >= b0.minLength(Math.max(byteString0.getTreeDepth(), byteString1.getTreeDepth()) + 1) ? new b0(byteString0, byteString1) : new b(null).balance(byteString0, byteString1);
    }

    private static ByteString concatenateBytes(ByteString byteString0, ByteString byteString1) {
        int v = byteString0.size();
        int v1 = byteString1.size();
        byte[] arr_b = new byte[v + v1];
        byteString0.copyTo(arr_b, 0, 0, v);
        byteString1.copyTo(arr_b, 0, v, v1);
        return ByteString.wrap(arr_b);
    }

    @Override  // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer0) {
        this.left.copyTo(byteBuffer0);
        this.right.copyTo(byteBuffer0);
    }

    @Override  // com.google.protobuf.ByteString
    protected void copyToInternal(byte[] arr_b, int v, int v1, int v2) {
        int v3 = this.leftLength;
        if(v + v2 <= v3) {
            this.left.copyToInternal(arr_b, v, v1, v2);
            return;
        }
        if(v >= v3) {
            this.right.copyToInternal(arr_b, v - v3, v1, v2);
            return;
        }
        int v4 = v3 - v;
        this.left.copyToInternal(arr_b, v, v1, v4);
        this.right.copyToInternal(arr_b, 0, v1 + v4, v2 - v4);
    }

    @Override  // com.google.protobuf.ByteString
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof ByteString)) {
            return false;
        }
        if(this.totalLength != ((ByteString)object0).size()) {
            return false;
        }
        if(this.totalLength == 0) {
            return true;
        }
        int v = this.peekCachedHashCode();
        int v1 = ((ByteString)object0).peekCachedHashCode();
        return v == 0 || v1 == 0 || v == v1 ? this.equalsFragments(((ByteString)object0)) : false;
    }

    private boolean equalsFragments(ByteString byteString0) {
        c b0$c0 = new c(this, null);
        Object object0 = b0$c0.next();
        h byteString$h0 = (h)object0;
        c b0$c1 = new c(byteString0, null);
        Object object1 = b0$c1.next();
        h byteString$h1 = (h)object1;
        int v = 0;
        int v1 = 0;
        int v2 = 0;
        while(true) {
            int v3 = byteString$h0.size() - v;
            int v4 = byteString$h1.size() - v1;
            int v5 = Math.min(v3, v4);
            if(!(v == 0 ? byteString$h0.equalsRange(byteString$h1, v1, v5) : byteString$h1.equalsRange(byteString$h0, v, v5))) {
                return false;
            }
            v2 += v5;
            int v6 = this.totalLength;
            if(v2 >= v6) {
                if(v2 != v6) {
                    throw new IllegalStateException();
                }
                return true;
            }
            if(v5 == v3) {
                Object object2 = b0$c0.next();
                byteString$h0 = (h)object2;
                v = 0;
            }
            else {
                v += v5;
            }
            if(v5 == v4) {
                Object object3 = b0$c1.next();
                byteString$h1 = (h)object3;
                v1 = 0;
            }
            else {
                v1 += v5;
            }
        }
    }

    @Override  // com.google.protobuf.ByteString
    protected int getTreeDepth() {
        return this.treeDepth;
    }

    @Override  // com.google.protobuf.ByteString
    byte internalByteAt(int v) {
        return v >= this.leftLength ? this.right.internalByteAt(v - this.leftLength) : this.left.internalByteAt(v);
    }

    @Override  // com.google.protobuf.ByteString
    protected boolean isBalanced() {
        int v = b0.minLength(this.treeDepth);
        return this.totalLength >= v;
    }

    @Override  // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        int v = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        return this.right.partialIsValidUtf8(v, 0, this.right.size()) == 0;
    }

    @Override  // com.google.protobuf.ByteString
    public ByteIterator iterator() {
        class a extends com.google.protobuf.ByteString.c {
            ByteIterator current;
            final c pieces;

            a() {
                this.pieces = new c(b00, null);
                this.current = this.nextPiece();
            }

            @Override
            public boolean hasNext() {
                return this.current != null;
            }

            @Override  // com.google.protobuf.ByteString$ByteIterator
            public byte nextByte() {
                ByteIterator byteString$ByteIterator0 = this.current;
                if(byteString$ByteIterator0 == null) {
                    throw new NoSuchElementException();
                }
                byte b = byteString$ByteIterator0.nextByte();
                if(!this.current.hasNext()) {
                    this.current = this.nextPiece();
                }
                return b;
            }

            // 去混淆评级： 低(20)
            private ByteIterator nextPiece() {
                return this.pieces.hasNext() ? this.pieces.next().iterator() : null;
            }
        }

        return new a(this);
    }

    @Override  // com.google.protobuf.ByteString
    public Iterator iterator() {
        return this.iterator();
    }

    static int minLength(int v) {
        return v < b0.minLengthByDepth.length ? b0.minLengthByDepth[v] : 0x7FFFFFFF;
    }

    @Override  // com.google.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.asReadOnlyByteBufferList(), true);
    }

    @Override  // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new d(this);
    }

    static b0 newInstanceForTest(ByteString byteString0, ByteString byteString1) {
        return new b0(byteString0, byteString1);
    }

    @Override  // com.google.protobuf.ByteString
    protected int partialHash(int v, int v1, int v2) {
        int v3 = this.leftLength;
        if(v1 + v2 <= v3) {
            return this.left.partialHash(v, v1, v2);
        }
        if(v1 >= v3) {
            return this.right.partialHash(v, v1 - v3, v2);
        }
        int v4 = v3 - v1;
        int v5 = this.left.partialHash(v, v1, v4);
        return this.right.partialHash(v5, 0, v2 - v4);
    }

    @Override  // com.google.protobuf.ByteString
    protected int partialIsValidUtf8(int v, int v1, int v2) {
        int v3 = this.leftLength;
        if(v1 + v2 <= v3) {
            return this.left.partialIsValidUtf8(v, v1, v2);
        }
        if(v1 >= v3) {
            return this.right.partialIsValidUtf8(v, v1 - v3, v2);
        }
        int v4 = v3 - v1;
        int v5 = this.left.partialIsValidUtf8(v, v1, v4);
        return this.right.partialIsValidUtf8(v5, 0, v2 - v4);
    }

    private void readObject(ObjectInputStream objectInputStream0) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override  // com.google.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override  // com.google.protobuf.ByteString
    public ByteString substring(int v, int v1) {
        int v2 = ByteString.checkRange(v, v1, this.totalLength);
        if(v2 == 0) {
            return ByteString.EMPTY;
        }
        if(v2 == this.totalLength) {
            return this;
        }
        int v3 = this.leftLength;
        if(v1 <= v3) {
            return this.left.substring(v, v1);
        }
        return v >= v3 ? this.right.substring(v - v3, v1 - v3) : new b0(this.left.substring(v), this.right.substring(0, v1 - this.leftLength));
    }

    @Override  // com.google.protobuf.ByteString
    protected String toStringInternal(Charset charset0) {
        return new String(this.toByteArray(), charset0);
    }

    Object writeReplace() {
        return ByteString.wrap(this.toByteArray());
    }

    @Override  // com.google.protobuf.ByteString
    void writeTo(ByteOutput byteOutput0) throws IOException {
        this.left.writeTo(byteOutput0);
        this.right.writeTo(byteOutput0);
    }

    @Override  // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream0) throws IOException {
        this.left.writeTo(outputStream0);
        this.right.writeTo(outputStream0);
    }

    @Override  // com.google.protobuf.ByteString
    void writeToInternal(OutputStream outputStream0, int v, int v1) throws IOException {
        int v2 = this.leftLength;
        if(v + v1 <= v2) {
            this.left.writeToInternal(outputStream0, v, v1);
            return;
        }
        if(v >= v2) {
            this.right.writeToInternal(outputStream0, v - v2, v1);
            return;
        }
        int v3 = v2 - v;
        this.left.writeToInternal(outputStream0, v, v3);
        this.right.writeToInternal(outputStream0, 0, v1 - v3);
    }

    @Override  // com.google.protobuf.ByteString
    void writeToReverse(ByteOutput byteOutput0) throws IOException {
        this.right.writeToReverse(byteOutput0);
        this.left.writeToReverse(byteOutput0);
    }
}

