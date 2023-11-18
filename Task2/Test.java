package Task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Test {
	
	public static void test() {
		TapChi tc1 = new TapChi("Tc1", 10, new Date(15, 10, 2004),
				"ZuTc1", 50, "Faksittc1");
		TapChi tc2 = new TapChi("Tc2", 20, new Date(18, 12, 2005),
				"ZuTc2", 70, "Faksittc2");
		TapChi tc3 = new TapChi("Tc3", 30, new Date(19, 19, 2004),
				"ZuTc3", 60, "Faksit");
		
		ArrayList<ChuongSach> chuongSachs1 = new ArrayList<>();
		ChuongSach chuongSach1 = new ChuongSach("Chap1", 15);
		ChuongSach chuongSach2 = new ChuongSach("Chap2", 20);
		ChuongSach chuongSach3 = new ChuongSach("Chap3", 30);
		chuongSachs1.add(chuongSach1);
		chuongSachs1.add(chuongSach2);
		chuongSachs1.add(chuongSach3);
		
		
		ArrayList<ChuongSach> chuongSachs2 = new ArrayList<>();
		ChuongSach chuongSach01 = new ChuongSach("Chap01", 15);
		ChuongSach chuongSach02 = new ChuongSach("Chap02", 20);
		ChuongSach chuongSach03 = new ChuongSach("Chap03", 45);
		chuongSachs2.add(chuongSach01);
		chuongSachs2.add(chuongSach02);
		chuongSachs2.add(chuongSach03);

		
		
		SachThamKhao stk1 = new SachThamKhao("Stk1", 15, new Date(11, 2, 1999),
				"Loi1", 60, "KH", chuongSachs1);
		SachThamKhao stk2 = new SachThamKhao("Stk2", 10, new Date(25, 2, 1995),
				"Loi2", 65, "KT", chuongSachs2);
		
		System.out.print("Kiểm tra loại ấn phẩm: ");
		System.out.print(stk1.loaiAnPham());
		System.out.print(", " + tc1.loaiAnPham());
		System.out.println("\n");
		
		
		System.out.print("Kiểm tra ấn phẩm là tạp chí và xuất bản cách đây 10 năm: " );
		System.out.println(tc1.laTapChiVaXuatBanCach10Nam(2021)+ "\n");
		
		
		System.out.print("Kiểm tra ấn phẩm cùng loại và tác giả: ");
		System.out.println(tc1.cungLoaiVaCungTacGia(stk2) + "\n");
		
		

		
		
		ArrayList<AnPham> anPhams = new ArrayList<>();
		anPhams.add(tc1);
		anPhams.add(tc2);
		anPhams.add(tc3);
		anPhams.add(stk1);
		anPhams.add(stk2);
		
		ListAnPham myAnPhams = new ListAnPham(anPhams);
		System.out.print("Số tiền: ");
		System.out.println(myAnPhams.tongTien() + "\n");
		
		System.out.print("Sách tham khảo có số chương nhiều trang nhiều nhất: ");
		System.out.println(myAnPhams.findSTKSoChuongTrangNhieuNhat() + "\n");
		
		
		System.out.print("Xem trong danh sách có Tạp Chí có tên cho trước hay không: ");
		System.out.println(myAnPhams.tapChiCoTenChoTruoc("Faksit") + "\n");

		
		System.out.print("Lấy ra danh sách Tạp Chí xuất bản vào năm cho trước: ");
		System.out.println(myAnPhams.cacTapChiXuatBanVaoNam(2004)+ "\n");
		
		System.out.print("Sắp xếp tăng dần tiêu đề, giảm dần năm xuất bản: \n");
		myAnPhams.sortTheoTieuDeVaGiamDanTheoNXB();
		System.out.println(myAnPhams.toString() + "\n");
		
		System.out.println("Thống kê số lượng ấn phẩm theo năm xuất bản");
		Map<Integer, Integer> map = myAnPhams.thongKeSoLuongTheoNXB();
		System.out.println(map + "\n");
		
		

	}
	public static void main(String[] args) {
		test();
		


	}
}
