package utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public class Result extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public Result setData(Object data) {
        put("data", data);
        return this;
    }

    //利用fastjson进行反序列化
    public <Type> Type getData(TypeReference<Type> typeReference) {
        Object data = get("data");    //默认是map
        String jsonString = JSON.toJSONString(data);
        Type type = JSON.parseObject(jsonString, typeReference);
        return type;
    }

    //利用fastjson进行反序列化
    public <Type> Type getData(String key, TypeReference<Type> typeReference) {
        Object data = get(key);    //默认是map
        String jsonString = JSON.toJSONString(data);
        Type type = JSON.parseObject(jsonString, typeReference);
        return type;
    }

    public Result() {
        put("code", 0);
        put("msg", "success");
    }

    public static Result error() {
        return error(org.apache.http.HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
    }

    public static Result error(String msg) {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static Result error(int code, String msg) {
        Result result = new Result();
        result.put("code", code);
        result.put("msg", msg);
        return result;
    }

    public static Result ok(String msg) {
        Result result = new Result();
        result.put("msg", msg);
        return result;
    }

    public static Result ok(Map<String, Object> map) {
        Result result = new Result();
        result.putAll(map);
        return result;
    }

    public static Result ok() {
        return new Result();
    }

    public Result put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public Integer getCode() {

        return (Integer) this.get("code");
    }

}
