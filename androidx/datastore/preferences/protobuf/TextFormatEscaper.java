package androidx.datastore.preferences.protobuf;

final class TextFormatEscaper {
    interface ByteSequence {
        byte byteAt(int arg1);

        int size();
    }

    static String a(ByteString byteString0) {
        return TextFormatEscaper.b(new ByteSequence() {
            @Override  // androidx.datastore.preferences.protobuf.TextFormatEscaper$ByteSequence
            public byte byteAt(int v) {
                return byteString0.g(v);
            }

            @Override  // androidx.datastore.preferences.protobuf.TextFormatEscaper$ByteSequence
            public int size() {
                return byteString0.size();
            }
        });
    }

    static String b(ByteSequence textFormatEscaper$ByteSequence0) {
        StringBuilder stringBuilder0 = new StringBuilder(textFormatEscaper$ByteSequence0.size());
        for(int v = 0; v < textFormatEscaper$ByteSequence0.size(); ++v) {
            int v1 = textFormatEscaper$ByteSequence0.byteAt(v);
            switch(v1) {
                case 7: {
                    stringBuilder0.append("\\a");
                    break;
                }
                case 8: {
                    stringBuilder0.append("\\b");
                    break;
                }
                case 9: {
                    stringBuilder0.append("\\t");
                    break;
                }
                case 10: {
                    stringBuilder0.append("\\n");
                    break;
                }
                case 11: {
                    stringBuilder0.append("\\v");
                    break;
                }
                case 12: {
                    stringBuilder0.append("\\f");
                    break;
                }
                case 13: {
                    stringBuilder0.append("\\r");
                    break;
                }
                case 34: {
                    stringBuilder0.append("\\\"");
                    break;
                }
                case 39: {
                    stringBuilder0.append("\\\'");
                    break;
                }
                case 92: {
                    stringBuilder0.append("\\\\");
                    break;
                }
                default: {
                    if(v1 < 0x20 || v1 > 0x7E) {
                        stringBuilder0.append('\\');
                        stringBuilder0.append(((char)((v1 >>> 6 & 3) + 0x30)));
                        stringBuilder0.append(((char)((v1 >>> 3 & 7) + 0x30)));
                        stringBuilder0.append(((char)((v1 & 7) + 0x30)));
                    }
                    else {
                        stringBuilder0.append(((char)v1));
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    static String c(byte[] arr_b) {
        return TextFormatEscaper.b(new ByteSequence() {
            @Override  // androidx.datastore.preferences.protobuf.TextFormatEscaper$ByteSequence
            public byte byteAt(int v) {
                return arr_b[v];
            }

            @Override  // androidx.datastore.preferences.protobuf.TextFormatEscaper$ByteSequence
            public int size() {
                return arr_b.length;
            }
        });
    }

    static String d(String s) {
        return s.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    static String e(String s) {
        return TextFormatEscaper.a(ByteString.r(s));
    }
}

