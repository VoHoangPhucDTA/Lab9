package Task2;

public class TapChi extends AnPham{
	private String tenTapChi;

	public TapChi(String tieuDe, int soTrang, Date namXuatBan, String tacGia, double giaTien, String tenTapChi) {
		super(tieuDe, soTrang, namXuatBan, tacGia, giaTien);
		this.tenTapChi = tenTapChi;
	}

	@Override
	public String loaiAnPham() {
		return "TC";
	}

	@Override
	public boolean laTapChiVaXuatBanCach10Nam(int year) {
		return year - this.namXuatBan.getYear() >= 10;
	}
	
	public boolean cungLoaiVaCungTacGia(AnPham otherAnPham) {
		return super.cungLoaiVaCungTacGia(otherAnPham);
	}

	public String getTenTapChi() {
		return tenTapChi;
	}

	public void setTenTapChi(String tenTapChi) {
		this.tenTapChi = tenTapChi;
	}
	
	public boolean coCungTen(String name) {
		return this.tenTapChi.equals(name);
	}
	
	public boolean coCungNam(int year) {
		return this.namXuatBan.getYear() == year;
	}

	@Override
	public String toString() {
		return "TapChi" + super.toString() + " [tenTapChi=" + tenTapChi + "]\n";
	}
	
	
	
	
}
