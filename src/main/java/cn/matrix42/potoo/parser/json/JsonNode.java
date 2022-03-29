package cn.matrix42.potoo.parser.json;

public abstract class JsonNode implements JsonElement {

    protected String key;

    public JsonNode(String key) {
        this.key = key;
    }

    public abstract boolean isJsonMap();

    public abstract boolean isJsonArray();

    public abstract boolean isJsonLiteral();

    protected abstract String toNormalJson();

    protected abstract String toPrettyJson(int level);

    @Override
    public String toJsonString() {
        return toNormalJson();
    }

    @Override
    public String toJsonString(boolean pretty) {
        if (pretty) {
            return toPrettyJson(0);
        } else {
            return toNormalJson();
        }
    }

    public String getKey() {
        return key;
    }
}
