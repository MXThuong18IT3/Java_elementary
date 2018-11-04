package task_HCP;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class DayYear {
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Nhap ngay thang nam: ");
		Scanner kb = new Scanner(System.in);
		String dateInString = kb.nextLine();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
		Date today = formatter.parse(dateInString);
		Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));
		System.out.println("Ngay thang nam ke tiep: \n"+formatter.format(tomorrow));
	}

}
