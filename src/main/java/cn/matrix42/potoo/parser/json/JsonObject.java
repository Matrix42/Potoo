package cn.matrix42.potoo.parser.json;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JsonObject extends JsonNode {

    protected Map<String, JsonNode> map = new LinkedHashMap<>();

    public JsonObject() {
    }

    public JsonObject(boolean nullValue) {
        if (nullValue) {
            map = null;
        }
    }

    @Override
    public boolean isJsonObject() {
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

    @Override
    protected String toNormalJson() {
        StringBuilder sb = new StringBuilder();
        if (map == null) {
            sb.append("null");
        } else {
            sb.append("{");
            Set<Entry<String, JsonNode>> entrySet = map.entrySet();
            int i = 0;
            for (Entry<String, JsonNode> entry : entrySet) {
                sb.append("\"").append(entry.getKey()).append("\"").append(":");
                sb.append(entry.getValue().toNormalJson());
                if (i < entrySet.size() - 1) {
                    sb.append(",");
                }
                i++;
            }
            sb.append("}");
        }
        return sb.toString();
    }

    @Override
    protected String toPrettyJson(int level) {
        StringBuilder sb = new StringBuilder();
        if (map == null) {
            sb.append("null");
        } else {
            sb.append("{\n");
            Set<Entry<String, JsonNode>> entrySet = map.entrySet();
            int i = 0;
            for (Entry<String, JsonNode> entry : entrySet) {
                sb.append(align(level));
                sb.append("\"").append(entry.getKey()).append("\"").append(":");
                sb.append(entry.getValue().toPrettyJson(level + 1));
                if (i < entrySet.size() - 1) {
                    sb.append(",\n");
                }
                i++;
            }
            if (!entrySet.isEmpty()) {
                sb.append("\n");
                sb.append(align(level - 1));
            }
            sb.append("}");
        }
        return sb.toString();
    }

    public JsonObject add(String key, JsonLiteral jsonLiteral) {
        addInternal(key, jsonLiteral);
        return this;
    }

    public JsonObject add(String key, JsonArray jsonArray) {
        addInternal(key, jsonArray);
        return this;
    }

    public JsonObject add(String key, JsonObject jsonObject) {
        addInternal(key, jsonObject);
        return this;
    }

    private void addInternal(String key, JsonNode jsonNode) {
        map.put(key, jsonNode);
    }

    public JsonNode get(String key) {
        if (map == null) {
            throw new NullPointerException();
        }
        return map.get(key);
    }

    public Set<String> getKeySet() {
        return Collections.unmodifiableSet(map.keySet());
    }

    public Collection<JsonNode> getValueSet() {
        return Collections.unmodifiableCollection(map.values());
    }

}
