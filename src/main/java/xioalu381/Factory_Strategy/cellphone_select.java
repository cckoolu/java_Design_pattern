package xioalu381.Factory_Strategy;


import java.util.Scanner;


public class cellphone_select {
    public static void main(String[] args) {
        //选择的颜色
//        String select_color = "yellow";

        Scanner scanner = new Scanner(System.in);
        String select_color = scanner.nextLine();

        color color= prepare_color.getcolor(select_color);
        color.select();
    }
}
