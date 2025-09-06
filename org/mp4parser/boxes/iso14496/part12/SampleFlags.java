package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class SampleFlags {
    private byte isLeading;
    private byte reserved;
    private int sampleDegradationPriority;
    private byte sampleDependsOn;
    private byte sampleHasRedundancy;
    private byte sampleIsDependedOn;
    private boolean sampleIsDifferenceSample;
    private byte samplePaddingValue;

    public SampleFlags() {
    }

    public SampleFlags(ByteBuffer byteBuffer0) {
        long v = IsoTypeReader.readUInt32(byteBuffer0);
        this.reserved = (byte)(((int)((0xFFFFFFFFF0000000L & v) >> 28)));
        this.isLeading = (byte)(((int)((0xC000000L & v) >> 26)));
        this.sampleDependsOn = (byte)(((int)((0x3000000L & v) >> 24)));
        this.sampleIsDependedOn = (byte)(((int)((0xC00000L & v) >> 22)));
        this.sampleHasRedundancy = (byte)(((int)((0x300000L & v) >> 20)));
        this.samplePaddingValue = (byte)(((int)((0xE0000L & v) >> 17)));
        this.sampleIsDifferenceSample = (0x10000L & v) >> 16 > 0L;
        this.sampleDegradationPriority = (int)(v & 0xFFFFL);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || this.isLeading != ((SampleFlags)object0).isLeading) {
            return false;
        }
        if(this.reserved != ((SampleFlags)object0).reserved) {
            return false;
        }
        if(this.sampleDegradationPriority != ((SampleFlags)object0).sampleDegradationPriority) {
            return false;
        }
        if(this.sampleDependsOn != ((SampleFlags)object0).sampleDependsOn) {
            return false;
        }
        if(this.sampleHasRedundancy != ((SampleFlags)object0).sampleHasRedundancy) {
            return false;
        }
        if(this.sampleIsDependedOn != ((SampleFlags)object0).sampleIsDependedOn) {
            return false;
        }
        return this.sampleIsDifferenceSample == ((SampleFlags)object0).sampleIsDifferenceSample ? this.samplePaddingValue == ((SampleFlags)object0).samplePaddingValue : false;
    }

    public void getContent(ByteBuffer byteBuffer0) {
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)(this.reserved << 28)) | ((long)(this.isLeading << 26)) | ((long)(this.sampleDependsOn << 24)) | ((long)(this.sampleIsDependedOn << 22)) | ((long)(this.sampleHasRedundancy << 20)) | ((long)(this.samplePaddingValue << 17)) | ((long)(this.sampleIsDifferenceSample << 16)) | ((long)this.sampleDegradationPriority));
    }

    public byte getIsLeading() {
        return this.isLeading;
    }

    public int getReserved() {
        return this.reserved;
    }

    public int getSampleDegradationPriority() {
        return this.sampleDegradationPriority;
    }

    public int getSampleDependsOn() {
        return this.sampleDependsOn;
    }

    public int getSampleHasRedundancy() {
        return this.sampleHasRedundancy;
    }

    public int getSampleIsDependedOn() {
        return this.sampleIsDependedOn;
    }

    public int getSamplePaddingValue() {
        return this.samplePaddingValue;
    }

    @Override
    public int hashCode() {
        return ((((((this.reserved * 0x1F + this.isLeading) * 0x1F + this.sampleDependsOn) * 0x1F + this.sampleIsDependedOn) * 0x1F + this.sampleHasRedundancy) * 0x1F + this.samplePaddingValue) * 0x1F + this.sampleIsDifferenceSample) * 0x1F + this.sampleDegradationPriority;
    }

    public boolean isSampleIsDifferenceSample() {
        return this.sampleIsDifferenceSample;
    }

    public void setIsLeading(byte b) {
        this.isLeading = b;
    }

    public void setReserved(int v) {
        this.reserved = (byte)v;
    }

    public void setSampleDegradationPriority(int v) {
        this.sampleDegradationPriority = v;
    }

    public void setSampleDependsOn(int v) {
        this.sampleDependsOn = (byte)v;
    }

    public void setSampleHasRedundancy(int v) {
        this.sampleHasRedundancy = (byte)v;
    }

    public void setSampleIsDependedOn(int v) {
        this.sampleIsDependedOn = (byte)v;
    }

    public void setSampleIsDifferenceSample(boolean z) {
        this.sampleIsDifferenceSample = z;
    }

    public void setSamplePaddingValue(int v) {
        this.samplePaddingValue = (byte)v;
    }

    @Override
    public String toString() [...] // 潜在的解密器
}

