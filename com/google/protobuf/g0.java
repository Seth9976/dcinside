package com.google.protobuf;

final class g0 {
    interface c {
        byte byteAt(int arg1);

        int size();
    }

    static String escapeBytes(ByteString byteString0) {
        class a implements c {
            final ByteString val$input;

            a(ByteString byteString0) {
            }

            @Override  // com.google.protobuf.g0$c
            public byte byteAt(int v) {
                return this.val$input.byteAt(v);
            }

            @Override  // com.google.protobuf.g0$c
            public int size() {
                return this.val$input.size();
            }
        }

        return g0.escapeBytes(new a(byteString0));
    }

    static String escapeBytes(c g0$c0) {
        StringBuilder stringBuilder0 = new StringBuilder(g0$c0.size());
        for(int v = 0; v < g0$c0.size(); ++v) {
            int v1 = g0$c0.byteAt(v);
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

    static String escapeBytes(byte[] arr_b) {
        class b implements c {
            final byte[] val$input;

            b(byte[] arr_b) {
            }

            @Override  // com.google.protobuf.g0$c
            public byte byteAt(int v) {
                return this.val$input[v];
            }

            @Override  // com.google.protobuf.g0$c
            public int size() {
                return this.val$input.length;
            }
        }

        return g0.escapeBytes(new b(arr_b));
    }

    static String escapeDoubleQuotesAndBackslashes(String s) {
        return s.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    static String escapeText(String s) {
        return g0.escapeBytes(ByteString.copyFromUtf8(s));
    }
}

