package cn.matrix42.potoo.parser.json;

public class JsonBuilder {

    JsonRoot root = new JsonRoot();

    public JsonBuilder addJsonLiteral(String key, JsonLiteral jsonLiteral) {
        root.add(key, jsonLiteral);
        return this;
    }

    public JsonBuilder addJsonArray(String key, JsonArray jsonArray) {
        root.add(key, jsonArray);
        return this;
    }

    public JsonBuilder addJsonObject(String key, JsonObject jsonObject) {
        root.add(key, jsonObject);
        return this;
    }

    public JsonRoot build() {
        return root;
    }

}
