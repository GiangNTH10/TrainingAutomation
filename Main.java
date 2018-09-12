import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner hinh = new Scanner(System.in); // tao doi tuong inp thuoc lop
												// Scanner
		System.out.print("Nhap hinh hoc ban muon : "); // Lenh in ra man hinh
		String hinhhoc = hinh.nextLine(); // nhap chuoi

		switch (hinhhoc) {
		case "vuong":
			Hinh vuong = new HinhVuong();
			vuong.khoitaodulieu();
			vuong.chuvi(1,1);
			break;
		case "tron":
			Scanner bankinh = new Scanner(System.in);
			System.out.print("Nhap ban kinh: ");
			double bk = bankinh.nextInt();
			Hinh tron = new HinhTron();
			tron.chuvi(bk,bk);
			break;
		case "chu nhat":
			Scanner chieudai = new Scanner(System.in);
			System.out.print("Nhap chieu dai: ");
			double cd = chieudai.nextInt();
			Scanner chieurong = new Scanner(System.in);
			System.out.print("Nhap chieu rong: ");
			double cr = chieurong.nextInt();
			Hinh chunhat = new HinhChuNhat();
			chunhat.setCanh1(cd);
			chunhat.setCanh2(cr);
			chunhat.chuvi(cd, cr);
			chunhat.display(chunhat.dientich(cd, cr));
			break;
		default:
			System.out.print("Khong support nhe!");
		}
	}
}
