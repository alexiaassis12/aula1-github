package testes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DataNotion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Informe o valor da retenção: ");
		double percent = sc.nextDouble();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date x1 = new Date();
		System.out.println("Ultima revisão: " + sdf.format(x1));
		Calendar cal = Calendar.getInstance();
		cal.setTime(x1);

		if (percent <= 50) {
			cal.add(Calendar.DATE, 1);
			x1 = cal.getTime();
			System.out.println("Próxima revisão: " + sdf.format(x1));
		} else if (percent > 50 && percent <= 70) {
			cal.add(Calendar.DATE, 7);
			x1 = cal.getTime();
			System.out.println("Próxima revisão: " + sdf.format(x1));
		} else if (percent > 70 && percent <= 90) {
			cal.add(Calendar.DATE, 14);
			x1 = cal.getTime();
			System.out.println("Próxima revisão: " + sdf.format(x1));
		}

		sc.close();

	}

}
