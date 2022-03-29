package cn.matrix42.potoo.parser.json;

import java.util.Map.Entry;
import java.util.Set;

import cn.matrix42.potoo.lang.StringUtils;

public class JsonRoot extends JsonObject {

    public JsonRoot() {
    }

    @Override
    protected String toNormalJson() {
        StringBuilder sb = new StringBuilder();
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
        return sb.toString();
    }

    @Override
    protected String toPrettyJson(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        Set<Entry<String, JsonNode>> entrySet = map.entrySet();
        int i = 0;
        for (Entry<String, JsonNode> entry : entrySet) {
            sb.append(StringUtils.repeat(' ', 2 * level));
            sb.append("\"").append(entry.getKey()).append("\"").append(":");
            sb.append(entry.getValue().toPrettyJson(level + 1));
            if (i < entrySet.size() - 1) {
                sb.append(",\n");
            }
            i++;
        }
        if (!entrySet.isEmpty()) {
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public void add(String key, JsonNode value) {
        map.put(key, value);
    }

}
