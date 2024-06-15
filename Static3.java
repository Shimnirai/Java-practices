
    class student{
        String name;
        int rollNo;
        static String clgName;
        static int counter = 0;

        public student(String name){
            this.name = name;
            this.rollNo = setRollNo();
        }
        static int setRollNo(){
            counter++;
            return counter;
        }
        static void setClgName(String name){
            clgName = name;
        }
        void getStudentInfo(){
            System.out.println("Name: " + this.name);
            System.out.println("RollNo: " + this.rollNo);
            System.out.println("ClgName: " + clgName);
        }
    }
    public class Static3 {
        public static void main(String[] args) {
            student.setClgName("xyz");

            student s1 = new student("Sanjana");
            student s2 = new student("Yazhini");

            s1.getStudentInfo();
            s2.getStudentInfo();
        }
}
