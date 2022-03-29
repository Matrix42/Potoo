package cn.matrix42.potoo.parser.json;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import cn.matrix42.potoo.lang.StringUtils;

public class JsonObject extends JsonNode {

    protected Map<String, JsonNode> map = new LinkedHashMap<>();

    public JsonObject(String key) {
        super(key);
    }

    public JsonObject(String key, boolean nullValue) {
        super(key);
        if (nullValue) {
            map = null;
        }
    }

    @Override
    public boolean isJsonMap() {
        return true;
    }

    @Override
    public boolean isJsonArray() {
        return false;
    }

    @Override
    public boolean isJsonLiteral() {
        return false;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    public JsonObject add(JsonLiteral jsonLiteral) {
        addInternal(jsonLiteral);
        return this;
    }

    public JsonObject add(JsonArray jsonArray) {
        addInternal(jsonArray);
        return this;
    }

    public JsonObject add(JsonObject jsonObject) {
        addInternal(jsonObject);
        return this;
    }

    private void addInternal(JsonNode jsonNode) {
        map.put(jsonNode.getKey(), jsonNode);
    }

    public Set<String> getKeySet() {
        return Collections.unmodifiableSet(map.keySet());
    }

    public Collection<JsonNode> getValueSet() {
        return Collections.unmodifiableCollection(map.values());
    }

    @Override
    protected String toNormalJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"").append(key).append("\"").append(":");
        sb.append("{");
        Set<Entry<String, JsonNode>> entrySet = map.entrySet();
        int i = 0;
        for (Entry<String, JsonNode> entry : entrySet) {
            sb.append("\"").append(entry.getKey()).append("\"")
                .append(":")
                .append(entry.getValue().toNormalJson());
            if (i < entrySet.size() - 1) {
                sb.append(",");
            }
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    protected String toPrettyJson(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.repeat(' ', 2 * level));
        sb.append("\"").append(key).append("\"").append(":");
        sb.append("{\n");
        Set<Entry<String, JsonNode>> entrySet = map.entrySet();
        int i = 0;
        for (Entry<String, JsonNode> entry : entrySet) {
            sb.append(entry.getValue().toPrettyJson(level + 1));
            if (i < entrySet.size() - 1) {
                sb.append(",\n");
            }
            i++;
        }
        if (!entrySet.isEmpty()) {
            sb.append("\n");
            sb.append(StringUtils.repeat(' ', 2 * level));
        }
        sb.append("}");
        return sb.toString();
    }

}
