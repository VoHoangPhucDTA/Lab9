package Task2;

public abstract class AnPham {
	protected String tieuDe;
	protected int soTrang;
	protected Date namXuatBan;
	protected String tacGia;
	protected double giaTien;
	public AnPham(String tieuDe, int soTrang, Date namXuatBan, String tacGia, double giaTien) {
		super();
		this.tieuDe = tieuDe;
		this.soTrang = soTrang;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
		this.giaTien = giaTien;
	}
	
	public abstract String loaiAnPham();
	public abstract boolean laTapChiVaXuatBanCach10Nam(int year);
	public boolean cungLoaiVaCungTacGia(AnPham otherAnPham) {
		if (checkCungLoai(otherAnPham) && checkCungLoai(otherAnPham)) return true;
		return false;
	}
	
	
	public boolean checkCungtacGia(AnPham otherAnPham) {
		return this.tacGia.equals(otherAnPham.tacGia);
	}
	
	public boolean checkCungLoai(AnPham otherAnPham) {
		return this.loaiAnPham().equals(otherAnPham.loaiAnPham());
	}

	@Override
	public String toString() {
		return " [tieuDe=" + tieuDe + ", soTrang=" + soTrang + ", namXuatBan=" + namXuatBan + ", tacGia=" + tacGia
				+ ", giaTien=" + giaTien + "]\n";
	}
	
	
	
	
	
	
}
