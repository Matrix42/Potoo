package cn.matrix42.potoo.parser.json;

import java.util.Map.Entry;
import java.util.Set;

import cn.matrix42.potoo.lang.StringUtils;

public class JsonRoot extends JsonMap {

    public JsonRoot() {
        super(null);
    }

    @Override
    protected String toNormalJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Set<Entry<String, JsonNode>> entrySet = map.entrySet();
        int i = 0;
        for (Entry<String, JsonNode> entry : entrySet) {
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
        sb.append(StringUtils.repeat(' ', 2 * level));
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
        sb.append("\n");
        sb.append(StringUtils.repeat(' ', 2 * level));
        sb.append("}");
        return sb.toString();
    }

    public void add(JsonNode value) {
        map.put(value.getKey(), value);
    }

}
