package cn.matrix42.potoo.parser.json;

public class JsonBuilder {

    JsonRoot root = new JsonRoot();

    public JsonBuilder addJsonLiteral(JsonLiteral jsonLiteral) {
        root.add(jsonLiteral);
        return this;
    }

    public JsonBuilder addJsonArray(JsonArray jsonArray) {
        root.add(jsonArray);
        return this;
    }

    public JsonBuilder addJsonObject(JsonObject jsonObject) {
        root.add(jsonObject);
        return this;
    }

    public JsonRoot build() {
        return root;
    }

}
