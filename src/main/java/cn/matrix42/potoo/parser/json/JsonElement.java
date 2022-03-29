package cn.matrix42.potoo.parser.json;

public interface JsonElement {

    boolean isJsonObject();

    boolean isJsonArray();

    boolean isJsonLiteral();

    boolean isNull();

    String toJsonString();

    String toJsonString(boolean pretty);

}
