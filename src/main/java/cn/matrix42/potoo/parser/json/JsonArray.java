package cn.matrix42.potoo.parser.json;

import java.util.ArrayList;
import java.util.List;

import cn.matrix42.potoo.lang.StringUtils;

public class JsonArray extends JsonNode {

    private ObjectType objectType;
    protected List<JsonNode> list = new ArrayList<>();

    public JsonArray(String key, ObjectType objectType) {
        super(key);
        this.objectType = objectType;
    }

    public JsonArray(String key, boolean nullValue) {
        super(key);
        this.list = null;
    }

    @Override
    public boolean isJsonMap() {
        return false;
    }

    @Override
    public boolean isJsonArray() {
        return true;
    }

    @Override
    public boolean isJsonLiteral() {
        return false;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    public JsonArray add(JsonLiteral jsonLiteral) {
        addInternal(jsonLiteral);
        return this;
    }

    public JsonArray add(JsonArray jsonArray) {
        addInternal(jsonArray);
        return this;
    }

    public JsonArray add(JsonObject jsonObject) {
        addInternal(jsonObject);
        return this;
    }

    private void addInternal(JsonNode jsonNode) {
        if (list == null) {
            throw new NullPointerException();
        }
        if (jsonNode != null && jsonNode.getClass() != objectType.getObjectType()) {
            throw new IllegalArgumentException();
        }
        list.add(jsonNode);
    }

    @Override
    protected String toNormalJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"").append(key).append("\"").append(":");
        if (list == null) {
            sb.append("null");
        } else {
            sb.append("[");
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i).toNormalJson());
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append("]");
        }
        return sb.toString();
    }

    @Override
    protected String toPrettyJson(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.repeat(' ', 2 * level));
        sb.append("\"").append(key).append("\"").append(":");
        if (list == null) {
            sb.append("null");
        } else {
            sb.append("[\n");
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i).toPrettyJson(level + 1));
                if (i < list.size() - 1) {
                    sb.append(",\n");
                }
            }
            if (!list.isEmpty()) {
                sb.append("\n");
                sb.append(StringUtils.repeat(' ', 2 * level));
            }
            sb.append("]");
        }
        return sb.toString();
    }

}
