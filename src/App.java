import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Holidays holiday = new Holidays();

        System.out.println("Escolha uma data, ou deixe em branco para ver todos os feriados:");
        String date = sc.nextLine();
        if ("".equals(date))
            holiday.getAllHolidays();
        else
            System.out.println(holiday.getHoliday(date));
    }
}
