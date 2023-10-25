package hellojpa.enumPractice;

public class EnumTest {
    public static class Test1{
        public void originalTableToOtherTables(){
            Original original = new Original(TableStatus.Y);
            TableStatus status = original.getStatus();
            String table1Value = status.getTable1Value();
            boolean table2Value = status.isTable2Value();
        }

        static class Original{
            private TableStatus status;

            public Original(TableStatus status) {
                this.status = status;
            }

            public TableStatus getStatus() {
                return status;
            }
        }
    }
}
