public class Main {
    //Entry point, cửa chính, nơi cuộc chơi bắt đầu CPU vào đây chạy lệnh
    public static void main(String[] args) {
        System.out.println("Xin chào Java.\nWellcome to Java world");
        //sout + tab = System.out.println();
        //~ printf("Xin chào Java.\nWellcome to Java world \n");
        System.out.println("5 + 5 = " + 5 + 5);
        /*
        Trong trường hợp này, Java sẽ thực hiện theo thứ tự từ trái sang phải. Đầu tiên, nó nối chuỗi "5 + 5 = " với chuỗi "5", sau đó nối kết quả của phép cộng chuỗi trước đó với số 5.
        Kết quả: "5 + 5 = 55"
         */
        System.out.println("5 + 5 = " + (5 + 5));
        /*
        Trong trường hợp này, phép cộng số (5 + 5) được đặt trong cặp dấu ngoặc đơn, do đó phép tính này sẽ được thực hiện trước.
        Kết quả: "5 + 5 = 10"
         */
    }
}