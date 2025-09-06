package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeReaderVariable;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.IsoTypeWriterVariable;

public class ItemLocationBox extends AbstractFullBox {
    public class Extent {
        public long extentIndex;
        public long extentLength;
        public long extentOffset;

        public Extent(long v, long v1, long v2) {
            this.extentOffset = v;
            this.extentLength = v1;
            this.extentIndex = v2;
        }

        public Extent(ByteBuffer byteBuffer0) {
            if(itemLocationBox0.getVersion() == 1) {
                int v = itemLocationBox0.indexSize;
                if(v > 0) {
                    this.extentIndex = IsoTypeReaderVariable.read(byteBuffer0, v);
                }
            }
            this.extentOffset = IsoTypeReaderVariable.read(byteBuffer0, itemLocationBox0.offsetSize);
            this.extentLength = IsoTypeReaderVariable.read(byteBuffer0, itemLocationBox0.lengthSize);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 == null || this.getClass() != object0.getClass() || this.extentIndex != ((Extent)object0).extentIndex) {
                return false;
            }
            return this.extentLength == ((Extent)object0).extentLength ? this.extentOffset == ((Extent)object0).extentOffset : false;
        }

        public void getContent(ByteBuffer byteBuffer0) {
            if(ItemLocationBox.this.getVersion() == 1) {
                int v = ItemLocationBox.this.indexSize;
                if(v > 0) {
                    IsoTypeWriterVariable.write(this.extentIndex, byteBuffer0, v);
                }
            }
            IsoTypeWriterVariable.write(this.extentOffset, byteBuffer0, ItemLocationBox.this.offsetSize);
            IsoTypeWriterVariable.write(this.extentLength, byteBuffer0, ItemLocationBox.this.lengthSize);
        }

        public int getSize() {
            return (ItemLocationBox.this.indexSize > 0 ? ItemLocationBox.this.indexSize : 0) + ItemLocationBox.this.offsetSize + ItemLocationBox.this.lengthSize;
        }

        @Override
        public int hashCode() {
            return (((int)(this.extentOffset ^ this.extentOffset >>> 0x20)) * 0x1F + ((int)(this.extentLength ^ this.extentLength >>> 0x20))) * 0x1F + ((int)(this.extentIndex ^ this.extentIndex >>> 0x20));
        }

        // 去混淆评级： 低(20)
        @Override
        public String toString() {
            return "Extent{extentOffset=" + this.extentOffset + ", extentLength=" + this.extentLength + ", extentIndex=" + this.extentIndex + '}';
        }
    }

    public class Item {
        public long baseOffset;
        public int constructionMethod;
        public int dataReferenceIndex;
        public List extents;
        public int itemId;

        public Item(int v, int v1, int v2, long v3, List list0) {
            new LinkedList();
            this.itemId = v;
            this.constructionMethod = v1;
            this.dataReferenceIndex = v2;
            this.baseOffset = v3;
            this.extents = list0;
        }

        public Item(ByteBuffer byteBuffer0) {
            this.extents = new LinkedList();
            this.itemId = IsoTypeReader.readUInt16(byteBuffer0);
            if(itemLocationBox0.getVersion() == 1) {
                this.constructionMethod = IsoTypeReader.readUInt16(byteBuffer0) & 15;
            }
            this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer0);
            int v = itemLocationBox0.baseOffsetSize;
            this.baseOffset = v > 0 ? IsoTypeReaderVariable.read(byteBuffer0, v) : 0L;
            int v1 = IsoTypeReader.readUInt16(byteBuffer0);
            for(int v2 = 0; v2 < v1; ++v2) {
                this.extents.add(new Extent(itemLocationBox0, byteBuffer0));
            }
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 == null || this.getClass() != object0.getClass() || this.baseOffset != ((Item)object0).baseOffset) {
                return false;
            }
            if(this.constructionMethod != ((Item)object0).constructionMethod) {
                return false;
            }
            if(this.dataReferenceIndex != ((Item)object0).dataReferenceIndex) {
                return false;
            }
            if(this.itemId != ((Item)object0).itemId) {
                return false;
            }
            List list0 = this.extents;
            List list1 = ((Item)object0).extents;
            return list0 == null ? list1 == null : list0.equals(list1);
        }

        public void getContent(ByteBuffer byteBuffer0) {
            IsoTypeWriter.writeUInt16(byteBuffer0, this.itemId);
            if(ItemLocationBox.this.getVersion() == 1) {
                IsoTypeWriter.writeUInt16(byteBuffer0, this.constructionMethod);
            }
            IsoTypeWriter.writeUInt16(byteBuffer0, this.dataReferenceIndex);
            int v = ItemLocationBox.this.baseOffsetSize;
            if(v > 0) {
                IsoTypeWriterVariable.write(this.baseOffset, byteBuffer0, v);
            }
            IsoTypeWriter.writeUInt16(byteBuffer0, this.extents.size());
            for(Object object0: this.extents) {
                ((Extent)object0).getContent(byteBuffer0);
            }
        }

        public int getSize() {
            int v = (ItemLocationBox.this.getVersion() == 1 ? 4 : 2) + 2 + ItemLocationBox.this.baseOffsetSize + 2;
            for(Object object0: this.extents) {
                v += ((Extent)object0).getSize();
            }
            return v;
        }

        @Override
        public int hashCode() {
            int v = (((this.itemId * 0x1F + this.constructionMethod) * 0x1F + this.dataReferenceIndex) * 0x1F + ((int)(this.baseOffset ^ this.baseOffset >>> 0x20))) * 0x1F;
            return this.extents == null ? v : v + this.extents.hashCode();
        }

        public void setBaseOffset(long v) {
            this.baseOffset = v;
        }

        @Override
        public String toString() {
            return "Item{baseOffset=" + this.baseOffset + ", itemId=" + this.itemId + ", constructionMethod=" + this.constructionMethod + ", dataReferenceIndex=" + this.dataReferenceIndex + ", extents=" + this.extents + '}';
        }
    }

    public static final String TYPE = "iloc";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_10;
    private static StaticPart ajc$tjp_11;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    public int baseOffsetSize;
    public int indexSize;
    public List items;
    public int lengthSize;
    public int offsetSize;

    static {
        ItemLocationBox.ajc$preClinit();
    }

    public ItemLocationBox() {
        super("iloc");
        this.offsetSize = 8;
        this.lengthSize = 8;
        this.baseOffsetSize = 8;
        this.indexSize = 0;
        this.items = new LinkedList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        int v = IsoTypeReader.readUInt8(byteBuffer0);
        this.offsetSize = v >>> 4;
        this.lengthSize = v & 15;
        int v1 = IsoTypeReader.readUInt8(byteBuffer0);
        this.baseOffsetSize = v1 >>> 4;
        if(this.getVersion() == 1) {
            this.indexSize = v1 & 15;
        }
        int v2 = IsoTypeReader.readUInt16(byteBuffer0);
        for(int v3 = 0; v3 < v2; ++v3) {
            this.items.add(new Item(this, byteBuffer0));
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("ItemLocationBox.java", ItemLocationBox.class);
        ItemLocationBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getOffsetSize", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "", "", "", "int"), 0x76);
        ItemLocationBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setOffsetSize", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "int", "offsetSize", "", "void"), 0x7A);
        ItemLocationBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "createItem", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "int:int:int:long:java.util.List", "itemId:constructionMethod:dataReferenceIndex:baseOffset:extents", "", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox$Item"), 0x9F);
        ItemLocationBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "createExtent", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "long:long:long", "extentOffset:extentLength:extentIndex", "", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox$Extent"), 0xA7);
        ItemLocationBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLengthSize", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "", "", "", "int"), 0x7E);
        ItemLocationBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLengthSize", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "int", "lengthSize", "", "void"), 130);
        ItemLocationBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBaseOffsetSize", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "", "", "", "int"), 0x86);
        ItemLocationBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setBaseOffsetSize", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "int", "baseOffsetSize", "", "void"), 0x8A);
        ItemLocationBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getIndexSize", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "", "", "", "int"), 0x8E);
        ItemLocationBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setIndexSize", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "int", "indexSize", "", "void"), 0x92);
        ItemLocationBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getItems", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "", "", "", "java.util.List"), 150);
        ItemLocationBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setItems", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "java.util.List", "items", "", "void"), 0x9A);
    }

    public Extent createExtent(long v, long v1, long v2) {
        JoinPoint joinPoint0 = Factory.makeJP(ItemLocationBox.ajc$tjp_11, this, this, new Object[]{Conversions.longObject(v), Conversions.longObject(v1), Conversions.longObject(v2)});
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return new Extent(this, v, v1, v2);
    }

    Extent createExtent(ByteBuffer byteBuffer0) {
        return new Extent(this, byteBuffer0);
    }

    public Item createItem(int v, int v1, int v2, long v3, List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(ItemLocationBox.ajc$tjp_10, this, this, new Object[]{Conversions.intObject(v), Conversions.intObject(v1), Conversions.intObject(v2), Conversions.longObject(v3), list0});
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return new Item(this, v, v1, v2, v3, list0);
    }

    Item createItem(ByteBuffer byteBuffer0) {
        return new Item(this, byteBuffer0);
    }

    public int getBaseOffsetSize() {
        JoinPoint joinPoint0 = Factory.makeJP(ItemLocationBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.baseOffsetSize;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.offsetSize << 4 | this.lengthSize);
        if(this.getVersion() == 1) {
            IsoTypeWriter.writeUInt8(byteBuffer0, this.baseOffsetSize << 4 | this.indexSize);
        }
        else {
            IsoTypeWriter.writeUInt8(byteBuffer0, this.baseOffsetSize << 4);
        }
        IsoTypeWriter.writeUInt16(byteBuffer0, this.items.size());
        for(Object object0: this.items) {
            ((Item)object0).getContent(byteBuffer0);
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        long v = 8L;
        for(Object object0: this.items) {
            v += (long)((Item)object0).getSize();
        }
        return v;
    }

    public int getIndexSize() {
        JoinPoint joinPoint0 = Factory.makeJP(ItemLocationBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.indexSize;
    }

    public List getItems() {
        JoinPoint joinPoint0 = Factory.makeJP(ItemLocationBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.items;
    }

    public int getLengthSize() {
        JoinPoint joinPoint0 = Factory.makeJP(ItemLocationBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.lengthSize;
    }

    public int getOffsetSize() {
        JoinPoint joinPoint0 = Factory.makeJP(ItemLocationBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.offsetSize;
    }

    public void setBaseOffsetSize(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(ItemLocationBox.ajc$tjp_5, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.baseOffsetSize = v;
    }

    public void setIndexSize(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(ItemLocationBox.ajc$tjp_7, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.indexSize = v;
    }

    public void setItems(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(ItemLocationBox.ajc$tjp_9, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.items = list0;
    }

    public void setLengthSize(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(ItemLocationBox.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.lengthSize = v;
    }

    public void setOffsetSize(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(ItemLocationBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.offsetSize = v;
    }
}

