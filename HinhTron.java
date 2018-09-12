
public class HinhTron extends Hinh {

	double chuvi;
	double dientich;
	double pi = 3.14;

	@Override
	void chuvi(double canh1, double canh2s) {
		chuvi = (canh1 * 2) * pi;
		System.out.println("Chu vi: " + chuvi);

		dientich = (canh1 * canh1) * pi;
		System.out.println("Dien tich: " + dientich);
		
	}

	@Override
	void khoitaodulieu() {
		// TODO Auto-generated method stub
		
	}
}
