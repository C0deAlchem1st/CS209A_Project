import java.util.ArrayList;

public class Test {
    // 本Test仅用于测试，开发完成后删除
    public static void main(String[] args) {
        DataProcess dp = new DataProcess();
        dp.readData("owid-covid-data.csv", ",");
        dp.saveAsFile();
    }
}
