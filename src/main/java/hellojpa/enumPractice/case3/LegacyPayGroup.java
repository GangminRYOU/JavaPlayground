package hellojpa.enumPractice.case3;

public class LegacyPayGroup {
    public static String getPayGroup(String payCode){
        if("ACCOUNT_TRANSFER".equals(payCode) || "REMITTANCE".equals(payCode) || "ON_SITE_PAYMENT".equals(payCode) || "TOSS".equals(payCode)){
            return "CASH";
        } else if ("PAYCO".equals(payCode) || "CARD".equals(payCode) || "KAKAO_PAY".equals(payCode) || "BAEMIN_PAY".equals(payCode)) {
            return "CARD";
        } else if ("POINT".equals(payCode) || "COUPON".equals(payCode)) {
            return "ETC";
        } else {
            return "EMPTY";
        }
    }

    // 예금 입금 기능
    public void pushByPayGroup(final String payGroupCode){
        if("CASH".equals(payGroupCode)){
            pushCashMethod();
        } else if ("CARD".equals(payGroupCode)){
            pushCardMethod();
        } else if ("ETC".equals(payGroupCode)) {
            pushEtcMethod();
        } else {
            throw new RuntimeException("payGroupCode가 없습니다.");
        }
    }

    // 잔고 조회 기능
    public void printByPayGroup(final String payGroupCode){
        if("CASH".equals(payGroupCode)){
            doCashMethod();
        } else if ("CARD".equals(payGroupCode)) {
            doCardMethod();
        } else if ("ETC".equals(payGroupCode)) {
            doEtcMethod();
        }else {
            throw new RuntimeException("payGroupCode가 없습니다.");
        }
    }

    private void doEtcMethod() {
    }

    private void doCardMethod() {
    }

    private void doCashMethod() {
    }

    private void pushEtcMethod() {
    }

    private void pushCardMethod() {
    }

    private void pushCashMethod() {

    }
}
