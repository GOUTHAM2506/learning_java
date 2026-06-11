public class Student_Data {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Goutham", 69);
        Student s2 = new Student(2, "Sudharshan", 87);
        Student s3 = new Student(3, "Bhuvanesh", 72);
        Student arr[] = { s1, s2, s3 };
        for (int i = 0; i < arr.length; i++) {
            // Student s = arr[i];
            if (arr[i].marks >= 70) {
                System.out.println(arr[i]);
            }
        }
    }
}