package hellojpa.enumPractice.case1;

public class LegacyCase {
    public String toTable1Value(String originalValue){
        if("Y".equals(originalValue)){
            return "1";
        }else {
            return "0";
        }
    }
    public boolean toTable2Value(String originalValue){
        if("Y".equals(originalValue)){
            return true;
        }else {
            return false;
        }
    }
}
