package org.mp4parser.boxes.iso14496.part15;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitReaderBuffer;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitWriterBuffer;
import org.mp4parser.tools.Hex;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class AvcDecoderConfigurationRecord {
    public int avcLevelIndication;
    public int avcProfileIndication;
    public int bitDepthChromaMinus8;
    public int bitDepthChromaMinus8PaddingBits;
    public int bitDepthLumaMinus8;
    public int bitDepthLumaMinus8PaddingBits;
    public int chromaFormat;
    public int chromaFormatPaddingBits;
    public int configurationVersion;
    public boolean hasExts;
    public int lengthSizeMinusOne;
    public int lengthSizeMinusOnePaddingBits;
    public int numberOfSequenceParameterSetsPaddingBits;
    public List pictureParameterSets;
    public int profileCompatibility;
    public List sequenceParameterSetExts;
    public List sequenceParameterSets;

    public AvcDecoderConfigurationRecord() {
        this.sequenceParameterSets = new ArrayList();
        this.pictureParameterSets = new ArrayList();
        this.hasExts = true;
        this.chromaFormat = 1;
        this.bitDepthLumaMinus8 = 0;
        this.bitDepthChromaMinus8 = 0;
        this.sequenceParameterSetExts = new ArrayList();
        this.lengthSizeMinusOnePaddingBits = 0x3F;
        this.numberOfSequenceParameterSetsPaddingBits = 7;
        this.chromaFormatPaddingBits = 0x1F;
        this.bitDepthLumaMinus8PaddingBits = 0x1F;
        this.bitDepthChromaMinus8PaddingBits = 0x1F;
    }

    public AvcDecoderConfigurationRecord(ByteBuffer byteBuffer0) {
        this.sequenceParameterSets = new ArrayList();
        this.pictureParameterSets = new ArrayList();
        this.hasExts = true;
        this.chromaFormat = 1;
        this.bitDepthLumaMinus8 = 0;
        this.bitDepthChromaMinus8 = 0;
        this.sequenceParameterSetExts = new ArrayList();
        this.lengthSizeMinusOnePaddingBits = 0x3F;
        this.numberOfSequenceParameterSetsPaddingBits = 7;
        this.chromaFormatPaddingBits = 0x1F;
        this.bitDepthLumaMinus8PaddingBits = 0x1F;
        this.bitDepthChromaMinus8PaddingBits = 0x1F;
        this.configurationVersion = IsoTypeReader.readUInt8(byteBuffer0);
        this.avcProfileIndication = IsoTypeReader.readUInt8(byteBuffer0);
        this.profileCompatibility = IsoTypeReader.readUInt8(byteBuffer0);
        this.avcLevelIndication = IsoTypeReader.readUInt8(byteBuffer0);
        BitReaderBuffer bitReaderBuffer0 = new BitReaderBuffer(byteBuffer0);
        this.lengthSizeMinusOnePaddingBits = bitReaderBuffer0.readBits(6);
        this.lengthSizeMinusOne = bitReaderBuffer0.readBits(2);
        this.numberOfSequenceParameterSetsPaddingBits = bitReaderBuffer0.readBits(3);
        int v1 = bitReaderBuffer0.readBits(5);
        for(int v2 = 0; v2 < v1; ++v2) {
            byte[] arr_b = new byte[IsoTypeReader.readUInt16(byteBuffer0)];
            byteBuffer0.get(arr_b);
            this.sequenceParameterSets.add(ByteBuffer.wrap(arr_b));
        }
        long v3 = (long)IsoTypeReader.readUInt8(byteBuffer0);
        for(int v4 = 0; ((long)v4) < v3; ++v4) {
            byte[] arr_b1 = new byte[IsoTypeReader.readUInt16(byteBuffer0)];
            byteBuffer0.get(arr_b1);
            this.pictureParameterSets.add(ByteBuffer.wrap(arr_b1));
        }
        if(byteBuffer0.remaining() < 4) {
            this.hasExts = false;
        }
        if(this.hasExts && (this.avcProfileIndication == 100 || this.avcProfileIndication == 110 || this.avcProfileIndication == 0x7A || this.avcProfileIndication == 0x90)) {
            BitReaderBuffer bitReaderBuffer1 = new BitReaderBuffer(byteBuffer0);
            this.chromaFormatPaddingBits = bitReaderBuffer1.readBits(6);
            this.chromaFormat = bitReaderBuffer1.readBits(2);
            this.bitDepthLumaMinus8PaddingBits = bitReaderBuffer1.readBits(5);
            this.bitDepthLumaMinus8 = bitReaderBuffer1.readBits(3);
            this.bitDepthChromaMinus8PaddingBits = bitReaderBuffer1.readBits(5);
            this.bitDepthChromaMinus8 = bitReaderBuffer1.readBits(3);
            long v5 = (long)IsoTypeReader.readUInt8(byteBuffer0);
            for(int v = 0; ((long)v) < v5; ++v) {
                byte[] arr_b2 = new byte[IsoTypeReader.readUInt16(byteBuffer0)];
                byteBuffer0.get(arr_b2);
                this.sequenceParameterSetExts.add(ByteBuffer.wrap(arr_b2));
            }
            return;
        }
        this.chromaFormat = -1;
        this.bitDepthLumaMinus8 = -1;
        this.bitDepthChromaMinus8 = -1;
    }

    public void getContent(ByteBuffer byteBuffer0) {
        IsoTypeWriter.writeUInt8(byteBuffer0, this.configurationVersion);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.avcProfileIndication);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.profileCompatibility);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.avcLevelIndication);
        BitWriterBuffer bitWriterBuffer0 = new BitWriterBuffer(byteBuffer0);
        bitWriterBuffer0.writeBits(this.lengthSizeMinusOnePaddingBits, 6);
        bitWriterBuffer0.writeBits(this.lengthSizeMinusOne, 2);
        bitWriterBuffer0.writeBits(this.numberOfSequenceParameterSetsPaddingBits, 3);
        bitWriterBuffer0.writeBits(this.pictureParameterSets.size(), 5);
        for(Object object0: this.sequenceParameterSets) {
            IsoTypeWriter.writeUInt16(byteBuffer0, ((ByteBuffer)object0).limit());
            byteBuffer0.put(((ByteBuffer)((ByteBuffer)object0).rewind()));
        }
        IsoTypeWriter.writeUInt8(byteBuffer0, this.pictureParameterSets.size());
        for(Object object1: this.pictureParameterSets) {
            IsoTypeWriter.writeUInt16(byteBuffer0, ((ByteBuffer)object1).limit());
            byteBuffer0.put(((ByteBuffer)((ByteBuffer)object1).rewind()));
        }
        if(this.hasExts && (this.avcProfileIndication == 100 || this.avcProfileIndication == 110 || this.avcProfileIndication == 0x7A || this.avcProfileIndication == 0x90)) {
            BitWriterBuffer bitWriterBuffer1 = new BitWriterBuffer(byteBuffer0);
            bitWriterBuffer1.writeBits(this.chromaFormatPaddingBits, 6);
            bitWriterBuffer1.writeBits(this.chromaFormat, 2);
            bitWriterBuffer1.writeBits(this.bitDepthLumaMinus8PaddingBits, 5);
            bitWriterBuffer1.writeBits(this.bitDepthLumaMinus8, 3);
            bitWriterBuffer1.writeBits(this.bitDepthChromaMinus8PaddingBits, 5);
            bitWriterBuffer1.writeBits(this.bitDepthChromaMinus8, 3);
            for(Object object2: this.sequenceParameterSetExts) {
                IsoTypeWriter.writeUInt16(byteBuffer0, ((ByteBuffer)object2).limit());
                byteBuffer0.put(((ByteBuffer)((ByteBuffer)object2).reset()));
            }
        }
    }

    public long getContentSize() {
        long v = 6L;
        for(Object object0: this.sequenceParameterSets) {
            v = v + 2L + ((long)((ByteBuffer)object0).limit());
        }
        long v1 = v + 1L;
        for(Object object1: this.pictureParameterSets) {
            v1 = v1 + 2L + ((long)((ByteBuffer)object1).limit());
        }
        if(this.hasExts && (this.avcProfileIndication == 100 || this.avcProfileIndication == 110 || this.avcProfileIndication == 0x7A || this.avcProfileIndication == 0x90)) {
            v1 += 4L;
            for(Object object2: this.sequenceParameterSetExts) {
                v1 = v1 + 2L + ((long)((ByteBuffer)object2).limit());
            }
        }
        return v1;
    }

    public List getPictureParameterSetsAsStrings() {
        List list0 = new ArrayList(this.pictureParameterSets.size());
        for(Object object0: this.pictureParameterSets) {
            list0.add(Hex.encodeHex(((ByteBuffer)object0)));
        }
        return list0;
    }

    public List getSequenceParameterSetExtsAsStrings() {
        List list0 = new ArrayList(this.sequenceParameterSetExts.size());
        for(Object object0: this.sequenceParameterSetExts) {
            list0.add(Hex.encodeHex(((ByteBuffer)object0)));
        }
        return list0;
    }

    public List getSequenceParameterSetsAsStrings() {
        List list0 = new ArrayList(this.sequenceParameterSets.size());
        for(Object object0: this.sequenceParameterSets) {
            list0.add(Hex.encodeHex(((ByteBuffer)object0)));
        }
        return list0;
    }

    @Override
    public String toString() {
        return "AvcDecoderConfigurationRecord{configurationVersion=" + this.configurationVersion + ", avcProfileIndication=" + this.avcProfileIndication + ", profileCompatibility=" + this.profileCompatibility + ", avcLevelIndication=" + this.avcLevelIndication + ", lengthSizeMinusOne=" + this.lengthSizeMinusOne + ", hasExts=" + this.hasExts + ", chromaFormat=" + this.chromaFormat + ", bitDepthLumaMinus8=" + this.bitDepthLumaMinus8 + ", bitDepthChromaMinus8=" + this.bitDepthChromaMinus8 + ", lengthSizeMinusOnePaddingBits=" + this.lengthSizeMinusOnePaddingBits + ", numberOfSequenceParameterSetsPaddingBits=" + this.numberOfSequenceParameterSetsPaddingBits + ", chromaFormatPaddingBits=" + this.chromaFormatPaddingBits + ", bitDepthLumaMinus8PaddingBits=" + this.bitDepthLumaMinus8PaddingBits + ", bitDepthChromaMinus8PaddingBits=" + this.bitDepthChromaMinus8PaddingBits + '}';
    }
}

