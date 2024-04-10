public class Main {
    public static void main(String[] args) {
        //playWithVariables();
        //playWithIntegers();
        //playWithDoubles();
        //playWithCharacters();
        //playWithBooleans();
        //printIntegerList();
    }
    public static void printIntegerList() {
        System.out.println("The list of 100 first integers");
        System.out.println("1, 2, 3, 4, 5, 6, ...");
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    public static void playWithBooleans() {
        //C: đúng 1, hoặc là lớn hơn 0, sai -> 0
        //Java : đùng -> true, sai -> false => Kiểu dũ liệu boolean
        boolean marriedStatus = true;
        if (marriedStatus == true)
            System.out.println("Đã lập gia đình");
         else
            System.out.println("Chưa lập gia đình");
        System.out.println("Try hard");
    }

    public static void playWithCharacters() {
        //2 byte cho kiểu character, lưu bảng mã unicode
        char m = '$';
        System.out.println("unit : " + m);
        //Tên em thì sao ? C: mảng các kí tự, không primitive nữa rồi, phức tạp rồi
        //char name [] = "Ahihi";
        String name = "Nguyễn Hồng Hanh"; // loại data type hoàn toàn khác
                                          // Phức tạp, do gồm nhiều thứ khác
                                          // Object data type,
        System.out.println("My name is : " + name);
        System.out.println("My name as in a lowercase : " + name.toLowerCase());
        //C: String.h -> strlwr() ...
        System.out.println("1st letter of my name : " + name.charAt(0));
        name.charAt(0);
    }

    //Java ưu tiên double hơn float
    public static void playWithDoubles() {
        double pi = 3.14;
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f", pi);// Tuyệt đối không dùng %lf
        float vat = 0.1F;
        System.out.println("vat : " + vat);
    }
    public static void playWithIntegers() {
        int n = 39;
        //Mọi con số xuất hiện trong code được gọi là literal value, số nguyên xuất hiện trong code mặc định là Integer
        System.out.println("n: " + n);
        long m = 3_000_000_000L;//_ phân cách literal trong code cho dễ đọc
        System.out.println("m: " + m);
        int status = 0xFA; // Hệ 16
        System.out.println("status :" + status);
        int phone = 010; // Số 0 đứng trước => ám chỉ 010 là một số trong hệ 8
        System.out.println(phone);
    }
    //static chỉ chơi với static - OOP
    public static void playWithVariables() {
        //Biến là một vùng ram được đặt tên, chiếm một số byte nhất định tùy loại dữ liệu/thông tin mà nó sẽ chứa bên
        // trong - Data type, biến là cách đặt tên cho 1 đại lượng, 1 giá trị đơn/phức
        int age = 25;
        int a = 100, b;
        b = 100;
        //Tốn 12 byte trong RAM
        System.out.println("age: " + age); // ~ printf("age: %d", age);
        int yearOfBirth = 1999;
        age = 2024 - yearOfBirth;
        System.out.println("age: " + age);
        System.out.println("age by transitive: " + (2024 - yearOfBirth));
        System.out.printf("age printed by %% as in C: %d\n", (2024 - yearOfBirth));
    }
}