package hellojpa.mapper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeObjectMapper {

    public static void main(String[] args) {
        String jsonString = "{'Discount': '200', 'Mileage': '0'}";

        int discount = extractIntValue(jsonString, "Discount");
        int mileage = extractIntValue(jsonString, "Mileage");

        System.out.println("Discount: " + discount);
        System.out.println("Mileage: " + mileage);
    }

    private static int extractIntValue(String jsonString, String fieldName) {
        Pattern pattern = Pattern.compile("'" + fieldName + "': '\\d+'");
        Matcher matcher = pattern.matcher(jsonString);

        if (matcher.find()) {
            String fieldValue = matcher.group();
            String intValue = fieldValue.replaceAll("\\D", ""); // 숫자를 제외한 모든 문자를 제거하여 숫자 값만 추출
            return Integer.parseInt(intValue);
        }

        return 0; // 해당 필드가 존재하지 않을 경우 기본값인 0을 반환
    }
    static class Benefit{
        private int Discount;
        private int Mileage;

        public int getDiscount() {
            return Discount;
        }

        public int getMileage() {
            return Mileage;
        }

        public void setDiscount(int discount) {
            Discount = discount;
        }

        public void setMileage(int mileage) {
            Mileage = mileage;
        }
    }
}
