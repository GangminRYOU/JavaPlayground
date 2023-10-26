package hellojpa.enumPractice.case2;

import java.util.Random;

public class LegacyCalculator {
    public static long calculate(String code, long originalValue){
        if("CALC_A".equals(code)){
            return originalValue;
        } else if ("CALC_B".equals(code)) {
            return originalValue * 10;
        } else if ("CALC_C".equals(code)) {
            return originalValue * 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // 기존 코드
        String code = selectCode();
        long originalValue = 10000L;
        long result = LegacyCalculator.calculate(code, originalValue);
        System.out.println(result);

        //Enum을 사용해 개선한 코드
        CalculatorType enumTypeCode = selectType();
        long result2 = enumTypeCode.calculate(originalValue);
        System.out.println(result2);
    }

    private static String selectCode(){
        //return "CALC_A";
        //return "CALC_B";
        return "CALC_C";
    }

    private static CalculatorType selectType(){
        return CalculatorType.values()[new Random().nextInt() % 3];
    }
}
