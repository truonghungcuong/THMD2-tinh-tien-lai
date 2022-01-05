import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money=1.0;
        int month=1;
        double interestRate=1.0;
        double totalInterest=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tiền đầu tư: ");
        money= scanner.nextDouble();
        System.out.println("Số tháng: ");
        month= scanner.nextInt();
        System.out.println("lãi suất hàng năm: ");
        interestRate= scanner.nextDouble();
        for (int i=0;i<month;i++){
            totalInterest +=money*(interestRate/100)/12*month;
        }
        System.out.println("Tổng số tiền lãi: "+totalInterest);
    }
}
