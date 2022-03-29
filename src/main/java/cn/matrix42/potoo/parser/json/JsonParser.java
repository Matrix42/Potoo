package cn.matrix42.potoo.parser.json;

import cn.matrix42.potoo.parser.Parser;

public interface JsonParser extends Parser {

    JsonNode parseJson(String json);

}
