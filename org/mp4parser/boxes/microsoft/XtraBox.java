package org.mp4parser.boxes.microsoft;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.slf4j.a;
import org.slf4j.b;

public class XtraBox extends AbstractBox {
    static class XtraTag {
        private int inputSize;
        private String tagName;
        private Vector values;

        private XtraTag() {
            this.values = new Vector();
        }

        private XtraTag(String s) {
            this.tagName = s;
        }

        XtraTag(String s, XtraTag xtraBox$XtraTag0) {
            this(s);
        }

        XtraTag(XtraTag xtraBox$XtraTag0) {
        }

        private void getContent(ByteBuffer byteBuffer0) {
            byteBuffer0.putInt(this.getContentSize());
            byteBuffer0.putInt(this.tagName.length());
            XtraBox.writeAsciiString(byteBuffer0, this.tagName);
            byteBuffer0.putInt(this.values.size());
            for(int v = 0; v < this.values.size(); ++v) {
                ((XtraValue)this.values.elementAt(v)).getContent(byteBuffer0);
            }
        }

        private int getContentSize() {
            int v = this.tagName.length() + 12;
            for(int v1 = 0; v1 < this.values.size(); ++v1) {
                v += ((XtraValue)this.values.elementAt(v1)).getContentSize();
            }
            return v;
        }

        private void parse(ByteBuffer byteBuffer0) {
            this.inputSize = byteBuffer0.getInt();
            this.tagName = XtraBox.readAsciiString(byteBuffer0, byteBuffer0.getInt());
            int v = byteBuffer0.getInt();
            for(int v1 = 0; v1 < v; ++v1) {
                XtraValue xtraBox$XtraValue0 = new XtraValue(null);
                xtraBox$XtraValue0.parse(byteBuffer0);
                this.values.addElement(xtraBox$XtraValue0);
            }
            if(this.inputSize != this.getContentSize()) {
                throw new RuntimeException("Improperly handled Xtra tag: Sizes don\'t match ( " + this.inputSize + "/" + this.getContentSize() + ") on " + this.tagName);
            }
        }

        @Override
        public String toString() {
            StringBuffer stringBuffer0 = new StringBuffer();
            stringBuffer0.append(this.tagName);
            stringBuffer0.append(" [");
            stringBuffer0.append(this.inputSize);
            stringBuffer0.append("/");
            stringBuffer0.append(this.values.size());
            stringBuffer0.append("]:\n");
            for(int v = 0; v < this.values.size(); ++v) {
                stringBuffer0.append("  ");
                stringBuffer0.append("[GUID](nonParsed)");
                stringBuffer0.append("\n");
            }
            return stringBuffer0.toString();
        }
    }

    static class XtraValue {
        public Date fileTimeValue;
        public long longValue;
        public byte[] nonParsedValue;
        public String stringValue;
        public int type;

        private XtraValue() {
        }

        private XtraValue(long v) {
            this.type = 19;
            this.longValue = v;
        }

        XtraValue(long v, XtraValue xtraBox$XtraValue0) {
            this(v);
        }

        private XtraValue(String s) {
            this.type = 8;
            this.stringValue = s;
        }

        XtraValue(String s, XtraValue xtraBox$XtraValue0) {
            this(s);
        }

        private XtraValue(Date date0) {
            this.type = 21;
            this.fileTimeValue = date0;
        }

        XtraValue(Date date0, XtraValue xtraBox$XtraValue0) {
            this(date0);
        }

        XtraValue(XtraValue xtraBox$XtraValue0) {
        }

        private void getContent(ByteBuffer byteBuffer0) {
            try {
                byteBuffer0.putInt(this.getContentSize());
                byteBuffer0.putShort(((short)this.type));
                byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
                switch(this.type) {
                    case 8: {
                        XtraBox.writeUtf16String(byteBuffer0, this.stringValue);
                        break;
                    }
                    case 19: {
                        byteBuffer0.putLong(this.longValue);
                        break;
                    }
                    case 21: {
                        byteBuffer0.putLong(XtraBox.access$5(this.fileTimeValue.getTime()));
                        break;
                    }
                    default: {
                        byteBuffer0.put(this.nonParsedValue);
                    }
                }
            }
            finally {
                byteBuffer0.order(ByteOrder.BIG_ENDIAN);
            }
        }

        private int getContentSize() {
            switch(this.type) {
                case 8: {
                    return this.stringValue.length() * 2 + 8;
                }
                case 19: 
                case 21: {
                    return 14;
                }
                default: {
                    return this.nonParsedValue.length + 6;
                }
            }
        }

        private Object getValueAsObject() {
            switch(this.type) {
                case 8: {
                    return this.stringValue;
                }
                case 19: {
                    return new Long(this.longValue);
                }
                case 21: {
                    return this.fileTimeValue;
                }
                default: {
                    return this.nonParsedValue;
                }
            }
        }

        private void parse(ByteBuffer byteBuffer0) {
            int v = byteBuffer0.getInt();
            this.type = byteBuffer0.getShort();
            byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
            switch(this.type) {
                case 8: {
                    this.stringValue = XtraBox.readUtf16String(byteBuffer0, v - 6);
                    break;
                }
                case 19: {
                    this.longValue = byteBuffer0.getLong();
                    break;
                }
                case 21: {
                    this.fileTimeValue = new Date(XtraBox.access$3(byteBuffer0.getLong()));
                    break;
                }
                default: {
                    byte[] arr_b = new byte[v - 6];
                    this.nonParsedValue = arr_b;
                    byteBuffer0.get(arr_b);
                }
            }
            byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        }

        @Override
        public String toString() [...] // 潜在的解密器
    }

    private static final long FILETIME_EPOCH_DIFF = 11644473600000L;
    private static final long FILETIME_ONE_MILLISECOND = 10000L;
    private static a LOG = null;
    public static final int MP4_XTRA_BT_FILETIME = 21;
    public static final int MP4_XTRA_BT_GUID = 72;
    public static final int MP4_XTRA_BT_INT64 = 19;
    public static final int MP4_XTRA_BT_UNICODE = 8;
    public static final String TYPE = "Xtra";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_10;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    ByteBuffer data;
    private boolean successfulParse;
    Vector tags;

    static {
        XtraBox.ajc$preClinit();
        XtraBox.LOG = b.i(XtraBox.class);
    }

    public XtraBox() {
        super("Xtra");
        this.tags = new Vector();
        this.successfulParse = false;
    }

    public XtraBox(String s) {
        super(s);
        this.tags = new Vector();
        this.successfulParse = false;
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.remaining();
        this.data = byteBuffer0.slice();
        this.successfulParse = false;
        try {
            this.tags.clear();
            while(byteBuffer0.remaining() > 0) {
                XtraTag xtraBox$XtraTag0 = new XtraTag(null);
                xtraBox$XtraTag0.parse(byteBuffer0);
                this.tags.addElement(xtraBox$XtraTag0);
            }
            int v2 = this.detailSize();
            if(v != v2) {
                throw new RuntimeException("Improperly handled Xtra tag: Calculated sizes don\'t match ( " + v + "/" + v2 + ")");
            }
            this.successfulParse = true;
        }
        catch(Exception exception0) {
            this.successfulParse = false;
            XtraBox.LOG.I("Malformed Xtra Tag detected: {}", exception0.toString());
            byteBuffer0.position(byteBuffer0.position() + byteBuffer0.remaining());
        }
        finally {
            byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        }
    }

    static long access$3(long v) {
        return v / 10000L - 11644473600000L;
    }

    static long access$5(long v) {
        return (v + 11644473600000L) * 10000L;
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("XtraBox.java", XtraBox.class);
        XtraBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.microsoft.XtraBox", "", "", "", "java.lang.String"), 0x88);
        XtraBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAllTagNames", "org.mp4parser.boxes.microsoft.XtraBox", "", "", "", "[Ljava.lang.String;"), 0xC5);
        XtraBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTagValue", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:long", "name:value", "", "void"), 330);
        XtraBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getFirstStringValue", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.lang.String"), 0xD4);
        XtraBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getFirstDateValue", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.util.Date"), 0xE4);
        XtraBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getFirstLongValue", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.lang.Long"), 0xF4);
        XtraBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getValues", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "[Ljava.lang.Object;"), 260);
        XtraBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "removeTag", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "void"), 279);
        XtraBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTagValues", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:[Ljava.lang.String;", "name:values", "", "void"), 292);
        XtraBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTagValue", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:java.lang.String", "name:value", "", "void"), 307);
        XtraBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTagValue", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:java.util.Date", "name:date", "", "void"), 317);
    }

    private int detailSize() {
        int v1 = 0;
        for(int v = 0; v < this.tags.size(); ++v) {
            v1 += ((XtraTag)this.tags.elementAt(v)).getContentSize();
        }
        return v1;
    }

    private static long filetimeToMillis(long v) [...] // Inlined contents

    public String[] getAllTagNames() {
        JoinPoint joinPoint0 = Factory.makeJP(XtraBox.ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        String[] arr_s = new String[this.tags.size()];
        for(int v = 0; v < this.tags.size(); ++v) {
            arr_s[v] = ((XtraTag)this.tags.elementAt(v)).tagName;
        }
        return arr_s;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        if(this.successfulParse) {
            for(int v = 0; v < this.tags.size(); ++v) {
                ((XtraTag)this.tags.elementAt(v)).getContent(byteBuffer0);
            }
            return;
        }
        this.data.rewind();
        byteBuffer0.put(this.data);
    }

    // 去混淆评级： 低(20)
    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.successfulParse ? ((long)this.detailSize()) : ((long)this.data.limit());
    }

    public Date getFirstDateValue(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(XtraBox.ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        Object[] arr_object = this.getValues(s);
        for(int v = 0; true; ++v) {
            if(v >= arr_object.length) {
                return null;
            }
            Object object0 = arr_object[v];
            if(object0 instanceof Date) {
                return (Date)object0;
            }
        }
    }

    public Long getFirstLongValue(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(XtraBox.ajc$tjp_4, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        Object[] arr_object = this.getValues(s);
        for(int v = 0; true; ++v) {
            if(v >= arr_object.length) {
                return null;
            }
            Object object0 = arr_object[v];
            if(object0 instanceof Long) {
                return (Long)object0;
            }
        }
    }

    public String getFirstStringValue(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(XtraBox.ajc$tjp_2, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        Object[] arr_object = this.getValues(s);
        for(int v = 0; true; ++v) {
            if(v >= arr_object.length) {
                return null;
            }
            Object object0 = arr_object[v];
            if(object0 instanceof String) {
                return (String)object0;
            }
        }
    }

    private XtraTag getTagByName(String s) {
        XtraTag xtraBox$XtraTag0;
        Iterator iterator0 = this.tags.iterator();
        do {
            if(!iterator0.hasNext()) {
                return null;
            }
            Object object0 = iterator0.next();
            xtraBox$XtraTag0 = (XtraTag)object0;
        }
        while(!xtraBox$XtraTag0.tagName.equals(s));
        return xtraBox$XtraTag0;
    }

    public Object[] getValues(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(XtraBox.ajc$tjp_5, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        XtraTag xtraBox$XtraTag0 = this.getTagByName(s);
        if(xtraBox$XtraTag0 != null) {
            Object[] arr_object = new Object[xtraBox$XtraTag0.values.size()];
            for(int v = 0; v < xtraBox$XtraTag0.values.size(); ++v) {
                arr_object[v] = ((XtraValue)xtraBox$XtraTag0.values.elementAt(v)).getValueAsObject();
            }
            return arr_object;
        }
        return new Object[0];
    }

    private static long millisToFiletime(long v) [...] // Inlined contents

    private static String readAsciiString(ByteBuffer byteBuffer0, int v) {
        byte[] arr_b = new byte[v];
        byteBuffer0.get(arr_b);
        try {
            return new String(arr_b, "US-ASCII");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException("Shouldn\'t happen", unsupportedEncodingException0);
        }
    }

    private static String readUtf16String(ByteBuffer byteBuffer0, int v) {
        int v1 = v / 2 - 1;
        char[] arr_c = new char[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_c[v2] = byteBuffer0.getChar();
        }
        byteBuffer0.getChar();
        return new String(arr_c);
    }

    public void removeTag(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(XtraBox.ajc$tjp_6, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        XtraTag xtraBox$XtraTag0 = this.getTagByName(s);
        if(xtraBox$XtraTag0 != null) {
            this.tags.remove(xtraBox$XtraTag0);
        }
    }

    public void setTagValue(String s, long v) {
        JoinPoint joinPoint0 = Factory.makeJP(XtraBox.ajc$tjp_10, this, this, s, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.removeTag(s);
        XtraTag xtraBox$XtraTag0 = new XtraTag(s, null);
        xtraBox$XtraTag0.values.addElement(new XtraValue(v, null));
        this.tags.addElement(xtraBox$XtraTag0);
    }

    public void setTagValue(String s, String s1) {
        JoinPoint joinPoint0 = Factory.makeJP(XtraBox.ajc$tjp_8, this, this, s, s1);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.setTagValues(s, new String[]{s1});
    }

    public void setTagValue(String s, Date date0) {
        JoinPoint joinPoint0 = Factory.makeJP(XtraBox.ajc$tjp_9, this, this, s, date0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.removeTag(s);
        XtraTag xtraBox$XtraTag0 = new XtraTag(s, null);
        xtraBox$XtraTag0.values.addElement(new XtraValue(date0, null));
        this.tags.addElement(xtraBox$XtraTag0);
    }

    public void setTagValues(String s, String[] arr_s) {
        JoinPoint joinPoint0 = Factory.makeJP(XtraBox.ajc$tjp_7, this, this, s, arr_s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.removeTag(s);
        XtraTag xtraBox$XtraTag0 = new XtraTag(s, null);
        for(int v = 0; v < arr_s.length; ++v) {
            xtraBox$XtraTag0.values.addElement(new XtraValue(arr_s[v], null));
        }
        this.tags.addElement(xtraBox$XtraTag0);
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(XtraBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(!this.isParsed()) {
            this.parseDetails();
        }
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append("XtraBox[");
        for(Object object0: this.tags) {
            XtraTag xtraBox$XtraTag0 = (XtraTag)object0;
            Iterator iterator1 = xtraBox$XtraTag0.values.iterator();
            while(iterator1.hasNext()) {
                iterator1.next();
                stringBuffer0.append(xtraBox$XtraTag0.tagName);
                stringBuffer0.append("=");
                stringBuffer0.append("[GUID](nonParsed)");
                stringBuffer0.append(";");
            }
        }
        stringBuffer0.append("]");
        return stringBuffer0.toString();
    }

    private static void writeAsciiString(ByteBuffer byteBuffer0, String s) {
        try {
            byteBuffer0.put(s.getBytes("US-ASCII"));
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException("Shouldn\'t happen", unsupportedEncodingException0);
        }
    }

    private static void writeUtf16String(ByteBuffer byteBuffer0, String s) {
        char[] arr_c = s.toCharArray();
        for(int v = 0; v < arr_c.length; ++v) {
            byteBuffer0.putChar(arr_c[v]);
        }
        byteBuffer0.putChar('\u0000');
    }

    class org.mp4parser.boxes.microsoft.XtraBox.1 {
    }

}

