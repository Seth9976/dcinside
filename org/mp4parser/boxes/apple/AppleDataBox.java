package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.DoNotParseDetail;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public abstract class AppleDataBox extends AbstractBox {
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    int dataCountry;
    int dataLanguage;
    int dataType;
    private static HashMap language;

    static {
        AppleDataBox.ajc$preClinit();
        HashMap hashMap0 = new HashMap();
        AppleDataBox.language = hashMap0;
        hashMap0.put("0", "English");
        AppleDataBox.language.put("1", "French");
        AppleDataBox.language.put("2", "German");
        AppleDataBox.language.put("3", "Italian");
        AppleDataBox.language.put("4", "Dutch");
        AppleDataBox.language.put("5", "Swedish");
        AppleDataBox.language.put("6", "Spanish");
        AppleDataBox.language.put("7", "Danish");
        AppleDataBox.language.put("8", "Portuguese");
        AppleDataBox.language.put("9", "Norwegian");
        AppleDataBox.language.put("10", "Hebrew");
        AppleDataBox.language.put("11", "Japanese");
        AppleDataBox.language.put("12", "Arabic");
        AppleDataBox.language.put("13", "Finnish");
        AppleDataBox.language.put("14", "Greek");
        AppleDataBox.language.put("15", "Icelandic");
        AppleDataBox.language.put("16", "Maltese");
        AppleDataBox.language.put("17", "Turkish");
        AppleDataBox.language.put("18", "Croatian");
        AppleDataBox.language.put("19", "Traditional_Chinese");
        AppleDataBox.language.put("20", "Urdu");
        AppleDataBox.language.put("21", "Hindi");
        AppleDataBox.language.put("22", "Thai");
        AppleDataBox.language.put("23", "Korean");
        AppleDataBox.language.put("24", "Lithuanian");
        AppleDataBox.language.put("25", "Polish");
        AppleDataBox.language.put("26", "Hungarian");
        AppleDataBox.language.put("27", "Estonian");
        AppleDataBox.language.put("28", "Lettish");
        AppleDataBox.language.put("29", "Sami");
        AppleDataBox.language.put("30", "Faroese");
        AppleDataBox.language.put("31", "Farsi");
        AppleDataBox.language.put("32", "Russian");
        AppleDataBox.language.put("33", "Simplified_Chinese");
        AppleDataBox.language.put("34", "Flemish");
        AppleDataBox.language.put("35", "Irish");
        AppleDataBox.language.put("36", "Albanian");
        AppleDataBox.language.put("37", "Romanian");
        AppleDataBox.language.put("38", "Czech");
        AppleDataBox.language.put("39", "Slovak");
        AppleDataBox.language.put("40", "Slovenian");
        AppleDataBox.language.put("41", "Yiddish");
        AppleDataBox.language.put("42", "Serbian");
        AppleDataBox.language.put("43", "Macedonian");
        AppleDataBox.language.put("44", "Bulgarian");
        AppleDataBox.language.put("45", "Ukrainian");
        AppleDataBox.language.put("46", "Belarusian");
        AppleDataBox.language.put("47", "Uzbek");
        AppleDataBox.language.put("48", "Kazakh");
        AppleDataBox.language.put("49", "Azerbaijani");
        AppleDataBox.language.put("50", "AzerbaijanAr");
        AppleDataBox.language.put("51", "Armenian");
        AppleDataBox.language.put("52", "Georgian");
        AppleDataBox.language.put("53", "Moldavian");
        AppleDataBox.language.put("54", "Kirghiz");
        AppleDataBox.language.put("55", "Tajiki");
        AppleDataBox.language.put("56", "Turkmen");
        AppleDataBox.language.put("57", "Mongolian");
        AppleDataBox.language.put("58", "MongolianCyr");
        AppleDataBox.language.put("59", "Pashto");
        AppleDataBox.language.put("60", "Kurdish");
        AppleDataBox.language.put("61", "Kashmiri");
        AppleDataBox.language.put("62", "Sindhi");
        AppleDataBox.language.put("63", "Tibetan");
        AppleDataBox.language.put("64", "Nepali");
        AppleDataBox.language.put("65", "Sanskrit");
        AppleDataBox.language.put("66", "Marathi");
        AppleDataBox.language.put("67", "Bengali");
        AppleDataBox.language.put("68", "Assamese");
        AppleDataBox.language.put("69", "Gujarati");
        AppleDataBox.language.put("70", "Punjabi");
        AppleDataBox.language.put("71", "Oriya");
        AppleDataBox.language.put("72", "Malayalam");
        AppleDataBox.language.put("73", "Kannada");
        AppleDataBox.language.put("74", "Tamil");
        AppleDataBox.language.put("75", "Telugu");
        AppleDataBox.language.put("76", "Sinhala");
        AppleDataBox.language.put("77", "Burmese");
        AppleDataBox.language.put("78", "Khmer");
        AppleDataBox.language.put("79", "Lao");
        AppleDataBox.language.put("80", "Vietnamese");
        AppleDataBox.language.put("81", "Indonesian");
        AppleDataBox.language.put("82", "Tagalog");
        AppleDataBox.language.put("83", "MalayRoman");
        AppleDataBox.language.put("84", "MalayArabic");
        AppleDataBox.language.put("85", "Amharic");
        AppleDataBox.language.put("87", "Galla");
        AppleDataBox.language.put("87", "Oromo");
        AppleDataBox.language.put("88", "Somali");
        AppleDataBox.language.put("89", "Swahili");
        AppleDataBox.language.put("90", "Kinyarwanda");
        AppleDataBox.language.put("91", "Rundi");
        AppleDataBox.language.put("92", "Nyanja");
        AppleDataBox.language.put("93", "Malagasy");
        AppleDataBox.language.put("94", "Esperanto");
        AppleDataBox.language.put("128", "Welsh");
        AppleDataBox.language.put("129", "Basque");
        AppleDataBox.language.put("130", "Catalan");
        AppleDataBox.language.put("131", "Latin");
        AppleDataBox.language.put("132", "Quechua");
        AppleDataBox.language.put("133", "Guarani");
        AppleDataBox.language.put("134", "Aymara");
        AppleDataBox.language.put("135", "Tatar");
        AppleDataBox.language.put("136", "Uighur");
        AppleDataBox.language.put("137", "Dzongkha");
        AppleDataBox.language.put("138", "JavaneseRom");
        AppleDataBox.language.put("32767", "Unspecified");
    }

    protected AppleDataBox(String s, int v) {
        super(s);
        this.dataType = v;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseData(this.parseDataLength4ccTypeCountryLanguageAndReturnRest(byteBuffer0));
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AppleDataBox.java", AppleDataBox.class);
        AppleDataBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLanguageString", "org.mp4parser.boxes.apple.AppleDataBox", "", "", "", "java.lang.String"), 0x8A);
        AppleDataBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDataType", "org.mp4parser.boxes.apple.AppleDataBox", "", "", "", "int"), 0x9C);
        AppleDataBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDataCountry", "org.mp4parser.boxes.apple.AppleDataBox", "", "", "", "int"), 0xA0);
        AppleDataBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDataCountry", "org.mp4parser.boxes.apple.AppleDataBox", "int", "dataCountry", "", "void"), 0xA4);
        AppleDataBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDataLanguage", "org.mp4parser.boxes.apple.AppleDataBox", "", "", "", "int"), 0xA8);
        AppleDataBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDataLanguage", "org.mp4parser.boxes.apple.AppleDataBox", "int", "dataLanguage", "", "void"), 0xAC);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeDataLength4ccTypeCountryLanguage(byteBuffer0);
        byteBuffer0.put(this.writeData());
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(this.getDataLength() + 16);
    }

    public int getDataCountry() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleDataBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.dataCountry;
    }

    public int getDataLanguage() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleDataBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.dataLanguage;
    }

    protected abstract int getDataLength();

    public int getDataType() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleDataBox.ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.dataType;
    }

    public String getLanguageString() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleDataBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        HashMap hashMap0 = AppleDataBox.language;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.dataLanguage);
        String s = (String)hashMap0.get(stringBuilder0.toString());
        if(s == null) {
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[2]);
            IsoTypeWriter.writeUInt16(byteBuffer0, this.dataLanguage);
            ByteBuffer byteBuffer1 = (ByteBuffer)byteBuffer0.reset();
            return new Locale(IsoTypeReader.readIso639(byteBuffer0)).getDisplayLanguage();
        }
        return s;
    }

    protected abstract void parseData(ByteBuffer arg1);

    @DoNotParseDetail
    protected ByteBuffer parseDataLength4ccTypeCountryLanguageAndReturnRest(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.getInt();
        byteBuffer0.getInt();
        this.dataType = byteBuffer0.getInt();
        int v1 = byteBuffer0.getShort();
        this.dataCountry = v1;
        if(v1 < 0) {
            this.dataCountry = v1 + 0x10000;
        }
        int v2 = byteBuffer0.getShort();
        this.dataLanguage = v2;
        if(v2 < 0) {
            this.dataLanguage = v2 + 0x10000;
        }
        ByteBuffer byteBuffer1 = (ByteBuffer)byteBuffer0.duplicate().slice().limit(v - 16);
        byteBuffer0.position(v - 16 + byteBuffer0.position());
        return byteBuffer1;
    }

    public void setDataCountry(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleDataBox.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.dataCountry = v;
    }

    public void setDataLanguage(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleDataBox.ajc$tjp_5, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.dataLanguage = v;
    }

    protected abstract byte[] writeData();

    @DoNotParseDetail
    protected void writeDataLength4ccTypeCountryLanguage(ByteBuffer byteBuffer0) {
        byteBuffer0.putInt(this.getDataLength() + 16);
        byteBuffer0.put("data".getBytes());
        byteBuffer0.putInt(this.dataType);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.dataCountry);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.dataLanguage);
    }
}

