
public class HinhChuNhat extends Hinh {

	double chuvi;
	double dientich;

	@Override
	void chuvi(double canh1, double canh2) {
		// TODO Auto-generated method stub
		chuvi = (canh1 + canh2) * 2;
		System.out.println("Chu vi: " + chuvi);

	//	dientich = canh1 * canh2;
	//	System.out.println("Dien tich: " + dientich);
	}

	public double dientich (double canh1, double canh2){
		return super.dientich(canh1, canh2);
	}
	
	@Override
	void khoitaodulieu() {
		// TODO Auto-generated method stub
		
	}
}
