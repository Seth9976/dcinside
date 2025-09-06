package org.mp4parser.boxes.iso23001.part7;

import java.math.BigInteger;
import java.util.Arrays;
import org.mp4parser.tools.Hex;

public class CencSampleAuxiliaryDataFormat {
    abstract class AbstractPair implements Pair {
        private AbstractPair() {
        }

        AbstractPair(AbstractPair cencSampleAuxiliaryDataFormat$AbstractPair0) {
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 != null && this.getClass() == object0.getClass() && this.clear() == ((Pair)object0).clear() ? this.encrypted() == ((Pair)object0).encrypted() : false;
        }

        @Override
        public String toString() {
            return "P(" + this.clear() + "|" + this.encrypted() + ")";
        }
    }

    class ByteBytePair extends AbstractPair {
        private byte clear;
        private byte encrypted;

        public ByteBytePair(int v, long v1) {
            super(null);
            this.clear = (byte)v;
            this.encrypted = (byte)(((int)v1));
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public int clear() {
            return this.clear;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public long encrypted() {
            return (long)this.encrypted;
        }
    }

    class ByteIntPair extends AbstractPair {
        private byte clear;
        private int encrypted;

        public ByteIntPair(int v, long v1) {
            super(null);
            this.clear = (byte)v;
            this.encrypted = (int)v1;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public int clear() {
            return this.clear;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public long encrypted() {
            return (long)this.encrypted;
        }
    }

    class ByteLongPair extends AbstractPair {
        private byte clear;
        private long encrypted;

        public ByteLongPair(int v, long v1) {
            super(null);
            this.clear = (byte)v;
            this.encrypted = v1;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public int clear() {
            return this.clear;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public long encrypted() {
            return this.encrypted;
        }
    }

    class ByteShortPair extends AbstractPair {
        private byte clear;
        private short encrypted;

        public ByteShortPair(int v, long v1) {
            super(null);
            this.clear = (byte)v;
            this.encrypted = (short)(((int)v1));
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public int clear() {
            return this.clear;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public long encrypted() {
            return (long)this.encrypted;
        }
    }

    class IntBytePair extends AbstractPair {
        private int clear;
        private byte encrypted;

        public IntBytePair(int v, long v1) {
            super(null);
            this.clear = v;
            this.encrypted = (byte)(((int)v1));
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public int clear() {
            return this.clear;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public long encrypted() {
            return (long)this.encrypted;
        }
    }

    class IntIntPair extends AbstractPair {
        private int clear;
        private int encrypted;

        public IntIntPair(int v, long v1) {
            super(null);
            this.clear = v;
            this.encrypted = (int)v1;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public int clear() {
            return this.clear;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public long encrypted() {
            return (long)this.encrypted;
        }
    }

    class IntLongPair extends AbstractPair {
        private int clear;
        private long encrypted;

        public IntLongPair(int v, long v1) {
            super(null);
            this.clear = v;
            this.encrypted = v1;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public int clear() {
            return this.clear;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public long encrypted() {
            return this.encrypted;
        }
    }

    class IntShortPair extends AbstractPair {
        private int clear;
        private short encrypted;

        public IntShortPair(int v, long v1) {
            super(null);
            this.clear = v;
            this.encrypted = (short)(((int)v1));
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public int clear() {
            return this.clear;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public long encrypted() {
            return (long)this.encrypted;
        }
    }

    public interface Pair {
        int clear();

        long encrypted();
    }

    class ShortBytePair extends AbstractPair {
        private short clear;
        private byte encrypted;

        public ShortBytePair(int v, long v1) {
            super(null);
            this.clear = (short)v;
            this.encrypted = (byte)(((int)v1));
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public int clear() {
            return this.clear;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public long encrypted() {
            return (long)this.encrypted;
        }
    }

    class ShortIntPair extends AbstractPair {
        private short clear;
        private int encrypted;

        public ShortIntPair(int v, long v1) {
            super(null);
            this.clear = (short)v;
            this.encrypted = (int)v1;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public int clear() {
            return this.clear;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public long encrypted() {
            return (long)this.encrypted;
        }
    }

    class ShortLongPair extends AbstractPair {
        private short clear;
        private long encrypted;

        public ShortLongPair(int v, long v1) {
            super(null);
            this.clear = (short)v;
            this.encrypted = v1;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public int clear() {
            return this.clear;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public long encrypted() {
            return this.encrypted;
        }
    }

    class ShortShortPair extends AbstractPair {
        private short clear;
        private short encrypted;

        public ShortShortPair(int v, long v1) {
            super(null);
            this.clear = (short)v;
            this.encrypted = (short)(((int)v1));
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public int clear() {
            return this.clear;
        }

        @Override  // org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair
        public long encrypted() {
            return (long)this.encrypted;
        }
    }

    public byte[] iv;
    public Pair[] pairs;

    public CencSampleAuxiliaryDataFormat() {
        this.iv = new byte[0];
        this.pairs = null;
    }

    public Pair createPair(int v, long v1) {
        if(v <= 0x7F) {
            if(v1 <= 0x7FL) {
                return new ByteBytePair(this, v, v1);
            }
            if(v1 <= 0x7FFFL) {
                return new ByteShortPair(this, v, v1);
            }
            return v1 <= 0x7FFFFFFFL ? new ByteIntPair(this, v, v1) : new ByteLongPair(this, v, v1);
        }
        if(v <= 0x7FFF) {
            if(v1 <= 0x7FL) {
                return new ShortBytePair(this, v, v1);
            }
            if(v1 <= 0x7FFFL) {
                return new ShortShortPair(this, v, v1);
            }
            return v1 <= 0x7FFFFFFFL ? new ShortIntPair(this, v, v1) : new ShortLongPair(this, v, v1);
        }
        if(v1 <= 0x7FL) {
            return new IntBytePair(this, v, v1);
        }
        if(v1 <= 0x7FFFL) {
            return new IntShortPair(this, v, v1);
        }
        return v1 <= 0x7FFFFFFFL ? new IntIntPair(this, v, v1) : new IntLongPair(this, v, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || !new BigInteger(this.iv).equals(new BigInteger(((CencSampleAuxiliaryDataFormat)object0).iv))) {
            return false;
        }
        Pair[] arr_cencSampleAuxiliaryDataFormat$Pair = this.pairs;
        Pair[] arr_cencSampleAuxiliaryDataFormat$Pair1 = ((CencSampleAuxiliaryDataFormat)object0).pairs;
        return arr_cencSampleAuxiliaryDataFormat$Pair == null ? arr_cencSampleAuxiliaryDataFormat$Pair1 == null : Arrays.equals(arr_cencSampleAuxiliaryDataFormat$Pair, arr_cencSampleAuxiliaryDataFormat$Pair1);
    }

    public int getSize() {
        return this.pairs == null || this.pairs.length <= 0 ? this.iv.length : this.iv.length + 2 + this.pairs.length * 6;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.iv == null ? 0 : Arrays.hashCode(this.iv);
        Pair[] arr_cencSampleAuxiliaryDataFormat$Pair = this.pairs;
        if(arr_cencSampleAuxiliaryDataFormat$Pair != null) {
            v = Arrays.hashCode(arr_cencSampleAuxiliaryDataFormat$Pair);
        }
        return v1 * 0x1F + v;
    }

    @Override
    public String toString() {
        return "Entry{iv=" + Hex.encodeHex(this.iv) + ", pairs=" + Arrays.toString(this.pairs) + '}';
    }

    class org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat.1 {
    }

}

