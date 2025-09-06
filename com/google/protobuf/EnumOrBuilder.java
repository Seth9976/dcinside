package com.google.protobuf;

import java.util.List;

public interface EnumOrBuilder extends MessageLiteOrBuilder {
    String getEdition();

    ByteString getEditionBytes();

    EnumValue getEnumvalue(int arg1);

    int getEnumvalueCount();

    List getEnumvalueList();

    String getName();

    ByteString getNameBytes();

    Option getOptions(int arg1);

    int getOptionsCount();

    List getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}

