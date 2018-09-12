import java.util.Scanner;

public class HinhVuong extends Hinh {

	double chuvi;
	double dientich;
	
	public double dientich (double canh1, double canh2){
		return super.dientich(canh1, canh2);
	}
	

	@Override
	void chuvi(double canh1, double canh2){
		chuvi = this.getCanh1() * 4;
		System.out.println("Chu vi: " + chuvi);

		dientich = canh1 * canh1;
		System.out.println("Dien tich: " + dientich);
	}


	@Override
	void khoitaodulieu() {
		Scanner canh = new Scanner(System.in);
		System.out.print("Nhap canh: ");
		double canhhv = canh.nextInt();
		this.setCanh1(canhhv);
		// TODO Auto-generated method stub
		
	}
}
