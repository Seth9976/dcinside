package org.mp4parser.boxes.microsoft.contentprotection;

import j..util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.mp4parser.boxes.microsoft.ProtectionSpecificHeader;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class PlayReadyHeader extends ProtectionSpecificHeader {
    public static abstract class PlayReadyRecord {
        public static class DefaulPlayReadyRecord extends PlayReadyRecord {
            ByteBuffer value;

            public DefaulPlayReadyRecord(int v) {
                super(v);
            }

            @Override  // org.mp4parser.boxes.microsoft.contentprotection.PlayReadyHeader$PlayReadyRecord
            public ByteBuffer getValue() {
                return this.value;
            }

            @Override  // org.mp4parser.boxes.microsoft.contentprotection.PlayReadyHeader$PlayReadyRecord
            public void parse(ByteBuffer byteBuffer0) {
                this.value = byteBuffer0.duplicate();
            }
        }

        public static class EmeddedLicenseStore extends PlayReadyRecord {
            ByteBuffer value;

            public EmeddedLicenseStore() {
                super(3);
            }

            @Override  // org.mp4parser.boxes.microsoft.contentprotection.PlayReadyHeader$PlayReadyRecord
            public ByteBuffer getValue() {
                return this.value;
            }

            @Override  // org.mp4parser.boxes.microsoft.contentprotection.PlayReadyHeader$PlayReadyRecord
            public void parse(ByteBuffer byteBuffer0) {
                this.value = byteBuffer0.duplicate();
            }

            // 去混淆评级： 低(20)
            @Override  // org.mp4parser.boxes.microsoft.contentprotection.PlayReadyHeader$PlayReadyRecord
            public String toString() {
                return "EmeddedLicenseStore{length=" + this.getValue().limit() + '}';
            }
        }

        public static class RMHeader extends PlayReadyRecord {
            String header;

            public RMHeader() {
                super(1);
            }

            public String getHeader() {
                return this.header;
            }

            @Override  // org.mp4parser.boxes.microsoft.contentprotection.PlayReadyHeader$PlayReadyRecord
            public ByteBuffer getValue() {
                try {
                    return ByteBuffer.wrap(this.header.getBytes("UTF-16LE"));
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    throw new RuntimeException(unsupportedEncodingException0);
                }
            }

            @Override  // org.mp4parser.boxes.microsoft.contentprotection.PlayReadyHeader$PlayReadyRecord
            public void parse(ByteBuffer byteBuffer0) {
                try {
                    byte[] arr_b = new byte[byteBuffer0.slice().limit()];
                    byteBuffer0.get(arr_b);
                    this.header = new String(arr_b, "UTF-16LE");
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    throw new RuntimeException(unsupportedEncodingException0);
                }
            }

            public void setHeader(String s) {
                this.header = s;
            }

            // 去混淆评级： 低(20)
            @Override  // org.mp4parser.boxes.microsoft.contentprotection.PlayReadyHeader$PlayReadyRecord
            public String toString() {
                return "RMHeader{length=" + this.getValue().limit() + ", header=\'" + this.header + '\'' + '}';
            }
        }

        int type;

        public PlayReadyRecord(int v) {
            this.type = v;
        }

        public static List createFor(ByteBuffer byteBuffer0, int v) {
            RMHeader playReadyHeader$PlayReadyRecord$RMHeader0;
            List list0 = new ArrayList(v);
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = IsoTypeReader.readUInt16BE(byteBuffer0);
                int v3 = IsoTypeReader.readUInt16BE(byteBuffer0);
                switch(v2) {
                    case 1: {
                        playReadyHeader$PlayReadyRecord$RMHeader0 = new RMHeader();
                        break;
                    }
                    case 2: {
                        playReadyHeader$PlayReadyRecord$RMHeader0 = new DefaulPlayReadyRecord(2);
                        break;
                    }
                    case 3: {
                        playReadyHeader$PlayReadyRecord$RMHeader0 = new EmeddedLicenseStore();
                        break;
                    }
                    default: {
                        playReadyHeader$PlayReadyRecord$RMHeader0 = new DefaulPlayReadyRecord(v2);
                    }
                }
                playReadyHeader$PlayReadyRecord$RMHeader0.parse(((ByteBuffer)byteBuffer0.slice().limit(v3)));
                byteBuffer0.position(byteBuffer0.position() + v3);
                list0.add(playReadyHeader$PlayReadyRecord$RMHeader0);
            }
            return list0;
        }

        public abstract ByteBuffer getValue();

        public abstract void parse(ByteBuffer arg1);

        // 去混淆评级： 低(20)
        @Override
        public String toString() {
            return "PlayReadyRecord{type=" + this.type + ", length=" + this.getValue().limit() + '}';
        }
    }

    public static UUID PROTECTION_SYSTEM_ID;
    private long length;
    private List records;

    static {
        UUID uUID0 = UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95");
        PlayReadyHeader.PROTECTION_SYSTEM_ID = uUID0;
        ProtectionSpecificHeader.uuidRegistry.put(uUID0, PlayReadyHeader.class);
    }

    @Override  // org.mp4parser.boxes.microsoft.ProtectionSpecificHeader
    public ByteBuffer getData() {
        int v = 6;
        for(Object object0: this.records) {
            v = v + 4 + ((PlayReadyRecord)object0).getValue().rewind().limit();
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(v);
        IsoTypeWriter.writeUInt32BE(byteBuffer0, ((long)v));
        IsoTypeWriter.writeUInt16BE(byteBuffer0, this.records.size());
        for(Object object1: this.records) {
            IsoTypeWriter.writeUInt16BE(byteBuffer0, ((PlayReadyRecord)object1).type);
            IsoTypeWriter.writeUInt16BE(byteBuffer0, ((PlayReadyRecord)object1).getValue().limit());
            byteBuffer0.put(((PlayReadyRecord)object1).getValue());
        }
        return byteBuffer0;
    }

    public List getRecords() {
        return DesugarCollections.unmodifiableList(this.records);
    }

    @Override  // org.mp4parser.boxes.microsoft.ProtectionSpecificHeader
    public UUID getSystemId() {
        return PlayReadyHeader.PROTECTION_SYSTEM_ID;
    }

    @Override  // org.mp4parser.boxes.microsoft.ProtectionSpecificHeader
    public void parse(ByteBuffer byteBuffer0) {
        this.length = IsoTypeReader.readUInt32BE(byteBuffer0);
        this.records = PlayReadyRecord.createFor(byteBuffer0, IsoTypeReader.readUInt16BE(byteBuffer0));
    }

    public void setRecords(List list0) {
        this.records = list0;
    }

    // 去混淆评级： 低(20)
    @Override  // org.mp4parser.boxes.microsoft.ProtectionSpecificHeader
    public String toString() {
        return "PlayReadyHeader{length=" + this.length + ", recordCount=" + this.records.size() + ", records=" + this.records + '}';
    }
}

