package Task2;

import java.util.ArrayList;

public class SachThamKhao extends AnPham{
	private String linhVuc;
	private ArrayList<ChuongSach> chuongSachs;
	public SachThamKhao(String tieuDe, int soTrang, Date namXuatBan, String tacGia, double giaTien, String linhVuc,
			ArrayList<ChuongSach> chuongSachs) {
		super(tieuDe, soTrang, namXuatBan, tacGia, giaTien);
		this.linhVuc = linhVuc;
		this.chuongSachs = chuongSachs;
	}
	@Override
	public String loaiAnPham() {
		return "STK";
	}
	@Override
	public boolean laTapChiVaXuatBanCach10Nam(int year) {
		return false;
	}
	@Override
	public boolean cungLoaiVaCungTacGia(AnPham otherAnPham) {
		return super.cungLoaiVaCungTacGia(otherAnPham);
	}
	public ArrayList<ChuongSach> getChuongSachs() {
		return chuongSachs;
	}
	public void setChuongSachs(ArrayList<ChuongSach> chuongSachs) {
		this.chuongSachs = chuongSachs;
	}
	
	
	public int tongSoTrangCuaSach() {
		int res = 0;
		for (ChuongSach chuongSach : chuongSachs) {
			res += chuongSach.getSoTrang();
		}
		return res;
	}
	@Override
	public String toString() {
		return "Sach Tham Khao" + super.toString() +  "[linhVuc=" + linhVuc + ", chuongSachs=" + chuongSachs + "]\n";
	}
	
	public boolean soChuongTrangNhieuHon(SachThamKhao otherSTK) {
		return this.tongSoTrangCuaSach() > otherSTK.tongSoTrangCuaSach();
	}
	
	
	
	
}
