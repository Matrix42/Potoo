package cn.matrix42.potoo.parser.json;

import java.util.ArrayList;
import java.util.List;

import cn.matrix42.potoo.lang.StringUtils;

public class JsonArray extends JsonNode {

    protected List<JsonNode> list = new ArrayList<>();

    public JsonArray(String key) {
        super(key);
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

    @Override
    protected String toNormalJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"").append(key).append("\"").append(":");
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toNormalJson());
            if (i <= list.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    protected String toPrettyJson(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.repeat(' ', 2 * level));
        sb.append("\"").append(key).append("\"").append(":");
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toPrettyJson(level + 1));
            if (i <= list.size() - 1) {
                sb.append(",\n");
            }
        }
        sb.append("\n");
        sb.append(StringUtils.repeat(' ', 2 * level));
        sb.append("]");
        return sb.toString();
    }

}
