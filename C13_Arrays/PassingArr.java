package C13_Arrays;

public class PassingArr {
    
    static void total_marks(int marks[]){
        int total =0;
        for (int i = 0; i < marks.length; i++) {
            total+= marks[i];
            marks[i]+=1;

        }
    
    }
    public static void main(String[] args) {
        int marks[]={10,20,30};
        total_marks(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
