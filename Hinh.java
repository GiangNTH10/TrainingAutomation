package HinhHoc;
//test
public abstract class Hinh {
	private double canh1;
	private double canh2;

	public double getCanh1() {
		return canh1;
	}

	public void setCanh1(double canh) {
		this.canh1 = canh;
	}

	public double getCanh2() {
		return canh2;
	}

	public void setCanh2(double canh) {
		this.canh2 = canh;
	}

	public double chuvi() {
		double cv = 0;
		return cv;
	}

	public double dientich() {
		double cv = 0;
		return cv;
	}

	public void khoitaodulieu() {
	};

	public void display(double giatri) {
		System.out.println(" " + giatri);
	}

}
