package cn.matrix42.potoo.parser.json;

import cn.matrix42.potoo.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public abstract class JsonNode implements JsonElement {

    public JsonNode() {
    }

    public abstract boolean isJsonObject();

    public abstract boolean isJsonArray();

    public abstract boolean isJsonLiteral();

    protected abstract String toNormalJson();

    protected abstract String toPrettyJson(int level);

    protected String align(int level) {
        return StringUtils.repeat(' ', 2 * level);
    }

    public List<String> read(String path) {
        return new ArrayList<>();
    }

    @Override
    public String toJsonString() {
        return toNormalJson();
    }

    @Override
    public String toJsonString(boolean pretty) {
        if (pretty) {
            return toPrettyJson(1);
        } else {
            return toNormalJson();
        }
    }

}
