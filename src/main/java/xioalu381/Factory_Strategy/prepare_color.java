package xioalu381.Factory_Strategy;

import java.util.HashMap;
import java.util.Map;

public class prepare_color {
    private static Map<String, color> cellphone = new HashMap<>();

//    工厂模式
    static {
        cellphone.put("yellow", new yellow());
        cellphone.put("green", new green());
        cellphone.put("red", new red());
    }

    public static color getcolor(String color) {
        return cellphone.get(color);
    }
}
